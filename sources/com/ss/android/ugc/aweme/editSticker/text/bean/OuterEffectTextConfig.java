package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class OuterEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextConfig> CREATOR = new a();
    @c(a = "bg_configs")
    private final List<OuterEffectTextBgConfig> bgConfigs;
    @c(a = "cover_configs")
    private final List<OuterEffectTextCoverConfig> coverConfigs;
    @c(a = "cursor_color")
    private final String cursorColor;
    @c(a = "font_style")
    private final int fontStyle;
    @c(a = "gradient_orientation")
    private final int gradientOrientation;
    @c(a = "gradient_type")
    private final int gradientType;
    @c(a = "gravity")
    private final int gravity;
    @c(a = "layer_weight")
    private final int layerWeight;
    @c(a = "margin_bottom")
    private final int marginBottom;
    @c(a = "margin_end")
    private final int marginEnd;
    @c(a = "margin_start")
    private final int marginStart;
    @c(a = "margin_top")
    private final int marginTop;
    @c(a = "max_line")
    private final int maxLine;
    @c(a = "min_height")
    private final int minHeight;
    @c(a = "min_width")
    private final int minWidth;
    @c(a = "padding_bottom")
    private final int paddingBottom;
    @c(a = "padding_end")
    private final int paddingEnd;
    @c(a = "padding_start")
    private final int paddingStart;
    @c(a = "padding_top")
    private final int paddingTop;
    @c(a = "paint_style")
    private final int paintStyle;
    @c(a = "placeholder_string_color")
    private final String placeholderStringColor;
    @c(a = "shadow_config")
    private final OuterEffectTextShadowConfig shadowConfig;
    @c(a = "spacing_add")
    private final float spacingAdd;
    @c(a = "spacing_letter")
    private final float spacingLetter;
    @c(a = "spacing_mult")
    private final float spacingMult;
    @c(a = "stroke_configs")
    private final List<OuterEffectTextStrokeConfig> strokeConfigs;
    @c(a = "text_color_end")
    private final String textColorEnd;
    @c(a = "text_color_start")
    private final String textColorStart;
    @c(a = "text_size")
    private final int textSize;
    @c(a = "typeface_id")
    private final String typefaceId;

    static {
        Covode.recordClassIndex(55613);
    }

    public OuterEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, null, null, 0, 0, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, 1073741823, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ OuterEffectTextConfig copy$default(OuterEffectTextConfig outerEffectTextConfig, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, String str3, String str4, int i17, int i18, int i19, float f2, float f3, float f4, String str5, List list, List list2, List list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i20, Object obj) {
        String str6 = str;
        int i21 = i14;
        int i22 = i13;
        int i23 = i12;
        int i24 = i5;
        int i25 = i4;
        int i26 = i3;
        int i27 = i2;
        int i28 = i6;
        int i29 = i7;
        int i30 = i8;
        int i31 = i9;
        int i32 = i10;
        int i33 = i11;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        String str7 = str5;
        float f5 = f4;
        String str8 = str3;
        int i34 = i16;
        int i35 = i15;
        String str9 = str2;
        String str10 = str4;
        int i36 = i17;
        int i37 = i18;
        int i38 = i19;
        float f6 = f2;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig2 = outerEffectTextShadowConfig;
        float f7 = f3;
        if ((i20 & 1) != 0) {
            i27 = outerEffectTextConfig.paddingStart;
        }
        if ((i20 & 2) != 0) {
            i26 = outerEffectTextConfig.paddingEnd;
        }
        if ((i20 & 4) != 0) {
            i25 = outerEffectTextConfig.paddingTop;
        }
        if ((i20 & 8) != 0) {
            i24 = outerEffectTextConfig.paddingBottom;
        }
        if ((i20 & 16) != 0) {
            i28 = outerEffectTextConfig.layerWeight;
        }
        if ((i20 & 32) != 0) {
            i29 = outerEffectTextConfig.marginStart;
        }
        if ((i20 & 64) != 0) {
            i30 = outerEffectTextConfig.marginEnd;
        }
        if ((i20 & 128) != 0) {
            i31 = outerEffectTextConfig.marginTop;
        }
        if ((i20 & 256) != 0) {
            i32 = outerEffectTextConfig.marginBottom;
        }
        if ((i20 & 512) != 0) {
            i33 = outerEffectTextConfig.textSize;
        }
        if ((i20 & 1024) != 0) {
            i23 = outerEffectTextConfig.maxLine;
        }
        if ((i20 & 2048) != 0) {
            i22 = outerEffectTextConfig.minWidth;
        }
        if ((i20 & 4096) != 0) {
            i21 = outerEffectTextConfig.minHeight;
        }
        if ((i20 & 8192) != 0) {
            str6 = outerEffectTextConfig.placeholderStringColor;
        }
        if ((i20 & 16384) != 0) {
            str9 = outerEffectTextConfig.typefaceId;
        }
        if ((32768 & i20) != 0) {
            i35 = outerEffectTextConfig.fontStyle;
        }
        if ((65536 & i20) != 0) {
            i34 = outerEffectTextConfig.paintStyle;
        }
        if ((131072 & i20) != 0) {
            str8 = outerEffectTextConfig.textColorStart;
        }
        if ((262144 & i20) != 0) {
            str10 = outerEffectTextConfig.textColorEnd;
        }
        if ((524288 & i20) != 0) {
            i36 = outerEffectTextConfig.gradientType;
        }
        if ((1048576 & i20) != 0) {
            i37 = outerEffectTextConfig.gradientOrientation;
        }
        if ((2097152 & i20) != 0) {
            i38 = outerEffectTextConfig.gravity;
        }
        if ((4194304 & i20) != 0) {
            f6 = outerEffectTextConfig.spacingMult;
        }
        if ((8388608 & i20) != 0) {
            f7 = outerEffectTextConfig.spacingAdd;
        }
        if ((16777216 & i20) != 0) {
            f5 = outerEffectTextConfig.spacingLetter;
        }
        if ((33554432 & i20) != 0) {
            str7 = outerEffectTextConfig.cursorColor;
        }
        if ((67108864 & i20) != 0) {
            list6 = outerEffectTextConfig.strokeConfigs;
        }
        if ((134217728 & i20) != 0) {
            list5 = outerEffectTextConfig.coverConfigs;
        }
        if ((268435456 & i20) != 0) {
            list4 = outerEffectTextConfig.bgConfigs;
        }
        if ((i20 & 536870912) != 0) {
            outerEffectTextShadowConfig2 = outerEffectTextConfig.shadowConfig;
        }
        return outerEffectTextConfig.copy(i27, i26, i25, i24, i28, i29, i30, i31, i32, i33, i23, i22, i21, str6, str9, i35, i34, str8, str10, i36, i37, i38, f6, f7, f5, str7, list6, list5, list4, outerEffectTextShadowConfig2);
    }

    public final int component1() {
        return this.paddingStart;
    }

    public final int component10() {
        return this.textSize;
    }

    public final int component11() {
        return this.maxLine;
    }

    public final int component12() {
        return this.minWidth;
    }

    public final int component13() {
        return this.minHeight;
    }

    public final String component14() {
        return this.placeholderStringColor;
    }

    public final String component15() {
        return this.typefaceId;
    }

    public final int component16() {
        return this.fontStyle;
    }

    public final int component17() {
        return this.paintStyle;
    }

    public final String component18() {
        return this.textColorStart;
    }

    public final String component19() {
        return this.textColorEnd;
    }

    public final int component2() {
        return this.paddingEnd;
    }

    public final int component20() {
        return this.gradientType;
    }

    public final int component21() {
        return this.gradientOrientation;
    }

    public final int component22() {
        return this.gravity;
    }

    public final float component23() {
        return this.spacingMult;
    }

    public final float component24() {
        return this.spacingAdd;
    }

    public final float component25() {
        return this.spacingLetter;
    }

    public final String component26() {
        return this.cursorColor;
    }

    public final List<OuterEffectTextStrokeConfig> component27() {
        return this.strokeConfigs;
    }

    public final List<OuterEffectTextCoverConfig> component28() {
        return this.coverConfigs;
    }

    public final List<OuterEffectTextBgConfig> component29() {
        return this.bgConfigs;
    }

    public final int component3() {
        return this.paddingTop;
    }

    public final OuterEffectTextShadowConfig component30() {
        return this.shadowConfig;
    }

    public final int component4() {
        return this.paddingBottom;
    }

    public final int component5() {
        return this.layerWeight;
    }

    public final int component6() {
        return this.marginStart;
    }

    public final int component7() {
        return this.marginEnd;
    }

    public final int component8() {
        return this.marginTop;
    }

    public final int component9() {
        return this.marginBottom;
    }

    public final OuterEffectTextConfig copy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, String str3, String str4, int i17, int i18, int i19, float f2, float f3, float f4, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        return new OuterEffectTextConfig(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, str, str2, i15, i16, str3, str4, i17, i18, i19, f2, f3, f4, str5, list, list2, list3, outerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextConfig)) {
            return false;
        }
        OuterEffectTextConfig outerEffectTextConfig = (OuterEffectTextConfig) obj;
        return this.paddingStart == outerEffectTextConfig.paddingStart && this.paddingEnd == outerEffectTextConfig.paddingEnd && this.paddingTop == outerEffectTextConfig.paddingTop && this.paddingBottom == outerEffectTextConfig.paddingBottom && this.layerWeight == outerEffectTextConfig.layerWeight && this.marginStart == outerEffectTextConfig.marginStart && this.marginEnd == outerEffectTextConfig.marginEnd && this.marginTop == outerEffectTextConfig.marginTop && this.marginBottom == outerEffectTextConfig.marginBottom && this.textSize == outerEffectTextConfig.textSize && this.maxLine == outerEffectTextConfig.maxLine && this.minWidth == outerEffectTextConfig.minWidth && this.minHeight == outerEffectTextConfig.minHeight && l.a(this.placeholderStringColor, outerEffectTextConfig.placeholderStringColor) && l.a(this.typefaceId, outerEffectTextConfig.typefaceId) && this.fontStyle == outerEffectTextConfig.fontStyle && this.paintStyle == outerEffectTextConfig.paintStyle && l.a(this.textColorStart, outerEffectTextConfig.textColorStart) && l.a(this.textColorEnd, outerEffectTextConfig.textColorEnd) && this.gradientType == outerEffectTextConfig.gradientType && this.gradientOrientation == outerEffectTextConfig.gradientOrientation && this.gravity == outerEffectTextConfig.gravity && Float.compare(this.spacingMult, outerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, outerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, outerEffectTextConfig.spacingLetter) == 0 && l.a(this.cursorColor, outerEffectTextConfig.cursorColor) && l.a(this.strokeConfigs, outerEffectTextConfig.strokeConfigs) && l.a(this.coverConfigs, outerEffectTextConfig.coverConfigs) && l.a(this.bgConfigs, outerEffectTextConfig.bgConfigs) && l.a(this.shadowConfig, outerEffectTextConfig.shadowConfig);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((((((((((((((com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingStart) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingBottom)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.layerWeight)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginBottom)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textSize)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxLine)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minWidth)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minHeight)) * 31;
        String str = this.placeholderStringColor;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.typefaceId;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.fontStyle)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paintStyle)) * 31;
        String str3 = this.textColorStart;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.textColorEnd;
        int hashCode4 = (((((((((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gradientType)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gradientOrientation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gravity)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingMult)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingAdd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingLetter)) * 31;
        String str5 = this.cursorColor;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<OuterEffectTextCoverConfig> list2 = this.coverConfigs;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<OuterEffectTextBgConfig> list3 = this.bgConfigs;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            i2 = outerEffectTextShadowConfig.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "OuterEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", placeholderStringColor=" + this.placeholderStringColor + ", typefaceId=" + this.typefaceId + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.maxLine);
        parcel.writeInt(this.minWidth);
        parcel.writeInt(this.minHeight);
        parcel.writeString(this.placeholderStringColor);
        parcel.writeString(this.typefaceId);
        parcel.writeInt(this.fontStyle);
        parcel.writeInt(this.paintStyle);
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.gravity);
        parcel.writeFloat(this.spacingMult);
        parcel.writeFloat(this.spacingAdd);
        parcel.writeFloat(this.spacingLetter);
        parcel.writeString(this.cursorColor);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextStrokeConfig outerEffectTextStrokeConfig : list) {
            outerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        List<OuterEffectTextCoverConfig> list2 = this.coverConfigs;
        parcel.writeInt(list2.size());
        for (OuterEffectTextCoverConfig outerEffectTextCoverConfig : list2) {
            outerEffectTextCoverConfig.writeToParcel(parcel, 0);
        }
        List<OuterEffectTextBgConfig> list3 = this.bgConfigs;
        parcel.writeInt(list3.size());
        for (OuterEffectTextBgConfig outerEffectTextBgConfig : list3) {
            outerEffectTextBgConfig.writeToParcel(parcel, 0);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final List<OuterEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<OuterEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getLayerWeight() {
        return this.layerWeight;
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

    public final int getMaxLine() {
        return this.maxLine;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final String getPlaceholderStringColor() {
        return this.placeholderStringColor;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final float getSpacingAdd() {
        return this.spacingAdd;
    }

    public final float getSpacingLetter() {
        return this.spacingLetter;
    }

    public final float getSpacingMult() {
        return this.spacingMult;
    }

    public final List<OuterEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final String getTextColorEnd() {
        return this.textColorEnd;
    }

    public final String getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final String getTypefaceId() {
        return this.typefaceId;
    }

    public static class a implements Parcelable.Creator<OuterEffectTextConfig> {
        static {
            Covode.recordClassIndex(55614);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextConfig[] newArray(int i2) {
            return new OuterEffectTextConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            int readInt11 = parcel.readInt();
            int readInt12 = parcel.readInt();
            int readInt13 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt14 = parcel.readInt();
            int readInt15 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt16 = parcel.readInt();
            int readInt17 = parcel.readInt();
            int readInt18 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            String readString5 = parcel.readString();
            int readInt19 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt19);
            while (readInt19 != 0) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt19--;
            }
            int readInt20 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt20);
            while (readInt20 != 0) {
                arrayList2.add(OuterEffectTextCoverConfig.CREATOR.createFromParcel(parcel));
                readInt20--;
            }
            int readInt21 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt21);
            while (readInt21 != 0) {
                arrayList3.add(OuterEffectTextBgConfig.CREATOR.createFromParcel(parcel));
                readInt21--;
            }
            return new OuterEffectTextConfig(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readString, readString2, readInt14, readInt15, readString3, readString4, readInt16, readInt17, readInt18, readFloat, readFloat2, readFloat3, readString5, arrayList, arrayList2, arrayList3, parcel.readInt() != 0 ? OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OuterEffectTextConfig(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, String str3, String str4, int i17, int i18, int i19, float f2, float f3, float f4, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        this.paddingStart = i2;
        this.paddingEnd = i3;
        this.paddingTop = i4;
        this.paddingBottom = i5;
        this.layerWeight = i6;
        this.marginStart = i7;
        this.marginEnd = i8;
        this.marginTop = i9;
        this.marginBottom = i10;
        this.textSize = i11;
        this.maxLine = i12;
        this.minWidth = i13;
        this.minHeight = i14;
        this.placeholderStringColor = str;
        this.typefaceId = str2;
        this.fontStyle = i15;
        this.paintStyle = i16;
        this.textColorStart = str3;
        this.textColorEnd = str4;
        this.gradientType = i17;
        this.gradientOrientation = i18;
        this.gravity = i19;
        this.spacingMult = f2;
        this.spacingAdd = f3;
        this.spacingLetter = f4;
        this.cursorColor = str5;
        this.strokeConfigs = list;
        this.coverConfigs = list2;
        this.bgConfigs = list3;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OuterEffectTextConfig(int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, java.lang.String r46, java.lang.String r47, int r48, int r49, java.lang.String r50, java.lang.String r51, int r52, int r53, int r54, float r55, float r56, float r57, java.lang.String r58, java.util.List r59, java.util.List r60, java.util.List r61, com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig r62, int r63, h.f.b.g r64) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, int, int, float, float, float, java.lang.String, java.util.List, java.util.List, java.util.List, com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig, int, h.f.b.g):void");
    }
}
