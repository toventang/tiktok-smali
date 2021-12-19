package com.bytedance.android.monitor.l;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(13985);
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }
}
