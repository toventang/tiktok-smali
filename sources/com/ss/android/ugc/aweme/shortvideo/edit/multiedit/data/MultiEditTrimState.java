package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class MultiEditTrimState implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditTrimState> CREATOR = new a();
    @c(a = "enable", b = {"a"})
    private final boolean enable;
    @c(a = "endTime", b = {"c"})
    private final long endTime;
    @c(a = "startTime", b = {"b"})
    private final long startTime;

    static {
        Covode.recordClassIndex(83874);
    }

    public MultiEditTrimState() {
        this(false, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MultiEditTrimState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ MultiEditTrimState copy$default(MultiEditTrimState multiEditTrimState, boolean z, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = multiEditTrimState.enable;
        }
        if ((i2 & 2) != 0) {
            j2 = multiEditTrimState.startTime;
        }
        if ((i2 & 4) != 0) {
            j3 = multiEditTrimState.endTime;
        }
        return multiEditTrimState.copy(z, j2, j3);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final MultiEditTrimState copy(boolean z, long j2, long j3) {
        return new MultiEditTrimState(z, j2, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiEditTrimState)) {
            return false;
        }
        MultiEditTrimState multiEditTrimState = (MultiEditTrimState) obj;
        return this.enable == multiEditTrimState.enable && this.startTime == multiEditTrimState.startTime && this.endTime == multiEditTrimState.endTime;
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (((i2 * 31) + com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MultiEditTrimState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MultiEditTrimState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime);
    }

    public final String toString() {
        return "MultiEditTrimState(enable=" + this.enable + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public static class a implements Parcelable.Creator<MultiEditTrimState> {
        static {
            Covode.recordClassIndex(83875);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditTrimState[] newArray(int i2) {
            return new MultiEditTrimState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditTrimState createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new MultiEditTrimState(parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
        }
    }

    public MultiEditTrimState(boolean z, long j2, long j3) {
        this.enable = z;
        this.startTime = j2;
        this.endTime = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiEditTrimState(boolean z, long j2, long j3, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? -1 : j3);
    }
}
