package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;

public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoSegmentRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoSegmentRecordData>() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83879);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoSegmentRecordData[] newArray(int i2) {
            return new MultiEditVideoSegmentRecordData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoSegmentRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoSegmentRecordData(parcel);
        }
    };
    @c(a = "audio_length")
    public long audioLength;
    @c(a = "audio_path")
    public String audioPath;
    @c(a = "audio_speed")
    public float audioSpeed;
    @c(a = "draft_audio_path")
    public String draftAudioPath;
    @c(a = "draft_video_path")
    public String draftVideoPath;
    @c(a = "enable")
    public boolean enable;
    @c(a = "endTime")
    private long endTime;
    @c(a = "frameLeakProbability")
    public int frameLeakProbability;
    @c(a = "height")
    public int height;
    @c(a = "edit_trim_state")
    public MultiEditTrimState multiEditTrimState;
    @c(a = "music_sync_data")
    public MusicSyncData musicSyncData;
    @c(a = "rotate")
    public int rotate;
    @c(a = "scale")
    public float scale;
    @c(a = "startTime")
    private long startTime;
    @c(a = "video_key")
    public int videoKey;
    @c(a = "video_length")
    public long videoLength;
    @c(a = "video_path")
    public String videoPath;
    @c(a = "speed")
    private float videoSpeed;
    @c(a = "width")
    public int width;

    public int describeContents() {
        return 0;
    }

    public long getOriginEndTime() {
        return this.endTime;
    }

    public long getOriginStartTime() {
        return this.startTime;
    }

    public float getOriginVideoSpeed() {
        return this.videoSpeed;
    }

    static {
        Covode.recordClassIndex(83878);
    }

    public long getEndTime() {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            return musicSyncData2.getVideoEnd();
        }
        return this.endTime;
    }

    public long getStartTime() {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            return musicSyncData2.getVideoStart();
        }
        return this.startTime;
    }

    public float getVideoSpeed() {
        if (this.musicSyncData != null) {
            return 1.0f;
        }
        return this.videoSpeed;
    }

    public void resetTime() {
        this.startTime = 0;
        this.endTime = this.videoLength / 1000;
        this.frameLeakProbability = 0;
    }

    public MultiEditVideoSegmentRecordData() {
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1080;
        this.enable = true;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f109390b = this.videoPath;
        mediaModel.f109396h = this.videoLength / 1000;
        mediaModel.f109400l = this.width;
        mediaModel.f109401m = this.height;
        mediaModel.q = (int) this.startTime;
        mediaModel.r = (int) this.endTime;
        mediaModel.s = this.videoSpeed;
        return mediaModel;
    }

    public String toString() {
        return "MultiEditVideoSegmentRecordData{videoPath=" + this.videoPath + ", videoLength=" + this.videoLength + ", startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.videoSpeed = this.videoSpeed;
        multiEditVideoSegmentRecordData.audioSpeed = this.audioSpeed;
        multiEditVideoSegmentRecordData.startTime = this.startTime;
        multiEditVideoSegmentRecordData.endTime = this.endTime;
        multiEditVideoSegmentRecordData.rotate = this.rotate;
        multiEditVideoSegmentRecordData.frameLeakProbability = this.frameLeakProbability;
        multiEditVideoSegmentRecordData.videoKey = this.videoKey;
        multiEditVideoSegmentRecordData.enable = this.enable;
        multiEditVideoSegmentRecordData.width = this.width;
        multiEditVideoSegmentRecordData.height = this.height;
        multiEditVideoSegmentRecordData.scale = this.scale;
        multiEditVideoSegmentRecordData.musicSyncData = this.musicSyncData;
        multiEditVideoSegmentRecordData.multiEditTrimState = this.multiEditTrimState;
        return multiEditVideoSegmentRecordData;
    }

    public void setVideoSpeed(float f2) {
        if (this.musicSyncData == null) {
            this.videoSpeed = f2;
        }
    }

    public void setEndTime(long j2) {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            this.musicSyncData = musicSyncData2.copy(musicSyncData2.getVideoStart(), j2, this.musicSyncData.getVideoDuration());
        } else {
            this.endTime = j2;
        }
    }

    public void setStartTime(long j2) {
        MusicSyncData musicSyncData2 = this.musicSyncData;
        if (musicSyncData2 != null) {
            this.musicSyncData = musicSyncData2.copy(j2, musicSyncData2.getVideoEnd(), this.musicSyncData.getVideoDuration());
        } else {
            this.startTime = j2;
        }
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null) {
            this.videoPath = multiEditVideoSegmentRecordData.videoPath;
            this.audioPath = multiEditVideoSegmentRecordData.audioPath;
            this.videoLength = multiEditVideoSegmentRecordData.videoLength;
            this.audioLength = multiEditVideoSegmentRecordData.audioLength;
            this.startTime = multiEditVideoSegmentRecordData.startTime;
            this.endTime = multiEditVideoSegmentRecordData.endTime;
            this.videoSpeed = multiEditVideoSegmentRecordData.videoSpeed;
            this.audioSpeed = multiEditVideoSegmentRecordData.audioSpeed;
            this.rotate = multiEditVideoSegmentRecordData.rotate;
            this.frameLeakProbability = multiEditVideoSegmentRecordData.frameLeakProbability;
            this.videoKey = multiEditVideoSegmentRecordData.videoKey;
            this.enable = multiEditVideoSegmentRecordData.enable;
            this.width = multiEditVideoSegmentRecordData.width;
            this.height = multiEditVideoSegmentRecordData.height;
            this.scale = multiEditVideoSegmentRecordData.scale;
            this.musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
            this.multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
        }
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null && TextUtils.equals(this.videoPath, multiEditVideoSegmentRecordData.videoPath) && this.videoLength == multiEditVideoSegmentRecordData.videoLength && TextUtils.equals(this.audioPath, multiEditVideoSegmentRecordData.audioPath) && this.audioLength == multiEditVideoSegmentRecordData.audioLength && this.videoSpeed == multiEditVideoSegmentRecordData.videoSpeed && this.audioSpeed == multiEditVideoSegmentRecordData.audioSpeed && this.startTime == multiEditVideoSegmentRecordData.startTime && this.endTime == multiEditVideoSegmentRecordData.endTime && this.rotate == multiEditVideoSegmentRecordData.rotate && this.musicSyncData == multiEditVideoSegmentRecordData.musicSyncData) {
            return true;
        }
        return false;
    }

    protected MultiEditVideoSegmentRecordData(Parcel parcel) {
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1080;
        boolean z = true;
        this.enable = true;
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.videoSpeed = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.rotate = parcel.readInt();
        this.audioSpeed = parcel.readFloat();
        this.frameLeakProbability = parcel.readInt();
        this.videoKey = parcel.readInt();
        this.enable = parcel.readByte() == 0 ? false : z;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.scale = parcel.readFloat();
        this.musicSyncData = (MusicSyncData) parcel.readParcelable(MusicSyncData.class.getClassLoader());
        this.multiEditTrimState = (MultiEditTrimState) parcel.readParcelable(MultiEditTrimState.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.videoSpeed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.rotate);
        parcel.writeFloat(this.audioSpeed);
        parcel.writeInt(this.frameLeakProbability);
        parcel.writeInt(this.videoKey);
        parcel.writeByte(this.enable ? (byte) 1 : 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.scale);
        parcel.writeParcelable(this.musicSyncData, i2);
        parcel.writeParcelable(this.multiEditTrimState, i2);
    }
}
