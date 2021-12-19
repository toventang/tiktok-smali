package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.comment.page.tag.SelectedListCell;
import com.ss.android.ugc.aweme.comment.page.tag.g;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class j extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    PowerList f72191j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72192k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44458);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44456);
    }

    public final VideoTagFriendsListViewModel u() {
        return (VideoTagFriendsListViewModel) this.f72192k.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public j() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoTagFriendsListViewModel.class);
        a aVar = new a(a2);
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
        this.f72192k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList powerList = (PowerList) s().findViewById(R.id.dy1);
        powerList.a(SelectedListCell.class);
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        powerList.setLayoutManager(linearLayoutManager);
        l.b(powerList, "");
        this.f72191j = powerList;
        f.a.a(this, u(), k.f72193a, com.bytedance.assem.arch.viewModel.l.a(), new c(this), 4);
        f.a.a(this, u(), l.f72194a, com.bytedance.assem.arch.viewModel.l.a(), new d(this), 4);
        f.a.a(this, u(), m.f72195a, com.bytedance.assem.arch.viewModel.l.a(), new e(this), 4);
    }

    static final class d extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(44460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                j jVar = this.this$0;
                jVar.a(t, jVar.u().c((IMUser) t));
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(44461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.a((IMUser) t, false);
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a>, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(44459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a> aVar) {
            l.d(pVar, "");
            j jVar = this.this$0;
            List<IMUser> k2 = n.k(jVar.u().i());
            PowerList powerList = jVar.f72191j;
            if (powerList == null) {
                l.a("selectedList");
            }
            com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
            state.a();
            for (IMUser iMUser : k2) {
                state.a(new g(iMUser));
            }
            return z.f158842a;
        }
    }

    public final void a(IMUser iMUser, boolean z) {
        PowerList powerList = this.f72191j;
        if (powerList == null) {
            l.a("selectedList");
        }
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
        if (z) {
            state.a(new g(iMUser));
            PowerList powerList2 = this.f72191j;
            if (powerList2 == null) {
                l.a("selectedList");
            }
            PowerList powerList3 = this.f72191j;
            if (powerList3 == null) {
                l.a("selectedList");
            }
            powerList2.b(powerList3.getState().b() - 1);
            return;
        }
        state.b(new g(iMUser));
    }
}
