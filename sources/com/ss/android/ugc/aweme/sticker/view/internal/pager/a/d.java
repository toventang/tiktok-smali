package com.ss.android.ugc.aweme.sticker.view.internal.pager.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;

public final class d extends b {
    static {
        Covode.recordClassIndex(89058);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f, com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b
    public final void a(h<Effect, a<Effect>> hVar) {
        l.d(hVar, "");
        super.a(hVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b
    public final void b(h<Effect, a<Effect>> hVar) {
        l.d(hVar, "");
        hVar.a(h.a.C3556a.f136382a, new a(this));
    }

    static final class a extends m implements b<ViewGroup, a<Effect>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            k kVar = this.this$0.f136361e.f135207g;
            Context context = viewGroup2.getContext();
            l.b(context, "");
            p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context);
            FrameLayout component1 = a2.component1();
            com.ss.android.ugc.tools.view.widget.c.b component2 = a2.component2();
            if (this.this$0.f136361e.f135207g.t) {
                com.ss.android.ugc.aweme.sticker.panel.b.a.h hVar = new com.ss.android.ugc.aweme.sticker.panel.b.a.h(component1, component2, this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
                hVar.f135051a = this.this$0.f136362f;
                return hVar;
            }
            com.ss.android.ugc.aweme.sticker.panel.b.a.h hVar2 = new com.ss.android.ugc.aweme.sticker.panel.b.a.h(component1, component2, this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
            hVar2.f135051a = this.this$0.f136362f;
            return hVar2;
        }
    }

    public /* synthetic */ d(o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b bVar, com.ss.android.ugc.aweme.sticker.panel.h hVar, com.ss.android.ugc.aweme.sticker.panel.a.b bVar2, com.ss.android.ugc.aweme.sticker.types.lock.a aVar) {
        this(oVar, gVar, bVar, hVar, bVar2, aVar, new l.a(null, null, null, 127));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar, com.ss.android.ugc.aweme.sticker.panel.h hVar, com.ss.android.ugc.aweme.sticker.panel.a.b bVar2, com.ss.android.ugc.aweme.sticker.types.lock.a aVar, l.a aVar2) {
        super(oVar, gVar, bVar, hVar, bVar2, aVar, aVar2, null, Integer.MAX_VALUE);
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(aVar2, "");
    }
}
