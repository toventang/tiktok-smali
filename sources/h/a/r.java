package h.a;

import com.bytedance.covode.number.Covode;
import java.util.Enumeration;
import java.util.Iterator;

public class r extends q {
    static {
        Covode.recordClassIndex(105078);
    }

    public static final class a implements h.f.b.a.a, Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Enumeration f158652a;

        static {
            Covode.recordClassIndex(105079);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f158652a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.f158652a.nextElement();
        }

        public a(Enumeration<T> enumeration) {
            this.f158652a = enumeration;
        }
    }
}
