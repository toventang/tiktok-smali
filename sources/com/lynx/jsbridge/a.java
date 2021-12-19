package com.lynx.jsbridge;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.List;
import java.util.Map;

public class a {
    static {
        Covode.recordClassIndex(34755);
    }

    public static WritableArray a() {
        return new JavaOnlyArray();
    }

    public static WritableMap b() {
        return new JavaOnlyMap();
    }

    public static JavaOnlyMap a(Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (map == null) {
            return javaOnlyMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            a(javaOnlyMap, entry.getKey(), entry.getValue());
        }
        return javaOnlyMap;
    }

    private static Object a(final Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return a((List) new AbstractList() {
                /* class com.lynx.jsbridge.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34756);
                }

                public final int size() {
                    return Array.getLength(obj);
                }

                @Override // java.util.List, java.util.AbstractList
                public final Object get(int i2) {
                    return Array.get(obj, i2);
                }
            });
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Map) {
            return a((Map<String, Object>) ((Map) obj));
        }
        if (!(obj instanceof Bundle)) {
            return obj;
        }
        Bundle bundle = (Bundle) obj;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(javaOnlyMap, str, a(bundle, str));
            }
        }
        return javaOnlyMap;
    }

    private static JavaOnlyArray a(List list) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (list == null) {
            return javaOnlyArray;
        }
        for (Object obj : list) {
            Object a2 = a(obj);
            if (a2 == null) {
                javaOnlyArray.pushNull();
            } else if (a2 instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) a2).booleanValue());
            } else if (a2 instanceof Integer) {
                javaOnlyArray.pushInt(((Integer) a2).intValue());
            } else if (a2 instanceof Double) {
                javaOnlyArray.pushDouble(((Double) a2).doubleValue());
            } else if (a2 instanceof String) {
                javaOnlyArray.pushString((String) a2);
            } else if (a2 instanceof JavaOnlyArray) {
                javaOnlyArray.pushArray((JavaOnlyArray) a2);
            } else if (a2 instanceof JavaOnlyMap) {
                javaOnlyArray.pushMap((JavaOnlyMap) a2);
            } else {
                throw new IllegalArgumentException("Could not convert " + a2.getClass());
            }
        }
        return javaOnlyArray;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static void a(JavaOnlyMap javaOnlyMap, String str, Object obj) {
        Object a2 = a(obj);
        if (a2 == null) {
            javaOnlyMap.putNull(str);
        } else if (a2 instanceof Boolean) {
            javaOnlyMap.putBoolean(str, ((Boolean) a2).booleanValue());
        } else if (a2 instanceof Integer) {
            javaOnlyMap.putInt(str, ((Integer) a2).intValue());
        } else if (a2 instanceof Number) {
            javaOnlyMap.putDouble(str, ((Number) a2).doubleValue());
        } else if (a2 instanceof String) {
            javaOnlyMap.putString(str, (String) a2);
        } else if (a2 instanceof JavaOnlyArray) {
            javaOnlyMap.putArray(str, (JavaOnlyArray) a2);
        } else if (a2 instanceof JavaOnlyMap) {
            javaOnlyMap.putMap(str, (JavaOnlyMap) a2);
        } else {
            throw new IllegalArgumentException("Could not convert " + a2.getClass());
        }
    }
}
