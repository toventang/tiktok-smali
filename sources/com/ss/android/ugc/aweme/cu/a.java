package com.ss.android.ugc.aweme.cu;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "dialog_id")

    /* renamed from: a  reason: collision with root package name */
    public int f79085a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public String f79086b;
    @c(a = "question")

    /* renamed from: c  reason: collision with root package name */
    public String f79087c;
    @c(a = "answer1")

    /* renamed from: d  reason: collision with root package name */
    public String f79088d;
    @c(a = "answer2")

    /* renamed from: e  reason: collision with root package name */
    public String f79089e;
    @c(a = "end_title")

    /* renamed from: f  reason: collision with root package name */
    public String f79090f;
    @c(a = "end_sub_title")

    /* renamed from: g  reason: collision with root package name */
    public String f79091g;
    @c(a = "orig_question")

    /* renamed from: h  reason: collision with root package name */
    public String f79092h;
    @c(a = "original_id")

    /* renamed from: i  reason: collision with root package name */
    public int f79093i;
    @c(a = "orig_answer1")

    /* renamed from: j  reason: collision with root package name */
    public String f79094j;
    @c(a = "orig_answer2")

    /* renamed from: k  reason: collision with root package name */
    public String f79095k;

    static {
        Covode.recordClassIndex(49104);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79085a == aVar.f79085a && l.a(this.f79086b, aVar.f79086b) && l.a(this.f79087c, aVar.f79087c) && l.a(this.f79088d, aVar.f79088d) && l.a(this.f79089e, aVar.f79089e) && l.a(this.f79090f, aVar.f79090f) && l.a(this.f79091g, aVar.f79091g) && l.a(this.f79092h, aVar.f79092h) && this.f79093i == aVar.f79093i && l.a(this.f79094j, aVar.f79094j) && l.a(this.f79095k, aVar.f79095k);
    }

    public final int hashCode() {
        int i2 = this.f79085a * 31;
        String str = this.f79086b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f79087c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79088d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f79089e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f79090f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f79091g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f79092h;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f79093i) * 31;
        String str8 = this.f79094j;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f79095k;
        if (str9 != null) {
            i3 = str9.hashCode();
        }
        return hashCode8 + i3;
    }

    public final String toString() {
        return "SurveyData(dialogId=" + this.f79085a + ", title=" + this.f79086b + ", question=" + this.f79087c + ", answer1=" + this.f79088d + ", answer2=" + this.f79089e + ", resultTitle=" + this.f79090f + ", resultDesc=" + this.f79091g + ", originalQuestion=" + this.f79092h + ", originId=" + this.f79093i + ", originAnswer1=" + this.f79094j + ", originAnswer2=" + this.f79095k + ")";
    }
}
