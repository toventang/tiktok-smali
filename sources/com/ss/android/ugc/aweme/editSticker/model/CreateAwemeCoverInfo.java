package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class CreateAwemeCoverInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverInfo> CREATOR = new a();
    @c(a = "cover_text_attr")
    private final CreateAwemeCoverTextAttr coverTextAttr;
    @c(a = "is_cover_positioned")
    private final int isCoverPositioned;
    @c(a = "is_cover_text")
    private final int isCoverText;

    static {
        Covode.recordClassIndex(55461);
    }

    public static /* synthetic */ CreateAwemeCoverInfo copy$default(CreateAwemeCoverInfo createAwemeCoverInfo, int i2, int i3, CreateAwemeCoverTextAttr createAwemeCoverTextAttr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = createAwemeCoverInfo.isCoverText;
        }
        if ((i4 & 2) != 0) {
            i3 = createAwemeCoverInfo.isCoverPositioned;
        }
        if ((i4 & 4) != 0) {
            createAwemeCoverTextAttr = createAwemeCoverInfo.coverTextAttr;
        }
        return createAwemeCoverInfo.copy(i2, i3, createAwemeCoverTextAttr);
    }

    public final int component1() {
        return this.isCoverText;
    }

    public final int component2() {
        return this.isCoverPositioned;
    }

    public final CreateAwemeCoverTextAttr component3() {
        return this.coverTextAttr;
    }

    public final CreateAwemeCoverInfo copy(int i2, int i3, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        l.d(createAwemeCoverTextAttr, "");
        return new CreateAwemeCoverInfo(i2, i3, createAwemeCoverTextAttr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAwemeCoverInfo)) {
            return false;
        }
        CreateAwemeCoverInfo createAwemeCoverInfo = (CreateAwemeCoverInfo) obj;
        return this.isCoverText == createAwemeCoverInfo.isCoverText && this.isCoverPositioned == createAwemeCoverInfo.isCoverPositioned && l.a(this.coverTextAttr, createAwemeCoverInfo.coverTextAttr);
    }

    public final int hashCode() {
        int i2 = ((this.isCoverText * 31) + this.isCoverPositioned) * 31;
        CreateAwemeCoverTextAttr createAwemeCoverTextAttr = this.coverTextAttr;
        return i2 + (createAwemeCoverTextAttr != null ? createAwemeCoverTextAttr.hashCode() : 0);
    }

    public final String toString() {
        return "CreateAwemeCoverInfo(isCoverText=" + this.isCoverText + ", isCoverPositioned=" + this.isCoverPositioned + ", coverTextAttr=" + this.coverTextAttr + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.isCoverText);
        parcel.writeInt(this.isCoverPositioned);
        this.coverTextAttr.writeToParcel(parcel, 0);
    }

    public final CreateAwemeCoverTextAttr getCoverTextAttr() {
        return this.coverTextAttr;
    }

    public final int isCoverPositioned() {
        return this.isCoverPositioned;
    }

    public final int isCoverText() {
        return this.isCoverText;
    }

    public static class a implements Parcelable.Creator<CreateAwemeCoverInfo> {
        static {
            Covode.recordClassIndex(55462);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateAwemeCoverInfo[] newArray(int i2) {
            return new CreateAwemeCoverInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateAwemeCoverInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CreateAwemeCoverInfo(parcel.readInt(), parcel.readInt(), CreateAwemeCoverTextAttr.CREATOR.createFromParcel(parcel));
        }
    }

    public CreateAwemeCoverInfo(int i2, int i3, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        l.d(createAwemeCoverTextAttr, "");
        this.isCoverText = i2;
        this.isCoverPositioned = i3;
        this.coverTextAttr = createAwemeCoverTextAttr;
    }
}
