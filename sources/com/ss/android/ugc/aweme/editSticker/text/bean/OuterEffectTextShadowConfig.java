package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class OuterEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextShadowConfig> CREATOR = new a();
    @c(a = b.f37372a)
    private final String color;
    @c(a = "offsetX")
    private final float offsetX;
    @c(a = "offsetY")
    private final float offsetY;
    @c(a = "radius")
    private final float radius;

    static {
        Covode.recordClassIndex(55619);
    }

    public OuterEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, null, 15, null);
    }

    public static /* synthetic */ OuterEffectTextShadowConfig copy$default(OuterEffectTextShadowConfig outerEffectTextShadowConfig, float f2, float f3, float f4, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = outerEffectTextShadowConfig.radius;
        }
        if ((i2 & 2) != 0) {
            f3 = outerEffectTextShadowConfig.offsetX;
        }
        if ((i2 & 4) != 0) {
            f4 = outerEffectTextShadowConfig.offsetY;
        }
        if ((i2 & 8) != 0) {
            str = outerEffectTextShadowConfig.color;
        }
        return outerEffectTextShadowConfig.copy(f2, f3, f4, str);
    }

    public final float component1() {
        return this.radius;
    }

    public final float component2() {
        return this.offsetX;
    }

    public final float component3() {
        return this.offsetY;
    }

    public final String component4() {
        return this.color;
    }

    public final OuterEffectTextShadowConfig copy(float f2, float f3, float f4, String str) {
        l.d(str, "");
        return new OuterEffectTextShadowConfig(f2, f3, f4, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextShadowConfig)) {
            return false;
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = (OuterEffectTextShadowConfig) obj;
        return Float.compare(this.radius, outerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, outerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextShadowConfig.offsetY) == 0 && l.a(this.color, outerEffectTextShadowConfig.color);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.radius) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetX)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetY)) * 31;
        String str = this.color;
        return com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OuterEffectTextShadowConfig(radius=" + this.radius + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeString(this.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public static class a implements Parcelable.Creator<OuterEffectTextShadowConfig> {
        static {
            Covode.recordClassIndex(55620);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextShadowConfig[] newArray(int i2) {
            return new OuterEffectTextShadowConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextShadowConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new OuterEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OuterEffectTextShadowConfig(float f2, float f3, float f4, String str) {
        l.d(str, "");
        this.radius = f2;
        this.offsetX = f3;
        this.offsetY = f4;
        this.color = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextShadowConfig(float f2, float f3, float f4, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? "#FF888888" : str);
    }
}
