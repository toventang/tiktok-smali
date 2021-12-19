package com.ss.android.ugc.aweme.shortvideo.edit.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    private AudioRecorderParam audioRecordParam;
    private MultiEditVideoRecordData editRecordData;
    private long recordEndTime;
    private long recordStartTime;
    private float voiceVolume;

    static {
        Covode.recordClassIndex(83340);
    }

    public final AudioRecorderParam getAudioRecordParam() {
        return this.audioRecordParam;
    }

    public final MultiEditVideoRecordData getEditRecordData() {
        return this.editRecordData;
    }

    public final long getRecordEndTime() {
        return this.recordEndTime;
    }

    public final long getRecordStartTime() {
        return this.recordStartTime;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public final void setAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.audioRecordParam = audioRecorderParam;
    }

    public final void setEditRecordData(MultiEditVideoRecordData multiEditVideoRecordData) {
        this.editRecordData = multiEditVideoRecordData;
    }

    public final void setRecordEndTime(long j2) {
        this.recordEndTime = j2;
    }

    public final void setRecordStartTime(long j2) {
        this.recordStartTime = j2;
    }

    public final void setVoiceVolume(float f2) {
        this.voiceVolume = f2;
    }

    public final boolean hasChanged(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (hasOriginalAudioChange(videoPublishEditModel) || hasAudioRecorderChange(videoPublishEditModel) || hasVoiceVolumeChange(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public final boolean hasVoiceVolumeChange(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (this.voiceVolume != videoPublishEditModel.voiceVolume) {
            return true;
        }
        return false;
    }

    public final boolean hasAudioRecorderChange(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (this.audioRecordParam == null && videoPublishEditModel.veAudioRecorderParam == null) {
            return false;
        }
        AudioRecorderParam audioRecorderParam = this.audioRecordParam;
        if (audioRecorderParam != null) {
            return audioRecorderParam.hasChange(videoPublishEditModel.veAudioRecorderParam);
        }
        AudioRecorderParam audioRecorderParam2 = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam2 == null) {
            l.b();
        }
        return audioRecorderParam2.hasChange(this.audioRecordParam);
    }

    public final void getData(VideoPublishEditModel videoPublishEditModel) {
        long j2;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        l.d(videoPublishEditModel, "");
        MultiEditVideoRecordData multiEditVideoRecordData4 = null;
        if (videoPublishEditModel.veAudioRecorderParam == null) {
            this.audioRecordParam = null;
        } else {
            if (this.audioRecordParam == null) {
                this.audioRecordParam = new AudioRecorderParam();
            }
            AudioRecorderParam audioRecorderParam = this.audioRecordParam;
            if (audioRecorderParam == null) {
                l.b();
            }
            audioRecorderParam.copyFrom(videoPublishEditModel.veAudioRecorderParam);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (!(multiEditVideoStatusRecordData == null || (multiEditVideoRecordData3 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null)) {
            multiEditVideoRecordData4 = multiEditVideoRecordData3.cloneSegmentDataList();
        }
        this.editRecordData = multiEditVideoRecordData4;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        long j3 = 0;
        if (multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null) {
            j2 = 0;
        } else {
            j2 = multiEditVideoRecordData2.startTime;
        }
        this.recordStartTime = j2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = videoPublishEditModel.multiEditVideoRecordData;
        if (!(multiEditVideoStatusRecordData3 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData3.curMultiEditVideoRecordData) == null)) {
            j3 = multiEditVideoRecordData.endTime;
        }
        this.recordEndTime = j3;
        this.voiceVolume = videoPublishEditModel.voiceVolume;
    }

    public final boolean hasOriginalAudioChange(VideoPublishEditModel videoPublishEditModel) {
        long j2;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        l.d(videoPublishEditModel, "");
        MultiEditVideoRecordData multiEditVideoRecordData3 = null;
        if (this.editRecordData == null && ((multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) == null || multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null)) {
            return false;
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.editRecordData;
        if (multiEditVideoRecordData4 == null) {
            return true;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData2 != null) {
            multiEditVideoRecordData3 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData;
        }
        if (multiEditVideoRecordData4.isEqual(multiEditVideoRecordData3)) {
            long j3 = this.recordStartTime;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = videoPublishEditModel.multiEditVideoRecordData;
            long j4 = 0;
            if (multiEditVideoStatusRecordData3 == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData3.curMultiEditVideoRecordData) == null) {
                j2 = 0;
            } else {
                j2 = multiEditVideoRecordData2.startTime;
            }
            if (j3 == j2) {
                long j5 = this.recordEndTime;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData4 = videoPublishEditModel.multiEditVideoRecordData;
                if (!(multiEditVideoStatusRecordData4 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData4.curMultiEditVideoRecordData) == null)) {
                    j4 = multiEditVideoRecordData.endTime;
                }
                if (j5 != j4) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
