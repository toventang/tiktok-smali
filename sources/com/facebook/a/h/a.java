package com.facebook.a.h;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f46824a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<C1162a> f46825b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f46826c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    private static final String f46827d = a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28518);
    }

    public static String a(String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            if (!f46824a || !b(str)) {
                return str;
            }
            return "_removed_";
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static boolean b(String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            return f46826c.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    /* renamed from: com.facebook.a.h.a$a  reason: collision with other inner class name */
    public static class C1162a {

        /* renamed from: a  reason: collision with root package name */
        public String f46828a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f46829b;

        static {
            Covode.recordClassIndex(28519);
        }

        public C1162a(String str, Map<String, String> map) {
            this.f46828a = str;
            this.f46829b = map;
        }
    }

    private static String a(String str, String str2) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            for (C1162a aVar : new ArrayList(f46825b)) {
                if (aVar != null && str.equals(aVar.f46828a)) {
                    for (String str3 : aVar.f46829b.keySet()) {
                        if (str2.equals(str3)) {
                            return aVar.f46829b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
        }
        return null;
    }

    public static void a(Map<String, String> map, String str) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (f46824a) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String a2 = a(str, str2);
                        if (a2 != null) {
                            hashMap.put(str2, a2);
                            map.remove(str2);
                        }
                    }
                    if (hashMap.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }
}
