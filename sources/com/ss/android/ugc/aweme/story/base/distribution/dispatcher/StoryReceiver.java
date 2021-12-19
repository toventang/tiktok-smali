package com.ss.android.ugc.aweme.story.base.distribution.dispatcher;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.story.base.d;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import f.a.b.b;
import h.a.n;
import h.f.b.l;
import java.util.Set;

public final class StoryReceiver implements au {

    /* renamed from: a  reason: collision with root package name */
    public b f136883a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f136884b;

    /* renamed from: c  reason: collision with root package name */
    public final d f136885c;

    /* renamed from: d  reason: collision with root package name */
    public final c<?, ?> f136886d;

    static {
        Covode.recordClassIndex(89460);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        c<?, ?> cVar = this.f136886d;
        d dVar = this.f136885c;
        l.d(dVar, "");
        l.d(this, "");
        Set<StoryReceiver> set = cVar.f136887a.get(dVar);
        if (set != null) {
            n.a((Iterable) set, (h.f.a.b) new c.d(this));
        }
        cVar.f136887a.remove(dVar);
        b bVar = this.f136883a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public StoryReceiver(Object obj, d dVar, c<?, ?> cVar) {
        l.d(obj, "");
        l.d(dVar, "");
        l.d(cVar, "");
        this.f136884b = obj;
        this.f136885c = dVar;
        this.f136886d = cVar;
        dVar.getLifecycle().a(this);
    }
}
