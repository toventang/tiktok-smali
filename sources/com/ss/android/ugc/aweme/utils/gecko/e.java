package com.ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f143002a = new LinkedHashSet();

    static {
        Covode.recordClassIndex(93586);
    }

    public final synchronized Set<T> a() {
        LinkedHashSet linkedHashSet;
        MethodCollector.i(9927);
        linkedHashSet = new LinkedHashSet(this.f143002a);
        MethodCollector.o(9927);
        return linkedHashSet;
    }

    public final synchronized void a(Collection<? extends T> collection) {
        MethodCollector.i(9928);
        l.d(collection, "");
        this.f143002a.addAll(collection);
        MethodCollector.o(9928);
    }
}
