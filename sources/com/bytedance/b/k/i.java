package com.bytedance.b.k;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f26339a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(15298);
    }

    public static void a(Runnable runnable) {
        f26339a.post(runnable);
    }

    public static byte[] a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
