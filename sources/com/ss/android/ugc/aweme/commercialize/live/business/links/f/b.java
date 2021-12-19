package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "cardType")
    private final int cardType;
    @c(a = "gameUrl")
    private final String gameUrl;
    @c(a = "id")
    private final long id;
    @c(a = "isPinned")
    private final boolean isPinned;
    @c(a = "pic")
    private final String pic;
    @c(a = "subtitle")
    private final String subtitle;
    @c(a = "title")
    private final String title;
    @c(a = "url")
    private final String url;

    static {
        Covode.recordClassIndex(46017);
    }

    public static int com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ b copy$default(b bVar, long j2, String str, String str2, String str3, String str4, int i2, String str5, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = bVar.id;
        }
        if ((i3 & 2) != 0) {
            str = bVar.title;
        }
        if ((i3 & 4) != 0) {
            str2 = bVar.subtitle;
        }
        if ((i3 & 8) != 0) {
            str3 = bVar.url;
        }
        if ((i3 & 16) != 0) {
            str4 = bVar.pic;
        }
        if ((i3 & 32) != 0) {
            i2 = bVar.cardType;
        }
        if ((i3 & 64) != 0) {
            str5 = bVar.gameUrl;
        }
        if ((i3 & 128) != 0) {
            z = bVar.isPinned;
        }
        return bVar.copy(j2, str, str2, str3, str4, i2, str5, z);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.pic;
    }

    public final int component6() {
        return this.cardType;
    }

    public final String component7() {
        return this.gameUrl;
    }

    public final boolean component8() {
        return this.isPinned;
    }

    public final b copy(long j2, String str, String str2, String str3, String str4, int i2, String str5, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new b(j2, str, str2, str3, str4, i2, str5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.id == bVar.id && l.a(this.title, bVar.title) && l.a(this.subtitle, bVar.subtitle) && l.a(this.url, bVar.url) && l.a(this.pic, bVar.pic) && this.cardType == bVar.cardType && l.a(this.gameUrl, bVar.gameUrl) && this.isPinned == bVar.isPinned;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31;
        String str = this.title;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.pic;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_commercialize_live_business_links_model_ActiveCard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cardType)) * 31;
        String str5 = this.gameUrl;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.isPinned;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "ActiveCard(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", url=" + this.url + ", pic=" + this.pic + ", cardType=" + this.cardType + ", gameUrl=" + this.gameUrl + ", isPinned=" + this.isPinned + ")";
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final String getGameUrl() {
        return this.gameUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getPic() {
        return this.pic;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public b(long j2, String str, String str2, String str3, String str4, int i2, String str5, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.id = j2;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.pic = str4;
        this.cardType = i2;
        this.gameUrl = str5;
        this.isPinned = z;
    }
}
