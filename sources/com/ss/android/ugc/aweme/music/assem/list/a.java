package com.ss.android.ugc.aweme.music.assem.list;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f111173a;

    /* renamed from: b  reason: collision with root package name */
    public final String f111174b;

    /* renamed from: c  reason: collision with root package name */
    public final String f111175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f111176d;

    /* renamed from: e  reason: collision with root package name */
    public final int f111177e = 10;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f111178f;

    static {
        Covode.recordClassIndex(71369);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f111173a == aVar.f111173a && l.a(this.f111174b, aVar.f111174b) && l.a(this.f111175c, aVar.f111175c) && this.f111176d == aVar.f111176d && this.f111177e == aVar.f111177e && this.f111178f == aVar.f111178f;
    }

    public final int hashCode() {
        int i2 = this.f111173a * 31;
        String str = this.f111174b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f111175c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (((((hashCode + i3) * 31) + this.f111176d) * 31) + this.f111177e) * 31;
        boolean z = this.f111178f;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "CursorData(requestUUID=" + this.f111173a + ", userId=" + this.f111174b + ", secUserId=" + this.f111175c + ", cursor=" + this.f111176d + ", count=" + this.f111177e + ", requestPinnedList=" + this.f111178f + ")";
    }

    public a(int i2, String str, String str2, int i3, boolean z) {
        this.f111173a = i2;
        this.f111174b = str;
        this.f111175c = str2;
        this.f111176d = i3;
        this.f111178f = z;
    }
}
