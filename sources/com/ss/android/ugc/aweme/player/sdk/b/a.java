package com.ss.android.ugc.aweme.player.sdk.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f115325a;

    /* renamed from: b  reason: collision with root package name */
    public final String f115326b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f115327c;

    /* renamed from: d  reason: collision with root package name */
    public final int f115328d;

    /* renamed from: e  reason: collision with root package name */
    public final Float f115329e;

    /* renamed from: f  reason: collision with root package name */
    public final Float f115330f;

    /* renamed from: g  reason: collision with root package name */
    public final String f115331g;

    static {
        Covode.recordClassIndex(74080);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f115325a == aVar.f115325a && l.a(this.f115326b, aVar.f115326b) && l.a(this.f115327c, aVar.f115327c) && this.f115328d == aVar.f115328d && l.a(this.f115329e, aVar.f115329e) && l.a(this.f115330f, aVar.f115330f) && l.a(this.f115331g, aVar.f115331g);
    }

    public final int hashCode() {
        int i2 = this.f115325a * 31;
        String str = this.f115326b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f115327c;
        int hashCode2 = (((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.f115328d) * 31;
        Float f2 = this.f115329e;
        int hashCode3 = (hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f115330f;
        int hashCode4 = (hashCode3 + (f3 != null ? f3.hashCode() : 0)) * 31;
        String str2 = this.f115331g;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        return "DubbedInfoModel{mediaType=" + this.f115325a + ", url=" + this.f115326b + ", bitrate=" + this.f115327c + ", infoId=" + this.f115328d + ", loudness=" + this.f115329e + ", peak=" + this.f115330f + ", fileKey=" + this.f115331g + "}";
    }

    public a(int i2, String str, Integer num, int i3, Float f2, Float f3, String str2) {
        l.c(str, "");
        this.f115325a = i2;
        this.f115326b = str;
        this.f115327c = num;
        this.f115328d = i3;
        this.f115329e = f2;
        this.f115330f = f3;
        this.f115331g = str2;
    }
}
