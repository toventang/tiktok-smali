package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class n implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f52034a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzan f52035b;

    static {
        Covode.recordClassIndex(32374);
    }

    public final boolean hasNext() {
        return this.f52034a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f52034a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    n(zzan zzan) {
        this.f52035b = zzan;
        this.f52034a = zzan.f52060a.keySet().iterator();
    }
}
