package com.facebook.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.b.a;
import com.facebook.internal.b.c;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f48588a;

    /* renamed from: c  reason: collision with root package name */
    private static final Integer f48589c = 100;

    /* renamed from: b  reason: collision with root package name */
    private Queue<a> f48590b = new LinkedList();

    @Override // com.facebook.internal.b.c
    public final boolean a() {
        return this.f48590b.isEmpty();
    }

    static {
        Covode.recordClassIndex(29292);
    }

    private d() {
    }

    @Override // com.facebook.internal.b.c
    public final a b() {
        return this.f48590b.poll();
    }

    public static synchronized d c() {
        d dVar;
        synchronized (d.class) {
            MethodCollector.i(476);
            if (f48588a == null) {
                f48588a = new d();
            }
            dVar = f48588a;
            MethodCollector.o(476);
        }
        return dVar;
    }

    @Override // com.facebook.internal.b.c
    public final boolean a(Collection<? extends a> collection) {
        if (collection != null) {
            this.f48590b.addAll(collection);
        }
        if (this.f48590b.size() >= f48589c.intValue()) {
            return true;
        }
        return false;
    }
}
