package com.bytedance.crash.b;

import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.entity.e;
import com.bytedance.crash.j.f;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.c;
import com.bytedance.crash.runtime.a.a;
import com.bytedance.crash.runtime.o;
import com.bytedance.crash.runtime.p;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.h;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.w;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static File f27481a;

    /* renamed from: b  reason: collision with root package name */
    static File f27482b;

    /* renamed from: c  reason: collision with root package name */
    public static FileObserver f27483c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27484d;

    /* renamed from: e  reason: collision with root package name */
    public static long f27485e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static File f27486f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f27487g;

    /* renamed from: h  reason: collision with root package name */
    public static int f27488h;

    /* renamed from: i  reason: collision with root package name */
    public static b f27489i;

    /* renamed from: j  reason: collision with root package name */
    public static Runnable f27490j = new Runnable() {
        /* class com.bytedance.crash.b.g.AnonymousClass3 */

        static {
            Covode.recordClassIndex(16156);
        }

        public final void run() {
            MethodCollector.i(9778);
            File file = g.f27481a;
            synchronized (g.class) {
                try {
                    g.f27481a = null;
                    g.f27489i = null;
                    g.f27482b = null;
                } catch (Throwable th) {
                    MethodCollector.o(9778);
                    throw th;
                }
            }
            j.a(file);
            MethodCollector.o(9778);
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private static File f27491k;

    /* renamed from: l  reason: collision with root package name */
    private static long f27492l = -1;

    static {
        Covode.recordClassIndex(16152);
    }

    public static File a() {
        if (f27491k == null) {
            Context context = m.f27724a;
            if (d.f107195c == null || !d.f107197e) {
                d.f107195c = context.getFilesDir();
            }
            f27491k = new File(d.f107195c, "has_anr_signal_" + com.bytedance.crash.util.b.c(m.f27724a).replaceAll(":", "_"));
        }
        return f27491k;
    }

    public static void b() {
        File[] listFiles;
        File file = new File(r.j(m.f27724a), "npth/procanr/");
        if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                b(file2);
                j.a(file2);
            }
        }
    }

    private static b d() {
        String str;
        b bVar = new b(new JSONObject());
        bVar.a("is_anr", (Object) 1);
        bVar.a("has_dump", (Object) "true");
        bVar.a("jiffy", Long.valueOf(o.a.a()));
        e.a(bVar.f27557a);
        bVar.a("sdk_version", "3.1.6-rc.13-ttp");
        bVar.a("is_64_devices", String.valueOf(Header.a()));
        bVar.a("is_64_runtime", String.valueOf(NativeTools.a().c()));
        bVar.a("is_x86_devices", String.valueOf(Header.b()));
        if (c.g()) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.a("is_root", str);
        bVar.a("has_dump", "true");
        return bVar;
    }

    public static void c() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        f27492l = currentTimeMillis;
        long uptimeMillis = SystemClock.uptimeMillis();
        Context context = m.f27724a;
        JSONObject jSONObject = new JSONObject();
        n.a(jSONObject, "current_message", i.e());
        n.a(jSONObject, "history_message", i.b());
        n.a(jSONObject, "pending_messages", i.a(uptimeMillis));
        File file = new File(r.j(m.f27724a), "npth/killHistory/proc/" + Process.myPid() + "/trace_" + currentTimeMillis + "/");
        f27481a = file;
        file.mkdirs();
        j.a(new File(f27481a, "looper_message.txt"), jSONObject);
        File file2 = new File(f27481a, "main_stack.txt");
        try {
            file2.createNewFile();
        } catch (IOException unused) {
        }
        String a2 = ab.a(Looper.getMainLooper().getThread().getStackTrace());
        try {
            j.a(file2, a2, false);
        } catch (IOException unused2) {
        }
        File file3 = new File(f27481a, "trace.txt");
        f27482b = file3;
        p.a("anr_trace", file3.getAbsolutePath());
        if (NativeTools.h()) {
            NativeTools.a().e(file3.getAbsolutePath());
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        p.a("after_trace", file3.getAbsolutePath());
        h.a(f27481a);
        try {
            b d2 = d();
            n.a(d2.f27557a, jSONObject);
            com.bytedance.crash.util.b.a(context, d2.f27557a);
            d2.a("is_background", Boolean.valueOf(a.b()));
            d2.c("npth_trace_cost", String.valueOf(currentTimeMillis2 - currentTimeMillis));
            JSONObject a3 = c.a(a2);
            JSONObject jSONObject2 = null;
            a(a3, null, true);
            if (file3.length() < 500) {
                jSONObject2 = ab.b((String) null);
            }
            d2.a("all_thread_stacks", jSONObject2);
            d2.a("crash_time", Long.valueOf(currentTimeMillis));
            d2.a("data", (Object) a3.toString());
            b a4 = com.bytedance.crash.runtime.a.e.a().a(CrashType.ANR, d2);
            a4.a("logcat", (Object) com.bytedance.crash.runtime.j.a(m.e()));
            long j2 = f27485e;
            if (j2 > 0) {
                a4.c("last_anr_interval", String.valueOf(currentTimeMillis - j2));
            } else {
                a4.c("last_anr_interval", "none");
            }
            a4.a("alive_pids", (Object) com.bytedance.crash.nativecrash.g.f());
            a4.a("crash_uuid", (Object) m.a(currentTimeMillis, CrashType.ANR, false, false));
            JSONObject optJSONObject = a4.f27557a.optJSONObject("filters");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                a4.a("filters", optJSONObject);
            }
            try {
                optJSONObject.put("crash_length", a.b(currentTimeMillis));
                optJSONObject.put("disable_looper_monitor", String.valueOf(com.bytedance.crash.runtime.b.c()));
                optJSONObject.put("memory_leak", String.valueOf(b.a(m.e())));
                optJSONObject.put("fd_leak", String.valueOf(b.b(m.e())));
                optJSONObject.put("threads_leak", String.valueOf(b.c(m.e())));
                optJSONObject.put("is_64_runtime", String.valueOf(NativeTools.a().c()));
                if (com.bytedance.crash.n.a()) {
                    str = "true";
                } else {
                    str = "false";
                }
                optJSONObject.put("crash_after_crash", str);
                optJSONObject.put("from_file", String.valueOf(c.f27449b));
                optJSONObject.put("last_resume_activity", String.valueOf(a.a().p));
                optJSONObject.put("start_uuid", m.e());
            } catch (Throwable unused3) {
            }
            f27489i = a4;
            j.a(new File(f27481a, "origin_json.txt"), a4.f27557a);
        } catch (Throwable th) {
            com.bytedance.crash.d.a("NPTH_CATCH", th);
        }
    }

    public static void a(File file) {
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("anr_info_") || str.startsWith("trace_")) {
                    File file2 = new File(r.j(m.f27724a), "npth/procanr/" + file.getName());
                    file2.mkdirs();
                    j.b(file, file2);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:4:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:82:0x0186] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.io.File r46) {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.g.b(java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[Catch:{ JSONException -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject a(org.json.JSONObject r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.g.a(org.json.JSONObject, java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|(1:28)|39|40|41|(1:43)|44|45|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        com.bytedance.crash.d.a("NPTH_CATCH", r1);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10266);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r22, java.lang.String r23, long r24, boolean r26) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.g.a(java.io.File, java.lang.String, long, boolean):void");
    }

    private static boolean a(File file, File file2, long j2, String str) {
        try {
            JSONObject jSONObject = new JSONObject(j.a(file2, "\n"));
            w.a(jSONObject, file);
            List<String> a2 = com.bytedance.crash.a.a.a().a(j2, str);
            if (f.a(m.f27730g.getJavaCrashUploadUrl(), jSONObject.toString(), new j.b(file), p.b(j2), com.bytedance.crash.nativecrash.g.a(jSONObject.optJSONArray("alive_pids"))).a()) {
                com.bytedance.crash.a.a.a(a2, str);
                j.a(file);
                if (!com.bytedance.crash.n.a()) {
                    j.a(r.g(m.f27724a));
                }
            }
            return true;
        } catch (IOException | JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd A[SYNTHETIC, Splitter:B:33:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r15, java.io.File r16, java.lang.String r17, boolean r18, long r19, long r21, long r23, org.json.JSONObject r25, java.lang.String r26, org.json.JSONArray r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 576
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.g.a(java.io.File, java.io.File, java.lang.String, boolean, long, long, long, org.json.JSONObject, java.lang.String, org.json.JSONArray, boolean):void");
    }
}
