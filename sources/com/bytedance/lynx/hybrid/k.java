package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.a.f;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.a.n;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.resource.d.d;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.j;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class k extends LynxView implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final String f41016d = f41016d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f41017e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public j f41018a;

    /* renamed from: b  reason: collision with root package name */
    public a f41019b;

    /* renamed from: c  reason: collision with root package name */
    public f f41020c;

    /* renamed from: f  reason: collision with root package name */
    private String f41021f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f41022g;

    /* renamed from: h  reason: collision with root package name */
    private IResourceService f41023h;

    /* renamed from: i  reason: collision with root package name */
    private n f41024i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.monitorV2.lynx.b.b f41025j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.lynx.hybrid.h.a f41026k;

    public static final class a {
        static {
            Covode.recordClassIndex(25129);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final com.bytedance.lynx.hybrid.h.a getHybridContext() {
        return this.f41026k;
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final void b() {
        String str = this.f41021f;
        if (str == null) {
            l.a();
        }
        a(str);
    }

    static {
        Covode.recordClassIndex(25127);
    }

    @Override // com.bytedance.lynx.hybrid.a.h, com.lynx.tasm.LynxView
    public final void destroy() {
        String str;
        com.bytedance.lynx.hybrid.service.f fVar;
        j jVar = this.f41018a;
        if (!(jVar == null || (fVar = jVar.n) == null)) {
            fVar.a();
        }
        j jVar2 = this.f41018a;
        if (!(jVar2 == null || (str = jVar2.f40999c) == null || str.length() == 0 || com.bytedance.lynx.hybrid.e.c.f40957b.get(str) == null)) {
            Integer num = com.bytedance.lynx.hybrid.e.c.f40957b.get(str);
            if (num == null) {
                l.a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                com.bytedance.lynx.hybrid.e.c.f40956a.remove(str);
                com.bytedance.lynx.hybrid.e.c.f40957b.remove(str);
            } else {
                com.bytedance.lynx.hybrid.e.c.f40957b.put(str, Integer.valueOf(intValue));
            }
        }
        f fVar2 = this.f41020c;
        if (fVar2 != null) {
            fVar2.c();
        }
        super.destroy();
    }

    public final void setHybridContext(com.bytedance.lynx.hybrid.h.a aVar) {
        l.c(aVar, "");
        this.f41026k = aVar;
    }

    @Override // com.bytedance.lynx.hybrid.a.h, com.lynx.tasm.LynxView
    public final void updateData(Map<String, ? extends Object> map) {
        l.c(map, "");
        updateData(TemplateData.a(map));
    }

    private final void b(String str) {
        TemplateData templateData;
        j jVar;
        com.bytedance.lynx.hybrid.g.a aVar;
        this.f41021f = str;
        j jVar2 = this.f41018a;
        if ((jVar2 == null || (aVar = jVar2.s) == null || (templateData = aVar.f40971a) == null) && ((jVar = this.f41018a) == null || (templateData = jVar.f41007k) == null)) {
            templateData = TemplateData.a();
        }
        renderTemplateUrl(str, templateData);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ String $url;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(25133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, String str) {
            super(1);
            this.this$0 = kVar;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            com.bytedance.lynx.hybrid.j.c.a("ResoureLoader template load error, " + th2.getMessage(), com.bytedance.lynx.hybrid.j.b.E, "LynxKit");
            f fVar = this.this$0.f41020c;
            if (fVar != null) {
                fVar.a(this.this$0, this.$url, "ResoureLoader template load error, " + th2.getMessage());
            }
            a aVar = this.this$0.f41019b;
            if (aVar != null) {
                aVar.a(new j("ResoureLoader template load error, " + th2.getMessage(), 100));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<e, z> {
        final /* synthetic */ z.e $surl;
        final /* synthetic */ String $url;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(25130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, z.e eVar, String str) {
            super(1);
            this.this$0 = kVar;
            this.$surl = eVar;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e eVar) {
            T t;
            l lVar;
            final e eVar2 = eVar;
            l.c(eVar2, "");
            j jVar = this.this$0.f41018a;
            if (!(jVar == null || (lVar = jVar.f41006j) == null)) {
                l.c(lVar, "");
            }
            final z.e eVar3 = new z.e();
            eVar3.element = null;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final z.a aVar = new z.a();
            aVar.element = false;
            i.a(new Callable<Object>(this) {
                /* class com.bytedance.lynx.hybrid.k.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f41028a;

                static {
                    Covode.recordClassIndex(25131);
                }

                {
                    this.f41028a = r1;
                }

                /* renamed from: com.bytedance.lynx.hybrid.k$b$1$a */
                static final class a<V> implements Callable<h.z> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ InputStream f41033a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f41034b;

                    static {
                        Covode.recordClassIndex(25132);
                    }

                    a(InputStream inputStream, AnonymousClass1 r2) {
                        this.f41033a = inputStream;
                        this.f41034b = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ h.z call() {
                        T t;
                        if (eVar2.p != d.CDN || !c.a.a().f40901a) {
                            t = eVar2.n;
                        } else {
                            t = this.f41034b.f41028a.$surl.element;
                        }
                        k kVar = this.f41034b.f41028a.this$0;
                        byte[] bArr = (byte[]) eVar3.element;
                        if (bArr == null) {
                            l.a();
                        }
                        kVar.a(bArr, t);
                        return h.z.f158842a;
                    }
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj;
                    MethodCollector.i(14015);
                    try {
                        InputStream a2 = eVar2.a();
                        if (a2 != null) {
                            try {
                                InputStream inputStream = a2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                    eVar3.element = (T) byteArrayOutputStream2.toByteArray();
                                    if (!aVar.element) {
                                        countDownLatch.countDown();
                                        obj = h.z.f158842a;
                                    } else {
                                        obj = i.a(new a(inputStream, this), i.f4826c);
                                    }
                                    h.e.c.a(byteArrayOutputStream, null);
                                    h.e.c.a(a2, null);
                                } catch (Throwable th) {
                                    h.e.c.a(byteArrayOutputStream, th);
                                    MethodCollector.o(14015);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                h.e.c.a(a2, th);
                                MethodCollector.o(14015);
                                throw th2;
                            }
                        } else {
                            com.bytedance.lynx.hybrid.j.c.a("ResourceLoader stream empty", com.bytedance.lynx.hybrid.j.b.E, "LynxKit");
                            f fVar = this.f41028a.this$0.f41020c;
                            if (fVar != null) {
                                fVar.a(this.f41028a.this$0, this.f41028a.$url, "ResourceLoader stream empty");
                            }
                            a aVar = this.f41028a.this$0.f41019b;
                            if (aVar != null) {
                                aVar.a(new j("ResourceLoader stream empty", 100));
                            }
                            countDownLatch.countDown();
                            obj = h.z.f158842a;
                        }
                    } catch (Throwable th3) {
                        com.bytedance.lynx.hybrid.j.c.a("ResourceLoader stream write error, " + th3.getMessage(), com.bytedance.lynx.hybrid.j.b.E, "LynxKit");
                        f fVar2 = this.f41028a.this$0.f41020c;
                        if (fVar2 != null) {
                            fVar2.a(this.f41028a.this$0, this.f41028a.$url, "ResourceLoader stream write error, " + th3.getMessage());
                        }
                        a aVar2 = this.f41028a.this$0.f41019b;
                        if (aVar2 != null) {
                            aVar2.a(new j("ResourceLoader stream write error, " + th3.getMessage(), 100));
                        }
                        countDownLatch.countDown();
                        obj = h.z.f158842a;
                    }
                    MethodCollector.o(14015);
                    return obj;
                }
            }, i.f4824a);
            try {
                countDownLatch.await(4, TimeUnit.SECONDS);
                if (eVar3.element == null) {
                    com.bytedance.lynx.hybrid.j.c.a("data cannot be null", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                } else {
                    if (eVar2.p != d.CDN || !c.a.a().f40901a) {
                        t = eVar2.n;
                    } else {
                        t = this.$surl.element;
                    }
                    k kVar = this.this$0;
                    byte[] bArr = (byte[]) eVar3.element;
                    if (bArr == null) {
                        l.a();
                    }
                    kVar.a(bArr, t);
                }
            } catch (Throwable unused) {
                aVar.element = true;
                com.bytedance.lynx.hybrid.j.c.a("ResourceLoader load " + this.$url + " more than 4s, use async mode", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            }
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.a.h
    public final void a(String str) {
        l.c(str, "");
        f fVar = this.f41020c;
        if (fVar != null) {
            fVar.a(this, str);
        }
        if (TextUtils.isEmpty(str)) {
            new AndroidRuntimeException("url cannot be empty").printStackTrace();
            f fVar2 = this.f41020c;
            if (fVar2 != null) {
                fVar2.a(this, str, "url cannot be empty");
            }
        }
        if (this.f41023h == null) {
            b(str);
            return;
        }
        z.e eVar = new z.e();
        eVar.element = str;
        IResourceService iResourceService = this.f41023h;
        if (iResourceService != null) {
            com.bytedance.lynx.hybrid.resource.config.j jVar = new com.bytedance.lynx.hybrid.resource.config.j();
            jVar.d("template");
            try {
                Uri parse = Uri.parse(str);
                T t = (T) parse.getQueryParameter("surl");
                if (t != null) {
                    l.a((Object) t, "");
                    jVar.c(t);
                    eVar.element = t;
                }
                String queryParameter = parse.getQueryParameter("channel");
                if (queryParameter != null) {
                    l.a((Object) queryParameter, "");
                    jVar.a(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter("bundle");
                if (queryParameter2 != null) {
                    l.a((Object) queryParameter2, "");
                    jVar.b(queryParameter2);
                }
                jVar.f41109e = 1;
                String queryParameter3 = parse.getQueryParameter("dynamic");
                if (queryParameter3 != null) {
                    l.a((Object) queryParameter3, "");
                    jVar.f41109e = Integer.valueOf(Integer.parseInt(queryParameter3));
                }
            } catch (Throwable th) {
                com.bytedance.lynx.hybrid.j.c.a(th, "lynxkit.load parse url error", (String) null, 4);
            }
            iResourceService.loadAsync(str, jVar, new b(this, eVar, str), new c(this, str));
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final void a(String str, List<? extends Object> list) {
        l.c(str, "");
        if (list != null) {
            sendGlobalEvent(str, JavaOnlyArray.from(list));
        } else {
            sendGlobalEvent(str, new JavaOnlyArray());
        }
    }

    public final void a(byte[] bArr, String str) {
        TemplateData templateData;
        com.bytedance.lynx.hybrid.g.a aVar;
        l.c(bArr, "");
        this.f41022g = bArr;
        this.f41021f = str;
        j jVar = this.f41018a;
        if (jVar == null || (aVar = jVar.s) == null || (templateData = aVar.f40971a) == null) {
            j jVar2 = this.f41018a;
            if (jVar2 != null) {
                templateData = jVar2.f41007k;
            } else {
                templateData = null;
            }
        }
        renderTemplateWithBaseUrl(bArr, templateData, str);
        f fVar = this.f41020c;
        if (fVar != null) {
            fVar.a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, com.bytedance.lynx.hybrid.h.a aVar, com.lynx.tasm.n nVar, j jVar, f fVar) {
        super(context, nVar);
        String str;
        com.bytedance.lynx.hybrid.service.f fVar2;
        String str2;
        List<String> b2;
        l.c(context, "");
        l.c(aVar, "");
        l.c(nVar, "");
        l.c(jVar, "");
        this.f41026k = aVar;
        com.bytedance.android.monitorV2.lynx.b.b bVar = new com.bytedance.android.monitorV2.lynx.b.b(getHybridContext().f40980g, AnonymousClass1.f41027a);
        bVar.f24071f = "spark";
        if ("spark".length() == 0) {
            str = "detect_when_load_success";
        } else {
            str = "detect_when_detach";
        }
        l.c(str, "");
        bVar.f24068c = str;
        this.f41025j = bVar;
        this.f41024i = (n) getHybridContext().a(n.class);
        this.f41023h = (IResourceService) c.a.a().a(getHybridContext().f40980g, IResourceService.class);
        this.f41018a = jVar;
        this.f41021f = String.valueOf(jVar.v);
        this.f41020c = fVar;
        a aVar2 = new a(this.f41018a, this.f41023h);
        aVar2.f40851d = fVar;
        this.f41019b = aVar2;
        addLynxViewClient(aVar2);
        j jVar2 = this.f41018a;
        setGlobalProps(TemplateData.a(jVar2 != null ? jVar2.o : null));
        j jVar3 = this.f41018a;
        if (!(jVar3 == null || (str2 = jVar3.u) == null || str2.length() == 0 || str2 == null || (b2 = p.b(str2, new String[]{","})) == null)) {
            for (T t : b2) {
                if (!r.a((String) t)) {
                    r.a(com.bytedance.lynx.hybrid.e.d.a().getAssets(), t, "font/");
                }
            }
        }
        com.bytedance.android.monitorV2.lynx.b.b bVar2 = this.f41025j;
        if (bVar2 != null) {
            com.bytedance.android.monitorV2.j.a.a(this, bVar2);
        }
        com.bytedance.android.monitorV2.lynx.jsb.a aVar3 = (com.bytedance.android.monitorV2.lynx.jsb.a) getHybridContext().a(com.bytedance.android.monitorV2.lynx.jsb.a.class);
        if (aVar3 != null) {
            aVar3.f24137a = this;
        }
        com.bytedance.lynx.hybrid.j.f.a(getHybridContext().f40979f, "lynx", this);
        j jVar4 = this.f41018a;
        if (!(jVar4 == null || (fVar2 = jVar4.n) == null)) {
            fVar2.a(context, this, this.f41024i);
        }
    }
}
