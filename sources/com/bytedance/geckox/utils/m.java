package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(17503);
    }

    public static Long a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17504);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        Long l2 = null;
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l2 == null) {
                        l2 = Long.valueOf(longValue);
                    } else if (longValue > l2.longValue()) {
                        l2 = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l2;
    }

    public static List<Long> b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17505);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
