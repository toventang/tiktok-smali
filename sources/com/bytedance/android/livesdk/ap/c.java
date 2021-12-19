package com.bytedance.android.livesdk.ap;

import android.content.SharedPreferences;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static f f14020a = e.a.f9628b;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f14021b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Object> f14022c = new HashMap();

    static {
        Covode.recordClassIndex(7772);
    }

    private static SharedPreferences a() {
        if (f14021b == null) {
            f14021b = d.a(y.e(), "live_sdk_core", 4);
        }
        return f14021b;
    }

    public static <T> T a(com.bytedance.android.livesdk.ao.c<T> cVar) {
        if (f14022c.containsKey(cVar.f13991a)) {
            return (T) f14022c.get(cVar.f13991a);
        }
        if (cVar.f13994d == Boolean.class) {
            T t = (T) Boolean.valueOf(a().getBoolean(cVar.f13991a, cVar.f13993c.booleanValue()));
            f14022c.put(cVar.f13991a, t);
            return t;
        } else if (cVar.f13994d == Integer.class || cVar.f13994d == Short.class) {
            T t2 = (T) Integer.valueOf(a().getInt(cVar.f13991a, cVar.f13993c.intValue()));
            f14022c.put(cVar.f13991a, t2);
            return t2;
        } else if (cVar.f13994d == Float.class) {
            T t3 = (T) Float.valueOf(a().getFloat(cVar.f13991a, cVar.f13993c.floatValue()));
            f14022c.put(cVar.f13991a, t3);
            return t3;
        } else if (cVar.f13994d == Long.class) {
            T t4 = (T) Long.valueOf(a().getLong(cVar.f13991a, cVar.f13993c.longValue()));
            f14022c.put(cVar.f13991a, t4);
            return t4;
        } else if (cVar.f13994d == Double.class) {
            T t5 = (T) Double.valueOf(a(cVar.f13991a, cVar.f13993c.doubleValue()));
            f14022c.put(cVar.f13991a, t5);
            return t5;
        } else if (cVar.f13994d != String.class) {
            return (T) a(cVar.f13991a, cVar.f13994d, cVar.f13993c);
        } else {
            T t6 = (T) a().getString(cVar.f13991a, cVar.f13993c);
            if (t6 == null) {
                f14022c.remove(cVar.f13991a);
            } else {
                f14022c.put(cVar.f13991a, t6);
            }
            return t6;
        }
    }

    private static double a(String str, double d2) {
        try {
            return Double.parseDouble(a().getString(str, String.valueOf(d2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return d2;
        }
    }

    public static <T> void a(com.bytedance.android.livesdk.ao.c cVar, T t) {
        if (t == null) {
            f14022c.remove(cVar.f13991a);
            a().edit().remove(cVar.f13991a).apply();
            return;
        }
        f14022c.put(cVar.f13991a, t);
        if (cVar.f13994d == Boolean.class) {
            a().edit().putBoolean(cVar.f13991a, t.booleanValue()).apply();
        } else if (cVar.f13994d == Integer.class) {
            a().edit().putInt(cVar.f13991a, t.intValue()).apply();
        } else if (cVar.f13994d == Float.class) {
            a().edit().putFloat(cVar.f13991a, t.floatValue()).apply();
        } else if (cVar.f13994d == Long.class) {
            a().edit().putLong(cVar.f13991a, t.longValue()).apply();
        } else if (cVar.f13994d == Double.class) {
            a().edit().putString(cVar.f13991a, t.toString()).apply();
        } else if (cVar.f13994d == String.class) {
            a().edit().putString(cVar.f13991a, t).apply();
        } else {
            a().edit().putString(cVar.f13991a, f14020a.b(t)).apply();
        }
    }

    private static <T> T a(String str, Class<T> cls, T t) {
        try {
            if (f14022c.containsKey(str)) {
                return (T) f14022c.get(str);
            }
            T t2 = (T) f14020a.a(a().getString(str, ""), (Class) cls);
            if (t2 == null) {
                f14022c.remove(str);
            } else {
                f14022c.put(str, t2);
            }
            return t2;
        } catch (Exception e2) {
            e2.printStackTrace();
            f14022c.remove(str);
            return t;
        }
    }
}
