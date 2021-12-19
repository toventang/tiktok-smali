package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InnerEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextLayoutConfig> CREATOR = new a();
    private final InnerEffectExtraConfig extraConfig;
    private final m layoutType;
    private final int orientation;
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;
    private final float rotation;
    private final List<InnerEffectTextConfig> textConfigs;

    static {
        Covode.recordClassIndex(55601);
    }

    public InnerEffectTextLayoutConfig() {
        this(null, 0, 0.0f, 0, 0, 0, 0, null, null, 511, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextLayoutConfig copy$default(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, m mVar, int i2, float f2, int i3, int i4, int i5, int i6, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            mVar = innerEffectTextLayoutConfig.layoutType;
        }
        if ((i7 & 2) != 0) {
            i2 = innerEffectTextLayoutConfig.orientation;
        }
        if ((i7 & 4) != 0) {
            f2 = innerEffectTextLayoutConfig.rotation;
        }
        if ((i7 & 8) != 0) {
            i3 = innerEffectTextLayoutConfig.paddingStart;
        }
        if ((i7 & 16) != 0) {
            i4 = innerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i7 & 32) != 0) {
            i5 = innerEffectTextLayoutConfig.paddingTop;
        }
        if ((i7 & 64) != 0) {
            i6 = innerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i7 & 128) != 0) {
            list = innerEffectTextLayoutConfig.textConfigs;
        }
        if ((i7 & 256) != 0) {
            innerEffectExtraConfig = innerEffectTextLayoutConfig.extraConfig;
        }
        return innerEffectTextLayoutConfig.copy(mVar, i2, f2, i3, i4, i5, i6, list, innerEffectExtraConfig);
    }

    public final m component1() {
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

    public final List<InnerEffectTextConfig> component8() {
        return this.textConfigs;
    }

    public final InnerEffectExtraConfig component9() {
        return this.extraConfig;
    }

    public final InnerEffectTextLayoutConfig copy(m mVar, int i2, float f2, int i3, int i4, int i5, int i6, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        l.d(mVar, "");
        l.d(list, "");
        l.d(innerEffectExtraConfig, "");
        return new InnerEffectTextLayoutConfig(mVar, i2, f2, i3, i4, i5, i6, list, innerEffectExtraConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextLayoutConfig)) {
            return false;
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = (InnerEffectTextLayoutConfig) obj;
        return l.a(this.layoutType, innerEffectTextLayoutConfig.layoutType) && this.orientation == innerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, innerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == innerEffectTextLayoutConfig.paddingStart && this.paddingEnd == innerEffectTextLayoutConfig.paddingEnd && this.paddingTop == innerEffectTextLayoutConfig.paddingTop && this.paddingBottom == innerEffectTextLayoutConfig.paddingBottom && l.a(this.textConfigs, innerEffectTextLayoutConfig.textConfigs) && l.a(this.extraConfig, innerEffectTextLayoutConfig.extraConfig);
    }

    public final int hashCode() {
        m mVar = this.layoutType;
        int i2 = 0;
        int hashCode = (((((((((((((mVar != null ? mVar.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.orientation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rotation)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingStart)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingEnd)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingBottom)) * 31;
        List<InnerEffectTextConfig> list = this.textConfigs;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        InnerEffectExtraConfig innerEffectExtraConfig = this.extraConfig;
        if (innerEffectExtraConfig != null) {
            i2 = innerEffectExtraConfig.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "InnerEffectTextLayoutConfig(layoutType=" + this.layoutType + ", orientation=" + this.orientation + ", rotation=" + this.rotation + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", textConfigs=" + this.textConfigs + ", extraConfig=" + this.extraConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.layoutType.name());
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<InnerEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        for (InnerEffectTextConfig innerEffectTextConfig : list) {
            innerEffectTextConfig.writeToParcel(parcel, 0);
        }
        this.extraConfig.writeToParcel(parcel, 0);
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final m getLayoutType() {
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

    public final List<InnerEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    public static class a implements Parcelable.Creator<InnerEffectTextLayoutConfig> {
        static {
            Covode.recordClassIndex(55602);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextLayoutConfig[] newArray(int i2) {
            return new InnerEffectTextLayoutConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            m mVar = (m) Enum.valueOf(m.class, parcel.readString());
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            while (readInt6 != 0) {
                arrayList.add(InnerEffectTextConfig.CREATOR.createFromParcel(parcel));
                readInt6--;
            }
            return new InnerEffectTextLayoutConfig(mVar, readInt, readFloat, readInt2, readInt3, readInt4, readInt5, arrayList, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public InnerEffectTextLayoutConfig(m mVar, int i2, float f2, int i3, int i4, int i5, int i6, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        l.d(mVar, "");
        l.d(list, "");
        l.d(innerEffectExtraConfig, "");
        this.layoutType = mVar;
        this.orientation = i2;
        this.rotation = f2;
        this.paddingStart = i3;
        this.paddingEnd = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.textConfigs = list;
        this.extraConfig = innerEffectExtraConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextLayoutConfig(m mVar, int i2, float f2, int i3, int i4, int i5, int i6, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i7, g gVar) {
        this((i7 & 1) != 0 ? m.LINEAR : mVar, (i7 & 2) != 0 ? 1 : i2, (i7 & 4) != 0 ? 0.0f : f2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6, (i7 & 128) != 0 ? new ArrayList() : list, (i7 & 256) != 0 ? new InnerEffectExtraConfig(false, 1, null) : innerEffectExtraConfig);
    }
}
