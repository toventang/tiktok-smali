package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class ip {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f51032a = a();

    /* renamed from: b  reason: collision with root package name */
    static final je<?, ?> f51033b = a(false);

    /* renamed from: c  reason: collision with root package name */
    static final je<?, ?> f51034c = a(true);

    /* renamed from: d  reason: collision with root package name */
    static final je<?, ?> f51035d = new jg();

    public static void a(int i2, List<Double> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.g(i2, list, z);
        }
    }

    public static void a(int i2, List<String> list, jw jwVar) {
        if (list != null && !list.isEmpty()) {
            jwVar.a(i2, list);
        }
    }

    public static void a(int i2, List<?> list, jw jwVar, in inVar) {
        if (list != null && !list.isEmpty()) {
            jwVar.a(i2, list, inVar);
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T, FT extends gd<FT>> void a(ga<FT> gaVar, T t, T t2) {
        gb<FT> a2 = gaVar.a((Object) t2);
        if (!a2.f50902a.isEmpty()) {
            gaVar.b((Object) t).a(a2);
        }
    }

    static <T, UT, UB> void a(je<UT, UB> jeVar, T t, T t2) {
        jeVar.a(t, jeVar.c(jeVar.b(t), jeVar.b(t2)));
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(31882);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    static int c(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(ft.e(hgVar.b(i3)));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(ft.e(list.get(i3).longValue()));
                i3++;
            }
        }
        return i2;
    }

    static int d(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.l(gnVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.l(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int e(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.l(gnVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.l(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int f(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.m(gnVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.m(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int g(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.m(ft.n(gnVar.c(i3)));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.m(ft.n(list.get(i3).intValue()));
                i3++;
            }
        }
        return i2;
    }

    static int b(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(hgVar.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    static int a(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(hgVar.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += ft.d(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    private static je<?, ?> a(boolean z) {
        try {
            Class<?> b2 = b();
            if (b2 == null) {
                return null;
            }
            return (je) b2.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static int h(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ft.e(i2);
    }

    static int i(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ft.g(i2);
    }

    static int j(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ft.k(i2);
    }

    static int b(int i2, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * ft.m(i2 << 3));
    }

    static int c(int i2, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * ft.m(i2 << 3));
    }

    static int d(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * ft.m(i2 << 3));
    }

    static int e(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * ft.m(i2 << 3));
    }

    static int f(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * ft.m(i2 << 3));
    }

    static int g(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * ft.m(i2 << 3));
    }

    static int a(int i2, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * ft.m(i2 << 3));
    }

    static int l(int i2, List<fe> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m2 = size * ft.m(i2 << 3);
        for (int i3 = 0; i3 < list.size(); i3++) {
            m2 += ft.b(list.get(i3));
        }
        return m2;
    }

    static int k(int i2, List<?> list) {
        int b2;
        int b3;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int m2 = ft.m(i2 << 3) * size;
        if (list instanceof he) {
            he heVar = (he) list;
            while (i3 < size) {
                Object b4 = heVar.b(i3);
                if (b4 instanceof fe) {
                    b3 = ft.b((fe) b4);
                } else {
                    b3 = ft.b((String) b4);
                }
                m2 += b3;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof fe) {
                    b2 = ft.b((fe) obj);
                } else {
                    b2 = ft.b((String) obj);
                }
                m2 += b2;
                i3++;
            }
        }
        return m2;
    }

    static int a(int i2, Object obj, in inVar) {
        if (obj instanceof hc) {
            return ft.a(i2, (hc) obj);
        }
        return ft.b(i2, (ht) obj, inVar);
    }

    static int b(int i2, List<ht> list, in inVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ft.c(i2, list.get(i4), inVar);
        }
        return i3;
    }

    static int a(int i2, List<?> list, in inVar) {
        int a2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m2 = ft.m(i2 << 3) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof hc) {
                a2 = ft.a((hc) obj);
            } else {
                a2 = ft.a((ht) obj, inVar);
            }
            m2 += a2;
        }
        return m2;
    }

    public static void b(int i2, List<fe> list, jw jwVar) {
        if (list != null && !list.isEmpty()) {
            jwVar.b(i2, list);
        }
    }

    public static void c(int i2, List<Long> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.c(i2, list, z);
        }
    }

    public static void d(int i2, List<Long> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.d(i2, list, z);
        }
    }

    public static void e(int i2, List<Long> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.n(i2, list, z);
        }
    }

    public static void f(int i2, List<Long> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.e(i2, list, z);
        }
    }

    public static void g(int i2, List<Long> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.l(i2, list, z);
        }
    }

    public static void k(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.b(i2, list, z);
        }
    }

    public static void l(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.k(i2, list, z);
        }
    }

    public static void m(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.h(i2, list, z);
        }
    }

    public static void n(int i2, List<Boolean> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.i(i2, list, z);
        }
    }

    public static void h(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.a(i2, list, z);
        }
    }

    public static void i(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.j(i2, list, z);
        }
    }

    public static void j(int i2, List<Integer> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.m(i2, list, z);
        }
    }

    public static void b(int i2, List<?> list, jw jwVar, in inVar) {
        if (list != null && !list.isEmpty()) {
            jwVar.b(i2, list, inVar);
        }
    }

    static <UT, UB> UB a(int i2, int i3, UB ub, je<UT, UB> jeVar) {
        if (ub == null) {
            ub = jeVar.a();
        }
        jeVar.a(ub, i2, (long) i3);
        return ub;
    }

    public static void b(int i2, List<Float> list, jw jwVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            jwVar.f(i2, list, z);
        }
    }

    static <UT, UB> UB a(int i2, List<Integer> list, gq gqVar, UB ub, je<UT, UB> jeVar) {
        if (gqVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (gqVar.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) a(i2, intValue, ub, jeVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!gqVar.a(intValue2)) {
                    ub = (UB) a(i2, intValue2, ub, jeVar);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
