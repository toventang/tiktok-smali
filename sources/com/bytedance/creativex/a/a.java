package com.bytedance.creativex.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(16409);
    }

    public static final <T extends Parcelable> T a(T t) {
        l.d(t, "");
        Parcel obtain = Parcel.obtain();
        l.b(obtain, "");
        obtain.writeValue(t);
        obtain.setDataPosition(0);
        Object readValue = obtain.readValue(t.getClass().getClassLoader());
        Objects.requireNonNull(readValue, "null cannot be cast to non-null type T");
        T t2 = (T) ((Parcelable) readValue);
        obtain.recycle();
        return t2;
    }
}
