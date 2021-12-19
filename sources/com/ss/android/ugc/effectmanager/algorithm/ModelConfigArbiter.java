package com.ss.android.ugc.effectmanager.algorithm;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.Multimap;
import com.ss.android.ugc.effectmanager.common.Supplier;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.AssetUtils;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelConfigArbiter {
    public final DownloadableModelConfig mConfig;
    public IModelCache mIModelCache;
    private Map<String, ServerConfig> mModelListMap = new ConcurrentHashMap();
    private Map<String, ModelInfo> mSingleModelMap = new ConcurrentHashMap();
    private Supplier<i<ServerConfig>> mTaskSupplier = new Supplier<i<ServerConfig>>() {
        /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95215);
        }

        @Override // com.ss.android.ugc.effectmanager.common.Supplier
        public i<ServerConfig> get(int i2) {
            return ModelConfigArbiter.this.requestServerConfig(i2);
        }
    };

    static {
        Covode.recordClassIndex(95214);
    }

    public void setIModelCache(IModelCache iModelCache) {
        this.mIModelCache = iModelCache;
    }

    public i<ServerConfig> requestServerConfig(final int i2) {
        return i.b(new Callable<ServerConfig>() {
            /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass3 */

            static {
                Covode.recordClassIndex(95217);
            }

            @Override // java.util.concurrent.Callable
            public ServerConfig call() {
                Stopwatch createStarted = Stopwatch.createStarted();
                ModelEventListener eventListener = ModelConfigArbiter.this.mConfig.getEventListener();
                try {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("sdk_version", ModelConfigArbiter.this.mConfig.getSdkVersion());
                    hashMap.put("device_type", ModelConfigArbiter.this.mConfig.getDeviceType());
                    hashMap.put("status", String.valueOf(ModelConfigArbiter.this.mConfig.getModelFileEnv().ordinal()));
                    new NormalTask(null, null) {
                        /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(95218);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.ITask
                        public void execute() {
                            EffectConfiguration effectConfiguration = ModelConfigArbiter.this.mConfig.getEffectConfiguration();
                            if (effectConfiguration != null) {
                                hashMap.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
                            }
                            String loadJson = AssetUtils.loadJson(ModelConfigArbiter.this.mConfig.getAssetManager(), "model/effect_local_config.json");
                            if (!TextUtils.isEmpty(loadJson)) {
                                try {
                                    String optString = new JSONObject(loadJson).optString("tag");
                                    EPLog.d("ModelConfigArbiter", "asset tag = ".concat(String.valueOf(optString)));
                                    if (!TextUtils.isEmpty(optString)) {
                                        hashMap.put("tag", optString);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                            if (i2 > 0) {
                                hashMap.put("busi_id", String.valueOf(i2));
                            }
                        }
                    }.execute();
                    DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) ModelConfigArbiter.this.mConfig.getJsonConverter().convertJsonToObj(ModelConfigArbiter.this.mConfig.getEffectNetWorker().execute(new EffectRequest("GET", NetworkUtils.buildRequestUrl(hashMap, ModelConfigArbiter.this.mConfig.getHosts().get(0).getItemName() + "/model/api/arithmetics"))), DownloadableModelResponse.class);
                    Multimap multimap = new Multimap();
                    if (downloadableModelResponse != null) {
                        int i2 = downloadableModelResponse.status_code;
                        if (i2 == 0) {
                            DownloadableModelResponse.Data data = downloadableModelResponse.getData();
                            if (data == null || data.getArithmetics() == null) {
                                throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                            }
                            Map<String, List<ModelInfo>> arithmetics = data.getArithmetics();
                            for (String str : arithmetics.keySet()) {
                                for (ModelInfo modelInfo : arithmetics.get(str)) {
                                    multimap.put(str, modelInfo);
                                }
                            }
                            if (eventListener != null) {
                                eventListener.onFetchModelList(true, null, createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                            }
                            return new ServerConfig(multimap);
                        }
                        throw new IllegalStateException("status code == " + i2 + " , indicates there is no model config from server, sdk version is " + ModelConfigArbiter.this.mConfig.getSdkVersion());
                    }
                    throw new IllegalStateException("response == null, indicates there may be an internal server error");
                } catch (IllegalStateException e2) {
                    if (eventListener != null) {
                        eventListener.onFetchModelList(false, e2.getMessage(), createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                    }
                    return null;
                }
            }
        }, this.mConfig.getExecutor());
    }

    public ModelConfigArbiter(DownloadableModelConfig downloadableModelConfig) {
        this.mConfig = downloadableModelConfig;
    }

    public LoadedModelList requireDecidedConfigNonBlockling(final int i2) {
        ServerConfig serverConfig = this.mModelListMap.get("biz_".concat(String.valueOf(i2)));
        if (serverConfig != null && serverConfig.getLoadedModelList() != null) {
            return serverConfig.getLoadedModelList();
        }
        i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass5 */

            static {
                Covode.recordClassIndex(95220);
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                ModelConfigArbiter.this.requireDecidedConfig(i2);
                return null;
            }
        }, i.f4824a);
        return null;
    }

    public synchronized LoadedModelList requireDecidedConfig(int i2) {
        MethodCollector.i(1715);
        String concat = "biz_".concat(String.valueOf(i2));
        ServerConfig serverConfig = this.mModelListMap.get(concat);
        if (serverConfig == null || serverConfig.getLoadedModelList() == null) {
            i<ServerConfig> iVar = this.mTaskSupplier.get(i2);
            try {
                iVar.f();
                if (!iVar.c()) {
                    final ServerConfig d2 = iVar.d();
                    if (this.mIModelCache != null) {
                        i.b(new Callable<Void>() {
                            /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(95219);
                            }

                            @Override // java.util.concurrent.Callable
                            public Void call() {
                                AlgorithmModelInfoMemoryCache.INSTANCE.buildCache(d2.getLoadedModelList(), ModelConfigArbiter.this.mIModelCache);
                                return null;
                            }
                        }, i.f4824a);
                    }
                    if (d2 == null) {
                        RuntimeException runtimeException = new RuntimeException("config == null");
                        MethodCollector.o(1715);
                        throw runtimeException;
                    } else if (d2.getLoadedModelList() != null) {
                        this.mModelListMap.put(concat, d2);
                        LoadedModelList loadedModelList = d2.getLoadedModelList();
                        MethodCollector.o(1715);
                        return loadedModelList;
                    } else {
                        RuntimeException runtimeException2 = new RuntimeException("loadedModelList == null");
                        MethodCollector.o(1715);
                        throw runtimeException2;
                    }
                } else {
                    RuntimeException runtimeException3 = new RuntimeException(iVar.e());
                    MethodCollector.o(1715);
                    throw runtimeException3;
                }
            } catch (Exception e2) {
                RuntimeException runtimeException4 = new RuntimeException(e2);
                MethodCollector.o(1715);
                throw runtimeException4;
            }
        } else {
            LoadedModelList loadedModelList2 = serverConfig.getLoadedModelList();
            MethodCollector.o(1715);
            return loadedModelList2;
        }
    }

    private i<ModelInfo> requestSingleModel(final int i2, final String str) {
        return i.b(new Callable<ModelInfo>() {
            /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass2 */

            static {
                Covode.recordClassIndex(95216);
            }

            @Override // java.util.concurrent.Callable
            public ModelInfo call() {
                SingleAlgorithmModelResponse runDirectly = new FetchModelInfoByNameTask(ModelConfigArbiter.this.mConfig, str, i2, null, null, null).runDirectly();
                if (runDirectly == null || runDirectly.getData() == null || runDirectly.getData().getFile_url() == null) {
                    return null;
                }
                return new ModelInfo(runDirectly.getData());
            }
        }, this.mConfig.getExecutor());
    }

    public ModelInfo getSingleModelInfoNonBlocking(final int i2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            i.b(new Callable<Object>() {
                /* class com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(95221);
                }

                @Override // java.util.concurrent.Callable
                public Object call() {
                    ModelConfigArbiter.this.getSingleModelInfo(i2, str);
                    return null;
                }
            }, i.f4824a);
        }
        return modelInfo;
    }

    public synchronized ModelInfo getSingleModelInfo(int i2, String str) {
        MethodCollector.i(173);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(173);
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            i<ModelInfo> requestSingleModel = requestSingleModel(i2, str);
            try {
                requestSingleModel.f();
                if (!requestSingleModel.c()) {
                    modelInfo = requestSingleModel.d();
                    this.mSingleModelMap.put(str, modelInfo);
                } else {
                    RuntimeException runtimeException = new RuntimeException(requestSingleModel.e());
                    MethodCollector.o(173);
                    throw runtimeException;
                }
            } catch (Exception e2) {
                RuntimeException runtimeException2 = new RuntimeException(e2);
                MethodCollector.o(173);
                throw runtimeException2;
            }
        }
        MethodCollector.o(173);
        return modelInfo;
    }
}
