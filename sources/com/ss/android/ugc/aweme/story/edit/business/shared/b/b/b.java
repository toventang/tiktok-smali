package com.ss.android.ugc.aweme.story.edit.business.shared.b.b;

import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends j<a> implements a, a {

    /* renamed from: a  reason: collision with root package name */
    public final a f137197a = this;

    /* renamed from: b  reason: collision with root package name */
    public c f137198b;

    /* renamed from: c  reason: collision with root package name */
    private final f f137199c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.scene.group.b f137200d;

    /* renamed from: e  reason: collision with root package name */
    private final int f137201e = R.id.ejk;

    static {
        Covode.recordClassIndex(89719);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f137197a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137199c;
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a
    public final void a() {
        if (this.f137198b == null) {
            this.f137198b = new c(getDiContainer());
        }
        com.bytedance.scene.group.b bVar = this.f137200d;
        c cVar = this.f137198b;
        if (cVar == null) {
            l.a("scene");
        }
        if (!bVar.f(cVar)) {
            com.bytedance.scene.group.b bVar2 = this.f137200d;
            int i2 = this.f137201e;
            c cVar2 = this.f137198b;
            if (cVar2 == null) {
                l.a("scene");
            }
            bVar2.a(i2, cVar2, "Tap2AddTextScene");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.b.b.a
    public final void a(boolean z) {
        if (this.f137198b != null) {
            c cVar = this.f137198b;
            if (cVar == null) {
                l.a("scene");
            }
            cVar.f137204b = z;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137199c = fVar;
        this.f137200d = bVar;
    }
}
