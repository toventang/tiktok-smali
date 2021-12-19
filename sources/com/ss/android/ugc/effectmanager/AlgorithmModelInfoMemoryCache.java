package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AlgorithmModelInfoMemoryCache {
    public static final AlgorithmModelInfoMemoryCache INSTANCE = new AlgorithmModelInfoMemoryCache();
    private static final ConcurrentHashMap<String, ModelInfoCache> cache = new ConcurrentHashMap<>();
    private static final AtomicBoolean hasBuiltCache = new AtomicBoolean(false);

    private AlgorithmModelInfoMemoryCache() {
    }

    public static final boolean hasBuiltCache() {
        return hasBuiltCache.get();
    }

    static {
        Covode.recordClassIndex(95165);
    }

    public static final synchronized void clear() {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.i(1373);
            cache.clear();
            hasBuiltCache.set(false);
            MethodCollector.o(1373);
        }
    }

    public static final synchronized void writeModelInfo(ModelInfo modelInfo) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.i(1360);
            l.c(modelInfo, "");
            String name = modelInfo.getName();
            LocalModelInfo localModelInfo = new LocalModelInfo();
            localModelInfo.setName(name);
            localModelInfo.setMd5(modelInfo.getMD5());
            localModelInfo.setSize(modelInfo.getType());
            localModelInfo.setVersion(modelInfo.getVersion());
            localModelInfo.setBuilt(false);
            ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, modelInfo);
            EPLog.d("AlgorithmModelInfoMemoryCache", "model: " + name + " write in cache!");
            cache.put(name, modelInfoCache);
            MethodCollector.o(1360);
        }
    }

    public static final synchronized boolean isModelReady(String str) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.i(1372);
            if (str == null) {
                MethodCollector.o(1372);
                return false;
            }
            ModelInfoCache modelInfoCache = cache.get(str);
            if (modelInfoCache == null) {
                EPLog.e("AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!");
                MethodCollector.o(1372);
                return false;
            }
            LocalModelInfo localModelInfo = modelInfoCache.getLocalModelInfo();
            ModelInfo serverModelInfo = modelInfoCache.getServerModelInfo();
            if (!l.a((Object) localModelInfo.getVersion(), (Object) serverModelInfo.getVersion())) {
                EPLog.e("AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + localModelInfo.getVersion() + ", server version: " + serverModelInfo.getVersion());
                MethodCollector.o(1372);
                return false;
            } else if (localModelInfo.isBuilt()) {
                MethodCollector.o(1372);
                return true;
            } else if (localModelInfo.getSize() != serverModelInfo.getType()) {
                EPLog.e("AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + localModelInfo.getSize() + ", server size: " + serverModelInfo.getType());
                MethodCollector.o(1372);
                return false;
            } else if (!l.a((Object) localModelInfo.getMD5(), (Object) serverModelInfo.getMD5())) {
                EPLog.e("AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + localModelInfo.getMD5() + ", server md5: " + serverModelInfo.getMD5());
                MethodCollector.o(1372);
                return false;
            } else {
                MethodCollector.o(1372);
                return true;
            }
        }
    }

    public final void buildCache(LoadedModelList loadedModelList, IModelCache iModelCache) {
        l.c(loadedModelList, "");
        l.c(iModelCache, "");
        Map<String, ModelInfo> modelInfoList = loadedModelList.getModelInfoList();
        if (modelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        Map<String, LocalModelInfo> localModelInfoList = iModelCache.getLocalModelInfoList();
        if (localModelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        l.a((Object) modelInfoList, "");
        for (Map.Entry<String, ModelInfo> entry : modelInfoList.entrySet()) {
            String key = entry.getKey();
            LocalModelInfo localModelInfo = localModelInfoList.get(key);
            if (localModelInfo != null) {
                ModelInfo value = entry.getValue();
                l.a((Object) value, "");
                ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, value);
                ConcurrentHashMap<String, ModelInfoCache> concurrentHashMap = cache;
                l.a((Object) key, "");
                concurrentHashMap.put(key, modelInfoCache);
            }
        }
        hasBuiltCache.set(true);
    }
}
