package com.bytedance.assem.arch.viewModel;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Constructor;

public final class a {
    static {
        Covode.recordClassIndex(14969);
    }

    public static final Handler a(Looper looper) {
        l.c(looper, "");
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 28) {
            Handler createAsync = Handler.createAsync(looper);
            l.a((Object) createAsync, "");
            return createAsync;
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
