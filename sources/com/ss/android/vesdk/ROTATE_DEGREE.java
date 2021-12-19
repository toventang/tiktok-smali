package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public enum ROTATE_DEGREE implements Parcelable {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;
    
    public static final Parcelable.Creator<ROTATE_DEGREE> CREATOR = new Parcelable.Creator<ROTATE_DEGREE>() {
        /* class com.ss.android.vesdk.ROTATE_DEGREE.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99084);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ROTATE_DEGREE[] newArray(int i2) {
            return new ROTATE_DEGREE[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ROTATE_DEGREE createFromParcel(Parcel parcel) {
            return ROTATE_DEGREE.values()[parcel.readInt()];
        }
    };

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99083);
    }

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i2 = 0; i2 < length; i2++) {
            if (rotate_degreeArr[i2] == null) {
                iArr[i2] = 0;
            } else {
                iArr[i2] = rotate_degreeArr[i2].ordinal();
            }
        }
        return iArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(ordinal());
    }
}
