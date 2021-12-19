package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.i;
import com.google.c.a.k;
import com.google.c.c.bk;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class aq {
    static {
        Covode.recordClassIndex(33416);
    }

    static abstract class b<K, V> extends bk.a<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33422);
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, com.google.c.c.bk.a, java.util.Collection, java.util.AbstractSet, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) k.a(collection));
            } catch (UnsupportedOperationException unused) {
                return bk.a((Set<?>) this, collection.iterator());
            }
        }

        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object a2 = aq.a((Map) a(), key);
                if (!i.a(a2, entry.getValue()) || (a2 == null && !a().containsKey(key))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, com.google.c.c.bk.a, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            int i2;
            try {
                return super.retainAll((Collection) k.a(collection));
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    k.a(size, "expectedSize");
                    i2 = size + 1;
                } else if (size < 1073741824) {
                    i2 = (int) ((((float) size) / 0.75f) + 1.0f);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i2);
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSet);
            }
        }
    }

    static abstract class e<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f53935a;

        /* renamed from: b  reason: collision with root package name */
        private transient Set<K> f53936b;

        /* renamed from: c  reason: collision with root package name */
        private transient Collection<V> f53937c;

        static {
            Covode.recordClassIndex(33425);
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        e() {
        }

        /* access modifiers changed from: package-private */
        public Set<K> e() {
            return new c(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f53935a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a2 = a();
            this.f53935a = a2;
            return a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f53936b;
            if (set != null) {
                return set;
            }
            Set<K> e2 = e();
            this.f53936b = e2;
            return e2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f53937c;
            if (collection != null) {
                return collection;
            }
            d dVar = new d(this);
            this.f53937c = dVar;
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c<K, V> extends bk.a<K> {

        /* renamed from: d  reason: collision with root package name */
        final Map<K, V> f53933d;

        static {
            Covode.recordClassIndex(33423);
        }

        public void clear() {
            this.f53933d.clear();
        }

        public boolean isEmpty() {
            return this.f53933d.isEmpty();
        }

        public int size() {
            return this.f53933d.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return aq.a(this.f53933d.entrySet().iterator());
        }

        public boolean contains(Object obj) {
            return this.f53933d.containsKey(obj);
        }

        c(Map<K, V> map) {
            this.f53933d = (Map) k.a(map);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            this.f53933d.remove(obj);
            return true;
        }
    }

    static class d<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<K, V> f53934a;

        static {
            Covode.recordClassIndex(33424);
        }

        public final void clear() {
            this.f53934a.clear();
        }

        public final boolean isEmpty() {
            return this.f53934a.isEmpty();
        }

        public final int size() {
            return this.f53934a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return aq.b(this.f53934a.entrySet().iterator());
        }

        public final boolean contains(Object obj) {
            return this.f53934a.containsValue(obj);
        }

        d(Map<K, V> map) {
            this.f53934a = (Map) k.a(map);
        }

        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f53934a.entrySet()) {
                    if (i.a(obj, entry.getValue())) {
                        this.f53934a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) k.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f53934a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f53934a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) k.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f53934a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f53934a.keySet().retainAll(hashSet);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum a implements f<Map.Entry<?, ?>, Object> {
        KEY {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.f
            public final /* synthetic */ Object a(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.f
            public final /* synthetic */ Object a(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        static {
            Covode.recordClassIndex(33419);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new bo<Map.Entry<K, V>, K>(it) {
            /* class com.google.c.c.aq.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33417);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.bo
            public final /* synthetic */ Object a(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new bo<Map.Entry<K, V>, V>(it) {
            /* class com.google.c.c.aq.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33418);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.bo
            public final /* synthetic */ Object a(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };
    }

    static <V> V a(Map<?, V> map, Object obj) {
        k.a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        k.a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        k.a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> Map.Entry<K, V> a(K k2, V v) {
        return new y(k2, v);
    }
}
