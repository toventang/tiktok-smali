package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class j implements com.bytedance.ies.bullet.c.e.b.a<c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.bytedance.ies.bullet.c.e.b.a<c>> f32037a;

    static {
        Covode.recordClassIndex(18745);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c>> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends com.bytedance.ies.bullet.c.e.b.a<c>> list) {
        l.c(list, "");
        this.f32037a = list;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<Throwable, z> {
        final /* synthetic */ c $input;
        final /* synthetic */ Iterator $iterator;
        final /* synthetic */ b $reject;
        final /* synthetic */ b $resolve;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, Iterator it, c cVar, b bVar, b bVar2) {
            super(1);
            this.this$0 = jVar;
            this.$iterator = it;
            this.$input = cVar;
            this.$resolve = bVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.c(th, "");
            if (this.$iterator.hasNext()) {
                this.this$0.a(this.$iterator, this.$input, this.$resolve, this.$reject);
            } else {
                this.$reject.invoke(th);
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.f.a.b, h.f.a.b] */
    @Override // com.bytedance.ies.bullet.c.e.b.a
    public final /* synthetic */ void a(c cVar, b<? super c, z> bVar, b bVar2) {
        c cVar2 = cVar;
        l.c(cVar2, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        Iterator<com.bytedance.ies.bullet.c.e.b.a<c>> it = this.f32037a.iterator();
        if (!it.hasNext()) {
            bVar2.invoke(new Throwable("None of BridgeRegistryTransformer processor for func name: " + cVar2.f31999a));
        } else {
            a(it, cVar2, bVar, bVar2);
        }
    }

    public final void a(Iterator<? extends com.bytedance.ies.bullet.c.e.b.a<c>> it, c cVar, b<? super c, z> bVar, b<? super Throwable, z> bVar2) {
        try {
            ((com.bytedance.ies.bullet.c.e.b.a) it.next()).a(cVar, bVar, new a(this, it, cVar, bVar, bVar2));
        } catch (Exception e2) {
            bVar2.invoke(e2);
        }
    }
}
