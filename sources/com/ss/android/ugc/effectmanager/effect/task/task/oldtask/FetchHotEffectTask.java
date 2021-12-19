package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.HotEffectTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class FetchHotEffectTask extends NormalTask {
    private int count;
    private int cursor;
    private Map<String, String> extraParams;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter;
    private IMonitorService monitorService;
    private long startTime = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(95530);
    }

    private FetchHotEffectResponse getFromCache() {
        FetchHotEffectResponse fetchHotEffectResponse;
        Exception e2;
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generateHotStickerKey());
        if (queryToStream == null) {
            return null;
        }
        try {
            fetchHotEffectResponse = (FetchHotEffectResponse) this.mJsonConverter.convertJsonToObj(queryToStream, FetchHotEffectResponse.class);
            try {
                fetchHotEffectResponse.setFromCache(true);
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            fetchHotEffectResponse = null;
            EPLog.e("FetchPanelInfoCacheTask", Log.getStackTraceString(e2));
            System.currentTimeMillis();
            CloseUtil.close(queryToStream);
            return fetchHotEffectResponse;
        }
        System.currentTimeMillis();
        CloseUtil.close(queryToStream);
        return fetchHotEffectResponse;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest(this.count, this.cursor);
        this.startTime = System.currentTimeMillis();
        while (true) {
            int i2 = this.mCurCnt;
            this.mCurCnt = i2 - 1;
            if (i2 != 0) {
                try {
                    if (isCanceled()) {
                        sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(10001)));
                        return;
                    }
                    InputStream execute = this.mConfiguration.getEffectNetWorker().execute(buildRequest);
                    long currentTimeMillis = System.currentTimeMillis();
                    FetchHotEffectResponse fetchHotEffectResponse = (FetchHotEffectResponse) AdapterExtKt.parse(this.mConfiguration.getEffectNetWorker(), buildRequest, execute, this.mJsonConverter, FetchHotEffectResponse.class);
                    if (fetchHotEffectResponse != null) {
                        EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getCollection());
                        EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection());
                        EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection());
                        sendMessage(62, new HotEffectTaskResult(fetchHotEffectResponse, null));
                        long currentTimeMillis2 = System.currentTimeMillis();
                        IMonitorService iMonitorService = this.monitorService;
                        if (iMonitorService != null) {
                            iMonitorService.monitorStatusRate("hot_list_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("duration", Long.valueOf(currentTimeMillis2 - this.startTime)).addValuePair("network_time", Long.valueOf(currentTimeMillis - this.startTime)).addValuePair("effect_platform_type", (Integer) 0).build());
                        }
                        saveEffectList(fetchHotEffectResponse);
                        return;
                    } else if (this.mCurCnt == 0) {
                        tryGetFromCache(null);
                    }
                } catch (Exception e2) {
                    if (this.mCurCnt == 0 || (e2 instanceof StatusCodeException)) {
                        tryGetFromCache(e2);
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        tryGetFromCache(e2);
        e2.printStackTrace();
    }

    private void saveEffectList(FetchHotEffectResponse fetchHotEffectResponse) {
        String generateHotStickerKey = EffectCacheKeyGenerator.generateHotStickerKey();
        if (this.mFileCache != null) {
            try {
                this.mFileCache.save(generateHotStickerKey, this.mJsonConverter.convertObjToJson(fetchHotEffectResponse));
            } catch (Exception e2) {
                EPLog.e("save hot EffectList", Log.getStackTraceString(e2));
            }
        }
    }

    private void tryGetFromCache(Exception exc) {
        if (this.monitorService != null) {
            this.monitorService.monitorStatusRate("hot_list_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("error_code", (Integer) 10002).addValuePair("duration", Long.valueOf(System.currentTimeMillis() - this.startTime)).addValuePair("error_msg", Log.getStackTraceString(exc)).addValuePair("effect_platform_type", (Integer) 0).build());
        }
        FetchHotEffectResponse fromCache = getFromCache();
        if (fromCache == null || !fromCache.checkValue()) {
            sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(new Exception())));
        } else {
            sendMessage(62, new HotEffectTaskResult(fromCache, null));
        }
    }

    private EffectRequest buildRequest(int i2, int i3) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("cursor", String.valueOf(i3));
        addCommonParams.put("count", String.valueOf(i2));
        addCommonParams.put("panel", "default");
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/hoteffects"));
    }

    public FetchHotEffectTask(EffectContext effectContext, int i2, int i3, Map<String, String> map, Handler handler, String str) {
        super(handler, str);
        this.count = i2;
        this.cursor = i3;
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mFileCache = this.mConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
    }
}
