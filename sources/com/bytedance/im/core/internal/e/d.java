package com.bytedance.im.core.internal.e;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.m;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.internal.utils.x;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public final class d<T> implements x.a, Runnable {

    /* renamed from: b  reason: collision with root package name */
    public static Map<Integer, SoftReference<d>> f38745b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public x f38746a = new x(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    private c<T> f38747c;

    /* renamed from: d  reason: collision with root package name */
    private b<T> f38748d;

    /* renamed from: e  reason: collision with root package name */
    private T f38749e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f38750f;

    /* renamed from: g  reason: collision with root package name */
    private m f38751g;

    /* renamed from: h  reason: collision with root package name */
    private long f38752h;

    /* renamed from: i  reason: collision with root package name */
    private long f38753i;

    /* renamed from: j  reason: collision with root package name */
    private long f38754j;

    /* renamed from: k  reason: collision with root package name */
    private long f38755k;

    /* renamed from: l  reason: collision with root package name */
    private long f38756l;

    /* renamed from: m  reason: collision with root package name */
    private long f38757m;
    private Throwable n;
    private Throwable o;

    static {
        Covode.recordClassIndex(23112);
    }

    private String c() {
        c<T> cVar = this.f38747c;
        if (cVar == null) {
            return "null";
        }
        return cVar.toString();
    }

    private void b() {
        if (this.f38746a != null && this.f38751g.enable == 1) {
            Message obtain = Message.obtain();
            obtain.what = 100002;
            obtain.obj = this;
            this.f38746a.sendMessageDelayed(obtain, this.f38751g.timeoutDurationMs);
        }
        try {
            Executor executor = this.f38750f;
            if (!(executor instanceof ExecutorService) || !((ExecutorService) executor).isShutdown()) {
                this.f38750f.execute(this);
            }
        } catch (Exception e2) {
            this.o = e2;
            e2.printStackTrace();
            e.a(e2);
        }
    }

    public static void a() {
        try {
            for (SoftReference<d> softReference : f38745b.values()) {
                d dVar = softReference.get();
                f.a("imsdk", "Task clean task ".concat(String.valueOf(dVar)), (Throwable) null);
                if (dVar != null) {
                    dVar.f38746a.removeMessages(100001);
                    dVar.f38746a.removeMessages(100003);
                }
            }
            f38745b.clear();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.bytedance.im.core.internal.utils.x r1 = r6.f38746a
            r0 = 100002(0x186a2, float:1.40133E-40)
            r1.removeMessages(r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.f38752h
            long r0 = r4 - r2
            r6.f38754j = r0
            com.bytedance.im.core.internal.e.c<T> r0 = r6.f38747c
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r0.a()     // Catch:{ Exception -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r0 = move-exception
            r0.printStackTrace()
            r6.n = r0
            com.bytedance.im.core.c.e.a(r0)
        L_0x0024:
            r2 = 0
        L_0x0025:
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.f38753i = r0
            long r0 = r0 - r4
            r6.f38755k = r0
            r6.f38749e = r2
            com.bytedance.im.core.internal.utils.x r0 = r6.f38746a
            if (r0 == 0) goto L_0x0044
            android.os.Message r1 = android.os.Message.obtain()
            r0 = 100001(0x186a1, float:1.40131E-40)
            r1.what = r0
            r1.obj = r6
            com.bytedance.im.core.internal.utils.x r0 = r6.f38746a
            r0.sendMessage(r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.e.d.run():void");
    }

    private static String a(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "unknown";
    }

    private void a(String str) {
        i a2 = new i().a(str);
        a(a2);
        b(a2);
        c(a2);
        a2.d();
    }

    private static String b(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 2048) {
            return stackTraceString.substring(0, 2048);
        }
        return stackTraceString;
    }

    private void b(i iVar) {
        iVar.a("wait_executor_cost", Long.valueOf(this.f38754j)).a("execute_cost", Long.valueOf(this.f38755k)).a("wait_main_thread_cost", Long.valueOf(this.f38756l)).a("execute_callback_cost", Long.valueOf(this.f38757m));
    }

    private void c(i iVar) {
        boolean z;
        String str = "1";
        if (this.n != null) {
            iVar.a("execute_error", str);
            iVar.a("error_msg", a(this.n));
            iVar.a("error_stack", b(this.n));
            z = true;
        } else {
            iVar.a("execute_error", "0");
            z = false;
        }
        if (this.o != null) {
            iVar.a("execute_callback_error", str);
            iVar.a("error_msg", a(this.o));
            iVar.a("error_stack", b(this.o));
        } else {
            iVar.a("execute_callback_error", "0");
            if (!z) {
                str = "0";
            }
        }
        iVar.a("has_error", str);
    }

    private void a(i iVar) {
        long j2;
        MethodCollector.i(11468);
        Executor executor = this.f38750f;
        long j3 = 0;
        if (executor instanceof ThreadPoolExecutor) {
            j3 = (long) ((ThreadPoolExecutor) executor).getQueue().size();
            j2 = ((ThreadPoolExecutor) this.f38750f).getTaskCount();
        } else {
            j2 = 0;
        }
        iVar.a("executor_name", a.a(this.f38750f)).a("processor_count", Integer.valueOf(Runtime.getRuntime().availableProcessors())).a("work_queue_size", Long.valueOf(j3)).a("task_count", Long.valueOf(j2)).a("task_name", c());
        MethodCollector.o(11468);
    }

    @Override // com.bytedance.im.core.internal.utils.x.a
    public final void a(Message message) {
        if (message.obj instanceof d) {
            d dVar = (d) message.obj;
            switch (message.what) {
                case 100001:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f38756l = uptimeMillis - this.f38753i;
                    if (dVar.f38748d != null) {
                        f38745b.remove(Integer.valueOf(dVar.hashCode()));
                        try {
                            dVar.f38748d.a(dVar.f38749e);
                        } catch (Exception e2) {
                            this.o = e2;
                            e2.printStackTrace();
                            e.a(e2);
                        }
                    }
                    this.f38757m = SystemClock.uptimeMillis() - uptimeMillis;
                    try {
                        if (this.f38751g.enable != 0) {
                            if (e.a(0.001f)) {
                                a("im_sdk_task_info");
                            }
                            if (this.f38755k > this.f38751g.executeTooLongMs && e.a(1.0f)) {
                                a("im_sdk_task_execute_too_long");
                            }
                            if (this.f38757m > this.f38751g.callbackTooLongMs && e.a(1.0f)) {
                                a("im_sdk_task_callback_too_long");
                            }
                            if (this.n != null && e.a(1.0f)) {
                                a("im_sdk_task_execute_error", this.n);
                            }
                            if (this.o != null && e.a(1.0f)) {
                                a("im_sdk_task_callback_error", this.o);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                case 100002:
                    this.f38746a.removeMessages(100002);
                    try {
                        if (this.f38751g.enable != 0 && e.a(1.0f)) {
                            i a2 = new i().a("im_sdk_task_wait_execute_timeout");
                            a(a2);
                            a2.d();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                case 100003:
                    b();
                    return;
                default:
                    return;
            }
        }
    }

    public static <T> void a(c<T> cVar, b<T> bVar) {
        boolean z = com.bytedance.im.core.a.d.a().f37564d;
        if (z) {
            d dVar = new d(cVar, bVar, a.a());
            dVar.b();
            f38745b.put(Integer.valueOf(dVar.hashCode()), new SoftReference<>(dVar));
            return;
        }
        f.b("imsdk", "Task execute not start, isLogin:".concat(String.valueOf(z)), (Throwable) null);
    }

    private void a(String str, Throwable th) {
        new i().a(str).a("error_msg", a(th)).a("error_stack", b(th)).a("task_name", c()).d();
    }

    public d(c<T> cVar, b<T> bVar, Executor executor) {
        this.f38747c = cVar;
        this.f38748d = bVar;
        this.f38750f = executor;
        this.f38751g = com.bytedance.im.core.a.d.a().b().ap;
        this.f38752h = SystemClock.uptimeMillis();
    }

    public static <T> void a(c<T> cVar, b<T> bVar, Executor executor) {
        boolean z = com.bytedance.im.core.a.d.a().f37564d;
        if (z) {
            new d(cVar, bVar, executor).b();
        } else {
            f.b("imsdk", "Task execute not start, isLogin:".concat(String.valueOf(z)), (Throwable) null);
        }
    }
}
