package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class f {
    @c(a = "mention")

    /* renamed from: a  reason: collision with root package name */
    public int f76658a;
    @c(a = "mention_notice")

    /* renamed from: b  reason: collision with root package name */
    public int f76659b;
    @c(a = "tag")

    /* renamed from: c  reason: collision with root package name */
    public int f76660c;
    @c(a = "tag_notice")

    /* renamed from: d  reason: collision with root package name */
    public int f76661d;
    @c(a = "qna_invite")

    /* renamed from: e  reason: collision with root package name */
    public int f76662e;

    static {
        Covode.recordClassIndex(47350);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f76658a == fVar.f76658a && this.f76659b == fVar.f76659b && this.f76660c == fVar.f76660c && this.f76661d == fVar.f76661d && this.f76662e == fVar.f76662e;
    }

    public final int hashCode() {
        return (((((((this.f76658a * 31) + this.f76659b) * 31) + this.f76660c) * 31) + this.f76661d) * 31) + this.f76662e;
    }

    public final String toString() {
        return "InvolveSettings(mention=" + this.f76658a + ", mentionNotice=" + this.f76659b + ", tag=" + this.f76660c + ", tag_notice=" + this.f76661d + ", qnaInvite=" + this.f76662e + ")";
    }
}
