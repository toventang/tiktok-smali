package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "language")
    public String language;
    @c(a = "url")
    public UrlModel url;

    static {
        Covode.recordClassIndex(88110);
    }

    public b() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.language;
        }
        if ((i2 & 2) != 0) {
            urlModel = bVar.url;
        }
        return bVar.copy(str, urlModel);
    }

    public final String component1() {
        return this.language;
    }

    public final UrlModel component2() {
        return this.url;
    }

    public final b copy(String str, UrlModel urlModel) {
        return new b(str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.language, bVar.language) && l.a(this.url, bVar.url);
    }

    public final int hashCode() {
        String str = this.language;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.url;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AutocaptionType(language=" + this.language + ", url=" + this.url + ")";
    }

    public final String getLanguage() {
        return this.language;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public b(String str, UrlModel urlModel) {
        this.language = str;
        this.url = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, UrlModel urlModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : urlModel);
    }
}
