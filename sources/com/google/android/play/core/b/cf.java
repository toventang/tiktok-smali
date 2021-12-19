package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class cf extends br implements cg {
    static {
        Covode.recordClassIndex(32841);
    }

    cf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
        MethodCollector.i(10169);
        MethodCollector.o(10169);
    }

    @Override // com.google.android.play.core.b.cg
    public final void a(Bundle bundle) {
        MethodCollector.i(10337);
        Parcel a2 = a();
        bt.a(a2, bundle);
        a(3, a2);
        MethodCollector.o(10337);
    }

    @Override // com.google.android.play.core.b.cg
    public final void a(Bundle bundle, Bundle bundle2) {
        MethodCollector.i(10170);
        Parcel a2 = a();
        bt.a(a2, bundle);
        bt.a(a2, bundle2);
        a(2, a2);
        MethodCollector.o(10170);
    }

    @Override // com.google.android.play.core.b.cg
    public final void b(Bundle bundle) {
        MethodCollector.i(10492);
        Parcel a2 = a();
        bt.a(a2, bundle);
        a(4, a2);
        MethodCollector.o(10492);
    }
}
