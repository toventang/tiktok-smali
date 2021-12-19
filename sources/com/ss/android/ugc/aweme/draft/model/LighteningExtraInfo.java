package com.ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class LighteningExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<LighteningExtraInfo> CREATOR = new a();
    @c(a = "scheduleId")
    private final String scheduleId;

    static {
        Covode.recordClassIndex(51865);
    }

    public LighteningExtraInfo() {
        this(null, 1, null);
    }

    public static /* synthetic */ LighteningExtraInfo copy$default(LighteningExtraInfo lighteningExtraInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lighteningExtraInfo.scheduleId;
        }
        return lighteningExtraInfo.copy(str);
    }

    public final String component1() {
        return this.scheduleId;
    }

    public final LighteningExtraInfo copy(String str) {
        l.d(str, "");
        return new LighteningExtraInfo(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LighteningExtraInfo) && l.a(this.scheduleId, ((LighteningExtraInfo) obj).scheduleId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.scheduleId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LighteningExtraInfo(scheduleId=" + this.scheduleId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.scheduleId);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public static class a implements Parcelable.Creator<LighteningExtraInfo> {
        static {
            Covode.recordClassIndex(51866);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LighteningExtraInfo[] newArray(int i2) {
            return new LighteningExtraInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LighteningExtraInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new LighteningExtraInfo(parcel.readString());
        }
    }

    public LighteningExtraInfo(String str) {
        l.d(str, "");
        this.scheduleId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LighteningExtraInfo(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str);
    }
}
