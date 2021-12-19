package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class OuterEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextStrokeConfig> CREATOR = new a();
    @c(a = "stroke_color")
    private final String strokeColor;
    @c(a = "stroke_join")
    private final int strokeJoin;
    @c(a = "stroke_width")
    private final float strokeWidth;

    static {
        Covode.recordClassIndex(55621);
    }

    public OuterEffectTextStrokeConfig() {
        this(0.0f, null, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ OuterEffectTextStrokeConfig copy$default(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, float f2, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = outerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i3 & 2) != 0) {
            str = outerEffectTextStrokeConfig.strokeColor;
        }
        if ((i3 & 4) != 0) {
            i2 = outerEffectTextStrokeConfig.strokeJoin;
        }
        return outerEffectTextStrokeConfig.copy(f2, str, i2);
    }

    public final float component1() {
        return this.strokeWidth;
    }

    public final String component2() {
        return this.strokeColor;
    }

    public final int component3() {
        return this.strokeJoin;
    }

    public final OuterEffectTextStrokeConfig copy(float f2, String str, int i2) {
        l.d(str, "");
        return new OuterEffectTextStrokeConfig(f2, str, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextStrokeConfig)) {
            return false;
        }
        OuterEffectTextStrokeConfig outerEffectTextStrokeConfig = (OuterEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, outerEffectTextStrokeConfig.strokeWidth) == 0 && l.a(this.strokeColor, outerEffectTextStrokeConfig.strokeColor) && this.strokeJoin == outerEffectTextStrokeConfig.strokeJoin;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.strokeWidth) * 31;
        String str = this.strokeColor;
        return ((com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.strokeJoin);
    }

    public final String toString() {
        return "OuterEffectTextStrokeConfig(strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", strokeJoin=" + this.strokeJoin + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.strokeWidth);
        parcel.writeString(this.strokeColor);
        parcel.writeInt(this.strokeJoin);
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public static class a implements Parcelable.Creator<OuterEffectTextStrokeConfig> {
        static {
            Covode.recordClassIndex(55622);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextStrokeConfig[] newArray(int i2) {
            return new OuterEffectTextStrokeConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new OuterEffectTextStrokeConfig(parcel.readFloat(), parcel.readString(), parcel.readInt());
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OuterEffectTextStrokeConfig(float f2, String str, int i2) {
        l.d(str, "");
        this.strokeWidth = f2;
        this.strokeColor = str;
        this.strokeJoin = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextStrokeConfig(float f2, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? "#ff000000" : str, (i3 & 4) != 0 ? Paint.Join.ROUND.ordinal() : i2);
    }
}
