package com.bytedance.common.jato.shrinker;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class Shrinker {
    private static Shrinker sInstance;

    static {
        Covode.recordClassIndex(15862);
    }

    public int doShrink() {
        return doShrink(false, -1);
    }

    public static synchronized Shrinker getInstance() {
        Shrinker shrinker;
        synchronized (Shrinker.class) {
            MethodCollector.i(14396);
            if (sInstance == null) {
                sInstance = new Shrinker();
            }
            shrinker = sInstance;
            MethodCollector.o(14396);
        }
        return shrinker;
    }

    public int doShrink(int i2) {
        return doShrink(false, i2);
    }

    public int doShrink(boolean z) {
        return doShrink(z, -1);
    }

    public int doShrinkRegion(int i2) {
        MethodCollector.i(14398);
        if (Build.VERSION.SDK_INT < 26 || !ShrinkerNativeHolder.a()) {
            MethodCollector.o(14398);
            return 0;
        }
        int shrinkRegionNative = ShrinkerNativeHolder.shrinkRegionNative(i2);
        MethodCollector.o(14398);
        return shrinkRegionNative;
    }

    public int doShrink(boolean z, int i2) {
        MethodCollector.i(8393);
        if (Build.VERSION.SDK_INT > 23 && ShrinkerNativeHolder.a()) {
            ShrinkerNativeHolder.shrinkMallocNative(2, 16);
        }
        if (z) {
            ShrinkerNativeHolder.shrinkWebviewNative();
        }
        if (Build.VERSION.SDK_INT >= 26 || Build.VERSION.SDK_INT <= 19 || !ShrinkerNativeHolder.a()) {
            MethodCollector.o(8393);
            return -1;
        }
        int shrinkHeapNative = ShrinkerNativeHolder.shrinkHeapNative(i2);
        MethodCollector.o(8393);
        return shrinkHeapNative;
    }
}
