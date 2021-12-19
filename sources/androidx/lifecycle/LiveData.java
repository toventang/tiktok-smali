package androidx.lifecycle;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    int mActiveCount = 0;
    private volatile Object mData;
    final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private androidx.a.a.b.b<u<? super T>, LiveData<T>.b> mObservers = new androidx.a.a.b.b<>();
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    public int mVersion;

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    class LifecycleBoundObserver extends LiveData<T>.b implements f {

        /* renamed from: a  reason: collision with root package name */
        final m f3476a;

        static {
            Covode.recordClassIndex(1279);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public final void b() {
            this.f3476a.getLifecycle().b(this);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public final boolean a() {
            return this.f3476a.getLifecycle().a().isAtLeast(i.b.STARTED);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public final boolean a(m mVar) {
            if (this.f3476a == mVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (this.f3476a.getLifecycle().a() == i.b.DESTROYED) {
                LiveData.this.removeObserver(this.f3479c);
            } else {
                a(a());
            }
        }

        LifecycleBoundObserver(m mVar, u<? super T> uVar) {
            super(uVar);
            this.f3476a = mVar;
        }
    }

    static {
        Covode.recordClassIndex(1277);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasObservers() {
        if (this.mObservers.f798e > 0) {
            return true;
        }
        return false;
    }

    public LiveData() {
        Object obj = NOT_SET;
        this.mData = obj;
        this.mPendingData = obj;
        this.mVersion = -1;
        this.mPostValueRunnable = new Runnable() {
            /* class androidx.lifecycle.LiveData.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1278);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: androidx.lifecycle.LiveData */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            androidx.a.a.a.a.a().b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(u<? super T> uVar) {
        assertMainThread("removeObserver");
        LiveData<T>.b b2 = this.mObservers.b(uVar);
        if (b2 != null) {
            b2.b();
            b2.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    private static void assertMainThread(String str) {
        if (!androidx.a.a.a.a.a().f787a.b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.b bVar) {
        if (bVar.f3480d) {
            if (!bVar.a()) {
                bVar.a(false);
                return;
            }
            int i2 = bVar.f3481e;
            int i3 = this.mVersion;
            if (i2 < i3) {
                bVar.f3481e = i3;
                bVar.f3479c.onChanged((Object) this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(LiveData<T>.b bVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (bVar == null) {
                androidx.a.a.b.b<K, V>.d a2 = this.mObservers.a();
                while (a2.hasNext()) {
                    considerNotify((b) ((Map.Entry) a2.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(bVar);
                bVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(u<? super T> uVar) {
        assertMainThread("observeForever");
        a aVar = new a(uVar);
        LiveData<T>.b a2 = this.mObservers.a(uVar, aVar);
        if (a2 == null) {
            aVar.a(true);
        } else if (a2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    public void removeObservers(m mVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<u<? super T>, LiveData<T>.b>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<u<? super T>, LiveData<T>.b> next = it.next();
            if (next.getValue().a(mVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class b {

        /* renamed from: c  reason: collision with root package name */
        final u<? super T> f3479c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3480d;

        /* renamed from: e  reason: collision with root package name */
        int f3481e = -1;

        static {
            Covode.recordClassIndex(1281);
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public boolean a(m mVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            boolean z2;
            if (z != this.f3480d) {
                this.f3480d = z;
                int i2 = 1;
                if (LiveData.this.mActiveCount == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LiveData liveData = LiveData.this;
                int i3 = liveData.mActiveCount;
                if (!this.f3480d) {
                    i2 = -1;
                }
                liveData.mActiveCount = i3 + i2;
                if (z2 && this.f3480d) {
                    LiveData.this.onActive();
                }
                if (LiveData.this.mActiveCount == 0 && !this.f3480d) {
                    LiveData.this.onInactive();
                }
                if (this.f3480d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        b(u<? super T> uVar) {
            this.f3479c = uVar;
        }
    }

    class a extends LiveData<T>.b {
        static {
            Covode.recordClassIndex(1280);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public final boolean a() {
            return true;
        }

        a(u<? super T> uVar) {
            super(uVar);
        }
    }

    public void observe(m mVar, u<? super T> uVar) {
        assertMainThread("observe");
        if (mVar.getLifecycle().a() != i.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, uVar);
            LiveData<T>.b a2 = this.mObservers.a(uVar, lifecycleBoundObserver);
            if (a2 == null) {
                mVar.getLifecycle().a(lifecycleBoundObserver);
            } else if (!a2.a(mVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }
}
