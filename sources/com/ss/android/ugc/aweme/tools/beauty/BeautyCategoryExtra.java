package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class BeautyCategoryExtra {
    @c(a = "ab_group")
    private final String abGroup;
    @c(a = "category_default")
    private boolean beautyModeDefault;
    @c(a = "categoryid")
    private String categoryId;
    @c(a = "default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f346default;
    @c(a = "exclusive")
    private final boolean exclusive;
    @c(a = "panel_type")
    private final String panelType;
    @c(a = "parentid")
    private String parentId;
    @c(a = "Primary_panel_icon")
    private String primaryPanelIcon;
    @c(a = "primary_panel_icon_list")
    private List<String> primaryPanelIconList;
    @c(a = "Primary_panel_name")
    private String primaryPanelName;
    @c(a = "region_3")
    private final boolean regionM;
    @c(a = "region_2")
    private final boolean regionT;
    @c(a = "showSwitch")
    private boolean showSwitch;
    @c(a = "showTips")
    private boolean showTips;

    static {
        Covode.recordClassIndex(90765);
    }

    public BeautyCategoryExtra() {
        this(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null);
    }

    public static /* synthetic */ BeautyCategoryExtra copy$default(BeautyCategoryExtra beautyCategoryExtra, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List list, String str6, boolean z7, int i2, Object obj) {
        String str7 = str;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        String str8 = str2;
        boolean z11 = z4;
        boolean z12 = z5;
        boolean z13 = z6;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        List list2 = list;
        String str12 = str6;
        boolean z14 = z7;
        if ((i2 & 1) != 0) {
            str7 = beautyCategoryExtra.abGroup;
        }
        if ((i2 & 2) != 0) {
            z8 = beautyCategoryExtra.regionT;
        }
        if ((i2 & 4) != 0) {
            z9 = beautyCategoryExtra.regionM;
        }
        if ((i2 & 8) != 0) {
            z10 = beautyCategoryExtra.f346default;
        }
        if ((i2 & 16) != 0) {
            str8 = beautyCategoryExtra.panelType;
        }
        if ((i2 & 32) != 0) {
            z11 = beautyCategoryExtra.exclusive;
        }
        if ((i2 & 64) != 0) {
            z12 = beautyCategoryExtra.showTips;
        }
        if ((i2 & 128) != 0) {
            z13 = beautyCategoryExtra.showSwitch;
        }
        if ((i2 & 256) != 0) {
            str9 = beautyCategoryExtra.categoryId;
        }
        if ((i2 & 512) != 0) {
            str10 = beautyCategoryExtra.parentId;
        }
        if ((i2 & 1024) != 0) {
            str11 = beautyCategoryExtra.primaryPanelIcon;
        }
        if ((i2 & 2048) != 0) {
            list2 = beautyCategoryExtra.primaryPanelIconList;
        }
        if ((i2 & 4096) != 0) {
            str12 = beautyCategoryExtra.primaryPanelName;
        }
        if ((i2 & 8192) != 0) {
            z14 = beautyCategoryExtra.beautyModeDefault;
        }
        return beautyCategoryExtra.copy(str7, z8, z9, z10, str8, z11, z12, z13, str9, str10, str11, list2, str12, z14);
    }

    public final String component1() {
        return this.abGroup;
    }

    public final String component10() {
        return this.parentId;
    }

    public final String component11() {
        return this.primaryPanelIcon;
    }

    public final List<String> component12() {
        return this.primaryPanelIconList;
    }

    public final String component13() {
        return this.primaryPanelName;
    }

    public final boolean component14() {
        return this.beautyModeDefault;
    }

    public final boolean component2() {
        return this.regionT;
    }

    public final boolean component3() {
        return this.regionM;
    }

    public final boolean component4() {
        return this.f346default;
    }

    public final String component5() {
        return this.panelType;
    }

    public final boolean component6() {
        return this.exclusive;
    }

    public final boolean component7() {
        return this.showTips;
    }

    public final boolean component8() {
        return this.showSwitch;
    }

    public final String component9() {
        return this.categoryId;
    }

    public final BeautyCategoryExtra copy(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List<String> list, String str6, boolean z7) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(str6, "");
        return new BeautyCategoryExtra(str, z, z2, z3, str2, z4, z5, z6, str3, str4, str5, list, str6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyCategoryExtra)) {
            return false;
        }
        BeautyCategoryExtra beautyCategoryExtra = (BeautyCategoryExtra) obj;
        return l.a(this.abGroup, beautyCategoryExtra.abGroup) && this.regionT == beautyCategoryExtra.regionT && this.regionM == beautyCategoryExtra.regionM && this.f346default == beautyCategoryExtra.f346default && l.a(this.panelType, beautyCategoryExtra.panelType) && this.exclusive == beautyCategoryExtra.exclusive && this.showTips == beautyCategoryExtra.showTips && this.showSwitch == beautyCategoryExtra.showSwitch && l.a(this.categoryId, beautyCategoryExtra.categoryId) && l.a(this.parentId, beautyCategoryExtra.parentId) && l.a(this.primaryPanelIcon, beautyCategoryExtra.primaryPanelIcon) && l.a(this.primaryPanelIconList, beautyCategoryExtra.primaryPanelIconList) && l.a(this.primaryPanelName, beautyCategoryExtra.primaryPanelName) && this.beautyModeDefault == beautyCategoryExtra.beautyModeDefault;
    }

    public final int hashCode() {
        String str = this.abGroup;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.regionT;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.regionM;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f346default;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        String str2 = this.panelType;
        int hashCode2 = (i15 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z4 = this.exclusive;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (hashCode2 + i16) * 31;
        boolean z5 = this.showTips;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.showSwitch;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        String str3 = this.categoryId;
        int hashCode3 = (i27 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.parentId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.primaryPanelIcon;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.primaryPanelIconList;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.primaryPanelName;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i28 = (hashCode6 + i2) * 31;
        if (!this.beautyModeDefault) {
            i3 = 0;
        }
        return i28 + i3;
    }

    public final String toString() {
        return "BeautyCategoryExtra(abGroup=" + this.abGroup + ", regionT=" + this.regionT + ", regionM=" + this.regionM + ", default=" + this.f346default + ", panelType=" + this.panelType + ", exclusive=" + this.exclusive + ", showTips=" + this.showTips + ", showSwitch=" + this.showSwitch + ", categoryId=" + this.categoryId + ", parentId=" + this.parentId + ", primaryPanelIcon=" + this.primaryPanelIcon + ", primaryPanelIconList=" + this.primaryPanelIconList + ", primaryPanelName=" + this.primaryPanelName + ", beautyModeDefault=" + this.beautyModeDefault + ")";
    }

    public final String getAbGroup() {
        return this.abGroup;
    }

    public final boolean getBeautyModeDefault() {
        return this.beautyModeDefault;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean getDefault() {
        return this.f346default;
    }

    public final boolean getExclusive() {
        return this.exclusive;
    }

    public final String getPanelType() {
        return this.panelType;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPrimaryPanelIcon() {
        return this.primaryPanelIcon;
    }

    public final List<String> getPrimaryPanelIconList() {
        return this.primaryPanelIconList;
    }

    public final String getPrimaryPanelName() {
        return this.primaryPanelName;
    }

    public final boolean getRegionM() {
        return this.regionM;
    }

    public final boolean getRegionT() {
        return this.regionT;
    }

    public final boolean getShowSwitch() {
        return this.showSwitch;
    }

    public final boolean getShowTips() {
        return this.showTips;
    }

    public final void setBeautyModeDefault(boolean z) {
        this.beautyModeDefault = z;
    }

    public final void setShowSwitch(boolean z) {
        this.showSwitch = z;
    }

    public final void setShowTips(boolean z) {
        this.showTips = z;
    }

    public final void setCategoryId(String str) {
        l.d(str, "");
        this.categoryId = str;
    }

    public final void setParentId(String str) {
        l.d(str, "");
        this.parentId = str;
    }

    public final void setPrimaryPanelIcon(String str) {
        l.d(str, "");
        this.primaryPanelIcon = str;
    }

    public final void setPrimaryPanelIconList(List<String> list) {
        l.d(list, "");
        this.primaryPanelIconList = list;
    }

    public final void setPrimaryPanelName(String str) {
        l.d(str, "");
        this.primaryPanelName = str;
    }

    public BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List<String> list, String str6, boolean z7) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(str6, "");
        this.abGroup = str;
        this.regionT = z;
        this.regionM = z2;
        this.f346default = z3;
        this.panelType = str2;
        this.exclusive = z4;
        this.showTips = z5;
        this.showSwitch = z6;
        this.categoryId = str3;
        this.parentId = str4;
        this.primaryPanelIcon = str5;
        this.primaryPanelIconList = list;
        this.primaryPanelName = str6;
        this.beautyModeDefault = z7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BeautyCategoryExtra(java.lang.String r17, boolean r18, boolean r19, boolean r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, java.lang.String r29, boolean r30, int r31, h.f.b.g r32) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra.<init>(java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, int, h.f.b.g):void");
    }
}
