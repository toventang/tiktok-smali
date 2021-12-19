package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchResourceListTaskResult;
import java.util.HashMap;
import java.util.Map;

public class FetchResourceListTask extends NormalTask {
    private Map<String, String> extraParams;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;

    static {
        Covode.recordClassIndex(95534);
    }

    private EffectRequest buildRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/moji/resource"));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        while (true) {
            int i2 = this.mCurCnt;
            this.mCurCnt = i2 - 1;
            if (i2 != 0) {
                try {
                    ResourceListResponse resourceListResponse = (ResourceListResponse) this.mConfiguration.getEffectNetWorker().execute(buildRequest(), this.mConfiguration.getJsonConverter(), ResourceListResponse.class);
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        sendMessage(24, new FetchResourceListTaskResult(resourceListResponse.getData()));
                        return;
                    }
                } catch (Exception e2) {
                    if (this.mCurCnt == 0 || (e2 instanceof StatusCodeException)) {
                        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e2)));
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e2)));
        e2.printStackTrace();
    }

    public FetchResourceListTask(EffectContext effectContext, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
