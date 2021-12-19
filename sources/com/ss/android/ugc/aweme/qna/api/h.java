package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class h {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f119244a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f119245b;
    @c(a = "answers_tab_title")

    /* renamed from: c  reason: collision with root package name */
    public final String f119246c;
    @c(a = "questions_tab_title")

    /* renamed from: d  reason: collision with root package name */
    public final String f119247d;
    @c(a = "profile_user")

    /* renamed from: e  reason: collision with root package name */
    public final User f119248e;
    @c(a = "answers_count")

    /* renamed from: f  reason: collision with root package name */
    public final Long f119249f;
    @c(a = "questions_count")

    /* renamed from: g  reason: collision with root package name */
    public final Long f119250g;
    @c(a = "allow_ask_question")

    /* renamed from: h  reason: collision with root package name */
    public final boolean f119251h;

    static {
        Covode.recordClassIndex(77461);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f119244a == hVar.f119244a && l.a(this.f119245b, hVar.f119245b) && l.a(this.f119246c, hVar.f119246c) && l.a(this.f119247d, hVar.f119247d) && l.a(this.f119248e, hVar.f119248e) && l.a(this.f119249f, hVar.f119249f) && l.a(this.f119250g, hVar.f119250g) && this.f119251h == hVar.f119251h;
    }

    public final int hashCode() {
        int i2 = this.f119244a * 31;
        String str = this.f119245b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119246c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119247d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f119248e;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        Long l2 = this.f119249f;
        int hashCode5 = (hashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f119250g;
        if (l3 != null) {
            i3 = l3.hashCode();
        }
        int i4 = (hashCode5 + i3) * 31;
        boolean z = this.f119251h;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "TiktokV1ForumProfileBannerResponse(statusCode=" + this.f119244a + ", msg=" + this.f119245b + ", answersTabTitle=" + this.f119246c + ", questionsTabTitle=" + this.f119247d + ", profileUser=" + this.f119248e + ", answersCount=" + this.f119249f + ", questionsCount=" + this.f119250g + ", allowAskQuestion=" + this.f119251h + ")";
    }
}
