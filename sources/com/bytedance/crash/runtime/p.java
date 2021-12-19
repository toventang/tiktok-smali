package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.g;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.d;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Date;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static File f27938a;

    static {
        Covode.recordClassIndex(16349);
    }

    public static File a() {
        if (f27938a == null) {
            if (b.c(m.f27724a) == null) {
                return null;
            }
            f27938a = new File(g.b(), "procHistory.txt");
            n.b().a(new Runnable() {
                /* class com.bytedance.crash.runtime.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16350);
                }

                public final void run() {
                    File file;
                    String[] list;
                    if (b.b(m.f27724a) && (list = (file = new File(r.j(m.f27724a), "npth/ProcessTrack/")).list()) != null && list.length > 25) {
                        Arrays.sort(list);
                        for (int i2 = 0; i2 < list.length - 25; i2++) {
                            j.a(new File(file, list[i2]));
                        }
                    }
                }
            }, 15000);
        }
        return f27938a;
    }

    public static j.b b(long j2) {
        File[] listFiles = a(j2).listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.p.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16351);
            }

            public final boolean accept(File file, String str) {
                return str.endsWith(".txt");
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        return new j.b(listFiles, true);
    }

    public static File a(long j2) {
        return new File(r.j(m.f27724a), "npth/ProcessTrack/" + ((j2 - (j2 % 86400000)) / 86400000));
    }

    public static File a(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            str = m.f27724a.getPackageName();
        }
        return new File(a(j2), str.replace(':', '_') + ".txt");
    }

    public static void a(String str, String str2) {
        try {
            File a2 = a();
            if (a2 != null) {
                j.a(a2, str + ' ' + str2 + ' ' + d.a().format(new Date(System.currentTimeMillis())) + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
