package com.bytedance.lynx.hybrid.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.lynx.tasm.provider.d;
import com.lynx.tasm.provider.e;
import com.lynx.tasm.provider.f;
import com.lynx.tasm.provider.k;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class c implements k {
    static {
        Covode.recordClassIndex(25174);
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ d $callback;
        final /* synthetic */ e $requestParams;
        final /* synthetic */ f $response;

        static {
            Covode.recordClassIndex(25176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, d dVar, f fVar) {
            super(1);
            this.$requestParams = eVar;
            this.$callback = dVar;
            this.$response = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            com.bytedance.lynx.hybrid.j.c.a("request " + this.$requestParams.f56811a + " failed, " + th2.getMessage(), com.bytedance.lynx.hybrid.j.b.E, "DefaultLynxRequestProvider");
            d dVar = this.$callback;
            if (dVar != null) {
                dVar.onFailed(this.$response);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, z> {
        final /* synthetic */ d $callback;
        final /* synthetic */ e $requestParams;
        final /* synthetic */ f $response;

        static {
            Covode.recordClassIndex(25175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, d dVar, e eVar) {
            super(1);
            this.$response = fVar;
            this.$callback = dVar;
            this.$requestParams = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            InputStream inputStream;
            MethodCollector.i(13998);
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = eVar;
            l.c(eVar2, "");
            try {
                File b2 = eVar2.b();
                f fVar = this.$response;
                if (b2.exists()) {
                    inputStream = new FileInputStream(b2);
                } else if (eVar2.t != null) {
                    inputStream = eVar2.t;
                } else {
                    inputStream = null;
                }
                fVar.f56820d = inputStream;
                d dVar = this.$callback;
                if (dVar != null) {
                    dVar.onSuccess(this.$response);
                }
            } catch (Throwable th) {
                com.bytedance.lynx.hybrid.j.c.a("request " + this.$requestParams.f56811a + " failed, " + th.getMessage(), com.bytedance.lynx.hybrid.j.b.E, "DefaultLynxRequestProvider");
                d dVar2 = this.$callback;
                if (dVar2 != null) {
                    dVar2.onFailed(this.$response);
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(13998);
            return zVar;
        }
    }

    @Override // com.lynx.tasm.provider.k
    public final void a(e eVar, d dVar) {
        l.c(eVar, "");
        IResourceService iResourceService = (IResourceService) c.a.a().a(IResourceService.class);
        f fVar = new f();
        if (iResourceService == null) {
            fVar.f56817a = -100;
            if (dVar != null) {
                dVar.onFailed(fVar);
            }
            com.bytedance.lynx.hybrid.j.c.a("request " + eVar.f56811a + " failed, for no resourceLoader found", com.bytedance.lynx.hybrid.j.b.E, "DefaultLynxRequestProvider");
            return;
        }
        String str = eVar.f56811a;
        l.a((Object) str, "");
        com.bytedance.lynx.hybrid.resource.d.b unused = iResourceService.loadAsync(str, new j(), new a(fVar, dVar, eVar), new b(eVar, dVar, fVar));
    }
}
