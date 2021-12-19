package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.e.b;
import com.google.android.gms.internal.e.c;

public final class i extends b implements j {
    static {
        Covode.recordClassIndex(31501);
    }

    @Override // com.google.android.gms.dynamite.j
    public final int a() {
        MethodCollector.i(11626);
        Parcel a2 = a(6, c());
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.o(11626);
        return readInt;
    }

    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
        MethodCollector.i(10812);
        MethodCollector.o(10812);
    }

    @Override // com.google.android.gms.dynamite.j
    public final int a(a aVar, String str, boolean z) {
        MethodCollector.i(11144);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c.a(c2, z);
        Parcel a2 = a(3, c2);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.o(11144);
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final int b(a aVar, String str, boolean z) {
        MethodCollector.i(11453);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c.a(c2, z);
        Parcel a2 = a(5, c2);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.o(11453);
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final a a(a aVar, String str, int i2) {
        MethodCollector.i(10978);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c2.writeInt(i2);
        Parcel a2 = a(2, c2);
        a a3 = a.AbstractBinderC1201a.a(a2.readStrongBinder());
        a2.recycle();
        MethodCollector.o(10978);
        return a3;
    }

    @Override // com.google.android.gms.dynamite.j
    public final a b(a aVar, String str, int i2) {
        MethodCollector.i(11301);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c2.writeInt(i2);
        Parcel a2 = a(4, c2);
        a a3 = a.AbstractBinderC1201a.a(a2.readStrongBinder());
        a2.recycle();
        MethodCollector.o(11301);
        return a3;
    }
}
