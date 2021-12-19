package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;

final class gj implements hu {

    /* renamed from: a  reason: collision with root package name */
    static final gj f50932a = new gj();

    private gj() {
    }

    static {
        Covode.recordClassIndex(31817);
    }

    @Override // com.google.android.gms.internal.measurement.hu
    public final boolean a(Class<?> cls) {
        return gm.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.hu
    public final hr b(Class<?> cls) {
        String str;
        String str2;
        if (!gm.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            if (valueOf.length() != 0) {
                str2 = "Unsupported message type: ".concat(valueOf);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (hr) gm.a(cls.asSubclass(gm.class)).a(gm.e.f50943c);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            if (valueOf2.length() != 0) {
                str = "Unable to get message info for ".concat(valueOf2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e2);
        }
    }
}
