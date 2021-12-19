package com.google.vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.a.a.a;

public final class b extends a implements INativeLibraryLoader {
    static {
        Covode.recordClassIndex(34131);
    }

    b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
        MethodCollector.i(10515);
        MethodCollector.o(10515);
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        MethodCollector.i(10672);
        Parcel a2 = a();
        a2.writeString(str);
        Parcel a3 = a(2, a2);
        int readInt = a3.readInt();
        a3.recycle();
        MethodCollector.o(10672);
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        MethodCollector.i(10671);
        Parcel a2 = a();
        a2.writeString(str);
        Parcel a3 = a(1, a2);
        long readLong = a3.readLong();
        a3.recycle();
        MethodCollector.o(10671);
        return readLong;
    }
}
