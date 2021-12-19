package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class iq implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f51036a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f51037b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ io f51038c;

    static {
        Covode.recordClassIndex(31883);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f51037b == null) {
            this.f51037b = this.f51038c.f51028d.entrySet().iterator();
        }
        return this.f51037b;
    }

    public final boolean hasNext() {
        int i2 = this.f51036a;
        if ((i2 <= 0 || i2 > this.f51038c.f51025a.size()) && !a().hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return a().next();
        }
        List<ix> list = this.f51038c.f51025a;
        int i2 = this.f51036a - 1;
        this.f51036a = i2;
        return list.get(i2);
    }

    private iq(io ioVar) {
        this.f51038c = ioVar;
        this.f51036a = ioVar.f51025a.size();
    }

    /* synthetic */ iq(io ioVar, byte b2) {
        this(ioVar);
    }
}
