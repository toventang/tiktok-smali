package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class bx extends br<Long> {
    static {
        Covode.recordClassIndex(31690);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a2).length();
        String.valueOf(valueOf).length();
        return null;
    }

    bx(cb cbVar, String str, Long l2) {
        super(cbVar, str, l2);
    }
}
