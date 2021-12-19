package com.bytedance.framwork.core.b.e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b {

    public interface a<A, B> {
        static {
            Covode.recordClassIndex(17168);
        }

        boolean a(A a2, B b2);
    }

    static {
        Covode.recordClassIndex(17167);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static <L, O> boolean a(Collection<L> collection, O o, a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
