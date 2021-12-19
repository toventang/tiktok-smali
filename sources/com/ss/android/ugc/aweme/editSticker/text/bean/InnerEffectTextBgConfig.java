package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class InnerEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextBgConfig> CREATOR = new a();
    private final String bgName;
    private final e dimensionModeHeight;
    private final e dimensionModeWidth;
    private final int gravity;
    private final int height;
    private final boolean isNinePatch;
    private final int marginBottom;
    private final int marginEnd;
    private final int marginStart;
    private final int marginTop;
    private final EffectTextBgNinePatch ninePatchInfo;
    private final int width;

    static {
        Covode.recordClassIndex(55595);
    }

    public InnerEffectTextBgConfig() {
        this(null, false, null, 0, null, null, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ InnerEffectTextBgConfig copy$default(InnerEffectTextBgConfig innerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, e eVar, e eVar2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = innerEffectTextBgConfig.bgName;
        }
        if ((i9 & 2) != 0) {
            z = innerEffectTextBgConfig.isNinePatch;
        }
        if ((i9 & 4) != 0) {
            effectTextBgNinePatch = innerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i9 & 8) != 0) {
            i2 = innerEffectTextBgConfig.gravity;
        }
        if ((i9 & 16) != 0) {
            eVar = innerEffectTextBgConfig.dimensionModeWidth;
        }
        if ((i9 & 32) != 0) {
            eVar2 = innerEffectTextBgConfig.dimensionModeHeight;
        }
        if ((i9 & 64) != 0) {
            i3 = innerEffectTextBgConfig.width;
        }
        if ((i9 & 128) != 0) {
            i4 = innerEffectTextBgConfig.height;
        }
        if ((i9 & 256) != 0) {
            i5 = innerEffectTextBgConfig.marginStart;
        }
        if ((i9 & 512) != 0) {
            i6 = innerEffectTextBgConfig.marginEnd;
        }
        if ((i9 & 1024) != 0) {
            i7 = innerEffectTextBgConfig.marginTop;
        }
        if ((i9 & 2048) != 0) {
            i8 = innerEffectTextBgConfig.marginBottom;
        }
        return innerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i2, eVar, eVar2, i3, i4, i5, i6, i7, i8);
    }

    public final String component1() {
        return this.bgName;
    }

    public final int component10() {
        return this.marginEnd;
    }

    public final int component11() {
        return this.marginTop;
    }

    public final int component12() {
        return this.marginBottom;
    }

    public final boolean component2() {
        return this.isNinePatch;
    }

    public final EffectTextBgNinePatch component3() {
        return this.ninePatchInfo;
    }

    public final int component4() {
        return this.gravity;
    }

    public final e component5() {
        return this.dimensionModeWidth;
    }

    public final e component6() {
        return this.dimensionModeHeight;
    }

    public final int component7() {
        return this.width;
    }

    public final int component8() {
        return this.height;
    }

    public final int component9() {
        return this.marginStart;
    }

    public final InnerEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, e eVar, e eVar2, int i3, int i4, int i5, int i6, int i7, int i8) {
        l.d(str, "");
        l.d(effectTextBgNinePatch, "");
        l.d(eVar, "");
        l.d(eVar2, "");
        return new InnerEffectTextBgConfig(str, z, effectTextBgNinePatch, i2, eVar, eVar2, i3, i4, i5, i6, i7, i8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextBgConfig)) {
            return false;
        }
        InnerEffectTextBgConfig innerEffectTextBgConfig = (InnerEffectTextBgConfig) obj;
        return l.a(this.bgName, innerEffectTextBgConfig.bgName) && this.isNinePatch == innerEffectTextBgConfig.isNinePatch && l.a(this.ninePatchInfo, innerEffectTextBgConfig.ninePatchInfo) && this.gravity == innerEffectTextBgConfig.gravity && l.a(this.dimensionModeWidth, innerEffectTextBgConfig.dimensionModeWidth) && l.a(this.dimensionModeHeight, innerEffectTextBgConfig.dimensionModeHeight) && this.width == innerEffectTextBgConfig.width && this.height == innerEffectTextBgConfig.height && this.marginStart == innerEffectTextBgConfig.marginStart && this.marginEnd == innerEffectTextBgConfig.marginEnd && this.marginTop == innerEffectTextBgConfig.marginTop && this.marginBottom == innerEffectTextBgConfig.marginBottom;
    }

    public final int hashCode() {
        String str = this.bgName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isNinePatch;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        EffectTextBgNinePatch effectTextBgNinePatch = this.ninePatchInfo;
        int hashCode2 = (((i6 + (effectTextBgNinePatch != null ? effectTextBgNinePatch.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gravity)) * 31;
        e eVar = this.dimensionModeWidth;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.dimensionModeHeight;
        if (eVar2 != null) {
            i2 = eVar2.hashCode();
        }
        return ((((((((((((hashCode3 + i2) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginBottom);
    }

    public final String toString() {
        return "InnerEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimensionModeWidth=" + this.dimensionModeWidth + ", dimensionModeHeight=" + this.dimensionModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, 0);
        parcel.writeInt(this.gravity);
        parcel.writeString(this.dimensionModeWidth.name());
        parcel.writeString(this.dimensionModeHeight.name());
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
    }

    public final String getBgName() {
        return this.bgName;
    }

    public final e getDimensionModeHeight() {
        return this.dimensionModeHeight;
    }

    public final e getDimensionModeWidth() {
        return this.dimensionModeWidth;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final EffectTextBgNinePatch getNinePatchInfo() {
        return this.ninePatchInfo;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isNinePatch() {
        return this.isNinePatch;
    }

    public static class a implements Parcelable.Creator<InnerEffectTextBgConfig> {
        static {
            Covode.recordClassIndex(55596);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextBgConfig[] newArray(int i2) {
            return new InnerEffectTextBgConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextBgConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InnerEffectTextBgConfig(parcel.readString(), parcel.readInt() != 0, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), (e) Enum.valueOf(e.class, parcel.readString()), (e) Enum.valueOf(e.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, e eVar, e eVar2, int i3, int i4, int i5, int i6, int i7, int i8) {
        l.d(str, "");
        l.d(effectTextBgNinePatch, "");
        l.d(eVar, "");
        l.d(eVar2, "");
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i2;
        this.dimensionModeWidth = eVar;
        this.dimensionModeHeight = eVar2;
        this.width = i3;
        this.height = i4;
        this.marginStart = i5;
        this.marginEnd = i6;
        this.marginTop = i7;
        this.marginBottom = i8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, e eVar, e eVar2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, g gVar) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? false : z, (i9 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i9 & 8) != 0 ? f.LEFT.getGravity() | f.TOP.getGravity() : i2, (i9 & 16) != 0 ? e.MATCH_PARENT : eVar, (i9 & 32) != 0 ? e.MATCH_PARENT : eVar2, (i9 & 64) != 0 ? 0 : i3, (i9 & 128) != 0 ? 0 : i4, (i9 & 256) != 0 ? 0 : i5, (i9 & 512) != 0 ? 0 : i6, (i9 & 1024) != 0 ? 0 : i7, (i9 & 2048) == 0 ? i8 : 0);
    }
}
