package com.ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "survey_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f121655a;
    @c(a = "search_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f121656b;
    @c(a = "keyword")

    /* renamed from: c  reason: collision with root package name */
    public final String f121657c;
    @c(a = "survey_answer_rating")

    /* renamed from: d  reason: collision with root package name */
    public final int f121658d;

    static {
        Covode.recordClassIndex(79244);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f121655a, eVar.f121655a) && l.a(this.f121656b, eVar.f121656b) && l.a(this.f121657c, eVar.f121657c) && this.f121658d == eVar.f121658d;
    }

    public final int hashCode() {
        String str = this.f121655a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121656b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f121657c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.f121658d;
    }

    public final String toString() {
        return "SurveySubmitParam(surveyId=" + this.f121655a + ", searchId=" + this.f121656b + ", keyword=" + this.f121657c + ", ratingAnswer=" + this.f121658d + ")";
    }

    public e(String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f121655a = str;
        this.f121656b = str2;
        this.f121657c = str3;
        this.f121658d = i2;
    }
}
