package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.main.ay;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Object> f68000a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41884);
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
            if (cls.isInterface() || !ay.class.equals(cls)) {
                return null;
            }
            t = (T) f68000a.get(cls);
            if (t == null && (t instanceof t)) {
                return t;
            }
            T t2 = (T) new t(applicationContext);
            f68000a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f68000a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new t(applicationContext);
        f68000a.put(cls, t22);
        return t22;
    }
}
