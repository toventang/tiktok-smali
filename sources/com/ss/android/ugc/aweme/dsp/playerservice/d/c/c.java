package com.ss.android.ugc.aweme.dsp.playerservice.d.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.o;
import com.ss.android.ugc.aweme.dsp.playerservice.a.p;
import com.ss.android.ugc.aweme.dsp.playerservice.b.d;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class c implements p {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<o> f83513a = new com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<>();

    static {
        Covode.recordClassIndex(52112);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83513a.f83515a.clear();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void a(o oVar) {
        l.d(oVar, "");
        this.f83513a.a(oVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void b(o oVar) {
        l.d(oVar, "");
        this.f83513a.b(oVar);
    }

    static final class a extends m implements h.f.a.b<o, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c $playable;
        final /* synthetic */ z.a $result;

        static {
            Covode.recordClassIndex(52113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z.a aVar, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
            super(1);
            this.$result = aVar;
            this.$playable = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            if (!this.$result.element) {
                this.$result.element = oVar2.f(this.$playable);
            }
            return h.z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<o, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.c.c $playMode;
        final /* synthetic */ z.a $result;

        static {
            Covode.recordClassIndex(52114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.a aVar, com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
            super(1);
            this.$result = aVar;
            this.$playMode = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            if (!this.$result.element) {
                this.$result.element = oVar2.c(this.$playMode);
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.c.c$c  reason: collision with other inner class name */
    static final class C1972c extends m implements h.f.a.b<o, h.z> {
        final /* synthetic */ d $playableQueue;
        final /* synthetic */ z.a $result;

        static {
            Covode.recordClassIndex(52115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1972c(z.a aVar, d dVar) {
            super(1);
            this.$result = aVar;
            this.$playableQueue = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            if (!this.$result.element) {
                this.$result.element = oVar2.d(this.$playableQueue);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        z.a aVar = new z.a();
        aVar.element = false;
        this.f83513a.a(new b(aVar, cVar));
        return aVar.element;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean d(d dVar) {
        l.d(dVar, "");
        z.a aVar = new z.a();
        aVar.element = false;
        this.f83513a.a(new C1972c(aVar, dVar));
        return aVar.element;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean f(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        z.a aVar = new z.a();
        aVar.element = false;
        this.f83513a.a(new a(aVar, cVar));
        return aVar.element;
    }
}
