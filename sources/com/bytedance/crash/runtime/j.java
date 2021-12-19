package com.bytedance.crash.runtime;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.m;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.c;
import com.bytedance.crash.util.h;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.crash.util.w;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static i f27919a;

    static {
        Covode.recordClassIndex(16340);
    }

    public static JSONArray a(String str) {
        if (f27919a != null && m.e().equals(str)) {
            try {
                return b(f27919a.a());
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        return a(r.a(m.f27724a, str));
    }

    private static JSONArray b(String str) {
        try {
            File file = new File(str);
            if (file.length() > 512000) {
                return com.bytedance.crash.util.j.a(file, file.length() - 512000);
            }
            return com.bytedance.crash.util.j.a(str);
        } catch (IOException unused) {
            return null;
        } catch (Throwable unused2) {
            m.f27730g.isDebugMode();
            return null;
        }
    }

    public static JSONArray a(File file) {
        try {
            File file2 = new File(file, "logcat.txt");
            File file3 = new File(file, "logerr.txt");
            if (file3.exists()) {
                if (w.a(file2)) {
                    c.a(true, "single_logcat", 1);
                } else {
                    v.a("single_logcat" + " failed ver 2");
                    c.a(false, "single_logcat", 3);
                }
            }
            return b(h.a(file2, file3, true).getAbsolutePath());
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, String str2, boolean z) {
        if (NativeTools.a().f27974a) {
            c.a a2 = c.a("single_logcat");
            if (a2.f27988e == 1 || a2.f27985b != 2) {
                v.a("use native single logcat");
                NativeTools.a().a(str, str2);
                if (z) {
                    SystemClock.sleep(3000);
                    return;
                }
                return;
            }
        }
        m.f27730g.isDebugMode();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AnonymousClass1 r1 = new Runnable() {
            /* class com.bytedance.crash.runtime.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16341);
            }

            public final void run() {
                v.a("dumpLogcat use java");
                try {
                    Process exec = Runtime.getRuntime().exec(new String[]{"logcat", "-b", "main,system,crash,events", "-f", str});
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            exec.waitFor(3000, TimeUnit.MILLISECONDS);
                        } else if (atomicBoolean.get()) {
                            exec.waitFor();
                        } else {
                            SystemClock.sleep(1000);
                            if (exec == null) {
                                return;
                            }
                        }
                        exec.destroy();
                    } catch (Throwable unused) {
                        if (exec != null) {
                            exec.destroy();
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        };
        try {
            new Thread(r1).start();
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            r1.run();
        }
    }
}
