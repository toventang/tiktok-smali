package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class AwemeBubbleToastInfo {
    @c(a = "toast_count")
    public final int toastCount;
    @c(a = "toast_type")
    public final String toastType;

    static {
        Covode.recordClassIndex(59318);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemeBubbleToastInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AwemeBubbleToastInfo copy$default(AwemeBubbleToastInfo awemeBubbleToastInfo, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = awemeBubbleToastInfo.toastType;
        }
        if ((i3 & 2) != 0) {
            i2 = awemeBubbleToastInfo.toastCount;
        }
        return awemeBubbleToastInfo.copy(str, i2);
    }

    public final AwemeBubbleToastInfo copy(String str, int i2) {
        l.d(str, "");
        return new AwemeBubbleToastInfo(str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeBubbleToastInfo)) {
            return false;
        }
        AwemeBubbleToastInfo awemeBubbleToastInfo = (AwemeBubbleToastInfo) obj;
        return l.a(this.toastType, awemeBubbleToastInfo.toastType) && this.toastCount == awemeBubbleToastInfo.toastCount;
    }

    public final int hashCode() {
        String str = this.toastType;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeBubbleToastInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.toastCount);
    }

    public final String toString() {
        return "AwemeBubbleToastInfo(toastType=" + this.toastType + ", toastCount=" + this.toastCount + ")";
    }

    public AwemeBubbleToastInfo(String str, int i2) {
        l.d(str, "");
        this.toastType = str;
        this.toastCount = i2;
    }
}
