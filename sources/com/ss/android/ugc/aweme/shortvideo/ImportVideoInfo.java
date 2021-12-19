package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "bit_rate", b = {"c"})
    private int bitRate;
    @c(a = "cutSpeed", b = {"k"})
    private float cutSpeed;
    @c(a = "description", b = {"h"})
    private String description;
    @c(a = "duration", b = {"g"})
    private long duration;
    @c(a = "encode_id", b = {"d"})
    private int encodeId;
    @c(a = "importPath", b = {"e"})
    private String importPath;
    @c(a = "import_file_duration", b = {"f"})
    private long importfileDuration;
    @c(a = "music_id", b = {"i"})
    private String musicId;
    @c(a = "origin_fps", b = {"j"})
    private int originFps;
    @c(a = "real_import_path", b = {"l"})
    private String realImportPath;
    @c(a = "video_height", b = {"b"})
    private int videoHeight;
    @c(a = "video_width", b = {"a"})
    private int videoWidth;

    static {
        Covode.recordClassIndex(81969);
    }

    public ImportVideoInfo() {
        this(0, 0, 0, 0, null, 0, 0, null, null, 0, 0.0f, null, 4095, null);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<ImportVideoInfo> {
        static {
            Covode.recordClassIndex(81970);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImportVideoInfo[] newArray(int i2) {
            return new ImportVideoInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImportVideoInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ImportVideoInfo(parcel);
        }
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final float getCutSpeed() {
        return this.cutSpeed;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getEncodeId() {
        return this.encodeId;
    }

    public final String getImportPath() {
        return this.importPath;
    }

    public final long getImportfileDuration() {
        return this.importfileDuration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOriginFps() {
        return this.originFps;
    }

    public final String getRealImportPath() {
        return this.realImportPath;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setBitRate(int i2) {
        this.bitRate = i2;
    }

    public final void setCutSpeed(float f2) {
        this.cutSpeed = f2;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setEncodeId(int i2) {
        this.encodeId = i2;
    }

    public final void setImportPath(String str) {
        this.importPath = str;
    }

    public final void setImportfileDuration(long j2) {
        this.importfileDuration = j2;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOriginFps(int i2) {
        this.originFps = i2;
    }

    public final void setRealImportPath(String str) {
        this.realImportPath = str;
    }

    public final void setVideoHeight(int i2) {
        this.videoHeight = i2;
    }

    public final void setVideoWidth(int i2) {
        this.videoWidth = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImportVideoInfo(Parcel parcel) {
        this(0, 0, 0, 0, null, 0, 0, null, null, 0, 0.0f, null, 4095, null);
        l.d(parcel, "");
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.bitRate = parcel.readInt();
        this.encodeId = parcel.readInt();
        this.importPath = parcel.readString();
        this.importfileDuration = parcel.readLong();
        this.duration = parcel.readLong();
        this.description = parcel.readString();
        this.musicId = parcel.readString();
        this.originFps = parcel.readInt();
        this.cutSpeed = parcel.readFloat();
        this.realImportPath = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.bitRate);
        parcel.writeInt(this.encodeId);
        parcel.writeString(this.importPath);
        parcel.writeLong(this.importfileDuration);
        parcel.writeLong(this.duration);
        parcel.writeString(this.description);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.originFps);
        parcel.writeFloat(this.cutSpeed);
        parcel.writeString(this.realImportPath);
    }

    public ImportVideoInfo(int i2, int i3, int i4, int i5, String str, long j2, long j3, String str2, String str3, int i6, float f2, String str4) {
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.bitRate = i4;
        this.encodeId = i5;
        this.importPath = str;
        this.importfileDuration = j2;
        this.duration = j3;
        this.description = str2;
        this.musicId = str3;
        this.originFps = i6;
        this.cutSpeed = f2;
        this.realImportPath = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImportVideoInfo(int i2, int i3, int i4, int i5, String str, long j2, long j3, String str2, String str3, int i6, float f2, String str4, int i7, g gVar) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? null : str, (i7 & 32) != 0 ? 0 : j2, (i7 & 64) == 0 ? j3 : 0, (i7 & 128) != 0 ? null : str2, (i7 & 256) != 0 ? null : str3, (i7 & 512) == 0 ? i6 : 0, (i7 & 1024) != 0 ? 1.0f : f2, (i7 & 2048) == 0 ? str4 : null);
    }
}
