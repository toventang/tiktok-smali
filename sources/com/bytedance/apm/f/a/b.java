package com.bytedance.apm.f.a;

import android.os.Handler;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.block.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.h;
import com.bytedance.p.b.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24931a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f24932b;

    /* renamed from: c  reason: collision with root package name */
    private static c f24933c;

    static {
        Covode.recordClassIndex(14568);
    }

    public static synchronized void c() {
        synchronized (b.class) {
            if (f24933c != null && EvilMethodSwitcher.isOpenLaunchEvilMethod()) {
                f24933c.b();
            }
        }
    }

    public static synchronized void b() {
        synchronized (b.class) {
            if (f24931a) {
                f24931a = false;
                f24933c.f41760c = EvilMethodSwitcher.isLimitEvilMethodDepth();
                c.a(EvilMethodSwitcher.getEvilThresholdMs());
                g.b("app_launch_evil_method_scene_apm_2");
            }
        }
    }

    public static synchronized void a() {
        synchronized (b.class) {
            if (!f24931a) {
                f24931a = true;
                if (!f24932b) {
                    f24932b = true;
                    c.a(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                    c.f41756e = true;
                    if (EvilMethodSwitcher.isMessageKeyEnable()) {
                        PerfConfig.setReportMessage();
                    }
                    f.r.a();
                    com.bytedance.apm.block.a.g.a();
                    c.f41755d = true;
                    c cVar = new c(EvilMethodSwitcher.isLaunchLimitEvilMethodDepth(), true);
                    f24933c = cVar;
                    cVar.a();
                    h.a(true, "launch");
                    new Handler().postDelayed(new Runnable() {
                        /* class com.bytedance.apm.f.a.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14569);
                        }

                        public final void run() {
                            b.b();
                        }
                    }, 10000);
                }
                g.a("app_launch_evil_method_scene_apm_2");
            }
        }
    }
}
