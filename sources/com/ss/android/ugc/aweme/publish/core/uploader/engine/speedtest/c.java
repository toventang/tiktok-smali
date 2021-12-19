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

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118653a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final b f118654b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final int f118655c = k.a();

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public f.a.b.b f118656a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.uploader.a.a f118657b;

        /* renamed from: c  reason: collision with root package name */
        public final h f118658c = new h(er.a(), (byte) 0);

        /* renamed from: d  reason: collision with root package name */
        private a f118659d = new a.e(this);

        /* access modifiers changed from: package-private */
        public final /* synthetic */ class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f118676a;

            static {
                Covode.recordClassIndex(77088);
            }

            d(h.f.a.a aVar) {
                this.f118676a = aVar;
            }

            public final /* synthetic */ void run() {
                l.b(this.f118676a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(77064);
        }

        public static abstract class a {

            /* renamed from: a  reason: collision with root package name */
            public final b f118660a;

            static {
                Covode.recordClassIndex(77065);
            }

            public void a() {
                e();
            }

            public void b() {
                e();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b  reason: collision with other inner class name */
            public static abstract class AbstractC3028b extends a {
                static {
                    Covode.recordClassIndex(77068);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a() {
                    this.f118660a.f();
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b$a  reason: collision with other inner class name */
                public static final class C3029a extends AbstractC3028b {

                    /* renamed from: b  reason: collision with root package name */
                    public final i f118662b;

                    static {
                        Covode.recordClassIndex(77069);
                    }

                    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                    public final String e() {
                        return "Cancel";
                    }

                    public final String toString() {
                        return "Cancel:" + this.f118662b;
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3029a(b bVar, i iVar) {
                        super(bVar, (byte) 0);
                        l.d(bVar, "");
                        this.f118662b = iVar;
                    }
                }

                private AbstractC3028b(b bVar) {
                    super(bVar, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b$b  reason: collision with other inner class name */
                public static final class C3030b extends AbstractC3028b {
                    static {
                        Covode.recordClassIndex(77070);
                    }

                    public final String toString() {
                        return "Failed";
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3030b(b bVar) {
                        super(bVar, (byte) 0);
                        l.d(bVar, "");
                    }
                }

                public /* synthetic */ AbstractC3028b(b bVar, byte b2) {
                    this(bVar);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$c  reason: collision with other inner class name */
            public static final class C3031c extends a {

                /* renamed from: b  reason: collision with root package name */
                public final i f118663b;

                static {
                    Covode.recordClassIndex(77071);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final String e() {
                    return "FastResult";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void b() {
                    this.f118660a.a(this.f118663b);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void c() {
                    q.b("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                    com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                }

                public final String toString() {
                    return "FastResult:" + this.f118663b;
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a(C3026a aVar) {
                    l.d(aVar, "");
                    this.f118660a.b(aVar);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a(C3031c cVar) {
                    l.d(cVar, "");
                    this.f118660a.a((a) cVar);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3031c(b bVar, i iVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                    l.d(iVar, "");
                    this.f118663b = iVar;
                }
            }

            public static final class d extends a {
                static {
                    Covode.recordClassIndex(77072);
                }

                public final String toString() {
                    return "Invalid";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a() {
                    this.f118660a.f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public d(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }
            }

            public static final class e extends a {
                static {
                    Covode.recordClassIndex(77073);
                }

                public final String toString() {
                    return "New";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a() {
                    this.f118660a.f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public e(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }
            }

            public static final class f extends a {
                static {
                    Covode.recordClassIndex(77074);
                }

                public final String toString() {
                    return "Running";
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void b() {
                    this.f118660a.a((i) null);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void d() {
                    this.f118660a.a(new AbstractC3028b.C3030b(this.f118660a));
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void c() {
                    q.b("BDUploadSpeedProbe : ".concat("invalid on running"));
                    com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("invalid on running"));
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public f(b bVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a(C3026a aVar) {
                    l.d(aVar, "");
                    this.f118660a.b(aVar);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a(C3031c cVar) {
                    l.d(cVar, "");
                    this.f118660a.a((a) cVar);
                }
            }

            public void d() {
                a("failed on not running");
            }

            public String e() {
                return toString();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$a  reason: collision with other inner class name */
            public static final class C3026a extends a {

                /* renamed from: b  reason: collision with root package name */
                public final i f118661b;

                static {
                    Covode.recordClassIndex(77066);
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final String e() {
                    return "Complete";
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$a$a  reason: collision with other inner class name */
                static final class C3027a extends m implements h.f.a.a<z> {
                    final /* synthetic */ C3026a this$0;

                    static {
                        Covode.recordClassIndex(77067);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3027a(C3026a aVar) {
                        super(0);
                        this.this$0 = aVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f118660a.f();
                        return z.f158842a;
                    }
                }

                @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.a
                public final void a() {
                    h hVar;
                    hVar.a((h) this.f118660a.f118658c.f118706c, (h.f.a.a) new C3027a(this));
                }

                public final String toString() {
                    return "Complete:" + this.f118661b;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3026a(b bVar, i iVar) {
                    super(bVar, (byte) 0);
                    l.d(bVar, "");
                    l.d(iVar, "");
                    this.f118661b = iVar;
                }
            }

            public void c() {
                this.f118660a.a(new d(this.f118660a));
            }

            private a(b bVar) {
                this.f118660a = bVar;
            }

            public void a(C3026a aVar) {
                l.d(aVar, "");
                a("complete on not running or fast result");
            }

            private static void a(String str) {
                q.b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
                com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }

            public void a(C3031c cVar) {
                l.d(cVar, "");
                a("fastResult on not running");
            }

            public /* synthetic */ a(b bVar, byte b2) {
                this(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$b  reason: collision with other inner class name */
        public static final class C3032b extends m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(77075);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3032b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                f.a.b.b bVar = this.this$0.f118656a;
                if (bVar != null) {
                    bVar.dispose();
                }
                return z.f158842a;
            }
        }

        public final synchronized void b() {
            MethodCollector.i(12355);
            this.f118659d.a();
            MethodCollector.o(12355);
        }

        public final synchronized void c() {
            MethodCollector.i(12356);
            this.f118659d.b();
            MethodCollector.o(12356);
        }

        public final synchronized void d() {
            MethodCollector.i(12357);
            this.f118659d.c();
            MethodCollector.o(12357);
        }

        public final synchronized void e() {
            MethodCollector.i(12606);
            this.f118659d.d();
            MethodCollector.o(12606);
        }

        public final void f() {
            a(new a.f(this));
            a(new C3033c(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$c  reason: collision with other inner class name */
        public static final class C3033c extends m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(77076);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3033c(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                final AnonymousClass2 r0 = new h.f.a.b<com.ss.android.ugc.aweme.publish.f.d, t<i>>(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass2 */
                    final /* synthetic */ C3033c this$0;

                    static {
                        Covode.recordClassIndex(77080);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* renamed from: a */
                    public final t<i> invoke(final com.ss.android.ugc.aweme.publish.f.d dVar) {
                        l.d(dVar, "");
                        t<i> a2 = t.a(new w(this) {
                            /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f118667a;

                            static {
                                Covode.recordClassIndex(77081);
                            }

                            {
                                this.f118667a = r1;
                            }

                            @Override // f.a.w
                            public final void subscribe(final v<i> vVar) {
                                int i2;
                                l.d(vVar, "");
                                com.ss.android.ugc.aweme.uploader.a.a aVar = this.f118667a.this$0.this$0.f118657b;
                                if (aVar != null) {
                                    b.a("restart speedProbe, may close anr");
                                    aVar.d();
                                }
                                final long currentTimeMillis = System.currentTimeMillis();
                                com.ss.android.ugc.aweme.uploader.a.a e2 = g.a().o().j().e();
                                ClientUploadRouterModel a2 = e.a();
                                com.ss.android.ugc.aweme.publish.f.d dVar = dVar;
                                if (a2 != null) {
                                    i2 = a2.getMode();
                                } else {
                                    i2 = 0;
                                }
                                e2.a(dVar, i2);
                                e2.a(new com.ss.android.ugc.aweme.uploader.a.b(this) {
                                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f118669a;

                                    static {
                                        Covode.recordClassIndex(77082);
                                    }

                                    @Override // com.ss.android.ugc.aweme.uploader.a.b
                                    public final int a() {
                                        com.ss.android.ugc.aweme.publish.f.g gVar = dVar.f118722a;
                                        if (gVar != null) {
                                            l.b(gVar, "");
                                            return com.ss.android.ugc.aweme.shortvideo.upload.b.a(gVar, "BDUploadSpeedProbe");
                                        }
                                        throw new IllegalArgumentException("upload video config is null");
                                    }

                                    {
                                        this.f118669a = r1;
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.v */
                                    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.ss.android.ugc.aweme.uploader.a.b
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
                                if (a2 != null) {
                                    b.a("setNetworkRoutMode mode:" + a2.getMode() + " weight:" + a2.getWeight(), true);
                                    e2.a(a2.getWeight());
                                }
                                int a3 = et.a();
                                int a4 = es.a();
                                int a5 = k.a();
                                b.a("startSpeedTest size:" + a3 + " retryCount:" + a4 + " mode:" + a5 + " singleHostTotalTimeout:" + l.a(), false);
                                e2.a();
                                e2.b();
                                this.f118667a.this$0.this$0.f118657b = e2;
                            }
                        });
                        l.b(a2, "");
                        return a2;
                    }
                };
                final AnonymousClass3 r4 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass3 */
                    final /* synthetic */ C3033c this$0;

                    static {
                        Covode.recordClassIndex(77083);
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
                        com.ss.android.ugc.aweme.uploader.a.a aVar = this.this$0.this$0.f118657b;
                        if (aVar != null) {
                            aVar.c();
                        }
                        com.ss.android.ugc.aweme.uploader.a.a aVar2 = this.this$0.this$0.f118657b;
                        if (aVar2 != null) {
                            aVar2.d();
                        }
                        this.this$0.this$0.f118657b = null;
                        b.a("close speedProbe finish", true);
                    }
                };
                this.this$0.f118656a = AnonymousClass1.a().a((f.a.d.g<? super com.ss.android.ugc.aweme.publish.f.d, ? extends x<? extends R>>) new f.a.d.g() {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(77084);
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        com.ss.android.ugc.aweme.publish.f.d dVar = (com.ss.android.ugc.aweme.publish.f.d) obj;
                        l.d(dVar, "");
                        return r0.invoke(dVar);
                    }
                }, false).a(new f.a.d.a() {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(77085);
                    }

                    @Override // f.a.d.a
                    public final void a() {
                        r4.a();
                    }
                }).a(new f(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass6 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3033c f118674a;

                    static {
                        Covode.recordClassIndex(77086);
                    }

                    {
                        this.f118674a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        i iVar = (i) obj;
                        if (iVar.f118710c) {
                            b bVar = this.f118674a.this$0;
                            b bVar2 = this.f118674a.this$0;
                            l.b(iVar, "");
                            bVar.a(new a.C3026a(bVar2, iVar));
                            return;
                        }
                        b bVar3 = this.f118674a.this$0;
                        b bVar4 = this.f118674a.this$0;
                        l.b(iVar, "");
                        bVar3.a(new a.C3031c(bVar4, iVar));
                    }
                }, new f(this) {
                    /* class com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c.b.C3033c.AnonymousClass7 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3033c f118675a;

                    static {
                        Covode.recordClassIndex(77087);
                    }

                    {
                        this.f118675a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f118675a.this$0.e();
                    }
                });
                return z.f158842a;
            }
        }

        public final synchronized a a() {
            a aVar;
            MethodCollector.i(12352);
            aVar = this.f118659d;
            MethodCollector.o(12352);
            return aVar;
        }

        private static void a(h.f.a.a<z> aVar) {
            com.ss.android.ugc.aweme.cw.g.e().execute(new d(aVar));
        }

        public final void b(a.C3026a aVar) {
            this.f118658c.f118705a = System.currentTimeMillis();
            a((a) aVar);
        }

        public static void a(String str) {
            q.b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }

        public final synchronized void a(a.C3026a aVar) {
            MethodCollector.i(12498);
            this.f118659d.a(aVar);
            MethodCollector.o(12498);
        }

        public final synchronized void a(a.C3031c cVar) {
            MethodCollector.i(12358);
            this.f118659d.a(cVar);
            MethodCollector.o(12358);
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            a(this.f118659d.e() + " change to " + aVar, true);
            this.f118659d = aVar;
        }

        public final void a(i iVar) {
            a(new a.AbstractC3028b.C3029a(this, iVar));
            a(new C3032b(this));
        }

        public static void a(String str, boolean z) {
            if (z) {
                q.a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(77062);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77063);
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
        this.f118654b.c();
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final boolean d() {
        a("call invalid", true);
        if (this.f118655c == 1) {
            a("client route mode not need invalid context", true);
            return false;
        }
        this.f118654b.d();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final void a() {
        if (bv.a() && !g.a().A().a()) {
            a("call start", false);
            this.f118654b.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.g
    public final UploadSpeedInfo b() {
        UploadSpeedInfo uploadSpeedInfo;
        c();
        b.a a2 = this.f118654b.a();
        if (a2 instanceof b.a.C3026a) {
            uploadSpeedInfo = C3034c.a(((b.a.C3026a) a2).f118661b);
        } else if (a2 instanceof b.a.e) {
            uploadSpeedInfo = new UploadSpeedInfo(-6, null, 0, 0, 0, 30, null);
        } else if (a2 instanceof b.a.d) {
            uploadSpeedInfo = new UploadSpeedInfo(-7, null, 0, 0, 0, 30, null);
        } else if (a2 instanceof b.a.AbstractC3028b.C3029a) {
            b.a.AbstractC3028b.C3029a aVar = (b.a.AbstractC3028b.C3029a) a2;
            if (aVar.f118662b == null) {
                uploadSpeedInfo = new UploadSpeedInfo(-5, null, 0, 0, 0, 30, null);
            } else {
                uploadSpeedInfo = C3034c.a(aVar.f118662b);
            }
        } else if (a2 instanceof b.a.AbstractC3028b.C3030b) {
            uploadSpeedInfo = new UploadSpeedInfo(-4, null, 0, 0, 0, 30, null);
        } else if ((a2 instanceof b.a.f) || (a2 instanceof b.a.C3031c)) {
            q.b("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            com.bytedance.services.apm.api.a.a("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            uploadSpeedInfo = new UploadSpeedInfo(-8, null, 0, 0, 0, 30, null);
        } else {
            throw new n();
        }
        a("getSpeed:".concat(String.valueOf(uploadSpeedInfo)), false);
        return uploadSpeedInfo;
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$c  reason: collision with other inner class name */
    static final class C3034c extends m implements h.f.a.b<i, UploadSpeedInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3034c f118677a = new C3034c();

        static {
            Covode.recordClassIndex(77089);
        }

        C3034c() {
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
