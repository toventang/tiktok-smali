package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class j {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f112864a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public final String f112865b;
    @c(a = "schema_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f112866c;
    @c(a = "image_url")

    /* renamed from: d  reason: collision with root package name */
    public final UrlModel f112867d;

    static {
        Covode.recordClassIndex(72555);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f112864a, jVar.f112864a) && l.a(this.f112865b, jVar.f112865b) && l.a(this.f112866c, jVar.f112866c) && l.a(this.f112867d, jVar.f112867d);
    }

    public final int hashCode() {
        String str = this.f112864a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112865b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112866c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f112867d;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PromoteNotice(title=" + this.f112864a + ", content=" + this.f112865b + ", schemaUrl=" + this.f112866c + ", imageUrl=" + this.f112867d + ")";
    }

    private /* synthetic */ j() {
        this("", "", "");
    }

    private j(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f112864a = str;
        this.f112865b = str2;
        this.f112866c = str3;
        this.f112867d = null;
    }
}
