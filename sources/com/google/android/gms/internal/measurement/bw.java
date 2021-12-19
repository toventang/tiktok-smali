package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class bw extends br<Boolean> {
    static {
        Covode.recordClassIndex(31689);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.br
    public final /* synthetic */ Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (bb.f50682b.matcher(str).matches()) {
                return true;
            }
            if (bb.f50683c.matcher(str).matches()) {
                return false;
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a2).length();
        String.valueOf(valueOf).length();
        return null;
    }

    bw(cb cbVar, String str, Boolean bool) {
        super(cbVar, str, bool);
    }
}
