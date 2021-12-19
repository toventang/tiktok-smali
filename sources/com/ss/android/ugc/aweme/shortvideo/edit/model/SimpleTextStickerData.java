package com.ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class SimpleTextStickerData implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SimpleTextStickerData> CREATOR = new a();
    @c(a = "old_text")
    private String audioText;
    @c(a = "audio_track_duration")
    private int audioTrackDuration;
    @c(a = "audio_track_file_path")
    private String audioTrackFilePath;
    @c(a = "audio_track_index")
    private int audioTrackIndex;
    @c(a = "has_read_text_audio")
    private boolean hasReadTextAudio;
    @c(a = "speaker_id")
    private String speakerID;

    static {
        Covode.recordClassIndex(83790);
    }

    public SimpleTextStickerData() {
        this(false, null, 0, null, 0, null, 63, null);
    }

    public SimpleTextStickerData(boolean z) {
        this(z, null, 0, null, 0, null, 62, null);
    }

    public SimpleTextStickerData(boolean z, String str) {
        this(z, str, 0, null, 0, null, 60, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i2) {
        this(z, str, i2, null, 0, null, 56, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i2, String str2) {
        this(z, str, i2, str2, 0, null, 48, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i2, String str2, int i3) {
        this(z, str, i2, str2, i3, null, 32, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeString(this.speakerID);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public static class a implements Parcelable.Creator<SimpleTextStickerData> {
        static {
            Covode.recordClassIndex(83791);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SimpleTextStickerData[] newArray(int i2) {
            return new SimpleTextStickerData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SimpleTextStickerData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SimpleTextStickerData(parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i2) {
        this.audioTrackDuration = i2;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i2) {
        this.audioTrackIndex = i2;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public SimpleTextStickerData(boolean z, String str, int i2, String str2, int i3, String str3) {
        this.hasReadTextAudio = z;
        this.speakerID = str;
        this.audioTrackIndex = i2;
        this.audioTrackFilePath = str2;
        this.audioTrackDuration = i3;
        this.audioText = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleTextStickerData(boolean z, String str, int i2, String str2, int i3, String str3, int i4, g gVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? null : str2, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) == 0 ? str3 : null);
    }
}
