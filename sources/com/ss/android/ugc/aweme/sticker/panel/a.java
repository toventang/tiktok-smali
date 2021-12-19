package com.ss.android.ugc.aweme.sticker.panel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.sticker.d.e;
import com.ss.android.ugc.aweme.sticker.panel.a.b;
import com.ss.android.ugc.aweme.sticker.panel.a.d;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.m;
import com.ss.android.ugc.aweme.sticker.view.a.n;
import com.ss.android.ugc.aweme.sticker.view.internal.search.c;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import f.a.d.f;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final t<Integer> f134996a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<IStickerService.FaceSticker> f134997b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<StickerTagChangeData> f134998c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f134999d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final List<l> f135000e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f135001f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final b f135002g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    public final b f135003h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final m f135004i;

    /* renamed from: j  reason: collision with root package name */
    public final o f135005j;

    /* renamed from: k  reason: collision with root package name */
    private final h f135006k = i.a((h.f.a.a) new C3517a(this));

    static {
        Covode.recordClassIndex(88275);
    }

    private com.ss.android.ugc.aweme.sticker.view.a.h n() {
        return (com.ss.android.ugc.aweme.sticker.view.a.h) this.f135006k.getValue();
    }

    public abstract com.ss.android.ugc.aweme.sticker.view.a.h a(e eVar);

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final /* bridge */ /* synthetic */ LiveData a() {
        return this.f134998c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final /* bridge */ /* synthetic */ LiveData b() {
        return this.f134999d;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final b c() {
        return this.f135003h;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void f() {
        n().f();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void g() {
        n().g();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void l() {
        n().l();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final boolean d() {
        return n().d();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final c e() {
        return n().e();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final f.a.t<Integer> h() {
        return n().h();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final f.a.t<Boolean> i() {
        return n().i();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final f.a.t<n> j() {
        return n().j();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final f.a.t<com.ss.android.ugc.aweme.sticker.view.a.m> k() {
        return n().k();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a  reason: collision with other inner class name */
    static final class C3517a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.view.a.h> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3517a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.a.h invoke() {
            a aVar = this.this$0;
            com.ss.android.ugc.aweme.sticker.view.a.h a2 = aVar.a(aVar.f135002g);
            a2.k().a(new C3518a(this), f.a.e.b.a.f157192e);
            a2.j().a(new b(this), f.a.e.b.a.f157192e);
            a2.i().a(new c(this), f.a.e.b.a.f157192e);
            return a2;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$c */
        static final class c<T> implements f<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3517a f135009a;

            static {
                Covode.recordClassIndex(88279);
            }

            c(C3517a aVar) {
                this.f135009a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Boolean bool) {
                this.f135009a.this$0.f134999d.setValue(bool);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$a  reason: collision with other inner class name */
        static final class C3518a<T> implements f<com.ss.android.ugc.aweme.sticker.view.a.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3517a f135007a;

            static {
                Covode.recordClassIndex(88277);
            }

            C3518a(C3517a aVar) {
                this.f135007a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.view.a.m mVar) {
                com.ss.android.ugc.aweme.sticker.view.a.m mVar2 = mVar;
                if (mVar2 instanceof m.d) {
                    m.d dVar = (m.d) mVar2;
                    String name = dVar.f136214a.getName();
                    String key = dVar.f136214a.getKey();
                    if (name != null && name.length() != 0 && key != null && key.length() != 0) {
                        this.f135007a.this$0.f134998c.setValue(new StickerTagChangeData(this.f135007a.this$0.f135005j.p().f135424a, name, key));
                    }
                } else if (mVar2 instanceof m.f) {
                    Iterator<T> it = this.f135007a.this$0.f135000e.iterator();
                    while (it.hasNext()) {
                        it.next().a(((m.f) mVar2).f136218a);
                    }
                } else if (mVar2 instanceof m.b) {
                    Iterator<T> it2 = this.f135007a.this$0.f135000e.iterator();
                    while (it2.hasNext()) {
                        it2.next().cw_();
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.a$a$b */
        static final class b<T> implements f<n> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3517a f135008a;

            static {
                Covode.recordClassIndex(88278);
            }

            b(C3517a aVar) {
                this.f135008a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(n nVar) {
                n nVar2 = nVar;
                if (nVar2 != null) {
                    int i2 = b.f135021a[nVar2.ordinal()];
                    if (i2 == 1) {
                        this.f135008a.this$0.f134996a.setValue(0);
                        Iterator<T> it = this.f135008a.this$0.f135000e.iterator();
                        while (it.hasNext()) {
                            it.next().a(l.a.BEFORE_ANIMATE);
                        }
                    } else if (i2 == 2) {
                        Iterator<T> it2 = this.f135008a.this$0.f135000e.iterator();
                        while (it2.hasNext()) {
                            it2.next().a(l.a.AFTER_ANIMATE);
                        }
                    } else if (i2 == 3) {
                        Iterator<T> it3 = this.f135008a.this$0.f135000e.iterator();
                        while (it3.hasNext()) {
                            it3.next().b(l.a.BEFORE_ANIMATE);
                        }
                    } else if (i2 == 4) {
                        this.f135008a.this$0.f134996a.setValue(8);
                        Iterator<T> it4 = this.f135008a.this$0.f135000e.iterator();
                        while (it4.hasNext()) {
                            it4.next().b(l.a.AFTER_ANIMATE);
                        }
                    }
                }
            }
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135010a;

        static {
            Covode.recordClassIndex(88280);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f135010a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
            h.f.b.l.d(aVar, "");
            Iterator<T> it = this.f135010a.f135001f.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
            this.f135010a.f134997b.setValue(com.ss.android.ugc.aweme.sticker.f.d.a(aVar.f135378a));
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
            h.f.b.l.d(dVar, "");
            Iterator<T> it = this.f135010a.f135001f.iterator();
            while (it.hasNext()) {
                it.next().a(dVar);
            }
            this.f135010a.f134997b.setValue(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final void a(u<StickerTagChangeData> uVar) {
        h.f.b.l.d(uVar, "");
        this.f134998c.observe(this.f135004i, uVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final void b(e eVar) {
        h.f.b.l.d(eVar, "");
        if (!this.f135001f.contains(eVar)) {
            this.f135001f.add(eVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.f
    public final void a(c cVar) {
        h.f.b.l.d(cVar, "");
        n().a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.i
    public final void a(l lVar) {
        h.f.b.l.d(lVar, "");
        if (!this.f135000e.contains(lVar)) {
            this.f135000e.add(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.c
    public final void a(List<EffectCategoryModel> list) {
        h.f.b.l.d(list, "");
        n().a(list);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final void b(int i2, boolean z) {
        n().b(i2, z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.d
    public final void a(int i2, boolean z) {
        n().a(i2, z);
    }

    public a(androidx.lifecycle.m mVar, o oVar) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(oVar, "");
        this.f135004i = mVar;
        this.f135005j = oVar;
    }
}
