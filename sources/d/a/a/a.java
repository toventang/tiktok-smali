package d.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.e;
import h.f.b.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class a<V> implements e, List<V> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ List f156541a;

    static {
        Covode.recordClassIndex(103932);
    }

    public /* synthetic */ a() {
        this(false);
    }

    @Override // java.util.List
    public final void add(int i2, V v) {
        this.f156541a.add(i2, v);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(V v) {
        return this.f156541a.add(v);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends V> collection) {
        l.c(collection, "");
        return this.f156541a.addAll(i2, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        l.c(collection, "");
        return this.f156541a.addAll(collection);
    }

    public final void clear() {
        this.f156541a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f156541a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        l.c(collection, "");
        return this.f156541a.containsAll(collection);
    }

    @Override // java.util.List
    public final V get(int i2) {
        return (V) this.f156541a.get(i2);
    }

    public final int indexOf(Object obj) {
        return this.f156541a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f156541a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.f156541a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f156541a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        return this.f156541a.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i2) {
        return this.f156541a.listIterator(i2);
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        return this.f156541a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.c(collection, "");
        return this.f156541a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.c(collection, "");
        return this.f156541a.retainAll(collection);
    }

    @Override // java.util.List
    public final V set(int i2, V v) {
        return (V) this.f156541a.set(i2, v);
    }

    @Override // java.util.List
    public final List<V> subList(int i2, int i3) {
        return this.f156541a.subList(i2, i3);
    }

    public final Object[] toArray() {
        return f.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f.a(this, tArr);
    }

    public final /* bridge */ int size() {
        return this.f156541a.size();
    }

    @Override // java.util.List
    public final /* bridge */ V remove(int i2) {
        return (V) this.f156541a.remove(i2);
    }

    public a(boolean z) {
        List arrayList;
        if (z) {
            arrayList = Collections.synchronizedList(new ArrayList());
            l.a((Object) arrayList, "");
        } else {
            arrayList = new ArrayList();
        }
        this.f156541a = arrayList;
    }
}
