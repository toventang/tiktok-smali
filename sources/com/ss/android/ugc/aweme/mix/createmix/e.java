package com.ss.android.ugc.aweme.mix.createmix;

import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.v;
import com.ss.android.ugc.aweme.mix.mixdetail.x;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends com.bytedance.assem.arch.d.a implements v {

    /* renamed from: j  reason: collision with root package name */
    private n f109847j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109848k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70354);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70352);
    }

    private final MixCreateViewModel u() {
        return (MixCreateViewModel) this.f109848k.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70353);
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

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        a aVar2 = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f109848k = bVar;
    }

    @Override // com.ss.android.ugc.aweme.mix.mixdetail.v
    public final void a(PowerCell<?> powerCell) {
        if (powerCell != null) {
            n nVar = this.f109847j;
            if (nVar == null) {
                l.a("mItemTouchHelper");
            } else {
                nVar.b(powerCell);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList powerList = (PowerList) view.findViewById(R.id.cn6);
        f.a.a(this, u(), f.f109849a, (k) null, new c(powerList), 6);
        powerList.a(MixFeedOrderCell.class);
        powerList.setLifecycleOwner(this);
        powerList.setHasFixedSize(true);
        powerList.a(0, com.a.a(LayoutInflater.from(ar_()), R.layout.akn, null, false));
        l.b(powerList, "");
        n nVar = new n(new x(powerList, u(), true));
        this.f109847j = nVar;
        nVar.a((RecyclerView) powerList);
    }

    static final class c extends m implements h.f.a.m<p, List<? extends Aweme>, z> {
        final /* synthetic */ PowerList $powerList;

        static {
            Covode.recordClassIndex(70355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PowerList powerList) {
            super(2);
            this.$powerList = powerList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            l.d(pVar, "");
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                }
                List k2 = h.a.n.k(arrayList);
                PowerList powerList = this.$powerList;
                l.b(powerList, "");
                powerList.getState().b(k2);
            }
            return z.f158842a;
        }
    }
}
