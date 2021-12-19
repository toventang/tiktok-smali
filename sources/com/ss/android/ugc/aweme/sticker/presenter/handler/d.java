package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.c.b;
import com.ss.android.ugc.aweme.sticker.panel.c.h;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import h.a.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class d implements l, m {

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f135389a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.presenter.handler.c.a f135390b;

    static {
        Covode.recordClassIndex(88439);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    private final void b() {
        Iterator<T> it = this.f135389a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r3) {
        /*
            r2 = this;
            r2.b()
            java.util.List<com.ss.android.ugc.aweme.sticker.panel.c.h> r0 = r2.f135389a
            java.util.Iterator r1 = r0.iterator()
        L_0x0009:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.sticker.panel.c.h r0 = (com.ss.android.ugc.aweme.sticker.panel.c.h) r0
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L_0x0009
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.presenter.handler.d.a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a):void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
        if (aVar == l.a.AFTER_ANIMATE) {
            for (h hVar : this.f135389a) {
                if (hVar instanceof b) {
                    b bVar = (b) hVar;
                    if (bVar.E) {
                        bVar.N.c();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        Iterator<T> it = this.f135389a.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar = this.f135390b;
        if (aVar != null) {
            a(aVar);
        }
    }

    public final void a(h hVar) {
        h.f.b.l.d(hVar, "");
        if (!this.f135389a.contains(hVar)) {
            this.f135389a.add(hVar);
        }
        List<h> list = this.f135389a;
        if (list.size() > 1) {
            n.a((List) list, (Comparator) new a());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        if (aVar == l.a.BEFORE_ANIMATE) {
            for (h hVar : this.f135389a) {
                if (hVar instanceof b) {
                    b bVar = (b) hVar;
                    if (bVar.E) {
                        bVar.N.b();
                    }
                }
            }
        }
    }

    public static final class a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(88440);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.a().ordinal()), Integer.valueOf(t2.a().ordinal()));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(cVar);
        if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar2 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
            a(aVar2);
            this.f135390b = aVar2;
        } else {
            this.f135390b = null;
            b();
        }
        return a2;
    }
}
