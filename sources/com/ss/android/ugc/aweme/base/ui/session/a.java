package com.ss.android.ugc.aweme.base.ui.session;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<b<T>> f68414a = new ArrayList<>();

    static {
        Covode.recordClassIndex(42117);
    }

    public final void b() {
        this.f68414a.clear();
        c.a().a(this);
    }

    public final void a() {
        Iterator<b<T>> it = this.f68414a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        b();
    }

    public final a<T> a(m mVar) {
        mVar.getLifecycle().a(new Session$2(this));
        return this;
    }

    public final void a(m mVar, b bVar) {
        if (!this.f68414a.contains(bVar)) {
            this.f68414a.add(bVar);
        }
        mVar.getLifecycle().a(new Session$1(this, bVar));
    }
}
