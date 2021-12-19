package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = StringSet.name)
    private String name;
    @c(a = "animation_url")
    private UrlModel url;

    static {
        Covode.recordClassIndex(71036);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.name;
        }
        if ((i2 & 2) != 0) {
            urlModel = aVar.url;
        }
        return aVar.copy(str, urlModel);
    }

    public final String component1() {
        return this.name;
    }

    public final UrlModel component2() {
        return this.url;
    }

    public final a copy(String str, UrlModel urlModel) {
        return new a(str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.name, aVar.name) && l.a(this.url, aVar.url);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.url;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileNaviAnimatedGifDataModel(name=" + this.name + ", url=" + this.url + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public a(String str, UrlModel urlModel) {
        this.name = str;
        this.url = urlModel;
    }
}
