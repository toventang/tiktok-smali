package com.bytedance.crash.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.util.v;
import org.json.JSONArray;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static long f27441b;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27442d = true;

    /* renamed from: a  reason: collision with root package name */
    public final a f27443a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27444c;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f27445e;

    static {
        Covode.recordClassIndex(16142);
    }

    b(a aVar) {
        AnonymousClass1 r3 = new Runnable() {
            /* class com.bytedance.crash.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16143);
            }

            public final void run() {
                if (!b.this.f27444c) {
                    v.a("oldAnr start");
                    new Thread("anr_monitor_new") {
                        /* class com.bytedance.crash.b.b.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(16144);
                        }

                        public final void run() {
                            super.run();
                            while (true) {
                                SystemClock.sleep(m.f27730g.getDefaultAnrCheckInterval());
                                if (!b.this.f27444c) {
                                    b.this.f27443a.a((JSONArray) null, -1);
                                    b.f27441b = SystemClock.uptimeMillis();
                                } else {
                                    return;
                                }
                            }
                        }
                    }.start();
                }
            }
        };
        this.f27445e = r3;
        this.f27443a = aVar;
        if (com.bytedance.crash.runtime.b.j()) {
            f27442d = false;
            n.b().a(r3, 5000);
        }
    }
}
