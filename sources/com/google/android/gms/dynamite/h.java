package com.google.android.gms.dynamite;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.PathClassLoader;

/* access modifiers changed from: package-private */
public final class h extends PathClassLoader {
    static {
        Covode.recordClassIndex(31500);
    }

    h(String str, ClassLoader classLoader) {
        super(str, classLoader);
        MethodCollector.i(10810);
        MethodCollector.o(10810);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
