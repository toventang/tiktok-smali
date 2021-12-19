package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static c f155232a;

    /* renamed from: b  reason: collision with root package name */
    final d f155233b;

    interface c {
        static {
            Covode.recordClassIndex(103305);
        }
    }

    static {
        Covode.recordClassIndex(103302);
    }

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(103303);
        }

        public a() {
            super("vvv This is where object was created. vvv");
        }
    }

    public static class d extends PhantomReference<Object> {

        /* renamed from: d  reason: collision with root package name */
        public static ReferenceQueue<Object> f155234d = new ReferenceQueue<>();

        /* renamed from: e  reason: collision with root package name */
        public static Set<d> f155235e = Collections.synchronizedSet(new HashSet());

        /* renamed from: a  reason: collision with root package name */
        boolean f155236a = false;

        /* renamed from: b  reason: collision with root package name */
        final Class<?> f155237b;

        /* renamed from: c  reason: collision with root package name */
        final a f155238c;

        static {
            Covode.recordClassIndex(103306);
            new Thread("GcStateAssertQueue") {
                /* class com.ttnet.org.chromium.base.e.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103307);
                }

                public final void run() {
                    while (true) {
                        try {
                            d dVar = (d) d.f155234d.remove();
                            d.f155235e.remove(dVar);
                            if (!dVar.f155236a) {
                                String a2 = com.a.a("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", new Object[]{dVar.f155237b.getName()});
                                if (e.f155232a == null) {
                                    throw new b(a2, dVar.f155238c);
                                }
                            }
                        } catch (InterruptedException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }

                {
                    setDaemon(true);
                    start();
                }
            };
        }

        public d(Object obj, a aVar) {
            super(obj, f155234d);
            this.f155238c = aVar;
            this.f155237b = obj.getClass();
            f155235e.add(this);
        }
    }

    public e(d dVar) {
        this.f155233b = dVar;
    }

    public static void a(e eVar) {
        if (b.f155218a) {
            eVar.f155233b.f155236a = true;
        }
    }

    static class b extends RuntimeException {
        static {
            Covode.recordClassIndex(103304);
        }

        b(String str, Throwable th) {
            super(str, th);
        }
    }
}
