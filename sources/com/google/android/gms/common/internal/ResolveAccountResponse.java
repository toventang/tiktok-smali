package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new ad();

    /* renamed from: a  reason: collision with root package name */
    public IBinder f50323a;

    /* renamed from: b  reason: collision with root package name */
    public ConnectionResult f50324b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50325c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50326d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50327e;

    static {
        Covode.recordClassIndex(31363);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        if (!this.f50324b.equals(resolveAccountResponse.f50324b) || !l.a.a(this.f50323a).equals(l.a.a(resolveAccountResponse.f50323a))) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f50327e);
        b.a(parcel, 2, this.f50323a);
        b.a(parcel, 3, this.f50324b, i2);
        b.a(parcel, 4, this.f50325c);
        b.a(parcel, 5, this.f50326d);
        b.b(parcel, a2);
    }

    ResolveAccountResponse(int i2, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f50327e = i2;
        this.f50323a = iBinder;
        this.f50324b = connectionResult;
        this.f50325c = z;
        this.f50326d = z2;
    }
}
