package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoStatusRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoStatusRecordData>() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83881);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoStatusRecordData[] newArray(int i2) {
            return new MultiEditVideoStatusRecordData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoStatusRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoStatusRecordData(parcel);
        }
    };
    @c(a = "edit_adjust_clips_state")
    public EditAdjustClipsState adjustClipsState;
    @c(a = "cover_img_path")
    public String coverImagePath;
    @c(a = "cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;
    @c(a = "cur_select_index")
    public int currentEditIndex = -1;
    @c(a = "edit_cut_segments")
    public ArrayList<TimeSpeedModelExtension> editCutSegments;
    @c(a = "edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;
    @c(a = "is_multi_edit_retake")
    public boolean isMultiEditRetake;
    @c(a = "is_support_multi_edit")
    public boolean isSupportMultiEdit;
    @c(a = "is_use_multi_edit")
    public boolean isUseMultiEdit;
    @c(a = "origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;
    @c(a = "original_music_start")
    public int originalMusicStart;
    @c(a = "original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;
    @c(a = "record_music")
    public com.ss.android.ugc.aweme.shortvideo.c recordMusic;
    @c(a = "restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;
    @c(a = "restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;
    @c(a = "segment_size_change")
    public boolean segmentSizeChange;
    @c(a = "single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;
    @c(a = "single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;
    @c(a = "video_meta_data")
    public String videoMetaData;

    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
    }

    static {
        Covode.recordClassIndex(83880);
    }

    protected MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        this.originalSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.restoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.singleRestoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editCutSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.recordMusic = (com.ss.android.ugc.aweme.shortvideo.c) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        this.isSupportMultiEdit = parcel.readByte() == 1 ? true : z4;
        this.adjustClipsState = (EditAdjustClipsState) parcel.readParcelable(EditAdjustClipsState.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i2);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i2);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i2);
        parcel.writeParcelable(this.originMultiEditRecordData, i2);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeTypedList(this.editCutSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : 0);
        parcel.writeParcelable(this.adjustClipsState, i2);
    }
}
