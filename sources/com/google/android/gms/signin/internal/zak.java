package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final ConnectionResult f52123a;

    /* renamed from: b  reason: collision with root package name */
    public final ResolveAccountResponse f52124b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52125c;

    static {
        Covode.recordClassIndex(32409);
    }

    public zak() {
        this(new ConnectionResult(8, null));
    }

    private zak(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f52125c);
        b.a(parcel, 2, this.f52123a, i2);
        b.a(parcel, 3, this.f52124b, i2);
        b.b(parcel, a2);
    }

    zak(int i2, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f52125c = i2;
        this.f52123a = connectionResult;
        this.f52124b = resolveAccountResponse;
    }
}
