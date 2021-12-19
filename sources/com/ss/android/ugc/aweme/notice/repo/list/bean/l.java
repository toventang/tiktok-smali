package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public final class l {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f112871a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public final String f112872b;
    @c(a = "schema_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f112873c;
    @c(a = "log_extra")

    /* renamed from: d  reason: collision with root package name */
    public final String f112874d;
    @c(a = "source_type")

    /* renamed from: e  reason: collision with root package name */
    public final int f112875e;
    @c(a = "source_name")

    /* renamed from: f  reason: collision with root package name */
    public final String f112876f;
    @c(a = "source_icon")

    /* renamed from: g  reason: collision with root package name */
    public final UrlModel f112877g;

    static {
        Covode.recordClassIndex(72557);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f112871a, lVar.f112871a) && h.f.b.l.a(this.f112872b, lVar.f112872b) && h.f.b.l.a(this.f112873c, lVar.f112873c) && h.f.b.l.a(this.f112874d, lVar.f112874d) && this.f112875e == lVar.f112875e && h.f.b.l.a(this.f112876f, lVar.f112876f) && h.f.b.l.a(this.f112877g, lVar.f112877g);
    }

    public final int hashCode() {
        String str = this.f112871a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112872b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112873c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f112874d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f112875e) * 31;
        String str5 = this.f112876f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f112877g;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "TcmNotice(title=" + this.f112871a + ", content=" + this.f112872b + ", schemaUrl=" + this.f112873c + ", logExtra=" + this.f112874d + ", sourceType=" + this.f112875e + ", sourceName=" + this.f112876f + ", sourceIcon=" + this.f112877g + ")";
    }

    private /* synthetic */ l() {
        this("", "", "", "", "");
    }

    private l(String str, String str2, String str3, String str4, String str5) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(str4, "");
        h.f.b.l.d(str5, "");
        this.f112871a = str;
        this.f112872b = str2;
        this.f112873c = str3;
        this.f112874d = str4;
        this.f112875e = 0;
        this.f112876f = str5;
        this.f112877g = null;
    }
}
