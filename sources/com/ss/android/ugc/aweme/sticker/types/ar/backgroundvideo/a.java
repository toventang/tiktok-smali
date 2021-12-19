package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f135780a;

    /* renamed from: b  reason: collision with root package name */
    public final String f135781b;

    /* renamed from: c  reason: collision with root package name */
    public final String f135782c;

    static {
        Covode.recordClassIndex(88751);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f135780a, aVar.f135780a) && l.a(this.f135781b, aVar.f135781b) && l.a(this.f135782c, aVar.f135782c);
    }

    public final int hashCode() {
        String str = this.f135780a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f135781b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f135782c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BackgroundMediaData(videoPath=" + this.f135780a + ", audioPath=" + this.f135781b + ", videoOriginPath=" + this.f135782c + ")";
    }

    public a(String str, String str2, String str3) {
        this.f135780a = str;
        this.f135781b = str2;
        this.f135782c = str3;
    }
}
