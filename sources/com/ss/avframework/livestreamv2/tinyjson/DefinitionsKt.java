package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONObject;

public final class DefinitionsKt {
    static {
        Covode.recordClassIndex(100473);
    }

    private static final boolean isBoolean(Class<?> cls) {
        if (l.a(cls, Boolean.TYPE) || l.a(cls, Boolean.class) || l.a(cls, Boolean.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isByte(Class<?> cls) {
        if (l.a(cls, Byte.TYPE) || l.a(cls, Byte.class) || l.a(cls, Byte.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isDouble(Class<?> cls) {
        if (l.a(cls, Double.TYPE) || l.a(cls, Double.class) || l.a(cls, Double.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isFloat(Class<?> cls) {
        if (l.a(cls, Float.TYPE) || l.a(cls, Float.class) || l.a(cls, Float.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isInt(Class<?> cls) {
        if (l.a(cls, Integer.TYPE) || l.a(cls, Integer.class) || l.a(cls, Integer.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isLong(Class<?> cls) {
        if (l.a(cls, Long.TYPE) || l.a(cls, Long.class) || l.a(cls, Long.TYPE)) {
            return true;
        }
        return false;
    }

    private static final boolean isShort(Class<?> cls) {
        if (l.a(cls, Short.TYPE) || l.a(cls, Short.class) || l.a(cls, Short.TYPE)) {
            return true;
        }
        return false;
    }

    public static final boolean isDirectType(Class<?> cls) {
        l.c(cls, "");
        if (cls.isPrimitive() || cls.isAssignableFrom(String.class) || cls.isAssignableFrom(JSONObject.class) || cls.isAssignableFrom(JSONArray.class) || l.a(cls, Boolean.class) || l.a(cls, Integer.class) || l.a(cls, Float.class) || l.a(cls, Double.class) || l.a(cls, Short.class) || l.a(cls, Byte.class)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v26, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: R */
    /* JADX DEBUG: Multi-variable search result rejected for r3v30, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (java.util.Map.class.isAssignableFrom(r4) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R smartCastAs(T r3, java.lang.Class<R> r4) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.tinyjson.DefinitionsKt.smartCastAs(java.lang.Object, java.lang.Class):java.lang.Object");
    }

    public static final void safelySet(Field field, Object obj, Object obj2) {
        l.c(field, "");
        l.c(obj, "");
        try {
            field.set(obj, obj2);
        } catch (Exception unused) {
        }
    }
}
