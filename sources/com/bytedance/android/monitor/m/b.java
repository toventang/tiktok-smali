package com.bytedance.android.monitor.m;

import com.bytedance.covode.number.Covode;
import java.net.URL;

public final class b {
    static {
        Covode.recordClassIndex(14030);
    }

    public static String[] a(String str) {
        try {
            URL url = new URL(str);
            return new String[]{url.getHost(), url.getPath()};
        } catch (Exception unused) {
            return new String[]{"", ""};
        }
    }
}
