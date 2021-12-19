package com.google.android.gms.internal.c;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50586a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50587b;

    static {
        Covode.recordClassIndex(31552);
    }

    protected a(IBinder iBinder, String str) {
        this.f50586a = iBinder;
        this.f50587b = str;
    }

    public IBinder asBinder() {
        return this.f50586a;
    }
}
