package com.ss.android.ugc.aweme.comment.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f72076a;

    /* renamed from: b  reason: collision with root package name */
    public final int f72077b;

    /* renamed from: c  reason: collision with root package name */
    public final String f72078c;

    static {
        Covode.recordClassIndex(44274);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f72076a, dVar.f72076a) && this.f72077b == dVar.f72077b && l.a(this.f72078c, dVar.f72078c);
    }

    public final int hashCode() {
        String str = this.f72076a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f72077b) * 31;
        String str2 = this.f72078c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GifEmojiListRequestParam(keyword=" + this.f72076a + ", cursor=" + this.f72077b + ", awemeId=" + this.f72078c + ")";
    }

    public d(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f72076a = str;
        this.f72077b = i2;
        this.f72078c = str2;
    }
}
