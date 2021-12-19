package com.ss.android.ugc.aweme.discover.i;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.e.i;
import com.ss.android.ugc.aweme.discover.a.w;
import com.ss.android.ugc.aweme.discover.b.g;
import com.ss.android.ugc.aweme.discover.n.a;
import com.ss.android.ugc.aweme.discover.ui.bm;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.q;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.feed.ui.bl;
import com.ss.android.ugc.aweme.flowfeed.utils.c;
import com.ss.android.ugc.aweme.utils.ct;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class c extends a implements com.ss.android.ugc.aweme.common.d.c<a>, d, x, x {

    /* renamed from: i  reason: collision with root package name */
    protected b f81223i;

    /* renamed from: j  reason: collision with root package name */
    public q f81224j;

    /* renamed from: k  reason: collision with root package name */
    protected String f81225k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f81226l;

    /* renamed from: m  reason: collision with root package name */
    public int f81227m = 9;
    protected com.ss.android.ugc.aweme.search.model.d n;
    public com.ss.android.ugc.aweme.flowfeed.a.a o;
    public g p;
    protected boolean q;
    private DoubleBallSwipeRefreshLayout r;

    static {
        Covode.recordClassIndex(50478);
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void a(List list, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(i iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.i.a
    public final RecyclerView.i a() {
        return new WrapGridLayoutManager(2, 1);
    }

    public final void aO_() {
        if (bD()) {
            this.f81216f.ag_();
        }
    }

    public final void bh_() {
        if (bD() && !this.f81226l) {
            this.f81223i.setRefreshing(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.i.a
    public final com.ss.android.ugc.aweme.discover.adapter.q d() {
        if (this.f81216f != null) {
            return this.f81216f;
        }
        return new com.ss.android.ugc.aweme.discover.adapter.q(this, this.f81225k, this.f81211a, this, this.f81227m);
    }

    public final void f() {
        if (bD()) {
            this.f81223i.setRefreshing(false);
            this.f81214d.setVisibility(0);
            this.f81214d.g();
        }
    }

    public final void b() {
        if (bD()) {
            if (this.f81216f.getItemCount() == 0) {
                this.f81223i.setRefreshing(false);
                if (this.f81214d != null) {
                    this.f81214d.setVisibility(0);
                    this.f81214d.f();
                    return;
                }
                return;
            }
            this.f81223i.setRefreshing(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.i.a
    public final RecyclerView.h c() {
        if (this.f81227m != 9) {
            return new bm((int) n.b(this.bv, 1.0f));
        }
        if (w.a()) {
            return new com.ss.android.ugc.aweme.discover.jedi.a.b((int) n.b(this.bv, 8.0f), true);
        }
        return new bl();
    }

    public final void k() {
        a aVar;
        if (bD()) {
            int childCount = this.f81215e.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder a2 = this.f81215e.a(this.f81215e.getChildAt(i2));
                if (a2.getItemViewType() == 0 && (aVar = (a) a2) != null && !aVar.D()) {
                    aVar.E();
                    aVar.G();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.x
    public final void c(boolean z) {
        this.f81226l = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.ss.android.ugc.aweme.common.d.c
    public final /* synthetic */ void a(a aVar) {
        if (aVar != null) {
            bD();
        }
    }

    public final void c(Exception exc) {
        if (bD()) {
            this.f81216f.i();
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        this.n = dVar;
        if (this.f81216f != null) {
            this.f81216f.f80582f = dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
        if (bD()) {
            this.f81216f.notifyItemRemoved(i2);
            if (i2 != 0) {
                this.f81216f.notifyItemChanged(i2, Boolean.FALSE);
                this.f81216f.notifyItemChanged(i2 + 1, Boolean.FALSE);
                this.f81216f.notifyItemChanged(i2 + 2, Boolean.FALSE);
            }
        }
    }

    public final void a(Exception exc) {
        if (bD()) {
            this.f81223i.setRefreshing(false);
            if (!this.f81226l) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.cyr).a();
            }
        }
    }

    public final void b(Exception exc) {
        if (bD()) {
            this.f81223i.setRefreshing(false);
            if (!this.q) {
                this.f81214d.setVisibility(0);
                this.f81214d.h();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
        }
    }

    public final void a(String str) {
        if (this.f81215e != null && (this.f81215e instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.f81215e).setLabel(str);
        }
        da.a.a(str).a(this.f81215e);
        if (this.f81216f != null && (this.f81216f instanceof h)) {
            this.f81216f.p = str;
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.f81216f.ai_();
        } else {
            this.f81216f.ah_();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.discover.i.a
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.r = (DoubleBallSwipeRefreshLayout) view.findViewById(R.id.dk8);
        this.f81223i = new d(this.r);
    }

    public final void b(List<Aweme> list, boolean z) {
        if (bD()) {
            this.f81223i.setRefreshing(false);
            this.f81216f.b(list);
            a(z);
        }
    }

    public final void c(List<Aweme> list, boolean z) {
        if (bD()) {
            if (z || this.f81226l) {
                this.f81216f.d(list);
                if (!this.f81226l && bU()) {
                    j();
                }
            } else if (this.bu && this.bv != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.b40).a();
                j();
            }
            this.f81223i.setRefreshing(false);
        }
    }

    public final void a(List<Aweme> list, boolean z) {
        if (bD()) {
            this.f81214d.d();
            this.f81214d.setVisibility(8);
            this.f81223i.setRefreshing(false);
            this.q = true;
            this.f81216f.d(true);
            this.f81216f.b_(list);
            a(z);
            q qVar = this.f81224j;
            if (qVar != null) {
                qVar.d();
            }
        }
    }

    public c(String str, com.ss.android.ugc.aweme.search.d.c cVar, o oVar) {
        super(cVar, oVar);
        this.f81225k = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.i.a
    public final void a(ag agVar, int i2, Aweme aweme) {
        String str;
        int i3;
        super.a(agVar, i2, aweme);
        g gVar = this.p;
        if (gVar != null) {
            gVar.a(aweme.getAid());
            if (agVar.f93456g > 0) {
                com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.o;
                if (aVar != null) {
                    str = aVar.d();
                } else {
                    str = "";
                }
                String a2 = com.ss.android.ugc.aweme.flowfeed.utils.b.a(str, aweme.getAid());
                com.ss.android.ugc.aweme.flowfeed.utils.b a3 = c.a.f96181a.a(a2);
                if (a3 == null) {
                    a3 = new com.ss.android.ugc.aweme.flowfeed.utils.b(aweme, new ct(), a2);
                }
                a3.f96176f = com.ss.android.ugc.aweme.feed.helper.h.a().f93338a;
                com.ss.android.ugc.aweme.feed.helper.h.a().f93338a = null;
                if (agVar.f93461l) {
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                a3.f96172b = i3;
                c.a.f96181a.a(a2, a3);
            }
        }
    }
}
