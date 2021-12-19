package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectCheckUpdateResult;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CheckUpdateTask extends NormalTask {
    private String mCategory;
    private int mCheckType;
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private Map<String, String> mExtraParams;
    private String mPanel;
    private String mVersion;

    static {
        Covode.recordClassIndex(95509);
    }

    private boolean checkedChannelCache() {
        String generateCategoryVersionKey;
        int i2 = this.mCheckType;
        if (i2 == 1) {
            generateCategoryVersionKey = EffectCacheKeyGenerator.generateCategoryVersionKey(this.mPanel, this.mCategory);
        } else if (i2 != 2) {
            generateCategoryVersionKey = "effect_version" + this.mPanel;
        } else {
            generateCategoryVersionKey = EffectCacheKeyGenerator.generatePanelInfoVersionKey(this.mPanel);
        }
        InputStream queryToStream = this.mConfiguration.getCache().queryToStream(generateCategoryVersionKey);
        if (queryToStream == null) {
            return false;
        }
        CheckUpdateVersionModel checkUpdateVersionModel = null;
        try {
            checkUpdateVersionModel = (CheckUpdateVersionModel) this.mConfiguration.getJsonConverter().convertJsonToObj(queryToStream, CheckUpdateVersionModel.class);
        } catch (Exception e2) {
            EPLog.e("CheckUpdateTask", Log.getStackTraceString(e2));
        }
        CloseUtil.close(queryToStream);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.mVersion = checkUpdateVersionModel.getVersion();
        return true;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        if (checkedChannelCache()) {
            EffectRequest buildRequest = buildRequest();
            if (isCanceled()) {
                sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(10001)));
            }
            try {
                EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) this.mConfiguration.getEffectNetWorker().execute(buildRequest, this.mConfiguration.getJsonConverter(), EffectCheckUpdateResponse.class);
                if (effectCheckUpdateResponse != null) {
                    sendMessage(13, new EffectCheckUpdateResult(effectCheckUpdateResponse.isUpdated(), null));
                } else {
                    sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(10002)));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(e2)));
            }
        } else {
            sendMessage(13, new EffectCheckUpdateResult(true, null));
        }
    }

    private EffectRequest buildRequest() {
        SharedPreferences a2 = d.a(this.mEffectContext.getContext(), "version", 0);
        boolean z = !a2.getString("app_version", "").equals(this.mConfiguration.getAppVersion());
        if (z) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("app_version", this.mConfiguration.getAppVersion());
            edit.commit();
        }
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("panel", this.mPanel);
        String str = "/panel/check";
        if (this.mCheckType == 1) {
            addCommonParams.put("category", this.mCategory);
            str = "/category/check";
        }
        if (z) {
            addCommonParams.put("version", "");
        } else {
            addCommonParams.put("version", this.mVersion);
        }
        Map<String, String> map = this.mExtraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        String testStatus = this.mConfiguration.getTestStatus();
        if (!TextUtils.isEmpty(testStatus)) {
            addCommonParams.put("test_status", testStatus);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mEffectContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + str));
    }

    public CheckUpdateTask(EffectContext effectContext, String str, Handler handler, String str2, String str3, int i2, Map<String, String> map) {
        super(handler, str);
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mPanel = str2;
        this.mCategory = str3;
        this.mCheckType = i2;
        this.mExtraParams = map;
    }
}
