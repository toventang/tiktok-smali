package com.bytedance.b.k;

import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(15299);
    }

    public static void a() {
        if (a.f26312f) {
            int i2 = Build.VERSION.SDK_INT;
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (a.f26312f) {
            int i2 = Build.VERSION.SDK_INT;
            Trace.beginSection(str);
        }
    }
}
