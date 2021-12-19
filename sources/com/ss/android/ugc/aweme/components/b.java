package com.ss.android.ugc.aweme.components;

import com.bytedance.covode.number.Covode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(48427);
    }

    public static WritableMap a(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            Object value = next.getValue();
            if (value == null) {
                createMap.putNull(next.getKey());
            } else if (value instanceof Boolean) {
                createMap.putBoolean(next.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                createMap.putDouble(next.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                createMap.putInt(next.getKey(), ((Integer) value).intValue());
            } else if (value instanceof String) {
                createMap.putString(next.getKey(), (String) value);
            } else if (value instanceof Map) {
                createMap.putMap(next.getKey(), a((Map) value));
            } else if (value.getClass() != null && value.getClass().isArray()) {
                createMap.putArray(next.getKey(), a.a((Object[]) value));
            }
            it.remove();
        }
        return createMap;
    }
}
