package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f78408a;
    @com.google.gson.a.c(a = "image")

    /* renamed from: b  reason: collision with root package name */
    public final UrlModel f78409b;
    @com.google.gson.a.c(a = "is_accessible")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f78410c;
    @com.google.gson.a.c(a = "modal_info")

    /* renamed from: d  reason: collision with root package name */
    public final h f78411d;
    @com.google.gson.a.c(a = StringSet.name)

    /* renamed from: e  reason: collision with root package name */
    public final String f78412e;
    @com.google.gson.a.c(a = "schema")

    /* renamed from: f  reason: collision with root package name */
    public final String f78413f;

    static {
        Covode.recordClassIndex(48693);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f78408a, cVar.f78408a) && l.a(this.f78409b, cVar.f78409b) && l.a(this.f78410c, cVar.f78410c) && l.a(this.f78411d, cVar.f78411d) && l.a(this.f78412e, cVar.f78412e) && l.a(this.f78413f, cVar.f78413f);
    }

    public final int hashCode() {
        Integer num = this.f78408a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        UrlModel urlModel = this.f78409b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        Boolean bool = this.f78410c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        h hVar = this.f78411d;
        int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f78412e;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f78413f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "CreatorPlusFeature(id=" + this.f78408a + ", image=" + this.f78409b + ", isAccessible=" + this.f78410c + ", modalInfo=" + this.f78411d + ", name=" + this.f78412e + ", schema=" + this.f78413f + ")";
    }
}
