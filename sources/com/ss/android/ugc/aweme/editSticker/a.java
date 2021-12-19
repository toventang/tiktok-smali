package com.ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f88046a;

    /* renamed from: b  reason: collision with root package name */
    public final String f88047b;

    /* renamed from: c  reason: collision with root package name */
    public final int f88048c = 100;

    static {
        Covode.recordClassIndex(55348);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f88046a, aVar.f88046a) && l.a(this.f88047b, aVar.f88047b) && this.f88048c == aVar.f88048c;
    }

    public final int hashCode() {
        String str = this.f88046a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f88047b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f88048c;
    }

    public final String toString() {
        return "EditEffectTextStickerConfig(stylePanel=" + this.f88046a + ", fontPanel=" + this.f88047b + ", effectMaxCharNum=" + this.f88048c + ")";
    }

    public a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f88046a = str;
        this.f88047b = str2;
    }
}
