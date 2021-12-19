package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f111978a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f111979b;

    /* renamed from: c  reason: collision with root package name */
    public g f111980c;

    /* renamed from: d  reason: collision with root package name */
    private Effect f111981d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f111982e;

    /* renamed from: f  reason: collision with root package name */
    private q f111983f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f111984g;

    /* renamed from: h  reason: collision with root package name */
    private q f111985h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f111986i;

    /* renamed from: j  reason: collision with root package name */
    private int f111987j;

    /* renamed from: k  reason: collision with root package name */
    private Effect f111988k;

    /* renamed from: l  reason: collision with root package name */
    private Long f111989l = 0L;

    /* renamed from: m  reason: collision with root package name */
    private boolean f111990m;
    private boolean n;
    private Effect o;

    static {
        Covode.recordClassIndex(71970);
    }

    public h(g gVar) {
        this.f111980c = gVar;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void a(Effect effect) {
        this.f111981d = effect;
        this.f111982e = true;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.a(effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void b(Effect effect) {
        this.f111978a = true;
        this.f111979b = effect;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.b(effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void b(q qVar) {
        l.d(qVar, "");
        this.f111985h = qVar;
        this.f111986i = true;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.b(qVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void a(q qVar) {
        l.d(qVar, "");
        this.f111983f = qVar;
        this.f111984g = true;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.a(qVar);
        }
    }

    public final void a(g gVar) {
        String str;
        if (this.f111978a && gVar != null) {
            gVar.b(this.f111979b);
        }
        if (this.n && gVar != null) {
            Effect effect = this.o;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            gVar.a(str, this.o);
        }
        if (this.f111982e && gVar != null) {
            gVar.a(this.f111981d);
        }
        if (this.f111990m && gVar != null) {
            gVar.a(this.f111987j, this.f111988k, this.f111989l);
        }
        if (this.f111986i && gVar != null) {
            q qVar = this.f111985h;
            if (qVar == null) {
                l.b();
            }
            gVar.b(qVar);
        }
        if (this.f111984g && gVar != null) {
            q qVar2 = this.f111983f;
            if (qVar2 == null) {
                l.b();
            }
            gVar.a(qVar2);
        }
        this.f111980c = gVar;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void a(String str, Effect effect) {
        this.n = true;
        this.o = effect;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.a(str, effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.g
    public final void a(int i2, Effect effect, Long l2) {
        this.f111987j = i2;
        this.f111988k = effect;
        this.f111989l = l2;
        this.f111990m = true;
        g gVar = this.f111980c;
        if (gVar != null) {
            gVar.a(i2, effect, l2);
        }
    }
}
