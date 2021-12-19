package com.google.android.play.core.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class bt {
    static {
        Covode.recordClassIndex(32828);
        bt.class.getClassLoader();
    }

    private bt() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
