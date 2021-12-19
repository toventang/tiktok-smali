package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f119257a;
    @c(a = "msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f119258b;
    @c(a = "questions_tab_title")

    /* renamed from: c  reason: collision with root package name */
    public final String f119259c;
    @c(a = "questions_count")

    /* renamed from: d  reason: collision with root package name */
    public final long f119260d;

    static {
        Covode.recordClassIndex(77463);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f119257a == jVar.f119257a && l.a(this.f119258b, jVar.f119258b) && l.a(this.f119259c, jVar.f119259c) && this.f119260d == jVar.f119260d;
    }

    public final int hashCode() {
        int i2 = this.f119257a * 31;
        String str = this.f119258b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119259c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.f119260d;
        return ((hashCode + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "TiktokV1ForumQuestionDeleteResponse(statusCode=" + this.f119257a + ", msg=" + this.f119258b + ", questionsTabTitle=" + this.f119259c + ", questionsCount=" + this.f119260d + ")";
    }
}
