package com.ss.android.ugc.effectmanager.algorithm;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ListenerManger;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.TaskManager;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.download.IModelDownloader;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import h.w;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public final class ModelFetcher implements WeakHandler.IHandler {
    public static final Companion Companion = new Companion(null);
    private final DownloadableModelConfig config;
    private final ModelEventListener eventListener;
    private final WeakHandler handler = new WeakHandler(this);
    private final IModelCache modelCache;
    private final ModelConfigArbiter modelConfigArbiter;
    private IModelDownloader modelDownloader;
    private final IMonitorService monitorService;
    private final EffectNetWorkerWrapper netWorker;

    static {
        Covode.recordClassIndex(95226);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95227);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final ModelEventListener getEventListener() {
        return this.eventListener;
    }

    public final WeakHandler getHandler() {
        return this.handler;
    }

    public final IModelDownloader getModelDownloader() {
        return this.modelDownloader;
    }

    public final IMonitorService getMonitorService() {
        return this.monitorService;
    }

    private final TaskManager createEffectTaskManager() {
        TaskManager.TaskManagerConfig executor = new TaskManager.TaskManagerConfig().setExecutor(Executors.newCachedThreadPool(), false);
        TaskManager taskManager = new TaskManager();
        taskManager.init(executor);
        return taskManager;
    }

    public final void setModelDownloader(IModelDownloader iModelDownloader) {
        this.modelDownloader = iModelDownloader;
    }

    public final void fetchModels(String[] strArr) {
        if (strArr != null) {
            fetchModels(0, strArr);
        }
    }

    private final String normalizeResourceName(String str) {
        String nameOfModel = ModelNameProcessor.getNameOfModel(str);
        l.a((Object) nameOfModel, "");
        return nameOfModel;
    }

    private final boolean canFallbackToBuiltInResources(String[] strArr) {
        for (String str : strArr) {
            IModelCache iModelCache = this.modelCache;
            if (iModelCache == null || !iModelCache.isBuiltInResource(str)) {
                return false;
            }
        }
        return true;
    }

    public final Collection<ModelInfo> collectNeedDownloadModelsListNonBlocking(String[] strArr) {
        l.c(strArr, "");
        LoadedModelList requireDecidedConfigNonBlockling = this.modelConfigArbiter.requireDecidedConfigNonBlockling(0);
        if (requireDecidedConfigNonBlockling == null) {
            return new ArrayList();
        }
        return collectNeedDownloadModelsListInternal(0, strArr, requireDecidedConfigNonBlockling, null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        e kNPlatformListener;
        if (message != null && message.what == 70 && (message.obj instanceof FetchSingleAlgorithmModelTaskResult)) {
            Object obj = message.obj;
            if (obj != null) {
                FetchSingleAlgorithmModelTaskResult fetchSingleAlgorithmModelTaskResult = (FetchSingleAlgorithmModelTaskResult) obj;
                EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
                l.a((Object) effectConfiguration, "");
                ListenerManger listenerManger = effectConfiguration.getListenerManger();
                if (listenerManger != null && (kNPlatformListener = listenerManger.getKNPlatformListener(fetchSingleAlgorithmModelTaskResult.getTaskID())) != null) {
                    ExceptionResult exceptionResult = fetchSingleAlgorithmModelTaskResult.getExceptionResult();
                    SingleAlgorithmModelResponse response = fetchSingleAlgorithmModelTaskResult.getResponse();
                    if (exceptionResult != null) {
                        kNPlatformListener.onFail(null, new com.ss.ugc.effectplatform.model.e(exceptionResult.getErrorCode(), exceptionResult.getException()));
                    } else if (response == null) {
                        kNPlatformListener.onFail(null, new com.ss.ugc.effectplatform.model.e(10002));
                    } else {
                        kNPlatformListener.onSuccess(response.getData());
                    }
                    EffectConfiguration effectConfiguration2 = this.config.getEffectConfiguration();
                    l.a((Object) effectConfiguration2, "");
                    ListenerManger listenerManger2 = effectConfiguration2.getListenerManger();
                    if (listenerManger2 != null) {
                        listenerManger2.removeKNPlatformListener(fetchSingleAlgorithmModelTaskResult.getTaskID());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    private final ModelInfo getSingleModelInfo(int i2, String str) {
        return this.modelConfigArbiter.getSingleModelInfo(i2, str);
    }

    private final ModelInfo getSingleModelInfoNonBlocking(int i2, String str) {
        return this.modelConfigArbiter.getSingleModelInfoNonBlocking(i2, str);
    }

    private final void onFailOver(ModelInfo modelInfo, RuntimeException runtimeException) {
        LocalModelInfo localModelInfoByName;
        IModelCache iModelCache = this.modelCache;
        if (iModelCache == null || (localModelInfoByName = iModelCache.getLocalModelInfoByName(modelInfo.getName(), null)) == null) {
            throw runtimeException;
        } else if (!ModelNameProcessor.isBigVersionEquals(localModelInfoByName.getVersion(), modelInfo.getVersion())) {
            throw runtimeException;
        }
    }

    private final Effect parseEffect(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, 1, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    public final void fetchModels(int i2, String[] strArr) {
        l.c(strArr, "");
        fetchModels(i2, strArr, new MonitorTrace(strArr.toString()));
    }

    private final ModelInfo getLatestModelInfo(int i2, String str) {
        LoadedModelList requireDecidedConfig = this.modelConfigArbiter.requireDecidedConfig(i2);
        l.a((Object) requireDecidedConfig, "");
        for (LoadedModelList.ModelInfoState modelInfoState : requireDecidedConfig.mRequirementModelInfoStateMap.values()) {
            l.a((Object) modelInfoState, "");
            if (l.a((Object) modelInfoState.getName(), (Object) str)) {
                return modelInfoState.getModelInfo();
            }
        }
        return null;
    }

    public final Collection<ModelInfo> collectNeedDownloadModelsList(int i2, String[] strArr, MonitorTrace monitorTrace) {
        l.c(strArr, "");
        LoadedModelList requireDecidedConfig = this.modelConfigArbiter.requireDecidedConfig(i2);
        l.a((Object) requireDecidedConfig, "");
        return collectNeedDownloadModelsListInternal(i2, strArr, requireDecidedConfig, monitorTrace);
    }

    private final synchronized void fetchModels(int i2, String[] strArr, MonitorTrace monitorTrace) {
        MethodCollector.i(639);
        try {
            downloadAndUpdateModelList(null, collectNeedDownloadModelsList(i2, strArr, monitorTrace), monitorTrace);
            MethodCollector.o(639);
        } catch (RuntimeException e2) {
            if (canFallbackToBuiltInResources(strArr)) {
                MethodCollector.o(639);
            } else {
                MethodCollector.o(639);
                throw e2;
            }
        }
    }

    private final boolean isModelNeedUpdate(LocalModelInfo localModelInfo, ModelInfo modelInfo, MonitorTrace monitorTrace) {
        if (localModelInfo == null) {
            return true;
        }
        if (!TextUtils.equals(localModelInfo.getVersion(), modelInfo.getVersion())) {
            EPLog.d("ModelFetcher", "model " + localModelInfo.getName() + " version not equals, local model version:" + localModelInfo.getVersion() + ", lastest model: " + modelInfo.getVersion());
            EPMonitor.traceStep(monitorTrace, "version changed [" + localModelInfo.getVersion() + " → " + modelInfo.getVersion() + "], Need update!");
            return true;
        } else if (localModelInfo.getSize() != modelInfo.getType()) {
            EPLog.d("ModelFetcher", "model " + localModelInfo.getName() + " size not equals, local model type:" + localModelInfo.getSize() + ", lastest model: " + modelInfo.getType());
            EPMonitor.traceStep(monitorTrace, "size changed [" + localModelInfo.getSize() + " → " + modelInfo.getType() + "], Need update!");
            return true;
        } else if (TextUtils.equals(localModelInfo.getMD5(), modelInfo.getMD5())) {
            return false;
        } else {
            EPLog.d("ModelFetcher", "model " + localModelInfo.getName() + " md5 not equals, local model type:" + localModelInfo.getMD5() + ", lastest model: " + modelInfo.getMD5());
            EPMonitor.traceStep(monitorTrace, "md5 changed [" + localModelInfo.getMD5() + " → " + modelInfo.getMD5() + "], Need update!");
            return true;
        }
    }

    public final Map<String, Boolean> downloadAndUpdateModelList(Effect effect, Collection<ModelInfo> collection, MonitorTrace monitorTrace) {
        long j2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (collection != null) {
            for (ModelInfo modelInfo : collection) {
                Stopwatch createStarted = Stopwatch.createStarted();
                try {
                    ModelEventListener modelEventListener = this.eventListener;
                    if (modelEventListener != null) {
                        modelEventListener.onModelDownloadStart(parseEffect(effect, modelInfo), modelInfo);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    EPMonitor.traceStep(monitorTrace, "download start:".concat(String.valueOf(modelInfo)));
                    EPLog.d("ModelFetcher", "fetchModels, model: " + modelInfo.getName() + ", version: " + modelInfo.getVersion() + " download start!");
                    IModelDownloader iModelDownloader = this.modelDownloader;
                    if (iModelDownloader != null) {
                        FetchModelType modelType = this.config.getModelType();
                        l.a((Object) modelType, "");
                        j2 = iModelDownloader.download(modelInfo, modelType, monitorTrace);
                    } else {
                        j2 = 0;
                    }
                    if (j2 > 0) {
                        EPMonitor.traceStep(monitorTrace, "download success:".concat(String.valueOf(modelInfo)));
                        EPMonitor.traceEnd(monitorTrace);
                        Effect parseEffect = parseEffect(effect, modelInfo);
                        l.a((Object) createStarted, "");
                        onDownloadSuccess(parseEffect, modelInfo, createStarted, currentTimeMillis, j2);
                        EPLog.d("ModelFetcher", "model::" + modelInfo.getName() + ",version = " + modelInfo.getVersion() + ",size = " + modelInfo.getType() + " download success!");
                        linkedHashMap.put(modelInfo.getName(), true);
                    } else {
                        EPMonitor.traceStep(monitorTrace, "download failed:".concat(String.valueOf(modelInfo)));
                        EPMonitor.traceEnd(monitorTrace);
                        RuntimeException runtimeException = new RuntimeException("download model fail, downloadFileSize = ".concat(String.valueOf(j2)));
                        onDownloadFailure(parseEffect(effect, modelInfo), modelInfo, runtimeException, monitorTrace);
                        EPLog.d("ModelFetcher", "model::" + modelInfo.getName() + ",info.getVersion() = " + modelInfo.getVersion() + ", size = " + modelInfo.getType() + " download failure");
                        onFailOver(modelInfo, runtimeException);
                        linkedHashMap.put(modelInfo.getName(), false);
                    }
                } catch (RuntimeException e2) {
                    EPMonitor.traceStep(monitorTrace, "downloadAndUpdateModelList exception occurred: cause = " + e2.getMessage());
                    EPMonitor.traceEnd(monitorTrace);
                    onDownloadFailure(parseEffect(effect, modelInfo), modelInfo, e2, monitorTrace);
                    onFailOver(modelInfo, e2);
                    linkedHashMap.put(modelInfo.getName(), false);
                }
            }
        }
        return linkedHashMap;
    }

    public ModelFetcher(DownloadableModelConfig downloadableModelConfig, ModelConfigArbiter modelConfigArbiter2, IModelCache iModelCache, EffectNetWorkerWrapper effectNetWorkerWrapper) {
        l.c(downloadableModelConfig, "");
        l.c(modelConfigArbiter2, "");
        l.c(effectNetWorkerWrapper, "");
        this.config = downloadableModelConfig;
        this.modelConfigArbiter = modelConfigArbiter2;
        this.modelCache = iModelCache;
        this.netWorker = effectNetWorkerWrapper;
        this.eventListener = downloadableModelConfig.getEventListener();
        this.monitorService = downloadableModelConfig.getMonitorService();
        this.modelDownloader = new ModelDownloader((DownloadedModelStorage) iModelCache, effectNetWorkerWrapper);
    }

    private final void onDownloadFailure(Effect effect, ModelInfo modelInfo, Exception exc, MonitorTrace monitorTrace) {
        List<String> list;
        List<String> list2;
        ExtendedUrlModel file_url;
        List<String> url_list;
        String str = "";
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        String str2 = null;
        if (modelInfo.getFile_url() != null) {
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            if (file_url2 != null) {
                list2 = file_url2.getUrl_list();
            } else {
                list2 = null;
            }
            if (!(CollectionUtil.isListEmpty(list2) || (file_url = modelInfo.getFile_url()) == null || (url_list = file_url.getUrl_list()) == null)) {
                str2 = url_list.get(0);
            }
        }
        try {
            InetAddress byName = InetAddress.getByName(new URL(str2).getHost());
            l.a((Object) byName, str);
            str = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder addValuePair = EventJsonBuilder.newBuilder().addValuePair("app_id", this.config.getAppId()).addValuePair("access_key", this.config.getAccessKey()).addValuePair("resource_name", modelInfo.getName()).addValuePair("resource_type", this.config.getModelType().toString()).addValuePair("error_msg", exc.getMessage()).addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode())).addValuePair("download_url", str2).addValuePair("host_ip", str);
            if (monitorTrace == null || (list = monitorTrace.getStepList()) == null) {
                list = z.INSTANCE;
            }
            iMonitorService.monitorStatusRate("resource_download_success_rate", 1, addValuePair.addValuePair("monitor_trace", list).build());
        }
        ModelEventListener modelEventListener = this.eventListener;
        if (modelEventListener != null) {
            modelEventListener.onModelDownloadError(effect, modelInfo, exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<com.ss.android.ugc.effectmanager.model.ModelInfo> collectNeedDownloadModelsListInternal(int r18, java.lang.String[] r19, com.ss.android.ugc.effectmanager.LoadedModelList r20, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r21) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher.collectNeedDownloadModelsListInternal(int, java.lang.String[], com.ss.android.ugc.effectmanager.LoadedModelList, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):java.util.Collection");
    }

    private final void onDownloadSuccess(Effect effect, ModelInfo modelInfo, Stopwatch stopwatch, long j2, long j3) {
        long j4 = j3 / ((long) EffectConstants.KB);
        modelInfo.setTotalSize(j4);
        AlgorithmModelInfoMemoryCache.writeModelInfo(modelInfo);
        long currentTimeMillis = System.currentTimeMillis() - j2;
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("resource_download_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.config.getAppId()).addValuePair("access_key", this.config.getAccessKey()).addValuePair("duration", Long.valueOf(currentTimeMillis)).addValuePair("resource_name", modelInfo.getName()).addValuePair("resource_type", this.config.getModelType().toString()).addValuePair("size", Long.valueOf(j4)).build());
        }
        ModelEventListener modelEventListener = this.eventListener;
        if (modelEventListener != null) {
            modelEventListener.onModelDownloadSuccess(effect, modelInfo, stopwatch.elapsedMillis());
        }
    }

    public final void fetchModelByNameDirectlyFromServer(String str, int i2, String str2, boolean z, e<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> eVar) {
        if (str != null && str.length() != 0) {
            String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
            ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 = new ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1(this, eVar, z, str);
            EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
            l.a((Object) effectConfiguration, "");
            ListenerManger listenerManger = effectConfiguration.getListenerManger();
            if (listenerManger != null) {
                listenerManger.addNewKNPlatformListener(generateTaskId, modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1);
            }
            FetchModelInfoByNameTask fetchModelInfoByNameTask = new FetchModelInfoByNameTask(this.config, str, i2, str2, generateTaskId, this.handler);
            EffectConfiguration effectConfiguration2 = this.config.getEffectConfiguration();
            l.a((Object) effectConfiguration2, "");
            TaskManager taskManager = effectConfiguration2.getTaskManager();
            if (taskManager == null) {
                taskManager = createEffectTaskManager();
                EffectConfiguration effectConfiguration3 = this.config.getEffectConfiguration();
                l.a((Object) effectConfiguration3, "");
                effectConfiguration3.setTaskManager(taskManager);
            }
            taskManager.commit(fetchModelInfoByNameTask);
        } else if (eVar != null) {
            eVar.onFail(null, new com.ss.ugc.effectplatform.model.e(new RuntimeException("model name is null!")));
        }
    }

    public static /* synthetic */ void fetchModelByNameDirectlyFromServer$default(ModelFetcher modelFetcher, String str, int i2, String str2, boolean z, e eVar, int i3, Object obj) {
        String str3 = str2;
        boolean z2 = z;
        e eVar2 = null;
        if ((i3 & 4) != 0) {
            str3 = null;
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        if ((i3 & 16) == 0) {
            eVar2 = eVar;
        }
        modelFetcher.fetchModelByNameDirectlyFromServer(str, i2, str3, z2, eVar2);
    }
}
