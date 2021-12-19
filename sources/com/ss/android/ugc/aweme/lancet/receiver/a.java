package com.ss.android.ugc.aweme.lancet.receiver;

import android.content.ContextWrapper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f107242a;

    static {
        Covode.recordClassIndex(68595);
    }

    public static void a(ContextWrapper contextWrapper) {
        MethodCollector.i(7776);
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) {
            synchronized (a.class) {
                try {
                    if (!f107242a) {
                        f107242a = true;
                        try {
                            Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(contextWrapper.getBaseContext());
                            Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, null);
                        } catch (Exception unused) {
                        }
                        MethodCollector.o(7776);
                    }
                } finally {
                    MethodCollector.o(7776);
                }
            }
        } else {
            MethodCollector.o(7776);
        }
    }
}
