package com.google.firebase.f;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Set;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f54369a;

    /* renamed from: b  reason: collision with root package name */
    private final d f54370b;

    static {
        Covode.recordClassIndex(33751);
    }

    @Override // com.google.firebase.f.h
    public final String a() {
        if (this.f54370b.a().isEmpty()) {
            return this.f54369a;
        }
        return this.f54369a + ' ' + a(this.f54370b.a());
    }

    private static String a(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.a()).append('/').append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    b(Set<f> set, d dVar) {
        this.f54369a = a(set);
        this.f54370b = dVar;
    }
}
