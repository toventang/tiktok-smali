package com.google.android.gms.internal.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50582a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50583b;

    static {
        Covode.recordClassIndex(31541);
    }

    protected a(IBinder iBinder, String str) {
        this.f50582a = iBinder;
        this.f50583b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50583b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f50582a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f50582a;
    }
}
