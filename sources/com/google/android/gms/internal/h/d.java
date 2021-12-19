package com.google.android.gms.internal.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class d implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50616a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50617b;

    static {
        Covode.recordClassIndex(31594);
    }

    public IBinder asBinder() {
        return this.f50616a;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50617b);
        return obtain;
    }

    protected d(IBinder iBinder, String str) {
        this.f50616a = iBinder;
        this.f50617b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f50616a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
