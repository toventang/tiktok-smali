package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class CommerceChallengeBanner implements Serializable {
    @c(a = "icon")
    private final UrlModel icon;
    @c(a = "open_url")
    private final String openUrl;
    @c(a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50885);
    }

    public static /* synthetic */ CommerceChallengeBanner copy$default(CommerceChallengeBanner commerceChallengeBanner, UrlModel urlModel, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = commerceChallengeBanner.icon;
        }
        if ((i2 & 2) != 0) {
            str = commerceChallengeBanner.webUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = commerceChallengeBanner.openUrl;
        }
        return commerceChallengeBanner.copy(urlModel, str, str2);
    }

    public final UrlModel component1() {
        return this.icon;
    }

    public final String component2() {
        return this.webUrl;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final CommerceChallengeBanner copy(UrlModel urlModel, String str, String str2) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        return new CommerceChallengeBanner(urlModel, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceChallengeBanner)) {
            return false;
        }
        CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) obj;
        return l.a(this.icon, commerceChallengeBanner.icon) && l.a(this.webUrl, commerceChallengeBanner.webUrl) && l.a(this.openUrl, commerceChallengeBanner.openUrl);
    }

    public final int hashCode() {
        UrlModel urlModel = this.icon;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.webUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.openUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CommerceChallengeBanner(icon=" + this.icon + ", webUrl=" + this.webUrl + ", openUrl=" + this.openUrl + ")";
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public CommerceChallengeBanner(UrlModel urlModel, String str, String str2) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        this.icon = urlModel;
        this.webUrl = str;
        this.openUrl = str2;
    }
}
