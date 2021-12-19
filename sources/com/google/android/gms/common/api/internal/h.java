package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.d.c;

public interface h extends IInterface {
    static {
        Covode.recordClassIndex(31308);
    }

    void a(Status status);

    public static abstract class a extends com.google.android.gms.internal.d.a implements h {
        static {
            Covode.recordClassIndex(31309);
        }

        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.d.a
        public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 1) {
                return false;
            }
            a((Status) c.a(parcel, Status.CREATOR));
            return true;
        }
    }
}
