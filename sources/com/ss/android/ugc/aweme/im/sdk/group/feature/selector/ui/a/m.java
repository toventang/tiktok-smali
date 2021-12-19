package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SelectedListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class m extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    PowerList f102723j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102724k;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65799);
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
        Covode.recordClassIndex(65797);
    }

    public final ContactListViewModel u() {
        return (ContactListViewModel) this.f102724k.getValue();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65798);
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

    public m() {
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
        this.f102724k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        View s = s();
        if (s == null) {
            l.b();
        }
        PowerList powerList = (PowerList) s.findViewById(R.id.dy1);
        powerList.a(SelectedListCell.class);
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        powerList.setLayoutManager(linearLayoutManager);
        l.b(powerList, "");
        this.f102723j = powerList;
        f.a.a(this, u(), n.f102725a, com.bytedance.assem.arch.viewModel.l.a(), new c(this), 4);
        f.a.a(this, u(), o.f102726a, com.bytedance.assem.arch.viewModel.l.a(), new d(this), 4);
    }

    static final class c extends h.f.b.m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends List<? extends IMUser>>, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(65800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends List<? extends IMUser>> aVar) {
            l.d(pVar, "");
            l.d(aVar, "");
            m mVar = this.this$0;
            List<IMUser> k2 = mVar.u().k();
            PowerList powerList = mVar.f102723j;
            if (powerList == null) {
                l.a("selectedPowerList");
            }
            com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
            state.a();
            Iterator<T> it = k2.iterator();
            while (it.hasNext()) {
                state.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b(it.next()));
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(65801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                m mVar = this.this$0;
                boolean a2 = mVar.u().a((IMUser) t);
                PowerList powerList = mVar.f102723j;
                if (powerList == null) {
                    l.a("selectedPowerList");
                }
                com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
                if (a2) {
                    state.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b(t));
                    PowerList powerList2 = mVar.f102723j;
                    if (powerList2 == null) {
                        l.a("selectedPowerList");
                    }
                    PowerList powerList3 = mVar.f102723j;
                    if (powerList3 == null) {
                        l.a("selectedPowerList");
                    }
                    powerList2.b(powerList3.getState().b() - 1);
                } else {
                    state.b(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b(t));
                }
            }
            return z.f158842a;
        }
    }
}
