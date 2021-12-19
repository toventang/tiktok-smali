package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher;
import h.a.n;
import h.f.b.l;
import java.util.List;

public class ModelEffectFetcher implements EffectFetcher {
    public final DownloadableModelConfig config;
    private final IModelCache modelCache;
    private final ModelConfigArbiter modelConfigArbiter;
    private final ModelFetcher modelFetcher;
    private final EffectNetWorkerWrapper netWorker;

    static {
        Covode.recordClassIndex(95223);
    }

    /* access modifiers changed from: protected */
    public String[] peekResourceNameArray(EffectFetcherArguments effectFetcherArguments) {
        return new String[0];
    }

    public final IModelCache getModelCache() {
        return this.modelCache;
    }

    public final ModelConfigArbiter getModelConfigArbiter() {
        return this.modelConfigArbiter;
    }

    public final ModelFetcher getModelFetcher() {
        return this.modelFetcher;
    }

    public final class FetchModelAndEffectTask extends SyncTask<EffectTaskResult> {
        private final EffectFetcherArguments arguments;
        private final ModelFetcher modelFetcher;
        final /* synthetic */ ModelEffectFetcher this$0;
        private final SyncTask<EffectTaskResult> wrappedTask;

        static {
            Covode.recordClassIndex(95224);
        }

        private final SyncTaskListener<EffectTaskResult> getListener() {
            return new ModelEffectFetcher$FetchModelAndEffectTask$getListener$1(this);
        }

        @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
        public final void execute() {
            Effect effect;
            String str;
            String str2;
            List<String> requirements_sec;
            try {
                onStart(this);
                EffectFetcherArguments effectFetcherArguments = this.arguments;
                List list = null;
                if (effectFetcherArguments != null) {
                    effect = effectFetcherArguments.getEffect();
                } else {
                    effect = null;
                }
                if (EffectUtils.isRequirementsInvalid(effect)) {
                    StringBuilder sb = new StringBuilder("Effect Requirements Decrypt Failed, effect: ");
                    if (effect != null) {
                        str = effect.getEffect_id();
                    } else {
                        str = null;
                    }
                    StringBuilder append = sb.append(str).append(", name: ");
                    if (effect != null) {
                        str2 = effect.getName();
                    } else {
                        str2 = null;
                    }
                    StringBuilder append2 = append.append(str2).append(", toDownloadRequirements: ");
                    if (!(effect == null || (requirements_sec = effect.getRequirements_sec()) == null)) {
                        list = n.k(requirements_sec);
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(append2.append(list).toString());
                    onFailed(this, new ExceptionResult(illegalArgumentException));
                    mobEffectDownloadFail(effect, illegalArgumentException);
                    return;
                }
                try {
                    this.modelFetcher.fetchModels(this.this$0.peekResourceNameArray(this.arguments));
                    SyncTask<EffectTaskResult> syncTask = this.wrappedTask;
                    if (syncTask != null) {
                        syncTask.execute();
                    }
                } catch (Exception e2) {
                    mobEffectDownloadFail(effect, e2);
                    throw e2;
                }
            } catch (Exception e3) {
                onFailed(this, new ExceptionResult(e3));
                onFinally(this);
            } catch (Throwable th) {
                onFinally(this);
                throw th;
            }
        }

        private final void mobEffectDownloadFail(Effect effect, Exception exc) {
            String effectId;
            IMonitorService monitorService = this.this$0.config.getMonitorService();
            if (monitorService != null) {
                EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                String appId = this.this$0.config.getAppId();
                String str = "";
                if (appId == null) {
                    appId = str;
                }
                EventJsonBuilder addValuePair = newBuilder.addValuePair("app_id", appId);
                String accessKey = this.this$0.config.getAccessKey();
                if (accessKey == null) {
                    accessKey = str;
                }
                EventJsonBuilder addValuePair2 = addValuePair.addValuePair("access_key", accessKey);
                if (!(effect == null || (effectId = effect.getEffectId()) == null)) {
                    str = effectId;
                }
                monitorService.monitorStatusRate("effect_download_success_rate", 1, addValuePair2.addValuePair("effect_id", str).addValuePair("error_code", (Integer) 10018).addValuePair("error_msg", "download effect failed because of model fetcher failed! detail: " + exc.getMessage()).addValuePair("effect_platform_type", (Integer) 0).build());
            }
        }

        public FetchModelAndEffectTask(ModelEffectFetcher modelEffectFetcher, SyncTask<EffectTaskResult> syncTask, ModelFetcher modelFetcher2, EffectFetcherArguments effectFetcherArguments) {
            l.c(modelFetcher2, "");
            this.this$0 = modelEffectFetcher;
            this.wrappedTask = syncTask;
            this.modelFetcher = modelFetcher2;
            this.arguments = effectFetcherArguments;
            if (syncTask != null) {
                syncTask.setListener(getListener());
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
    public SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments) {
        return new FetchModelAndEffectTask(this, new DefaultEffectFetcher(this.netWorker, this.config.getMonitorService(), this.config.getAppId(), this.config.getAccessKey()).fetchEffect(effectFetcherArguments), this.modelFetcher, effectFetcherArguments);
    }

    public ModelEffectFetcher(DownloadableModelConfig downloadableModelConfig, ModelConfigArbiter modelConfigArbiter2, IModelCache iModelCache, EffectNetWorkerWrapper effectNetWorkerWrapper) {
        l.c(downloadableModelConfig, "");
        l.c(modelConfigArbiter2, "");
        l.c(effectNetWorkerWrapper, "");
        this.config = downloadableModelConfig;
        this.modelConfigArbiter = modelConfigArbiter2;
        this.modelCache = iModelCache;
        this.netWorker = effectNetWorkerWrapper;
        this.modelFetcher = new ModelFetcher(downloadableModelConfig, modelConfigArbiter2, iModelCache, effectNetWorkerWrapper);
    }
}
