package com.bytedance.j.a.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.lynx.tasm.provider.d;
import com.lynx.tasm.provider.e;
import com.lynx.tasm.provider.f;
import com.lynx.tasm.provider.k;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final o f39038a;

    static {
        Covode.recordClassIndex(23896);
    }

    public b(o oVar) {
        l.c(oVar, "");
        this.f39038a = oVar;
    }

    /* renamed from: com.bytedance.j.a.f.b$b  reason: collision with other inner class name */
    static final class C0929b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ d $callback;
        final /* synthetic */ e $requestParams;
        final /* synthetic */ f $response;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(23898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0929b(b bVar, e eVar, d dVar, f fVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.f39038a.printLog("request " + this.$requestParams.f56811a + " failed, " + th2.getMessage(), p.E, "DefaultLynxRequestProvider");
            d dVar = this.$callback;
            if (dVar != null) {
                dVar.onFailed(this.$response);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ d $callback;
        final /* synthetic */ e $requestParams;
        final /* synthetic */ f $response;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(23897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, f fVar, d dVar, e eVar) {
            super(1);
            this.this$0 = bVar;
            this.$response = fVar;
            this.$callback = dVar;
            this.$requestParams = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            ap apVar2 = apVar;
            l.c(apVar2, "");
            try {
                this.$response.f56820d = apVar2.a();
                d dVar = this.$callback;
                if (dVar != null) {
                    dVar.onSuccess(this.$response);
                }
            } catch (Throwable th) {
                this.this$0.f39038a.printLog("request " + this.$requestParams.f56811a + " failed, " + th.getMessage(), p.E, "DefaultLynxRequestProvider");
                d dVar2 = this.$callback;
                if (dVar2 != null) {
                    dVar2.onFailed(this.$response);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.provider.k
    public final void a(e eVar, d dVar) {
        l.c(eVar, "");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.f39038a.b_(IResourceLoaderService.class);
        f fVar = new f();
        if (iResourceLoaderService == null) {
            fVar.f56817a = -100;
            if (dVar != null) {
                dVar.onFailed(fVar);
            }
            this.f39038a.printLog("request " + eVar.f56811a + " failed, for no resourceLoader found", p.E, "DefaultLynxRequestProvider");
            return;
        }
        String str = eVar.f56811a;
        l.a((Object) str, "");
        j jVar = new j();
        jVar.d("sub_source");
        jVar.s = this.f39038a;
        iResourceLoaderService.loadAsync(str, jVar, new a(this, fVar, dVar, eVar), new C0929b(this, eVar, dVar, fVar));
    }
}
