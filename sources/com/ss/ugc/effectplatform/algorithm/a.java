package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b;
import com.ss.ugc.effectplatform.a.c;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.f;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.aj;
import h.f.b.l;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.Collection;

public final class a implements com.ss.ugc.effectplatform.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.task.a.a f153444a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153445b;

    /* renamed from: c  reason: collision with root package name */
    private final aa f153446c;

    /* renamed from: d  reason: collision with root package name */
    private final f f153447d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.b.a f153448e;

    static {
        Covode.recordClassIndex(102320);
    }

    @Override // com.ss.ugc.effectplatform.a.a
    public final aj<com.ss.ugc.effectplatform.task.c.a> a(b bVar) {
        l.c(bVar, "");
        return new com.ss.ugc.effectplatform.task.a.a(new c(this.f153445b).a(bVar), bVar, this.f153446c, this.f153447d, this.f153448e, this.f153445b);
    }

    public final Collection<ModelInfo> a(String[] strArr) {
        ArrayList arrayList;
        f a2 = aa.a.a().a(0);
        if (a2 == null) {
            return new ArrayList();
        }
        try {
            com.ss.ugc.effectplatform.task.a.a aVar = this.f153444a;
            l.c(a2, "");
            arrayList = q.m223constructorimpl(new com.ss.ugc.effectplatform.task.a.c(aVar.f153701d, aVar.f153698a, aVar.f153699b, aVar.f153700c, null, 0, 112).a(0, strArr, a2));
        } catch (Throwable th) {
            arrayList = q.m223constructorimpl(r.a(th));
        }
        ArrayList arrayList2 = new ArrayList();
        if (q.m228isFailureimpl(arrayList)) {
            arrayList = arrayList2;
        }
        return (Collection) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0090, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.String> r60, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r61) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.algorithm.a.a(java.util.List, java.util.Map):void");
    }

    public a(com.ss.ugc.effectplatform.a aVar, aa aaVar, f fVar, com.ss.ugc.effectplatform.b.a aVar2) {
        l.c(aVar, "");
        l.c(fVar, "");
        l.c(aVar2, "");
        this.f153445b = aVar;
        this.f153446c = aaVar;
        this.f153447d = fVar;
        this.f153448e = aVar2;
        this.f153444a = new com.ss.ugc.effectplatform.task.a.a(null, null, aaVar, fVar, aVar2, aVar);
    }
}
