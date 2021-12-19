package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

final class jh implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f51062a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jf f51063b;

    static {
        Covode.recordClassIndex(31901);
    }

    public final boolean hasNext() {
        return this.f51062a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f51062a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    jh(jf jfVar) {
        this.f51063b = jfVar;
        this.f51062a = jfVar.f51061a.iterator();
    }
}
