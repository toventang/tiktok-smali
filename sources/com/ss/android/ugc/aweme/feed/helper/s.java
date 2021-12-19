package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.Arrays;

public final class s {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public String f93420a;
    @c(a = StringSet.type)

    /* renamed from: b  reason: collision with root package name */
    public int f93421b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public String f93422c;
    @c(a = "options")

    /* renamed from: d  reason: collision with root package name */
    public p[] f93423d;

    static {
        Covode.recordClassIndex(59193);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f93420a, sVar.f93420a) && this.f93421b == sVar.f93421b && l.a(this.f93422c, sVar.f93422c) && l.a(this.f93423d, sVar.f93423d);
    }

    public final int hashCode() {
        String str = this.f93420a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f93421b) * 31;
        String str2 = this.f93422c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        p[] pVarArr = this.f93423d;
        if (pVarArr != null) {
            i2 = Arrays.hashCode(pVarArr);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Question(id=" + this.f93420a + ", type=" + this.f93421b + ", title=" + this.f93422c + ", options=" + Arrays.toString(this.f93423d) + ")";
    }

    private /* synthetic */ s() {
        this("", 0, "", null);
    }

    public s(String str, int i2, String str2, p[] pVarArr) {
        l.d(str, "");
        l.d(str2, "");
        this.f93420a = str;
        this.f93421b = i2;
        this.f93422c = str2;
        this.f93423d = pVarArr;
    }
}
