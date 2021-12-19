package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.e.c;

public interface n extends IInterface {
    static {
        Covode.recordClassIndex(31412);
    }

    void a(int i2, Bundle bundle);

    void a(int i2, IBinder iBinder, Bundle bundle);

    void a(int i2, IBinder iBinder, zza zza);

    public static abstract class a extends com.google.android.gms.internal.e.a implements n {
        static {
            Covode.recordClassIndex(31413);
        }

        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // com.google.android.gms.internal.e.a
        public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                a(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (zza) c.a(parcel, zza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
