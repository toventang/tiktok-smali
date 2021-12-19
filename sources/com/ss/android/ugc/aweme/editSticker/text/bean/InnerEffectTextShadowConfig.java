package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class InnerEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextShadowConfig> CREATOR = new a();
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    static {
        Covode.recordClassIndex(55603);
    }

    public InnerEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ InnerEffectTextShadowConfig copy$default(InnerEffectTextShadowConfig innerEffectTextShadowConfig, float f2, float f3, float f4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = innerEffectTextShadowConfig.radius;
        }
        if ((i3 & 2) != 0) {
            f3 = innerEffectTextShadowConfig.offsetX;
        }
        if ((i3 & 4) != 0) {
            f4 = innerEffectTextShadowConfig.offsetY;
        }
        if ((i3 & 8) != 0) {
            i2 = innerEffectTextShadowConfig.color;
        }
        return innerEffectTextShadowConfig.copy(f2, f3, f4, i2);
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

    public final int component4() {
        return this.color;
    }

    public final InnerEffectTextShadowConfig copy(float f2, float f3, float f4, int i2) {
        return new InnerEffectTextShadowConfig(f2, f3, f4, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextShadowConfig)) {
            return false;
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = (InnerEffectTextShadowConfig) obj;
        return Float.compare(this.radius, innerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, innerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextShadowConfig.offsetY) == 0 && this.color == innerEffectTextShadowConfig.color;
    }

    public final int hashCode() {
        return (((((com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.radius) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetX)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.offsetY)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.color);
    }

    public final String toString() {
        return "InnerEffectTextShadowConfig(radius=" + this.radius + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeInt(this.color);
    }

    public final int getColor() {
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

    public static class a implements Parcelable.Creator<InnerEffectTextShadowConfig> {
        static {
            Covode.recordClassIndex(55604);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextShadowConfig[] newArray(int i2) {
            return new InnerEffectTextShadowConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextShadowConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InnerEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public final InnerEffectTextShadowConfig genInstance(float f2) {
        return new InnerEffectTextShadowConfig(this.radius * f2, this.offsetX * f2, this.offsetY * f2, this.color);
    }

    public InnerEffectTextShadowConfig(float f2, float f3, float f4, int i2) {
        this.radius = f2;
        this.offsetX = f3;
        this.offsetY = f4;
        this.color = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextShadowConfig(float f2, float f3, float f4, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 0.0f : f3, (i3 & 4) != 0 ? 0.0f : f4, (i3 & 8) != 0 ? -7829368 : i2);
    }
}
