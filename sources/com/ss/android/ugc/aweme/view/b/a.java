package com.ss.android.ugc.aweme.view.b;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.e;
import com.ss.android.ugc.aweme.model.g;
import com.ss.android.ugc.aweme.model.h;
import com.ss.android.ugc.aweme.model.j;
import com.ss.android.ugc.aweme.model.n;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.model.s;
import com.ss.android.ugc.aweme.model.u;
import com.ss.android.ugc.aweme.view.a.f;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends f implements f.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3835a f144106b = new C3835a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public u f144107a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f144108c;

    static {
        Covode.recordClassIndex(94302);
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final int a() {
        return R.layout.api;
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final View a(int i2) {
        if (this.f144108c == null) {
            this.f144108c = new SparseArray();
        }
        View view = (View) this.f144108c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144108c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final void c() {
        SparseArray sparseArray = this.f144108c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.b.f
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.a$a  reason: collision with other inner class name */
    public static final class C3835a {
        static {
            Covode.recordClassIndex(94303);
        }

        private C3835a() {
        }

        public /* synthetic */ C3835a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final void b() {
        RecyclerView recyclerView;
        if (this.f144107a != null) {
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.da1);
            if (recyclerView2 != null) {
                getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            }
            d();
            q qVar = r.f110811a;
            if (qVar != null && (recyclerView = (RecyclerView) a(R.id.da1)) != null) {
                u uVar = this.f144107a;
                if (uVar == null) {
                    l.b();
                }
                recyclerView.setAdapter(new f(qVar, uVar, this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.f.a
    public final void a(d dVar) {
        String str;
        l.d(dVar, "");
        u uVar = this.f144107a;
        if (uVar != null) {
            str = uVar.a();
        } else {
            str = null;
        }
        String a2 = dVar.a();
        l.d(a2, "");
        com.ss.android.ugc.aweme.common.r.a("click_edit_avatar_detail", new com.ss.android.ugc.aweme.app.f.d().a("item_tab", str).a("item_subcategory", a2).f66730a);
        ProfileNaviEditorViewModel d2 = d();
        l.d(dVar, "");
        d2.c(new ProfileNaviEditorViewModel.e(dVar));
    }

    @Override // com.ss.android.ugc.aweme.view.a.f.a
    public final void b(d dVar) {
        String str;
        l.d(dVar, "");
        u uVar = this.f144107a;
        if (uVar != null) {
            str = uVar.a();
        } else {
            str = null;
        }
        String a2 = dVar.a();
        l.d(a2, "");
        com.ss.android.ugc.aweme.common.r.a("click_avatar_flip", new com.ss.android.ugc.aweme.app.f.d().a("item_tab", str).a("item_subcategory", a2).f66730a);
        ProfileNaviEditorViewModel d2 = d();
        l.d(dVar, "");
        if (dVar.j() != null) {
            h j2 = dVar.j();
            if (j2 == null) {
                l.b();
            }
            if (j2.f110766b == 0) {
                h j3 = dVar.j();
                if (j3 == null) {
                    l.b();
                }
                j3.f110766b = 1;
            } else {
                h j4 = dVar.j();
                if (j4 == null) {
                    l.b();
                }
                j4.f110766b = 0;
            }
            d2.d(new ProfileNaviEditorViewModel.h(dVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.f.a
    public final void a(s sVar) {
        String str;
        e eVar;
        l.d(sVar, "");
        String a2 = sVar.a();
        u uVar = this.f144107a;
        String str2 = null;
        if (uVar != null) {
            str = uVar.a();
        } else {
            str = null;
        }
        String a3 = sVar.c().a();
        g i2 = sVar.c().i();
        if (!(i2 == null || (eVar = i2.f110764b) == null)) {
            str2 = eVar.f110760c;
        }
        com.ss.android.ugc.aweme.bn.a.a(a2, str, a3, str2);
        ProfileNaviEditorViewModel d2 = d();
        l.d(sVar, "");
        if (sVar instanceof n) {
            n b2 = ProfileNaviEditorViewModel.b(sVar.c());
            if (b2 == null || (!l.a((Object) b2.a(), (Object) sVar.a()))) {
                n nVar = (n) sVar;
                n b3 = ProfileNaviEditorViewModel.b(nVar.c());
                if (b3 == null || !l.a((Object) b3.a(), (Object) nVar.a())) {
                    String a4 = ProfileNaviEditorViewModel.a(nVar.c());
                    d2.at_();
                    q qVar = r.f110811a;
                    if (qVar != null) {
                        l.d(a4, "");
                        qVar.f110807c.put(a4, nVar);
                    }
                    if (b3 != null) {
                        d2.d(new ProfileNaviEditorViewModel.u(b3));
                    }
                }
                d2.a(nVar);
            }
        } else if (sVar instanceof j) {
            d2.at_();
            q qVar2 = r.f110811a;
            if (qVar2 != null) {
                String a5 = sVar.c().a();
                l.d(a5, "");
                l.d(sVar, "");
                qVar2.f110808d.put(a5, sVar);
            }
            d2.d(new ProfileNaviEditorViewModel.v(sVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.f.a
    public final void a(d dVar, e eVar) {
        String str;
        l.d(dVar, "");
        l.d(eVar, "");
        d();
        n b2 = ProfileNaviEditorViewModel.b(dVar);
        String str2 = null;
        if (b2 != null) {
            str = b2.a();
        } else {
            str = null;
        }
        u uVar = this.f144107a;
        if (uVar != null) {
            str2 = uVar.a();
        }
        com.ss.android.ugc.aweme.bn.a.a(str, str2, dVar.a(), eVar.f110760c);
        ProfileNaviEditorViewModel d2 = d();
        l.d(dVar, "");
        l.d(eVar, "");
        if (eVar.f110760c != null && dVar.i() != null) {
            g i2 = dVar.i();
            if (i2 == null) {
                l.b();
            }
            i2.f110764b = eVar;
            d2.d(new ProfileNaviEditorViewModel.a(eVar));
        }
    }
}
