package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class FlowDataMusicInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FlowDataMusicInfo> CREATOR = new Creator();
    @c(a = "is_selected_by_auto")
    private boolean isSelectedByAuto;

    public static class Creator implements Parcelable.Creator<FlowDataMusicInfo> {
        static {
            Covode.recordClassIndex(84441);
        }

        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new FlowDataMusicInfo(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo[] newArray(int i2) {
            return new FlowDataMusicInfo[i2];
        }
    }

    static {
        Covode.recordClassIndex(84440);
    }

    public FlowDataMusicInfo() {
        this(false, 1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.isSelectedByAuto ? 1 : 0);
    }

    public final boolean isSelectedByAuto() {
        return this.isSelectedByAuto;
    }

    public final void setSelectedByAuto(boolean z) {
        this.isSelectedByAuto = z;
    }

    public FlowDataMusicInfo(boolean z) {
        this.isSelectedByAuto = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowDataMusicInfo(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
