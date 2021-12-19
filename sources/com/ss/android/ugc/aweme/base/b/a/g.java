package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.notice.api.d.b;
import com.ss.android.ugc.aweme.notice.api.d.c;
import com.ss.android.ugc.aweme.notice.api.d.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Object> f68004a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41888);
    }

    public static <T> T a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c) {
            if (applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (cls == null && cls.isInterface()) {
                if (com.ss.android.ugc.aweme.notice.api.d.a.class.equals(cls)) {
                    T t = (T) f68004a.get(cls);
                    if (t != null && (t instanceof v)) {
                        return t;
                    }
                    T t2 = (T) new v(applicationContext);
                    f68004a.put(cls, t2);
                    return t2;
                } else if (b.class.equals(cls)) {
                    T t3 = (T) f68004a.get(cls);
                    if (t3 != null && (t3 instanceof w)) {
                        return t3;
                    }
                    T t4 = (T) new w(applicationContext);
                    f68004a.put(cls, t4);
                    return t4;
                } else if (e.class.equals(cls)) {
                    T t5 = (T) f68004a.get(cls);
                    if (t5 != null && (t5 instanceof y)) {
                        return t5;
                    }
                    T t6 = (T) new y(applicationContext);
                    f68004a.put(cls, t6);
                    return t6;
                } else if (!c.class.equals(cls)) {
                    return null;
                } else {
                    T t7 = (T) f68004a.get(cls);
                    if (t7 != null && (t7 instanceof x)) {
                        return t7;
                    }
                    T t8 = (T) new x(applicationContext);
                    f68004a.put(cls, t8);
                    return t8;
                }
            }
        }
        if (applicationContext == null) {
            return null;
        }
        return cls == null ? null : null;
    }
}
