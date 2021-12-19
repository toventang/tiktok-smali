package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.o;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.b {

    /* renamed from: a  reason: collision with root package name */
    public o f92895a;

    static {
        Covode.recordClassIndex(58928);
    }

    public final o a() {
        o oVar = this.f92895a;
        if (oVar == null) {
            l.a("playerController");
        }
        return oVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> bVar) {
        l.d(bVar, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    static final class a extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.a().B();
                this.this$0.a().M().y();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.b$b  reason: collision with other inner class name */
    static final class C2260b extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2260b(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2260b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2260b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.a().C();
                this.this$0.a().M().y();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(c cVar) {
        String str;
        o oVar = this.f92895a;
        if (oVar == null) {
            l.a("playerController");
        }
        Aweme z = oVar.z();
        o oVar2 = this.f92895a;
        if (oVar2 == null) {
            l.a("playerController");
        }
        Aweme I = oVar2.I();
        o oVar3 = this.f92895a;
        if (oVar3 == null) {
            l.a("playerController");
        }
        al s = oVar3.s();
        if (s != null) {
            str = s.a_(true);
        } else {
            str = null;
        }
        if (!(z == null || I == null || str == null)) {
            com.ss.android.ugc.aweme.feed.helper.a.a(z, I, str, "click_audio_previous");
        }
        com.ss.android.ugc.aweme.feed.helper.a.f93313a = true;
        bz unused = i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new C2260b(this, null), 3);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void b(c cVar) {
        String str;
        o oVar = this.f92895a;
        if (oVar == null) {
            l.a("playerController");
        }
        Aweme I = oVar.I();
        o oVar2 = this.f92895a;
        if (oVar2 == null) {
            l.a("playerController");
        }
        Aweme A = oVar2.A();
        o oVar3 = this.f92895a;
        if (oVar3 == null) {
            l.a("playerController");
        }
        al s = oVar3.s();
        if (s != null) {
            str = s.a_(true);
        } else {
            str = null;
        }
        if (!(I == null || A == null || str == null)) {
            com.ss.android.ugc.aweme.feed.helper.a.a(I, A, str, "click_audio_next");
        }
        com.ss.android.ugc.aweme.feed.helper.a.f93313a = true;
        bz unused = i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new a(this, null), 3);
    }
}
