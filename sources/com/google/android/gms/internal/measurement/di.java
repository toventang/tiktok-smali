package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class di extends AbstractCollection<V> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ da f50776a;

    static {
        Covode.recordClassIndex(31729);
    }

    public final void clear() {
        this.f50776a.clear();
    }

    public final int size() {
        return this.f50776a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        da daVar = this.f50776a;
        Map b2 = daVar.b();
        if (b2 != null) {
            return b2.values().iterator();
        }
        return new db(daVar);
    }

    di(da daVar) {
        this.f50776a = daVar;
    }
}
