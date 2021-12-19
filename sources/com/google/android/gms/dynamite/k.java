package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.e.b;
import com.google.android.gms.internal.e.c;

public final class k extends b implements l {
    static {
        Covode.recordClassIndex(31503);
    }

    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
        MethodCollector.i(12961);
        MethodCollector.o(12961);
    }

    @Override // com.google.android.gms.dynamite.l
    public final a a(a aVar, String str, int i2, a aVar2) {
        MethodCollector.i(13056);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c2.writeInt(i2);
        c.a(c2, aVar2);
        Parcel a2 = a(2, c2);
        a a3 = a.AbstractBinderC1201a.a(a2.readStrongBinder());
        a2.recycle();
        MethodCollector.o(13056);
        return a3;
    }

    @Override // com.google.android.gms.dynamite.l
    public final a b(a aVar, String str, int i2, a aVar2) {
        MethodCollector.i(13144);
        Parcel c2 = c();
        c.a(c2, aVar);
        c2.writeString(str);
        c2.writeInt(i2);
        c.a(c2, aVar2);
        Parcel a2 = a(3, c2);
        a a3 = a.AbstractBinderC1201a.a(a2.readStrongBinder());
        a2.recycle();
        MethodCollector.o(13144);
        return a3;
    }
}
