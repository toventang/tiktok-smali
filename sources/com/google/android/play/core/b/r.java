package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;

public final class r {
    static {
        Covode.recordClassIndex(32857);
    }

    public static String a(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = "";
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static <T> void a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
