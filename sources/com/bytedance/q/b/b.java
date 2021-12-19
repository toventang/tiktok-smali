package com.bytedance.q.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f42368a;

    static {
        Covode.recordClassIndex(25892);
    }

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f42368a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    @Override // com.bytedance.q.b.a
    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.q.b.a
    public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.q.b.a
    public final <T> void c(com.bytedance.q.b<T> bVar, d dVar) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.q.b.a
    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.q.b.a
    public final <T> void b(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.q.b.a
    public final <T> void c(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f42368a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th);
            }
        }
    }
}
