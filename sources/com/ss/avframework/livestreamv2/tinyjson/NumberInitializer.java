package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;

public final class NumberInitializer {
    public static final NumberInitializer INSTANCE = new NumberInitializer();
    public static final double UNDEFINED_DOUBLE_VALUE = Double.MAX_VALUE;
    public static final float UNDEFINED_FLOAT_VALUE = Float.MAX_VALUE;

    public static /* synthetic */ void isDefined$annotations(Double d2) {
    }

    public static /* synthetic */ void isDefined$annotations(Float f2) {
    }

    public static /* synthetic */ void isDefined$annotations(Integer num) {
    }

    private NumberInitializer() {
    }

    static {
        Covode.recordClassIndex(100475);
    }

    public static final boolean isDefined(Integer num) {
        if (num != null && num.intValue() == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public static final boolean isDefined(Double d2) {
        if (d2 == null || Math.abs(d2.doubleValue() - UNDEFINED_DOUBLE_VALUE) <= 1.0E-6d) {
            return false;
        }
        return true;
    }

    public static final boolean isDefined(Float f2) {
        if (f2 == null || ((double) Math.abs(f2.floatValue() - UNDEFINED_FLOAT_VALUE)) <= 1.0E-6d) {
            return false;
        }
        return true;
    }
}
