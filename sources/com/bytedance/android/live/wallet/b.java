package com.bytedance.android.live.wallet;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f13046a;

    /* renamed from: b  reason: collision with root package name */
    public String f13047b;

    /* renamed from: c  reason: collision with root package name */
    public int f13048c;

    /* renamed from: d  reason: collision with root package name */
    public int f13049d;

    /* renamed from: e  reason: collision with root package name */
    public int f13050e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13051f;

    static {
        Covode.recordClassIndex(7246);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13046a == bVar.f13046a && l.a(this.f13047b, bVar.f13047b) && this.f13048c == bVar.f13048c && this.f13049d == bVar.f13049d && this.f13050e == bVar.f13050e && this.f13051f == bVar.f13051f;
    }

    public final int hashCode() {
        int i2 = this.f13046a * 31;
        String str = this.f13047b;
        int hashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f13048c) * 31) + this.f13049d) * 31) + this.f13050e) * 31;
        boolean z = this.f13051f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return hashCode + i3;
    }

    public final String toString() {
        return "ExchangeDialogParams(title=" + this.f13046a + ", message=" + this.f13047b + ", cancel=" + this.f13048c + ", confirm=" + this.f13049d + ", checkBoxText=" + this.f13050e + ", showCheckBox=" + this.f13051f + ")";
    }

    private /* synthetic */ b() {
        this(0, "", 0, 0, 0, false);
    }

    public b(int i2, String str, int i3, int i4, int i5, boolean z) {
        l.d(str, "");
        this.f13046a = i2;
        this.f13047b = str;
        this.f13048c = i3;
        this.f13049d = i4;
        this.f13050e = i5;
        this.f13051f = z;
    }
}
