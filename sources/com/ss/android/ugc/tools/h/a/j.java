package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import h.p;
import java.util.List;

public interface j<DATA, EXTRA> {
    static {
        Covode.recordClassIndex(98271);
    }

    ab<p<List<DATA>, EXTRA>> a();

    ab<List<DATA>> b();

    public static final class a {
        static {
            Covode.recordClassIndex(98272);
        }

        /* renamed from: com.ss.android.ugc.tools.h.a.j$a$a  reason: collision with other inner class name */
        static final class C4028a<T, R> implements g<p<? extends List<? extends DATA>, ? extends EXTRA>, List<? extends DATA>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C4028a f149213a = new C4028a();

            static {
                Covode.recordClassIndex(98273);
            }

            C4028a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                p pVar = (p) obj;
                l.d(pVar, "");
                return pVar.component1();
            }
        }

        public static <DATA, EXTRA> ab<List<DATA>> a(j<DATA, EXTRA> jVar) {
            ab<R> c2 = jVar.a().c(C4028a.f149213a);
            l.b(c2, "");
            return c2;
        }
    }
}
