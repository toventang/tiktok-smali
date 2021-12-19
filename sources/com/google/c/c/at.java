package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.q;
import com.google.c.c.au;
import com.google.c.c.av;
import com.google.c.c.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

public final class at {
    static {
        Covode.recordClassIndex(33436);
    }

    /* access modifiers changed from: package-private */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33438);
        }

        /* access modifiers changed from: package-private */
        public abstract ar<K, V> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public int size() {
            return a().size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }
    }

    static class c<K, V> extends h<K> {

        /* renamed from: a  reason: collision with root package name */
        final ar<K, V> f53946a;

        static {
            Covode.recordClassIndex(33439);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.h
        public final Iterator<K> a() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.c.c.h
        public final void clear() {
            this.f53946a.clear();
        }

        @Override // com.google.c.c.au, com.google.c.c.h
        public final Set<K> elementSet() {
            return this.f53946a.keySet();
        }

        @Override // com.google.c.c.au
        public final int size() {
            return this.f53946a.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.h
        public final int c() {
            return this.f53946a.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return aq.a(this.f53946a.entries().iterator());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.h
        public final Iterator<au.a<K>> b() {
            return new bo<Map.Entry<K, Collection<V>>, au.a<K>>(this.f53946a.asMap().entrySet().iterator()) {
                /* class com.google.c.c.at.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33440);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.bo
                public final /* synthetic */ Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new av.a<K>() {
                        /* class com.google.c.c.at.c.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(33441);
                        }

                        @Override // com.google.c.c.au.a
                        public final K a() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.c.c.au.a
                        public final int b() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        c(ar<K, V> arVar) {
            this.f53946a = arVar;
        }

        @Override // com.google.c.c.au, com.google.c.c.h
        public final boolean contains(Object obj) {
            return this.f53946a.containsKey(obj);
        }

        @Override // com.google.c.c.au
        public final int count(Object obj) {
            Collection collection = (Collection) aq.a((Map) this.f53946a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.c.c.au, com.google.c.c.h
        public final int remove(Object obj, int i2) {
            k.a(i2, "occurrences");
            if (i2 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) aq.a((Map) this.f53946a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i2 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i3 = 0; i3 < i2; i3++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }
    }

    static class a<K, V> extends c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        transient q<? extends List<V>> f53945a;

        static {
            Covode.recordClassIndex(33437);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.c.c
        /* renamed from: a */
        public final List<V> b() {
            return (List) this.f53945a.b();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.d, com.google.c.c.g
        public final Set<K> d() {
            if (this.map instanceof NavigableMap) {
                return new d.e((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new d.h((SortedMap) this.map);
            }
            return new d.c(this.map);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.d, com.google.c.c.g
        public final Map<K, Collection<V>> j() {
            if (this.map instanceof NavigableMap) {
                return new d.C1234d((NavigableMap) this.map);
            }
            if (this.map instanceof SortedMap) {
                return new d.g((SortedMap) this.map);
            }
            return new d.a(this.map);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f53945a);
            objectOutputStream.writeObject(this.map);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f53945a = (q) objectInputStream.readObject();
            Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
            this.map = map;
            this.totalSize = 0;
            for (Collection<V> collection : map.values()) {
                k.a(!collection.isEmpty());
                this.totalSize += collection.size();
            }
        }

        a(Map<K, Collection<V>> map, q<? extends List<V>> qVar) {
            super(map);
            this.f53945a = (q) k.a(qVar);
        }
    }

    public static <K, V> ao<K, V> a(Map<K, Collection<V>> map, q<? extends List<V>> qVar) {
        return new a(map, qVar);
    }
}
