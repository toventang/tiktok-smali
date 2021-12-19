package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.SearchEffectTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;
import java.util.Map;

public class SearchEffectTask extends NormalTask {
    private int count;
    private int cursor;
    private Map<String, String> extraParams;
    private String keyword;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private String panel;

    static {
        Covode.recordClassIndex(95537);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest(this.keyword, this.count, this.cursor);
        while (true) {
            int i2 = this.mCurCnt;
            this.mCurCnt = i2 - 1;
            if (i2 != 0) {
                try {
                    if (isCanceled()) {
                        sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(10001)));
                        return;
                    }
                    SearchEffectResponse searchEffectResponse = (SearchEffectResponse) AdapterExtKt.parse(this.mConfiguration.getEffectNetWorker(), buildRequest, this.mConfiguration.getEffectNetWorker().execute(buildRequest), this.mJsonConverter, SearchEffectResponse.class);
                    if (searchEffectResponse != null && searchEffectResponse.checkValue()) {
                        EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getEffects());
                        EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getCollection());
                        EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getBindEffects());
                        sendMessage(60, new SearchEffectTaskResult(searchEffectResponse, null));
                        return;
                    } else if (this.mCurCnt == 0) {
                        sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(10014)));
                    }
                } catch (Exception e2) {
                    if (this.mCurCnt == 0 || (e2 instanceof StatusCodeException)) {
                        sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(e2)));
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(e2)));
        e2.printStackTrace();
    }

    private EffectRequest buildRequest(String str, int i2, int i3) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("panel", this.panel);
        addCommonParams.put("keyword", str);
        addCommonParams.put("cursor", String.valueOf(i3));
        addCommonParams.put("count", String.valueOf(i2));
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/search"));
    }

    public SearchEffectTask(EffectContext effectContext, String str, String str2, int i2, int i3, Map<String, String> map, Handler handler, String str3) {
        super(handler, str3);
        this.keyword = str2;
        this.count = i2;
        this.cursor = i3;
        this.panel = str;
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
