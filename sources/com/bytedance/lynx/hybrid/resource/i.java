package com.bytedance.lynx.hybrid.resource;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.lynx.tasm.provider.g;
import com.lynx.tasm.provider.h;
import com.lynx.tasm.provider.j;
import h.e.c;
import h.f.b.l;
import h.f.b.m;
import h.m.d;
import h.m.p;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

public final class i extends h<Bundle, String> {
    static {
        Covode.recordClassIndex(25239);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ String $_channel$inlined;
        final /* synthetic */ g $callback$inlined;
        final /* synthetic */ com.lynx.tasm.provider.i $request$inlined;

        static {
            Covode.recordClassIndex(25240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, com.lynx.tasm.provider.i iVar, g gVar) {
            super(1);
            this.$_channel$inlined = str;
            this.$request$inlined = iVar;
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            final e eVar2 = eVar;
            l.c(eVar2, "");
            b.i.b((Callable) new Callable<z>(this) {
                /* class com.bytedance.lynx.hybrid.resource.i.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f41207a;

                static {
                    Covode.recordClassIndex(25241);
                }

                {
                    this.f41207a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public z call() {
                    MethodCollector.i(11284);
                    File file = new File(eVar2.n + File.separator + "/lang.json");
                    if (!file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            FileInputStream fileInputStream2 = fileInputStream;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                                long unused = h.e.b.a(fileInputStream2, byteArrayOutputStream2, 8192);
                                this.f41207a.$callback$inlined.a(j.a(byteArrayOutputStream2.toString(d.f158808a.name())));
                                c.a(byteArrayOutputStream, null);
                                c.a(fileInputStream, null);
                                z zVar = z.f158842a;
                                MethodCollector.o(11284);
                                return zVar;
                            } catch (Throwable th) {
                                c.a(byteArrayOutputStream, th);
                                MethodCollector.o(11284);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            c.a(fileInputStream, th);
                            MethodCollector.o(11284);
                            throw th2;
                        }
                    } else {
                        MethodCollector.o(11284);
                        return null;
                    }
                }
            });
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ String $_channel$inlined;
        final /* synthetic */ g $callback$inlined;
        final /* synthetic */ com.lynx.tasm.provider.i $request$inlined;

        static {
            Covode.recordClassIndex(25242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, com.lynx.tasm.provider.i iVar, g gVar) {
            super(1);
            this.$_channel$inlined = str;
            this.$request$inlined = iVar;
            this.$callback$inlined = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.$callback$inlined.a(j.a(th2));
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.provider.h
    public final void a(com.lynx.tasm.provider.i<Bundle> iVar, g<String> gVar) {
        IResourceService iResourceService;
        l.c(iVar, "");
        l.c(gVar, "");
        String str = iVar.f56821a;
        l.a((Object) str, "");
        if (!p.b(str, "__", false) && !p.c(str, "__", false) && p.b(str, new String[]{"__"}).size() == 3 && str != null && (iResourceService = (IResourceService) c.a.a().a(IResourceService.class)) != null) {
            String uri = o.a(str).toString();
            l.a((Object) uri, "");
            com.bytedance.lynx.hybrid.resource.config.j jVar = new com.bytedance.lynx.hybrid.resource.config.j();
            String string = iVar.f56822b.getString("access_key");
            if (string != null) {
                l.a((Object) string, "");
                jVar.f(string);
            }
            jVar.a(str);
            jVar.f41109e = 1;
            iResourceService.loadAsync(uri, jVar, new a(str, iVar, gVar), new b(str, iVar, gVar));
        }
    }
}
