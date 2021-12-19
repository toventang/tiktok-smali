package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.ProviderEffectTaskResult;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

public class FetchProviderEffectTask extends NormalTask {
    private int count;
    private int cursor;
    private EffectConfiguration mConfiguration;
    private int mCurCnt = this.mConfiguration.getRetryCount();
    private EffectContext mEffectContext;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private String mProviderName;
    private String mRemoteIp;
    private String mRequestedUrl;
    private String mSelectedHost;

    static {
        Covode.recordClassIndex(95533);
    }

    private EffectRequest buildEffectListRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.mProviderName)) {
            addCommonParams.put("library", this.mProviderName);
        }
        addCommonParams.put("cursor", String.valueOf(this.cursor));
        addCommonParams.put("count", String.valueOf(this.count));
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        String buildRequestUrl = NetworkUtils.buildRequestUrl(addCommonParams, this.mSelectedHost + this.mConfiguration.getApiAdress() + "/stickers/recommend");
        this.mRequestedUrl = buildRequestUrl;
        try {
            this.mRemoteIp = InetAddress.getByName(new URL(buildRequestUrl).getHost()).getHostAddress();
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
        }
        return new EffectRequest("GET", buildRequestUrl);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildEffectListRequest = buildEffectListRequest();
        while (true) {
            int i2 = this.mCurCnt;
            this.mCurCnt = i2 - 1;
            if (i2 != 0) {
                try {
                    if (isCanceled()) {
                        ExceptionResult exceptionResult = new ExceptionResult(10001);
                        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
                        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), exceptionResult));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.mConfiguration.getEffectNetWorker().execute(buildEffectListRequest, this.mJsonConverter, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel data = providerEffectListResponse.getData();
                        fillEffectPath(data);
                        saveEffectList(data);
                        sendMessage(18, new ProviderEffectTaskResult(data, null));
                        return;
                    } else if (this.mCurCnt == 0) {
                        ExceptionResult exceptionResult2 = new ExceptionResult(10002);
                        exceptionResult2.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
                        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), exceptionResult2));
                        return;
                    }
                } catch (Exception e2) {
                    if (this.mCurCnt == 0 || (e2 instanceof StatusCodeException)) {
                        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), new ExceptionResult(e2)));
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), new ExceptionResult(e2)));
    }

    private void saveEffectList(ProviderEffectModel providerEffectModel) {
        try {
            this.mFileCache.save(EffectCacheKeyGenerator.generatePanelKey(this.mConfiguration.getChannel(), this.mProviderName), this.mJsonConverter.convertObjToJson(providerEffectModel));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void fillEffectPath(ProviderEffectModel providerEffectModel) {
        if (!(providerEffectModel == null || providerEffectModel.getStickerList() == null)) {
            for (ProviderEffect providerEffect : providerEffectModel.getStickerList()) {
                providerEffect.setPath(this.mConfiguration.getEffectDir() + File.separator + providerEffect.getId() + ".gif");
            }
        }
    }

    public FetchProviderEffectTask(EffectContext effectContext, String str, String str2, int i2, int i3, Handler handler) {
        super(handler, str);
        this.cursor = i2;
        this.count = i3;
        this.mProviderName = str2;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
