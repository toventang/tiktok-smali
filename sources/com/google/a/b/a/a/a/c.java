package com.google.a.b.a.a.a;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.a.a.b;

public abstract class c extends b implements d {
    static {
        Covode.recordClassIndex(30843);
    }

    public c() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // com.google.a.a.b
    public final boolean a(int i2, Parcel parcel) {
        if (i2 == 1) {
            a((Bundle) com.google.a.a.c.a(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            b((Bundle) com.google.a.a.c.a(parcel, Bundle.CREATOR));
        } else if (i2 != 3) {
            return false;
        } else {
            com.google.a.a.c.a(parcel, Bundle.CREATOR);
        }
        return true;
    }
}
