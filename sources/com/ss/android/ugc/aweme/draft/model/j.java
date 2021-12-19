package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import java.util.Collection;
import java.util.HashSet;

public final class j<T> extends HashSet<T> {
    private final b<T, Boolean> filter;

    static {
        Covode.recordClassIndex(51882);
    }

    public j() {
        this(null, 1, null);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(b<? super T, Boolean> bVar) {
        this.filter = bVar;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        b<T, Boolean> bVar = this.filter;
        if (bVar == null || bVar.invoke(t).booleanValue()) {
            return super.add(t);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends T> collection) {
        l.d(collection, "");
        for (T t : collection) {
            add(t);
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(b bVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bVar);
    }
}
