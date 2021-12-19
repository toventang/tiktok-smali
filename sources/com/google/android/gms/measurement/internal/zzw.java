package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new kn();

    /* renamed from: a  reason: collision with root package name */
    public String f52086a;

    /* renamed from: b  reason: collision with root package name */
    public String f52087b;

    /* renamed from: c  reason: collision with root package name */
    public zzkr f52088c;

    /* renamed from: d  reason: collision with root package name */
    public long f52089d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f52090e;

    /* renamed from: f  reason: collision with root package name */
    public String f52091f;

    /* renamed from: g  reason: collision with root package name */
    public zzao f52092g;

    /* renamed from: h  reason: collision with root package name */
    public long f52093h;

    /* renamed from: i  reason: collision with root package name */
    public zzao f52094i;

    /* renamed from: j  reason: collision with root package name */
    public long f52095j;

    /* renamed from: k  reason: collision with root package name */
    public zzao f52096k;

    static {
        Covode.recordClassIndex(32391);
    }

    zzw(zzw zzw) {
        r.a(zzw);
        this.f52086a = zzw.f52086a;
        this.f52087b = zzw.f52087b;
        this.f52088c = zzw.f52088c;
        this.f52089d = zzw.f52089d;
        this.f52090e = zzw.f52090e;
        this.f52091f = zzw.f52091f;
        this.f52092g = zzw.f52092g;
        this.f52093h = zzw.f52093h;
        this.f52094i = zzw.f52094i;
        this.f52095j = zzw.f52095j;
        this.f52096k = zzw.f52096k;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, this.f52086a);
        b.a(parcel, 3, this.f52087b);
        b.a(parcel, 4, this.f52088c, i2);
        b.a(parcel, 5, this.f52089d);
        b.a(parcel, 6, this.f52090e);
        b.a(parcel, 7, this.f52091f);
        b.a(parcel, 8, this.f52092g, i2);
        b.a(parcel, 9, this.f52093h);
        b.a(parcel, 10, this.f52094i, i2);
        b.a(parcel, 11, this.f52095j);
        b.a(parcel, 12, this.f52096k, i2);
        b.b(parcel, a2);
    }

    zzw(String str, String str2, zzkr zzkr, long j2, boolean z, String str3, zzao zzao, long j3, zzao zzao2, long j4, zzao zzao3) {
        this.f52086a = str;
        this.f52087b = str2;
        this.f52088c = zzkr;
        this.f52089d = j2;
        this.f52090e = z;
        this.f52091f = str3;
        this.f52092g = zzao;
        this.f52093h = j3;
        this.f52094i = zzao2;
        this.f52095j = j4;
        this.f52096k = zzao3;
    }
}
