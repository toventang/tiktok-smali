package com.bytedance.apm.block;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.h;
import com.bytedance.apm.k.f;
import com.bytedance.apm.p.b;
import com.bytedance.apm.p.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.a;
import com.bytedance.monitor.collector.g;
import com.bytedance.monitor.collector.k;
import com.bytedance.monitor.collector.m;
import com.bytedance.monitor.collector.o;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    /* renamed from: e  reason: collision with root package name */
    public static long f24665e = 1000;

    /* renamed from: f  reason: collision with root package name */
    static boolean f24666f;
    private static boolean u;
    private static volatile i v;

    /* renamed from: a  reason: collision with root package name */
    public d f24667a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f24668b;

    /* renamed from: c  reason: collision with root package name */
    public long f24669c = 2500;

    /* renamed from: d  reason: collision with root package name */
    public long f24670d = 5000;

    /* renamed from: g  reason: collision with root package name */
    boolean f24671g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24672h = true;

    /* renamed from: i  reason: collision with root package name */
    public final String f24673i = i.class.getName();

    /* renamed from: j  reason: collision with root package name */
    public final StringBuilder f24674j = new StringBuilder(1200);

    /* renamed from: k  reason: collision with root package name */
    final StringBuilder f24675k = new StringBuilder(1200);

    /* renamed from: l  reason: collision with root package name */
    public c f24676l;

    /* renamed from: m  reason: collision with root package name */
    c f24677m = null;
    public volatile boolean n = false;
    public volatile boolean o = false;
    public boolean p = true;
    public boolean q = true;
    public LinkedList<com.bytedance.apm.c.b.d> r = new LinkedList<>();
    final Runnable s = new Runnable() {
        /* class com.bytedance.apm.block.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14503);
        }

        public final void run() {
            if (i.this.f24676l != null) {
                try {
                    i.this.f24676l.b();
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(i.this.f24673i)) {
                        i.this.f24676l.n = System.currentTimeMillis();
                        i.this.f24676l.p = stackTrace;
                        if (c.e()) {
                            new TimeoutException("main thread task execute more than " + i.this.f24669c + "ms").setStackTrace(stackTrace);
                        }
                        i.this.f24674j.setLength(0);
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            i.this.f24674j.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                        }
                        i.this.f24676l.r = i.this.f24674j.toString();
                    }
                } catch (Throwable th) {
                    h.b.f24998a.a(th, "block_deal_exception");
                }
            }
        }
    };
    final Runnable t = new Runnable() {
        /* class com.bytedance.apm.block.i.AnonymousClass2 */

        static {
            Covode.recordClassIndex(14504);
        }

        public final void run() {
            try {
                if (i.this.f24676l != null) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(i.this.f24673i)) {
                        i.this.f24676l.o = System.currentTimeMillis();
                        i.this.f24676l.q = stackTrace;
                        c cVar = i.this.f24676l;
                        f.a();
                        cVar.v = f.b();
                        i.this.f24676l.w = i.b();
                        i.this.f24676l.f24654j = true;
                    }
                }
            } catch (Throwable th) {
                h.b.f24998a.a(th, "serious_block_deal_exception");
            }
        }
    };

    public final void a(boolean z) {
        Message a2;
        try {
            if (this.f24667a.a()) {
                c cVar = this.f24677m;
                if (cVar != null) {
                    if (z) {
                        cVar.f24650f = true;
                    }
                    c(this.f24677m);
                    this.f24677m = null;
                }
                c cVar2 = this.f24676l;
                if (cVar2 != null && cVar2.f24651g >= 0) {
                    if (this.f24676l.f24652h == -1) {
                        this.f24676l.f24652h = a.f41431b;
                        if (this.f24672h) {
                            this.f24667a.b(this.s);
                            this.f24667a.b(this.t);
                        }
                        if (this.f24676l.f24652h - this.f24676l.f24651g > this.f24669c) {
                            d(this.f24676l);
                            this.f24676l.f24653i = System.currentTimeMillis();
                            if (!this.f24672h) {
                                this.f24676l.f24657m = true;
                            }
                            this.f24676l.f24648d = z;
                            this.f24676l.f24647c = this.n;
                            a(this.f24676l.a());
                            if (this.f24676l.f24652h - this.f24676l.f24651g > this.f24670d && z && this.o) {
                                h.a();
                            }
                        }
                        if (u && this.f24676l.f24652h - this.f24676l.f24651g > f24665e) {
                            if (TextUtils.isEmpty(this.f24676l.t)) {
                                d(this.f24676l);
                            }
                            if (this.f24676l.f24653i == 0) {
                                this.f24676l.f24653i = System.currentTimeMillis();
                            }
                            a(z, this.f24676l.a());
                        }
                        if (f24666f && (a2 = com.bytedance.monitor.collector.i.a(com.bytedance.monitor.collector.i.a())) != null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (a2.getTarget() != null && a2.getWhen() < uptimeMillis) {
                                this.f24671g = true;
                                this.f24676l.a(uptimeMillis, null);
                                this.f24667a.a(this.s, this.f24669c);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.apm.c.b.d dVar) {
        while (this.r.size() != 0) {
            if (dVar.f24739c - this.r.getFirst().f24739c >= 0 && dVar.f24739c - this.r.getFirst().f24739c <= 60000) {
                if (((long) this.r.size()) <= 60) {
                    break;
                }
                this.r.removeFirst();
            } else {
                this.r.removeFirst();
            }
        }
        this.r.addLast(dVar);
    }

    static {
        Covode.recordClassIndex(14502);
    }

    static i a() {
        if (v == null) {
            synchronized (i.class) {
                if (v == null) {
                    v = new i();
                }
            }
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        long j2 = this.f24670d;
        long j3 = this.f24669c;
        if (j2 < j3) {
            this.f24670d = j3 + 50;
        }
    }

    private i() {
    }

    public static JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = c.f24685a;
            if (context != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a(context, "activity")).getMemoryInfo(memoryInfo);
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", com.bytedance.common.c.c.f26746a.a(memoryInfo));
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private void c(final c cVar) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.block.i.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14505);
            }

            public final void run() {
                boolean z;
                String sb;
                if (cVar.f24652h - cVar.f24651g > i.this.f24670d && com.bytedance.apm.n.c.e("serious_block_monitor")) {
                    i.this.f24676l.x = k.a().a(cVar.f24651g, cVar.f24652h);
                }
                if (cVar.f24656l || cVar.r == null || cVar.f24657m) {
                    cVar.r = "Invalid Stack\n";
                }
                if (cVar.f24652h - cVar.f24651g <= i.this.f24670d || cVar.f24654j || !i.this.f24672h) {
                    z = false;
                } else {
                    cVar.w = i.b();
                    c cVar = cVar;
                    f.a();
                    cVar.v = f.b();
                    cVar.f24654j = true;
                    z = true;
                }
                try {
                    String a2 = o.a(cVar.f24646b);
                    i iVar = i.this;
                    boolean z2 = cVar.f24648d;
                    c cVar2 = cVar;
                    if (iVar.p) {
                        JSONObject b2 = i.b(cVar2);
                        b2.put("stack", cVar2.r);
                        b2.put("message", a2);
                        b2.put("ignore_stack", iVar.f24676l.f24657m);
                        b2.put("event_type", "lag");
                        b2.put("filters", i.a(z2, cVar2, a2));
                        com.bytedance.apm.c.b.d dVar = new com.bytedance.apm.c.b.d("block_monitor", b2, cVar2.f24651g);
                        iVar.a(dVar);
                        com.bytedance.apm.c.a.a.b().a(dVar);
                    }
                    if (cVar.f24654j) {
                        try {
                            if (i.this.f24668b && i.this.f24672h) {
                                i iVar2 = i.this;
                                c cVar3 = cVar;
                                if (iVar2.q) {
                                    JSONObject a3 = i.a(cVar3.f24648d, cVar3, a2);
                                    a3.put("sbuuid", "empty");
                                    JSONObject b3 = i.b(cVar3);
                                    b3.put("message", a2);
                                    if (!(cVar3.p == null || cVar3.q == null)) {
                                        int length = cVar3.p.length;
                                        int length2 = cVar3.q.length;
                                        int i2 = 0;
                                        int i3 = 0;
                                        while (true) {
                                            if (i2 >= Math.min(length, length2)) {
                                                break;
                                            }
                                            int i4 = (length - i2) - 1;
                                            int i5 = (length2 - i2) - 1;
                                            if (!cVar3.p[i4].equals(cVar3.q[i5])) {
                                                StackTraceElement stackTraceElement = cVar3.p[i4];
                                                StackTraceElement stackTraceElement2 = cVar3.q[i5];
                                                if (stackTraceElement == stackTraceElement2 || (stackTraceElement != null && stackTraceElement2 != null && stackTraceElement.getClassName().equals(stackTraceElement2.getClassName()) && i.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && i.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()))) {
                                                    i3++;
                                                }
                                            } else {
                                                i3++;
                                                i2++;
                                            }
                                        }
                                        if (i3 == 0) {
                                            a3.put("serious_stack_coincide", "none");
                                        } else if (i3 == length && i3 == length2) {
                                            a3.put("serious_stack_coincide", "full");
                                        } else {
                                            a3.put("serious_stack_coincide", "part");
                                            iVar2.f24675k.setLength(0);
                                            for (int i6 = 0; i6 <= length - i3; i6++) {
                                                iVar2.f24675k.append("\tat ").append(cVar3.p[i6].getClassName()).append(".").append(cVar3.p[i6].getMethodName()).append("(").append(cVar3.p[i6].getFileName()).append(":").append(cVar3.p[i6].getLineNumber()).append(")\n");
                                            }
                                            b3.put("stack1", iVar2.f24675k.toString());
                                            iVar2.f24675k.setLength(0);
                                            for (int i7 = 0; i7 <= length2 - i3; i7++) {
                                                iVar2.f24675k.append("\tat ").append(cVar3.q[i7].getClassName()).append(".").append(cVar3.q[i7].getMethodName()).append("(").append(cVar3.q[i7].getFileName()).append(":").append(cVar3.q[i7].getLineNumber()).append(")\n");
                                            }
                                            b3.put("stack2", iVar2.f24675k.toString());
                                        }
                                        iVar2.f24675k.setLength(0);
                                        while (i3 > 0) {
                                            int i8 = length - i3;
                                            iVar2.f24675k.append("\tat ").append(cVar3.p[i8].getClassName()).append(".").append(cVar3.p[i8].getMethodName()).append("(").append(cVar3.p[i8].getFileName()).append(":").append(cVar3.p[i8].getLineNumber()).append(")\n");
                                            i3--;
                                        }
                                        if (iVar2.f24675k.length() == 0) {
                                            sb = cVar3.r;
                                        } else {
                                            sb = iVar2.f24675k.toString();
                                        }
                                        b3.put("stack", sb);
                                        a3.put("sbuuid", cVar3.s);
                                    }
                                    b3.put("stack_cost", cVar3.o - cVar3.n);
                                    b3.put("filters", a3);
                                    b3.put("event_type", "serious_lag");
                                    b3.put("block_looper_info", cVar3.u);
                                    b3.put("block_cpu_info", cVar3.v);
                                    b3.put("block_memory_info", cVar3.w);
                                    b3.put("custom", cVar3.x);
                                    b3.put("block_error_info", z);
                                    com.bytedance.apm.c.b.d dVar2 = new com.bytedance.apm.c.b.d("serious_block_monitor", b3, cVar3.f24651g);
                                    iVar2.a(dVar2);
                                    com.bytedance.apm.c.a.a.b().a(dVar2);
                                }
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    c cVar4 = cVar;
                    if (PerfConfig.f24342a) {
                        JSONObject b4 = i.b(cVar4);
                        JSONObject a4 = com.bytedance.b.i.a.c.a().a(true);
                        a4.put("crash_section", c.a(cVar4.f24653i));
                        a4.put("belong_frame", String.valueOf(cVar4.f24648d));
                        a4.put("belong_dump", String.valueOf(cVar4.f24647c));
                        a4.put("block_stack_type", "messageKey");
                        b4.put("filters", a4);
                        b4.put("event_type", "lag");
                        b4.put("stack", "at " + a2 + ".*(a.java:-1)");
                        com.bytedance.apm.c.b.d dVar3 = new com.bytedance.apm.c.b.d("block_monitor", b4);
                        dVar3.f24738b = true;
                        com.bytedance.apm.c.a.a.b().a(dVar3);
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    static JSONObject b(c cVar) {
        long j2 = cVar.f24652h - cVar.f24651g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", cVar.f24653i);
            jSONObject.put("crash_time", cVar.f24653i);
            jSONObject.put("is_main_process", c.b());
            jSONObject.put("process_name", c.a());
            jSONObject.put("block_duration", j2);
            jSONObject.put("last_scene", cVar.t);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static void d(c cVar) {
        String a2 = g.a();
        if (TextUtils.isEmpty(a2)) {
            cVar.t = ActivityLifeObserver.getInstance().getTopActivityClassName();
        } else {
            cVar.t = a2 + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
    }

    private static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            return stackTraceElementArr;
        }
        return new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", "a", "a.java", 1)};
    }

    public final void a(long j2) {
        if (j2 < 70) {
            j2 = 2500;
        }
        this.f24669c = j2;
        c();
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar) {
        boolean z;
        StackTraceElement[] stackTraceElementArr;
        if (cVar != null) {
            if (!cVar.f24645a) {
                cVar.b();
            }
            if (cVar.f24652h - cVar.f24651g >= this.f24670d) {
                z = true;
            } else {
                z = false;
            }
            cVar.f24654j = z;
            g.e e2 = k.a().e();
            if (e2 != null) {
                StackTraceElement[] a2 = a(cVar.p);
                if (cVar.f24654j) {
                    stackTraceElementArr = a(cVar.q);
                } else {
                    stackTraceElementArr = null;
                }
                e2.a("uuid", a2, stackTraceElementArr, null);
            }
            if (cVar.f24655k) {
                c(cVar);
            } else {
                this.f24677m = cVar;
            }
        }
    }

    private void a(final boolean z, final c cVar) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.block.i.AnonymousClass4 */

            static {
                Covode.recordClassIndex(14506);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                k a2 = k.a();
                if (a2.n == null || a2.f41550f) {
                    str = null;
                } else {
                    str = a2.n.a();
                }
                StringBuilder sb = new StringBuilder();
                long j2 = cVar.f24652h - cVar.f24651g;
                if (!TextUtils.isEmpty(str)) {
                    String a3 = m.a(str, sb, j2);
                    if (c.e()) {
                        com.bytedance.apm.h.f.b("%s", str);
                    }
                    try {
                        jSONObject.put("stack", sb.toString());
                        jSONObject.put("stack_key", a3);
                        jSONObject.put("scene", cVar.t);
                        jSONObject.put("cost_time", j2);
                        jSONObject.put("method_time", j2);
                        jSONObject.put("monitor_type", "sampling");
                        jSONObject.put("message", o.a(cVar.f24646b));
                        jSONObject.put("event_type", "lag_drop_frame");
                        JSONObject a4 = com.bytedance.b.i.a.c.a().a(true);
                        a4.put("crash_section", c.a(i.this.f24676l.f24653i));
                        a4.put("belong_frame", String.valueOf(z));
                        a4.put("monitor_type", "sample");
                        jSONObject.put("filters", a4);
                        com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.d("drop_frame_stack", jSONObject));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    static JSONObject a(boolean z, c cVar, String str) {
        JSONObject a2 = com.bytedance.b.i.a.c.a().a(true);
        a2.put("crash_section", c.a(cVar.f24653i));
        a2.put("belong_frame", String.valueOf(z));
        a2.put("belong_dump", String.valueOf(cVar.f24647c));
        a2.put("block_input", String.valueOf(cVar.f24649e));
        a2.put("block_frame", String.valueOf(cVar.f24650f));
        a2.put("block_message", str);
        a2.put("block_stack_type", "stack");
        a2.put("buuid", cVar.s);
        a2.put("belong_poll_once", String.valueOf(cVar.f24655k));
        return a2;
    }
}
