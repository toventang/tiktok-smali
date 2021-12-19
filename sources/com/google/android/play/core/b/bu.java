package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bu extends br implements bv {
    static {
        Covode.recordClassIndex(32829);
    }

    public bu(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        MethodCollector.i(8159);
        MethodCollector.o(8159);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.bx */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.bv
    public final void a(String str, Bundle bundle, bx bxVar) {
        MethodCollector.i(8223);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        a2.writeStrongBinder(bxVar);
        a(2, a2);
        MethodCollector.o(8223);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.bx */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.bv
    public final void b(String str, Bundle bundle, bx bxVar) {
        MethodCollector.i(8229);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        a2.writeStrongBinder(bxVar);
        a(3, a2);
        MethodCollector.o(8229);
    }
}
