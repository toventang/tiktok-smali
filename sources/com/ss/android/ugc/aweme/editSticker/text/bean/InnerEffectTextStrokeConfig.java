package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class InnerEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextStrokeConfig> CREATOR = new a();
    private final int strokeColor;
    private final Paint.Join strokeJoin;
    private final float strokeWidth;

    static {
        Covode.recordClassIndex(55605);
    }

    public InnerEffectTextStrokeConfig() {
        this(0.0f, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ InnerEffectTextStrokeConfig copy$default(InnerEffectTextStrokeConfig innerEffectTextStrokeConfig, float f2, int i2, Paint.Join join, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = innerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = innerEffectTextStrokeConfig.strokeColor;
        }
        if ((i3 & 4) != 0) {
            join = innerEffectTextStrokeConfig.strokeJoin;
        }
        return innerEffectTextStrokeConfig.copy(f2, i2, join);
    }

    public final float component1() {
        return this.strokeWidth;
    }

    public final int component2() {
        return this.strokeColor;
    }

    public final Paint.Join component3() {
        return this.strokeJoin;
    }

    public final InnerEffectTextStrokeConfig copy(float f2, int i2, Paint.Join join) {
        l.d(join, "");
        return new InnerEffectTextStrokeConfig(f2, i2, join);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextStrokeConfig)) {
            return false;
        }
        InnerEffectTextStrokeConfig innerEffectTextStrokeConfig = (InnerEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, innerEffectTextStrokeConfig.strokeWidth) == 0 && this.strokeColor == innerEffectTextStrokeConfig.strokeColor && l.a(this.strokeJoin, innerEffectTextStrokeConfig.strokeJoin);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.strokeWidth) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.strokeColor)) * 31;
        Paint.Join join = this.strokeJoin;
        return com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (join != null ? join.hashCode() : 0);
    }

    public final String toString() {
        return "InnerEffectTextStrokeConfig(strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", strokeJoin=" + this.strokeJoin + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeString(this.strokeJoin.name());
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Join getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public static class a implements Parcelable.Creator<InnerEffectTextStrokeConfig> {
        static {
            Covode.recordClassIndex(55606);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextStrokeConfig[] newArray(int i2) {
            return new InnerEffectTextStrokeConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InnerEffectTextStrokeConfig(parcel.readFloat(), parcel.readInt(), (Paint.Join) Enum.valueOf(Paint.Join.class, parcel.readString()));
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public InnerEffectTextStrokeConfig(float f2, int i2, Paint.Join join) {
        l.d(join, "");
        this.strokeWidth = f2;
        this.strokeColor = i2;
        this.strokeJoin = join;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextStrokeConfig(float f2, int i2, Paint.Join join, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? -16777216 : i2, (i3 & 4) != 0 ? Paint.Join.ROUND : join);
    }
}
