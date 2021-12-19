package androidx.lifecycle;

import androidx.a.a.b.b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

public class r<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private b<LiveData<?>, a<?>> f3543a = new b<>();

    static {
        Covode.recordClassIndex(1334);
    }

    static class a<V> implements u<V> {

        /* renamed from: a  reason: collision with root package name */
        final LiveData<V> f3544a;

        /* renamed from: b  reason: collision with root package name */
        final u<? super V> f3545b;

        /* renamed from: c  reason: collision with root package name */
        int f3546c = -1;

        static {
            Covode.recordClassIndex(1335);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3544a.observeForever(this);
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(V v) {
            if (this.f3546c != this.f3544a.mVersion) {
                this.f3546c = this.f3544a.mVersion;
                this.f3545b.onChanged(v);
            }
        }

        a(LiveData<V> liveData, u<? super V> uVar) {
            this.f3544a = liveData;
            this.f3545b = uVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3543a.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3543a.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f3544a.removeObserver(value);
        }
    }

    public final <S> void a(LiveData<S> liveData, u<? super S> uVar) {
        a<?> aVar = new a<>(liveData, uVar);
        a<?> a2 = this.f3543a.a(liveData, aVar);
        if (a2 != null) {
            if (a2.f3545b != uVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
        } else if (hasActiveObservers()) {
            aVar.a();
        }
    }
}
