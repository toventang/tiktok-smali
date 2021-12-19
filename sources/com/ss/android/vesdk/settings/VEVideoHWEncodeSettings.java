package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoHWEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoHWEncodeSettings>() {
        /* class com.ss.android.vesdk.settings.VEVideoHWEncodeSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99595);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoHWEncodeSettings[] newArray(int i2) {
            return new VEVideoHWEncodeSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoHWEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoHWEncodeSettings(parcel);
        }
    };
    public double m2K_bitrate_ratio = 1.0d;
    public double m4K_bitrate_ratio = 1.0d;
    public long mBitrate = 6000000;
    public int mCodecType = 0;
    public double mFullHd_bitrate_ratio = 1.0d;
    public int mGop = 35;
    public double mH_fps_bitrate_ratio = 1.0d;
    public double mHp_bitrate_ratio = 0.75d;
    public int mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
    public double mSd_bitrate_ratio = 1.0d;
    public double transition_bitrate_ratio = 1.0d;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99594);
    }

    public VEVideoHWEncodeSettings() {
    }

    public String toString() {
        return "VEVideoHWEncodeSettings{mBitrate=" + this.mBitrate + ", mProfile=" + this.mProfile + ", mHp_bitrate_ratio=" + this.mHp_bitrate_ratio + ", mFullHd_bitrate_ratio=" + this.mFullHd_bitrate_ratio + ", mSd_bitrate_ratio=" + this.mSd_bitrate_ratio + ", mH_fps_bitrate_ratio=" + this.mH_fps_bitrate_ratio + ", transition_bitrate_ratio=" + this.transition_bitrate_ratio + ", m2KbitrateRatio=" + this.m2K_bitrate_ratio + ", m4KbiterateRatio=" + this.m4K_bitrate_ratio + ", mGop=" + this.mGop + ", mCodecType=" + this.mCodecType + '}';
    }

    protected VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mHp_bitrate_ratio = parcel.readDouble();
        this.mFullHd_bitrate_ratio = parcel.readDouble();
        this.mSd_bitrate_ratio = parcel.readDouble();
        this.mH_fps_bitrate_ratio = parcel.readDouble();
        this.mGop = parcel.readInt();
        this.transition_bitrate_ratio = parcel.readDouble();
        this.m2K_bitrate_ratio = parcel.readDouble();
        this.m4K_bitrate_ratio = parcel.readDouble();
        this.mCodecType = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeDouble(this.mHp_bitrate_ratio);
        parcel.writeDouble(this.mFullHd_bitrate_ratio);
        parcel.writeDouble(this.mSd_bitrate_ratio);
        parcel.writeDouble(this.mH_fps_bitrate_ratio);
        parcel.writeInt(this.mGop);
        parcel.writeDouble(this.transition_bitrate_ratio);
        parcel.writeDouble(this.m2K_bitrate_ratio);
        parcel.writeDouble(this.m4K_bitrate_ratio);
        parcel.writeInt(this.mCodecType);
    }
}
