package com.bytedance.framwork.core.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.c.a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class f extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final Object f29500a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f29501b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f29502c;

    /* renamed from: d  reason: collision with root package name */
    private final e f29503d;

    /* renamed from: e  reason: collision with root package name */
    private long f29504e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f29505f = 0;

    /* renamed from: g  reason: collision with root package name */
    private long f29506g = 120000;

    /* renamed from: h  reason: collision with root package name */
    private d f29507h;

    /* renamed from: i  reason: collision with root package name */
    private final LinkedList<b> f29508i;

    /* renamed from: j  reason: collision with root package name */
    private int f29509j;

    static {
        Covode.recordClassIndex(17182);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r7.f29503d.a(r3.f29488f, r3.f29484b) < Long.MAX_VALUE) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r7.f29503d.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r7.f29503d.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.c.f.a():boolean");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r6 = 13227(0x33ab, float:1.8535E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f29502c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            boolean r1 = r7.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f29502c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            boolean r0 = r7.b()
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            r1 = 1
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f29502c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            if (r1 != 0) goto L_0x0005
            java.lang.Object r5 = r7.f29500a
            monitor-enter(r5)
            long r3 = r7.f29506g     // Catch:{ InterruptedException -> 0x0042 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r7.f29500a     // Catch:{ InterruptedException -> 0x0042 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0042 }
            goto L_0x0042
        L_0x003d:
            java.lang.Object r0 = r7.f29500a     // Catch:{ InterruptedException -> 0x0042 }
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x0042 }
        L_0x0042:
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0005
        L_0x0044:
            r1 = 0
            goto L_0x0022
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.c.f.run():void");
    }

    private boolean b() {
        boolean z;
        String str;
        a.b bVar;
        boolean z2 = false;
        if (this.f29502c.get()) {
            return false;
        }
        a.b bVar2 = null;
        if (this.f29504e < 0 && System.currentTimeMillis() - this.f29505f > 600000) {
            this.f29504e = 0;
            if (!this.f29502c.get()) {
                Map<String, a> map = this.f29507h.f29492a;
                if (map != null && !map.isEmpty()) {
                    for (String str2 : map.keySet()) {
                        if (this.f29502c.get()) {
                            break;
                        }
                        a aVar = map.get(str2);
                        if (!(aVar == null || (bVar = aVar.f29478d) == null)) {
                            this.f29503d.a(str2, bVar.c(), 604800000);
                        }
                    }
                }
                this.f29503d.a(null, -1, 864000000);
            }
            this.f29505f = System.currentTimeMillis();
        }
        if (!c.f29489a.a(this.f29501b)) {
            this.f29506g = 120000;
            return false;
        }
        b a2 = this.f29503d.a(this.f29504e);
        if (a2 != null) {
            if (this.f29504e < a2.f29483a) {
                this.f29504e = a2.f29483a;
            } else {
                this.f29504e++;
            }
            if (a2.f29484b == null || a2.f29484b.length <= 0) {
                z2 = true;
                z = false;
            } else {
                a a3 = this.f29507h.a(a2.f29488f);
                if (a3 == null) {
                    return true;
                }
                bVar2 = a3.f29478d;
                a.c cVar = a3.f29481g;
                long currentTimeMillis = System.currentTimeMillis();
                long d2 = bVar2.d();
                if (cVar != null) {
                    if (cVar.a()) {
                        z = true;
                    } else {
                        long b2 = cVar.b();
                        if (b2 > 0 && currentTimeMillis - a3.f29482h < b2) {
                            return true;
                        }
                        a3.f29482h = System.currentTimeMillis();
                    }
                }
                if (d2 > 0 && a2.f29486d > 0 && currentTimeMillis - a2.f29487e < d2 * ((long) a2.f29486d)) {
                    return true;
                }
                String str3 = a3.f29480f;
                List<String> b3 = bVar2.b();
                if (b3 == null) {
                    return true;
                }
                try {
                    String e2 = bVar2.e();
                    if (!TextUtils.isEmpty(e2)) {
                        z = a(a3, e2, a2.f29484b);
                    } else if (!TextUtils.isEmpty(str3)) {
                        z = a(a3, str3, a2.f29484b);
                        if (!z) {
                            try {
                                a3.f29480f = "";
                            } catch (Throwable unused) {
                            }
                        }
                    } else {
                        if (cVar.c()) {
                            this.f29509j++;
                        }
                        int size = b3.size();
                        int i2 = this.f29509j;
                        if (size <= i2 || i2 < 0) {
                            this.f29509j = 0;
                            str = b3.get(0);
                        } else {
                            str = b3.get(i2);
                        }
                        z = a(a3, str, a2.f29484b);
                        if (z) {
                            a3.f29480f = str;
                        }
                    }
                } catch (Throwable unused2) {
                    z = false;
                }
            }
            if (this.f29502c.get()) {
                return true;
            }
            if (z2) {
                this.f29503d.a(a2.f29483a, true, 0, 0);
            } else if (this.f29503d.a(a2.f29483a, z, 604800000, bVar2.c())) {
                long d3 = bVar2.d() * ((long) (a2.f29486d + 1));
                if (d3 > 0) {
                    this.f29506g = d3;
                }
                this.f29506g = Math.min(120000L, this.f29506g);
            } else {
                this.f29506g = 120000;
            }
            return true;
        } else if (this.f29504e == 0 && this.f29503d.a() == 0) {
            this.f29506g = 0;
            return false;
        } else {
            if (this.f29504e == -1) {
                this.f29506g = 120000;
            }
            this.f29504e = -1;
            return false;
        }
    }

    private static boolean a(a aVar, String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || aVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return aVar.a(str, bArr);
    }

    f(Context context, d dVar, LinkedList<b> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f29507h = dVar;
        this.f29501b = context;
        this.f29508i = linkedList;
        this.f29502c = atomicBoolean;
        this.f29503d = e.a(context);
    }
}
