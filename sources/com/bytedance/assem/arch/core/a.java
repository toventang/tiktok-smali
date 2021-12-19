package com.bytedance.assem.arch.core;

import android.content.Context;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a implements ag, m {

    /* renamed from: a  reason: collision with root package name */
    public final String f25543a = (getClass().getSimpleName() + "---" + hashCode());

    /* renamed from: b  reason: collision with root package name */
    public boolean f25544b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f25545c = true;

    /* renamed from: d  reason: collision with root package name */
    public final n f25546d = new n(this);

    /* renamed from: e  reason: collision with root package name */
    public AssemSupervisor f25547e;

    /* renamed from: f  reason: collision with root package name */
    public m f25548f;

    /* renamed from: g  reason: collision with root package name */
    private final af f25549g = new af();

    static {
        Covode.recordClassIndex(14878);
    }

    public void bO_() {
    }

    public void f() {
    }

    public void j() {
    }

    public void l() {
    }

    public void n() {
    }

    public void p() {
    }

    @Override // androidx.lifecycle.m
    public /* bridge */ /* synthetic */ i getLifecycle() {
        return this.f25546d;
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        return this.f25549g;
    }

    public ad.b q() {
        return new ad.d();
    }

    public final Context ar_() {
        AssemSupervisor assemSupervisor = this.f25547e;
        if (assemSupervisor == null) {
            l.a("supervisor");
        }
        return assemSupervisor.f25532e;
    }

    public final void as_() {
        f();
        this.f25546d.a(i.a.ON_CREATE);
    }

    public void bP_() {
        j();
        this.f25546d.a(i.a.ON_RESUME);
    }

    public final boolean bQ_() {
        if (this.f25547e != null) {
            return true;
        }
        return false;
    }

    public final boolean bw_() {
        return this.f25546d.a().isAtLeast(i.b.RESUMED);
    }

    public final AssemSupervisor bx_() {
        AssemSupervisor assemSupervisor = this.f25547e;
        if (assemSupervisor == null) {
            l.a("supervisor");
        }
        return assemSupervisor;
    }

    public final m by_() {
        m mVar = this.f25548f;
        if (mVar == null) {
            l.a("parent");
        }
        return mVar;
    }

    public final void g() {
        bO_();
        this.f25546d.a(i.a.ON_START);
    }

    public final void k() {
        this.f25546d.a(i.a.ON_PAUSE);
        l();
    }

    public final void m() {
        this.f25546d.a(i.a.ON_STOP);
        n();
    }

    public final void o() {
        this.f25546d.a(i.a.ON_DESTROY);
        this.f25549g.a();
        p();
    }

    public final void a(m mVar) {
        l.c(mVar, "");
        this.f25548f = mVar;
    }

    public final void a(AssemSupervisor assemSupervisor) {
        l.c(assemSupervisor, "");
        this.f25547e = assemSupervisor;
    }
}
