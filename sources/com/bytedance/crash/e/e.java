package com.bytedance.crash.e;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.b.i;
import com.bytedance.crash.g.a;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.nativecrash.g;
import com.bytedance.crash.runtime.a.b;
import com.bytedance.crash.runtime.f;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    boolean f27539a;

    /* renamed from: b  reason: collision with root package name */
    Throwable f27540b;

    /* renamed from: c  reason: collision with root package name */
    long f27541c;

    /* renamed from: d  reason: collision with root package name */
    String f27542d;

    /* renamed from: e  reason: collision with root package name */
    boolean f27543e;

    /* renamed from: f  reason: collision with root package name */
    Thread f27544f;

    /* renamed from: g  reason: collision with root package name */
    String f27545g;

    /* renamed from: h  reason: collision with root package name */
    boolean f27546h;

    /* renamed from: i  reason: collision with root package name */
    File f27547i;

    static {
        Covode.recordClassIndex(16179);
    }

    @Override // com.bytedance.crash.runtime.a.b.a
    public final com.bytedance.crash.entity.b b(int i2, com.bytedance.crash.entity.b bVar) {
        try {
            j.a(new File(this.f27547i, this.f27547i.getName() + "." + i2), bVar.f27557a);
        } catch (Throwable unused) {
        }
        return bVar;
    }

    @Override // com.bytedance.crash.runtime.a.b.a
    public final com.bytedance.crash.entity.b a(int i2, com.bytedance.crash.entity.b bVar) {
        String str;
        String str2;
        String str3;
        List<ICrashCallback> list;
        CrashType crashType;
        CrashType crashType2;
        Object obj;
        JSONArray jSONArray;
        int i3 = 2;
        if (i2 != 0) {
            String str4 = "true";
            if (i2 == 1) {
                if (this.f27546h) {
                    bVar.a("timestamp", Long.valueOf(this.f27541c));
                    bVar.a("main_process", Boolean.valueOf(com.bytedance.crash.util.b.b(m.f27724a)));
                    bVar.a("crash_type", CrashType.JAVA);
                }
                Thread thread = this.f27544f;
                if (thread != null) {
                    str2 = thread.getName();
                } else {
                    str2 = "";
                }
                bVar.a("crash_thread_name", (Object) str2);
                bVar.a("tid", Integer.valueOf(Process.myTid()));
                if (n.b()) {
                    str3 = str4;
                } else {
                    str3 = "false";
                }
                bVar.a("crash_after_crash", str3);
                if (!NativeImpl.b()) {
                    str4 = "false";
                }
                bVar.a("crash_after_native", str4);
                a.a();
                Thread thread2 = this.f27544f;
                Throwable th = this.f27540b;
                if (this.f27546h) {
                    list = n.f27742f.f27896a.getList(CrashType.LAUNCH);
                    crashType = CrashType.LAUNCH;
                } else {
                    list = n.f27742f.f27896a.getList(CrashType.JAVA);
                    crashType = CrashType.JAVA;
                }
                for (ICrashCallback iCrashCallback : list) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        iCrashCallback.onCrash(crashType, ab.a(th), thread2);
                        bVar.c("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    } catch (Throwable unused) {
                        m.f27730g.isDebugMode();
                        bVar.c("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    }
                }
                File g2 = r.g(m.f27724a);
                if (this.f27546h) {
                    crashType2 = CrashType.LAUNCH;
                } else {
                    crashType2 = CrashType.JAVA;
                }
                f.a(g2, crashType2);
            } else if (i2 == 2) {
                if (this.f27539a) {
                    com.bytedance.crash.util.b.a(m.f27724a, bVar.f27557a);
                }
                if (this.f27546h) {
                    bVar.a("launch_did", (Object) a.a(m.f27724a));
                }
                JSONArray b2 = i.b();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                JSONObject e2 = i.e();
                JSONArray a2 = i.a(uptimeMillis2);
                bVar.a("history_message", (Object) b2);
                bVar.a("current_message", e2);
                bVar.a("pending_messages", (Object) a2);
                bVar.a("disable_looper_monitor", String.valueOf(com.bytedance.crash.runtime.b.c()));
                if (!this.f27539a && com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "enable_hprof_all_java_crash") == 1) {
                    bVar.a("may_have_hprof", str4);
                    a.a(this.f27544f, this.f27540b, this.f27546h, this.f27541c);
                }
                bVar.a("alive_pids", (Object) g.f());
            } else if (i2 == 3) {
                File file = new File(r.a(m.f27724a, m.e()), "trace.txt");
                if (!NativeTools.h() || com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "enable_anr_dump_for_java_crash") != 1) {
                    obj = ab.b(Thread.currentThread().getName());
                } else {
                    NativeTools.a().e(file.getAbsolutePath());
                    try {
                        jSONArray = j.a(file.getAbsolutePath());
                    } catch (Throwable unused2) {
                        jSONArray = null;
                    }
                    obj = com.bytedance.crash.b.a.a(jSONArray, (com.bytedance.crash.b.f) null, false).second;
                }
                if (obj != null) {
                    bVar.a("all_thread_stacks", obj);
                }
            } else if (i2 != 4) {
                if (i2 == 5) {
                    bVar.a("crash_uuid", (Object) this.f27545g);
                }
            } else if (!this.f27539a) {
                com.bytedance.crash.util.b.a(m.f27724a, bVar.f27557a);
            }
        } else {
            if (this.f27546h) {
                str = "stack";
            } else {
                str = "data";
            }
            bVar.a(str, (Object) ab.a(this.f27540b));
            bVar.a("isOOM", Boolean.valueOf(this.f27539a));
            if (this.f27546h) {
                bVar.a("event_type", "start_crash");
            } else {
                bVar.a("isJava", (Object) 1);
            }
            bVar.a("crash_time", Long.valueOf(this.f27541c));
            if (com.bytedance.crash.runtime.a.a.f27845d != 1) {
                i3 = com.bytedance.crash.runtime.a.a.f27845d;
            } else if (!com.bytedance.crash.runtime.a.a.f27846e) {
                i3 = 1;
            }
            bVar.a("launch_mode", Integer.valueOf(i3));
            bVar.a("launch_time", Long.valueOf(com.bytedance.crash.runtime.a.a.f27847f));
            String str5 = this.f27542d;
            if (str5 != null) {
                bVar.a("crash_md5", (Object) str5);
                bVar.a("crash_md5", this.f27542d);
                boolean z = this.f27543e;
                if (z) {
                    bVar.a("has_ignore", String.valueOf(z));
                }
            }
        }
        return bVar;
    }

    public e(boolean z, Throwable th, long j2, String str, boolean z2, Thread thread, String str2, File file, boolean z3) {
        this.f27539a = z;
        this.f27544f = thread;
        this.f27540b = th;
        this.f27541c = j2;
        this.f27542d = str;
        this.f27543e = z2;
        this.f27545g = str2;
        this.f27547i = file;
        this.f27546h = z3;
    }
}
