package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class bz extends br<Double> {
    static {
        Covode.recordClassIndex(31692);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a2).length();
        String.valueOf(valueOf).length();
        return null;
    }

    bz(cb cbVar, String str, Double d2) {
        super(cbVar, str, d2);
    }
}
