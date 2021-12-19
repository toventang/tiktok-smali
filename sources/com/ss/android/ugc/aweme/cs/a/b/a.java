package com.ss.android.ugc.aweme.cs.a.b;

import com.bytedance.covode.number.Covode;
import com.google.c.c.bk;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import h.a.ab;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f78990a = new AtomicBoolean(true);

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f78991b = bk.a();

    static {
        Covode.recordClassIndex(49023);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.a.b.a$a  reason: collision with other inner class name */
    public static final class CallableC1836a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78992a;

        static {
            Covode.recordClassIndex(49024);
        }

        public CallableC1836a(a aVar) {
            this.f78992a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f78992a.a();
        }
    }

    public final Set<String> a() {
        Set<String> b2 = b();
        this.f78991b.clear();
        this.f78991b.addAll(b2);
        this.f78990a.set(false);
        return b2;
    }

    private static Set<String> b() {
        Collection f2;
        List<c> queryAllDraftList = AVServiceImpl.a().draftService().queryAllDraftList(true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
        l.b(queryAllDraftList, "");
        for (c cVar : n.g((Iterable) queryAllDraftList)) {
            aVar.a(cVar);
            c cVar2 = aVar.f79005a;
            if (cVar2 == null) {
                f2 = ab.INSTANCE;
            } else if (!cVar2.a()) {
                f2 = ab.INSTANCE;
            } else {
                f2 = d.f(cVar2);
            }
            linkedHashSet.addAll(f2);
        }
        return linkedHashSet;
    }
}
