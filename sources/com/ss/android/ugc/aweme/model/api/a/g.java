package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class g implements Serializable {
    @c(a = "static_image_larger")
    private UrlModel staticImageUrl;
    @c(a = "static_image_thumbnail")
    private UrlModel thumbnailUrl;
    @c(a = StringSet.type)
    private String type;

    static {
        Covode.recordClassIndex(71043);
    }

    public static /* synthetic */ g copy$default(g gVar, String str, UrlModel urlModel, UrlModel urlModel2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gVar.type;
        }
        if ((i2 & 2) != 0) {
            urlModel = gVar.staticImageUrl;
        }
        if ((i2 & 4) != 0) {
            urlModel2 = gVar.thumbnailUrl;
        }
        return gVar.copy(str, urlModel, urlModel2);
    }

    public final String component1() {
        return this.type;
    }

    public final UrlModel component2() {
        return this.staticImageUrl;
    }

    public final UrlModel component3() {
        return this.thumbnailUrl;
    }

    public final g copy(String str, UrlModel urlModel, UrlModel urlModel2) {
        return new g(str, urlModel, urlModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.type, gVar.type) && l.a(this.staticImageUrl, gVar.staticImageUrl) && l.a(this.thumbnailUrl, gVar.thumbnailUrl);
    }

    public final int hashCode() {
        String str = this.type;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.staticImageUrl;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.thumbnailUrl;
        if (urlModel2 != null) {
            i2 = urlModel2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ProfileNaviStaticImageDataModel(type=" + this.type + ", staticImageUrl=" + this.staticImageUrl + ", thumbnailUrl=" + this.thumbnailUrl + ")";
    }

    public final UrlModel getStaticImageUrl() {
        return this.staticImageUrl;
    }

    public final UrlModel getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final void setStaticImageUrl(UrlModel urlModel) {
        this.staticImageUrl = urlModel;
    }

    public final void setThumbnailUrl(UrlModel urlModel) {
        this.thumbnailUrl = urlModel;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public g(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.type = str;
        this.staticImageUrl = urlModel;
        this.thumbnailUrl = urlModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, UrlModel urlModel, UrlModel urlModel2, int i2, h.f.b.g gVar) {
        this(str, (i2 & 2) != 0 ? null : urlModel, urlModel2);
    }
}
