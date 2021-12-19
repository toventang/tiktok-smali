package com.ss.android.ugc.aweme.discover.ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.discover.j.g;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.search.d.b;
import h.f.b.l;
import java.util.Objects;

public abstract class bh<D> extends av<D> implements b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f82439a;

    /* renamed from: c  reason: collision with root package name */
    protected g<?> f82440c;

    static {
        Covode.recordClassIndex(51307);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public View a(int i2) {
        if (this.f82439a == null) {
            this.f82439a = new SparseArray();
        }
        View view = (View) this.f82439a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82439a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public void a(d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public void a(d dVar, String str) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public void aT_() {
        SparseArray sparseArray = this.f82439a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bh f82441a;

        static {
            Covode.recordClassIndex(51308);
        }

        a(bh bhVar) {
            this.f82441a = bhVar;
        }

        public final void run() {
            if (this.f82441a.ab_()) {
                this.f82441a.q();
            }
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final g<?> n() {
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        return gVar;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public void onDestroyView() {
        super.onDestroyView();
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        gVar.cd_();
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final String t() {
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
            return null;
        }
        com.ss.android.ugc.aweme.discover.j.f fVar = (com.ss.android.ugc.aweme.discover.j.f) gVar.f76396h;
        if (fVar != null) {
            return fVar.r;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void aU_() {
        com.ss.android.ugc.aweme.search.g.b bVar;
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        gVar.b(am.H);
        g<?> gVar2 = this.f82440c;
        if (gVar2 == null) {
            l.a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 4;
        objArr[1] = M();
        objArr[2] = 1;
        objArr[3] = Integer.valueOf(this.C);
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        if (dVar != null) {
            bVar = dVar.getFilterOption();
        } else {
            bVar = null;
        }
        objArr[4] = bVar;
        gVar2.a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public void f() {
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        if (gVar.f76396h instanceof com.ss.android.ugc.aweme.discover.j.f) {
            com.ss.android.ugc.aweme.discover.ui.d.b E = E();
            g<?> gVar2 = this.f82440c;
            if (gVar2 == null) {
                l.a("mPresenter");
            }
            T t = gVar2.f76396h;
            l.b(t, "");
            com.bytedance.ies.dmt.ui.widget.d a2 = com.ss.android.ugc.aweme.discover.ui.d.b.a(E, t.mData, null, 2);
            if (a2 != null) {
                a(a2);
                return;
            }
        }
        g<?> gVar3 = this.f82440c;
        if (gVar3 == null) {
            l.a("mPresenter");
        }
        if (((com.ss.android.ugc.aweme.discover.j.f) gVar3.f76396h).g() == null) {
            K();
            N();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(g<?> gVar) {
        l.d(gVar, "");
        this.f82440c = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void b_(boolean z) {
        String c2 = c();
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        com.ss.android.ugc.aweme.discover.j.f fVar = (com.ss.android.ugc.aweme.discover.j.f) gVar.f76396h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchBaseModel<*, *>");
        a(c2, fVar.p, u(), z);
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
        com.ss.android.ugc.aweme.search.g.b bVar;
        C().setIsRefreshingData(true);
        g<?> gVar = this.f82440c;
        if (gVar == null) {
            l.a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 1;
        objArr[1] = u();
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(this.C);
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        if (dVar != null) {
            bVar = dVar.getFilterOption();
        } else {
            bVar = null;
        }
        objArr[4] = bVar;
        gVar.a(objArr);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(boolean z, boolean z2) {
        if (this.f82440c != null) {
            super.a(z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(int i2, com.ss.android.ugc.aweme.search.g.b bVar) {
        super.a(i2, bVar);
        getActivity();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = d();
        }
        if (j.f107226e) {
            g<?> gVar = this.f82440c;
            if (gVar == null) {
                l.a("mPresenter");
            }
            gVar.b(am.H);
            g<?> gVar2 = this.f82440c;
            if (gVar2 == null) {
                l.a("mPresenter");
            }
            gVar2.a(this.v);
            b(i2);
            return;
        }
        com.ss.android.b.a.a.a.a(new a(this), 100);
    }
}
