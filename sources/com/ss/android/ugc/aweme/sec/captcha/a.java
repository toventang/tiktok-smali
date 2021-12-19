package com.ss.android.ugc.aweme.sec.captcha;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f121801a;

    /* renamed from: b  reason: collision with root package name */
    public int f121802b;

    /* renamed from: c  reason: collision with root package name */
    public String f121803c;

    /* renamed from: d  reason: collision with root package name */
    public String f121804d;

    /* renamed from: e  reason: collision with root package name */
    public String f121805e;

    /* renamed from: f  reason: collision with root package name */
    public String f121806f;

    /* renamed from: g  reason: collision with root package name */
    public String f121807g;

    /* renamed from: h  reason: collision with root package name */
    public int f121808h;

    static {
        Covode.recordClassIndex(79319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f121801a, aVar.f121801a) && this.f121802b == aVar.f121802b && l.a(this.f121803c, aVar.f121803c) && l.a(this.f121804d, aVar.f121804d) && l.a(this.f121805e, aVar.f121805e) && l.a(this.f121806f, aVar.f121806f) && l.a(this.f121807g, aVar.f121807g) && this.f121808h == aVar.f121808h;
    }

    public final int hashCode() {
        String str = this.f121801a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f121802b) * 31;
        String str2 = this.f121803c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f121804d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f121805e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f121806f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f121807g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return ((hashCode5 + i2) * 31) + this.f121808h;
    }

    public final String toString() {
        return "CaptchaParams(language=" + this.f121801a + ", aid=" + this.f121802b + ", appName=" + this.f121803c + ", iid=" + this.f121804d + ", did=" + this.f121805e + ", channel=" + this.f121806f + ", session=" + this.f121807g + ", errorCode=" + this.f121808h + ")";
    }

    public final void a(String str) {
        l.d(str, "");
        this.f121804d = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f121805e = str;
    }

    private a(String str, int i2, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.f121801a = str;
        this.f121802b = i2;
        this.f121803c = str2;
        this.f121804d = str3;
        this.f121805e = str4;
        this.f121806f = str5;
        this.f121807g = str6;
        this.f121808h = 3058;
    }

    public /* synthetic */ a(String str, int i2, String str2, String str3, String str4, String str5, String str6, byte b2) {
        this(str, i2, str2, str3, str4, str5, str6);
    }
}
