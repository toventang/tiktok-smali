package com.google.android.play.core.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class bs extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(32827);
    }

    protected bs(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i2, Parcel parcel) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean a2;
        MethodCollector.i(8290);
        if (i2 > 16777215) {
            if (super.onTransact(i2, parcel, parcel2, i3)) {
                a2 = true;
            }
            a2 = a(i2, parcel);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            a2 = a(i2, parcel);
        }
        MethodCollector.o(8290);
        return a2;
    }
}
