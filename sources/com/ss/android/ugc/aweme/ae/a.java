package com.ss.android.ugc.aweme.ae;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.android.b;
import kotlinx.coroutines.android.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f66263a;

    /* renamed from: b  reason: collision with root package name */
    private static ah f66264b = new C1482a();

    /* renamed from: com.ss.android.ugc.aweme.ae.a$a  reason: collision with other inner class name */
    public static final class C1482a extends ah {
        static {
            Covode.recordClassIndex(40711);
        }

        @Override // kotlinx.coroutines.ah
        public final boolean isDispatchNeeded(f fVar) {
            l.d(fVar, "");
            return false;
        }

        C1482a() {
        }

        @Override // kotlinx.coroutines.ah
        public final void dispatch(f fVar, Runnable runnable) {
            l.d(fVar, "");
            l.d(runnable, "");
            runnable.run();
        }
    }

    static {
        Covode.recordClassIndex(40710);
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        f66263a = c.a(a(mainLooper), "fast-main");
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
