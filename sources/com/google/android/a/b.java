package com.google.android.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(30846);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i2, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        MethodCollector.i(2092);
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            MethodCollector.o(2092);
            return true;
        }
        boolean a2 = a(i2, parcel, parcel2);
        MethodCollector.o(2092);
        return a2;
    }
}
