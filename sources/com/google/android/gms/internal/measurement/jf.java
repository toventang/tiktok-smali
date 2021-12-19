package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class jf extends AbstractList<String> implements he, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    final he f51061a;

    static {
        Covode.recordClassIndex(31899);
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final he e() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final List<?> d() {
        return this.f51061a.d();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new jh(this);
    }

    public final int size() {
        return this.f51061a.size();
    }

    public jf(he heVar) {
        this.f51061a = heVar;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final void a(fe feVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final Object b(int i2) {
        return this.f51061a.b(i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i2) {
        return this.f51061a.get(i2);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i2) {
        return new ji(this, i2);
    }
}
