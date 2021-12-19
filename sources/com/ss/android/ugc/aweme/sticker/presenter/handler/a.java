package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextResultModule;
import com.ss.android.ugc.aweme.sticker.types.ar.text.f;
import com.ss.android.ugc.aweme.sticker.types.ar.text.n;
import com.ss.android.ugc.aweme.sticker.types.ar.text.q;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.sticker.types.ar.text.s;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.j;
import h.z;
import java.util.ArrayList;

public final class a extends b implements l, e {

    /* renamed from: a  reason: collision with root package name */
    public final k<z> f135349a = new k<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f135350b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f135351c;

    /* renamed from: d  reason: collision with root package name */
    private final s f135352d;

    /* renamed from: e  reason: collision with root package name */
    private final d f135353e;

    /* renamed from: f  reason: collision with root package name */
    private final o f135354f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.types.ar.text.e f135355g;

    /* renamed from: h  reason: collision with root package name */
    private final h.f.a.a<ViewGroup> f135356h;

    /* renamed from: i  reason: collision with root package name */
    private final r.b f135357i;

    /* renamed from: j  reason: collision with root package name */
    private final j f135358j;

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<Integer> f135359k;

    static {
        Covode.recordClassIndex(88424);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        MethodCollector.i(9467);
        this.f135351c = null;
        this.f135352d.a();
        ViewGroup invoke = this.f135356h.invoke();
        if (invoke != null) {
            ArrayList<View> arrayList = new ArrayList();
            int childCount = invoke.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = invoke.getChildAt(i2);
                if (childAt instanceof n) {
                    arrayList.add(childAt);
                }
            }
            for (View view : arrayList) {
                invoke.removeView(view);
            }
            arrayList.clear();
            MethodCollector.o(9467);
            return;
        }
        MethodCollector.o(9467);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f135350b = true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(aVar, "");
        return g.l(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        Effect effect;
        h.f.b.l.d(aVar, "");
        this.f135350b = false;
        if (aVar == l.a.AFTER_ANIMATE && (effect = this.f135351c) != null) {
            this.f135352d.a(effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        this.f135351c = aVar.f135378a;
        com.ss.android.ugc.aweme.sticker.types.ar.text.e eVar = this.f135355g;
        String a2 = f.a(this.f135353e);
        h.f.b.l.b(a2, "");
        eVar.a(a2);
        ViewGroup invoke = this.f135356h.invoke();
        if (invoke != null) {
            this.f135352d.a(this.f135357i, this.f135353e, invoke, this.f135359k);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (i2 == 32 || i2 == 33) {
            if (!this.f135350b || ((this.f135354f.a() && this.f135350b) || (this.f135354f.b() && this.f135350b))) {
                if (!this.f135350b) {
                    this.f135349a.b(z.f158842a);
                }
                ac a2 = ae.a((androidx.fragment.app.e) this.f135353e).a(ARTextResultModule.class);
                h.f.b.l.b(a2, "");
                ((ARTextResultModule) a2).a().postValue(new q(i2, i3, i4, str));
            } else {
                ((ARTextResultModule) ae.a((androidx.fragment.app.e) this.f135353e).a(ARTextResultModule.class)).b().postValue(new q(i2, i3, i4, str));
            }
        }
        if (i2 == 17) {
            this.f135352d.b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends android.view.ViewGroup> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(d dVar, o oVar, com.ss.android.ugc.aweme.sticker.types.ar.text.e eVar, h.f.a.a<? extends ViewGroup> aVar, r.b bVar, j jVar, h.f.a.a<Integer> aVar2) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(aVar2, "");
        this.f135353e = dVar;
        this.f135354f = oVar;
        this.f135355g = eVar;
        this.f135356h = aVar;
        this.f135357i = bVar;
        this.f135358j = jVar;
        this.f135359k = aVar2;
        this.f135352d = new s(dVar, oVar, eVar, jVar);
    }
}
