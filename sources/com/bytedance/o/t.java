package com.bytedance.o;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f41744a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(25541);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
