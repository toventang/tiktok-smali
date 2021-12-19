package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = "collection_category")

    /* renamed from: a  reason: collision with root package name */
    public final int f119229a;
    @c(a = "question_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.question.c> f119230b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public final int f119231c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public final int f119232d;
    @c(a = "remaining_question_count")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f119233e;

    static {
        Covode.recordClassIndex(77457);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f119229a == dVar.f119229a && l.a(this.f119230b, dVar.f119230b) && this.f119231c == dVar.f119231c && this.f119232d == dVar.f119232d && l.a(this.f119233e, dVar.f119233e);
    }

    public final int hashCode() {
        int i2 = this.f119229a * 31;
        List<com.ss.android.ugc.aweme.question.c> list = this.f119230b;
        int i3 = 0;
        int hashCode = (((((i2 + (list != null ? list.hashCode() : 0)) * 31) + this.f119231c) * 31) + this.f119232d) * 31;
        Integer num = this.f119233e;
        if (num != null) {
            i3 = num.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "QuestionCollection(collectionCategory=" + this.f119229a + ", forumStruct=" + this.f119230b + ", cursor=" + this.f119231c + ", hasMore=" + this.f119232d + ", remainingQuestionCount=" + this.f119233e + ")";
    }
}
