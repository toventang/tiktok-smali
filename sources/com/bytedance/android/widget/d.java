package com.bytedance.android.widget;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class d<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f24329a = -1;

    /* renamed from: b  reason: collision with root package name */
    private Map<u, a> f24330b = new HashMap();

    static {
        Covode.recordClassIndex(14287);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        this.f24329a++;
        super.setValue(t);
    }

    class a<T> implements u<T> {

        /* renamed from: b  reason: collision with root package name */
        private int f24332b;

        /* renamed from: c  reason: collision with root package name */
        private u<T> f24333c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f24334d = false;

        static {
            Covode.recordClassIndex(14288);
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(T t) {
            if (this.f24334d || this.f24332b < d.this.f24329a) {
                this.f24333c.onChanged(t);
            }
        }

        a(int i2, u<T> uVar, boolean z) {
            this.f24332b = i2;
            this.f24333c = uVar;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(u<? super T> uVar) {
        a remove = this.f24330b.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(uVar);
        if (uVar instanceof a) {
            for (Map.Entry<u, a> entry : this.f24330b.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    u key = entry.getKey();
                    if (key != null) {
                        this.f24330b.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void a(m mVar, u<T> uVar) {
        if (!this.f24330b.containsKey(uVar)) {
            a aVar = new a(this.f24329a, uVar, false);
            this.f24330b.put(uVar, aVar);
            super.observe(mVar, aVar);
        }
    }
}
