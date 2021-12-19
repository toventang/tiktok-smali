package com.ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.z;

public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static String sCacheDir = "";
    private static AssetManager sEffectAssetManager = null;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeEnableAlgoParamisForce(boolean z, boolean z2);

    private static native void nativeEnableEffectAudioManagerCallback(boolean z);

    private static native void nativeEnableEffectRT(boolean z);

    private static native void nativeEnableMakeupSegmentation(boolean z);

    private static native String nativeGetABConfigList();

    private static native void nativeSetABConfigValue(String str, boolean z, int i2, float f2, String str2, int i3);

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetCacheDir(String str);

    private static native void nativeSetEffectAsynAPI(boolean z);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i2);

    private static native void nativeSetEffectMaxMemoryCache(int i2);

    private static native void nativeSetEffectSyncTimeDomain(boolean z);

    private static native void nativeSetEnableStickerAmazing(boolean z);

    private static native void nativeSetShareDir(String str);

    private static native void nativeUseNewEffectAlgorithmApi(boolean z);

    private static native void nativesetEnableStickerReleaseTexture(boolean z);

    public static String getCacheDir() {
        return sCacheDir;
    }

    public static String getABConfigList() {
        MethodCollector.i(2274);
        String nativeGetABConfigList = nativeGetABConfigList();
        MethodCollector.o(2274);
        return nativeGetABConfigList;
    }

    static {
        Covode.recordClassIndex(99562);
        d.a();
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        MethodCollector.i(2621);
        nativeEnableEffectAudioManagerCallback(z);
        MethodCollector.o(2621);
    }

    public static boolean enableEffectRT(boolean z) {
        MethodCollector.i(2265);
        nativeEnableEffectRT(z);
        MethodCollector.o(2265);
        return true;
    }

    public static void enableMakeupSegmentation(boolean z) {
        MethodCollector.i(2620);
        nativeEnableMakeupSegmentation(z);
        MethodCollector.o(2620);
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        MethodCollector.i(1983);
        nativeSetABbUseBuildinAmazing(z);
        MethodCollector.o(1983);
        return true;
    }

    public static void setCacheDir(String str) {
        MethodCollector.i(1964);
        sCacheDir = str;
        nativeSetCacheDir(str);
        MethodCollector.o(1964);
    }

    public static void setEffectAsynAPI(boolean z) {
        MethodCollector.i(2272);
        nativeSetEffectAsynAPI(z);
        MethodCollector.o(2272);
    }

    public static void setEffectForceDetectFace(boolean z) {
        MethodCollector.i(2267);
        nativeSetEffectForceDetectFace(z);
        MethodCollector.o(2267);
    }

    public static boolean setEffectJsonConfig(String str) {
        MethodCollector.i(1981);
        nativeSetEffectJsonConfig(str);
        MethodCollector.o(1981);
        return true;
    }

    public static boolean setEffectLogLevel(int i2) {
        MethodCollector.i(1975);
        nativeSetEffectLogLevel(i2);
        MethodCollector.o(1975);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i2) {
        MethodCollector.i(1978);
        nativeSetEffectMaxMemoryCache(i2);
        MethodCollector.o(1978);
        return true;
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        MethodCollector.i(2268);
        nativeSetEffectSyncTimeDomain(z);
        MethodCollector.o(2268);
    }

    public static void setEnableStickerAmazing(boolean z) {
        MethodCollector.i(2269);
        nativeSetEnableStickerAmazing(z);
        MethodCollector.o(2269);
    }

    public static void setEnableStickerReleaseTexture(boolean z) {
        MethodCollector.i(2270);
        nativesetEnableStickerReleaseTexture(z);
        MethodCollector.o(2270);
    }

    public static boolean setShareDir(String str) {
        MethodCollector.i(1974);
        nativeSetShareDir(str);
        MethodCollector.o(1974);
        return true;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        MethodCollector.i(2619);
        nativeUseNewEffectAlgorithmApi(z);
        MethodCollector.o(2619);
    }

    public static long getNativeFinder(long j2) {
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j2);
        }
        throw new z(-1, "Error call finder related interface.");
    }

    public static void releaseNativeFinder(long j2) {
        if (j2 == 0) {
            an.d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            an.a(TAG, "getNativeFinder effectHandler " + sFinder.getClass().getCanonicalName());
            sFinder.release(j2);
        } else {
            throw new z(-1, "Error call finder related interface.");
        }
    }

    public static void enableAlgoParamIsForce(boolean z, boolean z2) {
        MethodCollector.i(2279);
        nativeEnableAlgoParamisForce(z, z2);
        MethodCollector.o(2279);
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        MethodCollector.i(2266);
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
        MethodCollector.o(2266);
    }

    public static void setABConfigValue(String str, Object obj, int i2) {
        MethodCollector.i(2278);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && (obj instanceof String)) {
                        nativeSetABConfigValue(str, false, 0, 0.0f, (String) obj, 3);
                    }
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeSetABConfigValue(str, false, 0, ((Number) obj).floatValue(), null, 2);
                    MethodCollector.o(2278);
                    return;
                }
            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                nativeSetABConfigValue(str, false, ((Number) obj).intValue(), 0.0f, null, 1);
                MethodCollector.o(2278);
                return;
            }
        } else if (obj instanceof Boolean) {
            nativeSetABConfigValue(str, ((Boolean) obj).booleanValue(), 0, 0.0f, null, 0);
            MethodCollector.o(2278);
            return;
        }
        MethodCollector.o(2278);
    }
}
