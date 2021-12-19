package com.ss.android.ugc.aweme.sticker.presenter.handler.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.presenter.p;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a implements m, p {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f135360a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.presenter.m f135361b;

    static {
        Covode.recordClassIndex(88425);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void b(m mVar) {
        l.d(mVar, "");
        this.f135360a.remove(mVar);
    }

    public a(com.ss.android.ugc.aweme.sticker.presenter.m mVar) {
        this.f135361b = mVar;
        CopyOnWriteArrayList<m> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (mVar != null) {
            copyOnWriteArrayList.add(new c(mVar));
        }
        this.f135360a = copyOnWriteArrayList;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void a(m mVar) {
        l.d(mVar, "");
        if (!this.f135360a.contains(mVar)) {
            this.f135360a.add(mVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final m a(b<? super m, Boolean> bVar) {
        T t;
        l.d(bVar, "");
        Iterator<T> it = this.f135360a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (bVar.invoke(t).booleanValue()) {
                break;
            }
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(cVar);
        for (m mVar : n.e((List) this.f135360a)) {
            mVar.a(cVar, com.ss.android.ugc.aweme.sticker.presenter.handler.a.a.b.f135366a);
        }
        return a2;
    }
}
