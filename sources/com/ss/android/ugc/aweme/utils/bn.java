package com.ss.android.ugc.aweme.utils;

import com.a;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class bn {
    static {
        Covode.recordClassIndex(93345);
    }

    public static String b(File... fileArr) {
        return a((double) a(fileArr));
    }

    private static String a(double d2) {
        return a.a("%.2fMB", new Object[]{Double.valueOf(d2 / 1048576.0d)});
    }

    public static long a(File... fileArr) {
        long j2;
        long j3 = 0;
        for (File file : fileArr) {
            try {
                File[] listFiles = file.listFiles();
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    if (listFiles[i2].isDirectory()) {
                        j2 = a(listFiles[i2]);
                    } else {
                        j2 = listFiles[i2].length();
                    }
                    j3 += j2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return j3;
    }
}
