package com.google.android.play.core.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class br implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f53144a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53145b;

    static {
        Covode.recordClassIndex(32826);
    }

    protected br(IBinder iBinder, String str) {
        this.f53144a = iBinder;
        this.f53145b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f53145b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Parcel parcel) {
        try {
            this.f53144a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f53144a;
    }
}
