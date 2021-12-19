package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeBubbleInfo implements Serializable {
    @c(a = "biz")
    private final int biz;
    @c(a = "log_extra")
    private final String logExtra;
    @c(a = "scheme_url")
    private final String schemeUrl;
    @c(a = "text")
    private final String text;
    @c(a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(59317);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AwemeBubbleInfo copy$default(AwemeBubbleInfo awemeBubbleInfo, int i2, int i3, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = awemeBubbleInfo.biz;
        }
        if ((i4 & 2) != 0) {
            i3 = awemeBubbleInfo.type;
        }
        if ((i4 & 4) != 0) {
            str = awemeBubbleInfo.text;
        }
        if ((i4 & 8) != 0) {
            str2 = awemeBubbleInfo.schemeUrl;
        }
        if ((i4 & 16) != 0) {
            str3 = awemeBubbleInfo.logExtra;
        }
        return awemeBubbleInfo.copy(i2, i3, str, str2, str3);
    }

    public final int component1() {
        return this.biz;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.schemeUrl;
    }

    public final String component5() {
        return this.logExtra;
    }

    public final AwemeBubbleInfo copy(int i2, int i3, String str, String str2, String str3) {
        return new AwemeBubbleInfo(i2, i3, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeBubbleInfo)) {
            return false;
        }
        AwemeBubbleInfo awemeBubbleInfo = (AwemeBubbleInfo) obj;
        return this.biz == awemeBubbleInfo.biz && this.type == awemeBubbleInfo.type && l.a(this.text, awemeBubbleInfo.text) && l.a(this.schemeUrl, awemeBubbleInfo.schemeUrl) && l.a(this.logExtra, awemeBubbleInfo.logExtra);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.biz) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        String str = this.text;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AwemeBubbleInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schemeUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.logExtra;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AwemeBubbleInfo(biz=" + this.biz + ", type=" + this.type + ", text=" + this.text + ", schemeUrl=" + this.schemeUrl + ", logExtra=" + this.logExtra + ")";
    }

    public final int getBiz() {
        return this.biz;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getSchemeUrl() {
        return this.schemeUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public AwemeBubbleInfo(int i2, int i3, String str, String str2, String str3) {
        this.biz = i2;
        this.type = i3;
        this.text = str;
        this.schemeUrl = str2;
        this.logExtra = str3;
    }
}
