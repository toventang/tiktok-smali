package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f49292a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49293b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    static {
        Covode.recordClassIndex(30845);
    }

    public a(IBinder iBinder) {
        this.f49292a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f49292a;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49293b);
        return obtain;
    }

    public final Parcel a(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f49292a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
