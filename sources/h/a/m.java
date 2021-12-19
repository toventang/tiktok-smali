package h.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.l.c;
import h.l.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class m extends l {
    static {
        Covode.recordClassIndex(105072);
    }

    public static final <T> boolean a(T[] tArr, T t) {
        l.d(tArr, "");
        return i.b(tArr, t) >= 0;
    }

    public static final boolean a(int[] iArr, int i2) {
        l.d(iArr, "");
        return i.b(iArr, i2) >= 0;
    }

    public static final boolean a(long[] jArr) {
        l.d(jArr, "");
        return i.b(jArr) >= 0;
    }

    public static final <C extends Collection<? super T>, T> C a(T[] tArr, C c2) {
        l.d(tArr, "");
        l.d(c2, "");
        for (T t : tArr) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static final int[] a(Integer[] numArr) {
        l.d(numArr, "");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public static final List<Byte> a(byte[] bArr) {
        l.d(bArr, "");
        int length = bArr.length;
        if (length == 0) {
            return z.INSTANCE;
        }
        if (length != 1) {
            return i.b(bArr);
        }
        return n.a(Byte.valueOf(bArr[0]));
    }

    public static /* synthetic */ String a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, b bVar, int i3) {
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
        return i.a(objArr, charSequence, charSequence2, charSequence3, i2, charSequence4, bVar);
    }

    public static final <T> String a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, b<? super T, ? extends CharSequence> bVar) {
        l.d(tArr, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        String sb = ((StringBuilder) i.a(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, bVar)).toString();
        l.b(sb, "");
        return sb;
    }

    public static final String a(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        l.d(jArr, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        String sb = ((StringBuilder) i.a(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (b<? super Long, ? extends CharSequence>) null)).toString();
        l.b(sb, "");
        return sb;
    }

    public static final class a implements h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f158651a;

        static {
            Covode.recordClassIndex(105073);
        }

        @Override // h.l.h
        public final Iterator<T> a() {
            return h.f.b.b.a(this.f158651a);
        }

        public a(Object[] objArr) {
            this.f158651a = objArr;
        }
    }

    public static final int b(int[] iArr) {
        l.d(iArr, "");
        return iArr.length - 1;
    }

    public static final <T> T d(T[] tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <T> T f(T[] tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T> int i(T[] tArr) {
        l.d(tArr, "");
        return tArr.length - 1;
    }

    public static final <T> List<T> k(T[] tArr) {
        l.d(tArr, "");
        return new ArrayList(n.a((Object[]) tArr));
    }

    public static final <T> List<T> m(T[] tArr) {
        l.d(tArr, "");
        return n.k(i.n(tArr));
    }

    public static final char a(char[] cArr) {
        l.d(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <T> T c(T[] tArr) {
        l.d(tArr, "");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T e(T[] tArr) {
        l.d(tArr, "");
        if (tArr.length != 0) {
            return tArr[i.i(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> List<T> g(T[] tArr) {
        l.d(tArr, "");
        return i.c(tArr, h.j.h.b(tArr.length - 1, 0));
    }

    public static final <T> List<T> h(T[] tArr) {
        l.d(tArr, "");
        return (List) i.a((Object[]) tArr, (Collection) new ArrayList());
    }

    public static final <T> List<T> j(T[] tArr) {
        l.d(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return z.INSTANCE;
        }
        if (length != 1) {
            return i.k(tArr);
        }
        return n.a((Object) tArr[0]);
    }

    public static final <T> Set<T> n(T[] tArr) {
        l.d(tArr, "");
        return (Set) i.b((Object[]) tArr, (Collection) new LinkedHashSet(ag.a(tArr.length)));
    }

    public static final <T> h<T> p(T[] tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return c.f158758a;
        }
        return new a(tArr);
    }

    public static final int b(long[] jArr) {
        l.d(jArr, "");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (6737595547571456005L == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final Integer c(int[] iArr) {
        l.d(iArr, "");
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int b2 = i.b(iArr);
        if (b2 > 0) {
            while (true) {
                int i4 = iArr[i2];
                if (i3 < i4) {
                    i3 = i4;
                }
                if (i2 == b2) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i3);
    }

    public static final Integer d(int[] iArr) {
        l.d(iArr, "");
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int b2 = i.b(iArr);
        if (b2 > 0) {
            while (true) {
                int i4 = iArr[i2];
                if (i3 > i4) {
                    i3 = i4;
                }
                if (i2 == b2) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i3);
    }

    public static final <T> Set<T> l(T[] tArr) {
        l.d(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return ab.INSTANCE;
        }
        if (length != 1) {
            return (Set) i.b((Object[]) tArr, (Collection) new LinkedHashSet(ag.a(tArr.length)));
        }
        return am.a((Object) tArr[0]);
    }

    public static final <T> T[] o(T[] tArr) {
        l.d(tArr, "");
        for (T t : tArr) {
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static final List<Byte> b(byte[] bArr) {
        l.d(bArr, "");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static final int b(int[] iArr, int i2) {
        l.d(iArr, "");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static final <T> int b(T[] tArr, T t) {
        l.d(tArr, "");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (l.a((Object) t, (Object) tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> List<T> c(T[] tArr, int i2) {
        l.d(tArr, "");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return z.INSTANCE;
        } else {
            int length = tArr.length;
            if (i2 >= length) {
                return i.j(tArr);
            }
            if (i2 == 1) {
                return n.a((Object) tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(tArr[i3]);
            }
            return arrayList;
        }
    }

    public static final <T> T b(T[] tArr, int i2) {
        l.d(tArr, "");
        if (i2 < 0 || i2 > i.i(tArr)) {
            return null;
        }
        return tArr[i2];
    }

    public static final <T> List<T> c(T[] tArr, Comparator<? super T> comparator) {
        l.d(tArr, "");
        l.d(comparator, "");
        return i.a(i.b((Object[]) tArr, (Comparator) comparator));
    }

    public static final <T, C extends Collection<? super T>> C b(T[] tArr, C c2) {
        l.d(tArr, "");
        l.d(c2, "");
        for (T t : tArr) {
            c2.add(t);
        }
        return c2;
    }

    public static final <T> T[] b(T[] tArr, Comparator<? super T> comparator) {
        l.d(tArr, "");
        l.d(comparator, "");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        l.b(tArr2, "");
        i.a((Object[]) tArr2, (Comparator) comparator);
        return tArr2;
    }

    public static final String a(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, b<? super Integer, ? extends CharSequence> bVar) {
        l.d(iArr, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        String sb = ((StringBuilder) i.a(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, bVar)).toString();
        l.b(sb, "");
        return sb;
    }

    public static final <A extends Appendable> A a(byte[] bArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, b<? super Byte, ? extends CharSequence> bVar) {
        l.d(bArr, "");
        l.d(a2, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (byte b2 : bArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (bVar != null) {
                a2.append((CharSequence) bVar.invoke(Byte.valueOf(b2)));
            } else {
                a2.append(String.valueOf((int) b2));
            }
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends Appendable> A a(long[] jArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, b<? super Long, ? extends CharSequence> bVar) {
        l.d(jArr, "");
        l.d(a2, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        a2.append(charSequence2);
        int i3 = 0;
        for (long j2 : jArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            a2.append(String.valueOf(j2));
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <A extends Appendable> A a(int[] iArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, b<? super Integer, ? extends CharSequence> bVar) {
        l.d(iArr, "");
        l.d(a2, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        l.d(charSequence3, "");
        l.d(charSequence4, "");
        a2.append(charSequence2);
        int i3 = 0;
        for (int i4 : iArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (bVar != null) {
                a2.append((CharSequence) bVar.invoke(Integer.valueOf(i4)));
            } else {
                a2.append(String.valueOf(i4));
            }
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r6.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r10 >= 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r2 <= r10) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, A extends java.lang.Appendable> A a(T[] r5, A r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, java.lang.CharSequence r11, h.f.a.b<? super T, ? extends java.lang.CharSequence> r12) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            h.f.b.l.d(r6, r0)
            h.f.b.l.d(r7, r0)
            h.f.b.l.d(r8, r0)
            h.f.b.l.d(r9, r0)
            h.f.b.l.d(r11, r0)
            r6.append(r8)
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x001a:
            if (r3 >= r4) goto L_0x0030
            r1 = r5[r3]
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L_0x0026
            r6.append(r7)
        L_0x0026:
            if (r10 < 0) goto L_0x002a
            if (r2 > r10) goto L_0x0032
        L_0x002a:
            h.m.p.a(r6, r1, r12)
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0030:
            if (r10 < 0) goto L_0x0037
        L_0x0032:
            if (r2 <= r10) goto L_0x0037
            r6.append(r11)
        L_0x0037:
            r6.append(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.m.a(java.lang.Object[], java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, h.f.a.b):java.lang.Appendable");
    }
}
