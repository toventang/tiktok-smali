package com.ss.android.ugc.aweme.dsp.playerservice.d.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d implements r {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<q> f83514a = new com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<>();

    static {
        Covode.recordClassIndex(52116);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83514a.f83515a.clear();
    }

    static final class a extends m implements h.f.a.b<q, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c $playable;

        static {
            Covode.recordClassIndex(52117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
            super(1);
            this.$playable = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            qVar2.b(this.$playable);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<q, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.c.c $playMode;

        static {
            Covode.recordClassIndex(52118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
            super(1);
            this.$playMode = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            qVar2.a(this.$playMode);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<q, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.d $playableQueue;

        static {
            Covode.recordClassIndex(52119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
            super(1);
            this.$playableQueue = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            qVar2.a(this.$playableQueue);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.c.d$d  reason: collision with other inner class name */
    static final class C1973d extends m implements h.f.a.b<q, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.d $playableQueue;

        static {
            Covode.recordClassIndex(52120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1973d(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
            super(1);
            this.$playableQueue = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            qVar2.b(this.$playableQueue);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void a(q qVar) {
        l.d(qVar, "");
        this.f83514a.a(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void b(q qVar) {
        l.d(qVar, "");
        this.f83514a.b(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        this.f83514a.a(new c(dVar));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        this.f83514a.a(new a(cVar));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        this.f83514a.a(new b(cVar));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        this.f83514a.a(new C1973d(dVar));
    }
}
