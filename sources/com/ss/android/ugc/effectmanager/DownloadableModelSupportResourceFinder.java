package com.ss.android.ugc.effectmanager;

import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper;
import com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.ss.android.ugc.effectmanager.algorithm.ModelFinder;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;

public class DownloadableModelSupportResourceFinder implements ResourceFinder {
    private AssetResourceFinder mAssetResourceFinder;
    private long mEffectHandle;
    private ModelFinder mModelFinder;

    static {
        Covode.recordClassIndex(95186);
    }

    private native long nativeCreateResourceFinder(long j2);

    public DownloadableModelSupportResourceFinder() {
    }

    public long getEffectHandle() {
        return this.mEffectHandle;
    }

    private void onModelNotFound(String str) {
        ModelFinder modelFinder = this.mModelFinder;
        if (modelFinder != null) {
            modelFinder.onModelNotFound(str);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j2) {
        this.mEffectHandle = 0;
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.release(j2);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j2) {
        MethodCollector.i(2522);
        this.mEffectHandle = j2;
        DownloadableModelLibraryLoader.INSTANCE.loadLibrary();
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.createNativeResourceFinder(j2);
        }
        long nativeCreateResourceFinder = nativeCreateResourceFinder(j2);
        MethodCollector.o(2522);
        return nativeCreateResourceFinder;
    }

    public static void modelNotFound(String str) {
        EPLog.d("ResourceFinder", "modelNotFound:nameStr=".concat(String.valueOf(str)));
        if (DownloadableModelSupport.isInitialized()) {
            DownloadableModelSupport.getInstance().getResourceFinder().onModelNotFound(str);
            DownloadableModelSupport.getInstance().getResourceFinder().monitorStatusRateFail(null, str);
        }
    }

    public boolean isResourceAvailable(String str) {
        String queryResourceUri = this.mModelFinder.queryResourceUri(str, null);
        if (queryResourceUri == null || "asset://not_found".equals(queryResourceUri) || "asset://not_initialized".equals(queryResourceUri) || "asset://md5_error".equals(queryResourceUri)) {
            return false;
        }
        return true;
    }

    private void monitorStatusRateFail(MonitorTrace monitorTrace, String str) {
        ModelFinder modelFinder = this.mModelFinder;
        if (modelFinder != null) {
            modelFinder.monitorStatusRateFail(monitorTrace, str);
        }
    }

    public static String findResourceUri(String str, String str2) {
        if (!DownloadableModelSupport.isInitialized()) {
            EPLog.e("ResourceFinder", "findResourceUri return with DownloadableModelSupport not initialized!");
            return "asset://not_initialized";
        }
        ModelFinder modelFinder = DownloadableModelSupport.getInstance().getResourceFinder().mModelFinder;
        if (modelFinder == null) {
            return "asset://not_initialized";
        }
        return modelFinder.findResourceUri(0, str, str2);
    }

    public DownloadableModelSupportResourceFinder(ModelConfigArbiter modelConfigArbiter, IModelCache iModelCache, DownloadableModelConfig downloadableModelConfig, AssetManagerWrapper assetManagerWrapper) {
        this.mAssetResourceFinder = new AssetResourceFinder(assetManagerWrapper.getWrapped(), iModelCache.getCacheDir());
        this.mModelFinder = new ModelFinder(downloadableModelConfig, modelConfigArbiter, iModelCache, assetManagerWrapper);
    }
}
