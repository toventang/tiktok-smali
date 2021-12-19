package com.ss.android.ugc.aweme.inbox.widget;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f104373a;

    /* renamed from: b  reason: collision with root package name */
    public final int f104374b;

    /* renamed from: c  reason: collision with root package name */
    public final int f104375c;

    /* renamed from: d  reason: collision with root package name */
    public final int f104376d;

    /* renamed from: e  reason: collision with root package name */
    public final int f104377e;

    /* renamed from: f  reason: collision with root package name */
    public final int f104378f;

    /* renamed from: g  reason: collision with root package name */
    public final int f104379g;

    /* renamed from: h  reason: collision with root package name */
    public final int f104380h;

    /* renamed from: i  reason: collision with root package name */
    public final int f104381i;

    /* renamed from: j  reason: collision with root package name */
    public final int f104382j;

    /* renamed from: k  reason: collision with root package name */
    public final int f104383k;

    /* renamed from: l  reason: collision with root package name */
    public final int f104384l;

    /* renamed from: m  reason: collision with root package name */
    public final int f104385m;

    static {
        Covode.recordClassIndex(66841);
    }

    public b() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104373a == bVar.f104373a && this.f104374b == bVar.f104374b && this.f104375c == bVar.f104375c && this.f104376d == bVar.f104376d && this.f104377e == bVar.f104377e && this.f104378f == bVar.f104378f && this.f104379g == bVar.f104379g && this.f104380h == bVar.f104380h && this.f104381i == bVar.f104381i && this.f104382j == bVar.f104382j && this.f104383k == bVar.f104383k && this.f104384l == bVar.f104384l && this.f104385m == bVar.f104385m;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.f104373a * 31) + this.f104374b) * 31) + this.f104375c) * 31) + this.f104376d) * 31) + this.f104377e) * 31) + this.f104378f) * 31) + this.f104379g) * 31) + this.f104380h) * 31) + this.f104381i) * 31) + this.f104382j) * 31) + this.f104383k) * 31) + this.f104384l) * 31) + this.f104385m;
    }

    public final String toString() {
        return "UIStyleConfig(height=" + this.f104373a + ", avatarSingleSize=" + this.f104374b + ", avatarDoubleLeftSize=" + this.f104375c + ", avatarDoubleRightSize=" + this.f104376d + ", titleTuxFont=" + this.f104377e + ", titleForceTextSize=" + this.f104378f + ", contentTuxFont=" + this.f104379g + ", contentForceTextSize=" + this.f104380h + ", contentColor=" + this.f104381i + ", titleContentGap=" + this.f104382j + ", timeTuxFont=" + this.f104383k + ", timeForceTextSize=" + this.f104384l + ", contentEndGap=" + this.f104385m + ")";
    }

    private b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f104373a = i2;
        this.f104374b = i3;
        this.f104375c = i4;
        this.f104376d = i5;
        this.f104377e = i6;
        this.f104378f = i7;
        this.f104379g = i8;
        this.f104380h = i9;
        this.f104381i = i10;
        this.f104382j = i11;
        this.f104383k = i12;
        this.f104384l = i13;
        this.f104385m = i14;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this((i15 & 1) != 0 ? -1 : i2, (i15 & 2) != 0 ? -1 : i3, (i15 & 4) != 0 ? -1 : i4, (i15 & 8) != 0 ? -1 : i5, (i15 & 16) != 0 ? -1 : i6, (i15 & 32) != 0 ? -1 : i7, (i15 & 64) != 0 ? -1 : i8, (i15 & 128) != 0 ? -1 : i9, (i15 & 256) != 0 ? -1 : i10, (i15 & 512) != 0 ? -1 : i11, (i15 & 1024) != 0 ? -1 : i12, (i15 & 2048) != 0 ? -1 : i13, (i15 & 4096) == 0 ? i14 : -1);
    }
}
