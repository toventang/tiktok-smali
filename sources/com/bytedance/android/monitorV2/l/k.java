package com.bytedance.android.monitorV2.l;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(14167);
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
