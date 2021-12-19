package com.bytedance.b.b.a.e;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile c f25972a = new c();

    /* renamed from: b  reason: collision with root package name */
    public Set<d> f25973b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public b f25974c;

    /* renamed from: d  reason: collision with root package name */
    public int f25975d = 80;

    /* renamed from: e  reason: collision with root package name */
    public int f25976e = 5;

    static {
        Covode.recordClassIndex(15137);
    }

    public final synchronized void a(b bVar) {
        this.f25974c = bVar;
    }

    public final synchronized void a(d dVar) {
        if (dVar != null) {
            this.f25973b.add(dVar);
        }
    }
}
