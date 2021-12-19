package com.ss.android.ugc.aweme.sticker.panel.b;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.d.e;
import com.ss.android.ugc.aweme.sticker.panel.a;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.view.a.h;
import com.ss.android.ugc.aweme.sticker.view.a.k;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.main.StickerViewImpl;

public final class b extends a {

    /* renamed from: k  reason: collision with root package name */
    public final d f135060k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.appcompat.app.d f135061l;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f135062m;
    private final i n;
    private final j o;
    private final l.b p;
    private final l.a q;
    private final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a r;
    private final com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment> s;
    private final k t;
    private final boolean u;
    private final com.ss.android.ugc.aweme.sticker.view.internal.search.a v;

    static {
        Covode.recordClassIndex(88302);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final j m() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.a
    public final h a(e eVar) {
        h.f.b.l.d(eVar, "");
        androidx.appcompat.app.d dVar = this.f135061l;
        FrameLayout frameLayout = this.f135062m;
        m mVar = this.f135004i;
        l.b bVar = this.p;
        l.a aVar = this.q;
        return new StickerViewImpl(dVar, frameLayout, mVar, bVar, new l.a(aVar.f136198a, aVar.f136199b, aVar.f136200c, this.f135003h, aVar.f136202e, aVar.f136203f, aVar.f136204g), eVar, this.o, this.n, this.r, this.s, this.t, this.u, this.v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.d dVar, FrameLayout frameLayout, m mVar, i iVar, j jVar, l.b bVar, l.a aVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar2, com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment> bVar2, k kVar, boolean z, com.ss.android.ugc.aweme.sticker.view.internal.search.a aVar3) {
        super(mVar, bVar.f136205a);
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(frameLayout, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(aVar3, "");
        this.f135061l = dVar;
        this.f135062m = frameLayout;
        this.n = iVar;
        this.o = jVar;
        this.p = bVar;
        this.q = aVar;
        this.r = aVar2;
        this.s = bVar2;
        this.t = kVar;
        this.u = z;
        this.v = aVar3;
        this.f135060k = bVar.f136206b;
    }
}
