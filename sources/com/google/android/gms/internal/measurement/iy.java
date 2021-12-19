package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class iy extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ io f51049a;

    static {
        Covode.recordClassIndex(31891);
    }

    public void clear() {
        this.f51049a.clear();
    }

    public int size() {
        return this.f51049a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new iw(this.f51049a, (byte) 0);
    }

    private iy(io ioVar) {
        this.f51049a = ioVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f51049a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f51049a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f51049a.remove(entry.getKey());
        return true;
    }

    /* synthetic */ iy(io ioVar, byte b2) {
        this(ioVar);
    }
}
