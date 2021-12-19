package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.a.a;
import com.bytedance.crash.b.i;
import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.bytedance.crash.j.b;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.runtime.a.b;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.runtime.f;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.h;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class NativeCrashCollector {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27754a;

    /* renamed from: b  reason: collision with root package name */
    public static g f27755b;

    static {
        Covode.recordClassIndex(16268);
    }

    private static void a(String str) {
        for (ICrashCallback iCrashCallback : n.f27742f.f27896a.getList(CrashType.NATIVE)) {
            try {
                iCrashCallback.onCrash(CrashType.NATIVE, str, null);
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
    }

    public static void onNativeCrash(final String str) {
        h hVar;
        v.a("[onNativeCrash] enter");
        File file = new File(r.a(), m.e());
        h.b(r.g(m.f27724a));
        try {
            b.a().b();
            final File file2 = new File(file, file.getName());
            e.a().a(CrashType.NATIVE, null, new b.a() {
                /* class com.bytedance.crash.nativecrash.NativeCrashCollector.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16269);
                }

                @Override // com.bytedance.crash.runtime.a.b.a
                public final com.bytedance.crash.entity.b b(int i2, com.bytedance.crash.entity.b bVar) {
                    j.a(new File(file2.getAbsolutePath() + '.' + i2), bVar.f27557a);
                    if (i2 == 0) {
                        a.a().c();
                    }
                    return bVar;
                }

                @Override // com.bytedance.crash.runtime.a.b.a
                public final com.bytedance.crash.entity.b a(int i2, com.bytedance.crash.entity.b bVar) {
                    String str;
                    String str2;
                    String str3 = "true";
                    int i3 = 0;
                    if (i2 == 1) {
                        String str4 = str;
                        if (str4 != null && !str4.isEmpty()) {
                            String str5 = str;
                            if (!TextUtils.isEmpty(str5)) {
                                if ("main".equalsIgnoreCase(str5)) {
                                    str2 = ab.a(Looper.getMainLooper().getThread().getStackTrace());
                                } else {
                                    ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
                                    int enumerate = threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i3 >= enumerate) {
                                            break;
                                        }
                                        String name = threadArr[i3].getName();
                                        if (TextUtils.isEmpty(name) || (!name.equals(str5) && !name.startsWith(str5) && !name.endsWith(str5))) {
                                            i3++;
                                        }
                                    }
                                    str2 = ab.a(threadArr[i3].getStackTrace());
                                }
                                bVar.a("java_data", (Object) str2);
                            }
                            str2 = "";
                            bVar.a("java_data", (Object) str2);
                        }
                        if (!com.bytedance.crash.e.a.f27522d) {
                            str3 = "false";
                        }
                        bVar.a("crash_after_crash", str3);
                        if (NativeCrashCollector.f27755b != null) {
                            try {
                                str = NativeCrashCollector.f27755b.a();
                            } catch (Throwable unused) {
                                str = th.getClass().getName() + ":" + th.getMessage();
                            }
                            bVar.a("game_script_stack", (Object) str);
                        }
                        f.a(r.g(m.f27724a), CrashType.NATIVE);
                    } else if (i2 == 2) {
                        JSONArray b2 = i.b();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject e2 = i.e();
                        JSONArray a2 = i.a(uptimeMillis);
                        bVar.a("history_message", (Object) b2);
                        bVar.a("current_message", e2);
                        bVar.a("pending_messages", (Object) a2);
                        bVar.a("disable_looper_monitor", String.valueOf(com.bytedance.crash.runtime.b.c()));
                        bVar.a("alive_pids", (Object) g.f());
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            com.bytedance.crash.util.b.a(m.f27724a, bVar.f27557a);
                        }
                    } else if (com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1) {
                        bVar.a("all_thread_stacks", ab.b(str));
                        bVar.a("has_all_thread_stack", str3);
                    }
                    return bVar;
                }
            }, true);
            if (f27754a) {
                hVar = new h(file);
                hVar.a(file);
                a(hVar.a());
                return;
            }
            a("");
        } catch (Throwable th) {
            if (f27754a) {
                h hVar2 = new h(file);
                hVar2.a(file);
                a(hVar2.a());
            } else {
                a("");
            }
            throw th;
        }
    }
}
