package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class FetchCategoryEffectTask extends NormalTask {
    private String category;
    private int count;
    private int cursor;
    private EffectConfiguration mConfiguration;
    private int mCurCnt = this.mConfiguration.getRetryCount();
    private EffectContext mEffectContext;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private String mRemoteIp;
    private String mRequestedUrl;
    private String mSelectedHost;
    private IMonitorService monitorService = this.mConfiguration.getMonitorService();
    private String panel;
    private int requestStrategy = this.mConfiguration.getRequestStrategy();
    private long size;
    private int sortingPosition;
    private String version;

    static {
        Covode.recordClassIndex(95521);
    }

    private EffectRequest buildEffectListRequest() {
        String str;
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.panel)) {
            addCommonParams.put("panel", this.panel);
        }
        addCommonParams.put("category", this.category);
        addCommonParams.put("cursor", String.valueOf(this.cursor));
        addCommonParams.put("count", String.valueOf(this.count));
        addCommonParams.put("sorting_position", String.valueOf(this.sortingPosition));
        addCommonParams.put("version", String.valueOf(this.version));
        String testStatus = this.mConfiguration.getTestStatus();
        if (!TextUtils.isEmpty(testStatus)) {
            addCommonParams.put("test_status", testStatus);
        }
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        StringBuilder append = new StringBuilder().append(this.mSelectedHost).append(this.mConfiguration.getApiAdress());
        if (this.requestStrategy == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        String buildRequestUrl = NetworkUtils.buildRequestUrl(addCommonParams, append.append(str).toString());
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

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0188, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x019c, code lost:
        com.ss.android.ugc.effectmanager.common.utils.CloseUtil.close(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x018f A[Catch:{ all -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ad A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0193->B:33:0x0193 ?: BREAK  , SYNTHETIC] */
    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute() {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectTask.execute():void");
    }

    private void saveEffectList(CategoryEffectListResponse categoryEffectListResponse) {
        String generateCategoryEffectKey = EffectCacheKeyGenerator.generateCategoryEffectKey(this.panel, this.category, this.count, this.cursor, this.sortingPosition);
        try {
            this.size = this.mFileCache.save(generateCategoryEffectKey, this.mJsonConverter.convertObjToJson(categoryEffectListResponse)) / ((long) EffectConstants.KB);
        } catch (Exception e2) {
            EPLog.e("FetchCategoryEffectTask", Log.getStackTraceString(e2));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", categoryEffectListResponse.getData().getCategoryEffects().getVersion());
            jSONObject.put("cursor", categoryEffectListResponse.getData().getCategoryEffects().getCursor());
            jSONObject.put("sorting_position", categoryEffectListResponse.getData().getCategoryEffects().getSortingPosition());
            this.mFileCache.save(EffectCacheKeyGenerator.generateCategoryVersionKey(this.panel, this.category), jSONObject.toString());
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void onFail(ExceptionResult exceptionResult) {
        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
        sendMessage(21, new FetchCategoryEffectTaskResult(null, exceptionResult));
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("category_list_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("category", this.category).addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode())).addValuePair("error_msg", exceptionResult.getMsg()).addValuePair("download_url", this.mRequestedUrl).addValuePair("host_ip", this.mRemoteIp).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    public FetchCategoryEffectTask(EffectContext effectContext, String str, String str2, String str3, int i2, int i3, int i4, String str4, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.category = str3;
        this.count = i2;
        this.cursor = i3;
        this.sortingPosition = i4;
        this.version = str4;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
