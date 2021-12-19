package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class d<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<E, Object> f26927a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Object f26928b = new Object();

    static {
        Covode.recordClassIndex(15894);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.f26927a.size());
        for (E e2 : this.f26927a.keySet()) {
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList.iterator();
    }

    public final void a(E e2) {
        if (e2 == null) {
            this.f26927a.size();
        } else {
            this.f26927a.put(e2, this.f26928b);
        }
    }

    public final void b(E e2) {
        if (e2 == null) {
            this.f26927a.size();
        } else {
            this.f26927a.remove(e2);
        }
    }
}
