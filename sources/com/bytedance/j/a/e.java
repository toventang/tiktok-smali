package com.bytedance.j.a;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ak;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.j.a.e.a;
import com.bytedance.lynx.hybrid.k;
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
import org.json.JSONObject;

public final class e implements com.bytedance.ies.bullet.service.base.c.c {

    /* renamed from: h  reason: collision with root package name */
    public static int f39011h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f39012i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.bullet.service.base.b.a f39013a;

    /* renamed from: b  reason: collision with root package name */
    LynxView f39014b;

    /* renamed from: c  reason: collision with root package name */
    String f39015c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f39016d;

    /* renamed from: e  reason: collision with root package name */
    public c f39017e;

    /* renamed from: f  reason: collision with root package name */
    public a f39018f;

    /* renamed from: g  reason: collision with root package name */
    o f39019g;

    /* renamed from: j  reason: collision with root package name */
    private IResourceLoaderService f39020j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.monitor.lynx.b.b f39021k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.android.monitor.lynx.jsb.a f39022l = new com.bytedance.android.monitor.lynx.jsb.a();

    static {
        Covode.recordClassIndex(23880);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(23882);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.j
    public final View a() {
        return this.f39014b;
    }

    private final void c() {
        String str;
        List<String> b2;
        c cVar = this.f39017e;
        if (!(cVar == null || (str = cVar.r) == null || str.length() == 0 || str == null || (b2 = p.b(str, new String[]{","})) == null)) {
            for (T t : b2) {
                if (!r.a((String) t)) {
                    r.a(com.bytedance.j.a.c.e.a().getAssets(), t, "font/");
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.j
    public final void b() {
        String str;
        c cVar = this.f39017e;
        if (!(cVar == null || (str = cVar.f38961b) == null || str.length() == 0 || com.bytedance.j.a.c.c.f38985b.get(str) == null)) {
            Integer num = com.bytedance.j.a.c.c.f38985b.get(str);
            if (num == null) {
                l.a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                com.bytedance.j.a.c.c.f38984a.remove(str);
                com.bytedance.j.a.c.c.f38985b.remove(str);
            } else {
                com.bytedance.j.a.c.c.f38985b.put(str, Integer.valueOf(intValue));
            }
        }
        LynxView lynxView = this.f39014b;
        if (lynxView != null) {
            lynxView.destroy();
        }
    }

    static final class b extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ z.e $surl;
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(23883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.e eVar, e eVar2, String str) {
            super(1);
            this.$surl = eVar;
            this.this$0 = eVar2;
            this.$url$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            f fVar;
            final ap apVar2 = apVar;
            l.c(apVar2, "");
            c cVar = this.this$0.f39017e;
            if (!(cVar == null || (fVar = cVar.f38967h) == null)) {
                fVar.a(apVar2);
            }
            i.a(new Callable<Object>(this) {
                /* class com.bytedance.j.a.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f39028a;

                static {
                    Covode.recordClassIndex(23884);
                }

                {
                    this.f39028a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    MethodCollector.i(3537);
                    Object obj = null;
                    try {
                        InputStream a2 = apVar2.a();
                        if (a2 != null) {
                            try {
                                final InputStream inputStream = a2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                    final byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    Object a3 = i.a(new Callable<h.z>() {
                                        /* class com.bytedance.j.a.e.b.AnonymousClass1.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(23885);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        @Override // java.util.concurrent.Callable
                                        public final /* synthetic */ h.z call() {
                                            T t;
                                            TemplateData templateData;
                                            a aVar;
                                            if (apVar2.q != ao.CDN || !this.f39028a.this$0.f39019g.g().c()) {
                                                t = apVar2.o;
                                            } else {
                                                t = this.f39028a.$surl.element;
                                            }
                                            e eVar = this.f39028a.this$0;
                                            byte[] bArr = byteArray;
                                            l.a((Object) bArr, "");
                                            l.c(bArr, "");
                                            eVar.f39016d = bArr;
                                            eVar.f39015c = t;
                                            LynxView lynxView = eVar.f39014b;
                                            if (lynxView != null) {
                                                c cVar = eVar.f39017e;
                                                if (cVar == null || (aVar = cVar.p) == null || (templateData = aVar.f39025a) == null) {
                                                    c cVar2 = eVar.f39017e;
                                                    if (cVar2 != null) {
                                                        templateData = cVar2.f38968i;
                                                    } else {
                                                        templateData = null;
                                                    }
                                                }
                                                lynxView.renderTemplateWithBaseUrl(bArr, templateData, t);
                                            }
                                            return h.z.f158842a;
                                        }
                                    }, i.f4826c);
                                    h.e.c.a(byteArrayOutputStream, null);
                                    h.e.c.a(a2, null);
                                    obj = a3;
                                } catch (Throwable th) {
                                    h.e.c.a(byteArrayOutputStream, th);
                                    MethodCollector.o(3537);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                h.e.c.a(a2, th);
                                MethodCollector.o(3537);
                                throw th2;
                            }
                        } else {
                            this.f39028a.this$0.f39013a.printLog("ResourceLoader stream empty", com.bytedance.ies.bullet.service.base.a.p.E, "LynxKit");
                            a aVar = this.f39028a.this$0.f39018f;
                            if (aVar != null) {
                                aVar.a(new j("ResourceLoader stream empty", 100));
                                obj = h.z.f158842a;
                            }
                        }
                    } catch (Throwable th3) {
                        this.f39028a.this$0.f39013a.printLog("ResourceLoader stream write error, " + th3.getMessage(), com.bytedance.ies.bullet.service.base.a.p.E, "LynxKit");
                        a aVar2 = this.f39028a.this$0.f39018f;
                        if (aVar2 != null) {
                            aVar2.a(new j("ResourceLoader stream write error, " + th3.getMessage(), 100));
                            obj = h.z.f158842a;
                        }
                    }
                    MethodCollector.o(3537);
                    return obj;
                }
            }, i.f4824a);
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(23886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, String str) {
            super(1);
            this.this$0 = eVar;
            this.$url$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.this$0.f39013a.printLog("ResoureLoader template load error, " + th2.getMessage(), com.bytedance.ies.bullet.service.base.a.p.E, "LynxKit");
            a aVar = this.this$0.f39018f;
            if (aVar != null) {
                aVar.a(new j("ResoureLoader template load error, " + th2.getMessage(), 100));
            }
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.base.j
    public final void a(String str) {
        TemplateData templateData;
        c cVar;
        a aVar;
        l.c(str, "");
        if (this.f39014b == null) {
            return;
        }
        if (this.f39020j == null) {
            this.f39015c = str;
            c cVar2 = this.f39017e;
            if ((cVar2 == null || (aVar = cVar2.p) == null || (templateData = aVar.f39025a) == null) && ((cVar = this.f39017e) == null || (templateData = cVar.f38968i) == null)) {
                templateData = TemplateData.a();
            }
            LynxView lynxView = this.f39014b;
            if (lynxView != null) {
                lynxView.renderTemplateUrl(str, templateData);
                return;
            }
            return;
        }
        z.e eVar = new z.e();
        eVar.element = str;
        IResourceLoaderService iResourceLoaderService = this.f39020j;
        if (iResourceLoaderService != null) {
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
            jVar.d("template");
            jVar.s = this.f39019g;
            try {
                Uri parse = Uri.parse(str);
                l.a((Object) parse, "");
                jVar.w = new com.bytedance.ies.bullet.service.base.e.b(parse);
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
                jVar.f32636j = 1;
                String queryParameter3 = parse.getQueryParameter("dynamic");
                if (queryParameter3 != null) {
                    l.a((Object) queryParameter3, "");
                    jVar.f32636j = Integer.valueOf(Integer.parseInt(queryParameter3));
                }
            } catch (Throwable th) {
                this.f39013a.printReject(th, "lynxkit.load parse url error");
            }
            iResourceLoaderService.loadAsync(str, jVar, new b(eVar, this, str), new c(this, str));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.j
    public final void a(String str, List<? extends Object> list) {
        l.c(str, "");
        LynxView lynxView = this.f39014b;
        if (lynxView != null) {
            lynxView.sendGlobalEvent(str, JavaOnlyArray.from(list));
        }
    }

    public e(o oVar, com.bytedance.ies.bullet.service.base.b.a aVar) {
        String str;
        String str2;
        ak b2;
        ak b3;
        l.c(oVar, "");
        l.c(aVar, "");
        this.f39019g = oVar;
        this.f39013a = aVar;
        final com.bytedance.ies.bullet.service.base.o oVar2 = (com.bytedance.ies.bullet.service.base.o) aVar.a(com.bytedance.ies.bullet.service.base.o.class);
        String str3 = null;
        if (!(oVar2 == null || (b3 = oVar2.b()) == null)) {
            str3 = b3.f32536b;
        }
        com.bytedance.android.monitor.lynx.b.b bVar = new com.bytedance.android.monitor.lynx.b.b((oVar2 == null || (b2 = oVar2.b()) == null || (str = b2.f32535a) == null) ? "" : str, new com.bytedance.android.monitor.webview.a() {
            /* class com.bytedance.j.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23881);
            }

            @Override // com.bytedance.android.monitor.webview.a
            public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
                com.bytedance.ies.bullet.service.base.o oVar = oVar2;
                if (oVar != null) {
                    oVar.a(str, i2, jSONObject, jSONObject2);
                }
            }
        });
        bVar.f23602j = str3;
        if (str3 == null || str3.length() == 0) {
            str2 = "detect_when_load_success";
        } else {
            str2 = "detect_when_detach";
        }
        l.c(str2, "");
        bVar.f23597e = str2;
        this.f39021k = bVar;
        this.f39020j = (IResourceLoaderService) aVar.a(IResourceLoaderService.class);
        c cVar = (c) this.f39019g.g().a().a(c.class);
        if (cVar != null) {
            this.f39017e = cVar;
            Context b4 = this.f39019g.g().b();
            if (b4 == null) {
                l.a();
            }
            this.f39014b = a(b4, cVar);
            Map<String, Object> map = cVar.f38971l;
            if (true ^ map.containsKey("containerID")) {
                StringBuilder sb = new StringBuilder(k.f41016d);
                int i2 = f39011h;
                f39011h = i2 + 1;
                map.put("containerID", sb.append(i2).toString());
            }
            LynxView lynxView = this.f39014b;
            if (lynxView != null) {
                lynxView.setGlobalProps(TemplateData.a(cVar.f38971l));
            }
        }
        c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        if (r1 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
        if (r1 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        r3.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.lynx.tasm.LynxView a(android.content.Context r9, com.bytedance.j.a.c r10) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.j.a.e.a(android.content.Context, com.bytedance.j.a.c):com.lynx.tasm.LynxView");
    }
}
