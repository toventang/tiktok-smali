package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f119524a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119525b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119526c;

    static {
        Covode.recordClassIndex(77670);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f119524a, kVar.f119524a) && l.a(this.f119525b, kVar.f119525b) && l.a(this.f119526c, kVar.f119526c);
    }

    public final int hashCode() {
        String str = this.f119524a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119525b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119526c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "VideoThumbnailData(questionId=" + this.f119524a + ", awemeId=" + this.f119525b + ", url=" + this.f119526c + ")";
    }

    public k(String str, String str2, String str3) {
        this.f119524a = str;
        this.f119525b = str2;
        this.f119526c = str3;
    }
}
