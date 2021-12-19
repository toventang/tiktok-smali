package com.google.android.gms.internal.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

public final class c extends d implements a {
    static {
        Covode.recordClassIndex(31593);
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(String str, List<String> list, String str2, String str3) {
        MethodCollector.i(5486);
        Parcel a2 = a();
        a2.writeInt(5);
        a2.writeString(str);
        a2.writeStringList(list);
        a2.writeString(str2);
        a2.writeString(str3);
        a2.writeString(null);
        Parcel a3 = a(7, a2);
        Bundle bundle = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5486);
        return bundle;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(String str, String str2, String str3, Bundle bundle) {
        MethodCollector.i(5823);
        Parcel a2 = a();
        a2.writeInt(9);
        a2.writeString(str);
        a2.writeString(str2);
        a2.writeString(str3);
        e.a(a2, bundle);
        Parcel a3 = a(11, a2);
        Bundle bundle2 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5823);
        return bundle2;
    }

    public c(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
        MethodCollector.i(5459);
        MethodCollector.o(5459);
    }

    @Override // com.google.android.gms.internal.h.a
    public final int a(String str, String str2) {
        MethodCollector.i(5481);
        Parcel a2 = a();
        a2.writeInt(3);
        a2.writeString(str);
        a2.writeString(str2);
        Parcel a3 = a(5, a2);
        int readInt = a3.readInt();
        a3.recycle();
        MethodCollector.o(5481);
        return readInt;
    }

    @Override // com.google.android.gms.internal.h.a
    public final int a(int i2, String str, String str2) {
        MethodCollector.i(5466);
        Parcel a2 = a();
        a2.writeInt(i2);
        a2.writeString(str);
        a2.writeString(str2);
        Parcel a3 = a(1, a2);
        int readInt = a3.readInt();
        a3.recycle();
        MethodCollector.o(5466);
        return readInt;
    }

    @Override // com.google.android.gms.internal.h.a
    public final int b(String str, String str2, Bundle bundle) {
        MethodCollector.i(5759);
        Parcel a2 = a();
        a2.writeInt(7);
        a2.writeString(str);
        a2.writeString(str2);
        e.a(a2, bundle);
        Parcel a3 = a(10, a2);
        int readInt = a3.readInt();
        a3.recycle();
        MethodCollector.o(5759);
        return readInt;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle c(String str, String str2, Bundle bundle) {
        MethodCollector.i(5873);
        Parcel a2 = a();
        a2.writeInt(9);
        a2.writeString(str);
        a2.writeString(str2);
        e.a(a2, bundle);
        Parcel a3 = a(12, a2);
        Bundle bundle2 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5873);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle d(String str, String str2, Bundle bundle) {
        MethodCollector.i(5990);
        Parcel a2 = a();
        a2.writeInt(9);
        a2.writeString(str);
        a2.writeString(str2);
        e.a(a2, bundle);
        Parcel a3 = a(902, a2);
        Bundle bundle2 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5990);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle b(String str, String str2, String str3) {
        MethodCollector.i(5476);
        Parcel a2 = a();
        a2.writeInt(3);
        a2.writeString(str);
        a2.writeString(str2);
        a2.writeString(str3);
        Parcel a3 = a(4, a2);
        Bundle bundle = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5476);
        return bundle;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(String str, String str2, Bundle bundle) {
        MethodCollector.i(5470);
        Parcel a2 = a();
        a2.writeInt(3);
        a2.writeString(str);
        a2.writeString(str2);
        e.a(a2, bundle);
        Parcel a3 = a(2, a2);
        Bundle bundle2 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5470);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(String str, String str2, String str3) {
        MethodCollector.i(5472);
        Parcel a2 = a();
        a2.writeInt(3);
        a2.writeString(str);
        a2.writeString(str2);
        a2.writeString(str3);
        a2.writeString(null);
        Parcel a3 = a(3, a2);
        Bundle bundle = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5472);
        return bundle;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(String str, String str2, Bundle bundle, Bundle bundle2) {
        MethodCollector.i(5935);
        Parcel a2 = a();
        a2.writeInt(10);
        a2.writeString(str);
        a2.writeString(str2);
        e.a(a2, bundle);
        e.a(a2, bundle2);
        Parcel a3 = a(901, a2);
        Bundle bundle3 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5935);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.h.a
    public final Bundle a(int i2, String str, String str2, String str3, String str4, Bundle bundle) {
        MethodCollector.i(5601);
        Parcel a2 = a();
        a2.writeInt(i2);
        a2.writeString(str);
        a2.writeString(str2);
        a2.writeString(str3);
        a2.writeString(str4);
        e.a(a2, bundle);
        Parcel a3 = a(8, a2);
        Bundle bundle2 = (Bundle) e.a(a3, Bundle.CREATOR);
        a3.recycle();
        MethodCollector.o(5601);
        return bundle2;
    }
}
