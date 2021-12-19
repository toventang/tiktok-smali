package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TextStickerTextUnderlineIndexRange implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextUnderlineIndexRange> CREATOR = new a();
    private int end;
    private int start;

    static {
        Covode.recordClassIndex(55637);
    }

    public final int describeContents() {
        return 0;
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

    public final int hashCode() {
        return this.start;
    }

    public static class a implements Parcelable.Creator<TextStickerTextUnderlineIndexRange> {
        static {
            Covode.recordClassIndex(55638);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerTextUnderlineIndexRange[] newArray(int i2) {
            return new TextStickerTextUnderlineIndexRange[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerTextUnderlineIndexRange createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new TextStickerTextUnderlineIndexRange(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // java.lang.Object
    public final TextStickerTextUnderlineIndexRange clone() {
        return new TextStickerTextUnderlineIndexRange(this.start, this.end);
    }

    public final void setEnd(int i2) {
        this.end = i2;
    }

    public final void setStart(int i2) {
        this.start = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStickerTextUnderlineIndexRange) {
            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = (TextStickerTextUnderlineIndexRange) obj;
            if (this.start == textStickerTextUnderlineIndexRange.start && this.end == textStickerTextUnderlineIndexRange.end) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean isValid(int i2) {
        int i3;
        int i4;
        if (i2 <= 0 || (i3 = this.start) < 0 || (i4 = this.end) > i2 || i4 - i3 <= 0) {
            return false;
        }
        return true;
    }

    public TextStickerTextUnderlineIndexRange(int i2, int i3) {
        this.start = i2;
        this.end = i3;
    }
}
