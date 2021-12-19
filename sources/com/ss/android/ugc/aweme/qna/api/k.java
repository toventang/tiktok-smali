package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class k {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f119261a;
    @c(a = "msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f119262b;
    @c(a = "question_collection")

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f119263c;

    static {
        Covode.recordClassIndex(77464);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f119261a == kVar.f119261a && l.a(this.f119262b, kVar.f119262b) && l.a(this.f119263c, kVar.f119263c);
    }

    public final int hashCode() {
        int i2 = this.f119261a * 31;
        String str = this.f119262b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<d> list = this.f119263c;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "TiktokV1ForumQuestionSuggestResponse(statusCode=" + this.f119261a + ", msg=" + this.f119262b + ", questionCollection=" + this.f119263c + ")";
    }
}
