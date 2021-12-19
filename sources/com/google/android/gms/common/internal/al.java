package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.e.a;
import com.google.android.gms.internal.e.c;

public abstract class al extends a implements aj {
    static {
        Covode.recordClassIndex(31376);
    }

    public al() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.e.a
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            com.google.android.gms.a.a a2 = a();
            parcel2.writeNoException();
            c.a(parcel2, a2);
        } else if (i2 != 2) {
            return false;
        } else {
            int b2 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b2);
        }
        return true;
    }
}
