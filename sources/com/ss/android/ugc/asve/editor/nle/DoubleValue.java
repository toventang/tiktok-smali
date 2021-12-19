package com.ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;

public final class DoubleValue {
    private final double value;

    static {
        Covode.recordClassIndex(38139);
    }

    public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = doubleValue.value;
        }
        return doubleValue.copy(d2);
    }

    public final double component1() {
        return this.value;
    }

    public final DoubleValue copy(double d2) {
        return new DoubleValue(d2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "DoubleValue(value=" + this.value + ")";
    }

    public final double getValue() {
        return this.value;
    }

    public DoubleValue(double d2) {
        this.value = d2;
    }
}
