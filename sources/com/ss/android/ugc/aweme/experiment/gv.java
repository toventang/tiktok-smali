package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class gv {
    @c(a = "source_language")

    /* renamed from: a  reason: collision with root package name */
    public String f90169a;
    @c(a = "target_language")

    /* renamed from: b  reason: collision with root package name */
    public String f90170b;
    @c(a = "version")

    /* renamed from: c  reason: collision with root package name */
    public String f90171c;

    static {
        Covode.recordClassIndex(56567);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return l.a(this.f90169a, gvVar.f90169a) && l.a(this.f90170b, gvVar.f90170b) && l.a(this.f90171c, gvVar.f90171c);
    }

    public final int hashCode() {
        String str = this.f90169a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90170b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90171c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SubtitleType(sourceLanguage=" + this.f90169a + ", targetLanguage=" + this.f90170b + ", version=" + this.f90171c + ")";
    }

    public /* synthetic */ gv() {
        this("", "", "");
    }

    private gv(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f90169a = str;
        this.f90170b = str2;
        this.f90171c = str3;
    }
}
