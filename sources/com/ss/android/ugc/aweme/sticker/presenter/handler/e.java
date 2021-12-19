package com.ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends AVChallenge> f135391a;

    /* renamed from: b  reason: collision with root package name */
    private final m<List<String>, b<? super List<? extends AVChallenge>, z>, z> f135392b;

    static {
        Covode.recordClassIndex(88441);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135391a = null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return true;
    }

    static final class a extends h.f.b.m implements b<List<? extends AVChallenge>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(88442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(List<? extends AVChallenge> list) {
            this.this$0.f135391a = list;
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super java.util.List<java.lang.String>, ? super h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.AVChallenge>, h.z>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(m<? super List<String>, ? super b<? super List<? extends AVChallenge>, z>, z> mVar) {
        l.d(mVar, "");
        this.f135392b = mVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        Effect effect = aVar.f135378a;
        this.f135391a = null;
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            this.f135392b.invoke(challenge, new a(this));
        }
    }
}
