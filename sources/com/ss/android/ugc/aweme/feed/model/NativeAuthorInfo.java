package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class NativeAuthorInfo implements Serializable {
    @c(a = "auto_pull_up")
    private int autoPullStyle;
    @c(a = "bottom_banner")
    private BottomBanner bottomBanner;

    static {
        Covode.recordClassIndex(59424);
    }

    public NativeAuthorInfo() {
        this(null, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_NativeAuthorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ NativeAuthorInfo copy$default(NativeAuthorInfo nativeAuthorInfo, BottomBanner bottomBanner2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bottomBanner2 = nativeAuthorInfo.bottomBanner;
        }
        if ((i3 & 2) != 0) {
            i2 = nativeAuthorInfo.autoPullStyle;
        }
        return nativeAuthorInfo.copy(bottomBanner2, i2);
    }

    public final BottomBanner component1() {
        return this.bottomBanner;
    }

    public final int component2() {
        return this.autoPullStyle;
    }

    public final NativeAuthorInfo copy(BottomBanner bottomBanner2, int i2) {
        return new NativeAuthorInfo(bottomBanner2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAuthorInfo)) {
            return false;
        }
        NativeAuthorInfo nativeAuthorInfo = (NativeAuthorInfo) obj;
        return l.a(this.bottomBanner, nativeAuthorInfo.bottomBanner) && this.autoPullStyle == nativeAuthorInfo.autoPullStyle;
    }

    public final int hashCode() {
        BottomBanner bottomBanner2 = this.bottomBanner;
        return ((bottomBanner2 != null ? bottomBanner2.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_NativeAuthorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.autoPullStyle);
    }

    public final String toString() {
        return "NativeAuthorInfo(bottomBanner=" + this.bottomBanner + ", autoPullStyle=" + this.autoPullStyle + ")";
    }

    public final int getAutoPullStyle() {
        return this.autoPullStyle;
    }

    public final BottomBanner getBottomBanner() {
        return this.bottomBanner;
    }

    public final void setAutoPullStyle(int i2) {
        this.autoPullStyle = i2;
    }

    public final void setBottomBanner(BottomBanner bottomBanner2) {
        this.bottomBanner = bottomBanner2;
    }

    public NativeAuthorInfo(BottomBanner bottomBanner2, int i2) {
        this.bottomBanner = bottomBanner2;
        this.autoPullStyle = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeAuthorInfo(BottomBanner bottomBanner2, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : bottomBanner2, (i3 & 2) != 0 ? 0 : i2);
    }
}
