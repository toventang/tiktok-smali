package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.android.ugc.tools.infosticker.view.internal.base.h;
import com.ss.android.ugc.tools.infosticker.view.internal.c;
import com.ss.android.ugc.tools.infosticker.view.internal.e;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.b.a;
import h.f.a.q;
import h.f.b.l;
import h.p;
import h.z;

public final class d extends b<Effect> implements c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f149683a;

    /* renamed from: b  reason: collision with root package name */
    private final m f149684b;

    /* renamed from: c  reason: collision with root package name */
    private final int f149685c;
    private final boolean v;

    static {
        Covode.recordClassIndex(98561);
    }

    public final void a() {
        t();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final m c() {
        return this.f149684b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int d() {
        return this.f149685c;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b, com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void b() {
        super.b();
        this.f149683a = false;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.c
    public final void e() {
        if (this.v && !this.f149683a) {
            this.f149683a = true;
            a(this.f149684b);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void t() {
        super.t();
        if (this.v) {
            q().setState(a.LOADING);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.h x() {
        int b2 = dh.b(this.s);
        return new com.ss.android.ugc.tools.infosticker.view.internal.base.a((((float) (b2 / this.f149685c)) - r.a(this.s, 57.0f)) / 2.0f);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, q<? super Effect, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, z> qVar) {
        l.d(viewGroup, "");
        l.d(qVar, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        l.d(context, "");
        Float valueOf = Float.valueOf(8.0f);
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2 = h.a(context, 40.0f, 40.0f, (int) r.a(context, 57.0f), (int) r.a(context, 75.0f), null, valueOf, null, valueOf);
        return new n(a2.component1(), a2.component2(), qVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, int i2, Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        l.d(viewHolder, "");
        l.d(effect, "");
        l.d(cVar, "");
        if (!(viewHolder instanceof n)) {
            viewHolder = null;
        }
        f fVar = (f) viewHolder;
        if (fVar != null) {
            fVar.a(effect, i2, cVar, num);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context, m mVar, e<Effect> eVar, k<Effect> kVar, boolean z, h.f.a.b<? super b.c, z> bVar) {
        super(context, mVar, eVar, kVar, null, 5, false, true, true, bVar);
        l.d(context, "");
        l.d(mVar, "");
        this.f149684b = mVar;
        this.f149685c = 5;
        this.v = z;
    }

    public /* synthetic */ d(Context context, m mVar, e eVar, k kVar, boolean z, h.f.a.b bVar, byte b2) {
        this(context, mVar, eVar, kVar, z, bVar);
    }
}
