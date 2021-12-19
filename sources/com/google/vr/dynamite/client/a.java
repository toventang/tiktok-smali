package com.google.vr.dynamite.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.a.a.c;

public final class a extends com.google.a.a.a implements ILoadedInstanceCreator {
    static {
        Covode.recordClassIndex(34130);
    }

    a(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
        MethodCollector.i(9217);
        MethodCollector.o(9217);
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader bVar;
        MethodCollector.i(9218);
        Parcel a2 = a();
        c.a(a2, iObjectWrapper);
        c.a(a2, iObjectWrapper2);
        Parcel a3 = a(1, a2);
        IBinder readStrongBinder = a3.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                bVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                bVar = new b(readStrongBinder);
            }
        }
        a3.recycle();
        MethodCollector.o(9218);
        return bVar;
    }
}
