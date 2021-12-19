package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50619a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50620b;

    static {
        Covode.recordClassIndex(31596);
    }

    public IBinder asBinder() {
        return this.f50619a;
    }

    public final Parcel F_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50620b);
        return obtain;
    }

    public a(IBinder iBinder, String str) {
        this.f50619a = iBinder;
        this.f50620b = str;
    }

    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f50619a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final void b(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f50619a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
