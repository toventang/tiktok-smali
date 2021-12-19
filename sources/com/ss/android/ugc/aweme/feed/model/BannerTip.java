package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class BannerTip implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "banner_txt")
    public String bannerTxt;
    @c(a = "banner_type")
    public int bannerType;
    @c(a = "link_txt")
    public String linkTxt;
    @c(a = "link_type")
    public int linkType;
    @c(a = "link_url")
    public String linkUrl;

    static {
        Covode.recordClassIndex(59345);
    }

    public BannerTip() {
    }

    public static int com_ss_android_ugc_aweme_feed_model_BannerTip_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ BannerTip copy$default(BannerTip bannerTip, int i2, String str, int i3, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = bannerTip.bannerType;
        }
        if ((i4 & 2) != 0) {
            str = bannerTip.bannerTxt;
        }
        if ((i4 & 4) != 0) {
            i3 = bannerTip.linkType;
        }
        if ((i4 & 8) != 0) {
            str2 = bannerTip.linkUrl;
        }
        if ((i4 & 16) != 0) {
            str3 = bannerTip.linkTxt;
        }
        return bannerTip.copy(i2, str, i3, str2, str3);
    }

    public final int component1() {
        return this.bannerType;
    }

    public final String component2() {
        return this.bannerTxt;
    }

    public final int component3() {
        return this.linkType;
    }

    public final String component4() {
        return this.linkUrl;
    }

    public final String component5() {
        return this.linkTxt;
    }

    public final BannerTip copy(int i2, String str, int i3, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new BannerTip(i2, str, i3, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerTip)) {
            return false;
        }
        BannerTip bannerTip = (BannerTip) obj;
        return this.bannerType == bannerTip.bannerType && l.a(this.bannerTxt, bannerTip.bannerTxt) && this.linkType == bannerTip.linkType && l.a(this.linkUrl, bannerTip.linkUrl) && l.a(this.linkTxt, bannerTip.linkTxt);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_BannerTip_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_BannerTip_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.bannerType) * 31;
        String str = this.bannerTxt;
        int i2 = 0;
        int hashCode = (((com_ss_android_ugc_aweme_feed_model_BannerTip_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_BannerTip_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.linkType)) * 31;
        String str2 = this.linkUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.linkTxt;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BannerTip(bannerType=" + this.bannerType + ", bannerTxt=" + this.bannerTxt + ", linkType=" + this.linkType + ", linkUrl=" + this.linkUrl + ", linkTxt=" + this.linkTxt + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59346);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getBannerTxt() {
        return this.bannerTxt;
    }

    public final int getBannerType() {
        return this.bannerType;
    }

    public final String getLinkTxt() {
        return this.linkTxt;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public BannerTip(int i2, String str, int i3, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.bannerType = i2;
        this.bannerTxt = str;
        this.linkType = i3;
        this.linkUrl = str2;
        this.linkTxt = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BannerTip(int r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r4 = r10
            r2 = r8
            r0 = r12 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0009
            r2 = r5
        L_0x0009:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x000e
            r4 = r5
        L_0x000e:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0019
        L_0x0012:
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0019:
            r5 = r11
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.BannerTip.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
