package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f135424a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f135425b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f135426c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f135427d;

    static {
        Covode.recordClassIndex(88474);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f135424a, qVar.f135424a) && this.f135425b == qVar.f135425b && this.f135426c == qVar.f135426c && this.f135427d == qVar.f135427d;
    }

    public final int hashCode() {
        String str = this.f135424a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f135425b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f135426c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f135427d) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "StickerManagerConfigure(panel=" + this.f135424a + ", lazyLoad=" + this.f135425b + ", shouldPrefetch=" + this.f135426c + ", isFavoriteEnable=" + this.f135427d + ")";
    }

    public /* synthetic */ q(String str) {
        this(str, true, true);
    }

    public q(String str, boolean z, boolean z2) {
        l.d(str, "");
        this.f135424a = str;
        this.f135425b = true;
        this.f135426c = z;
        this.f135427d = z2;
    }
}
