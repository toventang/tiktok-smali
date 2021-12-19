package com.bytedance.common.jato.shrinker;

import com.bytedance.common.jato.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class ShrinkerNativeHolder {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26880a;

    static {
        Covode.recordClassIndex(15863);
    }

    static native int shrinkHeapNative(int i2);

    static native int shrinkMallocNative(int i2, int i3);

    static native int shrinkRegionNative(int i2);

    static native int shrinkWebviewNative();

    ShrinkerNativeHolder() {
    }

    static synchronized boolean a() {
        boolean z;
        synchronized (ShrinkerNativeHolder.class) {
            MethodCollector.i(14334);
            if (!f26880a && c.a()) {
                f26880a = true;
            }
            z = f26880a;
            MethodCollector.o(14334);
        }
        return z;
    }
}
