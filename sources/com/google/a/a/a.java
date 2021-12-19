package com.google.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f49290a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49291b;

    static {
        Covode.recordClassIndex(30838);
    }

    public a(IBinder iBinder, String str) {
        this.f49290a = iBinder;
        this.f49291b = str;
    }

    public final IBinder asBinder() {
        return this.f49290a;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49291b);
        return obtain;
    }

    public final void b(int i2, Parcel parcel) {
        try {
            this.f49290a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f49290a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
