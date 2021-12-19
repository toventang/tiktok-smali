package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new aq();

    /* renamed from: a  reason: collision with root package name */
    private final int f50446a;

    static {
        Covode.recordClassIndex(31438);
    }

    zzs(int i2) {
        this.f50446a = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f50446a);
        b.b(parcel, a2);
    }
}
