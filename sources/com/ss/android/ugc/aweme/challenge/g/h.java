package com.ss.android.ugc.aweme.challenge.g;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f69985a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(43148);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(List<T> list, List<? extends T> list2, m<? super T, ? super T, Boolean> mVar) {
        l.d(list, "");
        l.d(list2, "");
        l.d(mVar, "");
        if (!b.a((Collection) list2)) {
            Iterator<? extends T> it = list2.iterator();
            while (it.hasNext()) {
                Object obj = (Object) it.next();
                if (obj != 0) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object obj2 = (Object) it2.next();
                        if (mVar.invoke(obj2, obj).booleanValue()) {
                            if (obj2 != 0) {
                            }
                        }
                    }
                    list.add(obj);
                }
            }
        }
    }
}
