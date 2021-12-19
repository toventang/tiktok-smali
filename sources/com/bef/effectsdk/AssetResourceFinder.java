package com.bef.effectsdk;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class AssetResourceFinder implements ResourceFinder {
    private final AssetManager mAssetManager;
    private final String mDir;

    static {
        Covode.recordClassIndex(2820);
    }

    private static native long nativeCreateAssetResourceFinder(long j2, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j2);

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized long createNativeResourceFinder(long j2) {
        long nativeCreateAssetResourceFinder;
        MethodCollector.i(1632);
        nativeCreateAssetResourceFinder = nativeCreateAssetResourceFinder(j2, this.mAssetManager, this.mDir);
        MethodCollector.o(1632);
        return nativeCreateAssetResourceFinder;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized void release(long j2) {
        MethodCollector.i(1633);
        nativeReleaseAssetResourceFinder(j2);
        MethodCollector.o(1633);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.mAssetManager = assetManager;
        this.mDir = str;
    }
}
