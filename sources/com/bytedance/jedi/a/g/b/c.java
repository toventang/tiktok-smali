package com.bytedance.jedi.a.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.g.a.a;
import com.bytedance.jedi.a.g.b.b;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public class c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f39157a = Logger.getLogger(c.class.getName());
    static final u<Object, Object> s = new u<Object, Object>() {
        /* class com.bytedance.jedi.a.g.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(23997);
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final int a() {
            return 0;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final u<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, d<Object, Object> dVar) {
            return this;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final d<Object, Object> b() {
            return null;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final boolean c() {
            return false;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final Object get() {
            return null;
        }
    };
    static final Queue<?> t = new AbstractQueue<Object>() {
        /* class com.bytedance.jedi.a.g.b.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(23998);
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
            return Collections.emptyIterator();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final int f39158b;

    /* renamed from: c  reason: collision with root package name */
    final int f39159c;

    /* renamed from: d  reason: collision with root package name */
    final l<K, V>[] f39160d;

    /* renamed from: e  reason: collision with root package name */
    final int f39161e;

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.jedi.a.g.a.a<Object> f39162f;

    /* renamed from: g  reason: collision with root package name */
    final com.bytedance.jedi.a.g.a.a<Object> f39163g;

    /* renamed from: h  reason: collision with root package name */
    final n f39164h;

    /* renamed from: i  reason: collision with root package name */
    final n f39165i;

    /* renamed from: j  reason: collision with root package name */
    final long f39166j;

    /* renamed from: k  reason: collision with root package name */
    final h<K, V> f39167k;

    /* renamed from: l  reason: collision with root package name */
    final long f39168l;

    /* renamed from: m  reason: collision with root package name */
    final long f39169m;
    final long n;
    final Queue<g<K, V>> o;
    final f<K, V> p;
    final com.bytedance.jedi.a.g.a.e q;
    final d r;
    Set<K> u;
    Collection<V> v;
    Set<Map.Entry<K, V>> w;

    /* access modifiers changed from: package-private */
    public interface u<K, V> {
        static {
            Covode.recordClassIndex(24037);
        }

        int a();

        u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar);

        d<K, V> b();

        boolean c();

        V get();
    }

    static final class aa<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39172a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39173b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39174c = k.INSTANCE;

        static {
            Covode.recordClassIndex(24000);
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final long h() {
            return this.f39172a;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> i() {
            return this.f39173b;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> j() {
            return this.f39174c;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void b(long j2) {
            this.f39172a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void c(d<K, V> dVar) {
            this.f39173b = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void d(d<K, V> dVar) {
            this.f39174c = dVar;
        }

        aa(ReferenceQueue<K> referenceQueue, K k2, int i2, d<K, V> dVar) {
            super(referenceQueue, k2, i2, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final class ac implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f39180a;

        /* renamed from: b  reason: collision with root package name */
        V f39181b;

        static {
            Covode.recordClassIndex(24004);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f39180a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f39181b;
        }

        public final int hashCode() {
            return this.f39180a.hashCode() ^ this.f39181b.hashCode();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) c.this.put(this.f39180a, v);
            this.f39181b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!this.f39180a.equals(entry.getKey()) || !this.f39181b.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        ac(K k2, V v) {
            this.f39180a = k2;
            this.f39181b = v;
        }
    }

    static abstract class b<K, V> implements d<K, V> {
        static {
            Covode.recordClassIndex(24005);
        }

        b() {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public u<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public int c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public K d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public long e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void b(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void c(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void d(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void a(u<K, V> uVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void b(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void a(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    public static class j<K, V> implements a<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final c<K, V> localCache;

        static {
            Covode.recordClassIndex(24023);
        }

        @Override // com.bytedance.jedi.a.g.b.a
        public final ConcurrentMap<K, V> b() {
            return this.localCache;
        }

        @Override // com.bytedance.jedi.a.g.b.a
        public final void a() {
            this.localCache.clear();
        }

        private j(c<K, V> cVar) {
            this.localCache = cVar;
        }

        j(b<? super K, ? super V> bVar) {
            this(new c(bVar));
        }

        @Override // com.bytedance.jedi.a.g.b.a
        public final void b(Object obj) {
            com.bytedance.jedi.a.g.a.c.a(obj);
            this.localCache.remove(obj);
        }

        @Override // com.bytedance.jedi.a.g.b.a
        public final V a(Object obj) {
            c<K, V> cVar = this.localCache;
            int a2 = cVar.a(com.bytedance.jedi.a.g.a.c.a(obj));
            return cVar.a(a2).a(obj, a2);
        }

        @Override // com.bytedance.jedi.a.g.b.a
        public final void a(K k2, V v) {
            this.localCache.put(k2, v);
        }
    }

    static class m<K, V> extends SoftReference<V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f39212a;

        static {
            Covode.recordClassIndex(24026);
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final int a() {
            return 1;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final boolean c() {
            return true;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final d<K, V> b() {
            return this.f39212a;
        }

        m(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            super(v, referenceQueue);
            this.f39212a = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new m(referenceQueue, v, dVar);
        }
    }

    static final class o<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39217a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39218b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39219c = k.INSTANCE;

        static {
            Covode.recordClassIndex(24031);
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final long e() {
            return this.f39217a;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> f() {
            return this.f39218b;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> g() {
            return this.f39219c;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void a(long j2) {
            this.f39217a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void b(d<K, V> dVar) {
            this.f39219c = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void a(d<K, V> dVar) {
            this.f39218b = dVar;
        }

        o(K k2, int i2, d<K, V> dVar) {
            super(k2, i2, dVar);
        }
    }

    static final class p<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39220a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39221b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39222c = k.INSTANCE;

        /* renamed from: d  reason: collision with root package name */
        volatile long f39223d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f39224e = k.INSTANCE;

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f39225f = k.INSTANCE;

        static {
            Covode.recordClassIndex(24032);
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final long e() {
            return this.f39220a;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> f() {
            return this.f39221b;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> g() {
            return this.f39222c;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final long h() {
            return this.f39223d;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> i() {
            return this.f39224e;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> j() {
            return this.f39225f;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void a(long j2) {
            this.f39220a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void b(long j2) {
            this.f39223d = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void c(d<K, V> dVar) {
            this.f39224e = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void d(d<K, V> dVar) {
            this.f39225f = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void a(d<K, V> dVar) {
            this.f39221b = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void b(d<K, V> dVar) {
            this.f39222c = dVar;
        }

        p(K k2, int i2, d<K, V> dVar) {
            super(k2, i2, dVar);
        }
    }

    static class q<K, V> extends b<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final K f39226g;

        /* renamed from: h  reason: collision with root package name */
        final int f39227h;

        /* renamed from: i  reason: collision with root package name */
        final d<K, V> f39228i;

        /* renamed from: j  reason: collision with root package name */
        volatile u<K, V> f39229j = ((u<K, V>) c.s);

        static {
            Covode.recordClassIndex(24033);
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final u<K, V> a() {
            return this.f39229j;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> b() {
            return this.f39228i;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final int c() {
            return this.f39227h;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final K d() {
            return this.f39226g;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void a(u<K, V> uVar) {
            this.f39229j = uVar;
        }

        q(K k2, int i2, d<K, V> dVar) {
            this.f39226g = k2;
            this.f39227h = i2;
            this.f39228i = dVar;
        }
    }

    static class r<K, V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final V f39230a;

        static {
            Covode.recordClassIndex(24034);
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final int a() {
            return 1;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return this;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final d<K, V> b() {
            return null;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final boolean c() {
            return true;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final V get() {
            return this.f39230a;
        }

        r(V v) {
            this.f39230a = v;
        }
    }

    static final class s<K, V> extends q<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39231a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39232b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39233c = k.INSTANCE;

        static {
            Covode.recordClassIndex(24035);
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final long h() {
            return this.f39231a;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> i() {
            return this.f39232b;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final d<K, V> j() {
            return this.f39233c;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void b(long j2) {
            this.f39231a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void c(d<K, V> dVar) {
            this.f39232b = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
        public final void d(d<K, V> dVar) {
            this.f39233c = dVar;
        }

        s(K k2, int i2, d<K, V> dVar) {
            super(k2, i2, dVar);
        }
    }

    static final class w<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39237a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39238b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39239c = k.INSTANCE;

        static {
            Covode.recordClassIndex(24039);
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final long e() {
            return this.f39237a;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> f() {
            return this.f39238b;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> g() {
            return this.f39239c;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void a(long j2) {
            this.f39237a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void b(d<K, V> dVar) {
            this.f39239c = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void a(d<K, V> dVar) {
            this.f39238b = dVar;
        }

        w(ReferenceQueue<K> referenceQueue, K k2, int i2, d<K, V> dVar) {
            super(referenceQueue, k2, i2, dVar);
        }
    }

    static final class x<K, V> extends y<K, V> {

        /* renamed from: a  reason: collision with root package name */
        volatile long f39240a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f39241b = k.INSTANCE;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f39242c = k.INSTANCE;

        /* renamed from: d  reason: collision with root package name */
        volatile long f39243d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f39244e = k.INSTANCE;

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f39245f = k.INSTANCE;

        static {
            Covode.recordClassIndex(24040);
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final long e() {
            return this.f39240a;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> f() {
            return this.f39241b;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> g() {
            return this.f39242c;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final long h() {
            return this.f39243d;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> i() {
            return this.f39244e;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final d<K, V> j() {
            return this.f39245f;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void a(long j2) {
            this.f39240a = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void b(long j2) {
            this.f39243d = j2;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void c(d<K, V> dVar) {
            this.f39244e = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void d(d<K, V> dVar) {
            this.f39245f = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void a(d<K, V> dVar) {
            this.f39241b = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.y, com.bytedance.jedi.a.g.b.d
        public final void b(d<K, V> dVar) {
            this.f39242c = dVar;
        }

        x(ReferenceQueue<K> referenceQueue, K k2, int i2, d<K, V> dVar) {
            super(referenceQueue, k2, i2, dVar);
        }
    }

    static class y<K, V> extends WeakReference<K> implements d<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final int f39246g;

        /* renamed from: h  reason: collision with root package name */
        final d<K, V> f39247h;

        /* renamed from: i  reason: collision with root package name */
        volatile u<K, V> f39248i = ((u<K, V>) c.s);

        static {
            Covode.recordClassIndex(24041);
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final u<K, V> a() {
            return this.f39248i;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<K, V> b() {
            return this.f39247h;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final int c() {
            return this.f39246g;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final K d() {
            return (K) get();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public long e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public d<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void b(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void c(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void a(u<K, V> uVar) {
            this.f39248i = uVar;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void b(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void d(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public void a(d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        y(ReferenceQueue<K> referenceQueue, K k2, int i2, d<K, V> dVar) {
            super(k2, referenceQueue);
            this.f39246g = i2;
            this.f39247h = dVar;
        }
    }

    static class z<K, V> extends WeakReference<V> implements u<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f39249a;

        static {
            Covode.recordClassIndex(24042);
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final int a() {
            return 1;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final boolean c() {
            return true;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final d<K, V> b() {
            return this.f39249a;
        }

        z(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            super(v, referenceQueue);
            this.f39249a = dVar;
        }

        @Override // com.bytedance.jedi.a.g.b.c.u
        public final u<K, V> a(ReferenceQueue<V> referenceQueue, V v, d<K, V> dVar) {
            return new z(referenceQueue, v, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class l<K, V> extends ReentrantLock {
        final Queue<d<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final c<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<d<K, V>> recencyQueue;
        volatile AtomicReferenceArray<d<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<d<K, V>> writeQueue;

        static {
            Covode.recordClassIndex(24025);
        }

        /* access modifiers changed from: package-private */
        public final V a(Object obj, int i2) {
            try {
                if (this.count != 0) {
                    long a2 = this.map.q.a();
                    d<K, V> a3 = a(obj, i2, a2);
                    if (a3 == null) {
                        return null;
                    }
                    V v = a3.a().get();
                    if (v != null) {
                        if (this.map.d()) {
                            a3.a(a2);
                        }
                        this.recencyQueue.add(a3);
                        b();
                        return v;
                    }
                    a();
                }
                b();
                return null;
            } finally {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (tryLock()) {
                try {
                    d();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            if (tryLock()) {
                try {
                    c(j2);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(K k2, V v, int i2, e eVar) {
            this.totalWeight -= (long) i2;
            if (this.map.o != c.t) {
                this.map.o.offer(g.create(k2, v, eVar));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.jedi.a.g.b.c$d */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final V a(K k2, int i2, V v, boolean z) {
            int i3;
            AtomicReferenceArray<d<K, V>> atomicReferenceArray;
            int length;
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                if (this.count + 1 > this.threshold && (length = (atomicReferenceArray = this.table).length()) < 1073741824) {
                    int i4 = this.count;
                    AtomicReferenceArray<d<K, V>> a3 = a(length << 1);
                    this.threshold = (a3.length() * 3) / 4;
                    int length2 = a3.length() - 1;
                    for (int i5 = 0; i5 < length; i5++) {
                        d<K, V> dVar = atomicReferenceArray.get(i5);
                        if (dVar != null) {
                            d<K, V> b2 = dVar.b();
                            int c2 = dVar.c() & length2;
                            if (b2 == null) {
                                a3.set(c2, dVar);
                            } else {
                                d<K, V> dVar2 = dVar;
                                while (b2 != null) {
                                    int c3 = b2.c() & length2;
                                    if (c3 != c2) {
                                        c2 = c3;
                                        dVar2 = b2;
                                    }
                                    b2 = b2.b();
                                }
                                a3.set(c2, dVar2);
                                while (dVar != dVar2) {
                                    int c4 = dVar.c() & length2;
                                    d<K, V> a4 = a(dVar, a3.get(c4));
                                    if (a4 != null) {
                                        a3.set(c4, a4);
                                    } else {
                                        b(dVar);
                                        i4--;
                                    }
                                    dVar = dVar.b();
                                }
                            }
                        }
                    }
                    this.table = a3;
                    this.count = i4;
                }
                AtomicReferenceArray<d<K, V>> atomicReferenceArray2 = this.table;
                int length3 = (atomicReferenceArray2.length() - 1) & i2;
                d<K, V> dVar3 = atomicReferenceArray2.get(length3);
                for (d<K, V> dVar4 = dVar3; dVar4 != null; dVar4 = dVar4.b()) {
                    K d2 = dVar4.d();
                    if (dVar4.c() == i2 && d2 != null && this.map.f39162f.a(k2, d2)) {
                        u<K, V> a5 = dVar4.a();
                        V v2 = a5.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (a5.c()) {
                                a(k2, v2, a5.a(), e.COLLECTED);
                                a(dVar4, v, a2);
                                i3 = this.count;
                            } else {
                                a(dVar4, v, a2);
                                i3 = this.count + 1;
                            }
                            this.count = i3;
                            a(dVar4);
                            return null;
                        } else if (z) {
                            a(dVar4, a2);
                            unlock();
                            c();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k2, v2, a5.a(), e.REPLACED);
                            a(dVar4, v, a2);
                            a(dVar4);
                            unlock();
                            c();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                d<K, V> a6 = this.map.r.a(this, com.bytedance.jedi.a.g.a.c.a(k2), i2, dVar3);
                a(a6, v, a2);
                atomicReferenceArray2.set(length3, a6);
                this.count++;
                a(a6);
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k2, int i2, V v, V v2) {
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                d<K, V> dVar = atomicReferenceArray.get(length);
                for (d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.b()) {
                    K d2 = dVar2.d();
                    if (dVar2.c() == i2 && d2 != null && this.map.f39162f.a(k2, d2)) {
                        u<K, V> a3 = dVar2.a();
                        V v3 = a3.get();
                        if (v3 == null) {
                            if (a3.c()) {
                                this.modCount++;
                                atomicReferenceArray.set(length, a(dVar, dVar2, d2, v3, a3, e.COLLECTED));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.f39163g.a(v, v3)) {
                            this.modCount++;
                            a(k2, v3, a3.a(), e.REPLACED);
                            a(dVar2, v2, a2);
                            a(dVar2);
                            unlock();
                            c();
                            return true;
                        } else {
                            a(dVar2, a2);
                            unlock();
                            c();
                            return false;
                        }
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final V a(K k2, int i2, V v) {
            lock();
            try {
                long a2 = this.map.q.a();
                b(a2);
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                d<K, V> dVar = atomicReferenceArray.get(length);
                for (d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.b()) {
                    K d2 = dVar2.d();
                    if (dVar2.c() == i2 && d2 != null && this.map.f39162f.a(k2, d2)) {
                        u<K, V> a3 = dVar2.a();
                        V v2 = a3.get();
                        if (v2 == null) {
                            if (a3.c()) {
                                this.modCount++;
                                atomicReferenceArray.set(length, a(dVar, dVar2, d2, v2, a3, e.COLLECTED));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, a3.a(), e.REPLACED);
                        a(dVar2, v, a2);
                        a(dVar2);
                        unlock();
                        c();
                        return v2;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(d<K, V> dVar, int i2) {
            lock();
            try {
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                d<K, V> dVar2 = atomicReferenceArray.get(length);
                for (d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.b()) {
                    if (dVar3 == dVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar2, dVar3, dVar3.d(), dVar3.a().get(), dVar3.a(), e.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(K k2, int i2, u<K, V> uVar) {
            lock();
            try {
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                d<K, V> dVar = atomicReferenceArray.get(length);
                for (d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.b()) {
                    K d2 = dVar2.d();
                    if (dVar2.c() == i2 && d2 != null && this.map.f39162f.a(k2, d2)) {
                        if (dVar2.a() == uVar) {
                            this.modCount++;
                            atomicReferenceArray.set(length, a(dVar, dVar2, d2, uVar.get(), uVar, e.COLLECTED));
                            this.count--;
                            return true;
                        } else {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                c();
                            }
                            return false;
                        }
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
            }
        }

        private void i() {
            b(this.map.q.a());
            c();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (!isHeldByCurrentThread()) {
                this.map.i();
            }
        }

        private void d() {
            if (this.map.g()) {
                e();
            }
            if (this.map.h()) {
                f();
            }
        }

        private void e() {
            int i2 = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((d) ((d) poll));
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
                    this.map.a((u) ((u) poll));
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        private void g() {
            while (true) {
                d<K, V> poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        private d<K, V> h() {
            for (d<K, V> dVar : this.accessQueue) {
                if (dVar.a().a() > 0) {
                    return dVar;
                }
            }
            throw new AssertionError();
        }

        private static AtomicReferenceArray<d<K, V>> a(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        private void b(d<K, V> dVar) {
            K d2 = dVar.d();
            dVar.c();
            a(d2, dVar.a().get(), dVar.a().a(), e.COLLECTED);
            this.writeQueue.remove(dVar);
            this.accessQueue.remove(dVar);
        }

        private void c(long j2) {
            d<K, V> peek;
            d<K, V> peek2;
            g();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.a(peek, j2)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.a(peek2, j2)) {
                            return;
                        }
                    } while (a((d) peek2, peek2.c(), e.EXPIRED));
                    throw new AssertionError();
                }
            } while (a((d) peek, peek.c(), e.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public final void b(long j2) {
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

        private void a(d<K, V> dVar) {
            if (this.map.a()) {
                g();
                if (((long) dVar.a().a()) <= this.maxSegmentWeight || a((d) dVar, dVar.c(), e.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        d<K, V> h2 = h();
                        if (!a((d) h2, h2.c(), e.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        private d<K, V> b(d<K, V> dVar, d<K, V> dVar2) {
            int i2 = this.count;
            d<K, V> b2 = dVar2.b();
            while (dVar != dVar2) {
                d<K, V> a2 = a(dVar, b2);
                if (a2 != null) {
                    b2 = a2;
                } else {
                    b(dVar);
                    i2--;
                }
                dVar = dVar.b();
            }
            this.count = i2;
            return b2;
        }

        private d<K, V> a(d<K, V> dVar, d<K, V> dVar2) {
            if (dVar.d() == null) {
                return null;
            }
            u<K, V> a2 = dVar.a();
            V v = a2.get();
            if (v == null && a2.c()) {
                return null;
            }
            d<K, V> a3 = this.map.r.a(this, dVar, dVar2);
            a3.a(a2.a(this.valueReferenceQueue, v, a3));
            return a3;
        }

        private d<K, V> d(Object obj, int i2) {
            AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
            for (d<K, V> dVar = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i2); dVar != null; dVar = dVar.b()) {
                if (dVar.c() == i2) {
                    K d2 = dVar.d();
                    if (d2 == null) {
                        a();
                    } else if (this.map.f39162f.a(obj, d2)) {
                        return dVar;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i2) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    d<K, V> a2 = a(obj, i2, this.map.q.a());
                    if (a2 == null) {
                        return false;
                    }
                    if (a2.a().get() != null) {
                        z = true;
                    }
                    b();
                    return z;
                }
                b();
                return false;
            } finally {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final V c(Object obj, int i2) {
            e eVar;
            lock();
            try {
                b(this.map.q.a());
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i2;
                d<K, V> dVar = atomicReferenceArray.get(length);
                for (d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.b()) {
                    K d2 = dVar2.d();
                    if (dVar2.c() == i2 && d2 != null && this.map.f39162f.a(obj, d2)) {
                        u<K, V> a2 = dVar2.a();
                        V v = a2.get();
                        if (v != null) {
                            eVar = e.EXPLICIT;
                        } else if (a2.c()) {
                            eVar = e.COLLECTED;
                        } else {
                            unlock();
                            c();
                            return null;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar, dVar2, d2, v, a2, eVar));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        private void a(d<K, V> dVar, long j2) {
            if (this.map.d()) {
                dVar.a(j2);
            }
            this.accessQueue.add(dVar);
        }

        l(c<K, V> cVar, int i2, long j2) {
            ReferenceQueue<K> referenceQueue;
            this.map = cVar;
            this.maxSegmentWeight = j2;
            AtomicReferenceArray<d<K, V>> a2 = a(i2);
            this.threshold = (a2.length() * 3) / 4;
            if (!cVar.b()) {
                int i3 = this.threshold;
                if (((long) i3) == j2) {
                    this.threshold = i3 + 1;
                }
            }
            this.table = a2;
            ReferenceQueue<V> referenceQueue2 = null;
            if (cVar.g()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = cVar.h() ? new ReferenceQueue<>() : referenceQueue2;
            this.recencyQueue = cVar.e() ? new ConcurrentLinkedQueue() : (Queue<d<K, V>>) c.t;
            this.writeQueue = cVar.c() ? new ab() : (Queue<d<K, V>>) c.t;
            this.accessQueue = cVar.e() ? new C0950c() : (Queue<d<K, V>>) c.t;
        }

        private d<K, V> a(Object obj, int i2, long j2) {
            d<K, V> d2 = d(obj, i2);
            if (d2 == null) {
                return null;
            }
            if (!this.map.a(d2, j2)) {
                return d2;
            }
            a(j2);
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Object obj, int i2, Object obj2) {
            e eVar;
            lock();
            try {
                b(this.map.q.a());
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i2;
                d<K, V> dVar = atomicReferenceArray.get(length);
                for (d<K, V> dVar2 = dVar; dVar2 != null; dVar2 = dVar2.b()) {
                    K d2 = dVar2.d();
                    if (dVar2.c() == i2 && d2 != null && this.map.f39162f.a(obj, d2)) {
                        u<K, V> a2 = dVar2.a();
                        V v = a2.get();
                        if (this.map.f39163g.a(obj2, v)) {
                            eVar = e.EXPLICIT;
                        } else if (v != null || !a2.c()) {
                            unlock();
                            c();
                            return false;
                        } else {
                            eVar = e.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, a(dVar, dVar2, d2, v, a2, eVar));
                        this.count--;
                        if (eVar != e.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        private void a(d<K, V> dVar, V v, long j2) {
            dVar.a();
            com.bytedance.jedi.a.g.a.c.b(true, "Weights must be non-negative");
            dVar.a(this.map.f39165i.a(this, dVar, v));
            g();
            this.totalWeight++;
            if (this.map.d()) {
                dVar.a(j2);
            }
            if (this.map.f()) {
                dVar.b(j2);
            }
            this.accessQueue.add(dVar);
            this.writeQueue.add(dVar);
        }

        private boolean a(d<K, V> dVar, int i2, e eVar) {
            AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.table;
            int length = i2 & (atomicReferenceArray.length() - 1);
            d<K, V> dVar2 = atomicReferenceArray.get(length);
            for (d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.b()) {
                if (dVar3 == dVar) {
                    this.modCount++;
                    atomicReferenceArray.set(length, a(dVar2, dVar3, dVar3.d(), dVar3.a().get(), dVar3.a(), eVar));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        private d<K, V> a(d<K, V> dVar, d<K, V> dVar2, K k2, V v, u<K, V> uVar, e eVar) {
            a(k2, v, uVar.a(), eVar);
            this.writeQueue.remove(dVar2);
            this.accessQueue.remove(dVar2);
            return b(dVar, dVar2);
        }
    }

    abstract class a<T> extends AbstractSet<T> {

        /* renamed from: a  reason: collision with root package name */
        final ConcurrentMap<?, ?> f39170a;

        static {
            Covode.recordClassIndex(23999);
        }

        public void clear() {
            this.f39170a.clear();
        }

        public boolean isEmpty() {
            return this.f39170a.isEmpty();
        }

        public int size() {
            return this.f39170a.size();
        }

        public Object[] toArray() {
            return c.a((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) c.a((Collection) this).toArray(eArr);
        }

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.f39170a = concurrentMap;
        }
    }

    final class e extends c<K, V>.g {
        static {
            Covode.recordClassIndex(24018);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return a();
        }

        e() {
            super();
        }
    }

    final class f extends c<K, V>.a {
        static {
            Covode.recordClassIndex(24019);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && c.this.remove(key, entry.getValue())) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = c.this.get(key)) != null && c.this.f39163g.a(entry.getValue(), obj2)) {
                return true;
            }
            return false;
        }

        f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    abstract class g<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f39200b;

        /* renamed from: c  reason: collision with root package name */
        int f39201c = -1;

        /* renamed from: d  reason: collision with root package name */
        l<K, V> f39202d;

        /* renamed from: e  reason: collision with root package name */
        AtomicReferenceArray<d<K, V>> f39203e;

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f39204f;

        /* renamed from: g  reason: collision with root package name */
        c<K, V>.ac f39205g;

        /* renamed from: h  reason: collision with root package name */
        c<K, V>.ac f39206h;

        static {
            Covode.recordClassIndex(24020);
        }

        public boolean hasNext() {
            if (this.f39205g != null) {
                return true;
            }
            return false;
        }

        private boolean c() {
            d<K, V> dVar = this.f39204f;
            if (dVar == null) {
                return false;
            }
            while (true) {
                this.f39204f = dVar.b();
                d<K, V> dVar2 = this.f39204f;
                if (dVar2 == null) {
                    return false;
                }
                if (a(dVar2)) {
                    return true;
                }
                dVar = this.f39204f;
            }
        }

        /* access modifiers changed from: package-private */
        public final c<K, V>.ac a() {
            c<K, V>.ac acVar = this.f39205g;
            if (acVar != null) {
                this.f39206h = acVar;
                b();
                return this.f39206h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            c<K, V>.ac acVar = this.f39206h;
            if (acVar != null) {
                c.this.remove(acVar.getKey());
                this.f39206h = null;
                return;
            }
            throw new IllegalStateException();
        }

        private void b() {
            this.f39205g = null;
            if (!c() && !d()) {
                while (this.f39200b >= 0) {
                    l<K, V>[] lVarArr = c.this.f39160d;
                    int i2 = this.f39200b;
                    this.f39200b = i2 - 1;
                    l<K, V> lVar = lVarArr[i2];
                    this.f39202d = lVar;
                    if (lVar.count != 0) {
                        AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.f39202d.table;
                        this.f39203e = atomicReferenceArray;
                        this.f39201c = atomicReferenceArray.length() - 1;
                        if (d()) {
                            return;
                        }
                    }
                }
            }
        }

        private boolean d() {
            while (true) {
                int i2 = this.f39201c;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = this.f39203e;
                this.f39201c = i2 - 1;
                d<K, V> dVar = atomicReferenceArray.get(i2);
                this.f39204f = dVar;
                if (dVar != null && (a(dVar) || c())) {
                    return true;
                }
            }
        }

        g() {
            this.f39200b = c.this.f39160d.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(d<K, V> dVar) {
            try {
                long a2 = c.this.q.a();
                K d2 = dVar.d();
                c cVar = c.this;
                if (dVar.d() != null) {
                    V v = dVar.a().get();
                    if (v != null) {
                        if (!cVar.a(dVar, a2)) {
                            this.f39205g = new ac(d2, v);
                            this.f39202d.b();
                            return true;
                        }
                    }
                }
                this.f39202d.b();
                return false;
            } catch (Throwable th) {
                this.f39202d.b();
                throw th;
            }
        }
    }

    final class i extends c<K, V>.a {
        static {
            Covode.recordClassIndex(24022);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new h();
        }

        public final boolean contains(Object obj) {
            return this.f39170a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f39170a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    final class v extends AbstractCollection<V> {

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<?, ?> f39236b;

        static {
            Covode.recordClassIndex(24038);
        }

        public final void clear() {
            this.f39236b.clear();
        }

        public final boolean isEmpty() {
            return this.f39236b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new t();
        }

        public final int size() {
            return this.f39236b.size();
        }

        public final Object[] toArray() {
            return c.a((Collection) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f39236b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) c.a((Collection) this).toArray(eArr);
        }

        v(ConcurrentMap<?, ?> concurrentMap) {
            this.f39236b = concurrentMap;
        }
    }

    static final class ab<K, V> extends AbstractQueue<d<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f39175a = new b<K, V>() {
            /* class com.bytedance.jedi.a.g.b.c.ab.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            d<K, V> f39176a = this;

            /* renamed from: b  reason: collision with root package name */
            d<K, V> f39177b = this;

            static {
                Covode.recordClassIndex(24002);
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void b(long j2) {
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final long h() {
                return Long.MAX_VALUE;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final d<K, V> i() {
                return this.f39176a;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final d<K, V> j() {
                return this.f39177b;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void c(d<K, V> dVar) {
                this.f39176a = dVar;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void d(d<K, V> dVar) {
                this.f39177b = dVar;
            }
        };

        static {
            Covode.recordClassIndex(24001);
        }

        ab() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d<K, V> peek() {
            d<K, V> i2 = this.f39175a.i();
            if (i2 == this.f39175a) {
                return null;
            }
            return i2;
        }

        public final boolean isEmpty() {
            if (this.f39175a.i() == this.f39175a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<d<K, V>> iterator() {
            return new com.bytedance.jedi.a.g.c.a<d<K, V>>(peek()) {
                /* class com.bytedance.jedi.a.g.b.c.ab.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(24003);
                }

                @Override // com.bytedance.jedi.a.g.c.a
                public final /* synthetic */ Object a(Object obj) {
                    d<K, V> i2 = ((d) obj).i();
                    if (i2 == ab.this.f39175a) {
                        return null;
                    }
                    return i2;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            d<K, V> i2 = this.f39175a.i();
            if (i2 == this.f39175a) {
                return null;
            }
            remove(i2);
            return i2;
        }

        public final void clear() {
            d<K, V> i2 = this.f39175a.i();
            while (true) {
                d<K, V> dVar = this.f39175a;
                if (i2 != dVar) {
                    d<K, V> i3 = i2.i();
                    c.c(i2);
                    i2 = i3;
                } else {
                    dVar.c(dVar);
                    d<K, V> dVar2 = this.f39175a;
                    dVar2.d(dVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i2 = 0;
            for (d<K, V> i3 = this.f39175a.i(); i3 != this.f39175a; i3 = i3.i()) {
                i2++;
            }
            return i2;
        }

        public final boolean contains(Object obj) {
            if (((d) obj).i() != k.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            d dVar = (d) obj;
            c.b(dVar.j(), dVar.i());
            c.b(this.f39175a.j(), dVar);
            c.b(dVar, this.f39175a);
            return true;
        }

        public final boolean remove(Object obj) {
            d dVar = (d) obj;
            d<K, V> j2 = dVar.j();
            d<K, V> i2 = dVar.i();
            c.b(j2, i2);
            c.c(dVar);
            if (i2 != k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.c$c  reason: collision with other inner class name */
    static final class C0950c<K, V> extends AbstractQueue<d<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final d<K, V> f39183a = new b<K, V>() {
            /* class com.bytedance.jedi.a.g.b.c.C0950c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            d<K, V> f39184a = this;

            /* renamed from: b  reason: collision with root package name */
            d<K, V> f39185b = this;

            static {
                Covode.recordClassIndex(24007);
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void a(long j2) {
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final long e() {
                return Long.MAX_VALUE;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final d<K, V> f() {
                return this.f39184a;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final d<K, V> g() {
                return this.f39185b;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void b(d<K, V> dVar) {
                this.f39185b = dVar;
            }

            @Override // com.bytedance.jedi.a.g.b.d, com.bytedance.jedi.a.g.b.c.b
            public final void a(d<K, V> dVar) {
                this.f39184a = dVar;
            }
        };

        static {
            Covode.recordClassIndex(24006);
        }

        C0950c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d<K, V> peek() {
            d<K, V> f2 = this.f39183a.f();
            if (f2 == this.f39183a) {
                return null;
            }
            return f2;
        }

        public final boolean isEmpty() {
            if (this.f39183a.f() == this.f39183a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<d<K, V>> iterator() {
            return new com.bytedance.jedi.a.g.c.a<d<K, V>>(peek()) {
                /* class com.bytedance.jedi.a.g.b.c.C0950c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(24008);
                }

                @Override // com.bytedance.jedi.a.g.c.a
                public final /* synthetic */ Object a(Object obj) {
                    d<K, V> f2 = ((d) obj).f();
                    if (f2 == C0950c.this.f39183a) {
                        return null;
                    }
                    return f2;
                }
            };
        }

        @Override // java.util.Queue
        public final /* synthetic */ Object poll() {
            d<K, V> f2 = this.f39183a.f();
            if (f2 == this.f39183a) {
                return null;
            }
            remove(f2);
            return f2;
        }

        public final void clear() {
            d<K, V> f2 = this.f39183a.f();
            while (true) {
                d<K, V> dVar = this.f39183a;
                if (f2 != dVar) {
                    d<K, V> f3 = f2.f();
                    c.b(f2);
                    f2 = f3;
                } else {
                    dVar.a(dVar);
                    d<K, V> dVar2 = this.f39183a;
                    dVar2.b(dVar2);
                    return;
                }
            }
        }

        public final int size() {
            int i2 = 0;
            for (d<K, V> f2 = this.f39183a.f(); f2 != this.f39183a; f2 = f2.f()) {
                i2++;
            }
            return i2;
        }

        public final boolean contains(Object obj) {
            if (((d) obj).f() != k.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public final /* synthetic */ boolean offer(Object obj) {
            d dVar = (d) obj;
            c.a(dVar.g(), dVar.f());
            c.a(this.f39183a.g(), dVar);
            c.a(dVar, this.f39183a);
            return true;
        }

        public final boolean remove(Object obj) {
            d dVar = (d) obj;
            d<K, V> g2 = dVar.g();
            d<K, V> f2 = dVar.f();
            c.a(g2, f2);
            c.b(dVar);
            if (f2 != k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    final class h extends c<K, V>.g {
        static {
            Covode.recordClassIndex(24021);
        }

        @Override // java.util.Iterator
        public final K next() {
            return (K) a().getKey();
        }

        h() {
            super();
        }
    }

    final class t extends c<K, V>.g {
        static {
            Covode.recordClassIndex(24036);
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) a().getValue();
        }

        t() {
            super();
        }
    }

    private boolean j() {
        if (this.n > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f39168l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (d() || a()) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.w;
        if (set != null) {
            return set;
        }
        f fVar = new f(this);
        this.w = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (c() || j()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f39164h != n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        if (this.f39165i != n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        do {
        } while (this.o.poll() != null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.u;
        if (set != null) {
            return set;
        }
        i iVar = new i(this);
        this.u = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.v;
        if (collection != null) {
            return collection;
        }
        v vVar = new v(this);
        this.v = vVar;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public enum k implements d<Object, Object> {
        INSTANCE;

        @Override // com.bytedance.jedi.a.g.b.d
        public final u<Object, Object> a() {
            return null;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void a(long j2) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void a(u<Object, Object> uVar) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void a(d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<Object, Object> b() {
            return null;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void b(long j2) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void b(d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final int c() {
            return 0;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void c(d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final Object d() {
            return null;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final void d(d<Object, Object> dVar) {
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final long e() {
            return 0;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<Object, Object> f() {
            return this;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<Object, Object> g() {
            return this;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final long h() {
            return 0;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<Object, Object> i() {
            return this;
        }

        @Override // com.bytedance.jedi.a.g.b.d
        public final d<Object, Object> j() {
            return this;
        }

        static {
            Covode.recordClassIndex(24024);
        }
    }

    static {
        Covode.recordClassIndex(23996);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f39167k != b.EnumC0949b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f39169m > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public enum n {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final com.bytedance.jedi.a.g.a.a<Object> a() {
                return a.C0947a.f39130a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final <K, V> u<K, V> a(l<K, V> lVar, d<K, V> dVar, V v) {
                return new r(v);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final com.bytedance.jedi.a.g.a.a<Object> a() {
                return a.b.f39131a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final <K, V> u<K, V> a(l<K, V> lVar, d<K, V> dVar, V v) {
                return new m(lVar.valueReferenceQueue, v, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final com.bytedance.jedi.a.g.a.a<Object> a() {
                return a.b.f39131a;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.n
            public final <K, V> u<K, V> a(l<K, V> lVar, d<K, V> dVar, V v) {
                return new z(lVar.valueReferenceQueue, v, dVar);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract com.bytedance.jedi.a.g.a.a<Object> a();

        /* access modifiers changed from: package-private */
        public abstract <K, V> u<K, V> a(l<K, V> lVar, d<K, V> dVar, V v);

        static {
            Covode.recordClassIndex(24027);
        }

        /* synthetic */ n(byte b2) {
            this();
        }
    }

    public boolean isEmpty() {
        l<K, V>[] lVarArr = this.f39160d;
        long j2 = 0;
        for (int i2 = 0; i2 < lVarArr.length; i2++) {
            if (lVarArr[i2].count != 0) {
                return false;
            }
            j2 += (long) lVarArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < lVarArr.length; i3++) {
            if (lVarArr[i3].count != 0) {
                return false;
            }
            j2 -= (long) lVarArr[i3].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        l<K, V>[] lVarArr;
        long j2 = 0;
        for (l<K, V> lVar : this.f39160d) {
            j2 += (long) Math.max(0, lVar.count);
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* access modifiers changed from: package-private */
    public enum d {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new q(k2, i2, dVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                a(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new o(k2, i2, dVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                b(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new s(k2, i2, dVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                a(dVar, a2);
                b(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new p(k2, i2, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new y(lVar.keyReferenceQueue, k2, i2, dVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                a(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new w(lVar.keyReferenceQueue, k2, i2, dVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                b(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new aa(lVar.keyReferenceQueue, k2, i2, dVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
                d<K, V> a2 = super.a(lVar, dVar, dVar2);
                a(dVar, a2);
                b(dVar, a2);
                return a2;
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.jedi.a.g.b.c.d
            public final <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar) {
                return new x(lVar.keyReferenceQueue, k2, i2, dVar);
            }
        };
        

        /* renamed from: i  reason: collision with root package name */
        static final d[] f39196i;

        /* access modifiers changed from: package-private */
        public abstract <K, V> d<K, V> a(l<K, V> lVar, K k2, int i2, d<K, V> dVar);

        static {
            AnonymousClass1 r14;
            AnonymousClass2 r13;
            AnonymousClass3 r12;
            AnonymousClass4 r11;
            AnonymousClass5 r10;
            AnonymousClass6 r9;
            AnonymousClass7 r8;
            AnonymousClass8 r7;
            Covode.recordClassIndex(24009);
            f39196i = new d[]{r14, r13, r12, r11, r10, r9, r8, r7};
        }

        static <K, V> void a(d<K, V> dVar, d<K, V> dVar2) {
            dVar2.a(dVar.e());
            c.a(dVar.g(), dVar2);
            c.a(dVar2, dVar.f());
            c.b(dVar);
        }

        static <K, V> void b(d<K, V> dVar, d<K, V> dVar2) {
            dVar2.b(dVar.h());
            c.b(dVar.j(), dVar2);
            c.b(dVar2, dVar.i());
            c.c(dVar);
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public <K, V> d<K, V> a(l<K, V> lVar, d<K, V> dVar, d<K, V> dVar2) {
            return a(lVar, dVar.d(), dVar.c(), dVar2);
        }
    }

    public void clear() {
        e eVar;
        l<K, V>[] lVarArr = this.f39160d;
        int length = lVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            l<K, V> lVar = lVarArr[i2];
            if (lVar.count != 0) {
                lVar.lock();
                try {
                    lVar.b(lVar.map.q.a());
                    AtomicReferenceArray<d<K, V>> atomicReferenceArray = lVar.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (d<K, V> dVar = atomicReferenceArray.get(i3); dVar != null; dVar = dVar.b()) {
                            if (dVar.a().c()) {
                                K d2 = dVar.d();
                                V v2 = dVar.a().get();
                                if (d2 != null) {
                                    if (v2 != null) {
                                        eVar = e.EXPLICIT;
                                        dVar.c();
                                        lVar.a(d2, v2, dVar.a().a(), eVar);
                                    }
                                }
                                eVar = e.COLLECTED;
                                dVar.c();
                                lVar.a(d2, v2, dVar.a().a(), eVar);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (lVar.map.g()) {
                        do {
                        } while (lVar.keyReferenceQueue.poll() != null);
                    }
                    if (lVar.map.h()) {
                        do {
                        } while (lVar.valueReferenceQueue.poll() != null);
                    }
                    lVar.writeQueue.clear();
                    lVar.accessQueue.clear();
                    lVar.readCount.set(0);
                    lVar.modCount++;
                    lVar.count = 0;
                } finally {
                    lVar.unlock();
                    lVar.c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f39166j >= 0) {
            return true;
        }
        return false;
    }

    static <K, V> void b(d<K, V> dVar) {
        k kVar = k.INSTANCE;
        dVar.a(kVar);
        dVar.b(kVar);
    }

    static <K, V> void c(d<K, V> dVar) {
        k kVar = k.INSTANCE;
        dVar.c(kVar);
        dVar.d(kVar);
    }

    public static <E> ArrayList<E> a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        com.bytedance.jedi.a.g.c.b.a(arrayList, collection.iterator());
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
        int a2 = this.f39162f.a(obj);
        int i2 = a2 + ((a2 << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.jedi.a.g.b.c<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final l<K, V> a(int i2) {
        return this.f39160d[(i2 >>> this.f39159c) & this.f39158b];
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a2 = this.q.a();
        l<K, V>[] lVarArr = this.f39160d;
        long j2 = -1;
        int i2 = 0;
        do {
            long j3 = 0;
            for (l<K, V> lVar : lVarArr) {
                int i3 = lVar.count;
                AtomicReferenceArray<d<K, V>> atomicReferenceArray = lVar.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (d<K, V> dVar = atomicReferenceArray.get(i4); dVar != null; dVar = dVar.b()) {
                        V v2 = null;
                        if (dVar.d() == null) {
                            lVar.a();
                        } else {
                            V v3 = dVar.a().get();
                            if (v3 == null) {
                                lVar.a();
                            } else if (lVar.map.a(dVar, a2)) {
                                lVar.a(a2);
                            } else {
                                v2 = v3;
                            }
                        }
                        if (v2 != null && this.f39163g.a(obj, v2)) {
                            return true;
                        }
                    }
                }
                j3 += (long) lVar.modCount;
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
    public final void a(u<K, V> uVar) {
        d<K, V> b2 = uVar.b();
        int c2 = b2.c();
        a(c2).a((Object) b2.d(), c2, (u) uVar);
    }

    c(b<? super K, ? super V> bVar) {
        int i2;
        long j2;
        long j3;
        long j4;
        boolean z2;
        com.bytedance.jedi.a.g.a.e eVar;
        char c2;
        boolean z3;
        int i3;
        int i4;
        char c3 = 4;
        if (bVar.f39143d == -1) {
            i2 = 4;
        } else {
            i2 = bVar.f39143d;
        }
        this.f39161e = Math.min(i2, 65536);
        n b2 = bVar.b();
        this.f39164h = b2;
        this.f39165i = bVar.c();
        this.f39162f = (com.bytedance.jedi.a.g.a.a) com.bytedance.jedi.a.g.a.b.a(bVar.f39152m, bVar.b().a());
        this.f39163g = (com.bytedance.jedi.a.g.a.a) com.bytedance.jedi.a.g.a.b.a(bVar.n, bVar.c().a());
        long j5 = 0;
        if (bVar.f39149j == 0 || bVar.f39150k == 0) {
            j2 = 0;
        } else if (bVar.f39146g == null) {
            j2 = bVar.f39144e;
        } else {
            j2 = bVar.f39145f;
        }
        this.f39166j = j2;
        this.f39167k = (h) com.bytedance.jedi.a.g.a.b.a(bVar.f39146g, b.EnumC0949b.INSTANCE);
        if (bVar.f39150k == -1) {
            j3 = 0;
        } else {
            j3 = bVar.f39150k;
        }
        this.f39168l = j3;
        if (bVar.f39149j == -1) {
            j4 = 0;
        } else {
            j4 = bVar.f39149j;
        }
        this.f39169m = j4;
        this.n = bVar.f39151l != -1 ? bVar.f39151l : j5;
        f<K, V> fVar = (f) com.bytedance.jedi.a.g.a.b.a(bVar.o, b.a.INSTANCE);
        this.p = fVar;
        this.o = fVar == b.a.INSTANCE ? (Queue<g<K, V>>) t : new ConcurrentLinkedQueue();
        int i5 = 0;
        int i6 = 1;
        if (f() || d()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.p != null) {
            eVar = bVar.p;
        } else if (z2) {
            eVar = com.bytedance.jedi.a.g.a.e.f39139a;
        } else {
            eVar = b.f39140a;
        }
        this.q = eVar;
        if (e() || d()) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        if (c() || f()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = (b2 != n.WEAK ? 0 : c3) | c2;
        if (z3) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        this.r = d.f39196i[i7 | i3];
        if (bVar.f39142c == -1) {
            i4 = 16;
        } else {
            i4 = bVar.f39142c;
        }
        int min = Math.min(i4, 1073741824);
        if (a() && !b()) {
            min = (int) Math.min((long) min, j2);
        }
        int i8 = 1;
        int i9 = 0;
        while (i8 < this.f39161e && (!a() || ((long) (i8 * 20)) <= this.f39166j)) {
            i9++;
            i8 <<= 1;
        }
        this.f39159c = 32 - i9;
        this.f39158b = i8 - 1;
        this.f39160d = new l[i8];
        int i10 = min / i8;
        while (i6 < (i10 * i8 < min ? i10 + 1 : i10)) {
            i6 <<= 1;
        }
        if (a()) {
            long j6 = this.f39166j;
            long j7 = (long) i8;
            long j8 = (j6 / j7) + 1;
            long j9 = j6 % j7;
            while (true) {
                l<K, V>[] lVarArr = this.f39160d;
                if (i5 < lVarArr.length) {
                    if (((long) i5) == j9) {
                        j8--;
                    }
                    lVarArr[i5] = a(i6, j8);
                    i5++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                l<K, V>[] lVarArr2 = this.f39160d;
                if (i5 < lVarArr2.length) {
                    lVarArr2[i5] = a(i6, -1);
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(d<K, V> dVar) {
        int c2 = dVar.c();
        a(c2).a((d) dVar, c2);
    }

    private l<K, V> a(int i2, long j2) {
        return new l<>(this, i2, j2);
    }

    static <K, V> void b(d<K, V> dVar, d<K, V> dVar2) {
        dVar.c(dVar2);
        dVar2.d(dVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    static <K, V> void a(d<K, V> dVar, d<K, V> dVar2) {
        dVar.a(dVar2);
        dVar2.b(dVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        com.bytedance.jedi.a.g.a.c.a(k2);
        com.bytedance.jedi.a.g.a.c.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        com.bytedance.jedi.a.g.a.c.a(k2);
        com.bytedance.jedi.a.g.a.c.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a((Object) k2, a2, (Object) v2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        com.bytedance.jedi.a.g.a.c.a(k2);
        com.bytedance.jedi.a.g.a.c.a(v2);
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
    public final boolean a(d<K, V> dVar, long j2) {
        com.bytedance.jedi.a.g.a.c.a(dVar);
        if (d() && j2 - dVar.e() >= this.f39168l) {
            return true;
        }
        if (!c() || j2 - dVar.h() < this.f39169m) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        com.bytedance.jedi.a.g.a.c.a(k2);
        com.bytedance.jedi.a.g.a.c.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }
}
