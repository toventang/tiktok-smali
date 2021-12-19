package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

public final class by extends br implements ca {
    static {
        Covode.recordClassIndex(32833);
    }

    by(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        MethodCollector.i(8748);
        MethodCollector.o(8748);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void a(String str, List<Bundle> list, Bundle bundle, cc ccVar) {
        MethodCollector.i(8757);
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        bt.a(a2, bundle);
        a2.writeStrongBinder(ccVar);
        a(14, a2);
        MethodCollector.o(8757);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void a(String str, Bundle bundle, cc ccVar) {
        MethodCollector.i(8759);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        a2.writeStrongBinder(ccVar);
        a(5, a2);
        MethodCollector.o(8759);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void a(String str, Bundle bundle, Bundle bundle2, cc ccVar) {
        MethodCollector.i(8761);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        bt.a(a2, bundle2);
        a2.writeStrongBinder(ccVar);
        a(6, a2);
        MethodCollector.o(8761);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void b(String str, Bundle bundle, Bundle bundle2, cc ccVar) {
        MethodCollector.i(8763);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        bt.a(a2, bundle2);
        a2.writeStrongBinder(ccVar);
        a(7, a2);
        MethodCollector.o(8763);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void c(String str, Bundle bundle, Bundle bundle2, cc ccVar) {
        MethodCollector.i(8764);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        bt.a(a2, bundle2);
        a2.writeStrongBinder(ccVar);
        a(9, a2);
        MethodCollector.o(8764);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void b(String str, Bundle bundle, cc ccVar) {
        MethodCollector.i(8765);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        a2.writeStrongBinder(ccVar);
        a(10, a2);
        MethodCollector.o(8765);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.b.ca
    public final void d(String str, Bundle bundle, Bundle bundle2, cc ccVar) {
        MethodCollector.i(8767);
        Parcel a2 = a();
        a2.writeString(str);
        bt.a(a2, bundle);
        bt.a(a2, bundle2);
        a2.writeStrongBinder(ccVar);
        a(11, a2);
        MethodCollector.o(8767);
    }
}
