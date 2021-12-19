package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "gecko_channel")
    private final List<String> geckoChannels;
    @com.google.gson.a.c(a = "render_url")
    private final String renderUrl;
    @com.google.gson.a.c(a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(45509);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.renderUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = cVar.webUrl;
        }
        if ((i2 & 4) != 0) {
            list = cVar.geckoChannels;
        }
        return cVar.copy(str, str2, list);
    }

    public final String component1() {
        return this.renderUrl;
    }

    public final String component2() {
        return this.webUrl;
    }

    public final List<String> component3() {
        return this.geckoChannels;
    }

    public final c copy(String str, String str2, List<String> list) {
        return new c(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.renderUrl, cVar.renderUrl) && l.a(this.webUrl, cVar.webUrl) && l.a(this.geckoChannels, cVar.geckoChannels);
    }

    public final int hashCode() {
        String str = this.renderUrl;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.webUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.geckoChannels;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LynxSchema(renderUrl=" + this.renderUrl + ", webUrl=" + this.webUrl + ", geckoChannels=" + this.geckoChannels + ")";
    }

    public final List<String> getGeckoChannels() {
        return this.geckoChannels;
    }

    public final String getRenderUrl() {
        return this.renderUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public c(String str, String str2, List<String> list) {
        this.renderUrl = str;
        this.webUrl = str2;
        this.geckoChannels = list;
    }
}
