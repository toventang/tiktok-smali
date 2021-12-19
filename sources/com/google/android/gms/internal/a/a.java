package com.google.android.gms.internal.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50550a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50551b;

    static {
        Covode.recordClassIndex(31505);
    }

    protected a(IBinder iBinder, String str) {
        this.f50550a = iBinder;
        this.f50551b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel E_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50551b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f50550a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f50550a;
    }
}
