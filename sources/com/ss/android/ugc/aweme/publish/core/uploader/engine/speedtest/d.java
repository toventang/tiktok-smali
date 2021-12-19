package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.bv;
import com.ss.android.ugc.aweme.property.er;
import com.ss.android.ugc.aweme.property.es;
import com.ss.android.ugc.aweme.property.et;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.tools.utils.q;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.f.b.l;
import h.f.b.m;
import h.n;
import h.z;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118678a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final b f118679b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final int f118680c = k.a();

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public f.a.b.b f118681a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.uploader.b.a f118682b;

        /* renamed from: c  reason: collision with root package name */
        public final h f118683c = new h(er.a(), (byte) 0);

        /* renamed from: d  reason: collision with root package name */
        private a f118684d = new a.e(this);

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$d  reason: collision with other inner class name */
        public final /* synthetic */ class RunnableC3042d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f118701a;

            static {
                Covode.recordClassIndex(77116);
            }

            RunnableC3042d(h.f.a.a aVar) {
                this.f118701a = aVar;
            }

            public final /* synthetic */ void run() {
                l.b(this.f118701a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(77092);
        }

        public static abstract class a {

            /* renamed from: a  reason: collision with root package name */
            public final b f118685a;

            static {
                Covode.recordClassIndex(77093);
            }

            public void a() {
                e();
            }

            public void b() {
                e();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b  reason: collision with other inner class name */
            public static abstract class AbstractC3037b extends a {
                static {
                    Covode.recordClassIndex(77096);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a() {
                    this.f118685a.f();
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b$a  reason: collision with other inner class name */
                public static final class C3038a extends AbstractC3037b {

                    /* renamed from: b  reason: collision with root package name */
                    public final i f118687b;

                    static {
                        Covode.recordClassIndex(77097);
                    }

                    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                    public final String e() {
                        return "Cancel";
                    }

                    public final String toString() {
                        return "Cancel:" + this.f118687b;
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3038a(b bVar, i iVar) {
                        super(bVar, (byte) 0);
                        l.d(bVar, "");
                        this.f118687b = iVar;
                    }
                }

                private AbstractC3037b(b bVar) {
                    super(bVar, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b$b  reason: collision with other inner class name */
                public static final class C3039b extends AbstractC3037b {
                    static {
                        Covode.recordClassIndex(77098);
                    }

                    public final String toString() {
                        return "Failed";
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3039b(b bVar) {
                        super(bVar, (byte) 0);
                        l.d(bVar, "");
                    }
                }

                public /* synthetic */ AbstractC3037b(b bVar, byte b2) {
                    this(bVar);
                }
            }

            public static final class c extends a {

                /* renamed from: b  reason: collision with root package name */
                public final i f118688b;

                static {
                    Covode.recordClassIndex(77099);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final String e() {
                    return "FastResult";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void b() {
                    this.f118685a.a(this.f118688b);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void c() {
                    q.b("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                    com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                }

                public final String toString() {
                    return "FastResult:" + this.f118688b;
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a(C3035a aVar) {
                    l.d(aVar, "");
                    this.f118685a.b(aVar);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a(c cVar) {
                    l.d(cVar, "");
                    this.f118685a.a((a) cVar);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(b bVar, i iVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                    l.d(iVar, "");
                    this.f118688b = iVar;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$d  reason: collision with other inner class name */
            public static final class C3040d extends a {
                static {
                    Covode.recordClassIndex(77100);
                }

                public final String toString() {
                    return "Invalid";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a() {
                    this.f118685a.f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3040d(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }
            }

            public static final class e extends a {
                static {
                    Covode.recordClassIndex(77101);
                }

                public final String toString() {
                    return "New";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a() {
                    this.f118685a.f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public e(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }
            }

            public static final class f extends a {
                static {
                    Covode.recordClassIndex(77102);
                }

                public final String toString() {
                    return "Running";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void b() {
                    this.f118685a.a((i) null);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void d() {
                    this.f118685a.a(new AbstractC3037b.C3039b(this.f118685a));
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void c() {
                    q.b("BDUploadSpeedProbe : ".concat("invalid on running"));
                    com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("invalid on running"));
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public f(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a(C3035a aVar) {
                    l.d(aVar, "");
                    this.f118685a.b(aVar);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a(c cVar) {
                    l.d(cVar, "");
                    this.f118685a.a((a) cVar);
                }
            }

            public void d() {
                a("failed on not running");
            }

            public String e() {
                return toString();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$a  reason: collision with other inner class name */
            public static final class C3035a extends a {

                /* renamed from: b  reason: collision with root package name */
                public final i f118686b;

                static {
                    Covode.recordClassIndex(77094);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final String e() {
                    return "Complete";
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$a$a  reason: collision with other inner class name */
                static final class C3036a extends m implements h.f.a.a<z> {
                    final /* synthetic */ C3035a this$0;

                    static {
                        Covode.recordClassIndex(77095);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3036a(C3035a aVar) {
                        super(0);
                        this.this$0 = aVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f118685a.f();
                        return z.f158842a;
                    }
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.a
                public final void a() {
                    h hVar;
                    hVar.a((h) this.f118685a.f118683c.f118706c, (h.f.a.a) new C3036a(this));
                }

                public final String toString() {
                    return "Complete:" + this.f118686b;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3035a(b bVar, i iVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                    l.d(iVar, "");
                    this.f118686b = iVar;
                }
            }

            public void c() {
                this.f118685a.a(new C3040d(this.f118685a));
            }

            private a(b bVar) {
                this.f118685a = bVar;
            }

            public void a(C3035a aVar) {
                l.d(aVar, "");
                a("complete on not running or fast result");
            }

            private static void a(String str) {
                q.b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
                com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }

            public void a(c cVar) {
                l.d(cVar, "");
                a("fastResult on not running");
            }

            public /* synthetic */ a(b bVar, byte b2) {
                this(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$b  reason: collision with other inner class name */
        public static final class C3041b extends m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(77103);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3041b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                f.a.b.b bVar = this.this$0.f118681a;
                if (bVar != null) {
                    bVar.dispose();
                }
                return z.f158842a;
            }
        }

        public final synchronized void b() {
            MethodCollector.i(12319);
            this.f118684d.a();
            MethodCollector.o(12319);
        }

        public final synchronized void c() {
            MethodCollector.i(12320);
            this.f118684d.b();
            MethodCollector.o(12320);
        }

        public final synchronized void d() {
            MethodCollector.i(12321);
            this.f118684d.c();
            MethodCollector.o(12321);
        }

        public final synchronized void e() {
            MethodCollector.i(12324);
            this.f118684d.d();
            MethodCollector.o(12324);
        }

        public final void f() {
            a(new a.f(this));
            a(new c(this));
        }

        /* access modifiers changed from: package-private */
        public static final class c extends m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(77104);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                final AnonymousClass2 r0 = new h.f.a.b<com.ss.android.ugc.aweme.publish.f.d, t<i>>(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass2 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(77108);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* renamed from: a */
                    public final t<i> invoke(final com.ss.android.ugc.aweme.publish.f.d dVar) {
                        l.d(dVar, "");
                        t<i> a2 = t.a(new w(this) {
                            /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f118692a;

                            static {
                                Covode.recordClassIndex(77109);
                            }

                            {
                                this.f118692a = r1;
                            }

                            @Override // f.a.w
                            public final void subscribe(final v<i> vVar) {
                                l.d(vVar, "");
                                com.ss.android.ugc.aweme.uploader.b.a aVar = this.f118692a.this$0.this$0.f118682b;
                                if (aVar != null) {
                                    b.a("restart speedProbe, may close anr");
                                    aVar.c();
                                }
                                final long currentTimeMillis = System.currentTimeMillis();
                                com.ss.android.ugc.aweme.uploader.b.a d2 = g.a().o().j().d();
                                d2.a(dVar);
                                d2.a(new com.ss.android.ugc.aweme.uploader.b.b(this) {
                                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f118694a;

                                    static {
                                        Covode.recordClassIndex(77110);
                                    }

                                    @Override // com.ss.android.ugc.aweme.uploader.b.b
                                    public final int a() {
                                        com.ss.android.ugc.aweme.publish.f.g gVar = dVar.f118722a;
                                        if (gVar != null) {
                                            l.b(gVar, "");
                                            return com.ss.android.ugc.aweme.shortvideo.upload.b.a(gVar, "BDUploadSpeedProbe");
                                        }
                                        throw new IllegalArgumentException("upload video config is null");
                                    }

                                    {
                                        this.f118694a = r1;
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.v */
                                    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.ss.android.ugc.aweme.uploader.b.b
                                    public final void a(int i2, int i3, String str) {
                                        boolean z;
                                        boolean z2;
                                        l.d(str, "");
                                        boolean z3 = false;
                                        if (!(i2 == 0 || i2 == 1)) {
                                            if (i2 == 2 || i2 == 3) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (i2 == 4) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                                if (i2 == 5) {
                                                    z3 = true;
                                                }
                                            }
                                            if (0 == 0) {
                                                if (z2 || z3) {
                                                    vVar.a(new i((long) i3, str, false, currentTimeMillis, System.currentTimeMillis()));
                                                    return;
                                                } else if (z) {
                                                    vVar.b(new j());
                                                    return;
                                                } else {
                                                    b.a("error vidContextType onSpeedVidContext");
                                                    return;
                                                }
                                            }
                                        }
                                        vVar.a(new i((long) i3, str, true, currentTimeMillis, System.currentTimeMillis()));
                                        vVar.a();
                                    }
                                });
                                int a2 = et.a();
                                int a3 = es.a();
                                int a4 = k.a();
                                b.a("startSpeedTest size:" + a2 + " retryCount:" + a3 + " mode:" + a4 + " singleHostTotalTimeout:" + l.a(), false);
                                d2.d();
                                d2.a();
                                this.f118692a.this$0.this$0.f118682b = d2;
                            }
                        });
                        l.b(a2, "");
                        return a2;
                    }
                };
                final AnonymousClass3 r4 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass3 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(77111);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        a();
                        return z.f158842a;
                    }

                    public final void a() {
                        b.a("close speedProbe start", true);
                        com.ss.android.ugc.aweme.uploader.b.a aVar = this.this$0.this$0.f118682b;
                        if (aVar != null) {
                            aVar.b();
                        }
                        com.ss.android.ugc.aweme.uploader.b.a aVar2 = this.this$0.this$0.f118682b;
                        if (aVar2 != null) {
                            aVar2.c();
                        }
                        this.this$0.this$0.f118682b = null;
                        b.a("close speedProbe finish", true);
                    }
                };
                this.this$0.f118681a = AnonymousClass1.a().a((f.a.d.g<? super com.ss.android.ugc.aweme.publish.f.d, ? extends x<? extends R>>) new f.a.d.g() {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(77112);
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        com.ss.android.ugc.aweme.publish.f.d dVar = (com.ss.android.ugc.aweme.publish.f.d) obj;
                        l.d(dVar, "");
                        return r0.invoke(dVar);
                    }
                }, false).a(new f.a.d.a() {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(77113);
                    }

                    @Override // f.a.d.a
                    public final void a() {
                        r4.a();
                    }
                }).a(new f(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass6 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f118699a;

                    static {
                        Covode.recordClassIndex(77114);
                    }

                    {
                        this.f118699a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        i iVar = (i) obj;
                        if (iVar.f118710c) {
                            b bVar = this.f118699a.this$0;
                            b bVar2 = this.f118699a.this$0;
                            l.b(iVar, "");
                            bVar.a(new a.C3035a(bVar2, iVar));
                            return;
                        }
                        b bVar3 = this.f118699a.this$0;
                        b bVar4 = this.f118699a.this$0;
                        l.b(iVar, "");
                        bVar3.a(new a.c(bVar4, iVar));
                    }
                }, new f(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d.b.c.AnonymousClass7 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f118700a;

                    static {
                        Covode.recordClassIndex(77115);
                    }

                    {
                        this.f118700a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f118700a.this$0.e();
                    }
                });
                return z.f158842a;
            }
        }

        public final synchronized a a() {
            a aVar;
            MethodCollector.i(12182);
            aVar = this.f118684d;
            MethodCollector.o(12182);
            return aVar;
        }

        private static void a(h.f.a.a<z> aVar) {
            com.ss.android.ugc.aweme.cw.g.e().execute(new RunnableC3042d(aVar));
        }

        public final void b(a.C3035a aVar) {
            this.f118683c.f118705a = System.currentTimeMillis();
            a((a) aVar);
        }

        public static void a(String str) {
            q.b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }

        public final synchronized void a(a.C3035a aVar) {
            MethodCollector.i(12323);
            this.f118684d.a(aVar);
            MethodCollector.o(12323);
        }

        public final synchronized void a(a.c cVar) {
            MethodCollector.i(12322);
            this.f118684d.a(cVar);
            MethodCollector.o(12322);
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            a(this.f118684d.e() + " change to " + aVar, true);
            this.f118684d = aVar;
        }

        public final void a(i iVar) {
            a(new a.AbstractC3037b.C3038a(this, iVar));
            a(new C3041b(this));
        }

        public static void a(String str, boolean z) {
            if (z) {
                q.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(77090);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77091);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final void c() {
        a("call cancel", false);
        this.f118679b.c();
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final boolean d() {
        a("call invalid", true);
        if (this.f118680c == 1) {
            a("client route mode not need invalid context", true);
            return false;
        }
        this.f118679b.d();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final void a() {
        if (bv.a() && !g.a().A().a()) {
            a("call start", false);
            this.f118679b.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final UploadSpeedInfo b() {
        UploadSpeedInfo uploadSpeedInfo;
        c();
        b.a a2 = this.f118679b.a();
        if (a2 instanceof b.a.C3035a) {
            uploadSpeedInfo = c.a(((b.a.C3035a) a2).f118686b);
        } else if (a2 instanceof b.a.e) {
            uploadSpeedInfo = new UploadSpeedInfo(-6, null, 0, 0, 0, 30, null);
        } else if (a2 instanceof b.a.C3040d) {
            uploadSpeedInfo = new UploadSpeedInfo(-7, null, 0, 0, 0, 30, null);
        } else if (a2 instanceof b.a.AbstractC3037b.C3038a) {
            b.a.AbstractC3037b.C3038a aVar = (b.a.AbstractC3037b.C3038a) a2;
            if (aVar.f118687b == null) {
                uploadSpeedInfo = new UploadSpeedInfo(-5, null, 0, 0, 0, 30, null);
            } else {
                uploadSpeedInfo = c.a(aVar.f118687b);
            }
        } else if (a2 instanceof b.a.AbstractC3037b.C3039b) {
            uploadSpeedInfo = new UploadSpeedInfo(-4, null, 0, 0, 0, 30, null);
        } else if ((a2 instanceof b.a.f) || (a2 instanceof b.a.c)) {
            q.b("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            uploadSpeedInfo = new UploadSpeedInfo(-8, null, 0, 0, 0, 30, null);
        } else {
            throw new n();
        }
        a("getSpeed:".concat(String.valueOf(uploadSpeedInfo)), false);
        return uploadSpeedInfo;
    }

    static final class c extends m implements h.f.a.b<i, UploadSpeedInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f118702a = new c();

        static {
            Covode.recordClassIndex(77117);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UploadSpeedInfo invoke(i iVar) {
            return a(iVar);
        }

        public static UploadSpeedInfo a(i iVar) {
            l.d(iVar, "");
            return new UploadSpeedInfo(iVar.f118708a, iVar.f118709b, iVar.f118711d, iVar.f118712e, 0, 16, null);
        }
    }

    private static void a(String str, boolean z) {
        if (z) {
            q.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }
    }
}
