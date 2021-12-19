package com.bytedance.ies.xbridge.platform.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36390a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(21798);
    }

    public static List<Object> a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i2)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i2)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i2));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                l.a((Object) optJSONObject, "");
                arrayList.add(a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i2);
                l.a((Object) optJSONArray, "");
                arrayList.add(a(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i2)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                l.a((Object) next, "");
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                l.a((Object) next, "");
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                l.a((Object) optJSONObject, "");
                linkedHashMap.put(next, a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                l.a((Object) next, "");
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                l.a((Object) optJSONArray, "");
                linkedHashMap.put(next, a(optJSONArray));
            } else if (opt instanceof Boolean) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                l.a((Object) next, "");
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }

    private static JSONArray a(List<? extends Object> list) {
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            if (t instanceof Float) {
                jSONArray.put((double) t.floatValue());
            } else if (t instanceof Long) {
                jSONArray.put((double) t.longValue());
            } else if (t instanceof Integer) {
                jSONArray.put(t.intValue());
            } else if (t instanceof Double) {
                jSONArray.put(t.doubleValue());
            } else if (t instanceof String) {
                jSONArray.put(t);
            } else if (t instanceof Boolean) {
                jSONArray.put(t.booleanValue());
            } else if (t instanceof Map) {
                if (t != null) {
                    try {
                        jSONArray.put(a((Map<String, ? extends Object>) t));
                    } catch (Exception unused) {
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (!(t instanceof List)) {
                continue;
            } else if (t != null) {
                jSONArray.put(a((List<? extends Object>) t));
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        return jSONArray;
    }

    public static JSONObject a(Map<String, ? extends Object> map) {
        l.c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(key, (double) ((Number) value).longValue());
            } else if (value instanceof Float) {
                jSONObject.put(key, (double) ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(key, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                try {
                    jSONObject.put(key, a((Map) value));
                } catch (Exception unused) {
                }
            } else if (value instanceof List) {
                jSONObject.put(key, a((List) value));
            }
        }
        return jSONObject;
    }
}
