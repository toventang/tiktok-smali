package com.ss.android.ugc.aweme.settingsrequest.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.d;
import com.bytedance.ies.abmock.datacenter.c.e;
import com.bytedance.ies.abmock.f;
import com.google.gson.o;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123177a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80904);
    }

    private static String a() {
        Map<String, ConfigItem> map = f.f31846a;
        l.b(map, "");
        o oVar = new o();
        if (map != null) {
            for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                a(oVar, entry.getKey(), a(entry.getKey()));
            }
        }
        Map<String, Object> map2 = d.f31798a;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                String key = entry2.getKey();
                l.b(key, "");
                a(oVar, key, entry2.getValue());
            }
        }
        e eVar = e.f31819a;
        l.b(eVar, "");
        Set<String> b2 = eVar.b();
        if (b2 != null) {
            for (T t : b2) {
                l.b(t, "");
                a(oVar, t, e.f31819a.a((String) t));
            }
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }

    public static Object a(String str) {
        l.d(str, "");
        com.bytedance.ies.abmock.e.a();
        return com.bytedance.ies.abmock.e.b(str, false);
    }

    public static Map<String, Object> a(List<String> list) {
        l.d(list, "");
        try {
            if (list.isEmpty()) {
                Map<String, ConfigItem> map = f.f31846a;
                l.b(map, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), a(entry.getKey()));
                    }
                }
                Map<String, Object> map2 = d.f31798a;
                if (map2 != null) {
                    for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                        String key = entry2.getKey();
                        l.b(key, "");
                        linkedHashMap.put(key, entry2.getValue());
                    }
                }
                e eVar = e.f31819a;
                l.b(eVar, "");
                Set<String> b2 = eVar.b();
                if (b2 == null) {
                    return linkedHashMap;
                }
                for (T t : b2) {
                    l.b(t, "");
                    linkedHashMap.put(t, e.f31819a.a((String) t));
                }
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t2 : list) {
                linkedHashMap2.put(t2, a((String) t2));
            }
            return linkedHashMap2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new LinkedHashMap();
        }
    }

    public static void a(o oVar, String str, Object obj) {
        l.d(oVar, "");
        l.d(str, "");
        if (obj instanceof Number) {
            oVar.a(str, (Number) obj);
        } else if (obj instanceof Boolean) {
            oVar.a(str, (Boolean) obj);
        } else if (obj instanceof String) {
            oVar.a(str, (String) obj);
        } else if (obj instanceof Character) {
            oVar.a(str, (Character) obj);
        } else if (obj instanceof com.google.gson.l) {
            oVar.a(str, (com.google.gson.l) obj);
        } else if (obj == null) {
            oVar.a(str, (com.google.gson.l) null);
        }
    }

    public static void a(JSONObject jSONObject, b<? super String, z> bVar, b<? super Exception, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("ab_test_names");
                if (optJSONArray != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String optString = optJSONArray.optString(i2);
                        l.b(optString, "");
                        jSONObject2.put(optString, a(optString));
                    }
                    String jSONObject3 = jSONObject2.toString();
                    l.b(jSONObject3, "");
                    bVar.invoke(jSONObject3);
                    return;
                }
            } catch (Exception e2) {
                bVar2.invoke(e2);
                e2.printStackTrace();
                return;
            }
        }
        bVar.invoke(a());
    }
}
