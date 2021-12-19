package h.f.b;

import com.bytedance.covode.number.Covode;
import h.f.a.d;
import h.f.a.h;
import h.f.a.i;
import h.f.a.j;
import h.f.a.k;
import h.f.a.l;
import h.f.a.m;
import h.f.a.n;
import h.f.a.o;
import h.f.a.p;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.a.t;
import h.f.a.u;
import h.f.a.v;
import h.f.a.w;
import h.f.b.a.a;
import h.f.b.a.b;
import h.f.b.a.c;
import h.f.b.a.e;
import h.f.b.a.f;
import h.f.b.a.g;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ad {
    static {
        Covode.recordClassIndex(105210);
    }

    private static <T extends Throwable> T a(T t) {
        return (T) l.a((Throwable) t, ad.class.getName());
    }

    public static boolean c(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof a) || (obj instanceof e)) {
            return true;
        }
        return false;
    }

    public static boolean e(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if (!(obj instanceof a) || (obj instanceof g)) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        if (!(obj instanceof a) || (obj instanceof f)) {
            return true;
        }
        return false;
    }

    private static Iterable i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e2) {
            throw a((Throwable) e2);
        }
    }

    private static Collection j(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            throw a((Throwable) e2);
        }
    }

    private static List k(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            throw a((Throwable) e2);
        }
    }

    private static Set l(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            throw a((Throwable) e2);
        }
    }

    private static Map m(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            throw a((Throwable) e2);
        }
    }

    public static Iterable a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            a(obj, "kotlin.collections.MutableIterable");
        }
        return i(obj);
    }

    public static List d(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            a(obj, "kotlin.collections.MutableList");
        }
        return k(obj);
    }

    public static Set f(Object obj) {
        if ((obj instanceof a) && !(obj instanceof g)) {
            a(obj, "kotlin.collections.MutableSet");
        }
        return l(obj);
    }

    public static Map h(Object obj) {
        if ((obj instanceof a) && !(obj instanceof f)) {
            a(obj, "kotlin.collections.MutableMap");
        }
        return m(obj);
    }

    public static Collection b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            a(obj, "kotlin.collections.MutableCollection");
        }
        return j(obj);
    }

    private static int n(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof h.f.a.a) {
            return 0;
        }
        if (obj instanceof h.f.a.b) {
            return 1;
        }
        if (obj instanceof m) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof h.f.a.c) {
            return 10;
        }
        if (obj instanceof d) {
            return 11;
        }
        if (obj instanceof h.f.a.e) {
            return 12;
        }
        if (obj instanceof h.f.a.f) {
            return 13;
        }
        if (obj instanceof h.f.a.g) {
            return 14;
        }
        if (obj instanceof h) {
            return 15;
        }
        if (obj instanceof i) {
            return 16;
        }
        if (obj instanceof j) {
            return 17;
        }
        if (obj instanceof k) {
            return 18;
        }
        if (obj instanceof l) {
            return 19;
        }
        if (obj instanceof n) {
            return 20;
        }
        if (obj instanceof o) {
            return 21;
        }
        if (obj instanceof p) {
            return 22;
        }
        return -1;
    }

    public static Object b(Object obj, int i2) {
        if (obj != null && !a(obj, i2)) {
            a(obj, "kotlin.jvm.functions.Function".concat(String.valueOf(i2)));
        }
        return obj;
    }

    private static void a(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw a((Throwable) new ClassCastException(name + " cannot be cast to " + str));
    }

    public static boolean a(Object obj, int i2) {
        if (!(obj instanceof h.c) || n(obj) != i2) {
            return false;
        }
        return true;
    }
}
