package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchFavoriteListTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;

public class FetchFavoriteListTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private int mCurCnt;
    private EffectContext mEffectContext;
    private IJsonConverter mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
    private String mPanel;

    static {
        Covode.recordClassIndex(95529);
    }

    private EffectRequest buildRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.mPanel)) {
            addCommonParams.put("panel", this.mPanel);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mEffectContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/v3/effect/my"));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest();
        for (int i2 = 0; i2 < this.mCurCnt; i2++) {
            try {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) AdapterExtKt.execute(this.mConfiguration.getEffectNetWorker(), buildRequest, this.mJsonConverter, FetchFavoriteListResponse.class);
                if (fetchFavoriteListResponse == null || !fetchFavoriteListResponse.checkValue()) {
                    throw new NetException(10002, "Download error");
                }
                EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getEffects());
                EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getCollectEffects());
                EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getBindEffects());
                sendMessage(41, new FetchFavoriteListTaskResult(fetchFavoriteListResponse));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (i2 == this.mCurCnt - 1 || (e2 instanceof StatusCodeException)) {
                    sendMessage(41, new FetchFavoriteListTaskResult(new ExceptionResult(e2)));
                }
            }
        }
    }

    public FetchFavoriteListTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mPanel = str;
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }
}
