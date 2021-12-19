package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    private final int f52121a;

    /* renamed from: b  reason: collision with root package name */
    private final ResolveAccountRequest f52122b;

    static {
        Covode.recordClassIndex(32408);
    }

    public zai(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    zai(int i2, ResolveAccountRequest resolveAccountRequest) {
        this.f52121a = i2;
        this.f52122b = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f52121a);
        b.a(parcel, 2, this.f52122b, i2);
        b.b(parcel, a2);
    }
}
