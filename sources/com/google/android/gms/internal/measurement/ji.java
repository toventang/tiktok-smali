package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

final class ji implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f51064a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f51065b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ jf f51066c;

    static {
        Covode.recordClassIndex(31902);
    }

    public final boolean hasNext() {
        return this.f51064a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f51064a.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f51064a.next();
    }

    public final int nextIndex() {
        return this.f51064a.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f51064a.previous();
    }

    public final int previousIndex() {
        return this.f51064a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    ji(jf jfVar, int i2) {
        this.f51066c = jfVar;
        this.f51065b = i2;
        this.f51064a = jfVar.f51061a.listIterator(i2);
    }
}
