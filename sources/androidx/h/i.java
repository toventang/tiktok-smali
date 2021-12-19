package androidx.h;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class i<T> extends AbstractList<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f3137a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<WeakReference<c>> f3138b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final Executor f3139c;

    /* renamed from: d  reason: collision with root package name */
    final Executor f3140d;

    /* renamed from: e  reason: collision with root package name */
    final a<T> f3141e;

    /* renamed from: f  reason: collision with root package name */
    public final d f3142f;

    /* renamed from: g  reason: collision with root package name */
    final k<T> f3143g;

    /* renamed from: h  reason: collision with root package name */
    int f3144h;

    /* renamed from: i  reason: collision with root package name */
    T f3145i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3146j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3147k;

    /* renamed from: l  reason: collision with root package name */
    int f3148l = Integer.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    int f3149m = Integer.MIN_VALUE;

    public static abstract class a<T> {
        static {
            Covode.recordClassIndex(1128);
        }

        public void a() {
        }

        public void a(T t) {
        }
    }

    public static abstract class c {
        static {
            Covode.recordClassIndex(1130);
        }

        public abstract void a(int i2, int i3);

        public abstract void b(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(1125);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(int i2);

    /* access modifiers changed from: package-private */
    public abstract void a(i<T> iVar, c cVar);

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    public abstract d<?, T> b();

    public abstract Object c();

    public boolean d() {
        return f();
    }

    public boolean f() {
        return this.f3137a.get();
    }

    public final void g() {
        this.f3137a.set(true);
    }

    public int size() {
        return this.f3143g.size();
    }

    public final List<T> e() {
        if (d()) {
            return this;
        }
        return new m(this);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f3163a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3164b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3165c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3166d;

        static {
            Covode.recordClassIndex(1131);
        }

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public int f3167a = -1;

            /* renamed from: b  reason: collision with root package name */
            public int f3168b = -1;

            /* renamed from: c  reason: collision with root package name */
            public int f3169c = -1;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3170d = true;

            static {
                Covode.recordClassIndex(1132);
            }

            public final d a() {
                int i2 = this.f3167a;
                if (i2 > 0) {
                    if (this.f3168b < 0) {
                        this.f3168b = i2;
                    }
                    if (this.f3169c < 0) {
                        this.f3169c = i2 * 3;
                    }
                    if (this.f3170d || this.f3168b != 0) {
                        return new d(this.f3167a, this.f3168b, this.f3170d, this.f3169c, (byte) 0);
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }
        }

        private d(int i2, int i3, boolean z, int i4) {
            this.f3163a = i2;
            this.f3164b = i3;
            this.f3165c = z;
            this.f3166d = i4;
        }

        /* synthetic */ d(int i2, int i3, boolean z, int i4, byte b2) {
            this(i2, i3, z, i4);
        }
    }

    public static final class b<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        public Executor f3157a;

        /* renamed from: b  reason: collision with root package name */
        public Executor f3158b;

        /* renamed from: c  reason: collision with root package name */
        a f3159c;

        /* renamed from: d  reason: collision with root package name */
        Key f3160d;

        /* renamed from: e  reason: collision with root package name */
        private final d<Key, Value> f3161e;

        /* renamed from: f  reason: collision with root package name */
        private final d f3162f;

        static {
            Covode.recordClassIndex(1129);
        }

        public final i<Value> a() {
            Executor executor = this.f3157a;
            if (executor != null) {
                Executor executor2 = this.f3158b;
                if (executor2 != null) {
                    return i.a(this.f3161e, executor, executor2, this.f3159c, this.f3162f, this.f3160d);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }

        public b(d<Key, Value> dVar, d dVar2) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (dVar2 != null) {
                this.f3161e = dVar;
                this.f3162f = dVar2;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i2) {
        T t = this.f3143g.get(i2);
        if (t != null) {
            this.f3145i = t;
        }
        return t;
    }

    public final void a(c cVar) {
        for (int size = this.f3138b.size() - 1; size >= 0; size--) {
            c cVar2 = this.f3138b.get(size).get();
            if (cVar2 == null || cVar2 == cVar) {
                this.f3138b.remove(size);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.f3146j
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0028
            int r1 = r6.f3148l
            androidx.h.i$d r0 = r6.f3142f
            int r0 = r0.f3164b
            if (r1 > r0) goto L_0x0028
            r3 = 1
        L_0x000f:
            boolean r0 = r6.f3147k
            if (r0 == 0) goto L_0x0026
            int r2 = r6.f3149m
            int r1 = r6.size()
            int r1 = r1 - r5
            androidx.h.i$d r0 = r6.f3142f
            int r0 = r0.f3164b
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x0026
        L_0x0021:
            if (r3 != 0) goto L_0x002a
            if (r5 != 0) goto L_0x002e
            return
        L_0x0026:
            r5 = 0
            goto L_0x0021
        L_0x0028:
            r3 = 0
            goto L_0x000f
        L_0x002a:
            r6.f3146j = r4
            if (r5 == 0) goto L_0x0030
        L_0x002e:
            r6.f3147k = r4
        L_0x0030:
            if (r7 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f3139c
            androidx.h.i$2 r0 = new androidx.h.i$2
            r0.<init>(r3, r5)
            r1.execute(r0)
            return
        L_0x003d:
            r6.a(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.h.i.a(boolean):void");
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            this.f3143g.c();
        }
        if (z2) {
            this.f3141e.a(this.f3143g.d());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.f3138b.size() - 1; size >= 0; size--) {
                c cVar = this.f3138b.get(size).get();
                if (cVar != null) {
                    cVar.a(i2, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.f3138b.size() - 1; size >= 0; size--) {
                c cVar = this.f3138b.get(size).get();
                if (cVar != null) {
                    cVar.b(i2, i3);
                }
            }
        }
    }

    public final void a(List<T> list, c cVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                a((i) ((i) list), cVar);
            } else if (!this.f3143g.isEmpty()) {
                cVar.a(0, this.f3143g.size());
            }
        }
        for (int size = this.f3138b.size() - 1; size >= 0; size--) {
            if (this.f3138b.get(size).get() == null) {
                this.f3138b.remove(size);
            }
        }
        this.f3138b.add(new WeakReference<>(cVar));
    }

    i(k<T> kVar, Executor executor, Executor executor2, a<T> aVar, d dVar) {
        this.f3143g = kVar;
        this.f3139c = executor;
        this.f3140d = executor2;
        this.f3141e = aVar;
        this.f3142f = dVar;
    }

    public static <K, T> i<T> a(d<K, T> dVar, Executor executor, Executor executor2, a<T> aVar, d dVar2, K k2) {
        return new c((b) dVar, executor, executor2, aVar, dVar2, k2, -1);
    }
}
