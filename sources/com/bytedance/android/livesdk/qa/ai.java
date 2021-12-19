package com.bytedance.android.livesdk.qa;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ai {
    @c(a = "unanswered_list")

    /* renamed from: a  reason: collision with root package name */
    public final ah f20356a;
    @c(a = "answered_list")

    /* renamed from: b  reason: collision with root package name */
    public ah f20357b;
    @c(a = "current_question")

    /* renamed from: c  reason: collision with root package name */
    public af f20358c;

    static {
        Covode.recordClassIndex(12017);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return l.a(this.f20356a, aiVar.f20356a) && l.a(this.f20357b, aiVar.f20357b) && l.a(this.f20358c, aiVar.f20358c);
    }

    public final int hashCode() {
        ah ahVar = this.f20356a;
        int i2 = 0;
        int hashCode = (ahVar != null ? ahVar.hashCode() : 0) * 31;
        ah ahVar2 = this.f20357b;
        int hashCode2 = (hashCode + (ahVar2 != null ? ahVar2.hashCode() : 0)) * 31;
        af afVar = this.f20358c;
        if (afVar != null) {
            i2 = afVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "QuestionListResponse(unansweredList=" + this.f20356a + ", answeredList=" + this.f20357b + ", currentQuestion=" + this.f20358c + ")";
    }

    private /* synthetic */ ai() {
        this(new ah(), new ah(), new af(null, 7));
    }

    private ai(ah ahVar, ah ahVar2, af afVar) {
        l.d(ahVar, "");
        l.d(ahVar2, "");
        l.d(afVar, "");
        this.f20356a = ahVar;
        this.f20357b = ahVar2;
        this.f20358c = afVar;
    }
}
