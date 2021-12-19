package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;

public final class c {
    static {
        Covode.recordClassIndex(60674);
    }

    public static final String a(String str) {
        File[] listFiles;
        l.d(str, "");
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return "";
        }
        String str2 = "";
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory()) {
                String name = file2.getName();
                File[] listFiles2 = file2.listFiles();
                if (listFiles2 != null) {
                    int length = listFiles2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        File file3 = listFiles2[i2];
                        if (file3 != null) {
                            if (file3.isFile() && l.a((Object) file3.getName(), (Object) (name + ".png"))) {
                                str2 = file3.getAbsolutePath();
                                l.b(str2, "");
                                break;
                            } else if (file3.isDirectory()) {
                                name = file3.getName();
                                File[] listFiles3 = file3.listFiles();
                                if (listFiles3 != null) {
                                    int length2 = listFiles3.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length2) {
                                            break;
                                        }
                                        File file4 = listFiles3[i3];
                                        if (file4 != null && file4.isFile() && l.a((Object) file4.getName(), (Object) (name + ".png"))) {
                                            str2 = file4.getAbsolutePath();
                                            l.b(str2, "");
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                }
            }
        }
        return str2;
    }
}
