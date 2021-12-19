package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.j.c;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.lynx.tasm.provider.g;
import com.lynx.tasm.provider.h;
import com.lynx.tasm.provider.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class d extends h<Object, byte[]> {
    static {
        Covode.recordClassIndex(25197);
    }

    static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ g $callback$inlined;

        static {
            Covode.recordClassIndex(25198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            final e eVar2 = eVar;
            l.c(eVar2, "");
            i.a(new Callable<z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.d.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f41122a;

                static {
                    Covode.recordClassIndex(25199);
                }

                {
                    this.f41122a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ z call() {
                    MethodCollector.i(12957);
                    InputStream a2 = eVar2.a();
                    if (a2 != null) {
                        try {
                            InputStream inputStream = a2;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                                this.f41122a.$callback$inlined.a(j.a(byteArrayOutputStream2.toByteArray()));
                                c.a("get external js resource success", com.bytedance.lynx.hybrid.j.b.I, "ExternalJSProvider");
                                h.e.c.a(byteArrayOutputStream, null);
                                h.e.c.a(a2, null);
                            } catch (Throwable th) {
                                h.e.c.a(byteArrayOutputStream, th);
                                MethodCollector.o(12957);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            h.e.c.a(a2, th);
                            MethodCollector.o(12957);
                            throw th2;
                        }
                    } else {
                        this.f41122a.$callback$inlined.a(j.a((Throwable) new Error("InputStream is null")));
                        c.a("get external js resource failed: InputStream is null", com.bytedance.lynx.hybrid.j.b.E, "ExternalJSProvider");
                    }
                    z zVar = z.f158842a;
                    MethodCollector.o(12957);
                    return zVar;
                }
            }, i.f4824a);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ g $callback$inlined;

        static {
            Covode.recordClassIndex(25200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.$callback$inlined.a(j.a(th2));
            c.a("get external js resource failed: " + th2.getMessage(), com.bytedance.lynx.hybrid.j.b.E, "ExternalJSProvider");
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.provider.h
    public final void a(com.lynx.tasm.provider.i<Object> iVar, g<byte[]> gVar) {
        IResourceService iResourceService;
        l.c(iVar, "");
        l.c(gVar, "");
        String str = iVar.f56821a;
        if ((!TextUtils.isEmpty(str)) && str != null && (iResourceService = (IResourceService) c.a.a().a(IResourceService.class)) != null) {
            com.bytedance.lynx.hybrid.resource.config.j jVar = new com.bytedance.lynx.hybrid.resource.config.j();
            jVar.d("external_js");
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
                com.bytedance.lynx.hybrid.j.c.a(th, "ExternalJSProvider parse url error", (String) null, 4);
            }
            iResourceService.loadAsync(str, jVar, new a(gVar), new b(gVar));
        }
    }
}
