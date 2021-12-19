package com.bytedance.boost_multidex;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class BoostNative {
    private static volatile boolean alreadyInit;
    private static boolean supportFastLoadDex;

    static {
        Covode.recordClassIndex(15631);
        Monitor.get().loadLibrary("boost_multidex");
    }

    BoostNative() {
    }

    private static void checkSupportFastLoad(Result result) {
        MethodCollector.i(7741);
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            int i2 = Build.VERSION.SDK_INT;
            String str = (String) declaredMethod.invoke(null, "persist.sys.dalvik.vm.lib", null);
            result.vmLibName = str;
            Monitor.get().logInfo("VM lib is ".concat(String.valueOf(str)));
            if ("libart.so".equals(str)) {
                Monitor.get().logWarning("VM lib is art, skip!");
                MethodCollector.o(7741);
                return;
            }
            String str2 = (String) declaredMethod.invoke(null, "ro.yunos.version", null);
            if ((str2 == null || str2.isEmpty()) && !new File("/system/lib/libvmkid_lemur.so").exists()) {
                boolean initialize = initialize(Build.VERSION.SDK_INT, RuntimeException.class);
                supportFastLoadDex = initialize;
                result.supportFastLoadDex = initialize;
                MethodCollector.o(7741);
                return;
            }
            result.isYunOS = true;
            Monitor.get().logWarning("Yun os is " + str2 + ", skip boost!");
            MethodCollector.o(7741);
        } catch (Throwable th) {
            result.addUnFatalThrowable(th);
            Monitor.get().logWarning("Fail to init", th);
            MethodCollector.o(7741);
        }
    }

    private static native boolean initialize(int i2, Class<RuntimeException> cls);

    static synchronized boolean isSupportFastLoad() {
        boolean z;
        synchronized (BoostNative.class) {
            MethodCollector.i(7745);
            if (!alreadyInit) {
                checkSupportFastLoad(Result.get());
                alreadyInit = true;
            }
            z = supportFastLoadDex;
            MethodCollector.o(7745);
        }
        return z;
    }

    static native Object loadDirectDex(String str, byte[] bArr);

    static native boolean makeOptDexFile(String str, String str2);

    static native long obtainCheckSum(String str);

    static native void recoverAction();
}
