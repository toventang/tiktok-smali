package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import java.util.Collection;
import java.util.List;

public final class n {
    static {
        Covode.recordClassIndex(24264);
    }

    public static final class a extends m implements h.f.a.m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39457a = new a();

        static {
            Covode.recordClassIndex(24265);
        }

        a() {
            super(2);
        }

        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            l.c(list, "");
            l.c(list2, "");
            return h.a.n.d((Collection) list, (Iterable) list2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39458a = new b();

        static {
            Covode.recordClassIndex(24266);
        }

        b() {
            super(2);
        }

        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            l.c(obj, "");
            l.c(list, "");
            if (!list.isEmpty()) {
                return list;
            }
            return obj;
        }
    }
}
