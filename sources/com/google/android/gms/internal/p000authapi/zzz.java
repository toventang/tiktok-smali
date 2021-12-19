package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* renamed from: com.google.android.gms.internal.auth-api.zzz  reason: invalid package */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new ae();

    /* renamed from: a  reason: collision with root package name */
    private final Credential f50581a;

    static {
        Covode.recordClassIndex(31540);
    }

    public zzz(Credential credential) {
        this.f50581a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f50581a, i2);
        b.b(parcel, a2);
    }
}
