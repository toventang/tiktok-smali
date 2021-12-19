package com.bytedance.als;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public t<T> f6468a;

    static {
        Covode.recordClassIndex(3117);
    }

    public final T a() {
        return this.f6468a.getValue();
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        this.f6468a.setValue(t);
    }

    public h(T t) {
        t<T> tVar = new t<>();
        this.f6468a = tVar;
        tVar.setValue(t);
    }

    public final void a(m mVar) {
        this.f6468a.removeObservers(mVar);
    }

    public final void a(m<T> mVar) {
        this.f6468a.removeObserver(mVar);
    }

    public void a(T t) {
        this.f6468a.postValue(t);
    }

    public final void b(m mVar, m<T> mVar2) {
        this.f6468a.observe(mVar, new i(mVar2));
    }

    public final void a(m mVar, m<T> mVar2) {
        this.f6468a.observe(mVar, mVar2);
    }
}
