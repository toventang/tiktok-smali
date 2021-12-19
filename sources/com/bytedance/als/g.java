package com.bytedance.als;

import androidx.core.g.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private t<T> f6465a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<m<T>> f6466b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final List<e<m<T>, m>> f6467c = new ArrayList();

    static {
        Covode.recordClassIndex(3116);
    }

    public T a() {
        t<T> tVar = this.f6465a;
        if (tVar != null) {
            return tVar.getValue();
        }
        return null;
    }

    private void b() {
        t<T> tVar = this.f6465a;
        if (tVar == null) {
            this.f6465a = new t<>();
        } else if (tVar.getValue() != null) {
            for (e<m<T>, m> eVar : this.f6467c) {
                this.f6465a.removeObserver(eVar.f2397a);
            }
            this.f6465a = new t<>();
            for (e<m<T>, m> eVar2 : this.f6467c) {
                if (eVar2.f2398b != null) {
                    this.f6465a.observe(eVar2.f2398b, eVar2.f2397a);
                } else {
                    this.f6465a.observeForever(eVar2.f2397a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        t<T> tVar = this.f6465a;
        if (tVar != null) {
            tVar.setValue(t);
        }
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        t<T> tVar = this.f6465a;
        if (tVar != null) {
            tVar.postValue(t);
        }
    }

    public void a(m<T> mVar) {
        t<T> tVar = this.f6465a;
        if (tVar != null) {
            tVar.removeObserver(mVar);
            b((m) mVar);
        }
    }

    public final void b(m<T> mVar) {
        this.f6466b.remove(mVar);
        Iterator<e<m<T>, m>> it = this.f6467c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f2397a == mVar) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        t<T> tVar = this.f6465a;
        if (tVar != null && !tVar.hasObservers()) {
            this.f6465a = null;
        }
    }

    public void a(m mVar, m<T> mVar2) {
        if (mVar.getLifecycle().a() != i.b.DESTROYED) {
            if (!this.f6466b.contains(mVar2)) {
                this.f6466b.add(mVar2);
                b();
                this.f6467c.add(e.a(mVar2, mVar));
                this.f6465a.observe(mVar, mVar2);
                mVar.getLifecycle().a(new LiveEvent$1(this, mVar2));
                return;
            }
            throw new IllegalArgumentException("Can't add the same observer twice");
        }
    }
}
