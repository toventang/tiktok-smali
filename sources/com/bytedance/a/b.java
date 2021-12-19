package com.bytedance.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f6416a = 5000;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f6417b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, Integer> f6418c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static a f6419d;

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, Integer> f6420e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, c> f6421f = new HashMap();

    static {
        Covode.recordClassIndex(3092);
    }

    public static void a() {
        if (f6417b && f6421f.size() > 0) {
            for (c cVar : f6421f.values()) {
                cVar.f6429f = 2;
                cVar.f6431h = 2;
                cVar.f6430g = System.currentTimeMillis() - cVar.f6428e;
                b(cVar);
            }
            f6421f.clear();
        }
    }

    private static void a(c cVar) {
        String str;
        String str2;
        if (f6417b) {
            b(cVar);
            if (TextUtils.isEmpty(cVar.f6425b)) {
                str = cVar.f6424a;
            } else {
                str = cVar.f6425b;
            }
            f6421f.remove(str);
            if (f6421f.size() > 0) {
                for (c cVar2 : f6421f.values()) {
                    if (System.currentTimeMillis() - cVar2.f6428e > f6416a) {
                        cVar2.f6429f = 3;
                        cVar2.f6430g = System.currentTimeMillis() - cVar2.f6428e;
                        b(cVar);
                        if (TextUtils.isEmpty(cVar2.f6425b)) {
                            str2 = cVar2.f6424a;
                        } else {
                            str2 = cVar2.f6425b;
                        }
                        f6421f.remove(str2);
                    }
                }
            }
        }
    }

    private static void b(c cVar) {
        if (f6419d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", cVar.f6424a);
                jSONObject.put("sub_scene", cVar.f6425b);
                jSONObject.put("duration", cVar.f6430g);
                jSONObject.put("status", cVar.f6429f);
                jSONObject.put("is_first", cVar.f6426c);
                if (cVar.f6427d >= 0) {
                    jSONObject.put("pull_type", cVar.f6427d);
                }
                if (cVar.f6431h >= 0) {
                    jSONObject.put("reason", cVar.f6431h);
                }
                if (cVar.f6432i >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", cVar.f6432i);
                    jSONObject.put("net_info", jSONObject2);
                }
                if (cVar.f6433j != null) {
                    jSONObject.put("scene_info", cVar.f6433j);
                }
                f6419d.a("net_quality", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static void b(String str, String str2) {
        if (f6417b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            c cVar = f6421f.get(str);
            if (cVar != null) {
                cVar.f6429f = 0;
                cVar.f6430g = System.currentTimeMillis() - cVar.f6428e;
                cVar.f6433j = null;
                a(cVar);
            }
        }
    }

    public static void c(String str, String str2) {
        if (f6417b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            c cVar = f6421f.get(str);
            if (cVar != null) {
                cVar.f6429f = 2;
                cVar.f6430g = System.currentTimeMillis() - cVar.f6428e;
                cVar.f6431h = 1;
                cVar.f6433j = null;
                a(cVar);
            }
        }
    }

    private static boolean d(String str, String str2) {
        String str3 = str + str2;
        Integer num = f6418c.get(str3);
        if (num == null || num.intValue() <= 0) {
            return true;
        }
        Integer num2 = f6420e.get(str3);
        if (num2 == null) {
            num2 = 0;
        }
        Map<String, Integer> map = f6420e;
        Integer valueOf = Integer.valueOf(num2.intValue() + 1);
        map.put(str3, valueOf);
        if (valueOf.intValue() <= num.intValue()) {
            return true;
        }
        return false;
    }

    public static void a(String str, String str2) {
        String str3;
        if (f6417b && d(str, str2)) {
            if (TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            if (f6421f.get(str3) == null) {
                c cVar = new c();
                cVar.f6424a = str;
                cVar.f6425b = str2;
                cVar.f6428e = System.currentTimeMillis();
                f6421f.put(str3, cVar);
            }
        }
    }

    public static void b(String str, String str2, int i2) {
        String str3;
        if (f6417b && d(str, str2)) {
            if (TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            if (f6421f.get(str3) == null) {
                c cVar = new c();
                cVar.f6424a = str;
                cVar.f6425b = str2;
                cVar.f6427d = -1;
                cVar.f6426c = i2;
                cVar.f6428e = System.currentTimeMillis();
                f6421f.put(str3, cVar);
            }
        }
    }

    public static void a(String str, String str2, int i2) {
        if (f6417b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            c cVar = f6421f.get(str);
            if (cVar != null) {
                cVar.f6430g = System.currentTimeMillis() - cVar.f6428e;
                cVar.f6429f = 1;
                cVar.f6431h = 1;
                cVar.f6432i = i2;
                cVar.f6433j = null;
                a(cVar);
            }
        }
    }
}
