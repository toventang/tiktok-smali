package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class i {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f119252a;
    @c(a = "msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f119253b;
    @c(a = "questions")

    /* renamed from: c  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.question.c> f119254c;
    @c(a = "cursor")

    /* renamed from: d  reason: collision with root package name */
    public final int f119255d;
    @c(a = "boolean")

    /* renamed from: e  reason: collision with root package name */
    public final boolean f119256e;

    static {
        Covode.recordClassIndex(77462);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f119252a == iVar.f119252a && l.a(this.f119253b, iVar.f119253b) && l.a(this.f119254c, iVar.f119254c) && this.f119255d == iVar.f119255d && this.f119256e == iVar.f119256e;
    }

    public final int hashCode() {
        int i2 = this.f119252a * 31;
        String str = this.f119253b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<com.ss.android.ugc.aweme.question.c> list = this.f119254c;
        if (list != null) {
            i3 = list.hashCode();
        }
        int i4 = (((hashCode + i3) * 31) + this.f119255d) * 31;
        boolean z = this.f119256e;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "TiktokV1ForumProfileQuestionsResponse(statusCode=" + this.f119252a + ", msg=" + this.f119253b + ", questions=" + this.f119254c + ", cursor=" + this.f119255d + ", hasMore=" + this.f119256e + ")";
    }
}
