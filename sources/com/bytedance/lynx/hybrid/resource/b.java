package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.lynx.tasm.component.a;
import h.e.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class b implements com.lynx.tasm.component.a {

    /* renamed from: a  reason: collision with root package name */
    public final IResourceService f41037a;

    static {
        Covode.recordClassIndex(25140);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b$b  reason: collision with other inner class name */
    static final class C0998b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ a.AbstractC1268a $handler;

        static {
            Covode.recordClassIndex(25143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0998b(a.AbstractC1268a aVar) {
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

    public b(IResourceService iResourceService) {
        l.c(iResourceService, "");
        this.f41037a = iResourceService;
    }

    static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ a.AbstractC1268a $handler;

        static {
            Covode.recordClassIndex(25141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a.AbstractC1268a aVar) {
            super(1);
            this.$handler = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            final e eVar2 = eVar;
            l.c(eVar2, "");
            i.a(new Callable<z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f41039a;

                static {
                    Covode.recordClassIndex(25142);
                }

                {
                    this.f41039a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ z call() {
                    MethodCollector.i(13946);
                    try {
                        InputStream a2 = eVar2.a();
                        if (a2 != null) {
                            try {
                                InputStream inputStream = a2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                    long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                    this.f41039a.$handler.a(byteArrayOutputStream2.toByteArray(), null);
                                    c.a(byteArrayOutputStream, null);
                                    c.a(a2, null);
                                } catch (Throwable th) {
                                    c.a(byteArrayOutputStream, th);
                                    MethodCollector.o(13946);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                c.a(a2, th);
                                MethodCollector.o(13946);
                                throw th2;
                            }
                        } else {
                            this.f41039a.$handler.a(null, new Throwable("ResourceLoader stream empty"));
                        }
                    } catch (Throwable th3) {
                        this.f41039a.$handler.a(null, th3);
                    }
                    z zVar = z.f158842a;
                    MethodCollector.o(13946);
                    return zVar;
                }
            }, i.f4824a);
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.component.a
    public final void a(String str, a.AbstractC1268a aVar) {
        if (str == null) {
            aVar.a(null, new Throwable("url is null"));
            return;
        }
        j jVar = new j();
        jVar.d("component");
        try {
            Uri parse = Uri.parse(str);
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
            jVar.f41109e = 1;
            String queryParameter4 = parse.getQueryParameter("dynamic");
            if (queryParameter4 != null) {
                l.a((Object) queryParameter4, "");
                jVar.f41109e = Integer.valueOf(Integer.parseInt(queryParameter4));
            }
        } catch (Throwable th) {
            com.bytedance.lynx.hybrid.j.c.a(th, "DefaultDynamicComponentFetcher parse url error", (String) null, 4);
        }
        this.f41037a.loadAsync(str, jVar, new a(aVar), new C0998b(aVar));
    }
}
