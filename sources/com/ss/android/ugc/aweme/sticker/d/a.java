package com.ss.android.ugc.aweme.sticker.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.a.d;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.g.g;
import com.ss.android.ugc.aweme.sticker.presenter.j;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f134733a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f134734b;

    /* renamed from: c  reason: collision with root package name */
    public final o f134735c;

    /* renamed from: d  reason: collision with root package name */
    private final List<e> f134736d;

    static {
        Covode.recordClassIndex(88069);
    }

    private final j a() {
        return this.f134735c.n();
    }

    public static final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.b.c f134744b;

        static {
            Covode.recordClassIndex(88071);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.b
        public final void a() {
            c.b bVar = this.f134744b.f134773g;
            if (bVar != null) {
                bVar.a();
            }
            if (this.f134743a.f134733a.a(this.f134744b.f134767a, this.f134743a.f134735c)) {
                List<d> list = this.f134743a.f134734b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t instanceof com.ss.android.ugc.aweme.sticker.d.a.a) {
                        arrayList.add(t);
                    }
                }
                ArrayList<com.ss.android.ugc.aweme.sticker.d.a.a> arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    for (com.ss.android.ugc.aweme.sticker.d.a.a aVar : arrayList2) {
                        if (aVar.a(this.f134744b)) {
                            return;
                        }
                    }
                }
                this.f134743a.b(this.f134744b);
            }
        }

        b(a aVar, com.ss.android.ugc.aweme.sticker.d.b.c cVar) {
            this.f134743a = aVar;
            this.f134744b = cVar;
        }
    }

    public /* synthetic */ a(o oVar) {
        this(oVar, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a$a  reason: collision with other inner class name */
    public static final class C3508a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.b.c f134738b;

        static {
            Covode.recordClassIndex(88070);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void c(Effect effect) {
            c.a aVar = this.f134738b.f134772f;
            if (aVar != null) {
                aVar.c(effect);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void b(Effect effect) {
            c.a aVar = this.f134738b.f134772f;
            if (aVar != null) {
                aVar.b(effect);
            }
            this.f134737a.a(this.f134738b);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.g
        public final void a(Effect effect) {
            if (this.f134738b.f134772f instanceof g) {
                ((g) this.f134738b.f134772f).a(effect);
            } else {
                c.a aVar = this.f134738b.f134772f;
                if (aVar != null) {
                    aVar.b(effect);
                }
            }
            this.f134737a.a(this.f134738b);
        }

        C3508a(a aVar, com.ss.android.ugc.aweme.sticker.d.b.c cVar) {
            this.f134737a = aVar;
            this.f134738b = cVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, int i2) {
            c.a aVar = this.f134738b.f134772f;
            if (aVar != null) {
                aVar.a(effect, i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, ExceptionResult exceptionResult) {
            c.a aVar = this.f134738b.f134772f;
            if (aVar != null) {
                aVar.a(effect, exceptionResult);
            }
        }
    }

    private static boolean a(Effect effect) {
        if (effect.getEffectType() == 1 || effect.getEffectType() == 2 || effect.getEffectType() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.d
    public final void a(d dVar) {
        l.d(dVar, "");
        if (!this.f134734b.contains(dVar)) {
            this.f134734b.add(dVar);
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.d.b.c cVar) {
        if (cVar.f134775i) {
            b bVar = new b(this, cVar);
            if (a(cVar.f134767a) || !this.f134735c.a(cVar.f134767a)) {
                bVar.a();
            } else {
                this.f134735c.a(cVar.f134767a, bVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.d
    public final <T> void a(com.ss.android.ugc.aweme.sticker.d.b.b<T> bVar) {
        l.d(bVar, "");
        List<d> list = this.f134734b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(!it.next().a(bVar))) {
                    return;
                }
            }
        }
        if (bVar instanceof com.ss.android.ugc.aweme.sticker.d.b.d) {
            this.f134735c.n().b(null);
            com.ss.android.ugc.aweme.sticker.d.b.d dVar = (com.ss.android.ugc.aweme.sticker.d.b.d) bVar;
            Effect effect = dVar.f134777a;
            a().a((Effect) null);
            if (!a().c(effect)) {
                Iterator<T> it2 = this.f134736d.iterator();
                while (it2.hasNext()) {
                    it2.next().a(new com.ss.android.ugc.aweme.sticker.presenter.handler.c.d(effect, dVar.f134778b, dVar.f134779c, dVar.f134780d, (byte) 0));
                }
            }
        } else if (bVar instanceof com.ss.android.ugc.aweme.sticker.d.b.c) {
            com.ss.android.ugc.aweme.sticker.d.b.c cVar = (com.ss.android.ugc.aweme.sticker.d.b.c) bVar;
            this.f134735c.n().b(cVar.f134767a);
            C3508a aVar = new C3508a(this, cVar);
            if (a(cVar.f134767a)) {
                aVar.b(cVar.f134767a);
            } else {
                this.f134735c.a(new ac(cVar.f134767a), aVar);
            }
        }
    }

    public final void b(com.ss.android.ugc.aweme.sticker.d.b.c cVar) {
        Effect g2;
        Effect effect = cVar.f134767a;
        int i2 = cVar.f134768b;
        if (com.ss.android.ugc.aweme.sticker.p.g.D(effect) && (g2 = this.f134735c.g()) != null && !com.ss.android.ugc.aweme.sticker.p.g.a(g2) && (TextUtils.isEmpty(g2.getParentId()) || (!l.a((Object) g2.getParentId(), (Object) effect.getParentId())))) {
            a(com.ss.android.ugc.aweme.sticker.f.a.a(com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET));
            this.f134735c.n().b(effect);
        }
        if (a().c(effect)) {
            a().a(effect, i2);
        } else {
            a().a(effect);
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar = new com.ss.android.ugc.aweme.sticker.presenter.handler.c.a(effect, i2, cVar.f134769c, cVar.f134771e);
        this.f134735c.n().a(aVar);
        Iterator<T> it = this.f134736d.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        Effect effect2 = cVar.f134770d;
        if (effect2 != null) {
            this.f134735c.a(new ac(effect2), (c.a) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.d
    public final void a(e eVar) {
        l.d(eVar, "");
        if (!this.f134736d.contains(eVar)) {
            this.f134736d.add(eVar);
        }
    }

    public a(o oVar, c cVar) {
        l.d(oVar, "");
        this.f134735c = oVar;
        this.f134733a = cVar == null ? b.f134764a : cVar;
        this.f134736d = new ArrayList();
        this.f134734b = new ArrayList();
    }
}
