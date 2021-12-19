package com.ss.android.ugc.aweme.dsp.playerservice.d.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.a.n;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class e implements n {

    /* renamed from: a  reason: collision with root package name */
    public d f83501a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<m> f83502b = new com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<>();

    static {
        Covode.recordClassIndex(52107);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83502b.a(a.f83503a);
        this.f83502b.f83515a.clear();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83501a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83501a = dVar;
    }

    static final class a extends h.f.b.m implements b<m, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f83503a = new a();

        static {
            Covode.recordClassIndex(52108);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(m mVar) {
            m mVar2 = mVar;
            l.d(mVar2, "");
            mVar2.bc_();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.n
    public final void a(m mVar) {
        l.d(mVar, "");
        mVar.a(v());
        mVar.bb_();
        this.f83502b.a(mVar);
    }
}
