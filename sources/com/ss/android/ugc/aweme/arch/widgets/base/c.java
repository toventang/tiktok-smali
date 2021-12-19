package com.ss.android.ugc.aweme.arch.widgets.base;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class c<T> extends t<T> {

    /* renamed from: c  reason: collision with root package name */
    private static Handler f67016c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public int f67017a = -1;

    /* renamed from: b  reason: collision with root package name */
    private Map<u, c<T>.a> f67018b = new HashMap();

    static {
        Covode.recordClassIndex(41302);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(u<? super T> uVar) {
        a(uVar, false);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public void postValue(final T t) {
        f67016c.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.arch.widgets.base.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41303);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.arch.widgets.base.c */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                c.this.setValue(t);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public void setValue(T t) {
        this.f67017a++;
        super.setValue(t);
    }

    /* access modifiers changed from: package-private */
    public class a<R> implements u<R> {

        /* renamed from: b  reason: collision with root package name */
        private int f67022b;

        /* renamed from: c  reason: collision with root package name */
        private u<R> f67023c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f67024d;

        static {
            Covode.recordClassIndex(41304);
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(R r) {
            if (this.f67024d || this.f67022b < c.this.f67017a) {
                this.f67023c.onChanged(r);
            }
        }

        a(int i2, u<R> uVar, boolean z) {
            this.f67022b = i2;
            this.f67023c = uVar;
            this.f67024d = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(u<? super T> uVar) {
        c<T>.a remove = this.f67018b.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
        } else if (uVar instanceof a) {
            for (Map.Entry<u, c<T>.a> entry : this.f67018b.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    u key = entry.getKey();
                    super.removeObserver(uVar);
                    if (key != null) {
                        this.f67018b.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(m mVar, u<? super T> uVar) {
        a(mVar, uVar, false);
    }

    public final void a(u<? super T> uVar, boolean z) {
        if (!this.f67018b.containsKey(uVar)) {
            c<T>.a aVar = new a<>(this.f67017a, uVar, z);
            this.f67018b.put(uVar, aVar);
            super.observeForever(aVar);
        }
    }

    public final void a(m mVar, u<? super T> uVar, boolean z) {
        if (!this.f67018b.containsKey(uVar)) {
            c<T>.a aVar = new a<>(this.f67017a, uVar, z);
            this.f67018b.put(uVar, aVar);
            super.observe(mVar, aVar);
        }
    }
}
