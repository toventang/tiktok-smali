package com.ss.android.ugc.aweme.ecommercelive.framework.d.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f88026a = new a(d.f88038a);

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.android.b f88027b;

    /* renamed from: c  reason: collision with root package name */
    private static final a f88028c = new a(d.f88038a);

    /* renamed from: d  reason: collision with root package name */
    private static final a f88029d = new a(d.f88040c);

    /* renamed from: e  reason: collision with root package name */
    private static final a f88030e = new a(d.f88039b);

    /* renamed from: f  reason: collision with root package name */
    private static final a f88031f = new a(d.f88041d);

    static {
        Covode.recordClassIndex(55336);
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        f88027b = c.a(a(mainLooper), "fast-main");
    }

    private static Handler a(Looper looper) {
        l.d(looper, "");
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Handler createAsync = Handler.createAsync(looper);
            l.b(createAsync, "");
            return createAsync;
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
