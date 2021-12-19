package com.ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class VideoCutInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoCutInfo> CREATOR = new a();
    private long end;
    private int rotate;
    private float speed;
    private long start;

    static {
        Covode.recordClassIndex(83792);
    }

    public static /* synthetic */ VideoCutInfo copy$default(VideoCutInfo videoCutInfo, long j2, long j3, float f2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = videoCutInfo.start;
        }
        if ((i3 & 2) != 0) {
            j3 = videoCutInfo.end;
        }
        if ((i3 & 4) != 0) {
            f2 = videoCutInfo.speed;
        }
        if ((i3 & 8) != 0) {
            i2 = videoCutInfo.rotate;
        }
        return videoCutInfo.copy(j2, j3, f2, i2);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final float component3() {
        return this.speed;
    }

    public final int component4() {
        return this.rotate;
    }

    public final VideoCutInfo copy(long j2, long j3, float f2, int i2) {
        return new VideoCutInfo(j2, j3, f2, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCutInfo)) {
            return false;
        }
        VideoCutInfo videoCutInfo = (VideoCutInfo) obj;
        return this.start == videoCutInfo.start && this.end == videoCutInfo.end && Float.compare(this.speed, videoCutInfo.speed) == 0 && this.rotate == videoCutInfo.rotate;
    }

    public final int hashCode() {
        long j2 = this.start;
        long j3 = this.end;
        return (((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.rotate;
    }

    public final String toString() {
        return "VideoCutInfo(start=" + this.start + ", end=" + this.end + ", speed=" + this.speed + ", rotate=" + this.rotate + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    public static class a implements Parcelable.Creator<VideoCutInfo> {
        static {
            Covode.recordClassIndex(83793);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoCutInfo[] newArray(int i2) {
            return new VideoCutInfo[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoCutInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new VideoCutInfo(parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readInt());
        }
    }

    public final void setEnd(long j2) {
        this.end = j2;
    }

    public final void setRotate(int i2) {
        this.rotate = i2;
    }

    public final void setSpeed(float f2) {
        this.speed = f2;
    }

    public final void setStart(long j2) {
        this.start = j2;
    }

    public VideoCutInfo(long j2, long j3, float f2, int i2) {
        this.start = j2;
        this.end = j3;
        this.speed = f2;
        this.rotate = i2;
    }
}
