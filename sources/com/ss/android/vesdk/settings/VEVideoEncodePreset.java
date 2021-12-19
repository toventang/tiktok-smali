package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public enum VEVideoEncodePreset implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;
    
    public static final Parcelable.Creator<VEVideoEncodePreset> CREATOR = new Parcelable.Creator<VEVideoEncodePreset>() {
        /* class com.ss.android.vesdk.settings.VEVideoEncodePreset.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99591);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoEncodePreset[] newArray(int i2) {
            return new VEVideoEncodePreset[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoEncodePreset createFromParcel(Parcel parcel) {
            return VEVideoEncodePreset.values()[parcel.readInt()];
        }
    };

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99590);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(ordinal());
    }
}
