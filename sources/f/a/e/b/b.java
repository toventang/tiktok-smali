package f.a.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.d;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d<Object, Object> f157208a = new a();

    static final class a implements d<Object, Object> {
        static {
            Covode.recordClassIndex(104427);
        }

        a() {
        }

        @Override // f.a.d.d
        public final boolean a(Object obj, Object obj2) {
            return b.a(obj, obj2);
        }
    }

    static {
        Covode.recordClassIndex(104426);
    }

    public static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static int a(int i2, String str) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }
}
