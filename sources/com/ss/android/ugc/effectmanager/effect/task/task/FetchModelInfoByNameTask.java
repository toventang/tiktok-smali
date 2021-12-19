package com.ss.android.ugc.effectmanager.effect.task.task;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import h.a.ag;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.Map;

public final class FetchModelInfoByNameTask extends NormalTask implements WeakHandler.IHandler {
    private final String bigVersion;
    private final int businessId;
    private final DownloadableModelConfig config;
    private final String modelName;
    private final String taskFlag;
    private final WeakHandler weakHandler;

    static {
        Covode.recordClassIndex(95507);
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public final void execute() {
        runDirectly();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        h.e.c.a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse runDirectly() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask.runDirectly():com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse");
    }

    private final EffectRequest buildEffectRequest() {
        Map b2 = ag.b(v.a("sdk_version", this.config.getSdkVersion()), v.a("device_type", this.config.getDeviceType()), v.a("device_platform", "android"), v.a("status", String.valueOf(this.config.getModelFileEnv().ordinal())), v.a(StringSet.name, this.modelName));
        int i2 = this.businessId;
        if (i2 > 0) {
            b2.put("busi_id", String.valueOf(i2));
        }
        EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
        if (effectConfiguration != null) {
            b2.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
        }
        String str = this.bigVersion;
        if (str != null && (true ^ p.a((CharSequence) str))) {
            b2.put("big_version", str);
        }
        Host host = this.config.getHosts().get(0);
        l.a((Object) host, "");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(b2, host.getItemName() + "/model/api/model"));
    }

    private final void onFail(ExceptionResult exceptionResult) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(null, exceptionResult));
    }

    private final void onSuccess(SingleAlgorithmModelResponse singleAlgorithmModelResponse) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(singleAlgorithmModelResponse, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i2, String str2, String str3, WeakHandler weakHandler2) {
        super(weakHandler2, str3);
        l.c(downloadableModelConfig, "");
        l.c(str, "");
        this.config = downloadableModelConfig;
        this.modelName = str;
        this.businessId = i2;
        this.bigVersion = str2;
        this.taskFlag = str3;
        this.weakHandler = weakHandler2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i2, String str2, String str3, WeakHandler weakHandler2, int i3, g gVar) {
        this(downloadableModelConfig, str, i2, (i3 & 8) != 0 ? null : str2, str3, weakHandler2);
    }
}
