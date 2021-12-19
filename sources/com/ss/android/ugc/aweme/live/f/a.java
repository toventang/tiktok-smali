package com.ss.android.ugc.aweme.live.f;

import com.bytedance.covode.number.Covode;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(69433);
    }

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    File[] listFiles2 = file2.listFiles();
                    for (File file3 : listFiles2) {
                        if (file3.getName().endsWith(".png")) {
                            return file3.getAbsolutePath();
                        }
                    }
                    continue;
                }
            }
        }
        return str;
    }
}
