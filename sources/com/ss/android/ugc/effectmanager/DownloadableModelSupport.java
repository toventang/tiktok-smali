package com.ss.android.ugc.effectmanager;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager;
import com.ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper;
import com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.knadapt.KNEPDecryptor;
import com.ss.android.ugc.effectmanager.knadapt.KNLibraryLoader;
import com.ss.android.ugc.effectmanager.knadapt.KNResourceFinder;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.ugc.effectplatform.algorithm.b;
import com.ss.ugc.effectplatform.algorithm.e;
import com.ss.ugc.effectplatform.c;
import com.ss.ugc.effectplatform.j.a;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.ab;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.util.h;
import com.ss.ugc.effectplatform.util.t;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class DownloadableModelSupport {
    private static DownloadableModelSupport INSTANCE;
    static DownloadableModelSupportLibraryLoader sLibraryLoader = new DownloadableModelSupportLibraryLoader.SystemLoader();
    private final DownloadableModelConfig config;
    private final AssetManagerWrapper mAssetManagerWrapper;
    private DownloadableModelSupportEffectFetcher mEffectFetcher;
    private boolean mEnableKotlinNative = UseKNPlatform.enableKNPlatform;
    private KNResourceFinder mKNResourceFinder;
    private final DownloadedModelStorage mModelCache;
    public ModelConfigArbiter mModelConfigArbiter;
    private final EffectNetWorkerWrapper mNetWorker;
    private DownloadableModelSupportResourceFinder mResourceFinder;
    private final String mSdkVersion;
    private final String mWorkspace;

    public interface EventListener extends ModelEventListener {
        static {
            Covode.recordClassIndex(95182);
        }
    }

    public static boolean isInitialized() {
        if (INSTANCE != null) {
            return true;
        }
        return false;
    }

    public final EffectFetcher getEffectFetcher() {
        return getEffectFetcherInternal();
    }

    /* access modifiers changed from: package-private */
    public final DownloadableModelSupportEffectFetcher getEffectFetcherInternal() {
        return INSTANCE.getOrCreateEffectFetcher();
    }

    public final DownloadableModelSupportResourceFinder getResourceFinder() {
        return getOrCreateResourceFinder();
    }

    static {
        Covode.recordClassIndex(95176);
    }

    public static DownloadableModelSupport getInstance() {
        DownloadableModelSupport downloadableModelSupport = INSTANCE;
        if (downloadableModelSupport != null) {
            return downloadableModelSupport;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    private void initializeOnStart() {
        ModelConfigArbiter modelConfigArbiter = new ModelConfigArbiter(this.config);
        this.mModelConfigArbiter = modelConfigArbiter;
        modelConfigArbiter.setIModelCache(this.mModelCache);
    }

    public static void loadSo() {
        if (UseKNPlatform.enableKNPlatform) {
            b.f153450b.a();
        } else {
            DownloadableModelLibraryLoader.INSTANCE.loadLibrary();
        }
    }

    private DownloadableModelSupportResourceFinder getOrCreateKNResourceFinder() {
        if (this.mKNResourceFinder == null) {
            this.mKNResourceFinder = new KNResourceFinder(e.a.a().a());
        }
        return this.mKNResourceFinder;
    }

    public final DownloadableModelSupportEffectFetcher getOrCreateEffectFetcher() {
        if (this.mEffectFetcher == null) {
            this.mEffectFetcher = new DownloadableModelSupportEffectFetcher(this.config, this.mModelCache, this.mNetWorker, this.mModelConfigArbiter);
        }
        return this.mEffectFetcher;
    }

    private DownloadableModelSupportResourceFinder getOrCreateResourceFinder() {
        if (this.mEnableKotlinNative && e.a.b()) {
            return getOrCreateKNResourceFinder();
        }
        if (this.mResourceFinder == null) {
            this.mResourceFinder = new DownloadableModelSupportResourceFinder(this.mModelConfigArbiter, this.mModelCache, this.config, this.mAssetManagerWrapper);
        }
        return this.mResourceFinder;
    }

    public final void requestModelInfoBackGround() {
        al alVar;
        if (!this.mEnableKotlinNative || !e.a.b()) {
            if (this.mModelConfigArbiter.requireDecidedConfigNonBlockling(0) == null) {
                i.b(new Callable<Void>() {
                    /* class com.ss.android.ugc.effectmanager.DownloadableModelSupport.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(95177);
                    }

                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        DownloadableModelSupport.this.mModelConfigArbiter.requireDecidedConfig(0);
                        return null;
                    }
                }, i.f4824a);
            }
        } else if (aa.f153718d.get(ab.a(0)) == null && (alVar = e.a.a().f153460b.z) != null) {
            alVar.a(new e.a.C4083a(t.a()));
        }
    }

    private boolean checkModelReadyLocal(String str) {
        boolean isResourceAvailable = getOrCreateResourceFinder().isResourceAvailable(str);
        try {
            if (!getEffectFetcherInternal().collectNeedDownloadModelsListNonBlocking(new String[]{str}).isEmpty()) {
                isResourceAvailable = false;
            }
            return isResourceAvailable;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        sLibraryLoader = (DownloadableModelSupportLibraryLoader) Preconditions.checkNotNull(downloadableModelSupportLibraryLoader);
        KNLibraryLoader kNLibraryLoader = new KNLibraryLoader(downloadableModelSupportLibraryLoader);
        l.c(kNLibraryLoader, "");
        e.f153457d = kNLibraryLoader;
        l.c(kNLibraryLoader, "");
        b.f153449a = kNLibraryLoader;
    }

    private DownloadableModelSupport(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.mAssetManagerWrapper = assetManagerWrapper;
        String workspace = downloadableModelConfig.getWorkspace();
        this.mWorkspace = workspace;
        this.mNetWorker = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        String sdkVersion = downloadableModelConfig.getSdkVersion();
        this.mSdkVersion = sdkVersion;
        this.config = downloadableModelConfig;
        this.mModelCache = DownloadedModelStorage.getInstance(workspace, sdkVersion, assetManagerWrapper);
    }

    public static void initialize(DownloadableModelConfig downloadableModelConfig) {
        Objects.requireNonNull(downloadableModelConfig);
        if (INSTANCE == null) {
            DownloadableModelSupport downloadableModelSupport = new DownloadableModelSupport(downloadableModelConfig);
            INSTANCE = downloadableModelSupport;
            downloadableModelSupport.initializeOnStart();
            if (UseKNPlatform.enableKNPlatform && downloadableModelConfig.getKNEffectConfig() != null && !e.a.b()) {
                e.a(downloadableModelConfig.getKNEffectConfig());
            }
            if (!UseKNPlatform.enableKNPlatform) {
                if (downloadableModelConfig.getKNEffectConfig() != null) {
                    h.f153964b.f156544a = downloadableModelConfig.getKNEffectConfig().s.f156544a;
                }
                c.f153561a = KNEPDecryptor.INSTANCE;
                return;
            }
            return;
        }
        throw new IllegalStateException("Duplicate initialization");
    }

    public final List<LocalModelInfo> getLocalModelInfo(List<String> list) {
        List<g> list2;
        if (this.mEnableKotlinNative && e.a.b()) {
            a aVar = e.a.a().f153459a;
            if (list == null || list.isEmpty()) {
                list2 = new ArrayList<>();
            } else {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] a2 = com.ss.ugc.effectplatform.algorithm.i.a((String[]) array);
                    com.ss.ugc.effectplatform.task.a.a aVar2 = aVar.a().f153444a;
                    list2 = new com.ss.ugc.effectplatform.task.a.c(aVar2.f153701d, aVar2.f153698a, aVar2.f153699b, aVar2.f153700c, null, 0, 112).a(a2);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            ArrayList arrayList = new ArrayList();
            for (g gVar : list2) {
                LocalModelInfo fromFile = LocalModelInfo.fromFile(gVar.f153664d);
                fromFile.setSize(gVar.c());
                fromFile.setName(gVar.a());
                fromFile.setVersion(gVar.b());
                arrayList.add(fromFile);
            }
            return arrayList;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList();
        } else {
            return getOrCreateEffectFetcher().collectLocalModelInfo(com.ss.ugc.effectplatform.algorithm.i.a((String[]) list.toArray(new String[list.size()])));
        }
    }

    public final void fetchResourcesNeededByRequirements(final List<String> list, final IFetchModelListener iFetchModelListener) {
        if (!this.mEnableKotlinNative || !e.a.b()) {
            i.b(new Callable<Void>() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelSupport.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(95179);
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(list, null);
                    return null;
                }
            }, i.f4824a).a((b.g) new b.g<Void, Void>() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelSupport.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(95178);
                }

                @Override // b.g
                public Void then(i<Void> iVar) {
                    if (iVar.c()) {
                        IFetchModelListener iFetchModelListener = iFetchModelListener;
                        if (iFetchModelListener == null) {
                            return null;
                        }
                        iFetchModelListener.onFailed(iVar.e());
                        return null;
                    }
                    IFetchModelListener iFetchModelListener2 = iFetchModelListener;
                    if (iFetchModelListener2 == null) {
                        return null;
                    }
                    iFetchModelListener2.onSuccess((String[]) list.toArray(new String[0]));
                    return null;
                }
            });
        } else {
            e.a.a().a(list, ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        }
    }

    public final void fetchResourcesNeededByRequirements(String[] strArr, IFetchModelListener iFetchModelListener) {
        if (!this.mEnableKotlinNative || !e.a.b()) {
            fetchResourcesNeededByRequirements(Arrays.asList(strArr), iFetchModelListener);
        } else {
            e.a.a().a(Arrays.asList(strArr), ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        }
    }

    public final boolean areRequirementsReady(EffectManager effectManager, Effect effect) {
        String str;
        if (this.mEnableKotlinNative && e.a.b()) {
            return e.a.a().a(effect);
        }
        if (EffectUtils.isRequirementsInvalid(effect)) {
            StringBuilder append = new StringBuilder("decrypt error effect_id: ").append(effect.getId()).append(", effect_name: ").append(effect.getName()).append(", requirements_sec: ");
            if (effect.getRequirements_sec() != null) {
                str = effect.getRequirements_sec().toString();
            } else {
                str = "";
            }
            EPLog.d("DownloadableModelSupport", append.append(str).toString());
            return false;
        }
        String[] resourceNameArrayOfEffect = AlgorithmUtils.getResourceNameArrayOfEffect(effect);
        if (resourceNameArrayOfEffect == null || resourceNameArrayOfEffect.length == 0) {
            EPLog.d("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return true;
        }
        this.mModelCache.checkDiskLruCache();
        for (String str2 : resourceNameArrayOfEffect) {
            if ((!AlgorithmModelInfoMemoryCache.hasBuiltCache() || !AlgorithmModelInfoMemoryCache.isModelReady(ModelNameProcessor.getNameOfModel(str2))) && !checkModelReadyLocal(str2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEffectReady(EffectManager effectManager, Effect effect) {
        boolean z;
        if (!this.mEnableKotlinNative || !e.a.b() || effectManager.getKNEffectPlatform() == null) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean isEffectDownloaded = effectManager.isEffectDownloaded(effect);
            if (isEffectDownloaded) {
                isEffectDownloaded = areRequirementsReady(effectManager, effect);
            }
            EPLog.d("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " result: " + isEffectDownloaded + " time cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return isEffectDownloaded;
        }
        e a2 = e.a.a();
        com.ss.ugc.effectplatform.b kNEffectPlatform = effectManager.getKNEffectPlatform();
        l.c(kNEffectPlatform, "");
        l.c(effect, "");
        long currentTimeMillis2 = System.currentTimeMillis();
        if (kNEffectPlatform.a(effect)) {
            z = a2.a(effect);
        } else {
            z = false;
        }
        d.a.e.b.a("isEffectReady", "effect: " + effect.getEffect_id() + ", name:" + effect.getName() + ", result: " + z + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis2) + " ms");
        return z;
    }

    public final void fetchResourcesWithModelNames(int i2, String[] strArr, FetchResourcesListener fetchResourcesListener) {
        if (!AlgorithmModelManager.isInitialized()) {
            AlgorithmModelManager.initialize(this.config);
        }
        AlgorithmModelManager.getInstance().fetchResourcesWithModelNames(i2, strArr, fetchResourcesListener);
    }

    public final void fetchResourcesByRequirementsAndModelNames(final String[] strArr, final Map<String, List<String>> map, final IFetchResourceListener iFetchResourceListener) {
        if (!this.mEnableKotlinNative || !e.a.b()) {
            i.b(new Callable<Void>() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelSupport.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(95181);
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(Arrays.asList(strArr), map);
                    return null;
                }
            }, i.f4824a).a((b.g) new b.g<Void, Void>() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelSupport.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(95180);
                }

                @Override // b.g
                public Void then(i<Void> iVar) {
                    if (iVar.c()) {
                        IFetchResourceListener iFetchResourceListener = iFetchResourceListener;
                        if (iFetchResourceListener == null) {
                            return null;
                        }
                        iFetchResourceListener.onFailure(iVar.e());
                        return null;
                    }
                    IFetchResourceListener iFetchResourceListener2 = iFetchResourceListener;
                    if (iFetchResourceListener2 == null) {
                        return null;
                    }
                    iFetchResourceListener2.onSuccess(DownloadableModelSupport.this.getResourceFinder().getEffectHandle());
                    return null;
                }
            });
            return;
        }
        e a2 = e.a.a();
        com.ss.ugc.effectplatform.h.e<Long> kNListener = IFetchResourceListenerKt.toKNListener(iFetchResourceListener);
        l.c(strArr, "");
        l.c(map, "");
        a aVar = a2.f153459a;
        l.c(strArr, "");
        l.c(map, "");
        al alVar = aVar.f153606d.z;
        if (alVar != null) {
            alVar.a(new a.b(aVar, strArr, map, kNListener, t.a()));
        }
    }
}
