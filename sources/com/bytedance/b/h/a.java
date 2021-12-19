package com.bytedance.b.h;

import com.bytedance.b.k.b.b;
import com.bytedance.b.k.j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<c> f26291a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static LinkedBlockingQueue<b> f26292b = new LinkedBlockingQueue<>();

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f26293c = false;

    static {
        Covode.recordClassIndex(15257);
    }

    private static synchronized void a() {
        synchronized (a.class) {
            if (!f26293c) {
                f26293c = true;
                new Thread(new Runnable() {
                    /* class com.bytedance.b.h.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15258);
                    }

                    public final void run() {
                        while (true) {
                            j.a("APM-Consumers");
                            try {
                                b take = a.f26292b.take();
                                for (c cVar : a.f26291a) {
                                    j.a("APM-Handler");
                                    try {
                                        if (take.b()) {
                                            cVar.a(take);
                                        }
                                    } catch (Throwable th) {
                                        b.a("APM-Monitor", "monitorableHandler " + cVar + " handle monitorable " + take + "failed.", th);
                                    }
                                    j.a();
                                }
                            } catch (Throwable th2) {
                                b.a("APM", "Oh, Damn it!!!", th2);
                            }
                            j.a();
                        }
                    }
                }, "APM-Monitor").start();
            }
        }
    }

    public static void a(b bVar) {
        if (bVar != null) {
            f26292b.offer(bVar);
            if (!f26293c) {
                a();
            }
        }
    }
}
