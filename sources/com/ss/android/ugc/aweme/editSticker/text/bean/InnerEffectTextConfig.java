package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class InnerEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextConfig> CREATOR = new a();
    private final List<InnerEffectTextBgConfig> bgConfigs;
    private final List<InnerEffectTextCoverConfig> coverConfigs;
    private final String cursorColor;
    private final InnerEffectExtraConfig extraConfig;
    private final int fontStyle;
    private final j gradientOrientation;
    private final k gradientType;
    private final int gravity;
    private final int layerWeight;
    private final int marginBottom;
    private final int marginEnd;
    private final int marginStart;
    private final int marginTop;
    private final int maxLine;
    private final int minHeight;
    private final int minWidth;
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;
    private final Paint.Style paintStyle;
    private final int replaceStringColor;
    private final InnerEffectTextShadowConfig shadowConfig;
    private final float spacingAdd;
    private final float spacingLetter;
    private final float spacingMult;
    private final List<InnerEffectTextStrokeConfig> strokeConfigs;
    private final int textColorEnd;
    private final int textColorStart;
    private final int textSize;
    private final p<String, String> typefacePath;

    static {
        Covode.recordClassIndex(55597);
    }

    public InnerEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0, null, null, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ InnerEffectTextConfig copy$default(InnerEffectTextConfig innerEffectTextConfig, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, p pVar, int i16, Paint.Style style, int i17, int i18, k kVar, j jVar, int i19, float f2, float f3, float f4, String str, List list, List list2, List list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig, int i20, Object obj) {
        int i21 = i15;
        int i22 = i14;
        int i23 = i13;
        int i24 = i12;
        int i25 = i5;
        int i26 = i4;
        int i27 = i3;
        int i28 = i2;
        int i29 = i6;
        int i30 = i7;
        int i31 = i8;
        int i32 = i9;
        int i33 = i10;
        int i34 = i11;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig2 = innerEffectTextShadowConfig;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        String str2 = str;
        InnerEffectExtraConfig innerEffectExtraConfig2 = innerEffectExtraConfig;
        float f5 = f4;
        int i35 = i17;
        Paint.Style style2 = style;
        int i36 = i16;
        p<String, String> pVar2 = pVar;
        int i37 = i18;
        k kVar2 = kVar;
        j jVar2 = jVar;
        int i38 = i19;
        float f6 = f2;
        float f7 = f3;
        if ((i20 & 1) != 0) {
            i28 = innerEffectTextConfig.paddingStart;
        }
        if ((i20 & 2) != 0) {
            i27 = innerEffectTextConfig.paddingEnd;
        }
        if ((i20 & 4) != 0) {
            i26 = innerEffectTextConfig.paddingTop;
        }
        if ((i20 & 8) != 0) {
            i25 = innerEffectTextConfig.paddingBottom;
        }
        if ((i20 & 16) != 0) {
            i29 = innerEffectTextConfig.layerWeight;
        }
        if ((i20 & 32) != 0) {
            i30 = innerEffectTextConfig.marginStart;
        }
        if ((i20 & 64) != 0) {
            i31 = innerEffectTextConfig.marginEnd;
        }
        if ((i20 & 128) != 0) {
            i32 = innerEffectTextConfig.marginTop;
        }
        if ((i20 & 256) != 0) {
            i33 = innerEffectTextConfig.marginBottom;
        }
        if ((i20 & 512) != 0) {
            i34 = innerEffectTextConfig.textSize;
        }
        if ((i20 & 1024) != 0) {
            i24 = innerEffectTextConfig.maxLine;
        }
        if ((i20 & 2048) != 0) {
            i23 = innerEffectTextConfig.minWidth;
        }
        if ((i20 & 4096) != 0) {
            i22 = innerEffectTextConfig.minHeight;
        }
        if ((i20 & 8192) != 0) {
            i21 = innerEffectTextConfig.replaceStringColor;
        }
        if ((i20 & 16384) != 0) {
            pVar2 = innerEffectTextConfig.typefacePath;
        }
        if ((32768 & i20) != 0) {
            i36 = innerEffectTextConfig.fontStyle;
        }
        if ((65536 & i20) != 0) {
            style2 = innerEffectTextConfig.paintStyle;
        }
        if ((131072 & i20) != 0) {
            i35 = innerEffectTextConfig.textColorStart;
        }
        if ((262144 & i20) != 0) {
            i37 = innerEffectTextConfig.textColorEnd;
        }
        if ((524288 & i20) != 0) {
            kVar2 = innerEffectTextConfig.gradientType;
        }
        if ((1048576 & i20) != 0) {
            jVar2 = innerEffectTextConfig.gradientOrientation;
        }
        if ((2097152 & i20) != 0) {
            i38 = innerEffectTextConfig.gravity;
        }
        if ((4194304 & i20) != 0) {
            f6 = innerEffectTextConfig.spacingMult;
        }
        if ((8388608 & i20) != 0) {
            f7 = innerEffectTextConfig.spacingAdd;
        }
        if ((16777216 & i20) != 0) {
            f5 = innerEffectTextConfig.spacingLetter;
        }
        if ((33554432 & i20) != 0) {
            str2 = innerEffectTextConfig.cursorColor;
        }
        if ((67108864 & i20) != 0) {
            list6 = innerEffectTextConfig.strokeConfigs;
        }
        if ((134217728 & i20) != 0) {
            list5 = innerEffectTextConfig.coverConfigs;
        }
        if ((268435456 & i20) != 0) {
            list4 = innerEffectTextConfig.bgConfigs;
        }
        if ((536870912 & i20) != 0) {
            innerEffectTextShadowConfig2 = innerEffectTextConfig.shadowConfig;
        }
        if ((i20 & 1073741824) != 0) {
            innerEffectExtraConfig2 = innerEffectTextConfig.extraConfig;
        }
        return innerEffectTextConfig.copy(i28, i27, i26, i25, i29, i30, i31, i32, i33, i34, i24, i23, i22, i21, pVar2, i36, style2, i35, i37, kVar2, jVar2, i38, f6, f7, f5, str2, list6, list5, list4, innerEffectTextShadowConfig2, innerEffectExtraConfig2);
    }

    public static /* synthetic */ void getFontStyle$annotations() {
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

    public final int component14() {
        return this.replaceStringColor;
    }

    public final p<String, String> component15() {
        return this.typefacePath;
    }

    public final int component16() {
        return this.fontStyle;
    }

    public final Paint.Style component17() {
        return this.paintStyle;
    }

    public final int component18() {
        return this.textColorStart;
    }

    public final int component19() {
        return this.textColorEnd;
    }

    public final int component2() {
        return this.paddingEnd;
    }

    public final k component20() {
        return this.gradientType;
    }

    public final j component21() {
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

    public final List<InnerEffectTextStrokeConfig> component27() {
        return this.strokeConfigs;
    }

    public final List<InnerEffectTextCoverConfig> component28() {
        return this.coverConfigs;
    }

    public final List<InnerEffectTextBgConfig> component29() {
        return this.bgConfigs;
    }

    public final int component3() {
        return this.paddingTop;
    }

    public final InnerEffectTextShadowConfig component30() {
        return this.shadowConfig;
    }

    public final InnerEffectExtraConfig component31() {
        return this.extraConfig;
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

    public final InnerEffectTextConfig copy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, p<String, String> pVar, int i16, Paint.Style style, int i17, int i18, k kVar, j jVar, int i19, float f2, float f3, float f4, String str, List<InnerEffectTextStrokeConfig> list, List<InnerEffectTextCoverConfig> list2, List<InnerEffectTextBgConfig> list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig) {
        l.d(style, "");
        l.d(kVar, "");
        l.d(jVar, "");
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(innerEffectExtraConfig, "");
        return new InnerEffectTextConfig(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, pVar, i16, style, i17, i18, kVar, jVar, i19, f2, f3, f4, str, list, list2, list3, innerEffectTextShadowConfig, innerEffectExtraConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextConfig)) {
            return false;
        }
        InnerEffectTextConfig innerEffectTextConfig = (InnerEffectTextConfig) obj;
        return this.paddingStart == innerEffectTextConfig.paddingStart && this.paddingEnd == innerEffectTextConfig.paddingEnd && this.paddingTop == innerEffectTextConfig.paddingTop && this.paddingBottom == innerEffectTextConfig.paddingBottom && this.layerWeight == innerEffectTextConfig.layerWeight && this.marginStart == innerEffectTextConfig.marginStart && this.marginEnd == innerEffectTextConfig.marginEnd && this.marginTop == innerEffectTextConfig.marginTop && this.marginBottom == innerEffectTextConfig.marginBottom && this.textSize == innerEffectTextConfig.textSize && this.maxLine == innerEffectTextConfig.maxLine && this.minWidth == innerEffectTextConfig.minWidth && this.minHeight == innerEffectTextConfig.minHeight && this.replaceStringColor == innerEffectTextConfig.replaceStringColor && l.a(this.typefacePath, innerEffectTextConfig.typefacePath) && this.fontStyle == innerEffectTextConfig.fontStyle && l.a(this.paintStyle, innerEffectTextConfig.paintStyle) && this.textColorStart == innerEffectTextConfig.textColorStart && this.textColorEnd == innerEffectTextConfig.textColorEnd && l.a(this.gradientType, innerEffectTextConfig.gradientType) && l.a(this.gradientOrientation, innerEffectTextConfig.gradientOrientation) && this.gravity == innerEffectTextConfig.gravity && Float.compare(this.spacingMult, innerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, innerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, innerEffectTextConfig.spacingLetter) == 0 && l.a(this.cursorColor, innerEffectTextConfig.cursorColor) && l.a(this.strokeConfigs, innerEffectTextConfig.strokeConfigs) && l.a(this.coverConfigs, innerEffectTextConfig.coverConfigs) && l.a(this.bgConfigs, innerEffectTextConfig.bgConfigs) && l.a(this.shadowConfig, innerEffectTextConfig.shadowConfig) && l.a(this.extraConfig, innerEffectTextConfig.extraConfig);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((((((((((((((((com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingStart) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingBottom)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.layerWeight)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.marginBottom)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textSize)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxLine)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minWidth)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minHeight)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.replaceStringColor)) * 31;
        p<String, String> pVar = this.typefacePath;
        int i2 = 0;
        int hashCode = (((com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.fontStyle)) * 31;
        Paint.Style style = this.paintStyle;
        int hashCode2 = (((((hashCode + (style != null ? style.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textColorStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textColorEnd)) * 31;
        k kVar = this.gradientType;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        j jVar = this.gradientOrientation;
        int hashCode4 = (((((((((hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gravity)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingMult)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingAdd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.spacingLetter)) * 31;
        String str = this.cursorColor;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<InnerEffectTextCoverConfig> list2 = this.coverConfigs;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<InnerEffectTextBgConfig> list3 = this.bgConfigs;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        int hashCode9 = (hashCode8 + (innerEffectTextShadowConfig != null ? innerEffectTextShadowConfig.hashCode() : 0)) * 31;
        InnerEffectExtraConfig innerEffectExtraConfig = this.extraConfig;
        if (innerEffectExtraConfig != null) {
            i2 = innerEffectExtraConfig.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "InnerEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", replaceStringColor=" + this.replaceStringColor + ", typefacePath=" + this.typefacePath + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ", extraConfig=" + this.extraConfig + ")";
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
        parcel.writeInt(this.replaceStringColor);
        parcel.writeSerializable(this.typefacePath);
        parcel.writeInt(this.fontStyle);
        parcel.writeString(this.paintStyle.name());
        parcel.writeInt(this.textColorStart);
        parcel.writeInt(this.textColorEnd);
        parcel.writeString(this.gradientType.name());
        parcel.writeString(this.gradientOrientation.name());
        parcel.writeInt(this.gravity);
        parcel.writeFloat(this.spacingMult);
        parcel.writeFloat(this.spacingAdd);
        parcel.writeFloat(this.spacingLetter);
        parcel.writeString(this.cursorColor);
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig : list) {
            innerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        List<InnerEffectTextCoverConfig> list2 = this.coverConfigs;
        parcel.writeInt(list2.size());
        for (InnerEffectTextCoverConfig innerEffectTextCoverConfig : list2) {
            innerEffectTextCoverConfig.writeToParcel(parcel, 0);
        }
        List<InnerEffectTextBgConfig> list3 = this.bgConfigs;
        parcel.writeInt(list3.size());
        for (InnerEffectTextBgConfig innerEffectTextBgConfig : list3) {
            innerEffectTextBgConfig.writeToParcel(parcel, 0);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        this.extraConfig.writeToParcel(parcel, 0);
    }

    public final List<InnerEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<InnerEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final j getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final k getGradientType() {
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

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final int getReplaceStringColor() {
        return this.replaceStringColor;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
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

    public final List<InnerEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final int getTextColorEnd() {
        return this.textColorEnd;
    }

    public final int getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final p<String, String> getTypefacePath() {
        return this.typefacePath;
    }

    public static class a implements Parcelable.Creator<InnerEffectTextConfig> {
        static {
            Covode.recordClassIndex(55598);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextConfig[] newArray(int i2) {
            return new InnerEffectTextConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextConfig createFromParcel(Parcel parcel) {
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
            int readInt14 = parcel.readInt();
            p pVar = (p) parcel.readSerializable();
            int readInt15 = parcel.readInt();
            Paint.Style style = (Paint.Style) Enum.valueOf(Paint.Style.class, parcel.readString());
            int readInt16 = parcel.readInt();
            int readInt17 = parcel.readInt();
            k kVar = (k) Enum.valueOf(k.class, parcel.readString());
            j jVar = (j) Enum.valueOf(j.class, parcel.readString());
            int readInt18 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            String readString = parcel.readString();
            int readInt19 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt19);
            while (readInt19 != 0) {
                arrayList.add(InnerEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt19--;
            }
            int readInt20 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt20);
            while (readInt20 != 0) {
                arrayList2.add(InnerEffectTextCoverConfig.CREATOR.createFromParcel(parcel));
                readInt20--;
            }
            int readInt21 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt21);
            while (readInt21 != 0) {
                arrayList3.add(InnerEffectTextBgConfig.CREATOR.createFromParcel(parcel));
                readInt21--;
            }
            return new InnerEffectTextConfig(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readInt14, pVar, readInt15, style, readInt16, readInt17, kVar, jVar, readInt18, readFloat, readFloat2, readFloat3, readString, arrayList, arrayList2, arrayList3, parcel.readInt() != 0 ? InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public InnerEffectTextConfig(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, p<String, String> pVar, int i16, Paint.Style style, int i17, int i18, k kVar, j jVar, int i19, float f2, float f3, float f4, String str, List<InnerEffectTextStrokeConfig> list, List<InnerEffectTextCoverConfig> list2, List<InnerEffectTextBgConfig> list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig) {
        l.d(style, "");
        l.d(kVar, "");
        l.d(jVar, "");
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(innerEffectExtraConfig, "");
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
        this.replaceStringColor = i15;
        this.typefacePath = pVar;
        this.fontStyle = i16;
        this.paintStyle = style;
        this.textColorStart = i17;
        this.textColorEnd = i18;
        this.gradientType = kVar;
        this.gradientOrientation = jVar;
        this.gravity = i19;
        this.spacingMult = f2;
        this.spacingAdd = f3;
        this.spacingLetter = f4;
        this.cursorColor = str;
        this.strokeConfigs = list;
        this.coverConfigs = list2;
        this.bgConfigs = list3;
        this.shadowConfig = innerEffectTextShadowConfig;
        this.extraConfig = innerEffectExtraConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextConfig(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, p pVar, int i16, Paint.Style style, int i17, int i18, k kVar, j jVar, int i19, float f2, float f3, float f4, String str, List list, List list2, List list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig, int i20, g gVar) {
        this((i20 & 1) != 0 ? 0 : i2, (i20 & 2) != 0 ? 0 : i3, (i20 & 4) != 0 ? 0 : i4, (i20 & 8) != 0 ? 0 : i5, (i20 & 16) != 0 ? 0 : i6, (i20 & 32) != 0 ? 0 : i7, (i20 & 64) != 0 ? 0 : i8, (i20 & 128) != 0 ? 0 : i9, (i20 & 256) != 0 ? 0 : i10, (i20 & 512) != 0 ? 44 : i11, (i20 & 1024) != 0 ? 3 : i12, (i20 & 2048) != 0 ? 0 : i13, (i20 & 4096) != 0 ? 0 : i14, (i20 & 8192) != 0 ? -7829368 : i15, (i20 & 16384) != 0 ? null : pVar, (32768 & i20) != 0 ? 0 : i16, (65536 & i20) != 0 ? Paint.Style.FILL : style, (131072 & i20) != 0 ? -1 : i17, (262144 & i20) == 0 ? i18 : -1, (524288 & i20) != 0 ? k.NONE : kVar, (1048576 & i20) != 0 ? j.VERTICAL : jVar, (2097152 & i20) != 0 ? 17 : i19, (4194304 & i20) != 0 ? 1.0f : f2, (8388608 & i20) != 0 ? 0.0f : f3, (16777216 & i20) == 0 ? f4 : 0.0f, (33554432 & i20) != 0 ? "" : str, (67108864 & i20) != 0 ? new ArrayList() : list, (134217728 & i20) != 0 ? new ArrayList() : list2, (268435456 & i20) != 0 ? new ArrayList() : list3, (536870912 & i20) != 0 ? null : innerEffectTextShadowConfig, (i20 & 1073741824) != 0 ? new InnerEffectExtraConfig(false, 1, null) : innerEffectExtraConfig);
    }
}
