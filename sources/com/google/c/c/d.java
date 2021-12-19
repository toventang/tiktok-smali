package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.an;
import com.google.c.c.aq;
import com.google.c.c.at;
import com.google.c.c.g;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public abstract class d<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> map;
    public transient int totalSize;

    /* access modifiers changed from: package-private */
    public class a extends aq.e<K, Collection<V>> {

        /* renamed from: a  reason: collision with root package name */
        final transient Map<K, Collection<V>> f54011a;

        static {
            Covode.recordClassIndex(33489);
        }

        /* renamed from: com.google.c.c.d$a$a  reason: collision with other inner class name */
        class C1233a extends aq.b<K, Collection<V>> {
            static {
                Covode.recordClassIndex(33490);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.aq.b
            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            C1233a() {
            }

            @Override // com.google.c.c.aq.b
            public final boolean contains(Object obj) {
                return l.a(a.this.f54011a.entrySet(), obj);
            }

            @Override // com.google.c.c.aq.b
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.removeValuesForKey(((Map.Entry) obj).getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f54014a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f54015b;

            static {
                Covode.recordClassIndex(33491);
            }

            public final boolean hasNext() {
                return this.f54014a.hasNext();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                Map.Entry<K, Collection<V>> next = this.f54014a.next();
                this.f54015b = next.getValue();
                return a.this.a(next);
            }

            public final void remove() {
                boolean z;
                if (this.f54015b != null) {
                    z = true;
                } else {
                    z = false;
                }
                k.b(z, "no calls to next() since the last call to remove()");
                this.f54014a.remove();
                d.this.totalSize -= this.f54015b.size();
                this.f54015b.clear();
                this.f54015b = null;
            }

            b() {
                this.f54014a = a.this.f54011a.entrySet().iterator();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.c.aq.e
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new C1233a();
        }

        public int hashCode() {
            return this.f54011a.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.c.c.aq.e
        public Set<K> keySet() {
            return d.this.keySet();
        }

        public int size() {
            return this.f54011a.size();
        }

        public String toString() {
            return this.f54011a.toString();
        }

        public void clear() {
            if (this.f54011a == d.this.map) {
                d.this.clear();
            } else {
                an.c(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return aq.b(this.f54011a, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f54011a.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return aq.a((Object) key, (Object) d.this.a(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object get(Object obj) {
            Collection<V> collection = (Collection) aq.a((Map) this.f54011a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object remove(Object obj) {
            Collection<V> remove = this.f54011a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> b2 = d.this.b();
            b2.addAll(remove);
            d.this.totalSize -= remove.size();
            remove.clear();
            return b2;
        }

        a(Map<K, Collection<V>> map) {
            this.f54011a = map;
        }
    }

    static {
        Covode.recordClassIndex(33486);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> b();

    @Override // com.google.c.c.ar
    public int size() {
        return this.totalSize;
    }

    /* access modifiers changed from: package-private */
    public class j extends d<K, V>.i implements List<V> {
        static {
            Covode.recordClassIndex(33502);
        }

        class a extends d<K, V>.i.a implements ListIterator<V> {
            static {
                Covode.recordClassIndex(33503);
            }

            private ListIterator<V> b() {
                a();
                return (ListIterator) this.f54037a;
            }

            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            public final int previousIndex() {
                return b().previousIndex();
            }

            a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                b().set(v);
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = j.this.isEmpty();
                b().add(v);
                d.this.totalSize++;
                if (isEmpty) {
                    j.this.c();
                }
            }

            public a(int i2) {
                super(((List) j.this.f54033c).listIterator(i2));
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        @Override // java.util.List
        public V get(int i2) {
            a();
            return (V) ((List) this.f54033c).get(i2);
        }

        public int indexOf(Object obj) {
            a();
            return ((List) this.f54033c).indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            a();
            return ((List) this.f54033c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
            a();
            return new a(i2);
        }

        @Override // java.util.List
        public V remove(int i2) {
            a();
            V v = (V) ((List) this.f54033c).remove(i2);
            d dVar = d.this;
            dVar.totalSize--;
            b();
            return v;
        }

        @Override // java.util.List
        public V set(int i2, V v) {
            a();
            return (V) ((List) this.f54033c).set(i2, v);
        }

        @Override // java.util.List
        public void add(int i2, V v) {
            a();
            boolean isEmpty = this.f54033c.isEmpty();
            ((List) this.f54033c).add(i2, v);
            d.this.totalSize++;
            if (isEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
            d<K, V>.i iVar;
            a();
            d dVar = d.this;
            K k2 = this.f54032b;
            List<V> subList = ((List) this.f54033c).subList(i2, i3);
            if (this.f54034d == null) {
                iVar = this;
            } else {
                iVar = this.f54034d;
            }
            return dVar.a(k2, subList, iVar);
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f54033c).addAll(i2, collection);
            if (addAll) {
                int size2 = this.f54033c.size();
                d.this.totalSize += size2 - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        j(K k2, List<V> list, d<K, V>.i iVar) {
            super(k2, list, iVar);
        }
    }

    class c extends aq.c<K, Collection<V>> {
        static {
            Covode.recordClassIndex(33493);
        }

        @Override // com.google.c.c.aq.c
        public void clear() {
            an.c(iterator());
        }

        public int hashCode() {
            return this.f53933d.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.aq.c, java.lang.Iterable
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, V>> it = this.f53933d.entrySet().iterator();
            return new Iterator<K>() {
                /* class com.google.c.c.d.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                Map.Entry<K, Collection<V>> f54023a;

                static {
                    Covode.recordClassIndex(33494);
                }

                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f54023a = entry;
                    return entry.getKey();
                }

                public final void remove() {
                    boolean z;
                    if (this.f54023a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    k.b(z, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.f54023a.getValue();
                    it.remove();
                    d.this.totalSize -= value.size();
                    value.clear();
                    this.f54023a = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f53933d.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f53933d.keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.c.c.aq.c
        public boolean remove(Object obj) {
            V remove = this.f53933d.remove(obj);
            if (remove != null) {
                int size = remove.size();
                remove.clear();
                d.this.totalSize -= size;
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }

        c(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: com.google.c.c.d$d  reason: collision with other inner class name */
    class C1234d extends d<K, V>.g implements NavigableMap<K, Collection<V>> {
        static {
            Covode.recordClassIndex(33495);
        }

        @Override // com.google.c.c.d.g
        public final /* bridge */ /* synthetic */ SortedSet c() {
            return super.keySet();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.d.g
        public final /* bridge */ /* synthetic */ SortedMap d() {
            return super.d();
        }

        @Override // com.google.c.c.d.a, java.util.AbstractMap, java.util.Map, com.google.c.c.d.g, com.google.c.c.aq.e, java.util.SortedMap
        public final /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableSet<K> e() {
            return new e((NavigableMap) super.d());
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.d$d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C1234d(((NavigableMap) super.d()).descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, V> firstEntry = ((NavigableMap) super.d()).firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, V> lastEntry = ((NavigableMap) super.d()).lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        @Override // com.google.c.c.d.g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.c.c.d.g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k2) {
            return (K) ((NavigableMap) super.d()).ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k2) {
            return (K) ((NavigableMap) super.d()).floorKey(k2);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k2) {
            return (K) ((NavigableMap) super.d()).higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k2) {
            return (K) ((NavigableMap) super.d()).lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, V> ceilingEntry = ((NavigableMap) super.d()).ceilingEntry(k2);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, V> floorEntry = ((NavigableMap) super.d()).floorEntry(k2);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, V> higherEntry = ((NavigableMap) super.d()).higherEntry(k2);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, V> lowerEntry = ((NavigableMap) super.d()).lowerEntry(k2);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        private Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> b2 = d.this.b();
            b2.addAll(next.getValue());
            it.remove();
            return aq.a((Object) next.getKey(), (Object) d.this.a(b2));
        }

        C1234d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.c.c.d.g, java.util.NavigableMap, java.util.SortedMap
        public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new C1234d(((NavigableMap) super.d()).headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new C1234d(((NavigableMap) super.d()).tailMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new C1234d(((NavigableMap) super.d()).subMap(k2, z, k3, z2));
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends d<K, V>.h implements NavigableSet<K> {
        static {
            Covode.recordClassIndex(33496);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.d.h
        public final /* bridge */ /* synthetic */ SortedMap a() {
            return super.a();
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) an.b(iterator());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) an.b(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(((NavigableMap) super.a()).descendingMap());
        }

        @Override // java.util.SortedSet, com.google.c.c.d.h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.SortedSet, com.google.c.c.d.h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k2) {
            return (K) ((NavigableMap) super.a()).ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k2) {
            return (K) ((NavigableMap) super.a()).floorKey(k2);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k2) {
            return (K) ((NavigableMap) super.a()).higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k2) {
            return (K) ((NavigableMap) super.a()).lowerKey(k2);
        }

        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.SortedSet, com.google.c.c.d.h, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k2, boolean z) {
            return new e(((NavigableMap) super.a()).headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k2, boolean z) {
            return new e(((NavigableMap) super.a()).tailMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new e(((NavigableMap) super.a()).subMap(k2, z, k3, z2));
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends d<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: d  reason: collision with root package name */
        SortedSet<K> f54029d;

        static {
            Covode.recordClassIndex(33498);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f54011a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SortedSet<K> e() {
            return new h(d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f54029d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b2 = e();
            this.f54029d = b2;
            return b2;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return d().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return d().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new g(d().headMap(k2));
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new g(d().tailMap(k2));
        }

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new g(d().subMap(k2, k3));
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends d<K, V>.c implements SortedSet<K> {
        static {
            Covode.recordClassIndex(33499);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.f53933d;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return a().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return a().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> headSet(K k2) {
            return new h(a().headMap(k2));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> tailSet(K k2) {
            return new h(a().tailMap(k2));
        }

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public SortedSet<K> subSet(K k2, K k3) {
            return new h(a().subMap(k2, k3));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public Set<K> d() {
        return new c(this.map);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Collection<V> e() {
        return new g.c();
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Iterator<V> f() {
        return new d<K, V>.b() {
            /* class com.google.c.c.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33487);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.d.b
            public final V a(K k2, V v) {
                return v;
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final au<K> g() {
        return new at.c(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Iterator<Map.Entry<K, V>> i() {
        return new d<K, V>.b() {
            /* class com.google.c.c.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33488);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.d.b
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return aq.a(obj, obj2);
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public Map<K, Collection<V>> j() {
        return new a(this.map);
    }

    @Override // com.google.c.c.g
    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public class i extends AbstractCollection<V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f54032b;

        /* renamed from: c  reason: collision with root package name */
        public Collection<V> f54033c;

        /* renamed from: d  reason: collision with root package name */
        public final d<K, V>.i f54034d;

        /* renamed from: e  reason: collision with root package name */
        final Collection<V> f54035e;

        static {
            Covode.recordClassIndex(33500);
        }

        /* access modifiers changed from: package-private */
        public class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f54037a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f54038b;

            static {
                Covode.recordClassIndex(33501);
            }

            public boolean hasNext() {
                a();
                return this.f54037a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f54037a.next();
            }

            /* access modifiers changed from: package-private */
            public final void a() {
                i.this.a();
                if (i.this.f54033c != this.f54038b) {
                    throw new ConcurrentModificationException();
                }
            }

            public void remove() {
                this.f54037a.remove();
                d dVar = d.this;
                dVar.totalSize--;
                i.this.b();
            }

            a() {
                this.f54038b = i.this.f54033c;
                this.f54037a = d.iteratorOrListIterator(i.this.f54033c);
            }

            a(Iterator<V> it) {
                this.f54038b = i.this.f54033c;
                this.f54037a = it;
            }
        }

        public int hashCode() {
            a();
            return this.f54033c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            a();
            return new a();
        }

        public int size() {
            a();
            return this.f54033c.size();
        }

        public String toString() {
            a();
            return this.f54033c.toString();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            d<K, V>.i iVar = this;
            while (true) {
                d<K, V>.i iVar2 = iVar.f54034d;
                if (iVar2 == null) {
                    break;
                }
                iVar = iVar2;
            }
            if (iVar.f54033c.isEmpty()) {
                d.this.map.remove(iVar.f54032b);
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            d<K, V>.i iVar = this;
            while (true) {
                d<K, V>.i iVar2 = iVar.f54034d;
                if (iVar2 != null) {
                    iVar = iVar2;
                } else {
                    d.this.map.put(iVar.f54032b, iVar.f54033c);
                    return;
                }
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f54033c.clear();
                d.this.totalSize -= size;
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            Collection<V> collection;
            d<K, V>.i iVar = this.f54034d;
            if (iVar != null) {
                iVar.a();
                if (this.f54034d.f54033c != this.f54035e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f54033c.isEmpty() && (collection = d.this.map.get(this.f54032b)) != null) {
                this.f54033c = collection;
            }
        }

        public boolean contains(Object obj) {
            a();
            return this.f54033c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f54033c.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f54033c.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            a();
            boolean isEmpty = this.f54033c.isEmpty();
            boolean add = this.f54033c.add(v);
            if (add) {
                d.this.totalSize++;
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        public boolean remove(Object obj) {
            a();
            boolean remove = this.f54033c.remove(obj);
            if (remove) {
                d dVar = d.this;
                dVar.totalSize--;
                b();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f54033c.addAll(collection);
            if (addAll) {
                int size2 = this.f54033c.size();
                d.this.totalSize += size2 - size;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f54033c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f54033c.size();
                d.this.totalSize += size2 - size;
                b();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            k.a(collection);
            int size = size();
            boolean retainAll = this.f54033c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f54033c.size();
                d.this.totalSize += size2 - size;
                b();
            }
            return retainAll;
        }

        i(K k2, Collection<V> collection, d<K, V>.i iVar) {
            Collection<V> collection2;
            this.f54032b = k2;
            this.f54033c = collection;
            this.f54034d = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f54033c;
            }
            this.f54035e = collection2;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Collection<V>, java.util.Collection<E> */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    /* access modifiers changed from: package-private */
    public Collection<V> c() {
        return (Collection<E>) a(b());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Collection<Map.Entry<K, V>> h() {
        if (this instanceof bj) {
            return new g.b();
        }
        return new g.a();
    }

    abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f54017b;

        /* renamed from: c  reason: collision with root package name */
        K f54018c = null;

        /* renamed from: d  reason: collision with root package name */
        Collection<V> f54019d = null;

        /* renamed from: e  reason: collision with root package name */
        Iterator<V> f54020e = an.b.INSTANCE;

        static {
            Covode.recordClassIndex(33492);
        }

        /* access modifiers changed from: package-private */
        public abstract T a(K k2, V v);

        public boolean hasNext() {
            if (this.f54017b.hasNext() || this.f54020e.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            this.f54020e.remove();
            if (this.f54019d.isEmpty()) {
                this.f54017b.remove();
            }
            d dVar = d.this;
            dVar.totalSize--;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f54020e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f54017b.next();
                this.f54018c = next.getKey();
                Collection<V> value = next.getValue();
                this.f54019d = value;
                this.f54020e = value.iterator();
            }
            return a(this.f54018c, this.f54020e.next());
        }

        b() {
            this.f54017b = d.this.map.entrySet().iterator();
        }
    }

    @Override // com.google.c.c.ar
    public void clear() {
        for (Collection<V> collection : this.map.values()) {
            collection.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.c.c.ar
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    protected d(Map<K, Collection<V>> map2) {
        k.a(map2.isEmpty());
        this.map = map2;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.c.c.ar
    public Collection<V> get(K k2) {
        Collection<V> collection = this.map.get(k2);
        if (collection == null) {
            collection = b();
        }
        return a(k2, collection);
    }

    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) aq.c(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    @Override // com.google.c.c.ar
    public Collection<V> removeAll(Object obj) {
        Collection<V> remove = this.map.remove(obj);
        if (remove == null) {
            return c();
        }
        Collection b2 = b();
        b2.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return (Collection<E>) a(b2);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> a(K k2, Collection<V> collection) {
        return new i(k2, collection, null);
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public boolean put(K k2, V v) {
        Collection<V> collection = this.map.get(k2);
        if (collection == null) {
            Collection<V> b2 = b();
            if (b2.add(v)) {
                this.totalSize++;
                this.map.put(k2, b2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: java.util.Collection<E>, java.util.Collection<V> */
    @Override // com.google.c.c.g
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> collection = this.map.get(k2);
        if (collection == null) {
            collection = b();
            this.map.put(k2, collection);
        }
        Collection b2 = b();
        b2.addAll(collection);
        this.totalSize -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add((V) it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<E>) a(b2);
    }

    /* access modifiers changed from: package-private */
    public final List<V> a(K k2, List<V> list, d<K, V>.i iVar) {
        if (list instanceof RandomAccess) {
            return new f(k2, list, iVar);
        }
        return new j(k2, list, iVar);
    }

    /* access modifiers changed from: package-private */
    public class f extends d<K, V>.j implements RandomAccess {
        static {
            Covode.recordClassIndex(33497);
        }

        f(K k2, List<V> list, d<K, V>.i iVar) {
            super(k2, list, iVar);
        }
    }
}
