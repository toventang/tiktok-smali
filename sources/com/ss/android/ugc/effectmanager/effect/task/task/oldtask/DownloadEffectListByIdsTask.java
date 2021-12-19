package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadEffectListByIdsTask extends NormalTask {
    private Map<String, String> extraParams;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;
    private List<String> mEffectIds;

    static {
        Covode.recordClassIndex(95510);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        while (true) {
            int i2 = this.mCurCnt;
            this.mCurCnt = i2 - 1;
            if (i2 != 0) {
                try {
                    EffectListResponse effectListResponse = (EffectListResponse) AdapterExtKt.execute(this.mConfiguration.getEffectNetWorker(), buildRequest(this.mEffectIds), this.mConfiguration.getJsonConverter(), EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), effectListResponse.getData());
                        sendMessage(17, new EffectListTaskResult(effectListResponse.getData(), null));
                        return;
                    } else if (this.mCurCnt == 0) {
                        sendMessage(17, new EffectListTaskResult(new ArrayList(), new ExceptionResult(10014)));
                    }
                } catch (Exception e2) {
                    if (this.mCurCnt == 0 || (e2 instanceof StatusCodeException)) {
                        sendMessage(17, new EffectListTaskResult(new ArrayList(), new ExceptionResult(e2)));
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(17, new EffectListTaskResult(new ArrayList(), new ExceptionResult(e2)));
        e2.printStackTrace();
    }

    private EffectRequest buildRequest(List<String> list) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        addCommonParams.put("effect_ids", NetworkUtils.toJson(list));
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/v3/effect/list"));
    }

    public DownloadEffectListByIdsTask(EffectContext effectContext, List<String> list, Handler handler, String str) {
        this(effectContext, list, handler, str, null);
    }

    public DownloadEffectListByIdsTask(EffectContext effectContext, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mEffectIds = list;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
