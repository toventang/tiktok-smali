package com.bytedance.j.a.f;

import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.lynx.tasm.component.a;
import h.e.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class a implements com.lynx.tasm.component.a {

    /* renamed from: a  reason: collision with root package name */
    public final o f39034a;

    /* renamed from: b  reason: collision with root package name */
    public final IResourceLoaderService f39035b;

    static {
        Covode.recordClassIndex(23892);
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ a.AbstractC1268a $handler;

        static {
            Covode.recordClassIndex(23895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a.AbstractC1268a aVar) {
            super(1);
            this.$handler = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.$handler.a(null, th2);
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.j.a.f.a$a  reason: collision with other inner class name */
    static final class C0928a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ a.AbstractC1268a $handler;

        static {
            Covode.recordClassIndex(23893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0928a(a.AbstractC1268a aVar) {
            super(1);
            this.$handler = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            final ap apVar2 = apVar;
            l.c(apVar2, "");
            i.a(new Callable<z>(this) {
                /* class com.bytedance.j.a.f.a.C0928a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0928a f39036a;

                static {
                    Covode.recordClassIndex(23894);
                }

                {
                    this.f39036a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ z call() {
                    MethodCollector.i(4109);
                    try {
                        InputStream a2 = apVar2.a();
                        if (a2 != null) {
                            try {
                                InputStream inputStream = a2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                    this.f39036a.$handler.a(byteArrayOutputStream2.toByteArray(), null);
                                    c.a(byteArrayOutputStream, null);
                                    c.a(a2, null);
                                } catch (Throwable th) {
                                    c.a(byteArrayOutputStream, th);
                                    MethodCollector.o(4109);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                c.a(a2, th);
                                MethodCollector.o(4109);
                                throw th2;
                            }
                        } else {
                            this.f39036a.$handler.a(null, new Throwable("ResourceLoader stream empty"));
                        }
                    } catch (Throwable th3) {
                        this.f39036a.$handler.a(null, th3);
                    }
                    z zVar = z.f158842a;
                    MethodCollector.o(4109);
                    return zVar;
                }
            }, i.f4824a);
            return z.f158842a;
        }
    }

    public a(o oVar, IResourceLoaderService iResourceLoaderService) {
        l.c(oVar, "");
        l.c(iResourceLoaderService, "");
        this.f39034a = oVar;
        this.f39035b = iResourceLoaderService;
    }

    @Override // com.lynx.tasm.component.a
    public final void a(String str, a.AbstractC1268a aVar) {
        if (str == null) {
            aVar.a(null, new Throwable("url is null"));
            return;
        }
        j jVar = new j();
        jVar.s = this.f39034a;
        jVar.d("component");
        try {
            Uri parse = Uri.parse(str);
            l.a((Object) parse, "");
            jVar.w = new com.bytedance.ies.bullet.service.base.e.b(parse);
            String queryParameter = parse.getQueryParameter("surl");
            if (queryParameter != null) {
                l.a((Object) queryParameter, "");
                jVar.c(queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("channel");
            if (queryParameter2 != null) {
                l.a((Object) queryParameter2, "");
                jVar.a(queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("bundle");
            if (queryParameter3 != null) {
                l.a((Object) queryParameter3, "");
                jVar.b(queryParameter3);
            }
            jVar.f32636j = 1;
            String queryParameter4 = parse.getQueryParameter("dynamic");
            if (queryParameter4 != null) {
                l.a((Object) queryParameter4, "");
                jVar.f32636j = Integer.valueOf(Integer.parseInt(queryParameter4));
            }
        } catch (Throwable th) {
            this.f39034a.printReject(th, "DefaultDynamicComponentFetcher parse url error");
        }
        this.f39035b.loadAsync(str, jVar, new C0928a(aVar), new b(aVar));
    }
}
