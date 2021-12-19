package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.auth-api.q  reason: invalid package */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f50573a = q.class.getClassLoader();

    private q() {
    }

    static {
        Covode.recordClassIndex(31530);
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
