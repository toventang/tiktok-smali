package com.bytedance.ies.powerlist.c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static kotlinx.coroutines.android.b f34266a;

    static {
        Covode.recordClassIndex(20476);
        Looper mainLooper = Looper.getMainLooper();
        l.a((Object) mainLooper, "");
        f34266a = c.a(a(mainLooper), "fast-main");
    }

    private static Handler a(Looper looper) {
        l.c(looper, "");
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new w("null cannot be cast to non-null type");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            l.a((Object) declaredConstructor, "");
            Object newInstance = declaredConstructor.newInstance(looper, null, true);
            l.a(newInstance, "");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
