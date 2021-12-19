package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class MusicSyncData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicSyncData> CREATOR = new a();
    @c(a = "music_sync_video_duration")
    private final long videoDuration;
    @c(a = "music_sync_end")
    private final long videoEnd;
    @c(a = "music_sync_start")
    private final long videoStart;

    static {
        Covode.recordClassIndex(83882);
    }

    public MusicSyncData() {
        this(0, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MusicSyncData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ MusicSyncData copy$default(MusicSyncData musicSyncData, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = musicSyncData.videoStart;
        }
        if ((i2 & 2) != 0) {
            j3 = musicSyncData.videoEnd;
        }
        if ((i2 & 4) != 0) {
            j4 = musicSyncData.videoDuration;
        }
        return musicSyncData.copy(j2, j3, j4);
    }

    public final long component1() {
        return this.videoStart;
    }

    public final long component2() {
        return this.videoEnd;
    }

    public final long component3() {
        return this.videoDuration;
    }

    public final MusicSyncData copy(long j2, long j3, long j4) {
        return new MusicSyncData(j2, j3, j4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSyncData)) {
            return false;
        }
        MusicSyncData musicSyncData = (MusicSyncData) obj;
        return this.videoStart == musicSyncData.videoStart && this.videoEnd == musicSyncData.videoEnd && this.videoDuration == musicSyncData.videoDuration;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MusicSyncData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.videoStart) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MusicSyncData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.videoEnd)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MusicSyncData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.videoDuration);
    }

    public final String toString() {
        return "MusicSyncData(videoStart=" + this.videoStart + ", videoEnd=" + this.videoEnd + ", videoDuration=" + this.videoDuration + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.videoStart);
        parcel.writeLong(this.videoEnd);
        parcel.writeLong(this.videoDuration);
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoEnd() {
        return this.videoEnd;
    }

    public final long getVideoStart() {
        return this.videoStart;
    }

    public static class a implements Parcelable.Creator<MusicSyncData> {
        static {
            Covode.recordClassIndex(83883);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MusicSyncData[] newArray(int i2) {
            return new MusicSyncData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MusicSyncData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new MusicSyncData(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }
    }

    public MusicSyncData(long j2, long j3, long j4) {
        this.videoStart = j2;
        this.videoEnd = j3;
        this.videoDuration = j4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicSyncData(long j2, long j3, long j4, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? 0 : j3, (i2 & 4) != 0 ? 0 : j4);
    }
}
