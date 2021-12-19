package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell;
import com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.comment.page.tag.d;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72173j;

    /* renamed from: k  reason: collision with root package name */
    private PowerList f72174k;

    /* renamed from: l  reason: collision with root package name */
    private final i f72175l;

    public static final class b extends m implements h.f.a.b<f, f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44432);
        }

        public b() {
            super(1);
        }

        public final f invoke(f fVar) {
            l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(44430);
    }

    private final d.C1624d u() {
        return (d.C1624d) this.f72175l.getValue();
    }

    static final class e extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(44435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$a  reason: collision with other inner class name */
    public static final class C1621a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1621a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<d.C1624d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(44433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.comment.page.tag.d$d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.page.tag.d.C1624d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.d$d> r1 = com.ss.android.ugc.aweme.comment.page.tag.d.C1624d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.a.a.c.invoke():java.lang.Object");
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        e eVar = new e(this);
        h.k.c a2 = ab.a(FeedTaggedListViewModel.class);
        C1621a aVar = new C1621a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), eVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), eVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), eVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f72173j = bVar;
        this.f72175l = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList powerList = (PowerList) s().findViewById(R.id.b24);
        l.b(powerList, "");
        this.f72174k = powerList;
        if (powerList == null) {
            l.a("taggedList");
        }
        if (powerList != null) {
            powerList.a(FeedTaggedListCell.class, FeedTaggedEditCell.class);
            powerList.setItemAnimator(null);
        }
        ArrayList<User> arrayList = u().f72246b;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (T t : arrayList) {
                PowerList powerList2 = this.f72174k;
                if (powerList2 == null) {
                    l.a("taggedList");
                }
                powerList2.getState().a(new com.ss.android.ugc.aweme.comment.page.tag.e(t, new com.ss.android.ugc.aweme.comment.page.tag.f(u().f72245a, u().f72247c)));
                arrayList2.add(z.f158842a);
            }
        }
        Aweme aweme = u().f72245a;
        if (aweme != null && g.c() && in.a(aweme.getAuthorUid())) {
            PowerList powerList3 = this.f72174k;
            if (powerList3 == null) {
                l.a("taggedList");
            }
            powerList3.getState().a(new com.ss.android.ugc.aweme.comment.page.tag.c(new com.ss.android.ugc.aweme.comment.page.tag.f(aweme, u().f72247c)));
        }
        f.a.a(this, (FeedTaggedListViewModel) this.f72173j.getValue(), b.f72177a, (k) null, d.f72176a, 6);
    }

    static final class d extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.e>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f72176a = new d();

        static {
            Covode.recordClassIndex(44434);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.e> aVar) {
            p pVar2 = pVar;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.e> aVar2 = aVar;
            l.d(pVar2, "");
            if (!(aVar2 == null || aVar2.f25631b == null)) {
                ((TuxIconView) pVar2.s().findViewById(R.id.a7l)).performClick();
            }
            return z.f158842a;
        }
    }
}
