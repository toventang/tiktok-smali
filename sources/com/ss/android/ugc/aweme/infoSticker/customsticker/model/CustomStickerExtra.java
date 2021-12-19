package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class CustomStickerExtra implements Parcelable {
    public static final Parcelable.Creator<CustomStickerExtra> CREATOR = new a();
    @c(a = "upload_gif_count")
    private final int gifCountLimit;
    @c(a = "upload_image_max")
    private final int gifSizeLimit;
    @c(a = "image_input_height")
    private final int uploadHeightLimit;
    @c(a = "image_input_width")
    private final int uploadWidthLimit;

    static {
        Covode.recordClassIndex(67073);
    }

    public static int com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CustomStickerExtra copy$default(CustomStickerExtra customStickerExtra, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = customStickerExtra.gifSizeLimit;
        }
        if ((i6 & 2) != 0) {
            i3 = customStickerExtra.gifCountLimit;
        }
        if ((i6 & 4) != 0) {
            i4 = customStickerExtra.uploadWidthLimit;
        }
        if ((i6 & 8) != 0) {
            i5 = customStickerExtra.uploadHeightLimit;
        }
        return customStickerExtra.copy(i2, i3, i4, i5);
    }

    public final int component1() {
        return this.gifSizeLimit;
    }

    public final int component2() {
        return this.gifCountLimit;
    }

    public final int component3() {
        return this.uploadWidthLimit;
    }

    public final int component4() {
        return this.uploadHeightLimit;
    }

    public final CustomStickerExtra copy(int i2, int i3, int i4, int i5) {
        return new CustomStickerExtra(i2, i3, i4, i5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerExtra)) {
            return false;
        }
        CustomStickerExtra customStickerExtra = (CustomStickerExtra) obj;
        return this.gifSizeLimit == customStickerExtra.gifSizeLimit && this.gifCountLimit == customStickerExtra.gifCountLimit && this.uploadWidthLimit == customStickerExtra.uploadWidthLimit && this.uploadHeightLimit == customStickerExtra.uploadHeightLimit;
    }

    public final int hashCode() {
        return (((((com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gifSizeLimit) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gifCountLimit)) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.uploadWidthLimit)) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.uploadHeightLimit);
    }

    public final String toString() {
        return "CustomStickerExtra(gifSizeLimit=" + this.gifSizeLimit + ", gifCountLimit=" + this.gifCountLimit + ", uploadWidthLimit=" + this.uploadWidthLimit + ", uploadHeightLimit=" + this.uploadHeightLimit + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.gifSizeLimit);
        parcel.writeInt(this.gifCountLimit);
        parcel.writeInt(this.uploadWidthLimit);
        parcel.writeInt(this.uploadHeightLimit);
    }

    public final int getGifCountLimit() {
        return this.gifCountLimit;
    }

    public final int getGifSizeLimit() {
        return this.gifSizeLimit;
    }

    public final int getUploadHeightLimit() {
        return this.uploadHeightLimit;
    }

    public final int getUploadWidthLimit() {
        return this.uploadWidthLimit;
    }

    public static class a implements Parcelable.Creator<CustomStickerExtra> {
        static {
            Covode.recordClassIndex(67074);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustomStickerExtra[] newArray(int i2) {
            return new CustomStickerExtra[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomStickerExtra createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CustomStickerExtra(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public CustomStickerExtra(int i2, int i3, int i4, int i5) {
        this.gifSizeLimit = i2;
        this.gifCountLimit = i3;
        this.uploadWidthLimit = i4;
        this.uploadHeightLimit = i5;
    }
}
