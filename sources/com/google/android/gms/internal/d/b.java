package com.google.android.gms.internal.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class b implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50589a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50590b;

    static {
        Covode.recordClassIndex(31558);
    }

    public IBinder asBinder() {
        return this.f50589a;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50590b);
        return obtain;
    }

    public b(IBinder iBinder, String str) {
        this.f50589a = iBinder;
        this.f50590b = str;
    }

    public final void a(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f50589a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
