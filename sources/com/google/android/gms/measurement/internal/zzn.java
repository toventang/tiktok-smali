package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new kc();

    /* renamed from: a  reason: collision with root package name */
    public final String f52073a;

    /* renamed from: b  reason: collision with root package name */
    public final String f52074b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52075c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52076d;

    /* renamed from: e  reason: collision with root package name */
    public final long f52077e;

    /* renamed from: f  reason: collision with root package name */
    public final long f52078f;

    /* renamed from: g  reason: collision with root package name */
    public final String f52079g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f52080h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f52081i;

    /* renamed from: j  reason: collision with root package name */
    public final long f52082j;

    /* renamed from: k  reason: collision with root package name */
    public final String f52083k;

    /* renamed from: l  reason: collision with root package name */
    public final long f52084l;

    /* renamed from: m  reason: collision with root package name */
    public final long f52085m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Boolean s;
    public final long t;
    public final List<String> u;
    public final String v;

    static {
        Covode.recordClassIndex(32390);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, this.f52073a);
        b.a(parcel, 3, this.f52074b);
        b.a(parcel, 4, this.f52075c);
        b.a(parcel, 5, this.f52076d);
        b.a(parcel, 6, this.f52077e);
        b.a(parcel, 7, this.f52078f);
        b.a(parcel, 8, this.f52079g);
        b.a(parcel, 9, this.f52080h);
        b.a(parcel, 10, this.f52081i);
        b.a(parcel, 11, this.f52082j);
        b.a(parcel, 12, this.f52083k);
        b.a(parcel, 13, this.f52084l);
        b.a(parcel, 14, this.f52085m);
        b.b(parcel, 15, this.n);
        b.a(parcel, 16, this.o);
        b.a(parcel, 17, this.p);
        b.a(parcel, 18, this.q);
        b.a(parcel, 19, this.r);
        Boolean bool = this.s;
        if (bool != null) {
            b.a(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        b.a(parcel, 22, this.t);
        b.a(parcel, 23, this.u);
        b.a(parcel, 24, this.v);
        b.b(parcel, a2);
    }

    zzn(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        r.a(str);
        this.f52073a = str;
        this.f52074b = TextUtils.isEmpty(str2) ? null : str2;
        this.f52075c = str3;
        this.f52082j = j2;
        this.f52076d = str4;
        this.f52077e = j3;
        this.f52078f = j4;
        this.f52079g = str5;
        this.f52080h = z;
        this.f52081i = z2;
        this.f52083k = str6;
        this.f52084l = j5;
        this.f52085m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
    }

    zzn(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        this.f52073a = str;
        this.f52074b = str2;
        this.f52075c = str3;
        this.f52082j = j4;
        this.f52076d = str4;
        this.f52077e = j2;
        this.f52078f = j3;
        this.f52079g = str5;
        this.f52080h = z;
        this.f52081i = z2;
        this.f52083k = str6;
        this.f52084l = j5;
        this.f52085m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
    }
}
