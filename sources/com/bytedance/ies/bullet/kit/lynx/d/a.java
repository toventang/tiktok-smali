package com.bytedance.ies.bullet.kit.lynx.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32339a = new a();

    private a() {
    }

    public final JSONObject a(ReadableMap readableMap) {
        l.c(readableMap, "");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(nextKey);
            if (type != null) {
                switch (b.f32340a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 2:
                        l.a((Object) nextKey, "");
                        Number a2 = a(readableMap, nextKey);
                        if (!(a2 instanceof Double)) {
                            if (!(a2 instanceof Long)) {
                                if (!(a2 instanceof Integer)) {
                                    break;
                                } else {
                                    jSONObject.put(nextKey, a2.intValue());
                                    break;
                                }
                            } else {
                                jSONObject.put(nextKey, a2.longValue());
                                break;
                            }
                        } else {
                            jSONObject.put(nextKey, a2.doubleValue());
                            continue;
                        }
                    case 3:
                        jSONObject.put(nextKey, readableMap.getLong(nextKey));
                        continue;
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableMap map = readableMap.getMap(nextKey);
                        l.a((Object) map, "");
                        jSONObject.put(nextKey, a(map));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ReadableArray array = readableMap.getArray(nextKey);
                        l.a((Object) array, "");
                        jSONObject.put(nextKey, a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONObject.put(nextKey, JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONObject;
    }

    static {
        Covode.recordClassIndex(18986);
    }

    private WritableArray a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        WritableArray a2 = com.lynx.jsbridge.a.a();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                a2.pushDouble(jSONArray.getDouble(i2));
            } else if (obj instanceof Long) {
                a2.pushDouble((double) jSONArray.getLong(i2));
            } else if (obj instanceof Number) {
                a2.pushInt(jSONArray.getInt(i2));
            } else if (obj instanceof String) {
                a2.pushString(jSONArray.getString(i2));
            } else if (obj instanceof Boolean) {
                a2.pushBoolean(jSONArray.getBoolean(i2));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                l.a((Object) jSONObject, "");
                a2.pushMap(a(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                l.a((Object) jSONArray2, "");
                a2.pushArray(a(jSONArray2));
            } else if (l.a(obj, JSONObject.NULL)) {
                a2.pushNull();
            }
        }
        l.a((Object) a2, "");
        return a2;
    }

    public final WritableMap a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        WritableMap b2 = com.lynx.jsbridge.a.b();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                Object obj = jSONObject.get(str);
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    b2.putDouble(str, jSONObject.getDouble(str));
                } else if (obj instanceof Long) {
                    b2.putDouble(str, (double) jSONObject.getLong(str));
                } else if (obj instanceof Number) {
                    b2.putInt(str, jSONObject.getInt(str));
                } else if (obj instanceof String) {
                    b2.putString(str, jSONObject.getString(str));
                } else if (obj instanceof Boolean) {
                    b2.putBoolean(str, jSONObject.getBoolean(str));
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    l.a((Object) jSONObject2, "");
                    b2.putMap(str, a(jSONObject2));
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    l.a((Object) jSONArray, "");
                    b2.putArray(str, a(jSONArray));
                } else if (l.a(obj, JSONObject.NULL)) {
                    b2.putNull(str);
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        l.a((Object) b2, "");
        return b2;
    }

    public final JSONArray a(ReadableArray readableArray) {
        l.c(readableArray, "");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableType type = readableArray.getType(i2);
            if (type != null) {
                switch (b.f32341b[type.ordinal()]) {
                    case 1:
                        jSONArray.put(readableArray.getBoolean(i2));
                        continue;
                    case 2:
                        Number a2 = a(readableArray, i2);
                        if (!(a2 instanceof Double)) {
                            if (!(a2 instanceof Long)) {
                                if (a2 instanceof Integer) {
                                    jSONArray.put(a2.intValue());
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                jSONArray.put(a2.longValue());
                                break;
                            }
                        } else {
                            jSONArray.put(a2.doubleValue());
                            continue;
                        }
                    case 3:
                        jSONArray.put(readableArray.getLong(i2));
                        continue;
                    case 4:
                        jSONArray.put(readableArray.getString(i2));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableMap map = readableArray.getMap(i2);
                        l.a((Object) map, "");
                        jSONArray.put(a(map));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ReadableArray array = readableArray.getArray(i2);
                        l.a((Object) array, "");
                        jSONArray.put(a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONArray.put(JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONArray;
    }

    private static Number a(ReadableArray readableArray, int i2) {
        Object obj;
        int i3;
        Object obj2;
        double d2;
        try {
            obj = q.m223constructorimpl(Integer.valueOf(readableArray.getInt(i2)));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Double d3 = null;
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        try {
            obj2 = q.m223constructorimpl(Double.valueOf(readableArray.getDouble(i2)));
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
        if (Double.compare((double) i3, d2) == 0) {
            return Integer.valueOf(i3);
        }
        long j2 = (long) d2;
        if (Double.compare(d2, (double) j2) == 0) {
            return Long.valueOf(j2);
        }
        return Double.valueOf(d2);
    }

    private static Number a(ReadableMap readableMap, String str) {
        Object obj;
        int i2;
        Object obj2;
        double d2;
        try {
            obj = q.m223constructorimpl(Integer.valueOf(readableMap.getInt(str)));
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
            obj2 = q.m223constructorimpl(Double.valueOf(readableMap.getDouble(str)));
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
}
