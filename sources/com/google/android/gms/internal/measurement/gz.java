package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class gz<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f50963a;

    static {
        Covode.recordClassIndex(31838);
    }

    public final boolean hasNext() {
        return this.f50963a.hasNext();
    }

    public final void remove() {
        this.f50963a.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f50963a.next();
        if (next.getValue() instanceof gy) {
            return new ha(next, (byte) 0);
        }
        return next;
    }

    public gz(Iterator<Map.Entry<K, Object>> it) {
        this.f50963a = it;
    }
}
