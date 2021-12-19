package com.ss.android.ugc.aweme.upvote.detail.panel;

import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.g;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;

public abstract class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private final i f142167j = new i(bQ_(), new c(this, null));

    /* renamed from: k  reason: collision with root package name */
    private final h f142168k = h.i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f142169l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.a.a f142170m;

    public static final class b extends m implements h.f.a.b<l, l> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(92924);
        }

        public b() {
            super(1);
        }

        public final l invoke(l lVar) {
            l.c(lVar, "");
            return lVar;
        }
    }

    public static final class d extends m implements h.f.a.b<g, g> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(92926);
        }

        public d() {
            super(1);
        }

        public final g invoke(g gVar) {
            l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(92922);
    }

    /* access modifiers changed from: protected */
    public final f u() {
        return (f) this.f142167j.getValue();
    }

    /* access modifiers changed from: protected */
    public final UpvoteListViewModel v() {
        return (UpvoteListViewModel) this.f142168k.getValue();
    }

    /* access modifiers changed from: protected */
    public final UpvoteDetailPanelViewModel w() {
        return (UpvoteDetailPanelViewModel) this.f142169l.getValue();
    }

    /* access modifiers changed from: protected */
    public final UpvotePublishVM x() {
        return (UpvotePublishVM) this.f142170m.getValue();
    }

    static final class e extends m implements h.f.a.a<UpvoteListViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ UpvoteListViewModel invoke() {
            return com.ss.android.ugc.aweme.upvote.detail.d.a(this.this$0.u().f142184b, this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.a$a  reason: collision with other inner class name */
    public static final class C3793a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(92923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3793a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<f> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(92925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.upvote.detail.panel.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.upvote.detail.panel.f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.upvote.detail.panel.f> r1 = com.ss.android.ugc.aweme.upvote.detail.panel.f.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.a.c.invoke():java.lang.Object");
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(UpvoteDetailPanelViewModel.class);
        C3793a aVar = new C3793a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f142169l = bVar;
        this.f142170m = new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, d.INSTANCE, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
    }
}
