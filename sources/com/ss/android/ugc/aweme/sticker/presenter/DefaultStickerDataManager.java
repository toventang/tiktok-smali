package com.ss.android.ugc.aweme.sticker.presenter;

import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.e.a;
import com.ss.android.ugc.aweme.sticker.e.g;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.g.h;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.repository.a.k;
import com.ss.android.ugc.aweme.sticker.repository.a.w;
import com.ss.android.ugc.aweme.sticker.repository.a.x;
import com.ss.android.ugc.aweme.sticker.repository.c.b;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.b.a;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public class DefaultStickerDataManager implements au, o {

    /* renamed from: a  reason: collision with root package name */
    public final a f135240a = new a();

    /* renamed from: b  reason: collision with root package name */
    private boolean f135241b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135242c;

    /* renamed from: d  reason: collision with root package name */
    private g f135243d;

    /* renamed from: e  reason: collision with root package name */
    private final w f135244e;

    /* renamed from: f  reason: collision with root package name */
    private String f135245f;

    /* renamed from: g  reason: collision with root package name */
    private int f135246g;

    /* renamed from: h  reason: collision with root package name */
    private Effect f135247h;

    /* renamed from: i  reason: collision with root package name */
    private long f135248i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f135249j;

    /* renamed from: k  reason: collision with root package name */
    private String f135250k;

    /* renamed from: l  reason: collision with root package name */
    private String f135251l;

    /* renamed from: m  reason: collision with root package name */
    private p<String, String> f135252m;
    private boolean n;
    private final q o;
    private final j p;
    private final k q;

    static {
        Covode.recordClassIndex(88388);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final w c() {
        return this.f135244e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final String d() {
        return this.f135245f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final int e() {
        return this.f135246g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final Effect h() {
        return this.f135247h;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final long i() {
        return this.f135248i;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final boolean j() {
        return this.f135249j;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final String k() {
        return this.f135250k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final String l() {
        return this.f135251l;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final p<String, String> m() {
        return this.f135252m;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final j n() {
        return this.p;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void o() {
        onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final q p() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.sticker.e.g
    public final boolean a(Effect effect) {
        l.d(effect, "");
        g gVar = this.f135243d;
        if (gVar != null) {
            return gVar.a(effect);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final boolean b() {
        return this.f135242c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final Effect f() {
        return this.p.a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final Effect g() {
        return this.p.b().getValue();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.n) {
            this.n = true;
            this.f135244e.b();
            this.f135240a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final boolean a() {
        return this.f135241b;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(int i2) {
        this.f135246g = i2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void b(Effect effect) {
        this.f135247h = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(long j2) {
        this.f135248i = j2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(String str) {
        l.d(str, "");
        this.f135245f = str;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(boolean z) {
        this.f135249j = z;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.f135244e.d().a(effect, iFetchEffectListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(int i2, List<? extends Effect> list) {
        l.d(list, "");
        this.f135244e.h().a(new b(list, i2));
    }

    @Override // com.ss.android.ugc.aweme.sticker.e.g
    public final void a(Effect effect, c.b bVar) {
        l.d(effect, "");
        l.d(bVar, "");
        g gVar = this.f135243d;
        if (gVar != null) {
            gVar.a(effect, bVar);
        } else {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.m
    public final void a(ac acVar, c.a aVar) {
        l.d(acVar, "");
        Effect effect = acVar.f135465a;
        com.ss.android.ugc.aweme.sticker.repository.a.l c2 = this.f135244e.c();
        if (aVar != null) {
            boolean a2 = this.f135244e.e().a(effect);
            h hVar = new h(a2 ? 1 : 0, aVar, this.q);
            com.ss.android.ugc.aweme.sticker.e.a aVar2 = new com.ss.android.ugc.aweme.sticker.e.a(a2, c2);
            l.d(effect, "");
            l.d(hVar, "");
            f.a.b.b d2 = t.c(new a.CallableC3512a(aVar2, effect)).f(a.b.f134802a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).d(new a.c(aVar2, effect, hVar));
            l.b(d2, "");
            f.a.j.a.a(d2, aVar2.f134797c);
            f.a.b.a aVar3 = aVar2.f134797c;
            if (aVar3 != null) {
                f.a.j.a.a(aVar3, this.f135240a);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.sticker.repository.internals.b.g.a(c2, effect, acVar.f135466b, false);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        l.d(list, "");
        this.f135244e.d().a(list, map, iFetchEffectListByIdsListener);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.o
    public final void a(List<String> list, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        l.d(list, "");
        this.f135244e.d().a(list, true, map, iFetchEffectListListener);
    }

    public DefaultStickerDataManager(d dVar, q qVar, x xVar, j jVar, k kVar) {
        l.d(dVar, "");
        l.d(qVar, "");
        l.d(xVar, "");
        l.d(jVar, "");
        this.o = qVar;
        this.p = jVar;
        this.q = kVar;
        this.f135244e = xVar.a();
        dVar.getLifecycle().a(this);
        this.f135245f = "";
        this.f135246g = -1;
        this.f135248i = -1;
        this.f135249j = true;
        this.f135250k = "";
        this.f135251l = "";
        this.f135252m = new p<>("", "");
    }
}
