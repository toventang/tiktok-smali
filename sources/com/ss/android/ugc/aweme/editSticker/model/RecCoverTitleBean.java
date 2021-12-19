package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class RecCoverTitleBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecCoverTitleBean> CREATOR = new a();
    @c(a = "content")
    private String content;
    @c(a = "id")
    private long id;

    static {
        Covode.recordClassIndex(55469);
    }

    public RecCoverTitleBean() {
        this(0, null, 3, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public static class a implements Parcelable.Creator<RecCoverTitleBean> {
        static {
            Covode.recordClassIndex(55470);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecCoverTitleBean[] newArray(int i2) {
            return new RecCoverTitleBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecCoverTitleBean createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new RecCoverTitleBean(parcel.readLong(), parcel.readString());
        }
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setContent(String str) {
        l.d(str, "");
        this.content = str;
    }

    public RecCoverTitleBean(long j2, String str) {
        l.d(str, "");
        this.id = j2;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecCoverTitleBean(long j2, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? "" : str);
    }
}
