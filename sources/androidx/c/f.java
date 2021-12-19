package androidx.c;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class f<K, V> {

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.b f1818b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.c f1819c;

    /* renamed from: d  reason: collision with root package name */
    f<K, V>.e f1820d;

    static {
        Covode.recordClassIndex(557);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract V a(int i2, V v);

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public abstract void a(K k2, V v);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public abstract void c();

    f() {
    }

    /* access modifiers changed from: package-private */
    public final class b implements Set<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(559);
        }

        public final void clear() {
            f.this.c();
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final boolean isEmpty() {
            if (f.this.a() == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i2 = 0;
            for (int a2 = f.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = f.this.a(a2, 0);
                Object a4 = f.this.a(a2, 1);
                if (a3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = a3.hashCode();
                }
                if (a4 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = a4.hashCode();
                }
                i2 += hashCode ^ hashCode2;
            }
            return i2;
        }

        b() {
        }

        @Override // java.util.Collection, java.util.Set
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return f.a((Set) this, obj);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.c.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a2 = f.this.a();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.a(entry.getKey(), entry.getValue());
            }
            if (a2 != f.this.a()) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = f.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return c.a(f.this.a(a2, 1), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final class c implements Set<K> {
        static {
            Covode.recordClassIndex(560);
        }

        public final void clear() {
            f.this.c();
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            return f.this.b(0);
        }

        public final boolean isEmpty() {
            if (f.this.a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final int hashCode() {
            int hashCode;
            int i2 = 0;
            for (int a2 = f.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = f.this.a(a2, 0);
                if (a3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = a3.hashCode();
                }
                i2 += hashCode;
            }
            return i2;
        }

        c() {
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return f.a((Set) this, obj);
        }

        public final boolean contains(Object obj) {
            if (f.this.a(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return f.a((Map) f.this.b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.a(tArr, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> b2 = f.this.b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!b2.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int a2 = f.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            f.this.a(a2);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> b2 = f.this.b();
            int size = b2.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b2.remove(it.next());
            }
            if (size != b2.size()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final class e implements Collection<V> {
        static {
            Covode.recordClassIndex(562);
        }

        public final void clear() {
            f.this.c();
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            return f.this.b(1);
        }

        public final boolean isEmpty() {
            if (f.this.a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            if (f.this.b(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.a(tArr, 1);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int b2 = f.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            f.this.a(b2);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int a2 = f.this.a();
            int i2 = 0;
            boolean z = false;
            while (i2 < a2) {
                if (collection.contains(f.this.a(i2, 1))) {
                    f.this.a(i2);
                    i2--;
                    a2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int a2 = f.this.a();
            int i2 = 0;
            boolean z = false;
            while (i2 < a2) {
                if (!collection.contains(f.this.a(i2, 1))) {
                    f.this.a(i2);
                    i2--;
                    a2--;
                    z = true;
                }
                i2++;
            }
            return z;
        }
    }

    final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f1821a;

        /* renamed from: b  reason: collision with root package name */
        int f1822b;

        /* renamed from: c  reason: collision with root package name */
        int f1823c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1824d;

        static {
            Covode.recordClassIndex(558);
        }

        public final boolean hasNext() {
            if (this.f1823c < this.f1822b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t = (T) f.this.a(this.f1823c, this.f1821a);
                this.f1823c++;
                this.f1824d = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1824d) {
                int i2 = this.f1823c - 1;
                this.f1823c = i2;
                this.f1822b--;
                this.f1824d = false;
                f.this.a(i2);
                return;
            }
            throw new IllegalStateException();
        }

        a(int i2) {
            this.f1821a = i2;
            this.f1822b = f.this.a();
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f1828a;

        /* renamed from: b  reason: collision with root package name */
        int f1829b = -1;

        /* renamed from: c  reason: collision with root package name */
        boolean f1830c;

        static {
            Covode.recordClassIndex(561);
        }

        public final boolean hasNext() {
            if (this.f1829b < this.f1828a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f1830c) {
                return (K) f.this.a(this.f1829b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f1830c) {
                return (V) f.this.a(this.f1829b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f1829b++;
                this.f1830c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final int hashCode() {
            int hashCode;
            if (this.f1830c) {
                int i2 = 0;
                Object a2 = f.this.a(this.f1829b, 0);
                Object a3 = f.this.a(this.f1829b, 1);
                if (a2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = a2.hashCode();
                }
                if (a3 != null) {
                    i2 = a3.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final void remove() {
            if (this.f1830c) {
                f.this.a(this.f1829b);
                this.f1829b--;
                this.f1828a--;
                this.f1830c = false;
                return;
            }
            throw new IllegalStateException();
        }

        d() {
            this.f1828a = f.this.a() - 1;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f1830c) {
                return (V) f.this.a(this.f1829b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.f1830c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.a(entry.getKey(), f.this.a(this.f1829b, 0)) || !c.a(entry.getValue(), f.this.a(this.f1829b, 1))) {
                    return false;
                }
                return true;
            }
        }
    }

    public final Set<K> d() {
        if (this.f1819c == null) {
            this.f1819c = new c();
        }
        return this.f1819c;
    }

    public final Object[] b(int i2) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i3 = 0; i3 < a2; i3++) {
            objArr[i3] = a(i3, i2);
        }
        return objArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] a(T[] tArr, int i2) {
        int a2 = a();
        if (tArr.length < a2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2));
        }
        for (int i3 = 0; i3 < a2; i3++) {
            tArr[i3] = a(i3, i2);
        }
        if (tArr.length > a2) {
            tArr[a2] = null;
        }
        return tArr;
    }
}
