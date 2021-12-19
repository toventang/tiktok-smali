package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.discover.j.f;
import com.ss.android.ugc.aweme.discover.jedi.b;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.mixfeed.u;
import com.ss.android.ugc.aweme.discover.model.GradientBgData;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.discover.ui.av;
import com.ss.android.ugc.aweme.search.l.a.e;
import com.ss.android.ugc.aweme.search.l.a.g;
import h.f.b.l;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

public final class a extends c<u, b> implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f81872a;

    static {
        Covode.recordClassIndex(50834);
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void l() {
        if (this.f76397i != null) {
            ((av) this.f76397i).b(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void e() {
        if (this.f76396h != null && this.f76397i != null) {
            m mVar = this.f76397i;
            l.b(mVar, "");
            if (((com.bytedance.ies.uikit.a.b) mVar).ab_()) {
                ((b) this.f76397i).p();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void g() {
        if (this.f76396h != null && this.f76397i != null) {
            SearchRecyclerView searchRecyclerView = ((b) this.f76397i).f81345l;
            if (searchRecyclerView == null) {
                l.b();
            }
            searchRecyclerView.Q.tryLock();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void h() {
        if (this.f76396h != null) {
            ((f) this.f76396h).a(0, "search grid unBindModel");
        }
        super.h();
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void k() {
        if (this.f76396h != null && this.f76397i != null) {
            SearchRecyclerView searchRecyclerView = ((b) this.f76397i).f81345l;
            if (searchRecyclerView == null) {
                l.b();
            }
            try {
                searchRecyclerView.Q.unlock();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        if (this.f76396h != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            int i2 = ((com.ss.android.ugc.aweme.common.e.a) bVar).mListQueryType;
            if (i2 == 1) {
                ((av) this.f76397i).b();
            } else if (i2 == 2) {
                ((av) this.f76397i).bh_();
            } else if (i2 == 4) {
                ((av) this.f76397i).aO_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void f() {
        if (this.f76396h != null && this.f76397i != null) {
            SearchRecyclerView searchRecyclerView = ((b) this.f76397i).f81345l;
            if (searchRecyclerView == null) {
                l.b();
            }
            searchRecyclerView.R.a().clear();
            searchRecyclerView.P = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void d() {
        if (this.f76396h != null && this.f76397i != null) {
            m mVar = this.f76397i;
            l.b(mVar, "");
            if (((com.bytedance.ies.uikit.a.b) mVar).ab_()) {
                com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
                l.b(bVar, "");
                ((av) this.f76397i).a((SearchApiResult) bVar.mData);
                b bVar2 = (b) this.f76397i;
                com.ss.android.ugc.aweme.common.b bVar3 = this.f76396h;
                l.b(bVar3, "");
                T t = bVar3.mData;
                l.b(t, "");
                l.d(t, "");
                bVar2.a(t.globalDoodleConfig);
                SearchRecyclerView searchRecyclerView = bVar2.f81345l;
                if (searchRecyclerView == null) {
                    l.b();
                }
                searchRecyclerView.O = false;
                bVar2.A().f();
                bVar2.A().b_(t.f81826c);
                bVar2.A().d(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        super.c();
        if (this.f76396h != null && this.f76397i != null) {
            m mVar = this.f76397i;
            l.b(mVar, "");
            if (((com.bytedance.ies.uikit.a.b) mVar).ab_()) {
                com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
                l.b(bVar, "");
                int i2 = ((com.ss.android.ugc.aweme.common.e.a) bVar).mListQueryType;
                if (i2 == 1) {
                    com.ss.android.ugc.aweme.common.b bVar2 = this.f76396h;
                    l.b(bVar2, "");
                    if (bVar2.mData == null) {
                        ((av) this.f76397i).f();
                        return;
                    }
                    m mVar2 = this.f76397i;
                    l.b(mVar2, "");
                    e a2 = g.a(((am) mVar2).s);
                    com.ss.android.ugc.aweme.common.b bVar3 = this.f76396h;
                    l.b(bVar3, "");
                    e a3 = a2.c(((com.ss.android.ugc.aweme.common.e.a) bVar3).getItems().size()).a(((f) this.f76396h).p);
                    com.ss.android.ugc.aweme.common.b bVar4 = this.f76396h;
                    l.b(bVar4, "");
                    a3.a((com.ss.android.ugc.aweme.app.api.g) bVar4.mData);
                    com.ss.android.ugc.aweme.common.b bVar5 = this.f76396h;
                    l.b(bVar5, "");
                    T t = bVar5.mData;
                    l.b(t, "");
                    com.ss.android.ugc.aweme.common.b bVar6 = this.f76396h;
                    l.b(bVar6, "");
                    t.f81826c = ((com.ss.android.ugc.aweme.common.e.a) bVar6).getItems();
                    com.ss.android.ugc.aweme.common.b bVar7 = this.f76396h;
                    l.b(bVar7, "");
                    ((b) this.f76397i).b((com.ss.android.ugc.aweme.discover.mixfeed.m) bVar7.mData);
                } else if (i2 == 4) {
                    com.ss.android.ugc.aweme.common.b bVar8 = this.f76396h;
                    l.b(bVar8, "");
                    T t2 = bVar8.mData;
                    l.b(t2, "");
                    com.ss.android.ugc.aweme.common.b bVar9 = this.f76396h;
                    l.b(bVar9, "");
                    t2.f81826c = ((com.ss.android.ugc.aweme.common.e.a) bVar9).getItems();
                    com.ss.android.ugc.aweme.common.b bVar10 = this.f76396h;
                    l.b(bVar10, "");
                    T t3 = bVar10.mData;
                    l.b(t3, "");
                    ((b) this.f76397i).a((com.ss.android.ugc.aweme.discover.mixfeed.m) t3);
                }
            }
        }
    }

    public final void a(u uVar) {
        super.a((com.ss.android.ugc.aweme.common.b) uVar);
        if (this.f76396h != null && this.f76397i != null) {
            ((f) this.f76396h).f81248l = ((av) this.f76397i).aP_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        l.d(objArr, "");
        if (this.f76396h == null || this.f76397i == null) {
            return false;
        }
        ((f) this.f76396h).a(1, "new Request");
        m mVar = this.f76397i;
        l.b(mVar, "");
        ((f) this.f76396h).f81245i = ((am) mVar).s;
        m mVar2 = this.f76397i;
        l.b(mVar2, "");
        ((f) this.f76396h).f81246j = ((av) mVar2).aR_();
        return super.a(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76396h != null && this.f76397i != null) {
            m mVar = this.f76397i;
            l.b(mVar, "");
            if (((com.bytedance.ies.uikit.a.b) mVar).ab_()) {
                super.a_(exc);
                com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
                l.b(bVar, "");
                int i2 = ((com.ss.android.ugc.aweme.common.e.a) bVar).mListQueryType;
                if (i2 == 1) {
                    b bVar2 = (b) this.f76397i;
                    if (exc == null) {
                        l.b();
                    }
                    l.d(exc, "");
                    if (!(exc instanceof CancellationException)) {
                        if (exc instanceof Exception) {
                            bVar2.b(exc);
                        } else {
                            bVar2.b(new Exception(exc));
                        }
                        com.ss.android.ugc.aweme.search.theme.b bVar3 = bVar2.f81344k;
                        if (bVar3 != null) {
                            bVar3.a((GradientBgData) null);
                        }
                        bVar2.a((QueryCorrectInfo) null);
                        bVar2.a((d) null);
                        bVar2.a((d) null, (String) null);
                    }
                } else if (i2 == 4) {
                    av avVar = (av) this.f76397i;
                    if (exc == null) {
                        l.b();
                    }
                    l.d(exc, "");
                    if (!(exc instanceof CancellationException)) {
                        avVar.c(new Exception(exc));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.b
    public final void a(int i2, Exception exc) {
        if (this.f76397i != null) {
            if (i2 == 0) {
                ((av) this.f76397i).b(true);
                ((b) this.f76397i).n();
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ((av) this.f76397i).f();
                }
            } else if (exc != null) {
                ((av) this.f76397i).b(exc);
            }
        }
    }
}
