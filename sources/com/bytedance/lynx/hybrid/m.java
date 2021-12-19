package com.bytedance.lynx.hybrid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.lynx.tasm.provider.b;
import h.e.c;
import h.f.b.l;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class m extends com.lynx.tasm.provider.b {
    static {
        Covode.recordClassIndex(25135);
    }

    static final class b extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b.a $callback;

        static {
            Covode.recordClassIndex(25137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            b.a aVar = this.$callback;
            if (aVar != null) {
                aVar.a("template load error, " + th2.getMessage());
            }
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ b.a $callback;

        static {
            Covode.recordClassIndex(25136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            InputStream inputStream;
            MethodCollector.i(12670);
            e eVar2 = eVar;
            l.c(eVar2, "");
            try {
                File b2 = eVar2.b();
                if (b2.exists()) {
                    inputStream = new FileInputStream(b2);
                } else if (eVar2.t != null) {
                    inputStream = eVar2.t;
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                        b.a aVar = this.$callback;
                        if (aVar != null) {
                            aVar.a(byteArrayOutputStream2.toByteArray());
                        }
                        c.a(byteArrayOutputStream, null);
                    } catch (Throwable th) {
                        c.a(byteArrayOutputStream, th);
                        MethodCollector.o(12670);
                        throw th;
                    }
                } else {
                    b.a aVar2 = this.$callback;
                    if (aVar2 != null) {
                        aVar2.a("file not found");
                    }
                }
            } catch (Throwable th2) {
                b.a aVar3 = this.$callback;
                if (aVar3 != null) {
                    aVar3.a("stream write error, " + th2.getMessage());
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(12670);
            return zVar;
        }
    }

    @Override // com.lynx.tasm.provider.b
    public final void a(String str, b.a aVar) {
        l.c(str, "");
        IResourceService iResourceService = (IResourceService) c.a.a().a(IResourceService.class);
        if (iResourceService != null) {
            com.bytedance.lynx.hybrid.resource.d.b unused = iResourceService.loadAsync(str, new j(), new a(aVar), new b(aVar));
        } else if (aVar != null) {
            aVar.a("ResourceLoader Not Found!");
        }
    }
}
