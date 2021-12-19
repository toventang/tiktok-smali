package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

/* access modifiers changed from: package-private */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    final String f52017a;

    /* renamed from: b  reason: collision with root package name */
    final String f52018b;

    /* renamed from: c  reason: collision with root package name */
    final long f52019c;

    /* renamed from: d  reason: collision with root package name */
    final long f52020d;

    /* renamed from: e  reason: collision with root package name */
    final long f52021e;

    /* renamed from: f  reason: collision with root package name */
    final long f52022f;

    /* renamed from: g  reason: collision with root package name */
    final long f52023g;

    /* renamed from: h  reason: collision with root package name */
    final Long f52024h;

    /* renamed from: i  reason: collision with root package name */
    final Long f52025i;

    /* renamed from: j  reason: collision with root package name */
    final Long f52026j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f52027k;

    static {
        Covode.recordClassIndex(32372);
    }

    /* access modifiers changed from: package-private */
    public final l a(long j2) {
        return new l(this.f52017a, this.f52018b, this.f52019c, this.f52020d, this.f52021e, j2, this.f52023g, this.f52024h, this.f52025i, this.f52026j, this.f52027k);
    }

    /* access modifiers changed from: package-private */
    public final l a(long j2, long j3) {
        return new l(this.f52017a, this.f52018b, this.f52019c, this.f52020d, this.f52021e, this.f52022f, j2, Long.valueOf(j3), this.f52025i, this.f52026j, this.f52027k);
    }

    l(String str, String str2, long j2) {
        this(str, str2, 0, 0, 0, j2, 0, null, null, null, null);
    }

    /* access modifiers changed from: package-private */
    public final l a(Long l2, Long l3, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null && !bool2.booleanValue()) {
            bool2 = null;
        }
        return new l(this.f52017a, this.f52018b, this.f52019c, this.f52020d, this.f52021e, this.f52022f, this.f52023g, this.f52024h, l2, l3, bool2);
    }

    l(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        r.a(str);
        r.a(str2);
        boolean z4 = true;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        r.b(z);
        if (j3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.b(z2);
        if (j4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        r.b(z3);
        r.b(j6 < 0 ? false : z4);
        this.f52017a = str;
        this.f52018b = str2;
        this.f52019c = j2;
        this.f52020d = j3;
        this.f52021e = j4;
        this.f52022f = j5;
        this.f52023g = j6;
        this.f52024h = l2;
        this.f52025i = l3;
        this.f52026j = l4;
        this.f52027k = bool;
    }
}
