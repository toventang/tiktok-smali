package com.bytedance.android.livesdk.ao;

import android.content.SharedPreferences;
import com.bytedance.android.live.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, Map<String, Object>> f13995a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static f f13996b = e.a.f9628b;

    private static boolean a(String str, String str2, boolean z) {
        return a(str).getBoolean(str2, z);
    }

    static {
        Covode.recordClassIndex(7767);
    }

    static SharedPreferences a(String str) {
        return com.ss.android.ugc.aweme.bf.d.a(((IHostContext) a.a(IHostContext.class)).context(), str, 0);
    }

    public static <T> T a(c<T> cVar) {
        return cVar.f13994d == Boolean.class ? (T) Boolean.valueOf(a(cVar.f13992b, cVar.f13991a, cVar.f13993c.booleanValue())) : (cVar.f13994d == Integer.class || cVar.f13994d == Short.class) ? (T) Integer.valueOf(a(cVar.f13992b, cVar.f13991a, cVar.f13993c.intValue())) : cVar.f13994d == Float.class ? (T) Float.valueOf(a(cVar.f13992b, cVar.f13991a, cVar.f13993c.floatValue())) : cVar.f13994d == Long.class ? (T) Long.valueOf(a(cVar.f13992b, cVar.f13991a, cVar.f13993c.longValue())) : cVar.f13994d == Double.class ? (T) Double.valueOf(a(cVar.f13992b, cVar.f13991a, cVar.f13993c.doubleValue())) : cVar.f13994d == String.class ? (T) a(cVar.f13992b, cVar.f13991a, cVar.f13993c) : (T) a(cVar.f13992b, cVar.f13991a, cVar.f13994d, cVar.f13993c);
    }

    private static float a(String str, String str2, float f2) {
        return a(str).getFloat(str2, f2);
    }

    private static double a(String str, String str2, double d2) {
        try {
            return Double.parseDouble(a(str).getString(str2, String.valueOf(d2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return d2;
        }
    }

    private static int a(String str, String str2, int i2) {
        return a(str).getInt(str2, i2);
    }

    private static long a(String str, String str2, long j2) {
        return a(str).getLong(str2, j2);
    }

    private static String a(String str, String str2, String str3) {
        return a(str).getString(str2, str3);
    }

    private static <T> T a(String str, String str2, Class<T> cls, T t) {
        Map<String, Object> map = f13995a.get(str);
        if (map == null) {
            map = new HashMap<>();
            f13995a.put(str, map);
        }
        try {
            if (map.containsKey(str2)) {
                return (T) map.get(str2);
            }
            T t2 = (T) f13996b.a(a(str).getString(str2, ""), (Class) cls);
            if (t2 == null) {
                map.remove(str2);
                return t;
            }
            map.put(str2, t2);
            return t2;
        } catch (Exception unused) {
            map.remove(str2);
            return t;
        }
    }
}
