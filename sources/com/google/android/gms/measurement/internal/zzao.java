package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final String f52061a;

    /* renamed from: b  reason: collision with root package name */
    public final zzan f52062b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52063c;

    /* renamed from: d  reason: collision with root package name */
    public final long f52064d;

    static {
        Covode.recordClassIndex(32388);
    }

    public final String toString() {
        String str = this.f52063c;
        String str2 = this.f52061a;
        String valueOf = String.valueOf(this.f52062b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    zzao(zzao zzao, long j2) {
        r.a(zzao);
        this.f52061a = zzao.f52061a;
        this.f52062b = zzao.f52062b;
        this.f52063c = zzao.f52063c;
        this.f52064d = j2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, this.f52061a);
        b.a(parcel, 3, this.f52062b, i2);
        b.a(parcel, 4, this.f52063c);
        b.a(parcel, 5, this.f52064d);
        b.b(parcel, a2);
    }

    public zzao(String str, zzan zzan, String str2, long j2) {
        this.f52061a = str;
        this.f52062b = zzan;
        this.f52063c = str2;
        this.f52064d = j2;
    }
}
