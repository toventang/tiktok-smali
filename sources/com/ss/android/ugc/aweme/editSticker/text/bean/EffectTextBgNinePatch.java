package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class EffectTextBgNinePatch implements Parcelable {
    public static final Parcelable.Creator<EffectTextBgNinePatch> CREATOR = new a();
    @c(a = "divX")
    private final List<NinePatchDiv> divX;
    @c(a = "divY")
    private final List<NinePatchDiv> divY;
    @c(a = "padding_bottom")
    private final int paddingBottom;
    @c(a = "padding_left")
    private final int paddingLeft;
    @c(a = "padding_right")
    private final int paddingRight;
    @c(a = "padding_top")
    private final int paddingTop;

    static {
        Covode.recordClassIndex(55591);
    }

    public EffectTextBgNinePatch() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectTextBgNinePatch copy$default(EffectTextBgNinePatch effectTextBgNinePatch, List list, List list2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = effectTextBgNinePatch.divX;
        }
        if ((i6 & 2) != 0) {
            list2 = effectTextBgNinePatch.divY;
        }
        if ((i6 & 4) != 0) {
            i2 = effectTextBgNinePatch.paddingLeft;
        }
        if ((i6 & 8) != 0) {
            i3 = effectTextBgNinePatch.paddingRight;
        }
        if ((i6 & 16) != 0) {
            i4 = effectTextBgNinePatch.paddingTop;
        }
        if ((i6 & 32) != 0) {
            i5 = effectTextBgNinePatch.paddingBottom;
        }
        return effectTextBgNinePatch.copy(list, list2, i2, i3, i4, i5);
    }

    public final List<NinePatchDiv> component1() {
        return this.divX;
    }

    public final List<NinePatchDiv> component2() {
        return this.divY;
    }

    public final int component3() {
        return this.paddingLeft;
    }

    public final int component4() {
        return this.paddingRight;
    }

    public final int component5() {
        return this.paddingTop;
    }

    public final int component6() {
        return this.paddingBottom;
    }

    public final EffectTextBgNinePatch copy(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i2, int i3, int i4, int i5) {
        l.d(list, "");
        l.d(list2, "");
        return new EffectTextBgNinePatch(list, list2, i2, i3, i4, i5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectTextBgNinePatch)) {
            return false;
        }
        EffectTextBgNinePatch effectTextBgNinePatch = (EffectTextBgNinePatch) obj;
        return l.a(this.divX, effectTextBgNinePatch.divX) && l.a(this.divY, effectTextBgNinePatch.divY) && this.paddingLeft == effectTextBgNinePatch.paddingLeft && this.paddingRight == effectTextBgNinePatch.paddingRight && this.paddingTop == effectTextBgNinePatch.paddingTop && this.paddingBottom == effectTextBgNinePatch.paddingBottom;
    }

    public final int hashCode() {
        List<NinePatchDiv> list = this.divX;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<NinePatchDiv> list2 = this.divY;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return ((((((((hashCode + i2) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingLeft)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingRight)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingTop)) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_EffectTextBgNinePatch_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.paddingBottom);
    }

    public final String toString() {
        return "EffectTextBgNinePatch(divX=" + this.divX + ", divY=" + this.divY + ", paddingLeft=" + this.paddingLeft + ", paddingRight=" + this.paddingRight + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<NinePatchDiv> list = this.divX;
        parcel.writeInt(list.size());
        for (NinePatchDiv ninePatchDiv : list) {
            ninePatchDiv.writeToParcel(parcel, 0);
        }
        List<NinePatchDiv> list2 = this.divY;
        parcel.writeInt(list2.size());
        for (NinePatchDiv ninePatchDiv2 : list2) {
            ninePatchDiv2.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.paddingLeft);
        parcel.writeInt(this.paddingRight);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
    }

    public final List<NinePatchDiv> getDivX() {
        return this.divX;
    }

    public final List<NinePatchDiv> getDivY() {
        return this.divY;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public static class a implements Parcelable.Creator<EffectTextBgNinePatch> {
        static {
            Covode.recordClassIndex(55592);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectTextBgNinePatch[] newArray(int i2) {
            return new EffectTextBgNinePatch[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectTextBgNinePatch createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(NinePatchDiv.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new EffectTextBgNinePatch(arrayList, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public EffectTextBgNinePatch(List<NinePatchDiv> list, List<NinePatchDiv> list2, int i2, int i3, int i4, int i5) {
        l.d(list, "");
        l.d(list2, "");
        this.divX = list;
        this.divY = list2;
        this.paddingLeft = i2;
        this.paddingRight = i3;
        this.paddingTop = i4;
        this.paddingBottom = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectTextBgNinePatch(List list, List list2, int i2, int i3, int i4, int i5, int i6, g gVar) {
        this((i6 & 1) != 0 ? new ArrayList() : list, (i6 & 2) != 0 ? new ArrayList() : list2, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) == 0 ? i5 : 0);
    }
}
