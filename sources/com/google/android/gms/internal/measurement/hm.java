package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class hm implements hu {

    /* renamed from: a  reason: collision with root package name */
    private hu[] f50982a;

    static {
        Covode.recordClassIndex(31852);
    }

    hm(hu... huVarArr) {
        this.f50982a = huVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.hu
    public final boolean a(Class<?> cls) {
        for (hu huVar : this.f50982a) {
            if (huVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.hu
    public final hr b(Class<?> cls) {
        String str;
        hu[] huVarArr = this.f50982a;
        for (hu huVar : huVarArr) {
            if (huVar.a(cls)) {
                return huVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        if (valueOf.length() != 0) {
            str = "No factory is available for message type: ".concat(valueOf);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
