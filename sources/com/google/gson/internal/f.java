package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;

public final class f extends Number {
    private final String value;

    static {
        Covode.recordClassIndex(34035);
    }

    public final String toString() {
        return this.value;
    }

    private Object writeReplace() {
        return new BigDecimal(this.value);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public final float floatValue() {
        return Float.parseFloat(this.value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r3.value);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        return new java.math.BigDecimal(r3.value).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r3 = this;
            java.lang.String r0 = r3.value     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r3.value     // Catch:{ NumberFormatException -> 0x000f }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r1     // Catch:{ NumberFormatException -> 0x000f }
            return r0
        L_0x000f:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r0 = r3.value
            r1.<init>(r0)
            int r0 = r1.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    public f(String str) {
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.value;
        String str2 = ((f) obj).value;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }
}
