package com.bytedance.apm.block.a;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.apm.block.a.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.h;
import com.bytedance.monitor.collector.k;
import com.bytedance.p.b.c;
import java.util.LinkedList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f24602a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static volatile int f24603b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f24604c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f24605d;

    /* renamed from: e  reason: collision with root package name */
    public static long[] f24606e = new long[600000];

    /* renamed from: f  reason: collision with root package name */
    public static volatile long f24607f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile long f24608g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile Runnable f24609h = null;

    /* renamed from: i  reason: collision with root package name */
    public static HandlerThread f24610i;

    /* renamed from: j  reason: collision with root package name */
    public static Handler f24611j = new Handler(f24610i.getLooper());

    /* renamed from: k  reason: collision with root package name */
    public static final l[] f24612k = new l[50];

    /* renamed from: l  reason: collision with root package name */
    public static int f24613l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static Object f24614m = new Object();
    public static boolean n = false;
    public static com.bytedance.monitor.collector.a o = new com.bytedance.monitor.collector.a() {
        /* class com.bytedance.apm.block.a.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14480);
        }

        @Override // com.bytedance.monitor.collector.a
        public final boolean a() {
            if (g.f24609h != null) {
                g.f24609h.run();
                g.f24609h = null;
            }
            if (g.f24603b > 0) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.monitor.collector.a
        public final void b(String str) {
            super.b(str);
            g.n = true;
        }

        @Override // com.bytedance.monitor.collector.a
        public final void a(String str) {
            super.a(str);
            g.f24607f = com.bytedance.monitor.collector.a.f41431b - g.f24608g;
            g.n = false;
            synchronized (g.f24614m) {
                g.f24614m.notify();
            }
        }
    };
    private static int p = 0;
    private static int q = -1;
    private static boolean r = false;
    private static Thread s = Looper.getMainLooper().getThread();
    private static long t;
    private static long u;
    private static int v = 50;
    private static Runnable w;
    private static Runnable x = new Runnable() {
        /* class com.bytedance.apm.block.a.g.AnonymousClass2 */

        static {
            Covode.recordClassIndex(14481);
        }

        public final void run() {
            while (true) {
                try {
                    if (g.n || g.f24603b < 0) {
                        synchronized (g.f24614m) {
                            g.f24614m.wait();
                        }
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis() - g.f24608g;
                        g.f24607f = uptimeMillis;
                        g.f24607f = uptimeMillis & 8796093022207L;
                        SystemClock.sleep(5);
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    };
    private static a y;
    private static a z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24615a;

        /* renamed from: b  reason: collision with root package name */
        int f24616b;

        /* renamed from: c  reason: collision with root package name */
        public a f24617c;

        /* renamed from: d  reason: collision with root package name */
        public a f24618d;

        /* renamed from: e  reason: collision with root package name */
        boolean f24619e = true;

        /* renamed from: f  reason: collision with root package name */
        public String f24620f;

        /* renamed from: g  reason: collision with root package name */
        public long f24621g;

        static {
            Covode.recordClassIndex(14485);
        }

        public final String toString() {
            return "index:" + this.f24615a + ",\tisValid:" + this.f24619e + " source:" + this.f24620f;
        }

        public a(int i2) {
            this.f24615a = i2;
        }
    }

    public static long[] b() {
        a aVar;
        int i2;
        try {
            a aVar2 = y;
            if (aVar2 == null || (aVar = z) == null || aVar2 == aVar) {
                return null;
            }
            if (aVar2.f24616b == 0) {
                i2 = p - 1;
            } else {
                i2 = y.f24616b;
            }
            return a(z.f24615a, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(14479);
        f24603b = Integer.MAX_VALUE;
        f24604c = false;
        Object obj = new Object();
        f24605d = obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        f24607f = uptimeMillis;
        f24608g = uptimeMillis;
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        f24610i = handlerThread;
        w = null;
        if (Build.VERSION.SDK_INT < 24) {
            f24603b = -4;
            f24604c = true;
        } else {
            if (f24603b == Integer.MAX_VALUE) {
                synchronized (obj) {
                    if (f24603b == Integer.MAX_VALUE) {
                        f24607f = SystemClock.uptimeMillis() - f24608g;
                        f24611j.removeCallbacksAndMessages(null);
                        f24611j.postDelayed(x, 5);
                        Handler handler = f24611j;
                        AnonymousClass5 r0 = new Runnable() {
                            /* class com.bytedance.apm.block.a.g.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(14484);
                            }

                            public final void run() {
                                synchronized (g.f24605d) {
                                    if (g.f24603b == Integer.MAX_VALUE || g.f24603b == 1) {
                                        g.f24603b = -2;
                                        g.f24604c = true;
                                    }
                                }
                            }
                        };
                        w = r0;
                        handler.postDelayed(r0, 15000);
                        h.a(o);
                        f24603b = 1;
                    }
                }
            }
            a(1048574, 0L);
            a("EvilMethodTracer#message_0", com.bytedance.monitor.collector.a.f41431b);
        }
        f24611j.postDelayed(new Runnable() {
            /* class com.bytedance.apm.block.a.g.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14482);
            }

            public final void run() {
                synchronized (g.f24605d) {
                    if (g.f24603b == Integer.MAX_VALUE || g.f24603b == -4) {
                        g.f24603b = -3;
                        g.f24604c = true;
                        g.f24609h = new Runnable() {
                            /* class com.bytedance.apm.block.a.g.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(14483);
                            }

                            public final void run() {
                                g.f24611j.removeCallbacksAndMessages(null);
                                com.bytedance.monitor.collector.a aVar = g.o;
                                if (aVar != null) {
                                    synchronized (h.f41518a) {
                                        h.f41518a.remove(aVar);
                                    }
                                }
                                g.f24610i.quit();
                                g.f24606e = null;
                            }
                        };
                    }
                }
            }
        }, 15000);
    }

    public static void a() {
        synchronized (f24605d) {
            if (f24603b < 2 && f24603b >= -2) {
                f24611j.removeCallbacks(w);
                if (f24606e != null) {
                    f24603b = 2;
                    f24604c = false;
                } else {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
            }
        }
    }

    public static long[] a(a aVar) {
        return a(aVar, new a(p - 1));
    }

    public static String a(long[] jArr, long j2) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        com.bytedance.p.a.a.a(jArr, linkedList, j2);
        com.bytedance.p.a.a.a(linkedList);
        StringBuilder sb = new StringBuilder();
        com.bytedance.p.a.a.a(linkedList, sb);
        return sb.toString();
    }

    public static String a(long j2, long j3) {
        long[] jArr;
        a aVar;
        int i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        a aVar2 = y;
        if (aVar2 == null || (aVar = z) == null) {
            jArr = null;
        } else {
            while (aVar2 != aVar) {
                if (aVar2.f24617c.f24621g <= j3) {
                    if (aVar.f24618d.f24621g >= j2) {
                        break;
                    }
                    aVar = aVar.f24618d;
                } else {
                    aVar2 = aVar2.f24617c;
                }
            }
            if (aVar2.f24616b == 0) {
                i2 = p - 1;
            } else {
                i2 = aVar2.f24616b;
            }
            jArr = a(aVar.f24615a, i2);
        }
        return a(jArr, uptimeMillis);
    }

    public static a a(String str, long j2) {
        if (y == null) {
            a aVar = new a(p);
            y = aVar;
            if (j2 <= 0) {
                j2 = SystemClock.uptimeMillis();
            }
            aVar.f24621g = j2;
            y.f24620f = str;
            a aVar2 = y;
            z = aVar2;
            return aVar2;
        }
        a aVar3 = new a(p);
        if (j2 <= 0) {
            j2 = SystemClock.uptimeMillis();
        }
        aVar3.f24621g = j2;
        aVar3.f24620f = str;
        aVar3.f24617c = y;
        y.f24616b = aVar3.f24615a - 1;
        y.f24618d = aVar3;
        y = aVar3;
        return aVar3;
    }

    public static void b(int i2, long j2) {
        int i3;
        if (!f24604c && c.f41756e && i2 < 1048575 && Thread.currentThread() == s) {
            if (j2 != 0) {
                long j3 = j2 - f24608g;
                f24607f = j3;
                f24607f = j3 & 8796093022207L;
            }
            long j4 = (long) i2;
            if (j4 == u) {
                if (f24607f - t > 16 && (i3 = f24613l) < v - 1) {
                    f24612k[i3] = new l(s.getStackTrace());
                    f24613l++;
                }
                u = 0;
                k.a().a(false);
            }
            t = 0;
            long j5 = (j4 << 43) | 0 | f24607f;
            long[] jArr = f24606e;
            int i4 = p;
            jArr[i4] = j5;
            int i5 = i4 + 1;
            p = i5;
            if (i5 == 600000) {
                p = 0;
            }
            a aVar = z;
            if (aVar != null && aVar.f24615a == p) {
                a aVar2 = z.f24618d;
                z = aVar2;
                if (aVar2 != null) {
                    aVar2.f24617c = null;
                } else {
                    y = null;
                }
            }
        }
    }

    public static void a(int i2, long j2) {
        if (!f24604c && c.f41756e && i2 < 1048575 && Thread.currentThread() == s && !r) {
            r = true;
            if (j2 != 0) {
                long j3 = j2 - f24608g;
                f24607f = j3;
                f24607f = j3 & 8796093022207L;
            }
            t = f24607f;
            if (i.a.f24638a.f24629a.contains(Integer.valueOf(i2))) {
                u = (long) i2;
                k.a().a(true);
            }
            long j4 = Long.MIN_VALUE | (((long) i2) << 43) | f24607f;
            long[] jArr = f24606e;
            int i3 = p;
            jArr[i3] = j4;
            int i4 = i3 + 1;
            p = i4;
            if (i4 == 600000) {
                p = 0;
            }
            r = false;
            a aVar = z;
            if (aVar != null && aVar.f24615a == p) {
                a aVar2 = z.f24618d;
                z = aVar2;
                if (aVar2 != null) {
                    aVar2.f24617c = null;
                } else {
                    y = null;
                }
            }
        }
    }

    private static long[] a(int i2, int i3) {
        long[] jArr = new long[0];
        int max = Math.max(0, i2);
        int max2 = Math.max(0, i3);
        if (max2 > max) {
            int i4 = (max2 - max) + 1;
            long[] jArr2 = new long[i4];
            System.arraycopy(f24606e, max, jArr2, 0, i4);
            return jArr2;
        } else if (max2 >= max) {
            return jArr;
        } else {
            int i5 = max2 + 1;
            long[] jArr3 = f24606e;
            long[] jArr4 = new long[((jArr3.length - max) + i5)];
            System.arraycopy(jArr3, max, jArr4, 0, jArr3.length - max);
            long[] jArr5 = f24606e;
            System.arraycopy(jArr5, 0, jArr4, jArr5.length - max, i5);
            return jArr4;
        }
    }

    private static long[] a(a aVar, a aVar2) {
        if (f24603b == -3) {
            return null;
        }
        long[] jArr = new long[0];
        try {
            if (aVar.f24619e && aVar2.f24619e) {
                return a(aVar.f24615a - 1, aVar2.f24615a);
            }
        } catch (OutOfMemoryError unused) {
        }
        return jArr;
    }
}
