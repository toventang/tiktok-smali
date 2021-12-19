package com.bytedance.crash.nativecrash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.f.b;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.util.j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f27798a;

    static {
        Covode.recordClassIndex(16287);
    }

    public static String a() {
        return a(m.f27724a) + "/npth/selflib/";
    }

    public static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static String a(String str) {
        return a(m.f27724a) + "/npth/selflib/lib" + str + ".so";
    }

    public static void a(final String str, final String str2) {
        n.b().a(new Runnable() {
            /* class com.bytedance.crash.nativecrash.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16288);
            }

            public final void run() {
                if (f.f27798a == null) {
                    f.f27798a = new HashMap<>();
                    File file = new File(f.a(m.f27724a), "/npth/selflib/");
                    String[] list = file.list();
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith(".ver")) {
                                try {
                                    f.f27798a.put(str.substring(0, str.length() - 4), j.a(file.getAbsolutePath() + "/" + str, "\n"));
                                } catch (Throwable th) {
                                    com.bytedance.crash.d.a("NPTH_CATCH", th);
                                }
                            } else if (!str.endsWith(".so")) {
                                j.a(new File(file, str));
                            }
                        }
                    }
                }
                String str2 = str;
                if (!str2.equals(f.f27798a.get(str2)) || !new File(f.a(str2)).exists()) {
                    File file2 = new File(f.a(str));
                    file2.getParentFile().mkdirs();
                    if (file2.exists()) {
                        a(file2);
                    }
                    m.f27730g.isDebugMode();
                    if (b.a(m.f27724a, str, file2) == null) {
                        f.f27798a.put(file2.getName(), str2);
                        try {
                            j.a(new File(f.a(m.f27724a) + "/npth/selflib/" + str + ".ver"), str2, false);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }

            private static boolean a(File file) {
                MethodCollector.i(11803);
                try {
                    e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                    if (e.a(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                    }
                    if (e.c(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                        MethodCollector.o(11803);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.o(11803);
                return delete;
            }
        });
    }
}
