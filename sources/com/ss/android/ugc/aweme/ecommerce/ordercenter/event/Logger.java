package com.ss.android.ugc.aweme.ecommerce.ordercenter.event;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter;
import h.f.b.l;

public final class Logger implements au {

    /* renamed from: a  reason: collision with root package name */
    public String f86227a = "";

    /* renamed from: b  reason: collision with root package name */
    public final i f86228b;

    /* renamed from: c  reason: collision with root package name */
    private c f86229c;

    /* renamed from: d  reason: collision with root package name */
    private c f86230d;

    /* renamed from: e  reason: collision with root package name */
    private OrderCenterAdapter.c f86231e;

    static {
        Covode.recordClassIndex(53952);
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        c cVar = this.f86229c;
        if (cVar != null) {
            cVar.c().d();
            this.f86229c = null;
        }
        c cVar2 = this.f86230d;
        if (cVar2 != null) {
            cVar2.c().d();
            this.f86230d = null;
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        new e().a(this.f86227a).d();
        if (this.f86229c == null) {
            this.f86229c = new f().a(this.f86227a).b();
        }
    }

    public Logger(i iVar) {
        l.d(iVar, "");
        this.f86228b = iVar;
        iVar.a(this);
    }

    public final void a(OrderCenterAdapter.c cVar) {
        l.d(cVar, "");
        if (this.f86230d != null && (!l.a(cVar, this.f86231e))) {
            c cVar2 = this.f86230d;
            if (cVar2 == null) {
                l.b();
            }
            cVar2.c().d();
            this.f86230d = null;
        }
        this.f86231e = cVar;
        new g().a(this.f86227a).b(cVar.f86210b).c(cVar.f86212d).d();
        if (this.f86230d == null) {
            this.f86230d = new h().a(this.f86227a).b(cVar.f86210b).c(cVar.f86212d).b();
        }
    }
}
