package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class Defaults {
    private static final Double DOUBLE_DEFAULT = Double.valueOf(0.0d);
    private static final Float FLOAT_DEFAULT = Float.valueOf(0.0f);

    private Defaults() {
    }

    static {
        Covode.recordClassIndex(61347);
    }

    public static <T> T requireNonNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T defaultValue(Class<T> cls) {
        requireNonNull(cls);
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) FLOAT_DEFAULT;
        }
        if (cls == Double.TYPE) {
            return (T) DOUBLE_DEFAULT;
        }
        return null;
    }
}
