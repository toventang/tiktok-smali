package com.ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ComposerBeautyBuriedInfoCopy {
    @c(a = "beautify_info")
    private final List<BeautifyInfo> beautifyInfo;
    @c(a = "beautify_used")
    private final int beautifyUsed;
    @c(a = "beautify_on")
    private final int beautyStatus;
    @c(a = "is_composer")
    private final int modeChosen;

    static {
        Covode.recordClassIndex(49440);
    }

    public ComposerBeautyBuriedInfoCopy() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerBeautyBuriedInfoCopy copy$default(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = composerBeautyBuriedInfoCopy.beautifyUsed;
        }
        if ((i5 & 2) != 0) {
            i3 = composerBeautyBuriedInfoCopy.getModeChosen();
        }
        if ((i5 & 4) != 0) {
            i4 = composerBeautyBuriedInfoCopy.getBeautyStatus();
        }
        if ((i5 & 8) != 0) {
            list = composerBeautyBuriedInfoCopy.beautifyInfo;
        }
        return composerBeautyBuriedInfoCopy.copy(i2, i3, i4, list);
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

    public final ComposerBeautyBuriedInfoCopy copy(int i2, int i3, int i4, List<BeautifyInfo> list) {
        l.d(list, "");
        return new ComposerBeautyBuriedInfoCopy(i2, i3, i4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfoCopy)) {
            return false;
        }
        ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy = (ComposerBeautyBuriedInfoCopy) obj;
        return this.beautifyUsed == composerBeautyBuriedInfoCopy.beautifyUsed && getModeChosen() == composerBeautyBuriedInfoCopy.getModeChosen() && getBeautyStatus() == composerBeautyBuriedInfoCopy.getBeautyStatus() && l.a(this.beautifyInfo, composerBeautyBuriedInfoCopy.beautifyInfo);
    }

    public final int hashCode() {
        int modeChosen2 = ((((this.beautifyUsed * 31) + getModeChosen()) * 31) + getBeautyStatus()) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return modeChosen2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ComposerBeautyBuriedInfoCopy(beautifyUsed=" + this.beautifyUsed + ", modeChosen=" + getModeChosen() + ", beautyStatus=" + getBeautyStatus() + ", beautifyInfo=" + this.beautifyInfo + ")";
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    public final int getBeautyStatus() {
        return this.beautyStatus;
    }

    public final int getModeChosen() {
        return this.modeChosen;
    }

    public ComposerBeautyBuriedInfoCopy(int i2, int i3, int i4, List<BeautifyInfo> list) {
        l.d(list, "");
        this.beautifyUsed = i2;
        this.modeChosen = i3;
        this.beautyStatus = i4;
        this.beautifyInfo = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyBuriedInfoCopy(int i2, int i3, int i4, List list, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? new ArrayList() : list);
    }
}
