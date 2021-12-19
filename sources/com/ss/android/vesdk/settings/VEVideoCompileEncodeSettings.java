package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEVideoCompileEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoCompileEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoCompileEncodeSettings>() {
        /* class com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99589);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoCompileEncodeSettings[] newArray(int i2) {
            return new VEVideoCompileEncodeSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoCompileEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoCompileEncodeSettings(parcel);
        }
    };
    public boolean enableHwBufferEncode;
    public boolean isSupportHWEncoder;
    public VEVideoHWEncodeSettings mHWEncodeSetting = new VEVideoHWEncodeSettings();
    public VEVideoSWEncodeSettings mSWEncodeSetting = new VEVideoSWEncodeSettings();
    public boolean useHWEncoder;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99588);
    }

    public VEVideoCompileEncodeSettings() {
    }

    public String toString() {
        return "VEVideoCompileEncodeSettings{useHWEncoder=" + this.useHWEncoder + ", isSupportHWEncoder=" + this.isSupportHWEncoder + ", mHWEncodeSetting=" + this.mHWEncodeSetting + ", mSWEncodeSetting=" + this.mSWEncodeSetting + '}';
    }

    protected VEVideoCompileEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useHWEncoder = z;
        this.isSupportHWEncoder = parcel.readByte() == 0 ? false : z2;
        this.mHWEncodeSetting = (VEVideoHWEncodeSettings) parcel.readParcelable(VEVideoHWEncodeSettings.class.getClassLoader());
        this.mSWEncodeSetting = (VEVideoSWEncodeSettings) parcel.readParcelable(VEVideoSWEncodeSettings.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.useHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeParcelable(this.mHWEncodeSetting, i2);
        parcel.writeParcelable(this.mSWEncodeSetting, i2);
    }
}
