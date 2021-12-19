package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.j.g;
import h.l.h;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

public class x extends w {
    static {
        Covode.recordClassIndex(105085);
    }

    public static final <T> boolean a(Iterable<? extends T> iterable, T t) {
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return n.b(iterable, t) >= 0;
    }

    public static final <T> List<T> a(List<? extends T> list, g gVar) {
        l.d(list, "");
        l.d(gVar, "");
        if (gVar.a()) {
            return z.INSTANCE;
        }
        return n.k(list.subList(Integer.valueOf(gVar.f158747a).intValue(), Integer.valueOf(gVar.f158748b).intValue() + 1));
    }

    public static final <T> List<T> a(Collection<? extends T> collection, T t) {
        l.d(collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final class a implements h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f158653a;

        static {
            Covode.recordClassIndex(105086);
        }

        @Override // h.l.h
        public final Iterator<T> a() {
            return this.f158653a.iterator();
        }

        public a(Iterable iterable) {
            this.f158653a = iterable;
        }
    }

    static final class c extends m implements h.f.a.a<Iterator<? extends T>> {
        final /* synthetic */ Iterable $this_withIndex;

        static {
            Covode.recordClassIndex(105088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Iterable iterable) {
            super(0);
            this.$this_withIndex = iterable;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return this.$this_withIndex.iterator();
        }
    }

    public static final <T> List<T> g(Collection<? extends T> collection) {
        l.d(collection, "");
        return new ArrayList(collection);
    }

    public static final <T> Iterable<ac<T>> n(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return new ad(new c(iterable));
    }

    public static final <T> List<T> o(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return n.k(n.p(iterable));
    }

    public static final <T extends Comparable<? super T>> T q(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return (T) n.r(iterable);
    }

    public static final <T> h<T> t(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return new a(iterable);
    }

    public static final <T> T g(List<? extends T> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T h(List<? extends T> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    public static final <T> T i(List<? extends T> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            return (T) list.get(n.a((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T j(List<? extends T> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    public static final <T> List<T> l(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            return n.g((Collection) iterable);
        }
        return (List) n.b((Iterable) iterable, (Collection) new ArrayList());
    }

    public static final <T> Set<T> p(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) n.b((Iterable) iterable, (Collection) new LinkedHashSet());
    }

    public static final int u(Iterable<Integer> iterable) {
        l.d(iterable, "");
        int i2 = 0;
        for (Integer num : iterable) {
            i2 += num.intValue();
        }
        return i2;
    }

    public static final long v(Iterable<Long> iterable) {
        l.d(iterable, "");
        long j2 = 0;
        for (Long l2 : iterable) {
            j2 += l2.longValue();
        }
        return j2;
    }

    static final class b extends m implements h.f.a.b<Integer, T> {
        final /* synthetic */ int $index;

        static {
            Covode.recordClassIndex(105087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$index = i2;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Integer num) {
            num.intValue();
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.$index + '.');
        }
    }

    public static final <T> T c(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if (iterable instanceof List) {
            return (T) n.g((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T d(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    public static final <T> T e(Iterable<? extends T> iterable) {
        T t;
        l.d(iterable, "");
        if (iterable instanceof List) {
            return (T) n.i((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                t = (T) it.next();
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T f(Iterable<? extends T> iterable) {
        T t;
        l.d(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            t = (T) it.next();
        } while (it.hasNext());
        return t;
    }

    public static final <T> List<T> g(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return (List) n.a((Iterable) iterable, (Collection) new ArrayList());
    }

    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return n.k(iterable);
        }
        List<T> l2 = n.l(iterable);
        n.f((List) l2);
        return l2;
    }

    public static final <T extends Comparable<? super T>> List<T> i(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return n.k(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Comparable[] comparableArr = (Comparable[]) array;
            Objects.requireNonNull(comparableArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            i.b(comparableArr);
            return i.a(comparableArr);
        }
        List<T> l2 = n.l(iterable);
        n.c((List) l2);
        return l2;
    }

    public static final <T> HashSet<T> j(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        return (HashSet) n.b((Iterable) iterable, (Collection) new HashSet(ag.a(n.a(iterable, 12))));
    }

    public static final <T> List<T> k(Iterable<? extends T> iterable) {
        Object next;
        l.d(iterable, "");
        if (!(iterable instanceof Collection)) {
            return n.b(n.l(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z.INSTANCE;
        }
        if (size != 1) {
            return n.g(collection);
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return n.a(next);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T r(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x0017
            r2 = r1
            goto L_0x0017
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.x.r(java.lang.Iterable):java.lang.Comparable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T s(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x0017
            r2 = r1
            goto L_0x0017
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.x.s(java.lang.Iterable):java.lang.Comparable");
    }

    public static final <T> Set<T> m(Iterable<? extends T> iterable) {
        Object next;
        l.d(iterable, "");
        if (!(iterable instanceof Collection)) {
            return am.a((Set) n.b((Iterable) iterable, (Collection) new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ab.INSTANCE;
        }
        if (size != 1) {
            return (Set) n.b((Iterable) iterable, (Collection) new LinkedHashSet(ag.a(collection.size())));
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return am.a(next);
    }

    public static final int[] e(Collection<Integer> collection) {
        l.d(collection, "");
        int[] iArr = new int[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    public static final long[] f(Collection<Long> collection) {
        l.d(collection, "");
        long[] jArr = new long[collection.size()];
        int i2 = 0;
        for (Long l2 : collection) {
            jArr[i2] = l2.longValue();
            i2++;
        }
        return jArr;
    }

    public static final byte[] c(Collection<Byte> collection) {
        l.d(collection, "");
        byte[] bArr = new byte[collection.size()];
        int i2 = 0;
        for (Byte b2 : collection) {
            bArr[i2] = b2.byteValue();
            i2++;
        }
        return bArr;
    }

    public static final boolean[] b(Collection<Boolean> collection) {
        l.d(collection, "");
        boolean[] zArr = new boolean[collection.size()];
        int i2 = 0;
        for (Boolean bool : collection) {
            zArr[i2] = bool.booleanValue();
            i2++;
        }
        return zArr;
    }

    public static final double[] d(Collection<Double> collection) {
        l.d(collection, "");
        double[] dArr = new double[collection.size()];
        int i2 = 0;
        for (Double d2 : collection) {
            dArr[i2] = d2.doubleValue();
            i2++;
        }
        return dArr;
    }

    public static final <T> int a(List<? extends T> list, T t) {
        l.d(list, "");
        return list.indexOf(t);
    }

    public static final <T> int b(List<? extends T> list, T t) {
        l.d(list, "");
        return list.lastIndexOf(t);
    }

    public static final <T> Set<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        Set<T> p = n.p(iterable);
        n.b((Collection) p, (Iterable) iterable2);
        return p;
    }

    public static final <T> Set<T> d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        Set<T> p = n.p(iterable);
        n.a((Collection) p, (Iterable) iterable2);
        return p;
    }

    public static final <T> T b(Iterable<? extends T> iterable, int i2) {
        l.d(iterable, "");
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) n.a(iterable, i2, new b(i2));
    }

    public static final <T> int b(Iterable<? extends T> iterable, T t) {
        l.d(iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 < 0) {
                n.a();
            }
            if (l.a((Object) t, obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> T b(List<? extends T> list, int i2) {
        l.d(list, "");
        if (i2 < 0 || i2 > n.a((List) list)) {
            return null;
        }
        return (T) list.get(i2);
    }

    public static final <T> List<T> c(List<? extends T> list, int i2) {
        l.d(list, "");
        if (i2 >= 0) {
            return n.d((Iterable) list, h.j.h.b(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T> List<T> d(Iterable<? extends T> iterable, int i2) {
        l.d(iterable, "");
        int i3 = 0;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return z.INSTANCE;
        } else {
            if (iterable instanceof Collection) {
                if (i2 >= ((Collection) iterable).size()) {
                    return n.k(iterable);
                }
                if (i2 == 1) {
                    return n.a(n.c(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i2);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return n.b((List) arrayList);
        }
    }

    public static final <T> List<T> e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        Collection a2 = n.a((Iterable) iterable2, (Iterable) iterable);
        if (a2.isEmpty()) {
            return n.k(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!a2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<p<T, R>> f(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(n.a(iterable, 10), n.a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(v.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C b(Iterable<? extends T> iterable, C c2) {
        l.d(iterable, "");
        l.d(c2, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static final <T> List<T> c(Iterable<? extends T> iterable, int i2) {
        ArrayList arrayList;
        l.d(iterable, "");
        int i3 = 0;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return n.k(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i2;
                if (size <= 0) {
                    return z.INSTANCE;
                }
                if (size == 1) {
                    return n.a(n.e(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i2 < size2) {
                            arrayList.add(((List) iterable).get(i2));
                            i2++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i2);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                if (i3 >= i2) {
                    arrayList.add(obj);
                } else {
                    i3++;
                }
            }
            return n.b((List) arrayList);
        }
    }

    public static final <T> List<T> d(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        l.d(collection, "");
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        n.a((Collection) arrayList2, (Iterable) iterable);
        return arrayList2;
    }

    public static final <T> Set<T> b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        Set<T> p = n.p(iterable);
        n.c((Collection) p, (Iterable) iterable2);
        return p;
    }

    public static final <T> List<T> d(List<? extends T> list, int i2) {
        l.d(list, "");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return z.INSTANCE;
        } else {
            int size = list.size();
            if (i2 >= size) {
                return n.k(list);
            }
            if (i2 == 1) {
                return n.a(n.i((List) list));
            }
            ArrayList arrayList = new ArrayList(i2);
            if (list instanceof RandomAccess) {
                for (int i3 = size - i2; i3 < size; i3++) {
                    arrayList.add(list.get(i3));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i2);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> iterable, C c2) {
        l.d(iterable, "");
        l.d(c2, "");
        for (Object obj : iterable) {
            if (obj != null) {
                c2.add(obj);
            }
        }
        return c2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        l.d(iterable, "");
        l.d(comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return n.k(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            i.a(array, (Comparator) comparator);
            return i.a(array);
        }
        List<T> l2 = n.l(iterable);
        n.a((List) l2, (Comparator) comparator);
        return l2;
    }

    public static final <T> T a(Iterable<? extends T> iterable, int i2, h.f.a.b<? super Integer, ? extends T> bVar) {
        l.d(iterable, "");
        l.d(bVar, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i2 < 0 || i2 > n.a(list)) ? (T) bVar.invoke(Integer.valueOf(i2)) : (T) list.get(i2);
        } else if (i2 < 0) {
            return (T) bVar.invoke(Integer.valueOf(i2));
        } else {
            int i3 = 0;
            for (T t : iterable) {
                int i4 = i3 + 1;
                if (i2 == i3) {
                    return t;
                }
                i3 = i4;
            }
            return (T) bVar.invoke(Integer.valueOf(i2));
        }
    }

    public static final <T> String a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, h.f.a.b<? super T, ? extends CharSequence> bVar) {
        l.d(iterable, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        String sb = ((StringBuilder) n.a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, bVar)).toString();
        l.b(sb, "");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r8 >= 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, A extends java.lang.Appendable> A a(java.lang.Iterable<? extends T> r3, A r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, h.f.a.b<? super T, ? extends java.lang.CharSequence> r10) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            h.f.b.l.d(r4, r0)
            h.f.b.l.d(r5, r0)
            h.f.b.l.d(r6, r0)
            h.f.b.l.d(r7, r0)
            h.f.b.l.d(r9, r0)
            r4.append(r6)
            java.util.Iterator r3 = r3.iterator()
            r2 = 0
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r1 = r3.next()
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L_0x002e
            r4.append(r5)
        L_0x002e:
            if (r8 < 0) goto L_0x0032
            if (r2 > r8) goto L_0x0038
        L_0x0032:
            h.m.p.a(r4, r1, r10)
            goto L_0x001c
        L_0x0036:
            if (r8 < 0) goto L_0x003d
        L_0x0038:
            if (r2 <= r8) goto L_0x003d
            r4.append(r9)
        L_0x003d:
            r4.append(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.x.a(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, h.f.a.b):java.lang.Appendable");
    }

    public static /* synthetic */ String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, h.f.a.b bVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            bVar = null;
        }
        return n.a(iterable, charSequence, charSequence2, charSequence3, i2, charSequence4, bVar);
    }
}
