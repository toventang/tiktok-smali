package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentLinkedDeque<p<Integer, q>> f121188a = new ConcurrentLinkedDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public static final am f121189b = new am();

    private am() {
    }

    static {
        Covode.recordClassIndex(78949);
    }

    public static q a() {
        p<Integer, q> peekFirst = f121188a.peekFirst();
        if (peekFirst == null || peekFirst.getSecond() == null) {
            return null;
        }
        return peekFirst.getSecond();
    }

    public static q a(int i2) {
        ConcurrentLinkedDeque<p<Integer, q>> concurrentLinkedDeque = f121188a;
        ArrayList arrayList = new ArrayList();
        for (T t : concurrentLinkedDeque) {
            T t2 = t;
            if (!(t2 == null || i2 != ((Number) t2.getFirst()).intValue() || t2.getSecond() == null)) {
                arrayList.add(t);
            }
        }
        p pVar = (p) n.h((List) arrayList);
        if (pVar != null) {
            return (q) pVar.getSecond();
        }
        return null;
    }

    public static void a(int i2, q qVar) {
        l.d(qVar, "");
        ConcurrentLinkedDeque<p<Integer, q>> concurrentLinkedDeque = f121188a;
        p<Integer, q> peekFirst = concurrentLinkedDeque.peekFirst();
        if (!(peekFirst == null || i2 != peekFirst.getFirst().intValue() || peekFirst.getSecond() == null)) {
            concurrentLinkedDeque.removeFirst();
        }
        concurrentLinkedDeque.addFirst(new p<>(Integer.valueOf(i2), qVar));
    }
}
