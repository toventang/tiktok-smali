package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ae {
    @c(a = "need_popup")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f104820a;
    @c(a = "header")

    /* renamed from: b  reason: collision with root package name */
    public final String f104821b;
    @c(a = "title1")

    /* renamed from: c  reason: collision with root package name */
    public final String f104822c;
    @c(a = "desc1")

    /* renamed from: d  reason: collision with root package name */
    public final String f104823d;
    @c(a = "title2")

    /* renamed from: e  reason: collision with root package name */
    public final String f104824e;
    @c(a = "desc2")

    /* renamed from: f  reason: collision with root package name */
    public final String f104825f;
    @c(a = "footer")

    /* renamed from: g  reason: collision with root package name */
    public final String f104826g;

    static {
        Covode.recordClassIndex(67230);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return l.a(this.f104820a, aeVar.f104820a) && l.a(this.f104821b, aeVar.f104821b) && l.a(this.f104822c, aeVar.f104822c) && l.a(this.f104823d, aeVar.f104823d) && l.a(this.f104824e, aeVar.f104824e) && l.a(this.f104825f, aeVar.f104825f) && l.a(this.f104826g, aeVar.f104826g);
    }

    public final int hashCode() {
        Boolean bool = this.f104820a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f104821b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f104822c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104823d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104824e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104825f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f104826g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "PersAdStruct(needPopup=" + this.f104820a + ", header=" + this.f104821b + ", title1=" + this.f104822c + ", desc1=" + this.f104823d + ", title2=" + this.f104824e + ", desc2=" + this.f104825f + ", footer=" + this.f104826g + ")";
    }

    private /* synthetic */ ae() {
        this(false, "", "", "", "", "", "");
    }

    private ae(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f104820a = bool;
        this.f104821b = str;
        this.f104822c = str2;
        this.f104823d = str3;
        this.f104824e = str4;
        this.f104825f = str5;
        this.f104826g = str6;
    }
}
