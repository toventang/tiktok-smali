package com.bytedance.z.a.d;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public final class c {
    static {
        Covode.recordClassIndex(28278);
    }

    public static ArrayList<Long> a(String str) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (File file : new File(str).listFiles(new FilenameFilter() {
            /* class com.bytedance.z.a.d.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28279);
            }

            public final boolean accept(File file, String str) {
                try {
                    Long.parseLong(str);
                    return true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
        })) {
            arrayList.add(Long.valueOf(Long.parseLong(file.getName())));
        }
        return arrayList;
    }
}
