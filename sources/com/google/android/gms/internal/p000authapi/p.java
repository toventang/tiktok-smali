package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.auth-api.p  reason: invalid package */
public class p implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50571a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50572b;

    static {
        Covode.recordClassIndex(31529);
    }

    public IBinder asBinder() {
        return this.f50571a;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50572b);
        return obtain;
    }

    public p(IBinder iBinder, String str) {
        this.f50571a = iBinder;
        this.f50572b = str;
    }

    public final void a(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f50571a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
