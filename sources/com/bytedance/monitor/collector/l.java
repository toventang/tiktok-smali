package com.bytedance.monitor.collector;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.c;
import com.bytedance.monitor.a.b.e;

public final class l extends b {

    /* renamed from: f  reason: collision with root package name */
    e f41562f = c.a("collect-proc", new Runnable() {
        /* class com.bytedance.monitor.collector.l.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25427);
        }

        public final void run() {
            l.this.d();
        }
    });

    /* renamed from: g  reason: collision with root package name */
    private int f41563g = 200;

    /* renamed from: h  reason: collision with root package name */
    private int f41564h = 1000;

    /* renamed from: i  reason: collision with root package name */
    private boolean f41565i = true;

    static {
        Covode.recordClassIndex(25426);
    }

    public final synchronized void d() {
        try {
            if (k.f41545a) {
                MonitorJni.doCollect();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.b
    public final void b() {
        super.b();
        try {
            if (k.f41545a) {
                if (this.f41454e != null) {
                    this.f41454e.b(this.f41562f);
                }
                MonitorJni.doStop();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.b
    public final synchronized Pair<String, String> c() {
        try {
            if (!k.f41545a) {
                return null;
            }
            return new Pair<>(this.f41450a, MonitorJni.getProcInfos());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.b
    public final void a() {
        super.a();
        try {
            if (k.f41545a) {
                boolean z = this.f41565i;
                if (z) {
                    this.f41564h = 5000;
                } else {
                    this.f41564h = 1000;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                if (this.f41454e != null) {
                    this.f41454e.a(this.f41562f, 0, (long) this.f41564h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public l(int i2) {
        super(i2, "proc_monitor");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.b
    public final void b(int i2) {
        try {
            if (k.f41545a) {
                b();
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.f41563g = 200;
                        this.f41564h = 1000;
                        MonitorJni.setBufferSize(200);
                    } else if (i2 == 2 || i2 == 3) {
                        this.f41563g = 400;
                        this.f41564h = 1000;
                        MonitorJni.setBufferSize(400);
                    }
                    a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static long c(int i2) {
        long j2;
        try {
            if (!k.f41545a) {
                return -1;
            }
            long doGetCpuTime = MonitorJni.doGetCpuTime(i2);
            if (n.f41575b == -1) {
                if (n.f41574a > 0) {
                    j2 = n.f41574a;
                } else {
                    if (Build.VERSION.SDK_INT >= 21) {
                        j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        j2 = n.a("_SC_CLK_TCK");
                    }
                    if (j2 <= 0) {
                        j2 = 100;
                    }
                    n.f41574a = j2;
                }
                n.f41575b = 1000 / j2;
            }
            return doGetCpuTime * n.f41575b;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.bytedance.monitor.collector.b
    public final synchronized Pair<String, String> a(long j2, long j3) {
        try {
            if (!k.f41545a) {
                return null;
            }
            return new Pair<>(this.f41450a, MonitorJni.getProcInfoTimeRange(j2, j3));
        } catch (Throwable unused) {
            return null;
        }
    }
}
