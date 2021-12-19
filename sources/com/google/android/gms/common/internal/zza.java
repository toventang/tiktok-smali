package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new ae();

    /* renamed from: a  reason: collision with root package name */
    Bundle f50443a;

    /* renamed from: b  reason: collision with root package name */
    Feature[] f50444b;

    /* renamed from: c  reason: collision with root package name */
    private int f50445c;

    public zza() {
    }

    static {
        Covode.recordClassIndex(31437);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f50443a);
        b.a(parcel, 2, this.f50444b, i2);
        b.b(parcel, 3, this.f50445c);
        b.b(parcel, a2);
    }

    zza(Bundle bundle, Feature[] featureArr, int i2) {
        this.f50443a = bundle;
        this.f50444b = featureArr;
        this.f50445c = i2;
    }
}
