package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public class VEVideoSWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoSWEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoSWEncodeSettings>() {
        /* class com.ss.android.vesdk.settings.VEVideoSWEncodeSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99597);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoSWEncodeSettings[] newArray(int i2) {
            return new VEVideoSWEncodeSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoSWEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoSWEncodeSettings(parcel);
        }
    };
    public int mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
    public int mBps = 4000000;
    public int mCrf = 15;
    public int mGop = 35;
    public long mMaxRate = 15000000;
    public int mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
    public int mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
    public double mQPOffset;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99596);
    }

    public VEVideoSWEncodeSettings() {
    }

    public String toString() {
        return "VEVideoSWEncodeSettings{mCrf=" + this.mCrf + ", mBps=" + this.mBps + ", mBitrateMode=" + this.mBitrateMode + ", mPreset=" + this.mPreset + ", mProfile=" + this.mProfile + ", mMaxRate=" + this.mMaxRate + ", mGop=" + this.mGop + '}';
    }

    protected VEVideoSWEncodeSettings(Parcel parcel) {
        this.mCrf = parcel.readInt();
        this.mQPOffset = parcel.readDouble();
        this.mPreset = parcel.readInt();
        this.mProfile = parcel.readInt();
        this.mMaxRate = parcel.readLong();
        this.mBps = parcel.readInt();
        this.mBitrateMode = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mCrf);
        parcel.writeDouble(this.mQPOffset);
        parcel.writeInt(this.mPreset);
        parcel.writeInt(this.mProfile);
        parcel.writeLong(this.mMaxRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mBitrateMode);
    }
}
