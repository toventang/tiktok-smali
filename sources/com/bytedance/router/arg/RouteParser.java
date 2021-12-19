package com.bytedance.router.arg;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.l;

public final class RouteParser {
    public static final RouteParser INSTANCE = new RouteParser();

    private RouteParser() {
    }

    static {
        Covode.recordClassIndex(26171);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T parse(Object obj, Class<T> cls) {
        Number number;
        String str;
        l.c(cls, "");
        if (obj == 0) {
            return null;
        }
        try {
            if (!(obj instanceof Number)) {
                number = null;
            } else {
                number = obj;
            }
            if (number != null) {
                if (!l.a(cls, String.class)) {
                    if (l.a(cls, Integer.class)) {
                        return (T) Integer.valueOf(((Number) obj).intValue());
                    }
                    if (l.a(cls, Short.class)) {
                        return (T) Short.valueOf(((Number) obj).shortValue());
                    }
                    if (l.a(cls, Long.class)) {
                        return (T) Long.valueOf(((Number) obj).longValue());
                    }
                    if (l.a(cls, Float.class)) {
                        return (T) Float.valueOf(((Number) obj).floatValue());
                    }
                    if (l.a(cls, Double.class)) {
                        return (T) Double.valueOf(((Number) obj).doubleValue());
                    }
                    if (l.a(cls, Byte.class)) {
                        return (T) Byte.valueOf(((Number) obj).byteValue());
                    }
                }
                return (T) ((Number) obj);
            }
            if (!(obj instanceof String)) {
                str = null;
            } else {
                str = obj;
            }
            if (str != null) {
                if (l.a(cls, String.class)) {
                    return obj;
                }
                if (l.a(cls, Integer.class)) {
                    return (T) Integer.valueOf(Integer.parseInt((String) obj));
                }
                if (l.a(cls, Boolean.class)) {
                    return (T) Boolean.valueOf(Boolean.parseBoolean((String) obj));
                }
                if (l.a(cls, Short.class)) {
                    return (T) Short.valueOf(Short.parseShort((String) obj));
                }
                if (l.a(cls, Long.class)) {
                    return (T) Long.valueOf(Long.parseLong((String) obj));
                }
                if (l.a(cls, Float.class)) {
                    return (T) Float.valueOf(Float.parseFloat((String) obj));
                }
                if (l.a(cls, Double.class)) {
                    return (T) Double.valueOf(Double.parseDouble((String) obj));
                }
                if (l.a(cls, Byte.class)) {
                    return (T) Byte.valueOf(Byte.parseByte((String) obj));
                }
                try {
                    return (T) new f().a((String) obj, (Class) cls);
                } catch (Throwable unused) {
                    return null;
                }
            }
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
