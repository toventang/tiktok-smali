package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "question_id")

    /* renamed from: a  reason: collision with root package name */
    public final long f119220a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public final String f119221b;
    @c(a = "question_creator")

    /* renamed from: c  reason: collision with root package name */
    public final User f119222c;
    @c(a = "answer_creator")

    /* renamed from: d  reason: collision with root package name */
    public final User f119223d;
    @c(a = "answers")

    /* renamed from: e  reason: collision with root package name */
    public final List<Aweme> f119224e;

    static {
        Covode.recordClassIndex(77454);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119220a == aVar.f119220a && l.a(this.f119221b, aVar.f119221b) && l.a(this.f119222c, aVar.f119222c) && l.a(this.f119223d, aVar.f119223d) && l.a(this.f119224e, aVar.f119224e);
    }

    public final String toString() {
        return "AnswerStruct(questionId=" + this.f119220a + ", content=" + this.f119221b + ", questionCreator=" + this.f119222c + ", answerCreator=" + this.f119223d + ", answers=" + this.f119224e + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        long j2 = this.f119220a;
        int i5 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f119221b;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i5 + i2) * 31;
        User user = this.f119222c;
        if (user != null) {
            i3 = user.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        User user2 = this.f119223d;
        if (user2 != null) {
            i4 = user2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        List<Aweme> list = this.f119224e;
        if (list != null) {
            i6 = list.hashCode();
        }
        return i9 + i6;
    }
}
