package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

public final class ap extends br implements aq {
    static {
        Covode.recordClassIndex(32797);
    }

    public ap(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        MethodCollector.i(6613);
        MethodCollector.o(6613);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.aq
    public final void a(String str, List<Bundle> list, Bundle bundle, as asVar) {
        MethodCollector.i(6657);
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        bt.a(a2, bundle);
        a2.writeStrongBinder(asVar);
        a(2, a2);
        MethodCollector.o(6657);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.aq
    public final void a(String str, int i2, Bundle bundle, as asVar) {
        MethodCollector.i(6660);
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeInt(i2);
        bt.a(a2, bundle);
        a2.writeStrongBinder(asVar);
        a(4, a2);
        MethodCollector.o(6660);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.aq
    public final void a(String str, int i2, as asVar) {
        MethodCollector.i(6662);
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeInt(i2);
        a2.writeStrongBinder(asVar);
        a(5, a2);
        MethodCollector.o(6662);
    }
}
