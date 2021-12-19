package com.ss.android.ugc.aweme.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class TTStoryUploadModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TTStoryUploadModel> CREATOR = new a();
    @c(a = "contentType", b = {"c"})
    private final int contentType;
    @c(a = "index", b = {"a"})
    private final int index;
    @c(a = "totalCount", b = {"b"})
    private final int totalCount;

    static {
        Covode.recordClassIndex(55346);
    }

    public TTStoryUploadModel() {
        this(0, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_edit_TTStoryUploadModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ TTStoryUploadModel copy$default(TTStoryUploadModel tTStoryUploadModel, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = tTStoryUploadModel.index;
        }
        if ((i5 & 2) != 0) {
            i3 = tTStoryUploadModel.totalCount;
        }
        if ((i5 & 4) != 0) {
            i4 = tTStoryUploadModel.contentType;
        }
        return tTStoryUploadModel.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.index;
    }

    public final int component2() {
        return this.totalCount;
    }

    public final int component3() {
        return this.contentType;
    }

    public final TTStoryUploadModel copy(int i2, int i3, int i4) {
        return new TTStoryUploadModel(i2, i3, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTStoryUploadModel)) {
            return false;
        }
        TTStoryUploadModel tTStoryUploadModel = (TTStoryUploadModel) obj;
        return this.index == tTStoryUploadModel.index && this.totalCount == tTStoryUploadModel.totalCount && this.contentType == tTStoryUploadModel.contentType;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_edit_TTStoryUploadModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.index) * 31) + com_ss_android_ugc_aweme_edit_TTStoryUploadModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalCount)) * 31) + com_ss_android_ugc_aweme_edit_TTStoryUploadModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.contentType);
    }

    public final String toString() {
        return "TTStoryUploadModel(index=" + this.index + ", totalCount=" + this.totalCount + ", contentType=" + this.contentType + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.index);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.contentType);
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public static class a implements Parcelable.Creator<TTStoryUploadModel> {
        static {
            Covode.recordClassIndex(55347);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TTStoryUploadModel[] newArray(int i2) {
            return new TTStoryUploadModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TTStoryUploadModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new TTStoryUploadModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public TTStoryUploadModel(int i2, int i3, int i4) {
        this.index = i2;
        this.totalCount = i3;
        this.contentType = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TTStoryUploadModel(int i2, int i3, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
    }
}
