package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final long f51298a;

    /* renamed from: b  reason: collision with root package name */
    public final long f51299b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f51300c;

    /* renamed from: d  reason: collision with root package name */
    public final String f51301d;

    /* renamed from: e  reason: collision with root package name */
    public final String f51302e;

    /* renamed from: f  reason: collision with root package name */
    public final String f51303f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f51304g;

    static {
        Covode.recordClassIndex(32075);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f51298a);
        b.a(parcel, 2, this.f51299b);
        b.a(parcel, 3, this.f51300c);
        b.a(parcel, 4, this.f51301d);
        b.a(parcel, 5, this.f51302e);
        b.a(parcel, 6, this.f51303f);
        b.a(parcel, 7, this.f51304g);
        b.b(parcel, a2);
    }

    public zzae(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f51298a = j2;
        this.f51299b = j3;
        this.f51300c = z;
        this.f51301d = str;
        this.f51302e = str2;
        this.f51303f = str3;
        this.f51304g = bundle;
    }
}
