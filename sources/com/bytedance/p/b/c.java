package com.bytedance.p.b;

import android.text.TextUtils;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.block.a.g;
import com.bytedance.apm.block.a.h;
import com.bytedance.apm.block.a.l;
import com.bytedance.apm.block.d;
import com.bytedance.apm.block.e;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.b;
import com.bytedance.b.k.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.monitor.collector.g;
import com.bytedance.monitor.collector.k;
import com.bytedance.monitor.collector.o;
import com.bytedance.p.a.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends com.bytedance.apm.block.a implements d {

    /* renamed from: b  reason: collision with root package name */
    public static d f41754b;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f41755d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f41756e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f41757f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f41758g;

    /* renamed from: h  reason: collision with root package name */
    private static c f41759h;
    private static long n;
    private static volatile boolean o;
    private static int s;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41760c;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f41761i;

    /* renamed from: j  reason: collision with root package name */
    private g.a f41762j;

    /* renamed from: k  reason: collision with root package name */
    private g.a f41763k;

    /* renamed from: l  reason: collision with root package name */
    private volatile String f41764l;

    /* renamed from: m  reason: collision with root package name */
    private long[] f41765m;
    private volatile long p;
    private a q;
    private boolean r;

    static {
        Covode.recordClassIndex(25548);
    }

    public c() {
        this((byte) 0);
    }

    public final void b() {
        if (!o) {
            e.a(this);
            o = true;
        }
    }

    public final synchronized void a() {
        MethodCollector.i(5916);
        if (this.r) {
            MethodCollector.o(5916);
            return;
        }
        if (f41756e && f41755d) {
            f.r.a(this);
            this.r = true;
        }
        MethodCollector.o(5916);
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f41772a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f41773b;

        /* renamed from: c  reason: collision with root package name */
        long[] f41774c;

        /* renamed from: d  reason: collision with root package name */
        long[] f41775d;

        /* renamed from: e  reason: collision with root package name */
        long f41776e;

        /* renamed from: f  reason: collision with root package name */
        long f41777f;

        /* renamed from: g  reason: collision with root package name */
        long f41778g;

        /* renamed from: h  reason: collision with root package name */
        String f41779h;

        /* renamed from: i  reason: collision with root package name */
        boolean f41780i;

        /* renamed from: j  reason: collision with root package name */
        String f41781j;

        /* renamed from: k  reason: collision with root package name */
        String f41782k;

        /* renamed from: l  reason: collision with root package name */
        long f41783l;

        /* renamed from: m  reason: collision with root package name */
        g.e f41784m;
        l[] n;

        static {
            Covode.recordClassIndex(25553);
        }

        public final void run() {
            boolean z;
            try {
                LinkedList linkedList = new LinkedList();
                long[] jArr = this.f41775d;
                if (jArr.length > 0) {
                    com.bytedance.p.a.a.a(jArr, linkedList, this.f41778g);
                    com.bytedance.p.a.a.a(linkedList, new a.AbstractC1024a() {
                        /* class com.bytedance.p.b.c.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(25554);
                        }

                        @Override // com.bytedance.p.a.a.AbstractC1024a
                        public final boolean a(long j2, int i2) {
                            return j2 < ((long) (i2 * 5));
                        }

                        @Override // com.bytedance.p.a.a.AbstractC1024a
                        public final void a(List<h> list, int i2) {
                            if (com.bytedance.apm.c.e()) {
                                com.bytedance.apm.h.f.b("[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i2), 30, list);
                            }
                            ListIterator<h> listIterator = list.listIterator(Math.min(i2, 30));
                            while (listIterator.hasNext()) {
                                listIterator.next();
                                listIterator.remove();
                            }
                        }
                    });
                }
                if (linkedList.size() > 2) {
                    StringBuilder sb = new StringBuilder();
                    long max = Math.max(this.f41777f, com.bytedance.p.a.a.a(linkedList, sb));
                    String c2 = com.bytedance.p.a.a.c(linkedList);
                    JSONObject jSONObject = new JSONObject();
                    String sb2 = sb.toString();
                    g.e eVar = this.f41784m;
                    if (eVar != null) {
                        eVar.a(this.f41782k, null, null, sb2);
                    }
                    jSONObject.put("stack", sb2);
                    jSONObject.put("stack_key", c2);
                    jSONObject.put("scene", this.f41779h);
                    jSONObject.put("cost_time", max);
                    jSONObject.put("cpu_cost", this.f41776e);
                    jSONObject.put("method_time", max);
                    k a2 = k.a();
                    long j2 = this.f41778g;
                    JSONObject a3 = a2.a(j2 - this.f41777f, j2);
                    long j3 = this.f41778g;
                    a3.put("lock_monitor", LockMonitorManager.dumpLockInfo(j3 - this.f41777f, j3));
                    long j4 = this.f41778g;
                    String a4 = com.bytedance.apm.block.a.g.a(j4 - this.f41777f, j4);
                    boolean z2 = false;
                    if (c.f41758g) {
                        a4 = b.a(new a(a4, max));
                        b.f41753d.clear();
                        c.f41758g = false;
                        z = true;
                    } else {
                        a aVar = new a(a4, max);
                        if (b.f41753d == null) {
                            b.f41753d = new LinkedBlockingQueue<>(b.f41751b);
                        }
                        try {
                            if (b.f41753d.size() == b.f41751b) {
                                b.f41753d.take();
                            }
                            b.f41753d.put(aVar);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        z = false;
                    }
                    a3.put("evil_method", a4);
                    jSONObject.put("message", o.a(this.f41781j));
                    jSONObject.put("timestamp", this.f41778g);
                    jSONObject.put("event_type", "lag_drop_frame");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("crash_section", com.bytedance.apm.c.a(this.f41783l));
                    jSONObject2.put("block_frame", String.valueOf(this.f41773b));
                    jSONObject2.put("block_input", String.valueOf(this.f41772a));
                    jSONObject2.put("trace_type", "message");
                    if (c.f41757f) {
                        List<String> a5 = l.a(this.n);
                        a3.put("dmt_stack_completion", a5);
                        if (!a5.isEmpty()) {
                            z2 = true;
                        }
                        jSONObject2.put("has_dmt_stack_completion", String.valueOf(z2));
                    }
                    jSONObject.put("custom", a3);
                    jSONObject.put("filters", jSONObject2);
                    com.bytedance.apm.c.b.d dVar = new com.bytedance.apm.c.b.d("drop_frame_stack", jSONObject);
                    if (z) {
                        dVar.f24740d = true;
                    }
                    com.bytedance.apm.c.a.a.b().a(dVar);
                    c.b("evil_method_end");
                }
            } catch (Exception unused) {
                c.b("evil_method_analyse_exception");
            }
        }

        a(boolean z, String str, long[] jArr, long[] jArr2, long j2, long j3, long j4, String str2, long j5, String str3, g.e eVar, l[] lVarArr) {
            this.f41780i = z;
            this.f41779h = str;
            this.f41777f = j3;
            this.f41776e = j2;
            this.f41775d = jArr;
            this.f41774c = jArr2;
            this.f41778g = j4;
            this.f41781j = str2;
            this.f41783l = j5;
            this.f41782k = str3;
            this.f41784m = eVar;
            this.n = lVarArr;
        }
    }

    public c(byte b2) {
        this(false, false);
    }

    public static void a(long j2) {
        if (j2 < 70) {
            j2 = 1000;
        }
        n = j2;
    }

    public static void b(final String str) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.p.b.c.AnonymousClass4 */

            static {
                Covode.recordClassIndex(25552);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("evil_method_section", str);
                    com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.c("evil_method_tracing", 0, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null));
                } catch (JSONException unused) {
                }
            }
        });
    }

    @Override // com.bytedance.apm.block.a
    public final void a(String str) {
        g.a aVar;
        super.a(str);
        com.bytedance.apm.block.a.g.f24613l = 0;
        com.bytedance.apm.block.a.g.a(1048574, com.bytedance.monitor.collector.a.f41431b);
        if (com.bytedance.monitor.collector.a.f41431b - this.p > 300) {
            this.f41763k = this.f41762j;
            this.p = com.bytedance.monitor.collector.a.f41431b;
            this.f41762j = com.bytedance.apm.block.a.g.a("EvilMethodTracer#dispatchBegin", 0);
            if (this.f41761i && (aVar = this.f41763k) != null) {
                try {
                    final long[] a2 = com.bytedance.apm.block.a.g.a(aVar);
                    final long j2 = com.bytedance.monitor.collector.a.f41431b;
                    k.a().p.a(new Runnable() {
                        /* class com.bytedance.p.b.c.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(25551);
                        }

                        public final void run() {
                            LinkedList linkedList = new LinkedList();
                            com.bytedance.p.a.a.a(a2, linkedList, com.bytedance.monitor.collector.a.f41431b);
                            com.bytedance.p.a.a.b(linkedList);
                            if (k.a().b() != null && linkedList.size() > 2) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        this.f41764l = str;
    }

    public c(boolean z, boolean z2) {
        this.f41765m = new long[3];
        this.f41760c = z;
        if (!z2) {
            b();
        }
        if (f41759h == null) {
            f41759h = this;
        }
    }

    @Override // com.bytedance.apm.block.d
    public final void a(boolean z, long j2, boolean z2) {
        MethodCollector.i(5914);
        a(j2);
        f41756e = z;
        f41757f = z2;
        if (z) {
            i.a(new Runnable() {
                /* class com.bytedance.p.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25549);
                }

                public final void run() {
                    c.this.a();
                }
            });
            com.bytedance.apm.block.a.g.a();
            MethodCollector.o(5914);
            return;
        }
        i.a(new Runnable() {
            /* class com.bytedance.p.b.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(25550);
            }

            public final void run() {
                f.r.b(c.this);
            }
        });
        synchronized (com.bytedance.apm.block.a.g.f24605d) {
            try {
                if (com.bytedance.apm.block.a.g.f24603b == 2) {
                    com.bytedance.apm.block.a.g.f24603b = -1;
                    com.bytedance.apm.block.a.g.f24604c = true;
                }
            } finally {
                MethodCollector.o(5914);
            }
        }
    }

    @Override // com.bytedance.apm.block.a
    public final void a(long j2, long j3, long j4, long j5, boolean z) {
        String str;
        super.a(j2, j3, j4, j5, z);
        com.bytedance.apm.block.a.g.b(1048574, com.bytedance.monitor.collector.a.f41431b);
        a aVar = this.q;
        if (aVar != null) {
            aVar.f41773b = z;
            this.q.f41772a = f.r.f24583b.a();
            b.a.f25210a.a(this.q);
            this.q = null;
        }
        if (com.bytedance.apm.block.a.g.f24603b >= 2) {
            int i2 = com.bytedance.apm.block.a.g.f24613l;
            l[] lVarArr = new l[i2];
            System.arraycopy(com.bytedance.apm.block.a.g.f24612k, 0, lVarArr, 0, com.bytedance.apm.block.a.g.f24613l);
            s += i2;
            long j6 = j4 - j2;
            if (j6 >= n) {
                d dVar = f41754b;
                if (dVar != null) {
                    dVar.a(j6, z);
                }
                b("evil_method_begin");
                long[] a2 = com.bytedance.apm.block.a.g.a(this.f41762j);
                if (a2 == null || a2.length == 0) {
                    b("evil_method_data_null");
                    return;
                }
                long[] jArr = new long[3];
                System.arraycopy(this.f41765m, 0, jArr, 0, 3);
                String a3 = com.bytedance.apm.block.g.a();
                if (TextUtils.isEmpty(a3)) {
                    str = ActivityLifeObserver.getInstance().getTopActivityClassName();
                } else {
                    str = a3 + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
                }
                this.q = new a(ActivityLifeObserver.getInstance().isForeground(), str, a2, jArr, j5 - j3, j6, j4, this.f41764l, System.currentTimeMillis(), "uuid", k.a().e(), lVarArr);
            }
        }
    }
}
