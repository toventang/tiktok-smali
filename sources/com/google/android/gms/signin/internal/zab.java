package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zab extends AbstractSafeParcelable implements p {
    public static final Parcelable.Creator<zab> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final int f52118a;

    /* renamed from: b  reason: collision with root package name */
    private int f52119b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f52120c;

    public zab() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(32407);
    }

    @Override // com.google.android.gms.common.api.p
    public final Status D_() {
        if (this.f52119b == 0) {
            return Status.f49960a;
        }
        return Status.f49964e;
    }

    private zab(byte b2) {
        this(2, 0, null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f52118a);
        b.b(parcel, 2, this.f52119b);
        b.a(parcel, 3, this.f52120c, i2);
        b.b(parcel, a2);
    }

    zab(int i2, int i3, Intent intent) {
        this.f52118a = i2;
        this.f52119b = i3;
        this.f52120c = intent;
    }
}
