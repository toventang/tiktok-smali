package com.ss.android.ugc.aweme.dependence.beauty.b;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<m> f79583a;

    static {
        Covode.recordClassIndex(49435);
    }

    public final void a(m mVar, u<T> uVar) {
        m mVar2;
        l.d(mVar, "");
        l.d(uVar, "");
        WeakReference<m> weakReference = this.f79583a;
        if (!(weakReference == null || (mVar2 = weakReference.get()) == null)) {
            removeObservers(mVar2);
        }
        this.f79583a = new WeakReference<>(mVar);
        observe(mVar, uVar);
    }
}
