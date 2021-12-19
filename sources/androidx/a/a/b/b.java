package androidx.a.a.b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f795b;

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f796c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f797d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public int f798e = 0;

    /* access modifiers changed from: package-private */
    public interface f<K, V> {
        static {
            Covode.recordClassIndex(212);
        }

        void a_(c<K, V> cVar);
    }

    static {
        Covode.recordClassIndex(206);
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f799a;

        /* renamed from: b  reason: collision with root package name */
        final V f800b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f801c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f802d;

        static {
            Covode.recordClassIndex(209);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f799a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f800b;
        }

        public final int hashCode() {
            return this.f799a.hashCode() ^ this.f800b.hashCode();
        }

        public final String toString() {
            return ((Object) this.f799a) + "=" + ((Object) this.f800b);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f799a.equals(cVar.f799a) || !this.f800b.equals(cVar.f800b)) {
                return false;
            }
            return true;
        }

        c(K k2, V v) {
            this.f799a = k2;
            this.f800b = v;
        }
    }

    static abstract class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f806a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f807b;

        static {
            Covode.recordClassIndex(211);
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> a(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        public boolean hasNext() {
            if (this.f807b != null) {
                return true;
            }
            return false;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f807b;
            c<K, V> cVar2 = this.f806a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return a(cVar);
        }

        @Override // java.util.Iterator
        public /* synthetic */ Object next() {
            c<K, V> cVar = this.f807b;
            this.f807b = a();
            return cVar;
        }

        @Override // androidx.a.a.b.b.f
        public final void a_(c<K, V> cVar) {
            if (this.f806a == cVar && cVar == this.f807b) {
                this.f807b = null;
                this.f806a = null;
            }
            c<K, V> cVar2 = this.f806a;
            if (cVar2 == cVar) {
                this.f806a = b(cVar2);
            }
            if (this.f807b == cVar) {
                this.f807b = a();
            }
        }

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f806a = cVar2;
            this.f807b = cVar;
        }
    }

    public class d implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f804b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f805c = true;

        static {
            Covode.recordClassIndex(210);
        }

        public final boolean hasNext() {
            if (!this.f805c) {
                c<K, V> cVar = this.f804b;
                if (cVar == null || cVar.f801c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f795b != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            c<K, V> cVar;
            if (this.f805c) {
                this.f805c = false;
                cVar = b.this.f795b;
            } else {
                c<K, V> cVar2 = this.f804b;
                if (cVar2 != null) {
                    cVar = cVar2.f801c;
                } else {
                    cVar = null;
                }
            }
            this.f804b = cVar;
            return cVar;
        }

        d() {
        }

        @Override // androidx.a.a.b.b.f
        public final void a_(c<K, V> cVar) {
            boolean z;
            c<K, V> cVar2 = this.f804b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f802d;
                this.f804b = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f805c = z;
            }
        }
    }

    public final b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.f797d.put(dVar, false);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f795b, this.f796c);
        this.f797d.put(aVar, false);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public static class a<K, V> extends e<K, V> {
        static {
            Covode.recordClassIndex(207);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.a.a.b.b.e
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.f801c;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.a.a.b.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f802d;
        }

        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: androidx.a.a.b.b$b  reason: collision with other inner class name */
    public static class C0016b<K, V> extends e<K, V> {
        static {
            Covode.recordClassIndex(208);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.a.a.b.b.e
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.f802d;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.a.a.b.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f801c;
        }

        public C0016b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k2) {
        c<K, V> cVar = this.f795b;
        while (cVar != null && !cVar.f799a.equals(k2)) {
            cVar = cVar.f801c;
        }
        return cVar;
    }

    public V b(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f798e--;
        if (!this.f797d.isEmpty()) {
            for (f<K, V> fVar : this.f797d.keySet()) {
                fVar.a_(a2);
            }
        }
        if (a2.f802d != null) {
            a2.f802d.f801c = a2.f801c;
        } else {
            this.f795b = a2.f801c;
        }
        if (a2.f801c != null) {
            a2.f801c.f802d = a2.f802d;
        } else {
            this.f796c = a2.f802d;
        }
        a2.f801c = null;
        a2.f802d = null;
        return a2.f800b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f798e != bVar.f798e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null) {
                if (next2 == null) {
                }
            } else if (!next.equals(next2)) {
            }
            return false;
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final c<K, V> b(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f798e++;
        c<K, V> cVar2 = this.f796c;
        if (cVar2 == null) {
            this.f795b = cVar;
            this.f796c = cVar;
            return cVar;
        }
        cVar2.f801c = cVar;
        cVar.f802d = this.f796c;
        this.f796c = cVar;
        return cVar;
    }

    public V a(K k2, V v) {
        c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f800b;
        }
        b(k2, v);
        return null;
    }
}
