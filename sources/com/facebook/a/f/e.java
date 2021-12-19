package com.facebook.a.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ae;
import com.facebook.m;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.nio.charset.Charset;

public class e {
    static {
        Covode.recordClassIndex(28504);
    }

    public static File a() {
        if (a.a(e.class)) {
            return null;
        }
        try {
            ae.a();
            Context context = m.f48921g;
            if (d.f107195c == null || !d.f107197e) {
                d.f107195c = context.getFilesDir();
            }
            File file = new File(d.f107195c, "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    private static String b(String str) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            return TextUtils.join(" ", str.trim().split("\\s+"));
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static int[] a(String str) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            int[] iArr = new int[128];
            byte[] bytes = b(str).getBytes(Charset.forName("UTF-8"));
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }
}
