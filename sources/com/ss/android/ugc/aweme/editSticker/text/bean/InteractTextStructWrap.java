package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;

public final class InteractTextStructWrap implements Parcelable {
    public static final Parcelable.Creator<InteractTextStructWrap> CREATOR = new a();
    private final TextStickerTextUnderlineIndexRange range;
    private final CreateAnchorInfo struct;

    static {
        Covode.recordClassIndex(55607);
    }

    public static /* synthetic */ InteractTextStructWrap copy$default(InteractTextStructWrap interactTextStructWrap, TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textStickerTextUnderlineIndexRange = interactTextStructWrap.range;
        }
        if ((i2 & 2) != 0) {
            createAnchorInfo = interactTextStructWrap.struct;
        }
        return interactTextStructWrap.copy(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final TextStickerTextUnderlineIndexRange component1() {
        return this.range;
    }

    public final CreateAnchorInfo component2() {
        return this.struct;
    }

    public final InteractTextStructWrap copy(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        l.d(textStickerTextUnderlineIndexRange, "");
        l.d(createAnchorInfo, "");
        return new InteractTextStructWrap(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractTextStructWrap)) {
            return false;
        }
        InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) obj;
        return l.a(this.range, interactTextStructWrap.range) && l.a(this.struct, interactTextStructWrap.struct);
    }

    public final int hashCode() {
        TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = this.range;
        int i2 = 0;
        int hashCode = (textStickerTextUnderlineIndexRange != null ? textStickerTextUnderlineIndexRange.hashCode() : 0) * 31;
        CreateAnchorInfo createAnchorInfo = this.struct;
        if (createAnchorInfo != null) {
            i2 = createAnchorInfo.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InteractTextStructWrap(range=" + this.range + ", struct=" + this.struct + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        this.range.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.struct, i2);
    }

    public final TextStickerTextUnderlineIndexRange getRange() {
        return this.range;
    }

    public final CreateAnchorInfo getStruct() {
        return this.struct;
    }

    public static class a implements Parcelable.Creator<InteractTextStructWrap> {
        static {
            Covode.recordClassIndex(55608);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InteractTextStructWrap[] newArray(int i2) {
            return new InteractTextStructWrap[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InteractTextStructWrap createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InteractTextStructWrap(TextStickerTextUnderlineIndexRange.CREATOR.createFromParcel(parcel), (CreateAnchorInfo) parcel.readParcelable(InteractTextStructWrap.class.getClassLoader()));
        }
    }

    public final boolean isValid(int i2) {
        return this.range.isValid(i2);
    }

    public InteractTextStructWrap(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        l.d(textStickerTextUnderlineIndexRange, "");
        l.d(createAnchorInfo, "");
        this.range = textStickerTextUnderlineIndexRange;
        this.struct = createAnchorInfo;
    }
}
