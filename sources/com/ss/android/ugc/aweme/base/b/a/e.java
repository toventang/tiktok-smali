package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Object> f68002a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41886);
    }

    public static <T> T a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c) {
            if (applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (cls.isInterface() || !com.ss.android.ugc.aweme.livewallpaper.f.e.class.equals(cls)) {
                return null;
            }
            t = (T) f68002a.get(cls);
            if (t == null && (t instanceof s)) {
                return t;
            }
            T t2 = (T) new s(applicationContext);
            f68002a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f68002a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new s(applicationContext);
        f68002a.put(cls, t22);
        return t22;
    }
}
