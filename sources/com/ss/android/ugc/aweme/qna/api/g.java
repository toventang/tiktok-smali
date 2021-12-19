package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class g {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f119239a;
    @c(a = "msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f119240b;
    @c(a = "answers")

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f119241c;
    @c(a = "cursor")

    /* renamed from: d  reason: collision with root package name */
    public final int f119242d;
    @c(a = "boolean")

    /* renamed from: e  reason: collision with root package name */
    public final boolean f119243e;

    static {
        Covode.recordClassIndex(77460);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f119239a == gVar.f119239a && l.a(this.f119240b, gVar.f119240b) && l.a(this.f119241c, gVar.f119241c) && this.f119242d == gVar.f119242d && this.f119243e == gVar.f119243e;
    }

    public final int hashCode() {
        int i2 = this.f119239a * 31;
        String str = this.f119240b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<a> list = this.f119241c;
        if (list != null) {
            i3 = list.hashCode();
        }
        int i4 = (((hashCode + i3) * 31) + this.f119242d) * 31;
        boolean z = this.f119243e;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "TiktokV1ForumProfileAnswersResponse(statusCode=" + this.f119239a + ", msg=" + this.f119240b + ", answers=" + this.f119241c + ", cursor=" + this.f119242d + ", hasMore=" + this.f119243e + ")";
    }
}
