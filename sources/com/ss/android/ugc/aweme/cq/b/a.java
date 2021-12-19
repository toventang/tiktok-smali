package com.ss.android.ugc.aweme.cq.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.a.c;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a implements com.bytedance.ies.xelement.a.a<c> {

    /* renamed from: a  reason: collision with root package name */
    private final j f78279a;

    static {
        Covode.recordClassIndex(48535);
    }

    public a(j jVar) {
        l.d(jVar, "");
        this.f78279a = jVar;
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ h.f.a.m $reject;

        static {
            Covode.recordClassIndex(48537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.m mVar) {
            super(1);
            this.$reject = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            this.$reject.invoke(th, false);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cq.b.a$a  reason: collision with other inner class name */
    static final class C1819a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ String $resUrl;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1819a(a aVar, h.f.a.b bVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$resolve = bVar;
            this.$resUrl = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0032  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.lynx.hybrid.resource.d.e r8) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cq.b.a.C1819a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.xelement.a.a
    public final void a(String str, h.f.a.b<? super c, z> bVar, h.f.a.m<? super Throwable, ? super Boolean, z> mVar) {
        l.d(str, "");
        l.d(bVar, "");
        l.d(mVar, "");
        IResourceService iResourceService = (IResourceService) c.a.a().a(IResourceService.class);
        if (iResourceService == null) {
            mVar.invoke(new Throwable("resource loader is null"), false);
        } else {
            iResourceService.loadAsync(str, this.f78279a, new C1819a(this, bVar, str), new b(mVar));
        }
    }
}
