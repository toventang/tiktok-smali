package com.ss.android.ugc.aweme.shortvideo.n;

import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.p;

public final class d extends j<a> implements a, a {

    /* renamed from: a  reason: collision with root package name */
    public final k<p<Effect, Integer>> f129521a = new k<>();

    /* renamed from: b  reason: collision with root package name */
    private final f f129522b;

    static {
        Covode.recordClassIndex(85014);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.n.a
    public final /* bridge */ /* synthetic */ g a() {
        return this.f129521a;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f129522b;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
    }

    public d(f fVar) {
        l.d(fVar, "");
        this.f129522b = fVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.n.a
    public final void a(Effect effect, int i2) {
        this.f129521a.a(new p<>(effect, Integer.valueOf(i2)));
    }
}
