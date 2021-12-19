package com.ss.android.ugc.aweme.editSticker.compile;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f88101a;

    /* renamed from: b  reason: collision with root package name */
    public final int f88102b;

    /* renamed from: c  reason: collision with root package name */
    public final int f88103c;

    /* renamed from: d  reason: collision with root package name */
    public final int f88104d;

    /* renamed from: e  reason: collision with root package name */
    public final int f88105e;

    static {
        Covode.recordClassIndex(55386);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f88101a, aVar.f88101a) && this.f88102b == aVar.f88102b && this.f88103c == aVar.f88103c && this.f88104d == aVar.f88104d && this.f88105e == aVar.f88105e;
    }

    public final int hashCode() {
        String str = this.f88101a;
        return ((((((((str != null ? str.hashCode() : 0) * 31) + this.f88102b) * 31) + this.f88103c) * 31) + this.f88104d) * 31) + this.f88105e;
    }

    public final String toString() {
        return "StickerCompileParam(draftDir=" + this.f88101a + ", targetWidth=" + this.f88102b + ", targetHeight=" + this.f88103c + ", videoWidth=" + this.f88104d + ", videoHeight=" + this.f88105e + ")";
    }

    public /* synthetic */ a(String str, int i2, int i3) {
        this(str, i2, i3, 0, 0);
    }

    public a(String str, int i2, int i3, int i4, int i5) {
        this.f88101a = str;
        this.f88102b = i2;
        this.f88103c = i3;
        this.f88104d = i4;
        this.f88105e = i5;
    }
}
