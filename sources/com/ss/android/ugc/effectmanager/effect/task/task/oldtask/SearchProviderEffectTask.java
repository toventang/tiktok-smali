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

public class SearchProviderEffectTask extends NormalTask {
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
    private String mSearchWord;
    private String mSelectedHost;

    static {
        Covode.recordClassIndex(95538);
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

    private EffectRequest buildEffectListRequest() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.mConfiguration.getAccessKey())) {
            hashMap.put("access_key", this.mConfiguration.getAccessKey());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppVersion())) {
            hashMap.put("app_version", this.mConfiguration.getAppVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getSdkVersion())) {
            hashMap.put("sdk_version", this.mConfiguration.getSdkVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getChannel())) {
            hashMap.put("channel", this.mConfiguration.getChannel());
        }
        if (!TextUtils.isEmpty(this.mProviderName)) {
            hashMap.put("library", this.mProviderName);
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getPlatform())) {
            hashMap.put("device_platform", this.mConfiguration.getPlatform());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceId())) {
            hashMap.put("device_id", this.mConfiguration.getDeviceId());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getRegion())) {
            hashMap.put("region", this.mConfiguration.getRegion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceType())) {
            hashMap.put("device_type", this.mConfiguration.getDeviceType());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppID())) {
            hashMap.put("aid", this.mConfiguration.getAppID());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppLanguage())) {
            hashMap.put("app_language", this.mConfiguration.getAppLanguage());
        }
        if (!TextUtils.isEmpty(this.mSearchWord)) {
            hashMap.put("word", this.mSearchWord);
        }
        hashMap.put("cursor", String.valueOf(this.cursor));
        hashMap.put("count", String.valueOf(this.count));
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        String buildRequestUrl = NetworkUtils.buildRequestUrl(hashMap, this.mSelectedHost + this.mConfiguration.getApiAdress() + "/stickers/search");
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

    private void fillEffectPath(ProviderEffectModel providerEffectModel) {
        if (!(providerEffectModel == null || providerEffectModel.getStickerList() == null)) {
            for (ProviderEffect providerEffect : providerEffectModel.getStickerList()) {
                providerEffect.setPath(this.mConfiguration.getEffectDir() + File.separator + providerEffect.getId() + ".gif");
            }
        }
    }

    public SearchProviderEffectTask(EffectContext effectContext, String str, String str2, String str3, int i2, int i3, Handler handler) {
        super(handler, str);
        this.mProviderName = str3;
        this.cursor = i2;
        this.count = i3;
        this.mSearchWord = str2;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
