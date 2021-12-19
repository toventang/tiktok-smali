package com.ss.android.ugc.aweme.base;

import com.bytedance.apm.a;
import com.bytedance.apm.b;
import com.bytedance.apm.config.c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadFactory f68161a;

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArrayList<Runnable> f68162b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f68163c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final ExecutorService f68164d;

    static {
        Covode.recordClassIndex(41995);
        AnonymousClass1 r8 = new ThreadFactory() {
            /* class com.ss.android.ugc.aweme.base.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41996);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.i(930);
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setPriority(10);
                MethodCollector.o(930);
                return newThread;
            }
        };
        f68161a = r8;
        f68164d = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), r8, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    private static synchronized void a() {
        synchronized (o.class) {
            MethodCollector.i(940);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = f68162b;
            if (copyOnWriteArrayList != null) {
                Iterator<Runnable> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f68164d.submit(it.next());
                }
                f68162b.clear();
            }
            f68164d.submit(new Runnable() {
                /* class com.ss.android.ugc.aweme.base.o.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(41998);
                }

                public final void run() {
                    MethodCollector.i(928);
                    synchronized (o.f68163c) {
                        try {
                            if (o.f68163c.size() != 0) {
                                for (String str : o.f68163c) {
                                    o.f68164d.submit(l.a(str));
                                }
                                o.f68163c.clear();
                                try {
                                    l.f68437a.e();
                                } catch (Exception unused) {
                                }
                            }
                        } finally {
                            MethodCollector.o(928);
                        }
                    }
                }
            });
            MethodCollector.o(940);
        }
    }

    public static void a(c.a aVar) {
        a.C0521a.f24346a.a(aVar.a());
        a();
    }

    private static synchronized void a(Runnable runnable) {
        synchronized (o.class) {
            MethodCollector.i(938);
            if (!ApmDelegate.a.f25042a.f25014h || com.bytedance.framwork.core.a.a.f29387a == null) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = f68162b;
                copyOnWriteArrayList.add(runnable);
                if (copyOnWriteArrayList.size() >= 200) {
                    f68164d.submit(new Runnable() {
                        /* class com.ss.android.ugc.aweme.base.o.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(41997);
                        }

                        /* JADX WARNING: Can't wrap try/catch for region: R(7:51|50|52|53|54|74|55) */
                        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d4, code lost:
                            r0 = th;
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00c5 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final synchronized void run() {
                            /*
                            // Method dump skipped, instructions count: 240
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.o.AnonymousClass2.run():void");
                        }
                    });
                    MethodCollector.o(938);
                    return;
                }
            } else {
                f68164d.submit(runnable);
            }
            MethodCollector.o(938);
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            a(new u(str));
        } else {
            a(new p(str, jSONObject.toString()));
        }
    }

    public static void b(String str, String str2, float f2) {
        a(new r(str, str2, f2));
    }

    public static void a(String str, String str2, float f2) {
        a(new q(str, str2, f2));
    }

    public static void b(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            a(new s(str));
        } else {
            a(new t(jSONObject.toString(), str2, str));
        }
    }

    public static void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(str, i2, jSONObject, jSONObject2);
    }

    public static void a(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        com.bytedance.framwork.core.a.b.a(j2, j3, str, str2, str3, i2, jSONObject);
    }

    public static void b(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        com.bytedance.framwork.core.a.b.b(j2, j3, str, str2, str3, i2, jSONObject);
    }
}
