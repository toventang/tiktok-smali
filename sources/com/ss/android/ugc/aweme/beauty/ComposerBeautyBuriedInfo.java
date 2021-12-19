package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ComposerBeautyBuriedInfo implements a {
    @c(a = "beautify_info")
    private final List<BeautifyInfo> beautifyInfo;
    @c(a = "beautify_used")
    private final int beautifyUsed;
    @c(a = "beautify_on")
    private final int beautyStatus;
    @c(a = "is_composer")
    private final int modeChosen;

    static {
        Covode.recordClassIndex(42221);
    }

    public ComposerBeautyBuriedInfo() {
        this(0, 0, 0, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerBeautyBuriedInfo copy$default(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = composerBeautyBuriedInfo.beautifyUsed;
        }
        if ((i5 & 2) != 0) {
            i3 = composerBeautyBuriedInfo.getModeChosen();
        }
        if ((i5 & 4) != 0) {
            i4 = composerBeautyBuriedInfo.getBeautyStatus();
        }
        if ((i5 & 8) != 0) {
            list = composerBeautyBuriedInfo.beautifyInfo;
        }
        return composerBeautyBuriedInfo.copy(i2, i3, i4, list);
    }

    public final int component1() {
        return this.beautifyUsed;
    }

    public final int component2() {
        return getModeChosen();
    }

    public final int component3() {
        return getBeautyStatus();
    }

    public final List<BeautifyInfo> component4() {
        return this.beautifyInfo;
    }

    public final ComposerBeautyBuriedInfo copy(int i2, int i3, int i4, List<BeautifyInfo> list) {
        l.d(list, "");
        return new ComposerBeautyBuriedInfo(i2, i3, i4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfo)) {
            return false;
        }
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) obj;
        return this.beautifyUsed == composerBeautyBuriedInfo.beautifyUsed && getModeChosen() == composerBeautyBuriedInfo.getModeChosen() && getBeautyStatus() == composerBeautyBuriedInfo.getBeautyStatus() && l.a(this.beautifyInfo, composerBeautyBuriedInfo.beautifyInfo);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.beautifyUsed) * 31) + com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(getModeChosen())) * 31) + com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(getBeautyStatus())) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ComposerBeautyBuriedInfo(beautifyUsed=" + this.beautifyUsed + ", modeChosen=" + getModeChosen() + ", beautyStatus=" + getBeautyStatus() + ", beautifyInfo=" + this.beautifyInfo + ")";
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    @Override // com.ss.android.ugc.aweme.beauty.a
    public final int getBeautyStatus() {
        return this.beautyStatus;
    }

    public final int getModeChosen() {
        return this.modeChosen;
    }

    public ComposerBeautyBuriedInfo(int i2, int i3, int i4, List<BeautifyInfo> list) {
        l.d(list, "");
        this.beautifyUsed = i2;
        this.modeChosen = i3;
        this.beautyStatus = i4;
        this.beautifyInfo = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyBuriedInfo(int i2, int i3, int i4, List list, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? new ArrayList() : list);
    }
}
