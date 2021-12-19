package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.ugc.effectplatform.j.a;
import com.ss.ugc.effectplatform.task.a.c;
import com.ss.ugc.effectplatform.task.al;
import h.f.b.ab;
import h.f.b.g;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;

public final class AlgorithmModelManager {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(ab.a(AlgorithmModelManager.class), "knAlgorithmRepository", "getKnAlgorithmRepository()Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;")};
    public static final Companion Companion = new Companion(null);
    public static AlgorithmModelManager INSTANCE;
    private final AssetManagerWrapper assetManagerWrapper;
    private final EffectNetWorkerWrapper effectNetWorkerWrapper;
    private final h knAlgorithmRepository$delegate;
    private final IModelCache modelCache;
    private final ModelConfigArbiter modelConfigArbiter;
    public final ModelFetcher modelFetcher;
    private final ModelFinder modelFinder;

    public static final synchronized AlgorithmModelManager getInstance() {
        AlgorithmModelManager instance;
        synchronized (AlgorithmModelManager.class) {
            MethodCollector.i(815);
            instance = Companion.getInstance();
            MethodCollector.o(815);
        }
        return instance;
    }

    private final a getKnAlgorithmRepository() {
        return (a) this.knAlgorithmRepository$delegate.getValue();
    }

    public static final void initialize(DownloadableModelConfig downloadableModelConfig) {
        Companion.initialize(downloadableModelConfig);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95204);
        }

        private Companion() {
        }

        public final boolean isInitialized() {
            if (AlgorithmModelManager.INSTANCE != null) {
                return true;
            }
            return false;
        }

        public final synchronized AlgorithmModelManager getInstance() {
            AlgorithmModelManager algorithmModelManager;
            MethodCollector.i(847);
            if (AlgorithmModelManager.INSTANCE != null) {
                algorithmModelManager = AlgorithmModelManager.INSTANCE;
                if (algorithmModelManager == null) {
                    l.a();
                }
                MethodCollector.o(847);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("AlgorithmModelManager has not initialized".toString());
                MethodCollector.o(847);
                throw illegalStateException;
            }
            return algorithmModelManager;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void initialize(DownloadableModelConfig downloadableModelConfig) {
            l.c(downloadableModelConfig, "");
            if (AlgorithmModelManager.INSTANCE == null) {
                AlgorithmModelManager.INSTANCE = new AlgorithmModelManager(downloadableModelConfig, null);
                return;
            }
            throw new IllegalStateException("Duplicate AlgorithmModelManager initialization");
        }
    }

    static {
        Covode.recordClassIndex(95203);
    }

    public final String findResourceUri(String str) {
        l.c(str, "");
        return findResourceUri(0, str);
    }

    private AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper2 = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.assetManagerWrapper = assetManagerWrapper2;
        EffectNetWorkerWrapper effectNetWorkerWrapper2 = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        this.effectNetWorkerWrapper = effectNetWorkerWrapper2;
        ModelConfigArbiter modelConfigArbiter2 = new ModelConfigArbiter(downloadableModelConfig);
        this.modelConfigArbiter = modelConfigArbiter2;
        DownloadedModelStorage instance = DownloadedModelStorage.getInstance(downloadableModelConfig.getWorkspace(), downloadableModelConfig.getSdkVersion(), assetManagerWrapper2);
        l.a((Object) instance, "");
        this.modelCache = instance;
        this.modelFetcher = new ModelFetcher(downloadableModelConfig, modelConfigArbiter2, instance, effectNetWorkerWrapper2);
        this.modelFinder = new ModelFinder(downloadableModelConfig, modelConfigArbiter2, instance, assetManagerWrapper2);
        this.knAlgorithmRepository$delegate = h.i.a((h.f.a.a) new AlgorithmModelManager$knAlgorithmRepository$2(downloadableModelConfig));
        modelConfigArbiter2.setIModelCache(instance);
    }

    public /* synthetic */ AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig, g gVar) {
        this(downloadableModelConfig);
    }

    public final void fetchResourcesWithModelNames(String[] strArr, FetchResourcesListener fetchResourcesListener) {
        l.c(strArr, "");
        fetchResourcesWithModelNames(0, strArr, fetchResourcesListener);
    }

    public final String findResourceUri(int i2, String str) {
        l.c(str, "");
        if (UseKNPlatform.enableKNPlatform) {
            return getKnAlgorithmRepository().a(i2, str);
        }
        return this.modelFinder.findResourceUri(i2, null, str);
    }

    public final void fetchResourcesWithModelNames(int i2, String[] strArr, FetchResourcesListener fetchResourcesListener) {
        l.c(strArr, "");
        if (UseKNPlatform.enableKNPlatform) {
            a knAlgorithmRepository = getKnAlgorithmRepository();
            AlgorithmModelManager$fetchResourcesWithModelNames$1 algorithmModelManager$fetchResourcesWithModelNames$1 = new AlgorithmModelManager$fetchResourcesWithModelNames$1(fetchResourcesListener);
            l.c(strArr, "");
            c cVar = new c(knAlgorithmRepository.f153606d, knAlgorithmRepository.f153603a, knAlgorithmRepository.f153605c, knAlgorithmRepository.f153604b, strArr, i2, 64);
            al alVar = knAlgorithmRepository.f153606d.z;
            if (alVar != null) {
                alVar.a(new a.d(cVar, algorithmModelManager$fetchResourcesWithModelNames$1, strArr));
                return;
            }
            return;
        }
        b.i.b(new AlgorithmModelManager$fetchResourcesWithModelNames$2(this, i2, strArr), b.i.f4824a).a((b.g) new AlgorithmModelManager$fetchResourcesWithModelNames$3(fetchResourcesListener));
    }
}
