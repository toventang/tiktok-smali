package com.ss.android.ugc.aweme.upvote.detail.panel;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class g extends a {

    /* renamed from: j  reason: collision with root package name */
    public PowerList f142187j;

    /* renamed from: k  reason: collision with root package name */
    private final h f142188k = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(92949);
    }

    public final a.AnonymousClass1 y() {
        return (a.AnonymousClass1) this.f142188k.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(92950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34358c = LoadingFooterCell.class;
            cVar.f34356a = 5;
            return new com.bytedance.ies.powerlist.page.config.b<Long>(this, cVar) {
                /* class com.ss.android.ugc.aweme.upvote.detail.panel.g.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public kotlinx.coroutines.m<? super com.bytedance.ies.powerlist.page.f<Long>> f142189a;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f142190e;

                /* renamed from: f  reason: collision with root package name */
                private boolean f142191f = true;

                /* renamed from: g  reason: collision with root package name */
                private final C3796a f142192g = new C3796a(this);

                static {
                    Covode.recordClassIndex(92951);
                }

                /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$a$1$a  reason: collision with other inner class name */
                public static final class C3796a implements com.ss.android.ugc.aweme.upvote.detail.a {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f142193a;

                    static {
                        Covode.recordClassIndex(92952);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    C3796a(AnonymousClass1 r1) {
                        this.f142193a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.upvote.detail.a
                    public final void a(Throwable th, long j2) {
                        l.d(th, "");
                        if (!AnonymousClass1.a(this.f142193a).c() && !AnonymousClass1.a(this.f142193a).b()) {
                            AnonymousClass1.a(this.f142193a).resumeWith(q.m223constructorimpl(f.a.a((Exception) th)));
                            this.f142193a.a(j2, th);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.upvote.detail.a
                    public final void a(com.ss.android.ugc.aweme.upvote.c.e eVar, long j2) {
                        l.d(eVar, "");
                        if (!(AnonymousClass1.a(this.f142193a).c() || AnonymousClass1.a(this.f142193a).b())) {
                            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes = eVar.getUpvotes();
                            ArrayList arrayList = new ArrayList(n.a((Iterable) upvotes, 10));
                            for (T t : upvotes) {
                                arrayList.add(new com.ss.android.ugc.aweme.upvote.detail.cell.d(t, this.f142193a.f142190e.this$0.v().f142050d, this.f142193a.a((com.ss.android.ugc.aweme.upvote.c.h) t)));
                            }
                            ArrayList arrayList2 = arrayList;
                            if (eVar.getHasMore()) {
                                AnonymousClass1.a(this.f142193a).resumeWith(q.m223constructorimpl(f.a.a(null, Long.valueOf(eVar.getCursor()), arrayList2, 1)));
                            } else {
                                AnonymousClass1.a(this.f142193a).resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                            }
                            this.f142193a.a(j2, (Throwable) null);
                        }
                    }
                }

                public static final /* synthetic */ kotlinx.coroutines.m a(AnonymousClass1 r1) {
                    kotlinx.coroutines.m<? super com.bytedance.ies.powerlist.page.f<Long>> mVar = r1.f142189a;
                    if (mVar == null) {
                        l.a("continuation");
                    }
                    return mVar;
                }

                public final boolean a(com.ss.android.ugc.aweme.upvote.c.h hVar) {
                    if (!hVar.isPublished() || !this.f142190e.this$0.u().f142186d || !l.a((Object) hVar.getCommentId(), (Object) this.f142190e.this$0.u().f142185c)) {
                        return false;
                    }
                    return true;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$a$1$b */
                public static final class b extends m implements h.f.a.b<l, z> {
                    final /* synthetic */ Throwable $t;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(92953);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(AnonymousClass1 r2, Throwable th) {
                        super(1);
                        this.this$0 = r2;
                        this.$t = th;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(l lVar) {
                        q qVar;
                        boolean z;
                        l.d(lVar, "");
                        com.ss.android.ugc.aweme.upvote.c.e value = this.this$0.f142190e.this$0.v().a().getValue();
                        if (this.$t != null) {
                            qVar = q.ERROR;
                        } else if (value == null || (value.getUpvotes().isEmpty() && !value.getHasMore())) {
                            qVar = q.EMPTY;
                        } else {
                            qVar = q.LOADED;
                        }
                        if (this.$t != null || this.this$0.f142190e.this$0.v().b()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        UpvoteDetailPanelViewModel w = this.this$0.f142190e.this$0.w();
                        l.d(qVar, "");
                        w.a(new UpvoteDetailPanelViewModel.f(qVar, z));
                        return z.f158842a;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
                    l.d(dVar, "");
                    this.f142189a = (kotlinx.coroutines.m) dVar;
                    com.ss.android.ugc.aweme.upvote.c.e value = this.f142190e.this$0.v().a().getValue();
                    boolean z = false;
                    if (!this.f142190e.this$0.u().f142186d || !this.f142191f ? value != null : !(!(!((Boolean) com.ss.android.ugc.aweme.upvote.d.b.f142040b.getValue()).booleanValue()) || value == null)) {
                        z = true;
                    }
                    if (z) {
                        C3796a aVar = this.f142192g;
                        if (value == null) {
                            l.b();
                        }
                        aVar.a(value, 0);
                        return;
                    }
                    this.f142190e.this$0.v().a(this.f142192g, this.f142190e.this$0.u().f142185c, 0);
                }

                {
                    this.f142190e = r2;
                }

                public final void a(long j2, Throwable th) {
                    this.f142191f = false;
                    if (j2 <= 0) {
                        g.a(this.f142190e.this$0.w(), new b(this, th));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    l.d(dVar, "");
                    this.f142189a = (kotlinx.coroutines.m) dVar;
                    UpvoteListViewModel.a(this.f142190e.this$0.v(), this.f142192g, null, longValue, 2);
                }
            };
        }
    }

    public static final class b extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f142194a;

        static {
            Covode.recordClassIndex(92954);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(g gVar) {
            this.f142194a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            if (i2 == 0) {
                g.a(this.f142194a).b(0);
            }
        }
    }

    public static final /* synthetic */ PowerList a(g gVar) {
        PowerList powerList = gVar.f142187j;
        if (powerList == null) {
            l.a("upvotePowerList");
        }
        return powerList;
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.fck);
        l.b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f142187j = powerList;
        if (powerList == null) {
            l.a("upvotePowerList");
        }
        powerList.a(UpvoteDetailPanelListCell.class);
        PowerList powerList2 = this.f142187j;
        if (powerList2 == null) {
            l.a("upvotePowerList");
        }
        powerList2.a(y());
        PowerList powerList3 = this.f142187j;
        if (powerList3 == null) {
            l.a("upvotePowerList");
        }
        powerList3.setItemAnimator(null);
        PowerList powerList4 = this.f142187j;
        if (powerList4 == null) {
            l.a("upvotePowerList");
        }
        RecyclerView.a adapter = powerList4.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new b(this));
        }
        f.a.a(this, w(), h.f142195a, (k) null, new c(this), 6);
        f.a.a(this, w(), i.f142196a, (k) null, new d(this), 6);
        f.a.a(this, w(), j.f142197a, com.bytedance.assem.arch.viewModel.l.a(), new e(this), 4);
        f.a.a(this, x(), k.f142198a, com.bytedance.assem.arch.viewModel.l.a(), new f(this), 4);
    }

    static final class c extends m implements h.f.a.m<p, q, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(92955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, q qVar) {
            int i2;
            l.d(pVar, "");
            l.d(qVar, "");
            PowerList a2 = g.a(this.this$0);
            if (qVar == q.LOADED) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(92956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            int a2;
            boolean booleanValue = bool.booleanValue();
            l.d(pVar, "");
            if (booleanValue) {
                a2 = 0;
            } else {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 68.0f, system.getDisplayMetrics()));
            }
            com.bytedance.tux.h.i.b(g.a(this.this$0), null, null, null, Integer.valueOf(a2), false, 23);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(92957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            if (aVar2.f25631b.booleanValue()) {
                this.this$0.y().f34367c.e();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Integer, ? extends String>>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(92958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Integer, ? extends String>> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends h.p<? extends Integer, ? extends String>> aVar2 = aVar;
            l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                if (l.a((Object) this.this$0.v().f142048b, t.component2())) {
                    this.this$0.y().f34367c.e();
                }
            }
            return z.f158842a;
        }
    }
}
