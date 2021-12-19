package com.bytedance.ies.xbridge.platform.lynx.a;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f36410a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(21816);
    }

    private static WritableArray a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble((double) ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble((double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    public static final WritableMap a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            l.a((Object) next, "");
            String str = next;
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(str, a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(str, a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyMap.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyMap.putDouble(str, (double) ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyMap.putDouble(str, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyMap.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, (String) obj);
            } else {
                javaOnlyMap.putString(str, obj.toString());
            }
        }
        return javaOnlyMap;
    }
}
