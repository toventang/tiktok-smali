package com.bytedance.common.jato.dex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f26844a;

    /* renamed from: b  reason: collision with root package name */
    private static int f26845b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f26846c;

    static {
        Covode.recordClassIndex(15834);
    }

    public static void a() {
        if (!f26846c) {
            Jato.getListener().a("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT < 24) {
            Jato.getListener().a("none_class_verify fail because Android OS version not support");
        } else {
            int verifyNone = DexTricksNativeHolder.verifyNone(f26845b, f26844a);
            if (verifyNone != 0) {
                Jato.getListener().a("none_class_verify disable fail", new IllegalStateException("result: ".concat(String.valueOf(verifyNone))));
            }
        }
    }

    public static void b() {
        if (!f26846c) {
            Jato.getListener().a("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT < 24) {
            Jato.getListener().a("none_class_verify fail because Android OS version not support");
        } else {
            int verifyEnable = DexTricksNativeHolder.verifyEnable();
            if (verifyEnable != 0) {
                Jato.getListener().a("none_class_verify enable fail", new IllegalStateException("result: ".concat(String.valueOf(verifyEnable))));
            }
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            MethodCollector.i(7349);
            if (f26846c) {
                MethodCollector.o(7349);
                return;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            f26844a = Build.VERSION.SDK_INT;
            f26845b = applicationInfo.targetSdkVersion;
            f26846c = true;
            MethodCollector.o(7349);
        }
    }
}
