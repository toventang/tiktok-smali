package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class OuterEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextLayoutConfig> CREATOR = new a();
    @c(a = "layout_type")
    private final int layoutType;
    @c(a = "orientation")
    private final int orientation;
    @c(a = "padding_bottom")
    private final int paddingBottom;
    @c(a = "padding_end")
    private final int paddingEnd;
    @c(a = "padding_start")
    private final int paddingStart;
    @c(a = "padding_top")
    private final int paddingTop;
    @c(a = "rotation")
    private final float rotation;
    @c(a = "text_configs")
    private final List<OuterEffectTextConfig> textConfigs;

    static {
        Covode.recordClassIndex(55617);
    }

    public OuterEffectTextLayoutConfig() {
        this(0, 0, 0.0f, 0, 0, 0, 0, null, 255, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextLayoutConfig copy$default(OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, int i2, int i3, float f2, int i4, int i5, int i6, int i7, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i2 = outerEffectTextLayoutConfig.layoutType;
        }
        if ((i8 & 2) != 0) {
            i3 = outerEffectTextLayoutConfig.orientation;
        }
        if ((i8 & 4) != 0) {
            f2 = outerEffectTextLayoutConfig.rotation;
        }
        if ((i8 & 8) != 0) {
            i4 = outerEffectTextLayoutConfig.paddingStart;
        }
        if ((i8 & 16) != 0) {
            i5 = outerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i8 & 32) != 0) {
            i6 = outerEffectTextLayoutConfig.paddingTop;
        }
        if ((i8 & 64) != 0) {
            i7 = outerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i8 & 128) != 0) {
            list = outerEffectTextLayoutConfig.textConfigs;
        }
        return outerEffectTextLayoutConfig.copy(i2, i3, f2, i4, i5, i6, i7, list);
    }

    public final int component1() {
        return this.layoutType;
    }

    public final int component2() {
        return this.orientation;
    }

    public final float component3() {
        return this.rotation;
    }

    public final int component4() {
        return this.paddingStart;
    }

    public final int component5() {
        return this.paddingEnd;
    }

    public final int component6() {
        return this.paddingTop;
    }

    public final int component7() {
        return this.paddingBottom;
    }

    public final List<OuterEffectTextConfig> component8() {
        return this.textConfigs;
    }

    public final OuterEffectTextLayoutConfig copy(int i2, int i3, float f2, int i4, int i5, int i6, int i7, List<OuterEffectTextConfig> list) {
        l.d(list, "");
        return new OuterEffectTextLayoutConfig(i2, i3, f2, i4, i5, i6, i7, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextLayoutConfig)) {
            return false;
        }
        OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) obj;
        return this.layoutType == outerEffectTextLayoutConfig.layoutType && this.orientation == outerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, outerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == outerEffectTextLayoutConfig.paddingStart && this.paddingEnd == outerEffectTextLayoutConfig.paddingEnd && this.paddingTop == outerEffectTextLayoutConfig.paddingTop && this.paddingBottom == outerEffectTextLayoutConfig.paddingBottom && l.a(this.textConfigs, outerEffectTextLayoutConfig.textConfigs);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.layoutType) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.orientation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rotation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingBottom)) * 31;
        List<OuterEffectTextConfig> list = this.textConfigs;
        return com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "OuterEffectTextLayoutConfig(layoutType=" + this.layoutType + ", orientation=" + this.orientation + ", rotation=" + this.rotation + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", textConfigs=" + this.textConfigs + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.layoutType);
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<OuterEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextConfig outerEffectTextConfig : list) {
            outerEffectTextConfig.writeToParcel(parcel, 0);
        }
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final int getOrientation() {
        return this.orientation;
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

    public final float getRotation() {
        return this.rotation;
    }

    public final List<OuterEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    public static class a implements Parcelable.Creator<OuterEffectTextLayoutConfig> {
        static {
            Covode.recordClassIndex(55618);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextLayoutConfig[] newArray(int i2) {
            return new OuterEffectTextLayoutConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt7);
            while (readInt7 != 0) {
                arrayList.add(OuterEffectTextConfig.CREATOR.createFromParcel(parcel));
                readInt7--;
            }
            return new OuterEffectTextLayoutConfig(readInt, readInt2, readFloat, readInt3, readInt4, readInt5, readInt6, arrayList);
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public OuterEffectTextLayoutConfig(int i2, int i3, float f2, int i4, int i5, int i6, int i7, List<OuterEffectTextConfig> list) {
        l.d(list, "");
        this.layoutType = i2;
        this.orientation = i3;
        this.rotation = f2;
        this.paddingStart = i4;
        this.paddingEnd = i5;
        this.paddingTop = i6;
        this.paddingBottom = i7;
        this.textConfigs = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextLayoutConfig(int i2, int i3, float f2, int i4, int i5, int i6, int i7, List list, int i8, g gVar) {
        this((i8 & 1) != 0 ? m.LINEAR.getType() : i2, (i8 & 2) != 0 ? 1 : i3, (i8 & 4) != 0 ? 0.0f : f2, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) == 0 ? i7 : 0, (i8 & 128) != 0 ? new ArrayList() : list);
    }
}
