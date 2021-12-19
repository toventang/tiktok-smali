package com.facebook.a.d;

import com.bytedance.covode.number.Covode;
import com.facebook.a.f.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f46693a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f46694b;

    static {
        Covode.recordClassIndex(28456);
    }

    private static boolean a(String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            if (!"none".equals(b(str))) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    private static String b(String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] a2 = c.a(c.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (a2 == null) {
                return "none";
            }
            return a2[0];
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    public static void a(Map<String, String> map) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (!f46693a) {
                    return;
                }
                if (map.size() != 0) {
                    try {
                        ArrayList<String> arrayList = new ArrayList(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : arrayList) {
                            String str2 = map.get(str);
                            if (a(str) || a(str2)) {
                                map.remove(str);
                                if (!f46694b) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            }
                        }
                        if (jSONObject.length() != 0) {
                            map.put("_onDeviceParams", jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }
}
