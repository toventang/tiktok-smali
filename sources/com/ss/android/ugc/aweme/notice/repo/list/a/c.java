package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "avatar_image_url")

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f112802a;
    @com.google.gson.a.c(a = "avatar_schema_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f112803b;
    @com.google.gson.a.c(a = "middle_type")

    /* renamed from: c  reason: collision with root package name */
    public final int f112804c;
    @com.google.gson.a.c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public final f f112805d;
    @com.google.gson.a.c(a = "label")

    /* renamed from: e  reason: collision with root package name */
    public final b f112806e;
    @com.google.gson.a.c(a = "content")

    /* renamed from: f  reason: collision with root package name */
    public final String f112807f;
    @com.google.gson.a.c(a = "event")

    /* renamed from: g  reason: collision with root package name */
    public final String f112808g;
    @com.google.gson.a.c(a = "quote_content")

    /* renamed from: h  reason: collision with root package name */
    public final String f112809h;
    @com.google.gson.a.c(a = "quote_image")

    /* renamed from: i  reason: collision with root package name */
    public final UrlModel f112810i;
    @com.google.gson.a.c(a = "middle_schema_url")

    /* renamed from: j  reason: collision with root package name */
    public final String f112811j;
    @com.google.gson.a.c(a = "right_type")

    /* renamed from: k  reason: collision with root package name */
    public final int f112812k;
    @com.google.gson.a.c(a = "image_url")

    /* renamed from: l  reason: collision with root package name */
    public final UrlModel f112813l;
    @com.google.gson.a.c(a = "button_content")

    /* renamed from: m  reason: collision with root package name */
    public final String f112814m;
    @com.google.gson.a.c(a = "button_type")
    public final Integer n;
    @com.google.gson.a.c(a = "right_schema_url")
    public final String o;
    @com.google.gson.a.c(a = "content_text_link_configs")
    public final List<e> p;
    @com.google.gson.a.c(a = "buttons")
    public final List<d> q;

    static {
        Covode.recordClassIndex(72509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f112802a, cVar.f112802a) && l.a(this.f112803b, cVar.f112803b) && this.f112804c == cVar.f112804c && l.a(this.f112805d, cVar.f112805d) && l.a(this.f112806e, cVar.f112806e) && l.a(this.f112807f, cVar.f112807f) && l.a(this.f112808g, cVar.f112808g) && l.a(this.f112809h, cVar.f112809h) && l.a(this.f112810i, cVar.f112810i) && l.a(this.f112811j, cVar.f112811j) && this.f112812k == cVar.f112812k && l.a(this.f112813l, cVar.f112813l) && l.a(this.f112814m, cVar.f112814m) && l.a(this.n, cVar.n) && l.a(this.o, cVar.o) && l.a(this.p, cVar.p) && l.a(this.q, cVar.q);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f112802a;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f112803b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f112804c) * 31;
        f fVar = this.f112805d;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        b bVar = this.f112806e;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str2 = this.f112807f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112808g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f112809h;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f112810i;
        int hashCode8 = (hashCode7 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str5 = this.f112811j;
        int hashCode9 = (((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f112812k) * 31;
        UrlModel urlModel3 = this.f112813l;
        int hashCode10 = (hashCode9 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str6 = this.f112814m;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.n;
        int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.o;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<e> list = this.p;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        List<d> list2 = this.q;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode14 + i2;
    }

    public final String toString() {
        return "NoticeUITemplate(avatarImageUrl=" + this.f112802a + ", avatarSchemaUrl=" + this.f112803b + ", middleType=" + this.f112804c + ", titleTemplate=" + this.f112805d + ", labelInfo=" + this.f112806e + ", content=" + this.f112807f + ", event=" + this.f112808g + ", quoteContent=" + this.f112809h + ", quoteImage=" + this.f112810i + ", middleSchemaUrl=" + this.f112811j + ", rightType=" + this.f112812k + ", rightImageUrl=" + this.f112813l + ", buttonContent=" + this.f112814m + ", buttonType=" + this.n + ", rightSchemaUrl=" + this.o + ", contentTextLinkConfigs=" + this.p + ", bottomButtons=" + this.q + ")";
    }
}
