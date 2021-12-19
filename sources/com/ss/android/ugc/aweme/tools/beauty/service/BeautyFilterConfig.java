package com.ss.android.ugc.aweme.tools.beauty.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.b.a.b;
import com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import h.f.b.g;
import h.f.b.l;

public final class BeautyFilterConfig {
    public static final a Companion = new a((byte) 0);
    private final int abGroup;
    private boolean autoApplyBeauty;
    private b dataConfig;
    private com.ss.android.ugc.aweme.tools.beauty.a defaultGender;
    private String extraJson;
    private final boolean hasTitle;
    private boolean isConvertKey;
    private int itemShape;
    private NoneComposer noneItem;
    private boolean primaryBeautyPanelEnable;
    private final String sequenceKey;
    private boolean uLike2ComposerTagValueConvert;
    private boolean useResetAll;

    static {
        Covode.recordClassIndex(90994);
    }

    public static /* synthetic */ BeautyFilterConfig copy$default(BeautyFilterConfig beautyFilterConfig, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = beautyFilterConfig.abGroup;
        }
        if ((i3 & 2) != 0) {
            str = beautyFilterConfig.sequenceKey;
        }
        if ((i3 & 4) != 0) {
            z = beautyFilterConfig.hasTitle;
        }
        return beautyFilterConfig.copy(i2, str, z);
    }

    public static /* synthetic */ void getItemShape$annotations() {
    }

    public static /* synthetic */ void getUseResetAll$annotations() {
    }

    public final int component1() {
        return this.abGroup;
    }

    public final String component2() {
        return this.sequenceKey;
    }

    public final boolean component3() {
        return this.hasTitle;
    }

    public final BeautyFilterConfig copy(int i2, String str, boolean z) {
        l.d(str, "");
        return new BeautyFilterConfig(i2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyFilterConfig)) {
            return false;
        }
        BeautyFilterConfig beautyFilterConfig = (BeautyFilterConfig) obj;
        return this.abGroup == beautyFilterConfig.abGroup && l.a(this.sequenceKey, beautyFilterConfig.sequenceKey) && this.hasTitle == beautyFilterConfig.hasTitle;
    }

    public final int hashCode() {
        int i2 = this.abGroup * 31;
        String str = this.sequenceKey;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.hasTitle;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return hashCode + i3;
    }

    public final String toString() {
        return "BeautyFilterConfig(abGroup=" + this.abGroup + ", sequenceKey=" + this.sequenceKey + ", hasTitle=" + this.hasTitle + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean getAutoApplyBeauty() {
        return this.autoApplyBeauty;
    }

    public final b getDataConfig() {
        return this.dataConfig;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.a getDefaultGender() {
        return this.defaultGender;
    }

    public final String getExtraJson() {
        return this.extraJson;
    }

    public final boolean getHasTitle() {
        return this.hasTitle;
    }

    public final int getItemShape() {
        return this.itemShape;
    }

    public final NoneComposer getNoneItem() {
        return this.noneItem;
    }

    public final boolean getPrimaryBeautyPanelEnable() {
        return this.primaryBeautyPanelEnable;
    }

    public final String getSequenceKey() {
        return this.sequenceKey;
    }

    public final boolean getULike2ComposerTagValueConvert() {
        return this.uLike2ComposerTagValueConvert;
    }

    public final boolean getUseResetAll() {
        return this.useResetAll;
    }

    public final boolean isConvertKey() {
        return this.isConvertKey;
    }

    public final void setAutoApplyBeauty(boolean z) {
        this.autoApplyBeauty = z;
    }

    public final void setConvertKey(boolean z) {
        this.isConvertKey = z;
    }

    public final void setItemShape(int i2) {
        this.itemShape = i2;
    }

    public final void setNoneItem(NoneComposer noneComposer) {
        this.noneItem = noneComposer;
    }

    public final void setPrimaryBeautyPanelEnable(boolean z) {
        this.primaryBeautyPanelEnable = z;
    }

    public final void setULike2ComposerTagValueConvert(boolean z) {
        this.uLike2ComposerTagValueConvert = z;
    }

    public final void setUseResetAll(boolean z) {
        this.useResetAll = z;
    }

    public final void setDataConfig(b bVar) {
        l.d(bVar, "");
        this.dataConfig = bVar;
    }

    public final void setDefaultGender(com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(aVar, "");
        this.defaultGender = aVar;
    }

    public final void setExtraJson(String str) {
        l.d(str, "");
        this.extraJson = str;
    }

    public BeautyFilterConfig(int i2, String str, boolean z) {
        l.d(str, "");
        this.abGroup = i2;
        this.sequenceKey = str;
        this.hasTitle = z;
        this.useResetAll = true;
        this.extraJson = "beautify";
        this.defaultGender = com.ss.android.ugc.aweme.tools.beauty.a.FEMALE;
        this.dataConfig = new b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyFilterConfig(int i2, String str, boolean z, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, str, (i3 & 4) != 0 ? true : z);
    }
}
