package com.ss.android.ugc.aweme.mediachoose.a;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f109353a;

    /* renamed from: b  reason: collision with root package name */
    public final int f109354b;

    /* renamed from: c  reason: collision with root package name */
    public final int f109355c;

    static {
        Covode.recordClassIndex(70041);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f109353a == eVar.f109353a && this.f109354b == eVar.f109354b && this.f109355c == eVar.f109355c;
    }

    public final int hashCode() {
        return (((this.f109353a * 31) + this.f109354b) * 31) + this.f109355c;
    }

    public final String toString() {
        return "MediaRequestParam(mediaType=" + this.f109353a + ", pageSize=" + this.f109354b + ", pageIndex=" + this.f109355c + ")";
    }

    public e(int i2, int i3, int i4) {
        this.f109353a = i2;
        this.f109354b = i3;
        this.f109355c = i4;
    }
}
