package com.ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    @c(a = "adjust_info")
    private final List<a> adjustInfoList;
    @c(a = "final_pos")
    private int finalPos;
    @c(a = "is_drop")
    private boolean isDrop;

    static {
        Covode.recordClassIndex(45901);
    }

    public static int com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.feed.timegap.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b copy$default(b bVar, int i2, List list, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = bVar.finalPos;
        }
        if ((i3 & 2) != 0) {
            list = bVar.adjustInfoList;
        }
        if ((i3 & 4) != 0) {
            z = bVar.isDrop;
        }
        return bVar.copy(i2, list, z);
    }

    public final int component1() {
        return this.finalPos;
    }

    public final List<a> component2() {
        return this.adjustInfoList;
    }

    public final boolean component3() {
        return this.isDrop;
    }

    public final b copy(int i2, List<a> list, boolean z) {
        l.d(list, "");
        return new b(i2, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.finalPos == bVar.finalPos && l.a(this.adjustInfoList, bVar.adjustInfoList) && this.isDrop == bVar.isDrop;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.finalPos) * 31;
        List<a> list = this.adjustInfoList;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_feed_timegap_AdExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isDrop;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "AdExtraInfo(finalPos=" + this.finalPos + ", adjustInfoList=" + this.adjustInfoList + ", isDrop=" + this.isDrop + ")";
    }

    public final List<a> getAdjustInfoList() {
        return this.adjustInfoList;
    }

    public final int getFinalPos() {
        return this.finalPos;
    }

    public final boolean isDrop() {
        return this.isDrop;
    }

    public final void setDrop(boolean z) {
        this.isDrop = z;
    }

    public final void setFinalPos(int i2) {
        this.finalPos = i2;
    }

    public b(int i2, List<a> list, boolean z) {
        l.d(list, "");
        this.finalPos = i2;
        this.adjustInfoList = list;
        this.isDrop = z;
    }
}
