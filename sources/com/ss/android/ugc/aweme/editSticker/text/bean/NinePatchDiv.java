package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class NinePatchDiv implements Parcelable, Serializable {
    public static final Parcelable.Creator<NinePatchDiv> CREATOR = new a();
    private final int end;
    private final int start;

    static {
        Covode.recordClassIndex(55609);
    }

    public static int com_ss_android_ugc_aweme_editSticker_text_bean_NinePatchDiv_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ NinePatchDiv copy$default(NinePatchDiv ninePatchDiv, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = ninePatchDiv.start;
        }
        if ((i4 & 2) != 0) {
            i3 = ninePatchDiv.end;
        }
        return ninePatchDiv.copy(i2, i3);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final NinePatchDiv copy(int i2, int i3) {
        return new NinePatchDiv(i2, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NinePatchDiv)) {
            return false;
        }
        NinePatchDiv ninePatchDiv = (NinePatchDiv) obj;
        return this.start == ninePatchDiv.start && this.end == ninePatchDiv.end;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_editSticker_text_bean_NinePatchDiv_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.start) * 31) + com_ss_android_ugc_aweme_editSticker_text_bean_NinePatchDiv_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.end);
    }

    public final String toString() {
        return "NinePatchDiv(start=" + this.start + ", end=" + this.end + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public static class a implements Parcelable.Creator<NinePatchDiv> {
        static {
            Covode.recordClassIndex(55610);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NinePatchDiv[] newArray(int i2) {
            return new NinePatchDiv[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NinePatchDiv createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new NinePatchDiv(parcel.readInt(), parcel.readInt());
        }
    }

    public NinePatchDiv(int i2, int i3) {
        this.start = i2;
        this.end = i3;
    }
}
