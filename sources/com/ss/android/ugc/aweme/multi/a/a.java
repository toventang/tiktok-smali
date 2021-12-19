package com.ss.android.ugc.aweme.multi.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.multi.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a extends b {
    static {
        Covode.recordClassIndex(71139);
    }

    @Override // com.ss.android.ugc.aweme.multi.a.b
    public final boolean a(d dVar) {
        l.d(dVar, "");
        if (dVar.g() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2833a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.c f110879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.base.ui.anchor.c f110881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f110882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f110883e;

        static {
            Covode.recordClassIndex(71140);
        }

        View$OnClickListenerC2833a(com.ss.android.ugc.aweme.multi.c cVar, a aVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar2, d dVar, h.f.a.b bVar) {
            this.f110879a = cVar;
            this.f110880b = aVar;
            this.f110881c = cVar2;
            this.f110882d = dVar;
            this.f110883e = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.multi.c cVar = this.f110879a;
            d dVar = this.f110882d;
            cVar.c(com.ss.android.ugc.aweme.anchor.multi.a.b.a(dVar, cVar, this.f110880b.a(dVar)));
            this.f110883e.invoke(true);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.multi.c, z> {
        final /* synthetic */ h.f.a.b $openDialogTask;

        static {
            Covode.recordClassIndex(71141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.b bVar) {
            super(1);
            this.$openDialogTask = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.multi.c cVar) {
            l.d(cVar, "");
            this.$openDialogTask.invoke(false);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d $chain;
        final /* synthetic */ com.ss.android.ugc.aweme.base.ui.anchor.c $tagView;

        static {
            Covode.recordClassIndex(71142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.base.ui.anchor.c cVar, d dVar) {
            super(1);
            this.$tagView = cVar;
            this.$chain = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            Context context = this.$tagView.g().getContext();
            l.b(context, "");
            new com.ss.android.ugc.aweme.multi.ui.b(context, this.$chain, booleanValue).show();
            if (booleanValue) {
                for (com.ss.android.ugc.aweme.multi.c cVar : this.$chain.f110896a) {
                    cVar.a(this.$chain);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a, com.ss.android.ugc.aweme.multi.a.b
    public final void b(d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        super.b(dVar, cVar);
        if (dVar.g() < 2) {
            a(dVar, cVar);
            return;
        }
        c cVar2 = new c(cVar, dVar);
        com.ss.android.ugc.aweme.multi.c cVar3 = (com.ss.android.ugc.aweme.multi.c) n.g((List) dVar.f110896a);
        cVar3.a().a(false);
        cVar.h().setOnClickListener(new View$OnClickListenerC2833a(cVar3, this, cVar, dVar, cVar2));
        a(dVar, new b(cVar2));
        try {
            Object g2 = n.g((List) dVar.f110896a);
            List<AnchorCommonStruct> anchors = dVar.f110897b.getAnchors();
            l.b(anchors, "");
            if (!(anchors instanceof Collection) || !anchors.isEmpty()) {
                Iterator<T> it = anchors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (!(next.getType() == ab.ANCHOR_SHOP_MIX.getTYPE() || next.getType() == ab.ANCHOR_SHOP_WINDOW.getTYPE())) {
                        if (next.getType() != ab.ANCHOR_SHOP_LINK.getTYPE()) {
                            cVar.e().setText(R.string.hcj);
                            break;
                        }
                    }
                }
                q.m223constructorimpl((com.ss.android.ugc.aweme.multi.c) g2);
                cVar.g().setVisibility(0);
                TextView f2 = cVar.f();
                f2.setVisibility(0);
                f2.setText("(" + dVar.g() + ')');
            }
            cVar.e().setText(R.string.hcl);
            q.m223constructorimpl((com.ss.android.ugc.aweme.multi.c) g2);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        cVar.g().setVisibility(0);
        TextView f22 = cVar.f();
        f22.setVisibility(0);
        f22.setText("(" + dVar.g() + ')');
    }
}
