package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p000authapi.o;

public abstract class r extends o implements o {
    static {
        Covode.recordClassIndex(31132);
    }

    public r() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.o
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            a();
        } else if (i2 != 2) {
            return false;
        } else {
            b();
        }
        return true;
    }
}
