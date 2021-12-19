package com.ss.android.ugc.aweme.sticker.panel.b;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.m.e;
import com.ss.android.ugc.aweme.sticker.m.f;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.b;
import com.ss.android.ugc.aweme.sticker.view.a.i;
import com.ss.android.ugc.aweme.sticker.view.a.k;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.tools.utils.j;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public i f135022a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.lock.a f135023b;

    /* renamed from: c  reason: collision with root package name */
    public j f135024c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f135025d;

    /* renamed from: e  reason: collision with root package name */
    public b<com.ss.android.ugc.tools.view.style.j, Fragment> f135026e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.search.a f135027f;

    /* renamed from: g  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sticker.panel.a.a> f135028g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.sticker.panel.j, z> f135029h;

    /* renamed from: i  reason: collision with root package name */
    private k f135030i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a f135031j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.panel.j f135032k;

    /* renamed from: l  reason: collision with root package name */
    private final o f135033l;

    /* renamed from: m  reason: collision with root package name */
    private final d f135034m;
    private final h n;
    private final com.ss.android.ugc.aweme.sticker.m.i o;
    private final g p;

    static {
        Covode.recordClassIndex(88287);
    }

    public /* synthetic */ a(o oVar, d dVar) {
        this(oVar, dVar, e.f134963a, f.f134964a, com.ss.android.ugc.aweme.sticker.view.internal.main.e.f136288a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.b.c
    public final com.ss.android.ugc.aweme.sticker.panel.i a(androidx.appcompat.app.d dVar, FrameLayout frameLayout, m mVar, androidx.fragment.app.i iVar) {
        com.ss.android.ugc.aweme.sticker.panel.j jVar;
        androidx.appcompat.app.d dVar2 = dVar;
        l.d(dVar2, "");
        l.d(frameLayout, "");
        l.d(mVar, "");
        l.d(iVar, "");
        h.f.a.b<? super com.ss.android.ugc.aweme.sticker.panel.j, z> bVar = this.f135029h;
        if (bVar != null) {
            jVar = r16;
            com.ss.android.ugc.aweme.sticker.panel.j jVar2 = new com.ss.android.ugc.aweme.sticker.panel.j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
            bVar.invoke(jVar);
        } else {
            jVar = this.f135032k;
            if (jVar == null) {
                jVar = new com.ss.android.ugc.aweme.sticker.panel.j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
            }
        }
        l.b bVar2 = new l.b(this.f135033l, this.f135034m, this.n, this.o, this.p, jVar.f135225m);
        l.a aVar = new l.a(this.f135022a, this.f135023b, this.f135024c, 120);
        com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar2 = this.f135031j;
        b<com.ss.android.ugc.tools.view.style.j, Fragment> bVar3 = this.f135026e;
        k kVar = this.f135030i;
        boolean z = this.f135025d;
        com.ss.android.ugc.aweme.sticker.view.internal.search.a aVar3 = this.f135027f;
        if (aVar3 == null) {
            dVar2 = dVar2;
            aVar3 = new SearchStickerViewModel(dVar2, this.f135033l, this.f135034m, this.p);
        }
        b bVar4 = new b(dVar2, frameLayout, mVar, iVar, jVar, bVar2, aVar, aVar2, bVar3, kVar, z, aVar3);
        Iterator<T> it = this.f135028g.iterator();
        while (it.hasNext()) {
            bVar4.f135003h.a(it.next());
        }
        return bVar4;
    }

    private a(o oVar, d dVar, h hVar, com.ss.android.ugc.aweme.sticker.m.i iVar, g gVar) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(gVar, "");
        this.f135033l = oVar;
        this.f135034m = dVar;
        this.n = hVar;
        this.o = iVar;
        this.p = gVar;
        this.f135025d = true;
        this.f135030i = new com.ss.android.ugc.aweme.sticker.view.internal.main.d();
        this.f135028g = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.sticker.panel.j jVar, o oVar, d dVar, h hVar, com.ss.android.ugc.aweme.sticker.m.i iVar, g gVar) {
        this(oVar, dVar, hVar, iVar, gVar);
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(gVar, "");
        this.f135032k = jVar;
    }
}
