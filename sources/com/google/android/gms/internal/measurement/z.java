package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class z {

    /* renamed from: a  reason: collision with root package name */
    static final ClassLoader f51297a = z.class.getClassLoader();

    private z() {
    }

    static {
        Covode.recordClassIndex(32074);
    }

    public static boolean a(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
