package com.bytedance.b.c.a;

import com.bytedance.apm.q.b;
import com.bytedance.b.c.a.a;
import com.bytedance.b.k.d.c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static List<e> f26028a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f26029b = false;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, a> f26030c = new HashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f26035a;

        /* renamed from: b  reason: collision with root package name */
        public long f26036b;

        /* renamed from: c  reason: collision with root package name */
        public long f26037c;

        static {
            Covode.recordClassIndex(15161);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(15159);
    }

    public static synchronized void a() {
        synchronized (f.class) {
            f26029b = true;
            if (!f26028a.isEmpty()) {
                for (e eVar : f26028a) {
                    com.bytedance.b.h.a.a(eVar);
                }
                f26028a.clear();
            }
        }
    }

    public static synchronized void a(String str) {
        synchronized (f.class) {
            a aVar = new a((byte) 0);
            aVar.f26035a = System.currentTimeMillis();
            aVar.f26036b = b.c();
            aVar.f26037c = b.b();
            f26030c.put(str, aVar);
        }
    }

    public static synchronized void b(String str) {
        synchronized (f.class) {
            a aVar = f26030c.get(str);
            if (aVar != null) {
                if (aVar.f26036b >= 0 || aVar.f26037c >= 0) {
                    long c2 = b.c();
                    long b2 = b.b();
                    double d2 = -1.0d;
                    if (b2 - aVar.f26037c > 0) {
                        double d3 = (double) c2;
                        double d4 = (double) aVar.f26036b;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        double d5 = d3 - d4;
                        double d6 = (double) (b2 - aVar.f26037c);
                        Double.isNaN(d6);
                        d2 = d5 / d6;
                    }
                    double d7 = (double) c2;
                    double d8 = (double) aVar.f26036b;
                    Double.isNaN(d7);
                    Double.isNaN(d8);
                    double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f26035a);
                    Double.isNaN(currentTimeMillis);
                    double d9 = ((d7 - d8) * 1000.0d) / currentTimeMillis;
                    double g2 = (double) b.g();
                    Double.isNaN(g2);
                    f26030c.remove(str);
                    com.bytedance.b.k.d.b.a(c.LIGHT_WEIGHT).a(new com.bytedance.b.k.d.a(false, str, d2, d9 / g2) {
                        /* class com.bytedance.b.c.a.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ boolean f26031a = false;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f26032b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ double f26033c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ double f26034d;

                        static {
                            Covode.recordClassIndex(15160);
                        }

                        public final void run() {
                            a.EnumC0556a aVar;
                            if (!this.f26031a) {
                                aVar = a.EnumC0556a.FRONT;
                            } else {
                                aVar = a.EnumC0556a.BACK;
                            }
                            e eVar = new e(aVar, this.f26032b, this.f26033c, 0.0d, this.f26034d, 0.0d, null);
                            eVar.f26017a = false;
                            if (f.f26029b) {
                                com.bytedance.b.h.a.a(eVar);
                            } else {
                                f.f26028a.add(eVar);
                            }
                        }

                        {
                            this.f26032b = r3;
                            this.f26033c = r4;
                            this.f26034d = r6;
                        }
                    });
                }
            }
        }
    }
}
