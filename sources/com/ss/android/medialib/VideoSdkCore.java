package com.ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.vesdk.an;

public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT = null;
    private static final String TAG = VideoSdkCore.class.getSimpleName();
    private static boolean inited = false;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    private static native String nativeGetString(String str);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetBoolean(String str, boolean z);

    private static native void nativeSetInt(String str, int i2);

    private static native void nativeSetString(String str, String str2);

    public static String getSdkVersionCode() {
        MethodCollector.i(5077);
        String nativeGetString = nativeGetString("VersionCode");
        MethodCollector.o(5077);
        return nativeGetString;
    }

    public static String getSdkVersionName() {
        MethodCollector.i(5076);
        String nativeGetString = nativeGetString("VersionName");
        MethodCollector.o(5076);
        return nativeGetString;
    }

    static {
        Covode.recordClassIndex(36852);
        d.c();
    }

    public static Context com_ss_android_medialib_VideoSdkCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        MethodCollector.i(5015);
        nativeSetBoolean("enableEffectAudioManagerCallback", z);
        MethodCollector.o(5015);
    }

    public static void enableGLES3(boolean z) {
        MethodCollector.i(4914);
        nativeSetBoolean("GLES3", z);
        MethodCollector.o(4914);
    }

    public static void enableMakeupSegmentation(boolean z) {
        MethodCollector.i(5013);
        nativeSetBoolean("enableMakeupSegmentation", z);
        MethodCollector.o(5013);
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        MethodCollector.i(5072);
        nativeSetBoolean("ABbUseBuildinAmazing", z);
        MethodCollector.o(5072);
    }

    public static void setAmazingShareDir(String str) {
        MethodCollector.i(5005);
        nativeSetString("AmazingShareDir", str);
        MethodCollector.o(5005);
    }

    public static void setEffectJsonConfig(String str) {
        MethodCollector.i(5070);
        nativeSetString("EffectJsonConfig", str);
        MethodCollector.o(5070);
    }

    public static void setEffectLogLevel(int i2) {
        MethodCollector.i(5007);
        nativeSetInt("EffectLogLevel", i2);
        MethodCollector.o(5007);
    }

    public static void setEffectMaxMemoryCache(int i2) {
        MethodCollector.i(5009);
        nativeSetInt("EffectMaxMemoryCache", i2);
        MethodCollector.o(5009);
    }

    public static void setEnableAssetManager(boolean z) {
        MethodCollector.i(5074);
        nativeSetBoolean("AssertManagerEnable", z);
        MethodCollector.o(5074);
    }

    public static void setProduct(int i2) {
        MethodCollector.i(4913);
        nativeSetInt("Product", i2);
        MethodCollector.o(4913);
    }

    public static long getNativeFinder(long j2) {
        if (j2 == 0) {
            an.d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j2);
        }
        an.d(TAG, "Error call finder related interface.");
        return 0;
    }

    public static void releaseNativeFinder(long j2) {
        if (j2 == 0) {
            an.d(TAG, "getNativeFinder effectHandler is null");
            return;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder == null) {
            an.d(TAG, "Error call finder related interface.");
        } else {
            resourceFinder.release(j2);
        }
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        MethodCollector.i(4997);
        sFinder = resourceFinder;
        nativeSetBoolean("ResourceFinderEnable", true);
        MethodCollector.o(4997);
    }

    public static void init(Context context) {
        MethodCollector.i(4910);
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                try {
                    if (!inited) {
                        APPLICATION_CONTEXT = com_ss_android_medialib_VideoSdkCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                        nativeSetAssertManagerFromJava(context.getAssets());
                        inited = true;
                    }
                } finally {
                    MethodCollector.o(4910);
                }
            }
            return;
        }
        MethodCollector.o(4910);
    }
}
