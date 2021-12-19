package com.ss.android.ugc.aweme.question.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public d f119989a;

    /* renamed from: b  reason: collision with root package name */
    public a f119990b;

    /* renamed from: c  reason: collision with root package name */
    public b f119991c;

    /* renamed from: d  reason: collision with root package name */
    public String f119992d;

    /* renamed from: e  reason: collision with root package name */
    public String f119993e;

    /* renamed from: f  reason: collision with root package name */
    public final QuestionDetailParam f119994f;

    static {
        Covode.recordClassIndex(77944);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f119989a, cVar.f119989a) && l.a(this.f119990b, cVar.f119990b) && l.a(this.f119991c, cVar.f119991c) && l.a(this.f119992d, cVar.f119992d) && l.a(this.f119993e, cVar.f119993e) && l.a(this.f119994f, cVar.f119994f);
    }

    public final int hashCode() {
        d dVar = this.f119989a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        a aVar = this.f119990b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f119991c;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f119992d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119993e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        QuestionDetailParam questionDetailParam = this.f119994f;
        if (questionDetailParam != null) {
            i2 = questionDetailParam.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "HeaderParam(headerType=" + this.f119989a + ", attrsType=" + this.f119990b + ", buttonType=" + this.f119991c + ", enterFrom=" + this.f119992d + ", processId=" + this.f119993e + ", detailParam=" + this.f119994f + ")";
    }

    public /* synthetic */ c(String str, String str2, QuestionDetailParam questionDetailParam) {
        this(d.TYPE_NORMAL, a.TYPE_LINK, b.TYPE_NORMAL, str, str2, questionDetailParam);
    }

    private c(d dVar, a aVar, b bVar, String str, String str2, QuestionDetailParam questionDetailParam) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(questionDetailParam, "");
        this.f119989a = dVar;
        this.f119990b = aVar;
        this.f119991c = bVar;
        this.f119992d = str;
        this.f119993e = str2;
        this.f119994f = questionDetailParam;
    }
}
