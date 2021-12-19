package com.bytedance.apm.p;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.c;
import com.bytedance.monitor.a.b.d;
import com.bytedance.monitor.a.b.e;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static long f25198c = 30000;

    /* renamed from: d  reason: collision with root package name */
    public static long f25199d = 30000;

    /* renamed from: a  reason: collision with root package name */
    public volatile ExecutorService f25200a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f25201b;

    /* renamed from: e  reason: collision with root package name */
    public d f25202e;

    /* renamed from: f  reason: collision with root package name */
    public final e f25203f;

    /* renamed from: g  reason: collision with root package name */
    public final e f25204g;

    /* renamed from: h  reason: collision with root package name */
    public CopyOnWriteArraySet<AbstractC0531b> f25205h;

    /* renamed from: i  reason: collision with root package name */
    public CopyOnWriteArraySet<AbstractC0531b> f25206i;

    /* renamed from: com.bytedance.apm.p.b$b  reason: collision with other inner class name */
    public interface AbstractC0531b {
        static {
            Covode.recordClassIndex(14685);
        }

        void a(long j2);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25210a = new b((byte) 0);

        static {
            Covode.recordClassIndex(14684);
        }
    }

    static {
        Covode.recordClassIndex(14680);
    }

    private b() {
        this.f25201b = true;
        this.f25203f = new e() {
            /* class com.bytedance.apm.p.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14681);
            }

            @Override // com.bytedance.monitor.a.b.e
            public final String a() {
                return "AsyncEventManager-mTimerRunnable";
            }

            @Override // com.bytedance.monitor.a.b.e
            public final com.bytedance.monitor.a.b.b b() {
                return com.bytedance.monitor.a.b.b.LIGHT_WEIGHT;
            }

            public final void run() {
                Iterator<AbstractC0531b> it = b.this.f25205h.iterator();
                while (it.hasNext()) {
                    it.next().a(System.currentTimeMillis());
                }
                if (b.this.f25201b) {
                    b.this.a((e) this, b.f25198c);
                }
            }
        };
        this.f25204g = new e() {
            /* class com.bytedance.apm.p.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14682);
            }

            @Override // com.bytedance.monitor.a.b.e
            public final String a() {
                return "AsyncEventManager-mControlledTimerRunnable";
            }

            @Override // com.bytedance.monitor.a.b.e
            public final com.bytedance.monitor.a.b.b b() {
                return com.bytedance.monitor.a.b.b.LIGHT_WEIGHT;
            }

            public final void run() {
                Iterator<AbstractC0531b> it = b.this.f25206i.iterator();
                while (it.hasNext()) {
                    it.next().a(System.currentTimeMillis());
                }
                if (b.this.f25201b) {
                    b.this.a((e) this, b.f25199d);
                }
            }
        };
        this.f25205h = new CopyOnWriteArraySet<>();
        this.f25206i = new CopyOnWriteArraySet<>();
        this.f25202e = a.C1013a.f41371a;
    }

    public final boolean a() {
        if (this.f25202e == null || Thread.currentThread().getId() != this.f25202e.a(com.bytedance.monitor.a.b.b.LIGHT_WEIGHT)) {
            return false;
        }
        return true;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void b(AbstractC0531b bVar) {
        try {
            this.f25205h.remove(bVar);
        } catch (Throwable unused) {
        }
    }

    private static ExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }

    public final void a(AbstractC0531b bVar) {
        try {
            if (this.f25201b && !this.f25205h.contains(bVar)) {
                this.f25205h.add(bVar);
                a(this.f25203f);
                a(this.f25203f, f25198c);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(Runnable runnable) {
        if (this.f25200a == null) {
            synchronized (this) {
                if (this.f25200a == null) {
                    d dVar = this.f25202e;
                    if (dVar != null) {
                        this.f25200a = dVar.a();
                    } else {
                        this.f25200a = a(new ThreadFactory() {
                            /* class com.bytedance.apm.p.b.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(14683);
                            }

                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, "Apm_Normal");
                            }
                        });
                    }
                }
            }
        }
        this.f25200a.submit(runnable);
    }

    public final void a(e eVar) {
        d dVar = this.f25202e;
        if (dVar != null && eVar != null) {
            dVar.b(eVar);
        }
    }

    public final void a(Runnable runnable) {
        if (this.f25202e != null && runnable != null && this.f25201b) {
            this.f25202e.a(a(runnable, UGCMonitor.TYPE_POST));
        }
    }

    private static e a(Runnable runnable, String str) {
        return c.a("AsyncEventManager-".concat(String.valueOf(str)), runnable);
    }

    public final void a(e eVar, long j2) {
        if (this.f25202e != null && eVar != null && this.f25201b) {
            this.f25202e.a(eVar, j2);
        }
    }

    public final void a(Runnable runnable, long j2) {
        if (this.f25202e != null && this.f25201b) {
            this.f25202e.a(a(runnable, "postDelayed"), j2);
        }
    }
}
