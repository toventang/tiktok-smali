package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "background_color")
    private final String backgroundColorHex;
    @c(a = "dynamic_profile_image")
    private final UrlModel dynamicImageUrlModel;
    @c(a = "navi_id")
    private final String naviId;
    @c(a = "static_profile_image")
    private final UrlModel staticImageUrlModel;

    static {
        Covode.recordClassIndex(71039);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, UrlModel urlModel, UrlModel urlModel2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.naviId;
        }
        if ((i2 & 2) != 0) {
            urlModel = dVar.staticImageUrlModel;
        }
        if ((i2 & 4) != 0) {
            urlModel2 = dVar.dynamicImageUrlModel;
        }
        if ((i2 & 8) != 0) {
            str2 = dVar.backgroundColorHex;
        }
        return dVar.copy(str, urlModel, urlModel2, str2);
    }

    public final String component1() {
        return this.naviId;
    }

    public final UrlModel component2() {
        return this.staticImageUrlModel;
    }

    public final UrlModel component3() {
        return this.dynamicImageUrlModel;
    }

    public final String component4() {
        return this.backgroundColorHex;
    }

    public final d copy(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        return new d(str, urlModel, urlModel2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.naviId, dVar.naviId) && l.a(this.staticImageUrlModel, dVar.staticImageUrlModel) && l.a(this.dynamicImageUrlModel, dVar.dynamicImageUrlModel) && l.a(this.backgroundColorHex, dVar.backgroundColorHex);
    }

    public final int hashCode() {
        String str = this.naviId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.staticImageUrlModel;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.dynamicImageUrlModel;
        int hashCode3 = (hashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str2 = this.backgroundColorHex;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProfileNaviImageDataModel(naviId=" + this.naviId + ", staticImageUrlModel=" + this.staticImageUrlModel + ", dynamicImageUrlModel=" + this.dynamicImageUrlModel + ", backgroundColorHex=" + this.backgroundColorHex + ")";
    }

    public final String getBackgroundColorHex() {
        return this.backgroundColorHex;
    }

    public final UrlModel getDynamicImageUrlModel() {
        return this.dynamicImageUrlModel;
    }

    public final String getNaviId() {
        return this.naviId;
    }

    public final UrlModel getStaticImageUrlModel() {
        return this.staticImageUrlModel;
    }

    public d(String str, UrlModel urlModel, UrlModel urlModel2, String str2) {
        this.naviId = str;
        this.staticImageUrlModel = urlModel;
        this.dynamicImageUrlModel = urlModel2;
        this.backgroundColorHex = str2;
    }
}
