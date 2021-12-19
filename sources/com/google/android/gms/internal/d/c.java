package com.google.android.gms.internal.d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f50591a = c.class.getClassLoader();

    private c() {
    }

    static {
        Covode.recordClassIndex(31559);
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
}
