package com.ss.android.ugc.tools.d.a;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(98229);
    }

    public static final int a(Bundle bundle) {
        l.d(bundle, "");
        try {
            Parcel obtain = Parcel.obtain();
            l.b(obtain, "");
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            return dataSize;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final byte[] b(Bundle bundle) {
        l.d(bundle, "");
        Parcel obtain = Parcel.obtain();
        l.b(obtain, "");
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        l.b(marshall, "");
        return marshall;
    }

    public static final Bundle a(byte[] bArr) {
        l.d(bArr, "");
        Parcel obtain = Parcel.obtain();
        l.b(obtain, "");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(c.class.getClassLoader());
        obtain.recycle();
        if (readBundle == null) {
            return new Bundle();
        }
        return readBundle;
    }
}
