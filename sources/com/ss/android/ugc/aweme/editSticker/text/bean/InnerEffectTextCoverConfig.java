package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InnerEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextCoverConfig> CREATOR = new a();
    private final j gradientOrientation;
    private final k gradientType;
    private final float offsetX;
    private final float offsetY;
    private final Paint.Style paintStyle;
    private final InnerEffectTextShadowConfig shadowConfig;
    private final List<InnerEffectTextStrokeConfig> strokeConfigs;
    private final int textColorEnd;
    private final int textColorStart;

    static {
        Covode.recordClassIndex(55599);
    }

    public InnerEffectTextCoverConfig() {
        this(0, 0, null, null, null, 0.0f, 0.0f, null, null, 511, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextCoverConfig copy$default(InnerEffectTextCoverConfig innerEffectTextCoverConfig, int i2, int i3, k kVar, j jVar, Paint.Style style, float f2, float f3, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = innerEffectTextCoverConfig.textColorStart;
        }
        if ((i4 & 2) != 0) {
            i3 = innerEffectTextCoverConfig.textColorEnd;
        }
        if ((i4 & 4) != 0) {
            kVar = innerEffectTextCoverConfig.gradientType;
        }
        if ((i4 & 8) != 0) {
            jVar = innerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i4 & 16) != 0) {
            style = innerEffectTextCoverConfig.paintStyle;
        }
        if ((i4 & 32) != 0) {
            f2 = innerEffectTextCoverConfig.offsetX;
        }
        if ((i4 & 64) != 0) {
            f3 = innerEffectTextCoverConfig.offsetY;
        }
        if ((i4 & 128) != 0) {
            list = innerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i4 & 256) != 0) {
            innerEffectTextShadowConfig = innerEffectTextCoverConfig.shadowConfig;
        }
        return innerEffectTextCoverConfig.copy(i2, i3, kVar, jVar, style, f2, f3, list, innerEffectTextShadowConfig);
    }

    public final int component1() {
        return this.textColorStart;
    }

    public final int component2() {
        return this.textColorEnd;
    }

    public final k component3() {
        return this.gradientType;
    }

    public final j component4() {
        return this.gradientOrientation;
    }

    public final Paint.Style component5() {
        return this.paintStyle;
    }

    public final float component6() {
        return this.offsetX;
    }

    public final float component7() {
        return this.offsetY;
    }

    public final List<InnerEffectTextStrokeConfig> component8() {
        return this.strokeConfigs;
    }

    public final InnerEffectTextShadowConfig component9() {
        return this.shadowConfig;
    }

    public final InnerEffectTextCoverConfig copy(int i2, int i3, k kVar, j jVar, Paint.Style style, float f2, float f3, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        l.d(kVar, "");
        l.d(jVar, "");
        l.d(style, "");
        l.d(list, "");
        return new InnerEffectTextCoverConfig(i2, i3, kVar, jVar, style, f2, f3, list, innerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextCoverConfig)) {
            return false;
        }
        InnerEffectTextCoverConfig innerEffectTextCoverConfig = (InnerEffectTextCoverConfig) obj;
        return this.textColorStart == innerEffectTextCoverConfig.textColorStart && this.textColorEnd == innerEffectTextCoverConfig.textColorEnd && l.a(this.gradientType, innerEffectTextCoverConfig.gradientType) && l.a(this.gradientOrientation, innerEffectTextCoverConfig.gradientOrientation) && l.a(this.paintStyle, innerEffectTextCoverConfig.paintStyle) && Float.compare(this.offsetX, innerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextCoverConfig.offsetY) == 0 && l.a(this.strokeConfigs, innerEffectTextCoverConfig.strokeConfigs) && l.a(this.shadowConfig, innerEffectTextCoverConfig.shadowConfig);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textColorStart) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.textColorEnd)) * 31;
        k kVar = this.gradientType;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        j jVar = this.gradientOrientation;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Paint.Style style = this.paintStyle;
        int hashCode3 = (((((hashCode2 + (style != null ? style.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetX)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetY)) * 31;
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            i2 = innerEffectTextShadowConfig.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "InnerEffectTextCoverConfig(textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", paintStyle=" + this.paintStyle + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", strokeConfigs=" + this.strokeConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.textColorStart);
        parcel.writeInt(this.textColorEnd);
        parcel.writeString(this.gradientType.name());
        parcel.writeString(this.gradientOrientation.name());
        parcel.writeString(this.paintStyle.name());
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig : list) {
            innerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final j getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final k getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
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

    public static class a implements Parcelable.Creator<InnerEffectTextCoverConfig> {
        static {
            Covode.recordClassIndex(55600);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextCoverConfig[] newArray(int i2) {
            return new InnerEffectTextCoverConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextCoverConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            k kVar = (k) Enum.valueOf(k.class, parcel.readString());
            j jVar = (j) Enum.valueOf(j.class, parcel.readString());
            Paint.Style style = (Paint.Style) Enum.valueOf(Paint.Style.class, parcel.readString());
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(InnerEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt3--;
            }
            return new InnerEffectTextCoverConfig(readInt, readInt2, kVar, jVar, style, readFloat, readFloat2, arrayList, parcel.readInt() != 0 ? InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public InnerEffectTextCoverConfig(int i2, int i3, k kVar, j jVar, Paint.Style style, float f2, float f3, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        l.d(kVar, "");
        l.d(jVar, "");
        l.d(style, "");
        l.d(list, "");
        this.textColorStart = i2;
        this.textColorEnd = i3;
        this.gradientType = kVar;
        this.gradientOrientation = jVar;
        this.paintStyle = style;
        this.offsetX = f2;
        this.offsetY = f3;
        this.strokeConfigs = list;
        this.shadowConfig = innerEffectTextShadowConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextCoverConfig(int i2, int i3, k kVar, j jVar, Paint.Style style, float f2, float f3, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i4, g gVar) {
        this((i4 & 1) != 0 ? -65536 : i2, (i4 & 2) != 0 ? -16776961 : i3, (i4 & 4) != 0 ? k.NONE : kVar, (i4 & 8) != 0 ? j.VERTICAL : jVar, (i4 & 16) != 0 ? Paint.Style.STROKE : style, (i4 & 32) != 0 ? 0.0f : f2, (i4 & 64) == 0 ? f3 : 0.0f, (i4 & 128) != 0 ? new ArrayList() : list, (i4 & 256) != 0 ? null : innerEffectTextShadowConfig);
    }
}
