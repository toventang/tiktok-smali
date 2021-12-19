package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.discover.j.f;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.search.l.a.h;
import h.f.b.l;
import java.util.concurrent.CancellationException;

public class g<T extends f> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f81250a;

    /* renamed from: b  reason: collision with root package name */
    ac f81251b;

    static {
        Covode.recordClassIndex(50489);
    }

    private void d() {
        if (this.f76396h != null && this.f81251b != null) {
            ((f) this.f76396h).f81248l = this.f81251b.aP_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void h() {
        if (this.f76396h != null && (this.f76396h instanceof f)) {
            ((f) this.f76396h).a(0, "basepresenter new request");
        }
        super.h();
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public void c() {
        this.f81250a = true;
        super.c();
        if (((a) this.f76396h).mListQueryType == 1) {
            if (((a) this.f76396h).mListQueryType == 1 && (this.f76397i instanceof ac)) {
                ((ac) this.f76397i).a((SearchApiResult) this.f76396h.mData);
            }
            GlobalDoodleConfig globalDoodleConfig = this.f76396h.mData.globalDoodleConfig;
            ac acVar = this.f81251b;
            String str = null;
            if (acVar != null) {
                b(acVar);
                this.f81251b.a(this.f76396h.mData.dynamicHeader);
                ac acVar2 = this.f81251b;
                d dVar = this.f76396h.mData.dynamicMask;
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getUseScenario();
                }
                acVar2.a(dVar, str);
                this.f81251b.a(((f) this.f76396h).f());
                this.f81251b.a(((f) this.f76396h).g(), globalDoodleConfig);
                this.f81251b.b(this.f76396h.mData);
                this.f81251b.c_(((f) this.f76396h).h());
            } else if (this.f76397i instanceof ac) {
                b((ac) this.f76397i);
                ((ac) this.f76397i).a(this.f76396h.mData.dynamicHeader);
                ac acVar3 = (ac) this.f76397i;
                d dVar2 = this.f76396h.mData.dynamicMask;
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getUseScenario();
                }
                acVar3.a(dVar2, str);
                ((ac) this.f76397i).a(((f) this.f76396h).f());
                f fVar = (f) this.f76396h;
                if (fVar.mData != null) {
                    l.b(fVar.mData, "");
                }
                ((ac) this.f76397i).a(((f) this.f76396h).g(), globalDoodleConfig);
                ((ac) this.f76397i).b(this.f76396h.mData);
                this.f81251b.c_(((f) this.f76396h).h());
            }
        }
    }

    /* renamed from: a */
    public final void a_(c cVar) {
        super.a_(cVar);
        if (cVar instanceof ac) {
            a((ac) cVar);
        }
    }

    public final void b(int i2) {
        if (this.f76396h != null) {
            ((f) this.f76396h).o = i2;
        }
    }

    public final void a(T t) {
        super.a((com.ss.android.ugc.aweme.common.b) t);
        d();
    }

    public final void a(ac acVar) {
        this.f81251b = acVar;
        d();
    }

    private void b(ac acVar) {
        if (this.f76396h != null && ((a) this.f76396h).getItems() != null) {
            com.ss.android.ugc.aweme.search.l.a.g.a(acVar.aQ_()).c(((a) this.f76396h).getItems().size()).d().a(((f) this.f76396h).p).a((com.ss.android.ugc.aweme.app.api.g) this.f76396h.mData).b(0);
            h.a(acVar.aQ_()).e(((a) this.f76396h).getItems().size()).b().a(((f) this.f76396h).p).a((com.ss.android.ugc.aweme.app.api.g) this.f76396h.mData).c(0);
        }
    }

    public void a(String str) {
        if (this.f76396h != null) {
            ((f) this.f76396h).b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public void a_(Exception exc) {
        exc.printStackTrace();
        if (!(exc instanceof CancellationException)) {
            this.f81250a = false;
            super.a_(exc);
            ac acVar = this.f81251b;
            if (acVar != null || ((this.f76397i instanceof ac) && (acVar = (ac) this.f76397i) != null)) {
                com.ss.android.ugc.aweme.search.l.a.g.a(acVar.aQ_()).d().b(1).b(exc.getMessage());
                h.a(acVar.aQ_()).b().c(1).b(exc.getMessage());
                com.ss.android.ugc.aweme.search.l.a.a.f121302c.a(exc);
                acVar.a((QueryCorrectInfo) null);
                acVar.a((d) null);
                acVar.a((d) null, (String) null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        if (this.f76396h != null) {
            if (this.f81251b != null) {
                ((f) this.f76396h).f81245i = this.f81251b.aQ_();
                ((f) this.f76396h).f81246j = this.f81251b.aR_();
            }
            ((f) this.f76396h).a(1, "basePresenter new request");
        }
        ac acVar = this.f81251b;
        if (acVar != null) {
            com.ss.android.ugc.aweme.search.l.a.g.a(acVar.aQ_()).b();
            h.a(this.f81251b.aQ_()).a();
        }
        return super.a(objArr);
    }
}
