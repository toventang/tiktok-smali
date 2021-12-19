package com.ss.android.ugc.aweme.kids.setting.base.session;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.session.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<b<T>> f106823a = new ArrayList<>();

    static {
        Covode.recordClassIndex(68309);
    }

    public final void b() {
        this.f106823a.clear();
        b.a().a(this);
    }

    public final void a() {
        Iterator<b<T>> it = this.f106823a.iterator();
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
        if (!this.f106823a.contains(bVar)) {
            this.f106823a.add(bVar);
        }
        mVar.getLifecycle().a(new Session$1(this, bVar));
    }
}
