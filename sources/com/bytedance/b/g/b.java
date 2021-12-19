package com.bytedance.b.g;

import android.os.Debug;
import com.bytedance.apm.g.c;
import com.bytedance.b.g.b.a;
import com.bytedance.b.g.c;
import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final String f26260e = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f26261a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.b.g.a.a f26262b;

    /* renamed from: c  reason: collision with root package name */
    Map<Object, Object> f26263c;

    /* renamed from: d  reason: collision with root package name */
    List<Object> f26264d;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f26265f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.b.k.d.a f26266g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f26267h;

    /* renamed from: i  reason: collision with root package name */
    private long f26268i;

    /* renamed from: j  reason: collision with root package name */
    private C0559b f26269j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f26271a = new b((byte) 0);

        static {
            Covode.recordClassIndex(15251);
        }
    }

    static {
        Covode.recordClassIndex(15249);
    }

    public final boolean d() {
        com.bytedance.b.g.a.a aVar = this.f26262b;
        if (aVar == null || !aVar.f26255b) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.g.b$b  reason: collision with other inner class name */
    public class C0559b extends com.bytedance.b.j.d.b {
        static {
            Covode.recordClassIndex(15252);
        }

        @Override // com.bytedance.b.j.d.b, com.bytedance.b.j.d.c
        public final void a() {
            if (com.bytedance.b.e.a.a.r()) {
                b.this.d();
            }
            if (b.this.d()) {
                b.this.b();
            }
        }

        @Override // com.bytedance.b.j.d.b, com.bytedance.b.j.d.c
        public final void b() {
            if (com.bytedance.b.e.a.a.r()) {
                b.this.d();
            }
            if (b.this.d()) {
                b.this.c();
            }
        }

        private C0559b() {
        }

        /* synthetic */ C0559b(b bVar, byte b2) {
            this();
        }
    }

    private b() {
        this.f26269j = new C0559b(this, (byte) 0);
        this.f26264d = new CopyOnWriteArrayList();
    }

    public final synchronized void a() {
        if (!this.f26265f) {
            this.f26265f = true;
            a(((com.bytedance.b.g.a.b) com.bytedance.b.j.c.a(com.bytedance.b.g.a.b.class)).a());
        }
    }

    public final synchronized void c() {
        if (this.f26267h) {
            this.f26267h = false;
            if (this.f26266g != null) {
                com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).b(this.f26266g);
                this.f26266g = null;
            }
        }
    }

    public final synchronized void b() {
        if (!this.f26267h) {
            this.f26267h = true;
            if (this.f26266g == null) {
                this.f26266g = new com.bytedance.b.k.d.a(this.f26268i) {
                    /* class com.bytedance.b.g.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15250);
                    }

                    public final void run() {
                        double d2;
                        boolean z;
                        b bVar = b.this;
                        long currentTimeMillis = System.currentTimeMillis();
                        c cVar = c.a.f26290a;
                        com.bytedance.b.g.a.a aVar = bVar.f26262b;
                        Debug.MemoryInfo e2 = c.e();
                        if (e2 != null) {
                            long j2 = ((long) e2.dalvikPss) * 1024;
                            if (j2 >= 0) {
                                com.bytedance.b.j.d.a aVar2 = (com.bytedance.b.j.d.a) com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class);
                                long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                                if (freeMemory > 0) {
                                    d2 = new BigDecimal(freeMemory).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, 4).doubleValue();
                                } else {
                                    d2 = -1.0d;
                                }
                                long a2 = cVar.a();
                                long b2 = cVar.b();
                                long c2 = cVar.c();
                                long d3 = cVar.d();
                                boolean z2 = !aVar2.a();
                                long j3 = ((long) e2.nativePss) * 1024;
                                long totalPss = ((long) e2.getTotalPss()) * 1024;
                                long a3 = c.a(e2);
                                long a4 = d.a() * 1024;
                                if (a4 <= 0) {
                                    a4 = -1;
                                }
                                if (d2 > aVar.a()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a aVar3 = new a(a2, b2, c2, d3, z2, j3, totalPss, freeMemory, j2, a3, a4, d2, z, aVar.f26256c);
                                aVar3.n = bVar.f26263c;
                                bVar.f26263c = null;
                                if (com.bytedance.b.e.a.a.r()) {
                                    com.a.a("collect[isUploadEnable=%s cost=%s]: %s", new Object[]{Boolean.valueOf(bVar.f26262b.f26257d), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), aVar3.c().toString()});
                                }
                                if (bVar.f26262b.f26257d) {
                                    com.bytedance.b.h.a.a(aVar3);
                                } else if (com.bytedance.apm.h.a.f24995b) {
                                    aVar3.c();
                                }
                                if (aVar3.f26283l > bVar.f26262b.a() && bVar.f26261a != null) {
                                    com.bytedance.apm.g.c cVar2 = bVar.f26261a;
                                }
                                if (bVar.f26264d != null && bVar.f26264d.size() > 0) {
                                    try {
                                        Iterator<Object> it = bVar.f26264d.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                };
                com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(this.f26266g);
            }
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final synchronized void a(com.bytedance.b.g.a.a aVar) {
        if (aVar != null) {
            this.f26262b = aVar;
            if (!aVar.f26258e) {
                c();
                com.bytedance.b.j.d.a aVar2 = (com.bytedance.b.j.d.a) com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class);
                if (aVar2 != null) {
                    aVar2.b(this.f26269j);
                }
                return;
            }
            com.bytedance.b.j.d.a aVar3 = (com.bytedance.b.j.d.a) com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class);
            if (aVar3 != null) {
                if (aVar.f26255b) {
                    aVar3.b(this.f26269j);
                    aVar3.a(this.f26269j);
                } else {
                    aVar3.b(this.f26269j);
                }
            }
            long j2 = aVar.f26254a * 1000;
            this.f26268i = j2;
            if (j2 < 30000) {
                this.f26268i = 30000;
            }
            com.bytedance.b.k.d.a aVar4 = this.f26266g;
            if (!(aVar4 == null || aVar4.f26321g == this.f26268i)) {
                c();
            }
            b();
            a aVar5 = (a) com.bytedance.b.j.c.a(a.class);
            if (aVar5 != null) {
                aVar5.a();
            }
        }
    }
}
