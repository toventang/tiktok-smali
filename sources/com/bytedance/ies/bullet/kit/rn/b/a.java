package com.bytedance.ies.bullet.kit.rn.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32380a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(19048);
    }

    public static String a(Object obj) {
        l.c(obj, "");
        if (obj instanceof List) {
            String jSONArray = a((List<? extends Object>) ((List) obj)).toString();
            l.a((Object) jSONArray, "");
            return jSONArray;
        } else if (obj instanceof Map) {
            String jSONObject = a((Map<String, ? extends Object>) ((Map) obj)).toString();
            l.a((Object) jSONObject, "");
            return jSONObject;
        } else if (!(obj instanceof Double)) {
            return obj.toString();
        } else {
            Number number = (Number) obj;
            long doubleValue = (long) number.doubleValue();
            if (Double.compare(number.doubleValue(), (double) doubleValue) == 0) {
                return String.valueOf(doubleValue);
            }
            return obj.toString();
        }
    }

    private static JSONArray a(List<? extends Object> list) {
        l.c(list, "");
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            if (t != null) {
                if (t instanceof List) {
                    jSONArray.put(a((List<? extends Object>) t));
                } else if (t instanceof Map) {
                    jSONArray.put(a((Map<String, ? extends Object>) t));
                } else if (t instanceof Double) {
                    T t2 = t;
                    long doubleValue = (long) t2.doubleValue();
                    if (Double.compare(t2.doubleValue(), (double) doubleValue) == 0) {
                        jSONArray.put(doubleValue);
                    } else {
                        jSONArray.put(t2.doubleValue());
                    }
                } else {
                    jSONArray.put(t);
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(Map<String, ? extends Object> map) {
        l.c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                if (value instanceof List) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        jSONObject.put(key, a((List<? extends Object>) ((List) value2)));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (value instanceof Map) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    if (value3 != null) {
                        jSONObject.put(key2, a((Map<String, ? extends Object>) ((Map) value3)));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (value instanceof Double) {
                    Object value4 = entry.getValue();
                    if (value4 != null) {
                        double doubleValue = ((Double) value4).doubleValue();
                        long j2 = (long) doubleValue;
                        if (Double.compare(doubleValue, (double) j2) == 0) {
                            jSONObject.put(entry.getKey(), j2);
                        } else {
                            jSONObject.put(entry.getKey(), doubleValue);
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }
}
