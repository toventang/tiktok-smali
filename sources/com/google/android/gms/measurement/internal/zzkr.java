package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzkr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkr> CREATOR = new jx();

    /* renamed from: a  reason: collision with root package name */
    public final String f52065a;

    /* renamed from: b  reason: collision with root package name */
    public final long f52066b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f52067c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52068d;

    /* renamed from: e  reason: collision with root package name */
    public final String f52069e;

    /* renamed from: f  reason: collision with root package name */
    public final Double f52070f;

    /* renamed from: g  reason: collision with root package name */
    private final int f52071g;

    /* renamed from: h  reason: collision with root package name */
    private final Float f52072h;

    static {
        Covode.recordClassIndex(32389);
    }

    public final Object a() {
        Long l2 = this.f52067c;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.f52070f;
        if (d2 != null) {
            return d2;
        }
        String str = this.f52068d;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzkr(jw jwVar) {
        this(jwVar.f51967c, jwVar.f51968d, jwVar.f51969e, jwVar.f51966b);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f52071g);
        b.a(parcel, 2, this.f52065a);
        b.a(parcel, 3, this.f52066b);
        Long l2 = this.f52067c;
        if (l2 != null) {
            b.a(parcel, 4, 8);
            parcel.writeLong(l2.longValue());
        }
        b.a(parcel, 6, this.f52068d);
        b.a(parcel, 7, this.f52069e);
        Double d2 = this.f52070f;
        if (d2 != null) {
            b.a(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        b.b(parcel, a2);
    }

    zzkr(String str, long j2, Object obj, String str2) {
        r.a(str);
        this.f52071g = 2;
        this.f52065a = str;
        this.f52066b = j2;
        this.f52069e = str2;
        if (obj == null) {
            this.f52067c = null;
            this.f52072h = null;
            this.f52070f = null;
            this.f52068d = null;
        } else if (obj instanceof Long) {
            this.f52067c = (Long) obj;
            this.f52072h = null;
            this.f52070f = null;
            this.f52068d = null;
        } else if (obj instanceof String) {
            this.f52067c = null;
            this.f52072h = null;
            this.f52070f = null;
            this.f52068d = (String) obj;
        } else if (obj instanceof Double) {
            this.f52067c = null;
            this.f52072h = null;
            this.f52070f = (Double) obj;
            this.f52068d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzkr(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        Double d3;
        this.f52071g = i2;
        this.f52065a = str;
        this.f52066b = j2;
        this.f52067c = l2;
        if (i2 == 1) {
            if (f2 != null) {
                d3 = Double.valueOf(f2.doubleValue());
            } else {
                d3 = null;
            }
            this.f52070f = d3;
        } else {
            this.f52070f = d2;
        }
        this.f52068d = str2;
        this.f52069e = str3;
    }
}
