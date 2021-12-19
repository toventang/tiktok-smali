package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.HintCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SearchResultListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class i extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public PowerList f102717j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102718k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65790);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b invoke(com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65788);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65789);
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

    public i() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
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
        this.f102718k = bVar;
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f102719a;

        static {
            Covode.recordClassIndex(65791);
        }

        c(i iVar) {
            this.f102719a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            h hVar = (h) com.bytedance.assem.arch.service.d.c(this.f102719a, ab.a(h.class));
            if (hVar != null) {
                hVar.v();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList powerList = (PowerList) s().findViewById(R.id.dme);
        powerList.a(SearchResultListCell.class, HintCell.class);
        powerList.a(new c(this));
        powerList.setItemAnimator(null);
        l.b(powerList, "");
        this.f102717j = powerList;
        f.a.a(this, (ContactListViewModel) this.f102718k.getValue(), j.f102720a, com.bytedance.assem.arch.viewModel.l.a(), new d(this), 4);
        com.bytedance.assem.arch.service.d.a(this, ab.a(h.class), k.f102721a, l.f102722a, new e(this));
    }

    static final class e extends m implements h.f.a.m<com.bytedance.assem.arch.extensions.a<? extends Boolean>, String, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(65793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar, String str) {
            String str2 = str;
            l.d(aVar, "");
            PowerList powerList = this.this$0.f102717j;
            if (powerList == null) {
                l.a("searchResultPowerList");
            }
            powerList.getState().a();
            int i2 = 0;
            if (str2 == null || str2.length() == 0) {
                i2 = 4;
            }
            powerList.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<p, h.p<? extends List<? extends IMUser>, ? extends String>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(65792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, h.p<? extends List<? extends IMUser>, ? extends String> pVar2) {
            h.p<? extends List<? extends IMUser>, ? extends String> pVar3 = pVar2;
            l.d(pVar, "");
            l.d(pVar3, "");
            List<IMUser> list = (List) pVar3.component1();
            String str = (String) pVar3.component2();
            i iVar = this.this$0;
            PowerList powerList = iVar.f102717j;
            if (powerList == null) {
                l.a("searchResultPowerList");
            }
            if (powerList.getVisibility() == 0) {
                PowerList powerList2 = iVar.f102717j;
                if (powerList2 == null) {
                    l.a("searchResultPowerList");
                }
                com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList2.getState();
                state.a();
                if (list.isEmpty()) {
                    state.a(HintCell.f102757a);
                } else {
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (IMUser iMUser : list) {
                        arrayList.add(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.d(iMUser, str));
                    }
                    state.a(arrayList);
                }
            }
            return z.f158842a;
        }
    }
}
