package com.ss.android.ugc.aweme.shortvideo.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class UploadSpeedInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadSpeedInfo> CREATOR = new a();
    private final long endTime;
    private String probeContext;
    private final long speed;
    private final long startTime;
    private int usedCompilerSettingGroup;

    static {
        Covode.recordClassIndex(86467);
    }

    public UploadSpeedInfo() {
        this(0, null, 0, 0, 0, 31, null);
    }

    public UploadSpeedInfo(long j2) {
        this(j2, null, 0, 0, 0, 30, null);
    }

    public UploadSpeedInfo(long j2, String str) {
        this(j2, str, 0, 0, 0, 28, null);
    }

    public UploadSpeedInfo(long j2, String str, long j3) {
        this(j2, str, j3, 0, 0, 24, null);
    }

    public UploadSpeedInfo(long j2, String str, long j3, long j4) {
        this(j2, str, j3, j4, 0, 16, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ UploadSpeedInfo copy$default(UploadSpeedInfo uploadSpeedInfo, long j2, String str, long j3, long j4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = uploadSpeedInfo.speed;
        }
        if ((i3 & 2) != 0) {
            str = uploadSpeedInfo.probeContext;
        }
        if ((i3 & 4) != 0) {
            j3 = uploadSpeedInfo.startTime;
        }
        if ((i3 & 8) != 0) {
            j4 = uploadSpeedInfo.endTime;
        }
        if ((i3 & 16) != 0) {
            i2 = uploadSpeedInfo.usedCompilerSettingGroup;
        }
        return uploadSpeedInfo.copy(j2, str, j3, j4, i2);
    }

    public final long component1() {
        return this.speed;
    }

    public final String component2() {
        return this.probeContext;
    }

    public final long component3() {
        return this.startTime;
    }

    public final long component4() {
        return this.endTime;
    }

    public final int component5() {
        return this.usedCompilerSettingGroup;
    }

    public final UploadSpeedInfo copy(long j2, String str, long j3, long j4, int i2) {
        l.d(str, "");
        return new UploadSpeedInfo(j2, str, j3, j4, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadSpeedInfo)) {
            return false;
        }
        UploadSpeedInfo uploadSpeedInfo = (UploadSpeedInfo) obj;
        return this.speed == uploadSpeedInfo.speed && l.a(this.probeContext, uploadSpeedInfo.probeContext) && this.startTime == uploadSpeedInfo.startTime && this.endTime == uploadSpeedInfo.endTime && this.usedCompilerSettingGroup == uploadSpeedInfo.usedCompilerSettingGroup;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.speed) * 31;
        String str = this.probeContext;
        return ((((((com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_upload_UploadSpeedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.usedCompilerSettingGroup);
    }

    public final String toString() {
        return "UploadSpeedInfo(speed=" + this.speed + ", probeContext=" + this.probeContext + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", usedCompilerSettingGroup=" + this.usedCompilerSettingGroup + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.speed);
        parcel.writeString(this.probeContext);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.usedCompilerSettingGroup);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getProbeContext() {
        return this.probeContext;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.usedCompilerSettingGroup;
    }

    public static class a implements Parcelable.Creator<UploadSpeedInfo> {
        static {
            Covode.recordClassIndex(86468);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UploadSpeedInfo[] newArray(int i2) {
            return new UploadSpeedInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UploadSpeedInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new UploadSpeedInfo(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    public final void setUsedCompilerSettingGroup(int i2) {
        this.usedCompilerSettingGroup = i2;
    }

    public final void setProbeContext(String str) {
        l.d(str, "");
        this.probeContext = str;
    }

    public UploadSpeedInfo(long j2, String str, long j3, long j4, int i2) {
        l.d(str, "");
        this.speed = j2;
        this.probeContext = str;
        this.startTime = j3;
        this.endTime = j4;
        this.usedCompilerSettingGroup = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadSpeedInfo(long j2, String str, long j3, long j4, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? -6 : j2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? -6 : j3, (i3 & 8) == 0 ? j4 : -6, (i3 & 16) != 0 ? -1 : i2);
    }
}
