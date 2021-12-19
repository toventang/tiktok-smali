package com.google.android.gms.internal.p000authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.auth-api.o  reason: invalid package */
public class o extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31528);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i2, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public o(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        MethodCollector.i(2400);
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            MethodCollector.o(2400);
            return true;
        }
        boolean a2 = a(i2, parcel, parcel2);
        MethodCollector.o(2400);
        return a2;
    }
}
