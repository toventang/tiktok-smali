package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TextStickerString implements Parcelable {
    public static final Parcelable.Creator<TextStickerString> CREATOR = new a();
    private final String str;

    static {
        Covode.recordClassIndex(55630);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.str);
    }

    public final String getStr() {
        return this.str;
    }

    public static class a implements Parcelable.Creator<TextStickerString> {
        static {
            Covode.recordClassIndex(55631);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerString[] newArray(int i2) {
            return new TextStickerString[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerString createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new TextStickerString(parcel.readString());
        }
    }

    public TextStickerString(String str2) {
        l.d(str2, "");
        this.str = str2;
    }
}
