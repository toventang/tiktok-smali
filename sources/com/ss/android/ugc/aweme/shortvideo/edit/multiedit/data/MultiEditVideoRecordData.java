package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoRecordData>() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83877);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoRecordData[] newArray(int i2) {
            return new MultiEditVideoRecordData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoRecordData(parcel);
        }
    };
    @c(a = "concat_audio")
    public String concatAudio;
    @c(a = "concat_video")
    public String concatVideo;
    @c(a = "cover_path")
    public String coverPath;
    public String curRecordingDir;
    @c(a = "end_time")
    public long endTime;
    @c(a = "from_cut")
    public boolean fromCut;
    @c(a = "has_retake")
    public boolean hasRetake;
    @c(a = "is_single_video")
    public boolean isSingleVideo;
    @c(a = "is_sound_loop")
    public boolean isSoundLoop;
    @c(a = "left_slide_x")
    public float leftSlideX;
    @c(a = "music_duration")
    public int musicDuration;
    @c(a = "music_index")
    public int musicIndex = -1;
    @c(a = "music_path")
    public String musicPath;
    @c(a = "music_trimin")
    public int musicTrimIn;
    @c(a = "music_volume")
    public float musicVolume = 0.5f;
    @c(a = "origin_volume")
    public float originVolume = 0.5f;
    @c(a = "video_duration")
    public int preVideoDuration;
    @c(a = "right_slide_x")
    public float rightSlideX;
    @c(a = "segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;
    @c(a = "start_time")
    public long startTime;
    @c(a = "use_music")
    public boolean useMusic;

    public int describeContents() {
        return 0;
    }

    private int a() {
        return (int) (this.endTime - this.startTime);
    }

    static {
        Covode.recordClassIndex(83876);
    }

    public MultiEditVideoRecordData() {
    }

    public MultiEditVideoRecordData cloneSegmentDataList() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        return multiEditVideoRecordData;
    }

    public boolean isPlaySingleSegmentMusic() {
        if (this.musicDuration + 1000 >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue()) {
            return true;
        }
        return false;
    }

    public void resetTimeData() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (!(list == null || list.isEmpty())) {
            this.startTime = 0;
            this.endTime = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                multiEditVideoSegmentRecordData.resetTime();
                this.endTime += multiEditVideoSegmentRecordData.videoLength / 1000;
            }
        }
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        multiEditVideoRecordData.isSoundLoop = this.isSoundLoop;
        multiEditVideoRecordData.fromCut = this.fromCut;
        return multiEditVideoRecordData;
    }

    public List<MediaModel> convertMediaModelList() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            arrayList.add(multiEditVideoSegmentRecordData.convertModel());
        }
        if (this.isSingleVideo) {
            MediaModel mediaModel = (MediaModel) arrayList.get(0);
            mediaModel.q = (int) this.startTime;
            mediaModel.r = (int) this.endTime;
            mediaModel.f109396h = this.endTime - this.startTime;
        }
        return arrayList;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i2;
        int i3 = (int) this.startTime;
        if (a() > 0) {
            i2 = a();
        } else {
            List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
            if (list == null || list.isEmpty()) {
                i2 = 0;
            } else {
                long j2 = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                    j2 += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                }
                i2 = (int) j2;
            }
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i3 + i2));
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.startTime = multiEditVideoRecordData.startTime;
            this.endTime = multiEditVideoRecordData.endTime;
            this.leftSlideX = multiEditVideoRecordData.leftSlideX;
            this.rightSlideX = multiEditVideoRecordData.rightSlideX;
            this.useMusic = multiEditVideoRecordData.useMusic;
            this.concatVideo = multiEditVideoRecordData.concatVideo;
            this.concatAudio = multiEditVideoRecordData.concatAudio;
            this.musicIndex = multiEditVideoRecordData.musicIndex;
            this.musicVolume = multiEditVideoRecordData.musicVolume;
            this.originVolume = multiEditVideoRecordData.originVolume;
            this.musicPath = multiEditVideoRecordData.musicPath;
            this.hasRetake = multiEditVideoRecordData.hasRetake;
            this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
            this.musicDuration = multiEditVideoRecordData.musicDuration;
            this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
            this.coverPath = multiEditVideoRecordData.coverPath;
            this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
            this.isSoundLoop = multiEditVideoRecordData.isSoundLoop;
            this.fromCut = multiEditVideoRecordData.fromCut;
        }
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.segmentDataList.size(); i2++) {
            if (!this.segmentDataList.get(i2).isEqual(multiEditVideoRecordData.segmentDataList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualWithDeleteStatus(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.segmentDataList.size(); i2++) {
            if (!this.segmentDataList.get(i2).isEqual(multiEditVideoRecordData.segmentDataList.get(i2)) || this.segmentDataList.get(i2).enable != multiEditVideoRecordData.segmentDataList.get(i2).enable) {
                return false;
            }
        }
        return true;
    }

    protected MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.segmentDataList = parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR);
        boolean z5 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSingleVideo = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSoundLoop = z4;
        this.fromCut = parcel.readByte() == 1 ? true : z5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : 0);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : 0);
        parcel.writeByte(this.fromCut ? (byte) 1 : 0);
    }
}
