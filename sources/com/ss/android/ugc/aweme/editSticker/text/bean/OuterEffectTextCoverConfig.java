package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class OuterEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextCoverConfig> CREATOR = new a();
    @c(a = "gradient_orientation")
    private final int gradientOrientation;
    @c(a = "gradient_type")
    private final int gradientType;
    @c(a = "offsetX")
    private final float offsetX;
    @c(a = "offsetY")
    private final float offsetY;
    @c(a = "paint_style")
    private final int paintStyle;
    @c(a = "shadow_config")
    private final OuterEffectTextShadowConfig shadowConfig;
    @c(a = "stroke_configs")
    private final List<OuterEffectTextStrokeConfig> strokeConfigs;
    @c(a = "text_color_end")
    private final String textColorEnd;
    @c(a = "text_color_start")
    private final String textColorStart;

    static {
        Covode.recordClassIndex(55615);
    }

    public OuterEffectTextCoverConfig() {
        this(null, null, 0, 0, 0, 0.0f, 0.0f, null, null, 511, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextCoverConfig copy$default(OuterEffectTextCoverConfig outerEffectTextCoverConfig, String str, String str2, int i2, int i3, int i4, float f2, float f3, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = outerEffectTextCoverConfig.textColorStart;
        }
        if ((i5 & 2) != 0) {
            str2 = outerEffectTextCoverConfig.textColorEnd;
        }
        if ((i5 & 4) != 0) {
            i2 = outerEffectTextCoverConfig.gradientType;
        }
        if ((i5 & 8) != 0) {
            i3 = outerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i5 & 16) != 0) {
            i4 = outerEffectTextCoverConfig.paintStyle;
        }
        if ((i5 & 32) != 0) {
            f2 = outerEffectTextCoverConfig.offsetX;
        }
        if ((i5 & 64) != 0) {
            f3 = outerEffectTextCoverConfig.offsetY;
        }
        if ((i5 & 128) != 0) {
            list = outerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i5 & 256) != 0) {
            outerEffectTextShadowConfig = outerEffectTextCoverConfig.shadowConfig;
        }
        return outerEffectTextCoverConfig.copy(str, str2, i2, i3, i4, f2, f3, list, outerEffectTextShadowConfig);
    }

    public final String component1() {
        return this.textColorStart;
    }

    public final String component2() {
        return this.textColorEnd;
    }

    public final int component3() {
        return this.gradientType;
    }

    public final int component4() {
        return this.gradientOrientation;
    }

    public final int component5() {
        return this.paintStyle;
    }

    public final float component6() {
        return this.offsetX;
    }

    public final float component7() {
        return this.offsetY;
    }

    public final List<OuterEffectTextStrokeConfig> component8() {
        return this.strokeConfigs;
    }

    public final OuterEffectTextShadowConfig component9() {
        return this.shadowConfig;
    }

    public final OuterEffectTextCoverConfig copy(String str, String str2, int i2, int i3, int i4, float f2, float f3, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        return new OuterEffectTextCoverConfig(str, str2, i2, i3, i4, f2, f3, list, outerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextCoverConfig)) {
            return false;
        }
        OuterEffectTextCoverConfig outerEffectTextCoverConfig = (OuterEffectTextCoverConfig) obj;
        return l.a(this.textColorStart, outerEffectTextCoverConfig.textColorStart) && l.a(this.textColorEnd, outerEffectTextCoverConfig.textColorEnd) && this.gradientType == outerEffectTextCoverConfig.gradientType && this.gradientOrientation == outerEffectTextCoverConfig.gradientOrientation && this.paintStyle == outerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, outerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextCoverConfig.offsetY) == 0 && l.a(this.strokeConfigs, outerEffectTextCoverConfig.strokeConfigs) && l.a(this.shadowConfig, outerEffectTextCoverConfig.shadowConfig);
    }

    public final int hashCode() {
        String str = this.textColorStart;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.textColorEnd;
        int hashCode2 = (((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gradientType)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gradientOrientation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paintStyle)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetX)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetY)) * 31;
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            i2 = outerEffectTextShadowConfig.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "OuterEffectTextCoverConfig(textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", paintStyle=" + this.paintStyle + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", strokeConfigs=" + this.strokeConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.paintStyle);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextStrokeConfig outerEffectTextStrokeConfig : list) {
            outerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
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

    public static class a implements Parcelable.Creator<OuterEffectTextCoverConfig> {
        static {
            Covode.recordClassIndex(55616);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextCoverConfig[] newArray(int i2) {
            return new OuterEffectTextCoverConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextCoverConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt4--;
            }
            return new OuterEffectTextCoverConfig(readString, readString2, readInt, readInt2, readInt3, readFloat, readFloat2, arrayList, parcel.readInt() != 0 ? OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OuterEffectTextCoverConfig(String str, String str2, int i2, int i3, int i4, float f2, float f3, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        this.textColorStart = str;
        this.textColorEnd = str2;
        this.gradientType = i2;
        this.gradientOrientation = i3;
        this.paintStyle = i4;
        this.offsetX = f2;
        this.offsetY = f3;
        this.strokeConfigs = list;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextCoverConfig(String str, String str2, int i2, int i3, int i4, float f2, float f3, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i5, g gVar) {
        this((i5 & 1) != 0 ? "#ffff0000" : str, (i5 & 2) != 0 ? "#ff0000ff" : str2, (i5 & 4) != 0 ? k.NONE.getType() : i2, (i5 & 8) != 0 ? j.VERTICAL.getOrientation() : i3, (i5 & 16) != 0 ? Paint.Style.STROKE.ordinal() : i4, (i5 & 32) != 0 ? 0.0f : f2, (i5 & 64) == 0 ? f3 : 0.0f, (i5 & 128) != 0 ? new ArrayList() : list, (i5 & 256) != 0 ? null : outerEffectTextShadowConfig);
    }
}
