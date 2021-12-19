package com.bytedance.sdk.xbridge.protocol.d;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f43958a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(26862);
    }

    private final JavaOnlyArray a(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (opt instanceof JSONArray) {
                javaOnlyArray.add(a((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                javaOnlyArray.add(a((JSONObject) opt));
            } else {
                javaOnlyArray.add(opt);
            }
        }
        return javaOnlyArray;
    }

    private static Number a(Number number) {
        Object obj;
        int i2;
        Object obj2;
        double d2;
        try {
            obj = q.m223constructorimpl(Integer.valueOf(number.intValue()));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Double d3 = null;
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        try {
            obj2 = q.m223constructorimpl(Double.valueOf(number.doubleValue()));
        } catch (Throwable th2) {
            obj2 = q.m223constructorimpl(r.a(th2));
        }
        if (!q.m228isFailureimpl(obj2)) {
            d3 = obj2;
        }
        Double d4 = d3;
        if (d4 != null) {
            d2 = d4.doubleValue();
        } else {
            d2 = 0.0d;
        }
        if (Double.compare((double) i2, d2) == 0) {
            return Integer.valueOf(i2);
        }
        long j2 = (long) d2;
        if (Double.compare(d2, (double) j2) == 0) {
            return Long.valueOf(j2);
        }
        return Double.valueOf(d2);
    }

    private final JSONArray a(JavaOnlyArray javaOnlyArray) {
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = javaOnlyArray.get(i2);
            try {
                ReadableType type = javaOnlyArray.getType(i2);
                if (type != null) {
                    int i3 = c.f43960b[type.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                if (obj != null) {
                                    jSONArray.put(a((Number) obj));
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            }
                        } else if (obj != null) {
                            jSONArray.put(a((JavaOnlyArray) obj));
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else if (obj != null) {
                        jSONArray.put(a((JavaOnlyMap) obj));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                jSONArray.put(obj);
            } catch (Throwable th) {
                e.a("BridgeConverter", "revertJavaOnlyArray2JSONArray ".concat(String.valueOf(th)));
            }
        }
        return jSONArray;
    }

    public final JavaOnlyMap a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                javaOnlyMap.put(next, a((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyMap.put(next, a((JSONArray) opt));
            } else {
                javaOnlyMap.put(next, opt);
            }
        }
        return javaOnlyMap;
    }

    public final JSONObject a(JavaOnlyMap javaOnlyMap) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap == null || javaOnlyMap.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return jSONObject;
        }
        ReadableMapKeySetIterator keySetIterator = javaOnlyMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = javaOnlyMap.get(nextKey);
            try {
                ReadableType type = javaOnlyMap.getType(nextKey);
                if (type != null) {
                    int i2 = c.f43959a[type.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (obj != null) {
                                    jSONObject.put(nextKey, a((Number) obj));
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            }
                        } else if (obj != null) {
                            jSONObject.putOpt(nextKey, a((JavaOnlyMap) obj));
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else if (obj != null) {
                        jSONObject.putOpt(nextKey, a((JavaOnlyArray) obj));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                jSONObject.putOpt(nextKey, obj);
            } catch (Throwable th) {
                e.a("BridgeConverter", "revertJavaOnlyMap2JSONObject ".concat(String.valueOf(th)));
            }
        }
        return jSONObject;
    }
}
