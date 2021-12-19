package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.d;
import com.google.c.b.a;
import com.google.c.b.c;
import com.google.c.b.d;
import com.google.c.c.ai;
import com.google.c.c.an;
import com.google.c.h.a.d;
import com.google.c.h.a.u;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public class g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f53737a = Logger.getLogger(g.class.getName());
    static final w<Object, Object> u = new w<Object, Object>() {
        /* class com.google.c.b.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(33280);
        }

        @Override // com.google.c.b.g.w
        public final int a() {
            return 0;
        }

        @Override // com.google.c.b.g.w
        public final w<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, k<Object, Object> kVar) {
            return this;
        }

        @Override // com.google.c.b.g.w
        public final void a(Object obj) {
        }

        @Override // com.google.c.b.g.w
        public final k<Object, Object> b() {
            return null;
        }

        @Override // com.google.c.b.g.w
        public final boolean c() {
            return false;
        }

        @Override // com.google.c.b.g.w
        public final boolean d() {
            return false;
        }

        @Override // com.google.c.b.g.w
        public final Object e() {
            return null;
        }

        @Override // com.google.c.b.g.w
        public final Object get() {
            return null;
        }
    };
    static final Queue<?> v = new AbstractQueue<Object>() {
        /* class com.google.c.b.g.AnonymousClass2 */

        static {
            Covode.recordClassIndex(33281);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return ai.of().iterator();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final int f53738b;

    /* renamed from: c  reason: collision with root package name */
    final int f53739c;

    /* renamed from: d  reason: collision with root package name */
    final n<K, V>[] f53740d;

    /* renamed from: e  reason: collision with root package name */
    final int f53741e;

    /* renamed from: f  reason: collision with root package name */
    final com.google.c.a.d<Object> f53742f;

    /* renamed from: g  reason: collision with root package name */
    final com.google.c.a.d<Object> f53743g;

    /* renamed from: h  reason: collision with root package name */
    final p f53744h;

    /* renamed from: i  reason: collision with root package name */
    final p f53745i;

    /* renamed from: j  reason: collision with root package name */
    final long f53746j;

    /* renamed from: k  reason: collision with root package name */
    final p<K, V> f53747k;

    /* renamed from: l  reason: collision with root package name */
    final long f53748l;

    /* renamed from: m  reason: collision with root package name */
    final long f53749m;
    final long n;
    final Queue<n<K, V>> o;
    final m<K, V> p;
    final com.google.c.a.t q;
    final d r;
    final a.b s;
    final d<? super K, V> t;
    Set<K> w;
    Collection<V> x;
    Set<Map.Entry<K, V>> y;

    /* access modifiers changed from: package-private */
    public interface w<K, V> {
        static {
            Covode.recordClassIndex(33327);
        }

        int a();

        w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar);

        void a(V v);

        k<K, V> b();

        boolean c();

        boolean d();

        V e();

        V get();
    }

    static class aa<K, V> extends WeakReference<K> implements k<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final int f53752g;

        /* renamed from: h  reason: collision with root package name */
        final k<K, V> f53753h;

        /* renamed from: i  reason: collision with root package name */
        volatile w<K, V> f53754i = ((w<K, V>) g.u);

        static {
            Covode.recordClassIndex(33283);
        }

        @Override // com.google.c.b.k
        public final w<K, V> a() {
            return this.f53754i;
        }

        @Override // com.google.c.b.k
        public final k<K, V> b() {
            return this.f53753h;
        }

        @Override // com.google.c.b.k
        public final int c() {
            return this.f53752g;
        }

        @Override // com.google.c.b.k
        public final K d() {
            return (K) get();
        }

        @Override // com.google.c.b.k
        public long e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void b(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void c(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public final void a(w<K, V> wVar) {
            this.f53754i = wVar;
        }

        @Override // com.google.c.b.k
        public void b(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void d(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void a(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        aa(ReferenceQueue<K> referenceQueue, K k2, int i2, k<K, V> kVar) {
            super(k2, referenceQueue);
            this.f53752g = i2;
            this.f53753h = kVar;
        }
    }

    static class ab<K, V> extends WeakReference<V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f53755a;

        static {
            Covode.recordClassIndex(33284);
        }

        @Override // com.google.c.b.g.w
        public final int a() {
            return 1;
        }

        @Override // com.google.c.b.g.w
        public final void a(V v) {
        }

        @Override // com.google.c.b.g.w
        public final boolean c() {
            return false;
        }

        @Override // com.google.c.b.g.w
        public final boolean d() {
            return true;
        }

        @Override // com.google.c.b.g.w
        public final k<K, V> b() {
            return this.f53755a;
        }

        @Override // com.google.c.b.g.w
        public final V e() {
            return get();
        }

        ab(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            super(v, referenceQueue);
            this.f53755a = kVar;
        }

        @Override // com.google.c.b.g.w
        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new ab(referenceQueue, v, kVar);
        }
    }

    static final class ac<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53756a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53757b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53758c = m.INSTANCE;

        static {
            Covode.recordClassIndex(33285);
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final long h() {
            return this.f53756a;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> i() {
            return this.f53757b;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> j() {
            return this.f53758c;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void b(long j2) {
            this.f53756a = j2;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void c(k<K, V> kVar) {
            this.f53757b = kVar;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void d(k<K, V> kVar) {
            this.f53758c = kVar;
        }

        ac(ReferenceQueue<K> referenceQueue, K k2, int i2, k<K, V> kVar) {
            super(referenceQueue, k2, i2, kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final class ae implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f53764a;

        /* renamed from: b  reason: collision with root package name */
        V f53765b;

        static {
            Covode.recordClassIndex(33289);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f53764a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f53765b;
        }

        public final int hashCode() {
            return this.f53764a.hashCode() ^ this.f53765b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) g.this.put(this.f53764a, v);
            this.f53765b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!this.f53764a.equals(entry.getKey()) || !this.f53765b.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        ae(K k2, V v) {
            this.f53764a = k2;
            this.f53765b = v;
        }
    }

    static abstract class b<K, V> implements k<K, V> {
        static {
            Covode.recordClassIndex(33290);
        }

        b() {
        }

        @Override // com.google.c.b.k
        public w<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public int c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public K d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public long e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public k<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void b(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void c(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void d(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void a(w<K, V> wVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void b(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.c.b.k
        public void a(k<K, V> kVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    public static class k<K, V> implements b<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final g<K, V> localCache;

        static {
            Covode.recordClassIndex(33310);
        }

        @Override // com.google.c.b.b
        public final ConcurrentMap<K, V> a() {
            return this.localCache;
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new l(this.localCache);
        }

        private k(g<K, V> gVar) {
            this.localCache = gVar;
        }

        k(c<? super K, ? super V> cVar) {
            this(new g(cVar));
        }

        @Override // com.google.c.b.b
        public final void b(Object obj) {
            com.google.c.a.k.a(obj);
            this.localCache.remove(obj);
        }

        @Override // com.google.c.b.b
        public final V a(Object obj) {
            g<K, V> gVar = this.localCache;
            int a2 = gVar.a(com.google.c.a.k.a(obj));
            V a3 = gVar.a(a2).a(obj, a2);
            if (a3 == null) {
                gVar.s.b();
            } else {
                gVar.s.a();
            }
            return a3;
        }

        @Override // com.google.c.b.b
        public final void a(K k2, V v) {
            this.localCache.put(k2, v);
        }

        @Override // com.google.c.b.b
        public final V a(K k2, final Callable<? extends V> callable) {
            com.google.c.a.k.a(callable);
            g<K, V> gVar = this.localCache;
            AnonymousClass1 r2 = new d<Object, V>() {
                /* class com.google.c.b.g.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33311);
                }

                @Override // com.google.c.b.d
                public final V a() {
                    return (V) callable.call();
                }
            };
            int a2 = gVar.a(com.google.c.a.k.a(k2));
            return gVar.a(a2).a((Object) k2, a2, (d) r2);
        }
    }

    static class l<K, V> extends f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a  reason: collision with root package name */
        transient b<K, V> f53800a;
        final int concurrencyLevel;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.c.a.d<Object> keyEquivalence;
        final p keyStrength;
        final d<? super K, V> loader;
        final long maxWeight;
        final m<? super K, ? super V> removalListener;
        final com.google.c.a.t ticker;
        final com.google.c.a.d<Object> valueEquivalence;
        final p valueStrength;
        final p<K, V> weigher;

        static {
            Covode.recordClassIndex(33312);
        }

        private Object readResolve() {
            return this.f53800a;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.b.f
        public final b<K, V> b() {
            return this.f53800a;
        }

        @Override // com.google.c.b.f, com.google.c.c.u
        public final /* bridge */ /* synthetic */ Object c() {
            return this.f53800a;
        }

        l(g<K, V> gVar) {
            this(gVar.f53744h, gVar.f53745i, gVar.f53742f, gVar.f53743g, gVar.f53749m, gVar.f53748l, gVar.f53746j, gVar.f53747k, gVar.f53741e, gVar.p, gVar.q, gVar.t);
        }

        /* JADX DEBUG: Type inference failed for r0v20. Raw type applied. Possible types: com.google.c.b.m<? super K, ? super V>, com.google.c.b.m<? super K1 extends K, ? super V1 extends V> */
        /* JADX DEBUG: Type inference failed for r0v25. Raw type applied. Possible types: com.google.c.b.b<K1 extends K, V1 extends V>, com.google.c.b.b<K, V> */
        private void readObject(ObjectInputStream objectInputStream) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            objectInputStream.defaultReadObject();
            c cVar = new c();
            p pVar = this.keyStrength;
            boolean z15 = true;
            if (cVar.f53724k == null) {
                z = true;
            } else {
                z = false;
            }
            com.google.c.a.k.b(z, "Key strength was already set to %s", cVar.f53724k);
            cVar.f53724k = (p) com.google.c.a.k.a(pVar);
            c<K, V> a2 = cVar.a(this.valueStrength);
            com.google.c.a.d<Object> dVar = this.keyEquivalence;
            if (a2.p == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.google.c.a.k.b(z2, "key equivalence was already set to %s", a2.p);
            a2.p = (com.google.c.a.d) com.google.c.a.k.a(dVar);
            com.google.c.a.d<Object> dVar2 = this.valueEquivalence;
            if (a2.q == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.google.c.a.k.b(z3, "value equivalence was already set to %s", a2.q);
            a2.q = (com.google.c.a.d) com.google.c.a.k.a(dVar2);
            int i2 = this.concurrencyLevel;
            if (a2.f53720g == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i3 = a2.f53720g;
            if (z4) {
                if (i2 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.google.c.a.k.a(z5);
                a2.f53720g = i2;
                c<K1, V1> a3 = a2.a((m<? super K, ? super V>) this.removalListener);
                a3.f53718e = false;
                long j2 = this.expireAfterWriteNanos;
                if (j2 > 0) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (a3.f53726m == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    com.google.c.a.k.a(z13, "expireAfterWrite was already set to %s ns", a3.f53726m);
                    if (j2 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    com.google.c.a.k.a(z14, "duration cannot be negative: %s %s", j2, timeUnit);
                    a3.f53726m = timeUnit.toNanos(j2);
                }
                long j3 = this.expireAfterAccessNanos;
                if (j3 > 0) {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    if (a3.n == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.google.c.a.k.a(z11, "expireAfterAccess was already set to %s ns", a3.n);
                    if (j3 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    com.google.c.a.k.a(z12, "duration cannot be negative: %s %s", j3, timeUnit2);
                    a3.n = timeUnit2.toNanos(j3);
                }
                if (this.weigher != c.b.INSTANCE) {
                    p<K, V> pVar2 = this.weigher;
                    if (a3.f53723j == null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    com.google.c.a.k.b(z6);
                    if (a3.f53718e) {
                        if (a3.f53721h == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        com.google.c.a.k.a(z10, "weigher can not be combined with maximum size", a3.f53721h);
                    }
                    a3.f53723j = (p) com.google.c.a.k.a(pVar2);
                    long j4 = this.maxWeight;
                    if (j4 != -1) {
                        if (a3.f53722i == -1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        com.google.c.a.k.a(z7, "maximum weight was already set to %s", a3.f53722i);
                        if (a3.f53721h == -1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        com.google.c.a.k.a(z8, "maximum size was already set to %s", a3.f53721h);
                        a3.f53722i = j4;
                        if (j4 >= 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.google.c.a.k.a(z9, "maximum weight must not be negative");
                    }
                } else {
                    long j5 = this.maxWeight;
                    if (j5 != -1) {
                        a3.a(j5);
                    }
                }
                com.google.c.a.t tVar = this.ticker;
                if (tVar != null) {
                    if (a3.s != null) {
                        z15 = false;
                    }
                    com.google.c.a.k.b(z15);
                    a3.s = (com.google.c.a.t) com.google.c.a.k.a(tVar);
                }
                this.f53800a = (b<K1, V1>) a3.c();
                return;
            }
            throw new IllegalStateException(com.google.c.a.k.a("concurrency level was already set to %s", Integer.valueOf(i3)));
        }

        private l(p pVar, p pVar2, com.google.c.a.d<Object> dVar, com.google.c.a.d<Object> dVar2, long j2, long j3, long j4, p<K, V> pVar3, int i2, m<? super K, ? super V> mVar, com.google.c.a.t tVar, d<? super K, V> dVar3) {
            this.keyStrength = pVar;
            this.valueStrength = pVar2;
            this.keyEquivalence = dVar;
            this.valueEquivalence = dVar2;
            this.expireAfterWriteNanos = j2;
            this.expireAfterAccessNanos = j3;
            this.maxWeight = j4;
            this.weigher = pVar3;
            this.concurrencyLevel = i2;
            this.removalListener = mVar;
            this.ticker = (tVar == com.google.c.a.t.f53707a || tVar == c.f53717d) ? null : tVar;
            this.loader = dVar3;
        }
    }

    static class o<K, V> extends SoftReference<V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f53808a;

        static {
            Covode.recordClassIndex(33316);
        }

        @Override // com.google.c.b.g.w
        public final int a() {
            return 1;
        }

        @Override // com.google.c.b.g.w
        public final void a(V v) {
        }

        @Override // com.google.c.b.g.w
        public final boolean c() {
            return false;
        }

        @Override // com.google.c.b.g.w
        public final boolean d() {
            return true;
        }

        @Override // com.google.c.b.g.w
        public final k<K, V> b() {
            return this.f53808a;
        }

        @Override // com.google.c.b.g.w
        public final V e() {
            return get();
        }

        o(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            super(v, referenceQueue);
            this.f53808a = kVar;
        }

        @Override // com.google.c.b.g.w
        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return new o(referenceQueue, v, kVar);
        }
    }

    static final class q<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53813a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53814b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53815c = m.INSTANCE;

        static {
            Covode.recordClassIndex(33321);
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final long e() {
            return this.f53813a;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> f() {
            return this.f53814b;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> g() {
            return this.f53815c;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void a(long j2) {
            this.f53813a = j2;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void b(k<K, V> kVar) {
            this.f53815c = kVar;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void a(k<K, V> kVar) {
            this.f53814b = kVar;
        }

        q(K k2, int i2, k<K, V> kVar) {
            super(k2, i2, kVar);
        }
    }

    static final class r<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53816a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53817b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53818c = m.INSTANCE;

        /* renamed from: d  reason: collision with root package name */
        volatile long f53819d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        k<K, V> f53820e = m.INSTANCE;

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f53821f = m.INSTANCE;

        static {
            Covode.recordClassIndex(33322);
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final long e() {
            return this.f53816a;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> f() {
            return this.f53817b;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> g() {
            return this.f53818c;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final long h() {
            return this.f53819d;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> i() {
            return this.f53820e;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> j() {
            return this.f53821f;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void a(long j2) {
            this.f53816a = j2;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void b(long j2) {
            this.f53819d = j2;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void c(k<K, V> kVar) {
            this.f53820e = kVar;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void d(k<K, V> kVar) {
            this.f53821f = kVar;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void a(k<K, V> kVar) {
            this.f53817b = kVar;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void b(k<K, V> kVar) {
            this.f53818c = kVar;
        }

        r(K k2, int i2, k<K, V> kVar) {
            super(k2, i2, kVar);
        }
    }

    static class s<K, V> extends b<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final K f53822g;

        /* renamed from: h  reason: collision with root package name */
        final int f53823h;

        /* renamed from: i  reason: collision with root package name */
        final k<K, V> f53824i;

        /* renamed from: j  reason: collision with root package name */
        volatile w<K, V> f53825j = ((w<K, V>) g.u);

        static {
            Covode.recordClassIndex(33323);
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final w<K, V> a() {
            return this.f53825j;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> b() {
            return this.f53824i;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final int c() {
            return this.f53823h;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final K d() {
            return this.f53822g;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void a(w<K, V> wVar) {
            this.f53825j = wVar;
        }

        s(K k2, int i2, k<K, V> kVar) {
            this.f53822g = k2;
            this.f53823h = i2;
            this.f53824i = kVar;
        }
    }

    static class t<K, V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final V f53826a;

        static {
            Covode.recordClassIndex(33324);
        }

        @Override // com.google.c.b.g.w
        public final int a() {
            return 1;
        }

        @Override // com.google.c.b.g.w
        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return this;
        }

        @Override // com.google.c.b.g.w
        public final void a(V v) {
        }

        @Override // com.google.c.b.g.w
        public final k<K, V> b() {
            return null;
        }

        @Override // com.google.c.b.g.w
        public final boolean c() {
            return false;
        }

        @Override // com.google.c.b.g.w
        public final boolean d() {
            return true;
        }

        @Override // com.google.c.b.g.w
        public final V get() {
            return this.f53826a;
        }

        @Override // com.google.c.b.g.w
        public final V e() {
            return get();
        }

        t(V v) {
            this.f53826a = v;
        }
    }

    static final class u<K, V> extends s<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53827a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53828b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53829c = m.INSTANCE;

        static {
            Covode.recordClassIndex(33325);
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final long h() {
            return this.f53827a;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> i() {
            return this.f53828b;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final k<K, V> j() {
            return this.f53829c;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void b(long j2) {
            this.f53827a = j2;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void c(k<K, V> kVar) {
            this.f53828b = kVar;
        }

        @Override // com.google.c.b.g.b, com.google.c.b.k
        public final void d(k<K, V> kVar) {
            this.f53829c = kVar;
        }

        u(K k2, int i2, k<K, V> kVar) {
            super(k2, i2, kVar);
        }
    }

    static final class y<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53833a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53834b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53835c = m.INSTANCE;

        static {
            Covode.recordClassIndex(33329);
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final long e() {
            return this.f53833a;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> f() {
            return this.f53834b;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> g() {
            return this.f53835c;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void a(long j2) {
            this.f53833a = j2;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void b(k<K, V> kVar) {
            this.f53835c = kVar;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void a(k<K, V> kVar) {
            this.f53834b = kVar;
        }

        y(ReferenceQueue<K> referenceQueue, K k2, int i2, k<K, V> kVar) {
            super(referenceQueue, k2, i2, kVar);
        }
    }

    static final class z<K, V> extends aa<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f53836a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        k<K, V> f53837b = m.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        k<K, V> f53838c = m.INSTANCE;

        /* renamed from: d  reason: collision with root package name */
        volatile long f53839d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        k<K, V> f53840e = m.INSTANCE;

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f53841f = m.INSTANCE;

        static {
            Covode.recordClassIndex(33330);
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final long e() {
            return this.f53836a;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> f() {
            return this.f53837b;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> g() {
            return this.f53838c;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final long h() {
            return this.f53839d;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> i() {
            return this.f53840e;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final k<K, V> j() {
            return this.f53841f;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void a(long j2) {
            this.f53836a = j2;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void b(long j2) {
            this.f53839d = j2;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void c(k<K, V> kVar) {
            this.f53840e = kVar;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void d(k<K, V> kVar) {
            this.f53841f = kVar;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void a(k<K, V> kVar) {
            this.f53837b = kVar;
        }

        @Override // com.google.c.b.k, com.google.c.b.g.aa
        public final void b(k<K, V> kVar) {
            this.f53838c = kVar;
        }

        z(ReferenceQueue<K> referenceQueue, K k2, int i2, k<K, V> kVar) {
            super(referenceQueue, k2, i2, kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class n<K, V> extends ReentrantLock {
        final Queue<k<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final g<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<k<K, V>> recencyQueue;
        final a.b statsCounter;
        volatile AtomicReferenceArray<k<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<k<K, V>> writeQueue;

        static {
            Covode.recordClassIndex(33314);
        }

        /* access modifiers changed from: package-private */
        public final V a(K k2, int i2, d<? super K, V> dVar) {
            k<K, V> e2;
            com.google.c.a.k.a(k2);
            com.google.c.a.k.a(dVar);
            try {
                if (!(this.count == 0 || (e2 = e(k2, i2)) == null)) {
                    long a2 = this.map.q.a();
                    V a3 = a(e2, a2);
                    if (a3 != null) {
                        b(e2, a2);
                        this.statsCounter.a();
                        V a4 = a(e2, k2, i2, a3, a2, dVar);
                        a();
                        return a4;
                    }
                    w<K, V> a5 = e2.a();
                    if (a5.c()) {
                        V a6 = a(e2, k2, a5);
                        a();
                        return a6;
                    }
                }
                V b2 = b((Object) k2, i2, (d) dVar);
                a();
                return b2;
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof Error) {
                    throw new com.google.c.h.a.f((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new com.google.c.h.a.x(cause);
                } else {
                    throw e3;
                }
            } catch (Throwable th) {
                a();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V a(K r6, int r7, com.google.c.b.g.j<K, V> r8, com.google.c.h.a.q<V> r9) {
            /*
                r5 = this;
                java.lang.Object r4 = com.google.c.h.a.y.a(r9)     // Catch:{ all -> 0x0030 }
                if (r4 == 0) goto L_0x0013
                com.google.c.b.a$b r2 = r5.statsCounter     // Catch:{ all -> 0x002e }
                long r0 = r8.f()     // Catch:{ all -> 0x002e }
                r2.a(r0)     // Catch:{ all -> 0x002e }
                r5.a(r6, r7, r8, r4)     // Catch:{ all -> 0x002e }
                return r4
            L_0x0013:
                com.google.c.b.d$a r2 = new com.google.c.b.d$a     // Catch:{ all -> 0x002e }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "CacheLoader returned null for key "
                r1.<init>(r0)     // Catch:{ all -> 0x002e }
                java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "."
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x002e }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002e }
                r2.<init>(r0)     // Catch:{ all -> 0x002e }
                throw r2     // Catch:{ all -> 0x002e }
            L_0x002e:
                r3 = move-exception
                goto L_0x0032
            L_0x0030:
                r3 = move-exception
                r4 = 0
            L_0x0032:
                if (r4 != 0) goto L_0x0040
                com.google.c.b.a$b r2 = r5.statsCounter
                long r0 = r8.f()
                r2.b(r0)
                r5.a(r6, r7, r8)
            L_0x0040:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.b.g.n.a(java.lang.Object, int, com.google.c.b.g$j, com.google.c.h.a.q):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public final void a(K k2, V v, int i2, l lVar) {
            this.totalWeight -= (long) i2;
            if (lVar.a()) {
                this.statsCounter.c();
            }
            if (this.map.o != g.v) {
                this.map.o.offer(n.create(k2, v, lVar));
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(k<K, V> kVar, long j2) {
            if (kVar.d() == null) {
                c();
                return null;
            }
            V v = kVar.a().get();
            if (v == null) {
                c();
                return null;
            } else if (!this.map.a(kVar, j2)) {
                return v;
            } else {
                b(j2);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(Object obj, int i2) {
            try {
                if (this.count != 0) {
                    long a2 = this.map.q.a();
                    k<K, V> a3 = a(obj, i2, a2);
                    if (a3 == null) {
                        return null;
                    }
                    V v = a3.a().get();
                    if (v != null) {
                        b(a3, a2);
                        V a4 = a(a3, a3.d(), i2, v, a2, this.map.t);
                        a();
                        return a4;
                    }
                    c();
                }
                a();
                return null;
            } finally {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(K k2, int i2, V v, boolean z) {
            int i3;
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                if (this.count + 1 > this.threshold) {
                    i();
                }
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        w<K, V> a3 = kVar2.a();
                        V v2 = a3.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (a3.d()) {
                                a(k2, v2, a3.a(), l.COLLECTED);
                                a(kVar2, v, a2);
                                i3 = this.count;
                            } else {
                                a(kVar2, v, a2);
                                i3 = this.count + 1;
                            }
                            this.count = i3;
                            a(kVar2);
                            return null;
                        } else if (z) {
                            c(kVar2, a2);
                            unlock();
                            b();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k2, v2, a3.a(), l.REPLACED);
                            a(kVar2, v, a2);
                            a(kVar2);
                            unlock();
                            b();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                k<K, V> a4 = a((Object) k2, i2, (k) kVar);
                a(a4, v, a2);
                atomicReferenceArray.set(length, a4);
                this.count++;
                a(a4);
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k2, int i2, V v, V v2) {
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        w<K, V> a3 = kVar2.a();
                        V v3 = a3.get();
                        if (v3 == null) {
                            if (a3.d()) {
                                this.modCount++;
                                atomicReferenceArray.set(length, a(kVar, kVar2, d2, v3, a3, l.COLLECTED));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.f53743g.a(v, v3)) {
                            this.modCount++;
                            a(k2, v3, a3.a(), l.REPLACED);
                            a(kVar2, v2, a2);
                            a(kVar2);
                            unlock();
                            b();
                            return true;
                        } else {
                            c(kVar2, a2);
                            unlock();
                            b();
                            return false;
                        }
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(K k2, int i2, V v) {
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        w<K, V> a3 = kVar2.a();
                        V v2 = a3.get();
                        if (v2 == null) {
                            if (a3.d()) {
                                this.modCount++;
                                atomicReferenceArray.set(length, a(kVar, kVar2, d2, v2, a3, l.COLLECTED));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, a3.a(), l.REPLACED);
                        a(kVar2, v, a2);
                        a(kVar2);
                        unlock();
                        b();
                        return v2;
                    }
                }
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        private boolean a(K k2, int i2, j<K, V> jVar, V v) {
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                int i3 = this.count + 1;
                if (i3 > this.threshold) {
                    i();
                    i3 = this.count + 1;
                }
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        w<K, V> a3 = kVar2.a();
                        V v2 = a3.get();
                        if (jVar == a3 || (v2 == null && a3 != g.u)) {
                            this.modCount++;
                            if (jVar.d()) {
                                a(k2, v2, jVar.a(), v2 == null ? l.COLLECTED : l.REPLACED);
                                i3--;
                            }
                            a(kVar2, v, a2);
                            this.count = i3;
                            a(kVar2);
                            return true;
                        }
                        a(k2, v, 0, l.REPLACED);
                        unlock();
                        b();
                        return false;
                    }
                }
                this.modCount++;
                k<K, V> a4 = a((Object) k2, i2, (k) kVar);
                a(a4, v, a2);
                atomicReferenceArray.set(length, a4);
                this.count = i3;
                a(a4);
                unlock();
                b();
                return true;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i2, Object obj2) {
            l lVar;
            lock();
            try {
                a(this.map.q.a());
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(obj, d2)) {
                        w<K, V> a2 = kVar2.a();
                        V v = a2.get();
                        if (this.map.f53743g.a(obj2, v)) {
                            lVar = l.EXPLICIT;
                        } else if (v != null || !a2.d()) {
                            unlock();
                            b();
                            return false;
                        } else {
                            lVar = l.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar, kVar2, d2, v, a2, lVar));
                        this.count--;
                        if (lVar != l.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(k<K, V> kVar, int i2) {
            lock();
            try {
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                k<K, V> kVar2 = atomicReferenceArray.get(length);
                for (k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.b()) {
                    if (kVar3 == kVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar2, kVar3, kVar3.d(), kVar3.a().get(), kVar3.a(), l.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k2, int i2, w<K, V> wVar) {
            lock();
            try {
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        if (kVar2.a() == wVar) {
                            this.modCount++;
                            atomicReferenceArray.set(length, a(kVar, kVar2, d2, wVar.get(), wVar, l.COLLECTED));
                            this.count--;
                            return true;
                        } else {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                b();
                            }
                            return false;
                        }
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    b();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    b();
                }
            }
        }

        private boolean a(K k2, int i2, j<K, V> jVar) {
            lock();
            try {
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        if (kVar2.a() == jVar) {
                            if (jVar.d()) {
                                kVar2.a(jVar.f53794a);
                            } else {
                                atomicReferenceArray.set(length, b(kVar, kVar2));
                            }
                            return true;
                        } else {
                            unlock();
                            b();
                            return false;
                        }
                    }
                }
                unlock();
                b();
                return false;
            } finally {
                unlock();
                b();
            }
        }

        private boolean a(k<K, V> kVar, int i2, l lVar) {
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            int length = i2 & (atomicReferenceArray.length() - 1);
            k<K, V> kVar2 = atomicReferenceArray.get(length);
            for (k<K, V> kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.b()) {
                if (kVar3 == kVar) {
                    this.modCount++;
                    atomicReferenceArray.set(length, a(kVar2, kVar3, kVar3.d(), kVar3.a().get(), kVar3.a(), lVar));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            if (tryLock()) {
                try {
                    d();
                    c(j2);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        private void j() {
            a(this.map.q.a());
            b();
        }

        private void c() {
            if (tryLock()) {
                try {
                    d();
                } finally {
                    unlock();
                }
            }
        }

        private void d() {
            if (this.map.h()) {
                e();
            }
            if (this.map.i()) {
                f();
            }
        }

        private void e() {
            int i2 = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((k) ((k) poll));
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        private void f() {
            int i2 = 0;
            do {
                Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((w) ((w) poll));
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        private void g() {
            while (true) {
                k<K, V> poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        private k<K, V> h() {
            for (k<K, V> kVar : this.accessQueue) {
                if (kVar.a().a() > 0) {
                    return kVar;
                }
            }
            throw new AssertionError();
        }

        private void i() {
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i2 = this.count;
                AtomicReferenceArray<k<K, V>> a2 = a(length << 1);
                this.threshold = (a2.length() * 3) / 4;
                int length2 = a2.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    k<K, V> kVar = atomicReferenceArray.get(i3);
                    if (kVar != null) {
                        k<K, V> b2 = kVar.b();
                        int c2 = kVar.c() & length2;
                        if (b2 == null) {
                            a2.set(c2, kVar);
                        } else {
                            k<K, V> kVar2 = kVar;
                            do {
                                int c3 = b2.c() & length2;
                                if (c3 != c2) {
                                    kVar2 = b2;
                                    c2 = c3;
                                }
                                b2 = b2.b();
                            } while (b2 != null);
                            a2.set(c2, kVar2);
                            while (kVar != kVar2) {
                                int c4 = kVar.c() & length2;
                                k<K, V> a3 = a(kVar, a2.get(c4));
                                if (a3 != null) {
                                    a2.set(c4, a3);
                                } else {
                                    b(kVar);
                                    i2--;
                                }
                                kVar = kVar.b();
                            }
                        }
                    }
                }
                this.table = a2;
                this.count = i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!isHeldByCurrentThread()) {
                this.map.j();
            }
        }

        private static AtomicReferenceArray<k<K, V>> a(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        private k<K, V> b(int i2) {
            AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i2 & (atomicReferenceArray.length() - 1));
        }

        private void b(long j2) {
            if (tryLock()) {
                try {
                    c(j2);
                } finally {
                    unlock();
                }
            }
        }

        private void b(k<K, V> kVar) {
            K d2 = kVar.d();
            kVar.c();
            a(d2, kVar.a().get(), kVar.a().a(), l.COLLECTED);
            this.writeQueue.remove(kVar);
            this.accessQueue.remove(kVar);
        }

        private void c(long j2) {
            k<K, V> peek;
            k<K, V> peek2;
            g();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.a(peek, j2)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.a(peek2, j2)) {
                            return;
                        }
                    } while (a((k) peek2, peek2.c(), l.EXPIRED));
                    throw new AssertionError();
                }
            } while (a((k) peek, peek.c(), l.EXPIRED));
            throw new AssertionError();
        }

        private void a(k<K, V> kVar) {
            if (this.map.a()) {
                g();
                if (((long) kVar.a().a()) <= this.maxSegmentWeight || a((k) kVar, kVar.c(), l.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        k<K, V> h2 = h();
                        if (!a((k) h2, h2.c(), l.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        private k<K, V> b(k<K, V> kVar, k<K, V> kVar2) {
            int i2 = this.count;
            k<K, V> b2 = kVar2.b();
            while (kVar != kVar2) {
                k<K, V> a2 = a(kVar, b2);
                if (a2 != null) {
                    b2 = a2;
                } else {
                    b(kVar);
                    i2--;
                }
                kVar = kVar.b();
            }
            this.count = i2;
            return b2;
        }

        private k<K, V> a(k<K, V> kVar, k<K, V> kVar2) {
            if (kVar.d() == null) {
                return null;
            }
            w<K, V> a2 = kVar.a();
            V v = a2.get();
            if (v == null && a2.d()) {
                return null;
            }
            k<K, V> a3 = this.map.r.a(this, kVar, kVar2);
            a3.a(a2.a(this.valueReferenceQueue, v, a3));
            return a3;
        }

        private k<K, V> e(Object obj, int i2) {
            for (k<K, V> b2 = b(i2); b2 != null; b2 = b2.b()) {
                if (b2.c() == i2) {
                    K d2 = b2.d();
                    if (d2 == null) {
                        c();
                    } else if (this.map.f53742f.a(obj, d2)) {
                        return b2;
                    }
                }
            }
            return null;
        }

        private void c(k<K, V> kVar, long j2) {
            if (this.map.d()) {
                kVar.a(j2);
            }
            this.accessQueue.add(kVar);
        }

        /* JADX INFO: finally extract failed */
        private j<K, V> d(K k2, int i2) {
            lock();
            try {
                long a2 = this.map.q.a();
                a(a2);
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(k2, d2)) {
                        w<K, V> a3 = kVar2.a();
                        if (!a3.c()) {
                            if (a2 - kVar2.h() >= this.map.n) {
                                this.modCount++;
                                j<K, V> jVar = new j<>(a3);
                                kVar2.a(jVar);
                                unlock();
                                b();
                                return jVar;
                            }
                        }
                        unlock();
                        b();
                        return null;
                    }
                }
                this.modCount++;
                j<K, V> jVar2 = new j<>();
                k<K, V> a4 = a((Object) k2, i2, (k) kVar);
                a4.a(jVar2);
                atomicReferenceArray.set(length, a4);
                unlock();
                b();
                return jVar2;
            } catch (Throwable th) {
                unlock();
                b();
                throw th;
            }
        }

        private void b(k<K, V> kVar, long j2) {
            if (this.map.d()) {
                kVar.a(j2);
            }
            this.recencyQueue.add(kVar);
        }

        /* access modifiers changed from: package-private */
        public final V c(Object obj, int i2) {
            l lVar;
            lock();
            try {
                a(this.map.q.a());
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                for (k<K, V> kVar2 = kVar; kVar2 != null; kVar2 = kVar2.b()) {
                    K d2 = kVar2.d();
                    if (kVar2.c() == i2 && d2 != null && this.map.f53742f.a(obj, d2)) {
                        w<K, V> a2 = kVar2.a();
                        V v = a2.get();
                        if (v != null) {
                            lVar = l.EXPLICIT;
                        } else if (a2.d()) {
                            lVar = l.COLLECTED;
                        } else {
                            unlock();
                            b();
                            return null;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(kVar, kVar2, d2, v, a2, lVar));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                b();
                return null;
            } finally {
                unlock();
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i2) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    k<K, V> a2 = a(obj, i2, this.map.q.a());
                    if (a2 == null) {
                        return false;
                    }
                    if (a2.a().get() != null) {
                        z = true;
                    }
                    a();
                    return z;
                }
                a();
                return false;
            } finally {
                a();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.b.g$d */
        /* JADX WARN: Multi-variable type inference failed */
        private k<K, V> a(K k2, int i2, k<K, V> kVar) {
            return this.map.r.a(this, com.google.c.a.k.a(k2), i2, kVar);
        }

        private k<K, V> a(Object obj, int i2, long j2) {
            k<K, V> e2 = e(obj, i2);
            if (e2 == null) {
                return null;
            }
            if (!this.map.a(e2, j2)) {
                return e2;
            }
            b(j2);
            return null;
        }

        private V c(final K k2, final int i2, d<? super K, V> dVar) {
            final j<K, V> d2 = d(k2, i2);
            if (d2 == null) {
                return null;
            }
            final com.google.c.h.a.q<V> a2 = d2.a(k2, dVar);
            a2.a(new Runnable() {
                /* class com.google.c.b.g.n.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33315);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.b.g$n */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        n.this.a(k2, i2, d2, a2);
                    } catch (Throwable th) {
                        g.f53737a.log(Level.WARNING, "Exception thrown during refresh", th);
                        d2.a(th);
                    }
                }
            }, u.a.INSTANCE);
            if (a2.isDone()) {
                try {
                    return (V) com.google.c.h.a.y.a(a2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private V b(K k2, int i2, d<? super K, V> dVar) {
            j<K, V> jVar;
            w<K, V> wVar;
            boolean z;
            V a2;
            MethodCollector.i(3367);
            lock();
            try {
                long a3 = this.map.q.a();
                a(a3);
                int i3 = this.count - 1;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                k<K, V> kVar = atomicReferenceArray.get(length);
                k<K, V> kVar2 = kVar;
                while (true) {
                    jVar = null;
                    if (kVar2 == null) {
                        wVar = null;
                        break;
                    }
                    K d2 = kVar2.d();
                    if (kVar2.c() != i2 || d2 == null || !this.map.f53742f.a(k2, d2)) {
                        kVar2 = kVar2.b();
                    } else {
                        wVar = kVar2.a();
                        if (wVar.c()) {
                            z = false;
                        } else {
                            V v = wVar.get();
                            if (v == null) {
                                a(d2, v, wVar.a(), l.COLLECTED);
                            } else if (this.map.a(kVar2, a3)) {
                                a(d2, v, wVar.a(), l.EXPIRED);
                            } else {
                                c(kVar2, a3);
                                this.statsCounter.a();
                                return v;
                            }
                            this.writeQueue.remove(kVar2);
                            this.accessQueue.remove(kVar2);
                            this.count = i3;
                        }
                    }
                }
                z = true;
                if (z) {
                    jVar = new j<>();
                    if (kVar2 == null) {
                        kVar2 = a((Object) k2, i2, (k) kVar);
                        kVar2.a(jVar);
                        atomicReferenceArray.set(length, kVar2);
                    } else {
                        kVar2.a(jVar);
                    }
                }
                unlock();
                b();
                if (z) {
                    try {
                        synchronized (kVar2) {
                            try {
                                a2 = a((Object) k2, i2, (j) jVar, (com.google.c.h.a.q) jVar.a(k2, dVar));
                            } catch (Throwable th) {
                                MethodCollector.o(3367);
                                throw th;
                            }
                        }
                        return a2;
                    } finally {
                        this.statsCounter.b();
                        MethodCollector.o(3367);
                    }
                } else {
                    V a4 = a(kVar2, k2, wVar);
                    MethodCollector.o(3367);
                    return a4;
                }
            } finally {
                unlock();
                b();
                MethodCollector.o(3367);
            }
        }

        private V a(k<K, V> kVar, K k2, w<K, V> wVar) {
            if (wVar.c()) {
                com.google.c.a.k.b(!Thread.holdsLock(kVar), "Recursive load of: %s", k2);
                try {
                    V e2 = wVar.e();
                    if (e2 != null) {
                        b(kVar, this.map.q.a());
                        return e2;
                    }
                    throw new d.a("CacheLoader returned null for key " + ((Object) k2) + ".");
                } finally {
                    this.statsCounter.b();
                }
            } else {
                throw new AssertionError();
            }
        }

        private void a(k<K, V> kVar, V v, long j2) {
            w<K, V> a2 = kVar.a();
            com.google.c.a.k.b(true, (Object) "Weights must be non-negative");
            kVar.a(this.map.f53745i.a(this, kVar, v));
            g();
            this.totalWeight++;
            if (this.map.d()) {
                kVar.a(j2);
            }
            if (this.map.g()) {
                kVar.b(j2);
            }
            this.accessQueue.add(kVar);
            this.writeQueue.add(kVar);
            a2.a(v);
        }

        n(g<K, V> gVar, int i2, long j2, a.b bVar) {
            ReferenceQueue<K> referenceQueue;
            this.map = gVar;
            this.maxSegmentWeight = j2;
            this.statsCounter = (a.b) com.google.c.a.k.a(bVar);
            AtomicReferenceArray<k<K, V>> a2 = a(i2);
            this.threshold = (a2.length() * 3) / 4;
            if (!gVar.b()) {
                int i3 = this.threshold;
                if (((long) i3) == j2) {
                    this.threshold = i3 + 1;
                }
            }
            this.table = a2;
            ReferenceQueue<V> referenceQueue2 = null;
            if (gVar.h()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = gVar.i() ? new ReferenceQueue<>() : referenceQueue2;
            this.recencyQueue = gVar.f() ? new ConcurrentLinkedQueue() : (Queue<k<K, V>>) g.v;
            this.writeQueue = gVar.c() ? new ad() : (Queue<k<K, V>>) g.v;
            this.accessQueue = gVar.f() ? new c() : (Queue<k<K, V>>) g.v;
        }

        private k<K, V> a(k<K, V> kVar, k<K, V> kVar2, K k2, V v, w<K, V> wVar, l lVar) {
            a(k2, v, wVar.a(), lVar);
            this.writeQueue.remove(kVar2);
            this.accessQueue.remove(kVar2);
            if (!wVar.c()) {
                return b(kVar, kVar2);
            }
            wVar.a(null);
            return kVar;
        }

        private V a(k<K, V> kVar, K k2, int i2, V v, long j2, d<? super K, V> dVar) {
            V c2;
            if (!this.map.e() || j2 - kVar.h() <= this.map.n || kVar.a().c() || (c2 = c(k2, i2, dVar)) == null) {
                return v;
            }
            return c2;
        }
    }

    abstract class a<T> extends AbstractSet<T> {

        /* renamed from: a  reason: collision with root package name */
        final ConcurrentMap<?, ?> f53750a;

        static {
            Covode.recordClassIndex(33282);
        }

        public void clear() {
            this.f53750a.clear();
        }

        public boolean isEmpty() {
            return this.f53750a.isEmpty();
        }

        public int size() {
            return this.f53750a.size();
        }

        public Object[] toArray() {
            return g.a((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) g.a((Collection) this).toArray(eArr);
        }

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.f53750a = concurrentMap;
        }
    }

    final class e extends g<K, V>.AbstractC1232g {
        static {
            Covode.recordClassIndex(33303);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return a();
        }

        e() {
            super();
        }
    }

    final class f extends g<K, V>.a {
        static {
            Covode.recordClassIndex(33304);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && g.this.remove(key, entry.getValue())) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = g.this.get(key)) != null && g.this.f53743g.a(entry.getValue(), obj2)) {
                return true;
            }
            return false;
        }

        f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.c.b.g$g  reason: collision with other inner class name */
    abstract class AbstractC1232g<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f53784b;

        /* renamed from: c  reason: collision with root package name */
        int f53785c = -1;

        /* renamed from: d  reason: collision with root package name */
        n<K, V> f53786d;

        /* renamed from: e  reason: collision with root package name */
        AtomicReferenceArray<k<K, V>> f53787e;

        /* renamed from: f  reason: collision with root package name */
        k<K, V> f53788f;

        /* renamed from: g  reason: collision with root package name */
        g<K, V>.ae f53789g;

        /* renamed from: h  reason: collision with root package name */
        g<K, V>.ae f53790h;

        static {
            Covode.recordClassIndex(33305);
        }

        public boolean hasNext() {
            if (this.f53789g != null) {
                return true;
            }
            return false;
        }

        private boolean c() {
            k<K, V> kVar = this.f53788f;
            if (kVar == null) {
                return false;
            }
            while (true) {
                this.f53788f = kVar.b();
                k<K, V> kVar2 = this.f53788f;
                if (kVar2 == null) {
                    return false;
                }
                if (a(kVar2)) {
                    return true;
                }
                kVar = this.f53788f;
            }
        }

        /* access modifiers changed from: package-private */
        public final g<K, V>.ae a() {
            g<K, V>.ae aeVar = this.f53789g;
            if (aeVar != null) {
                this.f53790h = aeVar;
                b();
                return this.f53790h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f53790h != null) {
                z = true;
            } else {
                z = false;
            }
            com.google.c.a.k.b(z);
            g.this.remove(this.f53790h.getKey());
            this.f53790h = null;
        }

        private void b() {
            this.f53789g = null;
            if (!c() && !d()) {
                while (this.f53784b >= 0) {
                    n<K, V>[] nVarArr = g.this.f53740d;
                    int i2 = this.f53784b;
                    this.f53784b = i2 - 1;
                    n<K, V> nVar = nVarArr[i2];
                    this.f53786d = nVar;
                    if (nVar.count != 0) {
                        AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.f53786d.table;
                        this.f53787e = atomicReferenceArray;
                        this.f53785c = atomicReferenceArray.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                }
            }
        }

        private boolean d() {
            while (true) {
                int i2 = this.f53785c;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = this.f53787e;
                this.f53785c = i2 - 1;
                k<K, V> kVar = atomicReferenceArray.get(i2);
                this.f53788f = kVar;
                if (kVar != null && (a(kVar) || c())) {
                    return true;
                }
            }
        }

        AbstractC1232g() {
            this.f53784b = g.this.f53740d.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(k<K, V> kVar) {
            try {
                long a2 = g.this.q.a();
                K d2 = kVar.d();
                g gVar = g.this;
                if (kVar.d() != null) {
                    V v = kVar.a().get();
                    if (v != null) {
                        if (!gVar.a(kVar, a2)) {
                            this.f53789g = new ae(d2, v);
                            this.f53786d.a();
                            return true;
                        }
                    }
                }
                this.f53786d.a();
                return false;
            } catch (Throwable th) {
                this.f53786d.a();
                throw th;
            }
        }
    }

    final class i extends g<K, V>.a {
        static {
            Covode.recordClassIndex(33307);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new h();
        }

        public final boolean contains(Object obj) {
            return this.f53750a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f53750a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* access modifiers changed from: package-private */
    public static class j<K, V> implements w<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public volatile w<K, V> f53794a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.c.h.a.v<V> f53795b;

        /* renamed from: c  reason: collision with root package name */
        final com.google.c.a.o f53796c;

        static {
            Covode.recordClassIndex(33308);
        }

        @Override // com.google.c.b.g.w
        public final w<K, V> a(ReferenceQueue<V> referenceQueue, V v, k<K, V> kVar) {
            return this;
        }

        @Override // com.google.c.b.g.w
        public final k<K, V> b() {
            return null;
        }

        @Override // com.google.c.b.g.w
        public final boolean c() {
            return true;
        }

        public j() {
            this(g.u);
        }

        @Override // com.google.c.b.g.w
        public final int a() {
            return this.f53794a.a();
        }

        @Override // com.google.c.b.g.w
        public final boolean d() {
            return this.f53794a.d();
        }

        @Override // com.google.c.b.g.w
        public final V e() {
            return (V) com.google.c.h.a.y.a(this.f53795b);
        }

        @Override // com.google.c.b.g.w
        public final V get() {
            return this.f53794a.get();
        }

        public final long f() {
            return this.f53796c.a(TimeUnit.NANOSECONDS);
        }

        public final boolean b(V v) {
            return this.f53795b.b((Object) v);
        }

        @Override // com.google.c.b.g.w
        public final void a(V v) {
            if (v != null) {
                b(v);
            } else {
                this.f53794a = (w<K, V>) g.u;
            }
        }

        public j(w<K, V> wVar) {
            this.f53795b = new com.google.c.h.a.v<>();
            this.f53796c = new com.google.c.a.o();
            this.f53794a = wVar;
        }

        public final boolean a(Throwable th) {
            return this.f53795b.a(th);
        }

        public final com.google.c.h.a.q<V> a(K k2, d<? super K, V> dVar) {
            com.google.c.h.a.q<V> a2;
            try {
                this.f53796c.b();
                V v = this.f53794a.get();
                if (v == null) {
                    V a3 = dVar.a();
                    if (b(a3)) {
                        return this.f53795b;
                    }
                    return com.google.c.h.a.l.a((Object) a3);
                }
                com.google.c.a.k.a(k2);
                com.google.c.a.k.a(v);
                com.google.c.h.a.q a4 = com.google.c.h.a.l.a((Object) dVar.a());
                if (a4 == null) {
                    return com.google.c.h.a.l.a((Object) null);
                }
                AnonymousClass1 r2 = new com.google.c.a.f<V, V>() {
                    /* class com.google.c.b.g.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(33309);
                    }

                    @Override // com.google.c.a.f
                    public final V a(V v) {
                        j.this.b(v);
                        return v;
                    }
                };
                u.a aVar = u.a.INSTANCE;
                com.google.c.a.k.a(r2);
                d.b bVar = new d.b(a4, r2);
                a4.a(bVar, com.google.c.h.a.u.a(aVar, bVar));
                return bVar;
            } catch (Throwable th) {
                if (a(th)) {
                    a2 = this.f53795b;
                } else {
                    a2 = com.google.c.h.a.l.a(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return a2;
            }
        }
    }

    final class x extends AbstractCollection<V> {

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<?, ?> f53832b;

        static {
            Covode.recordClassIndex(33328);
        }

        public final void clear() {
            this.f53832b.clear();
        }

        public final boolean isEmpty() {
            return this.f53832b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new v();
        }

        public final int size() {
            return this.f53832b.size();
        }

        public final Object[] toArray() {
            return g.a((Collection) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f53832b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) g.a((Collection) this).toArray(eArr);
        }

        x(ConcurrentMap<?, ?> concurrentMap) {
            this.f53832b = concurrentMap;
        }
    }

    static final class ad<K, V> extends AbstractQueue<k<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f53759a = new b<K, V>() {
            /* class com.google.c.b.g.ad.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            k<K, V> f53760a = this;

            /* renamed from: b  reason: collision with root package name */
            k<K, V> f53761b = this;

            static {
                Covode.recordClassIndex(33287);
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void b(long j2) {
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final long h() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final k<K, V> i() {
                return this.f53760a;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final k<K, V> j() {
                return this.f53761b;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void c(k<K, V> kVar) {
                this.f53760a = kVar;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void d(k<K, V> kVar) {
                this.f53761b = kVar;
            }
        };

        static {
            Covode.recordClassIndex(33286);
        }

        ad() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public k<K, V> peek() {
            k<K, V> i2 = this.f53759a.i();
            if (i2 == this.f53759a) {
                return null;
            }
            return i2;
        }

        public final boolean isEmpty() {
            if (this.f53759a.i() == this.f53759a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<k<K, V>> iterator() {
            return new com.google.c.c.i<k<K, V>>(peek()) {
                /* class com.google.c.b.g.ad.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(33288);
                }

                @Override // com.google.c.c.i
                public final /* synthetic */ Object a(Object obj) {
                    k<K, V> i2 = ((k) obj).i();
                    if (i2 == ad.this.f53759a) {
                        return null;
                    }
                    return i2;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            k<K, V> i2 = this.f53759a.i();
            if (i2 == this.f53759a) {
                return null;
            }
            remove(i2);
            return i2;
        }

        public final void clear() {
            k<K, V> i2 = this.f53759a.i();
            while (true) {
                k<K, V> kVar = this.f53759a;
                if (i2 != kVar) {
                    k<K, V> i3 = i2.i();
                    g.c(i2);
                    i2 = i3;
                } else {
                    kVar.c(kVar);
                    k<K, V> kVar2 = this.f53759a;
                    kVar2.d(kVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i2 = 0;
            for (k<K, V> i3 = this.f53759a.i(); i3 != this.f53759a; i3 = i3.i()) {
                i2++;
            }
            return i2;
        }

        public final boolean contains(Object obj) {
            if (((k) obj).i() != m.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            k kVar = (k) obj;
            g.b(kVar.j(), kVar.i());
            g.b(this.f53759a.j(), kVar);
            g.b(kVar, this.f53759a);
            return true;
        }

        public final boolean remove(Object obj) {
            k kVar = (k) obj;
            k<K, V> j2 = kVar.j();
            k<K, V> i2 = kVar.i();
            g.b(j2, i2);
            g.c(kVar);
            if (i2 != m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    static final class c<K, V> extends AbstractQueue<k<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final k<K, V> f53767a = new b<K, V>() {
            /* class com.google.c.b.g.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            k<K, V> f53768a = this;

            /* renamed from: b  reason: collision with root package name */
            k<K, V> f53769b = this;

            static {
                Covode.recordClassIndex(33292);
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void a(long j2) {
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final long e() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final k<K, V> f() {
                return this.f53768a;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final k<K, V> g() {
                return this.f53769b;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void b(k<K, V> kVar) {
                this.f53769b = kVar;
            }

            @Override // com.google.c.b.g.b, com.google.c.b.k
            public final void a(k<K, V> kVar) {
                this.f53768a = kVar;
            }
        };

        static {
            Covode.recordClassIndex(33291);
        }

        c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public k<K, V> peek() {
            k<K, V> f2 = this.f53767a.f();
            if (f2 == this.f53767a) {
                return null;
            }
            return f2;
        }

        public final boolean isEmpty() {
            if (this.f53767a.f() == this.f53767a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<k<K, V>> iterator() {
            return new com.google.c.c.i<k<K, V>>(peek()) {
                /* class com.google.c.b.g.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(33293);
                }

                @Override // com.google.c.c.i
                public final /* synthetic */ Object a(Object obj) {
                    k<K, V> f2 = ((k) obj).f();
                    if (f2 == c.this.f53767a) {
                        return null;
                    }
                    return f2;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            k<K, V> f2 = this.f53767a.f();
            if (f2 == this.f53767a) {
                return null;
            }
            remove(f2);
            return f2;
        }

        public final void clear() {
            k<K, V> f2 = this.f53767a.f();
            while (true) {
                k<K, V> kVar = this.f53767a;
                if (f2 != kVar) {
                    k<K, V> f3 = f2.f();
                    g.b(f2);
                    f2 = f3;
                } else {
                    kVar.a(kVar);
                    k<K, V> kVar2 = this.f53767a;
                    kVar2.b(kVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i2 = 0;
            for (k<K, V> f2 = this.f53767a.f(); f2 != this.f53767a; f2 = f2.f()) {
                i2++;
            }
            return i2;
        }

        public final boolean contains(Object obj) {
            if (((k) obj).f() != m.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            k kVar = (k) obj;
            g.a(kVar.g(), kVar.f());
            g.a(this.f53767a.g(), kVar);
            g.a(kVar, this.f53767a);
            return true;
        }

        public final boolean remove(Object obj) {
            k kVar = (k) obj;
            k<K, V> g2 = kVar.g();
            k<K, V> f2 = kVar.f();
            g.a(g2, f2);
            g.b(kVar);
            if (f2 != m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    final class h extends g<K, V>.AbstractC1232g {
        static {
            Covode.recordClassIndex(33306);
        }

        @Override // java.util.Iterator
        public final K next() {
            return (K) a().getKey();
        }

        h() {
            super();
        }
    }

    final class v extends g<K, V>.AbstractC1232g {
        static {
            Covode.recordClassIndex(33326);
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) a().getValue();
        }

        v() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f53748l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.n > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.y;
        if (set != null) {
            return set;
        }
        f fVar = new f(this);
        this.y = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (d() || a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (c() || e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        if (this.f53744h != p.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        if (this.f53745i != p.STRONG) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.w;
        if (set != null) {
            return set;
        }
        i iVar = new i(this);
        this.w = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.x;
        if (collection != null) {
            return collection;
        }
        x xVar = new x(this);
        this.x = xVar;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public enum m implements k<Object, Object> {
        INSTANCE;

        @Override // com.google.c.b.k
        public final w<Object, Object> a() {
            return null;
        }

        @Override // com.google.c.b.k
        public final void a(long j2) {
        }

        @Override // com.google.c.b.k
        public final void a(w<Object, Object> wVar) {
        }

        @Override // com.google.c.b.k
        public final void a(k<Object, Object> kVar) {
        }

        @Override // com.google.c.b.k
        public final k<Object, Object> b() {
            return null;
        }

        @Override // com.google.c.b.k
        public final void b(long j2) {
        }

        @Override // com.google.c.b.k
        public final void b(k<Object, Object> kVar) {
        }

        @Override // com.google.c.b.k
        public final int c() {
            return 0;
        }

        @Override // com.google.c.b.k
        public final void c(k<Object, Object> kVar) {
        }

        @Override // com.google.c.b.k
        public final Object d() {
            return null;
        }

        @Override // com.google.c.b.k
        public final void d(k<Object, Object> kVar) {
        }

        @Override // com.google.c.b.k
        public final long e() {
            return 0;
        }

        @Override // com.google.c.b.k
        public final k<Object, Object> f() {
            return this;
        }

        @Override // com.google.c.b.k
        public final k<Object, Object> g() {
            return this;
        }

        @Override // com.google.c.b.k
        public final long h() {
            return 0;
        }

        @Override // com.google.c.b.k
        public final k<Object, Object> i() {
            return this;
        }

        @Override // com.google.c.b.k
        public final k<Object, Object> j() {
            return this;
        }

        static {
            Covode.recordClassIndex(33313);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f53747k != c.b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f53749m > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        while (true) {
            n<K, V> poll = this.o.poll();
            if (poll != null) {
                try {
                    this.p.a(poll);
                } catch (Throwable th) {
                    f53737a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public int size() {
        n<K, V>[] nVarArr;
        long j2 = 0;
        for (n<K, V> nVar : this.f53740d) {
            j2 += (long) Math.max(0, nVar.count);
        }
        return com.google.c.f.a.a(j2);
    }

    public enum p {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final com.google.c.a.d<Object> a() {
                return d.a.f53684a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final <K, V> w<K, V> a(n<K, V> nVar, k<K, V> kVar, V v) {
                return new t(v);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final com.google.c.a.d<Object> a() {
                return d.b.f53685a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final <K, V> w<K, V> a(n<K, V> nVar, k<K, V> kVar, V v) {
                return new o(nVar.valueReferenceQueue, v, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final com.google.c.a.d<Object> a() {
                return d.b.f53685a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.p
            public final <K, V> w<K, V> a(n<K, V> nVar, k<K, V> kVar, V v) {
                return new ab(nVar.valueReferenceQueue, v, kVar);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract com.google.c.a.d<Object> a();

        /* access modifiers changed from: package-private */
        public abstract <K, V> w<K, V> a(n<K, V> nVar, k<K, V> kVar, V v);

        static {
            Covode.recordClassIndex(33317);
        }

        /* synthetic */ p(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(33279);
    }

    public boolean isEmpty() {
        n<K, V>[] nVarArr = this.f53740d;
        long j2 = 0;
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) nVarArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < nVarArr.length; i3++) {
            if (nVarArr[i3].count != 0) {
                return false;
            }
            j2 -= (long) nVarArr[i3].modCount;
        }
        if (j2 != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public enum d {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new s(k2, i2, kVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                a(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new q(k2, i2, kVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                b(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new u(k2, i2, kVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                a(kVar, a2);
                b(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new r(k2, i2, kVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new aa(nVar.keyReferenceQueue, k2, i2, kVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                a(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new y(nVar.keyReferenceQueue, k2, i2, kVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                b(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new ac(nVar.keyReferenceQueue, k2, i2, kVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
                k<K, V> a2 = super.a(nVar, kVar, kVar2);
                a(kVar, a2);
                b(kVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.b.g.d
            public final <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar) {
                return new z(nVar.keyReferenceQueue, k2, i2, kVar);
            }
        };
        

        /* renamed from: i  reason: collision with root package name */
        static final d[] f53780i;

        /* access modifiers changed from: package-private */
        public abstract <K, V> k<K, V> a(n<K, V> nVar, K k2, int i2, k<K, V> kVar);

        static {
            AnonymousClass1 r14;
            AnonymousClass2 r13;
            AnonymousClass3 r12;
            AnonymousClass4 r11;
            AnonymousClass5 r10;
            AnonymousClass6 r9;
            AnonymousClass7 r8;
            AnonymousClass8 r7;
            Covode.recordClassIndex(33294);
            f53780i = new d[]{r14, r13, r12, r11, r10, r9, r8, r7};
        }

        static <K, V> void a(k<K, V> kVar, k<K, V> kVar2) {
            kVar2.a(kVar.e());
            g.a(kVar.g(), kVar2);
            g.a(kVar2, kVar.f());
            g.b(kVar);
        }

        static <K, V> void b(k<K, V> kVar, k<K, V> kVar2) {
            kVar2.b(kVar.h());
            g.b(kVar.j(), kVar2);
            g.b(kVar2, kVar.i());
            g.c(kVar);
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public <K, V> k<K, V> a(n<K, V> nVar, k<K, V> kVar, k<K, V> kVar2) {
            return a(nVar, kVar.d(), kVar.c(), kVar2);
        }
    }

    public void clear() {
        l lVar;
        n<K, V>[] nVarArr = this.f53740d;
        int length = nVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            n<K, V> nVar = nVarArr[i2];
            if (nVar.count != 0) {
                nVar.lock();
                try {
                    nVar.a(nVar.map.q.a());
                    AtomicReferenceArray<k<K, V>> atomicReferenceArray = nVar.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (k<K, V> kVar = atomicReferenceArray.get(i3); kVar != null; kVar = kVar.b()) {
                            if (kVar.a().d()) {
                                K d2 = kVar.d();
                                V v2 = kVar.a().get();
                                if (d2 != null) {
                                    if (v2 != null) {
                                        lVar = l.EXPLICIT;
                                        kVar.c();
                                        nVar.a(d2, v2, kVar.a().a(), lVar);
                                    }
                                }
                                lVar = l.COLLECTED;
                                kVar.c();
                                nVar.a(d2, v2, kVar.a().a(), lVar);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (nVar.map.h()) {
                        do {
                        } while (nVar.keyReferenceQueue.poll() != null);
                    }
                    if (nVar.map.i()) {
                        do {
                        } while (nVar.valueReferenceQueue.poll() != null);
                    }
                    nVar.writeQueue.clear();
                    nVar.accessQueue.clear();
                    nVar.readCount.set(0);
                    nVar.modCount++;
                    nVar.count = 0;
                } finally {
                    nVar.unlock();
                    nVar.b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f53746j >= 0) {
            return true;
        }
        return false;
    }

    static <K, V> void b(k<K, V> kVar) {
        m mVar = m.INSTANCE;
        kVar.a(mVar);
        kVar.b(mVar);
    }

    static <K, V> void c(k<K, V> kVar) {
        m mVar = m.INSTANCE;
        kVar.c(mVar);
        kVar.d(mVar);
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        an.a(arrayList, collection.iterator());
        return arrayList;
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).a(obj, a2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).c(obj, a2);
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        int a2 = this.f53742f.a(obj);
        int i2 = a2 + ((a2 << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.b.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final n<K, V> a(int i2) {
        return this.f53740d[(i2 >>> this.f53739c) & this.f53738b];
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a2 = this.q.a();
        n<K, V>[] nVarArr = this.f53740d;
        long j2 = -1;
        int i2 = 0;
        do {
            long j3 = 0;
            for (n<K, V> nVar : nVarArr) {
                int i3 = nVar.count;
                AtomicReferenceArray<k<K, V>> atomicReferenceArray = nVar.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (k<K, V> kVar = atomicReferenceArray.get(i4); kVar != null; kVar = kVar.b()) {
                        V a3 = nVar.a(kVar, a2);
                        if (a3 != null && this.f53743g.a(obj, a3)) {
                            return true;
                        }
                    }
                }
                j3 += (long) nVar.modCount;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
        } while (i2 < 3);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(w<K, V> wVar) {
        k<K, V> b2 = wVar.b();
        int c2 = b2.c();
        a(c2).a((Object) b2.d(), c2, (w) wVar);
    }

    g(c<? super K, ? super V> cVar) {
        int i2;
        long j2;
        long j3;
        long j4;
        boolean z2;
        com.google.c.a.t tVar;
        char c2;
        boolean z3;
        int i3;
        int i4;
        char c3 = 4;
        if (cVar.f53720g == -1) {
            i2 = 4;
        } else {
            i2 = cVar.f53720g;
        }
        this.f53741e = Math.min(i2, 65536);
        p a2 = cVar.a();
        this.f53744h = a2;
        this.f53745i = cVar.b();
        this.f53742f = (com.google.c.a.d) com.google.c.a.h.a(cVar.p, cVar.a().a());
        this.f53743g = (com.google.c.a.d) com.google.c.a.h.a(cVar.q, cVar.b().a());
        long j5 = 0;
        if (cVar.f53726m == 0 || cVar.n == 0) {
            j2 = 0;
        } else if (cVar.f53723j == null) {
            j2 = cVar.f53721h;
        } else {
            j2 = cVar.f53722i;
        }
        this.f53746j = j2;
        this.f53747k = (p) com.google.c.a.h.a(cVar.f53723j, c.b.INSTANCE);
        if (cVar.n == -1) {
            j3 = 0;
        } else {
            j3 = cVar.n;
        }
        this.f53748l = j3;
        if (cVar.f53726m == -1) {
            j4 = 0;
        } else {
            j4 = cVar.f53726m;
        }
        this.f53749m = j4;
        this.n = cVar.o != -1 ? cVar.o : j5;
        m<K, V> mVar = (m) com.google.c.a.h.a(cVar.r, c.a.INSTANCE);
        this.p = mVar;
        this.o = mVar == c.a.INSTANCE ? (Queue<n<K, V>>) v : new ConcurrentLinkedQueue();
        int i5 = 0;
        int i6 = 1;
        if (g() || d()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cVar.s != null) {
            tVar = cVar.s;
        } else if (z2) {
            tVar = com.google.c.a.t.f53707a;
        } else {
            tVar = c.f53717d;
        }
        this.q = tVar;
        if (f() || d()) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        if (c() || g()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = (a2 != p.WEAK ? 0 : c3) | c2;
        if (z3) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        this.r = d.f53780i[i7 | i3];
        this.s = (a.b) cVar.t.b();
        this.t = null;
        if (cVar.f53719f == -1) {
            i4 = 16;
        } else {
            i4 = cVar.f53719f;
        }
        int min = Math.min(i4, 1073741824);
        if (a() && !b()) {
            min = Math.min(min, (int) j2);
        }
        int i8 = 1;
        int i9 = 0;
        while (i8 < this.f53741e && (!a() || ((long) (i8 * 20)) <= this.f53746j)) {
            i9++;
            i8 <<= 1;
        }
        this.f53739c = 32 - i9;
        this.f53738b = i8 - 1;
        this.f53740d = new n[i8];
        int i10 = min / i8;
        while (i6 < (i10 * i8 < min ? i10 + 1 : i10)) {
            i6 <<= 1;
        }
        if (a()) {
            long j6 = this.f53746j;
            long j7 = (long) i8;
            long j8 = (j6 / j7) + 1;
            long j9 = j6 % j7;
            while (true) {
                n<K, V>[] nVarArr = this.f53740d;
                if (i5 < nVarArr.length) {
                    if (((long) i5) == j9) {
                        j8--;
                    }
                    nVarArr[i5] = a(i6, j8, (a.b) cVar.t.b());
                    i5++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                n<K, V>[] nVarArr2 = this.f53740d;
                if (i5 < nVarArr2.length) {
                    nVarArr2[i5] = a(i6, -1, (a.b) cVar.t.b());
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(k<K, V> kVar) {
        int c2 = kVar.c();
        a(c2).a((k) kVar, c2);
    }

    static <K, V> void a(k<K, V> kVar, k<K, V> kVar2) {
        kVar.a(kVar2);
        kVar2.b(kVar);
    }

    static <K, V> void b(k<K, V> kVar, k<K, V> kVar2) {
        kVar.c(kVar2);
        kVar2.d(kVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        com.google.c.a.k.a(k2);
        com.google.c.a.k.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        com.google.c.a.k.a(k2);
        com.google.c.a.k.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        com.google.c.a.k.a(k2);
        com.google.c.a.k.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2, obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(k<K, V> kVar, long j2) {
        com.google.c.a.k.a(kVar);
        if (d() && j2 - kVar.e() >= this.f53748l) {
            return true;
        }
        if (!c() || j2 - kVar.h() < this.f53749m) {
            return false;
        }
        return true;
    }

    private n<K, V> a(int i2, long j2, a.b bVar) {
        return new n<>(this, i2, j2, bVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        com.google.c.a.k.a(k2);
        com.google.c.a.k.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2, (Object) v3);
    }
}
