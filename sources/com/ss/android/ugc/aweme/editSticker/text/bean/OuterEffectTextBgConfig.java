package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class OuterEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextBgConfig> CREATOR = new a();
    @c(a = "bg_name")
    private final String bgName;
    @c(a = "dimen_mode_height")
    private final int dimenModeHeight;
    @c(a = "dimen_mode_width")
    private final int dimenModeWidth;
    @c(a = "gravity")
    private final int gravity;
    @c(a = "height")
    private final int height;
    @c(a = "is_nine_patch")
    private final boolean isNinePatch;
    @c(a = "margin_bottom")
    private final int marginBottom;
    @c(a = "margin_end")
    private final int marginEnd;
    @c(a = "margin_start")
    private final int marginStart;
    @c(a = "margin_top")
    private final int marginTop;
    @c(a = "nine_patch_info")
    private final EffectTextBgNinePatch ninePatchInfo;
    @c(a = "width")
    private final int width;

    static {
        Covode.recordClassIndex(55611);
    }

    public OuterEffectTextBgConfig() {
        this(null, false, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ OuterEffectTextBgConfig copy$default(OuterEffectTextBgConfig outerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = outerEffectTextBgConfig.bgName;
        }
        if ((i11 & 2) != 0) {
            z = outerEffectTextBgConfig.isNinePatch;
        }
        if ((i11 & 4) != 0) {
            effectTextBgNinePatch = outerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i11 & 8) != 0) {
            i2 = outerEffectTextBgConfig.gravity;
        }
        if ((i11 & 16) != 0) {
            i3 = outerEffectTextBgConfig.dimenModeWidth;
        }
        if ((i11 & 32) != 0) {
            i4 = outerEffectTextBgConfig.dimenModeHeight;
        }
        if ((i11 & 64) != 0) {
            i5 = outerEffectTextBgConfig.width;
        }
        if ((i11 & 128) != 0) {
            i6 = outerEffectTextBgConfig.height;
        }
        if ((i11 & 256) != 0) {
            i7 = outerEffectTextBgConfig.marginStart;
        }
        if ((i11 & 512) != 0) {
            i8 = outerEffectTextBgConfig.marginEnd;
        }
        if ((i11 & 1024) != 0) {
            i9 = outerEffectTextBgConfig.marginTop;
        }
        if ((i11 & 2048) != 0) {
            i10 = outerEffectTextBgConfig.marginBottom;
        }
        return outerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i2, i3, i4, i5, i6, i7, i8, i9, i10);
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

    public final int component5() {
        return this.dimenModeWidth;
    }

    public final int component6() {
        return this.dimenModeHeight;
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

    public final OuterEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        l.d(str, "");
        l.d(effectTextBgNinePatch, "");
        return new OuterEffectTextBgConfig(str, z, effectTextBgNinePatch, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextBgConfig)) {
            return false;
        }
        OuterEffectTextBgConfig outerEffectTextBgConfig = (OuterEffectTextBgConfig) obj;
        return l.a(this.bgName, outerEffectTextBgConfig.bgName) && this.isNinePatch == outerEffectTextBgConfig.isNinePatch && l.a(this.ninePatchInfo, outerEffectTextBgConfig.ninePatchInfo) && this.gravity == outerEffectTextBgConfig.gravity && this.dimenModeWidth == outerEffectTextBgConfig.dimenModeWidth && this.dimenModeHeight == outerEffectTextBgConfig.dimenModeHeight && this.width == outerEffectTextBgConfig.width && this.height == outerEffectTextBgConfig.height && this.marginStart == outerEffectTextBgConfig.marginStart && this.marginEnd == outerEffectTextBgConfig.marginEnd && this.marginTop == outerEffectTextBgConfig.marginTop && this.marginBottom == outerEffectTextBgConfig.marginBottom;
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
        if (effectTextBgNinePatch != null) {
            i2 = effectTextBgNinePatch.hashCode();
        }
        return ((((((((((((((((((i6 + i2) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gravity)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.dimenModeWidth)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.dimenModeHeight)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginBottom);
    }

    public final String toString() {
        return "OuterEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimenModeWidth=" + this.dimenModeWidth + ", dimenModeHeight=" + this.dimenModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, 0);
        parcel.writeInt(this.gravity);
        parcel.writeInt(this.dimenModeWidth);
        parcel.writeInt(this.dimenModeHeight);
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

    public final int getDimenModeHeight() {
        return this.dimenModeHeight;
    }

    public final int getDimenModeWidth() {
        return this.dimenModeWidth;
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

    public static class a implements Parcelable.Creator<OuterEffectTextBgConfig> {
        static {
            Covode.recordClassIndex(55612);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextBgConfig[] newArray(int i2) {
            return new OuterEffectTextBgConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextBgConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new OuterEffectTextBgConfig(parcel.readString(), parcel.readInt() != 0, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        l.d(str, "");
        l.d(effectTextBgNinePatch, "");
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i2;
        this.dimenModeWidth = i3;
        this.dimenModeHeight = i4;
        this.width = i5;
        this.height = i6;
        this.marginStart = i7;
        this.marginEnd = i8;
        this.marginTop = i9;
        this.marginBottom = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z, (i11 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i11 & 8) != 0 ? f.LEFT.getGravity() | f.TOP.getGravity() : i2, (i11 & 16) != 0 ? e.MATCH_PARENT.getMode() : i3, (i11 & 32) != 0 ? e.MATCH_PARENT.getMode() : i4, (i11 & 64) != 0 ? 0 : i5, (i11 & 128) != 0 ? 0 : i6, (i11 & 256) != 0 ? 0 : i7, (i11 & 512) != 0 ? 0 : i8, (i11 & 1024) != 0 ? 0 : i9, (i11 & 2048) == 0 ? i10 : 0);
    }
}
