package com.ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class VideoFileInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoFileInfo> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    private final int bitrate;
    private final int codecType;
    private final long duration;
    private final int fps;
    private final int gop;
    private final int height;
    private final int keyFrameCount;
    private final int width;

    static {
        Covode.recordClassIndex(83794);
    }

    public VideoFileInfo(int i2, int i3, long j2) {
        this(i2, i3, j2, 0, 0, 0, 0, 0, 248, null);
    }

    public VideoFileInfo(int i2, int i3, long j2, int i4) {
        this(i2, i3, j2, i4, 0, 0, 0, 0, 240, null);
    }

    public VideoFileInfo(int i2, int i3, long j2, int i4, int i5) {
        this(i2, i3, j2, i4, i5, 0, 0, 0, 224, null);
    }

    public VideoFileInfo(int i2, int i3, long j2, int i4, int i5, int i6) {
        this(i2, i3, j2, i4, i5, i6, 0, 0, 192, null);
    }

    public VideoFileInfo(int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        this(i2, i3, j2, i4, i5, i6, i7, 0, 128, null);
    }

    public static /* synthetic */ VideoFileInfo copy$default(VideoFileInfo videoFileInfo, int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i2 = videoFileInfo.width;
        }
        if ((i9 & 2) != 0) {
            i3 = videoFileInfo.height;
        }
        if ((i9 & 4) != 0) {
            j2 = videoFileInfo.duration;
        }
        if ((i9 & 8) != 0) {
            i4 = videoFileInfo.fps;
        }
        if ((i9 & 16) != 0) {
            i5 = videoFileInfo.bitrate;
        }
        if ((i9 & 32) != 0) {
            i6 = videoFileInfo.codecType;
        }
        if ((i9 & 64) != 0) {
            i7 = videoFileInfo.keyFrameCount;
        }
        if ((i9 & 128) != 0) {
            i8 = videoFileInfo.gop;
        }
        return videoFileInfo.copy(i2, i3, j2, i4, i5, i6, i7, i8);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final long component3() {
        return this.duration;
    }

    public final int component4() {
        return this.fps;
    }

    public final int component5() {
        return this.bitrate;
    }

    public final int component6() {
        return this.codecType;
    }

    public final int component7() {
        return this.keyFrameCount;
    }

    public final int component8() {
        return this.gop;
    }

    public final VideoFileInfo copy(int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8) {
        return new VideoFileInfo(i2, i3, j2, i4, i5, i6, i7, i8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFileInfo)) {
            return false;
        }
        VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
        return this.width == videoFileInfo.width && this.height == videoFileInfo.height && this.duration == videoFileInfo.duration && this.fps == videoFileInfo.fps && this.bitrate == videoFileInfo.bitrate && this.codecType == videoFileInfo.codecType && this.keyFrameCount == videoFileInfo.keyFrameCount && this.gop == videoFileInfo.gop;
    }

    public final int hashCode() {
        long j2 = this.duration;
        return (((((((((((((this.width * 31) + this.height) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.fps) * 31) + this.bitrate) * 31) + this.codecType) * 31) + this.keyFrameCount) * 31) + this.gop;
    }

    public final String toString() {
        return "VideoFileInfo(width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", fps=" + this.fps + ", bitrate=" + this.bitrate + ", codecType=" + this.codecType + ", keyFrameCount=" + this.keyFrameCount + ", gop=" + this.gop + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.codecType);
        parcel.writeInt(this.keyFrameCount);
        parcel.writeInt(this.gop);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83795);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getCodecType() {
        return this.codecType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getKeyFrameCount() {
        return this.keyFrameCount;
    }

    public final int getWidth() {
        return this.width;
    }

    public static class b implements Parcelable.Creator<VideoFileInfo> {
        static {
            Covode.recordClassIndex(83796);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoFileInfo[] newArray(int i2) {
            return new VideoFileInfo[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoFileInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new VideoFileInfo(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public final String getResolution() {
        return new StringBuilder().append(this.width).append('*').append(this.height).toString();
    }

    public VideoFileInfo(int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8) {
        this.width = i2;
        this.height = i3;
        this.duration = j2;
        this.fps = i4;
        this.bitrate = i5;
        this.codecType = i6;
        this.keyFrameCount = i7;
        this.gop = i8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoFileInfo(int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, g gVar) {
        this(i2, i3, j2, (i9 & 8) != 0 ? -100 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? -1 : i6, (i9 & 64) != 0 ? -1 : i7, (i9 & 128) != 0 ? -1 : i8);
    }
}
