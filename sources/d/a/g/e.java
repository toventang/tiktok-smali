package d.a.g;

import com.bytedance.covode.number.Covode;
import h.l.h;
import h.m.j;
import h.m.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f156647a = new a((byte) 0);

    static {
        Covode.recordClassIndex(104015);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104016);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(String str, String str2) {
            Object next;
            if (str == null) {
                return -1;
            }
            h findAll$default = l.findAll$default(new l(str2), str, 0, 2, null);
            if (!findAll$default.a().hasNext()) {
                return -1;
            }
            h.f.b.l.d(findAll$default, "");
            Iterator a2 = findAll$default.a();
            if (a2.hasNext()) {
                do {
                    next = a2.next();
                } while (a2.hasNext());
                return ((j) next).a().f158747a;
            }
            throw new NoSuchElementException("Sequence is empty.");
        }
    }
}
