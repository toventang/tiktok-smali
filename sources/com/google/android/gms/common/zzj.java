package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.aj;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    private final String f50528a;

    /* renamed from: b  reason: collision with root package name */
    private final n f50529b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f50530c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f50531d;

    static {
        Covode.recordClassIndex(31483);
    }

    private static n a(IBinder iBinder) {
        aj akVar;
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            if (queryLocalInterface instanceof aj) {
                akVar = (aj) queryLocalInterface;
            } else {
                akVar = new ak(iBinder);
            }
            a a2 = akVar.a();
            if (a2 == null || (bArr = (byte[]) b.a(a2)) == null) {
                return null;
            }
            return new q(bArr);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder asBinder;
        MethodCollector.i(11813);
        int a2 = com.google.android.gms.common.internal.safeparcel.b.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, this.f50528a);
        n nVar = this.f50529b;
        if (nVar == null) {
            asBinder = null;
        } else {
            asBinder = nVar.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, asBinder);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, this.f50530c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, this.f50531d);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a2);
        MethodCollector.o(11813);
    }

    zzj(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f50528a = str;
        this.f50529b = a(iBinder);
        this.f50530c = z;
        this.f50531d = z2;
    }

    zzj(String str, n nVar, boolean z, boolean z2) {
        this.f50528a = str;
        this.f50529b = nVar;
        this.f50530c = z;
        this.f50531d = z2;
    }
}
