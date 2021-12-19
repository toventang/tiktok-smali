package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class TextStickerCoverExtraData implements Parcelable {
    public static final Parcelable.Creator<TextStickerCoverExtraData> CREATOR = new a();
    private final boolean isPortrait;

    static {
        Covode.recordClassIndex(55623);
    }

    public TextStickerCoverExtraData() {
        this(false, 1, null);
    }

    public static /* synthetic */ TextStickerCoverExtraData copy$default(TextStickerCoverExtraData textStickerCoverExtraData, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = textStickerCoverExtraData.isPortrait;
        }
        return textStickerCoverExtraData.copy(z);
    }

    public final boolean component1() {
        return this.isPortrait;
    }

    public final TextStickerCoverExtraData copy(boolean z) {
        return new TextStickerCoverExtraData(z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStickerCoverExtraData) && this.isPortrait == ((TextStickerCoverExtraData) obj).isPortrait;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isPortrait;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "TextStickerCoverExtraData(isPortrait=" + this.isPortrait + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.isPortrait ? 1 : 0);
    }

    public final boolean isPortrait() {
        return this.isPortrait;
    }

    public static class a implements Parcelable.Creator<TextStickerCoverExtraData> {
        static {
            Covode.recordClassIndex(55624);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerCoverExtraData[] newArray(int i2) {
            return new TextStickerCoverExtraData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerCoverExtraData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new TextStickerCoverExtraData(parcel.readInt() != 0);
        }
    }

    public TextStickerCoverExtraData(boolean z) {
        this.isPortrait = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStickerCoverExtraData(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : z);
    }
}
