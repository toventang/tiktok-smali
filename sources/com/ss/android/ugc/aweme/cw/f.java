package com.ss.android.ugc.aweme.cw;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

final class f {

    /* renamed from: a  reason: collision with root package name */
    static ExecutorService f79122a;

    /* renamed from: b  reason: collision with root package name */
    Object f79123b;

    /* renamed from: c  reason: collision with root package name */
    public Map<b, Object> f79124c;

    /* renamed from: d  reason: collision with root package name */
    public ReentrantLock f79125d;

    static {
        Covode.recordClassIndex(49118);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static f f79142a = new f((byte) 0);

        static {
            Covode.recordClassIndex(49122);
        }
    }

    private f() {
        this.f79123b = new Object();
        this.f79125d = new ReentrantLock();
        this.f79124c = new WeakHashMap();
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79173b = "TaskMonitor";
        f79122a = g.a(a2.a());
        com.a.a("taskBlockedTimeOut=%d", new Object[]{Long.valueOf(g.f79144a.f79156f)});
        ((ScheduledExecutorService) f79122a).scheduleAtFixedRate(new b(), g.f79144a.f79156f, g.f79144a.f79156f, TimeUnit.MILLISECONDS);
    }

    class b implements Runnable {
        static {
            Covode.recordClassIndex(49123);
        }

        public final void run() {
            if (g.f79145b.c()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<b> arrayList = new ArrayList();
                f.this.f79125d.lock();
                try {
                    if (f.this.f79124c.size() <= 0) {
                        f.this.f79125d.unlock();
                        return;
                    }
                    Iterator<Map.Entry<b, Object>> it = f.this.f79124c.entrySet().iterator();
                    while (it.hasNext()) {
                        b key = it.next().getKey();
                        if (uptimeMillis - key.f79100c >= g.f79144a.f79156f) {
                            arrayList.add(key);
                            it.remove();
                        }
                    }
                    f.this.f79125d.unlock();
                    arrayList.size();
                    for (b bVar : arrayList) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String a2 = p.a(bVar.f79098a);
                            if (!g.a(a2)) {
                                jSONObject.put("task_name", a2);
                                jSONObject.put("pool_type", bVar.f79099b.f79097a.name());
                                jSONObject.put("pool_size", bVar.f79099b.getPoolSize());
                                jSONObject.put("queue_size", bVar.f79099b.getQueue().size());
                                jSONObject.put("duration", uptimeMillis - bVar.f79100c);
                                if (bVar.f79101d != null) {
                                    jSONObject.put("task_stack", p.a(bVar.f79101d.getStackTrace()));
                                }
                                g.f79145b.c(jSONObject);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    arrayList.clear();
                } catch (Exception e3) {
                    e3.printStackTrace();
                } catch (Throwable th) {
                    f.this.f79125d.unlock();
                    throw th;
                }
            }
        }

        b() {
        }
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        if (g.f79145b.c()) {
            this.f79125d.lock();
            try {
                this.f79124c.remove(bVar);
            } finally {
                this.f79125d.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        if (g.f79145b.d()) {
            final Exception exc = new Exception();
            f79122a.execute(new Runnable() {
                /* class com.ss.android.ugc.aweme.cw.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(49121);
                }

                public final void run() {
                    MethodCollector.i(6828);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Runnable runnable = runnable;
                        if (runnable instanceof b) {
                            jSONObject.put("task_name", ((b) runnable).f79098a);
                        } else {
                            jSONObject.put("task_name", runnable);
                        }
                        ThreadPoolExecutor threadPoolExecutor = threadPoolExecutor;
                        if (threadPoolExecutor instanceof a) {
                            jSONObject.put("pool_type", ((a) threadPoolExecutor).f79097a.name());
                            jSONObject.put("pool_size", threadPoolExecutor.getPoolSize());
                            jSONObject.put("task_stack", p.a((Throwable) exc));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    g.f79145b.d(jSONObject);
                    MethodCollector.o(6828);
                }
            });
        }
    }

    public static JSONObject a(WeakReference<Object> weakReference, String str, int i2, int i3, long j2) {
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a2 = p.a(obj);
            if (g.a(a2)) {
                return null;
            }
            jSONObject.put("task_name", a2);
            jSONObject.put("pool_type", str);
            jSONObject.put("pool_size", i2);
            jSONObject.put("queue_size", i3);
            jSONObject.put("duration", j2);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
