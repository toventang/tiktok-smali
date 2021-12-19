package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;

public final class i {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public String f93347a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public String f93348b;
    @c(a = "cancel_text")

    /* renamed from: c  reason: collision with root package name */
    public String f93349c;
    @c(a = "submit_text")

    /* renamed from: d  reason: collision with root package name */
    public String f93350d;
    @c(a = "questions")

    /* renamed from: e  reason: collision with root package name */
    public s[] f93351e;

    static {
        Covode.recordClassIndex(59167);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f93347a, iVar.f93347a) && l.a(this.f93348b, iVar.f93348b) && l.a(this.f93349c, iVar.f93349c) && l.a(this.f93350d, iVar.f93350d) && l.a(this.f93351e, iVar.f93351e);
    }

    public final int hashCode() {
        String str = this.f93347a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f93348b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f93349c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f93350d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        s[] sVarArr = this.f93351e;
        if (sVarArr != null) {
            i2 = Arrays.hashCode(sVarArr);
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "FeedSurvey(id=" + this.f93347a + ", title=" + this.f93348b + ", cancelText=" + this.f93349c + ", submitText=" + this.f93350d + ", questions=" + Arrays.toString(this.f93351e) + ")";
    }

    private /* synthetic */ i() {
        this("", "", "", "", null);
    }

    public i(String str, String str2, String str3, String str4, s[] sVarArr) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f93347a = str;
        this.f93348b = str2;
        this.f93349c = str3;
        this.f93350d = str4;
        this.f93351e = sVarArr;
    }
}
