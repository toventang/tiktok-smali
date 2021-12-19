package com.ss.android.ugc.aweme.sticker.types.multi;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.sticker.panel.c, l, m {

    /* renamed from: a  reason: collision with root package name */
    public d f136154a;

    /* renamed from: b  reason: collision with root package name */
    private Effect f136155b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.presenter.handler.c.a f136156c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f136157d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f136158e;

    /* renamed from: f  reason: collision with root package name */
    private final e f136159f;

    /* renamed from: g  reason: collision with root package name */
    private final o f136160g;

    /* renamed from: h  reason: collision with root package name */
    private final h f136161h;

    /* renamed from: i  reason: collision with root package name */
    private final g f136162i;

    /* renamed from: j  reason: collision with root package name */
    private final k f136163j;

    /* renamed from: k  reason: collision with root package name */
    private final b f136164k;

    static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136166a = new a();

        static {
            Covode.recordClassIndex(88932);
        }

        a() {
        }
    }

    static {
        Covode.recordClassIndex(88930);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final boolean b() {
        return this.f136158e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void d() {
        g();
    }

    private final void e() {
        d dVar = this.f136154a;
        if (dVar != null) {
            dVar.c();
        }
        this.f136155b = null;
        this.f136156c = null;
        g();
    }

    private final void f() {
        d dVar = this.f136154a;
        if (dVar != null) {
            dVar.a();
            this.f136158e = true;
        }
    }

    private final void g() {
        d dVar = this.f136154a;
        if (dVar != null) {
            dVar.b();
            this.f136158e = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void c() {
        if (h.f.b.l.a(this.f136160g.f(), this.f136155b)) {
            f();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        if (!this.f136158e && com.ss.android.ugc.aweme.sticker.p.g.y(this.f136155b)) {
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(view, "");
        d dVar = new d(this.f136159f, view, this.f136160g, this.f136162i, this.f136164k, this.f136163j, a.f136166a);
        this.f136154a = dVar;
        dVar.a(this.f136161h);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final b a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar, m.a aVar) {
        List<String> children;
        int i2;
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        b a2 = aVar.a(cVar);
        if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar2 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
            if (com.ss.android.ugc.aweme.sticker.p.g.y(aVar2.f135378a)) {
                Effect effect = aVar2.f135378a;
                this.f136156c = aVar2;
                d dVar = this.f136154a;
                if (dVar != null) {
                    dVar.c();
                }
                this.f136164k.a(effect);
                List list = (List) this.f136164k.l().getValue();
                if (this.f136157d) {
                    if (list != null && !list.isEmpty() && this.f136160g.h() != null) {
                        int size = list.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            String id = ((com.ss.ugc.effectplatform.model.Effect) list.get(i2)).getId();
                            Effect h2 = this.f136160g.h();
                            if (h2 == null) {
                                h.f.b.l.b();
                            }
                            if (TextUtils.equals(id, h2.getId())) {
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = 0;
                    d dVar2 = this.f136154a;
                    if (dVar2 != null) {
                        dVar2.a(i2);
                    }
                    this.f136157d = false;
                } else {
                    d dVar3 = this.f136154a;
                    if (dVar3 != null) {
                        dVar3.a(0);
                    }
                }
                f();
                this.f136155b = effect;
            } else if (this.f136155b != null) {
                Effect effect2 = aVar2.f135378a;
                Effect effect3 = this.f136155b;
                if (effect3 == null || (children = effect3.getChildren()) == null || !children.contains(effect2.getEffectId())) {
                    e();
                }
            }
        } else if ((cVar instanceof d) && this.f136155b != null) {
            e();
        }
        return a2;
    }

    public c(e eVar, o oVar, h hVar, g gVar, k kVar, b bVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(bVar, "");
        this.f136159f = eVar;
        this.f136160g = oVar;
        this.f136161h = hVar;
        this.f136162i = gVar;
        this.f136163j = kVar;
        this.f136164k = bVar;
        bVar.l().observe(eVar, new u<List<? extends Effect>>(this) {
            /* class com.ss.android.ugc.aweme.sticker.types.multi.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f136165a;

            static {
                Covode.recordClassIndex(88931);
            }

            {
                this.f136165a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.sticker.types.multi.d */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(List<? extends Effect> list) {
                List<? extends Effect> list2 = list;
                d dVar = this.f136165a.f136154a;
                if (dVar != 0) {
                    dVar.a((List<Effect>) list2);
                }
            }
        });
    }
}
