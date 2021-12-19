package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.a;
import com.bytedance.covode.number.Covode;

public final class ga {
    static {
        Covode.recordClassIndex(32249);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static void a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) a(bundle, str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(a.a("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }
}
