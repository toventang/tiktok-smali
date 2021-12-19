package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class BottomBanner implements Serializable {
    @c(a = "recommend_text")
    private String recommendText;
    @c(a = "show_button_color_seconds")
    private int showButtonColorSeconds;
    @c(a = "version")
    private int version;

    static {
        Covode.recordClassIndex(59351);
    }

    public BottomBanner() {
        this(0, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ BottomBanner copy$default(BottomBanner bottomBanner, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = bottomBanner.showButtonColorSeconds;
        }
        if ((i4 & 2) != 0) {
            i3 = bottomBanner.version;
        }
        if ((i4 & 4) != 0) {
            str = bottomBanner.recommendText;
        }
        return bottomBanner.copy(i2, i3, str);
    }

    public final int component1() {
        return this.showButtonColorSeconds;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.recommendText;
    }

    public final BottomBanner copy(int i2, int i3, String str) {
        l.d(str, "");
        return new BottomBanner(i2, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBanner)) {
            return false;
        }
        BottomBanner bottomBanner = (BottomBanner) obj;
        return this.showButtonColorSeconds == bottomBanner.showButtonColorSeconds && this.version == bottomBanner.version && l.a(this.recommendText, bottomBanner.recommendText);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showButtonColorSeconds) * 31) + com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.version)) * 31;
        String str = this.recommendText;
        return com_ss_android_ugc_aweme_feed_model_BottomBanner_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BottomBanner(showButtonColorSeconds=" + this.showButtonColorSeconds + ", version=" + this.version + ", recommendText=" + this.recommendText + ")";
    }

    public final String getRecommendText() {
        return this.recommendText;
    }

    public final int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setShowButtonColorSeconds(int i2) {
        this.showButtonColorSeconds = i2;
    }

    public final void setVersion(int i2) {
        this.version = i2;
    }

    public final void setRecommendText(String str) {
        l.d(str, "");
        this.recommendText = str;
    }

    public BottomBanner(int i2, int i3, String str) {
        l.d(str, "");
        this.showButtonColorSeconds = i2;
        this.version = i3;
        this.recommendText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomBanner(int i2, int i3, String str, int i4, g gVar) {
        this((i4 & 1) != 0 ? 2 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? "" : str);
    }
}
