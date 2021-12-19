package com.google.a.b.a.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.a.a.c;
import java.util.List;

public final class a extends com.google.a.a.a implements b {
    static {
        Covode.recordClassIndex(30841);
    }

    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
        MethodCollector.i(10418);
        MethodCollector.o(10418);
    }

    @Override // com.google.a.b.a.a.a.b
    public final void a(String str, Bundle bundle, d dVar) {
        MethodCollector.i(11867);
        Parcel a2 = a();
        a2.writeString(str);
        c.a(a2, bundle);
        c.a(a2, dVar);
        b(2, a2);
        MethodCollector.o(11867);
    }

    @Override // com.google.a.b.a.a.a.b
    public final void a(String str, List<Bundle> list, Bundle bundle, d dVar) {
        MethodCollector.i(10569);
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        c.a(a2, bundle);
        c.a(a2, dVar);
        b(1, a2);
        MethodCollector.o(10569);
    }
}
