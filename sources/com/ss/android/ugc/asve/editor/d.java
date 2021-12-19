package com.ss.android.ugc.asve.editor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlinx.coroutines.android.b;
import kotlinx.coroutines.android.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static b f62009a;

    static {
        Covode.recordClassIndex(38123);
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        f62009a = c.a(a(mainLooper), "fast-main");
    }

    private static Handler a(Looper looper) {
        l.d(looper, "");
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            l.b(declaredConstructor, "");
            Object newInstance = declaredConstructor.newInstance(looper, null, true);
            l.b(newInstance, "");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
