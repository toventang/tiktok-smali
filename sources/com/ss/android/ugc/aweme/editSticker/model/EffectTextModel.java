package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public class EffectTextModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectTextModel> CREATOR = new a();
    @c(a = "cover_frame_index")
    private Integer coverFrameIndex;
    @c(a = "cover_select_from")
    private String coverSelectedFrom;
    @c(a = "create_aweme_cover_info")
    private CreateAwemeCoverInfo createAwemeCoverInfo;
    @c(a = "has_cover_text")
    private boolean hasCoverText;
    @c(a = "text_sticker")
    private StickerItemModel textSticker;

    static {
        Covode.recordClassIndex(55465);
    }

    public EffectTextModel() {
        this(false, null, null, null, null, 31, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.hasCoverText ? 1 : 0);
        parcel.writeParcelable(this.textSticker, i2);
        CreateAwemeCoverInfo createAwemeCoverInfo2 = this.createAwemeCoverInfo;
        if (createAwemeCoverInfo2 != null) {
            parcel.writeInt(1);
            createAwemeCoverInfo2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.coverSelectedFrom);
        Integer num = this.coverFrameIndex;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public final Integer getCoverFrameIndex() {
        return this.coverFrameIndex;
    }

    public final String getCoverSelectedFrom() {
        return this.coverSelectedFrom;
    }

    public final CreateAwemeCoverInfo getCreateAwemeCoverInfo() {
        return this.createAwemeCoverInfo;
    }

    public final boolean getHasCoverText() {
        return this.hasCoverText;
    }

    public final StickerItemModel getTextSticker() {
        return this.textSticker;
    }

    public static class a implements Parcelable.Creator<EffectTextModel> {
        static {
            Covode.recordClassIndex(55466);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectTextModel[] newArray(int i2) {
            return new EffectTextModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectTextModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            boolean z = parcel.readInt() != 0;
            StickerItemModel stickerItemModel = (StickerItemModel) parcel.readParcelable(EffectTextModel.class.getClassLoader());
            Integer num = null;
            CreateAwemeCoverInfo createFromParcel = parcel.readInt() != 0 ? CreateAwemeCoverInfo.CREATOR.createFromParcel(parcel) : null;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new EffectTextModel(z, stickerItemModel, createFromParcel, readString, num);
        }
    }

    public final void reset() {
        this.hasCoverText = false;
        this.textSticker = null;
        this.createAwemeCoverInfo = null;
    }

    public final boolean isCoverTextValid() {
        StickerItemModel stickerItemModel;
        String str;
        if (!this.hasCoverText || (stickerItemModel = this.textSticker) == null || (str = stickerItemModel.path) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final void setCoverFrameIndex(Integer num) {
        this.coverFrameIndex = num;
    }

    public final void setCoverSelectedFrom(String str) {
        this.coverSelectedFrom = str;
    }

    public final void setCreateAwemeCoverInfo(CreateAwemeCoverInfo createAwemeCoverInfo2) {
        this.createAwemeCoverInfo = createAwemeCoverInfo2;
    }

    public final void setHasCoverText(boolean z) {
        this.hasCoverText = z;
    }

    public final void setTextSticker(StickerItemModel stickerItemModel) {
        this.textSticker = stickerItemModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f9, code lost:
        if (r8 == null) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mergeCoverText(android.graphics.Bitmap r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.model.EffectTextModel.mergeCoverText(android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public EffectTextModel(boolean z, StickerItemModel stickerItemModel, CreateAwemeCoverInfo createAwemeCoverInfo2, String str, Integer num) {
        this.hasCoverText = z;
        this.textSticker = stickerItemModel;
        this.createAwemeCoverInfo = createAwemeCoverInfo2;
        this.coverSelectedFrom = str;
        this.coverFrameIndex = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectTextModel(boolean z, StickerItemModel stickerItemModel, CreateAwemeCoverInfo createAwemeCoverInfo2, String str, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : stickerItemModel, (i2 & 4) != 0 ? null : createAwemeCoverInfo2, (i2 & 8) != 0 ? null : str, (i2 & 16) == 0 ? num : null);
    }
}
