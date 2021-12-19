package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class dg extends AbstractSet<K> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ da f50775a;

    static {
        Covode.recordClassIndex(31727);
    }

    public final void clear() {
        this.f50775a.clear();
    }

    public final int size() {
        return this.f50775a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<K> iterator() {
        da daVar = this.f50775a;
        Map b2 = daVar.b();
        if (b2 != null) {
            return b2.keySet().iterator();
        }
        return new cz(daVar);
    }

    dg(da daVar) {
        this.f50775a = daVar;
    }

    public final boolean contains(Object obj) {
        return this.f50775a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        Map b2 = this.f50775a.b();
        if (b2 != null) {
            return b2.keySet().remove(obj);
        }
        if (this.f50775a.b(obj) != da.f50755a) {
            return true;
        }
        return false;
    }
}
