package com.bytedance.android.livesdk.lynx.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import h.f.b.l;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(11103);
    }

    private static WritableArray a(JSONArray jSONArray) {
        l.d(jSONArray, "");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyArray.pushDouble(jSONArray.getDouble(i2));
            } else if (obj instanceof Number) {
                javaOnlyArray.pushLong(jSONArray.getLong(i2));
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(jSONArray.getString(i2));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(jSONArray.getBoolean(i2));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                l.b(jSONObject, "");
                javaOnlyArray.pushMap(a(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                l.b(jSONArray2, "");
                javaOnlyArray.pushArray(a(jSONArray2));
            } else if (l.a(obj, JSONObject.NULL)) {
                javaOnlyArray.pushNull();
            }
        }
        l.b(javaOnlyArray, "");
        return javaOnlyArray;
    }

    public static final WritableMap a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Objects.requireNonNull(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            Object obj = jSONObject.get(str);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyMap.putDouble(str, jSONObject.getDouble(str));
            } else if (obj instanceof Number) {
                javaOnlyMap.putLong(str, jSONObject.getLong(str));
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, jSONObject.getString(str));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, jSONObject.getBoolean(str));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                l.b(jSONObject2, "");
                javaOnlyMap.putMap(str, a(jSONObject2));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                l.b(jSONArray, "");
                javaOnlyMap.putArray(str, a(jSONArray));
            } else if (l.a(obj, JSONObject.NULL)) {
                javaOnlyMap.putNull(str);
            }
        }
        l.b(javaOnlyMap, "");
        return javaOnlyMap;
    }

    private static JSONArray a(ReadableArray readableArray) {
        l.d(readableArray, "");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableType type = readableArray.getType(i2);
            if (type != null) {
                switch (b.f18762b[type.ordinal()]) {
                    case 1:
                        jSONArray.put(readableArray.getBoolean(i2));
                        continue;
                    case 2:
                        try {
                            jSONArray.put(readableArray.getLong(i2));
                            continue;
                        } catch (Exception unused) {
                            jSONArray.put(readableArray.getDouble(i2));
                            break;
                        }
                    case 3:
                        jSONArray.put(readableArray.getString(i2));
                        continue;
                    case 4:
                        ReadableMap map = readableArray.getMap(i2);
                        l.b(map, "");
                        jSONArray.put(a(map));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableArray array = readableArray.getArray(i2);
                        l.b(array, "");
                        jSONArray.put(a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        jSONArray.put(readableArray.getInt(i2));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONArray.put(readableArray.getLong(i2));
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        jSONArray.put(JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONArray;
    }

    public static final JSONObject a(ReadableMap readableMap) {
        l.d(readableMap, "");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(nextKey);
            if (type != null) {
                switch (b.f18761a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 2:
                        try {
                            jSONObject.put(nextKey, readableMap.getLong(nextKey));
                            continue;
                        } catch (Exception unused) {
                            jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                            break;
                        }
                    case 3:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case 4:
                        ReadableMap map = readableMap.getMap(nextKey);
                        l.b(map, "");
                        jSONObject.put(nextKey, a(map));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableArray array = readableMap.getArray(nextKey);
                        l.b(array, "");
                        jSONObject.put(nextKey, a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        jSONObject.put(nextKey, JSONObject.NULL);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        jSONObject.put(nextKey, readableMap.getLong(nextKey));
                        continue;
                }
            }
        }
        return jSONObject;
    }
}
