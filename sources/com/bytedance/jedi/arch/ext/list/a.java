package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public interface a<T> {
    static {
        Covode.recordClassIndex(24229);
    }

    b<T> a();

    T a(int i2);

    void a(List<? extends T> list, h.f.a.a<z> aVar);

    /* renamed from: com.bytedance.jedi.arch.ext.list.a$a  reason: collision with other inner class name */
    public static final class C0960a {
        static {
            Covode.recordClassIndex(24230);
        }

        public static <T> T a(a<T> aVar, int i2, boolean z) {
            return aVar.a().a(i2, z);
        }

        public static <T> void a(a<T> aVar, List<? extends T> list, h.f.a.a<z> aVar2) {
            l.c(list, "");
            b<T> a2 = aVar.a();
            l.c(list, "");
            a2.f39422b++;
            int i2 = a2.f39422b;
            List<? extends T> list2 = a2.f39423c;
            if (list == list2) {
                return;
            }
            if (list.isEmpty()) {
                int size = list2.size();
                a2.f39423c = h.a.z.INSTANCE;
                a2.f39424d.b(0, size);
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else if (list2.isEmpty()) {
                a2.f39423c = list;
                a2.f39424d.a(0, list.size());
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                a2.f39425e.f39435a.execute(new b.a(a2, list2, list, i2, aVar2));
            }
        }
    }
}
