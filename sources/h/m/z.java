package h.m;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.j.e;
import h.j.g;
import h.j.h;
import h.l.k;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class z extends y {
    static {
        Covode.recordClassIndex(105377);
    }

    public static final String a(String str, char c2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        int a2 = p.a((CharSequence) str, c2, 0, false, 6);
        if (a2 == -1) {
            return str2;
        }
        String substring = str.substring(0, a2);
        l.b(substring, "");
        return substring;
    }

    public static final CharSequence a(CharSequence charSequence, int i2, int i3, CharSequence charSequence2) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (i3 >= i2) {
            StringBuilder sb = new StringBuilder();
            l.b(sb.append(charSequence, 0, i2), "");
            sb.append(charSequence2);
            l.b(sb.append(charSequence, i3, charSequence.length()), "");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
    }

    public static final CharSequence a(CharSequence charSequence, int i2, int i3) {
        l.d(charSequence, "");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        } else if (i3 == i2) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i3 - i2));
            l.b(sb.append(charSequence, 0, i2), "");
            l.b(sb.append(charSequence, i3, charSequence.length()), "");
            return sb;
        }
    }

    public static final String a(String str, CharSequence charSequence, CharSequence charSequence2) {
        l.d(str, "");
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (str.length() < charSequence.length() + charSequence2.length() || !p.b((CharSequence) str, charSequence) || !p.c((CharSequence) str, charSequence2)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        l.b(substring, "");
        return substring;
    }

    public static final String a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        int a2 = p.a((CharSequence) str, str2);
        if (a2 == -1) {
            return str4;
        }
        return p.a(str, a2 + str2.length(), str.length(), str3).toString();
    }

    public static final boolean a(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!a.a(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(CharSequence charSequence, char c2) {
        l.d(charSequence, "");
        return charSequence.length() > 0 && a.a(charSequence.charAt(p.f(charSequence)), c2, false);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        l.d(charSequence, "");
        l.d(cArr, "");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int b2 = h.b(i2, 0);
            int f2 = p.f(charSequence);
            if (b2 > f2) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(b2);
                for (char c2 : cArr) {
                    if (a.a(c2, charAt, z)) {
                        return b2;
                    }
                }
                if (b2 == f2) {
                    return -1;
                }
                b2++;
            }
        } else {
            return ((String) charSequence).indexOf(i.a(cArr), i2);
        }
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return p.a(charSequence, str, i2, z);
    }

    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        return charSequence2 instanceof String ? p.a(charSequence, (String) charSequence2, 0, z, 2) >= 0 : a(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0;
    }

    public static final void a(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Limit must be non-negative, but was ".concat(String.valueOf(i2)).toString());
        }
    }

    public static final h.l.h<String> a(CharSequence charSequence, String[] strArr) {
        l.d(charSequence, "");
        l.d(strArr, "");
        return k.e(a(charSequence, strArr, false, 0), new b(charSequence));
    }

    public static final List<String> a(CharSequence charSequence, char[] cArr) {
        l.d(charSequence, "");
        l.d(cArr, "");
        return a(charSequence, String.valueOf(cArr[0]), false, 0);
    }

    private static final List<String> a(CharSequence charSequence, String str, boolean z, int i2) {
        p.a(0);
        int a2 = p.a(charSequence, str, 0, false);
        if (a2 == -1) {
            return n.a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, a2).toString());
            i3 = str.length() + a2;
            a2 = p.a(charSequence, str, i3, false);
        } while (a2 != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0033 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    public static final String a(String str, char... cArr) {
        Object obj = "";
        l.d(str, obj);
        l.d(cArr, obj);
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            l.d(cArr, obj);
            l.d(cArr, obj);
            int i2 = 0;
            while (true) {
                if (charAt == cArr[i2]) {
                    break;
                }
                i2++;
                if (i2 > 0) {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                obj = str.subSequence(0, length + 1);
                break;
            }
            length--;
        }
        return obj.toString();
    }

    public static final String a(String str, g gVar) {
        l.d(str, "");
        l.d(gVar, "");
        String substring = str.substring(Integer.valueOf(gVar.f158747a).intValue(), Integer.valueOf(gVar.f158748b).intValue() + 1);
        l.b(substring, "");
        return substring;
    }

    public static final String a(CharSequence charSequence, g gVar) {
        l.d(charSequence, "");
        l.d(gVar, "");
        return charSequence.subSequence(Integer.valueOf(gVar.f158747a).intValue(), Integer.valueOf(gVar.f158748b).intValue() + 1).toString();
    }

    public static final String a(String str, CharSequence charSequence) {
        l.d(str, "");
        l.d(charSequence, "");
        if (!p.b((CharSequence) str, charSequence)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        l.b(substring, "");
        return substring;
    }

    public static final CharSequence a(CharSequence charSequence, CharSequence charSequence2) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (p.c(charSequence, charSequence2)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    private static /* synthetic */ h.l.h a(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        p.a(0);
        return new e(charSequence, 0, new a(i.a(strArr), false));
    }

    static final class b extends m implements h.f.a.b<g, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        static {
            Covode.recordClassIndex(105379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // h.f.a.b
        public final /* synthetic */ String invoke(g gVar) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            return p.a(this.$this_splitToSequence, gVar2);
        }
    }

    public static final int f(CharSequence charSequence) {
        l.d(charSequence, "");
        return charSequence.length() - 1;
    }

    public static final List<String> h(CharSequence charSequence) {
        l.d(charSequence, "");
        return k.g(p.g(charSequence));
    }

    public static final CharSequence d(CharSequence charSequence) {
        l.d(charSequence, "");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (a.a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    public static final g e(CharSequence charSequence) {
        l.d(charSequence, "");
        return new g(0, charSequence.length() - 1);
    }

    public static final h.l.h<String> g(CharSequence charSequence) {
        l.d(charSequence, "");
        return p.a(charSequence, new String[]{"\r\n", "\n", "\r"});
    }

    public static final CharSequence b(CharSequence charSequence) {
        int i2;
        l.d(charSequence, "");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            if (!z) {
                i2 = i3;
            } else {
                i2 = length;
            }
            boolean a2 = a.a(charSequence.charAt(i2));
            if (z) {
                if (!a2) {
                    break;
                }
                length--;
            } else if (!a2) {
                z = true;
            } else {
                i3++;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }

    public static final CharSequence c(CharSequence charSequence) {
        l.d(charSequence, "");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!a.a(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c2) {
        return p.a(charSequence, c2, p.f(charSequence));
    }

    public static final String c(String str, CharSequence charSequence) {
        l.d(str, "");
        l.d(charSequence, "");
        return p.a(str, charSequence, charSequence);
    }

    public static final String b(String str, CharSequence charSequence) {
        l.d(str, "");
        l.d(charSequence, "");
        if (!p.c((CharSequence) str, charSequence)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        l.b(substring, "");
        return substring;
    }

    public static final boolean c(CharSequence charSequence, char c2) {
        l.d(charSequence, "");
        if (p.a(charSequence, c2, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final class a extends m implements h.f.a.m<CharSequence, Integer, p<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        static {
            Covode.recordClassIndex(105378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, boolean z) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z;
        }

        @Override // h.f.a.m
        public final /* synthetic */ p<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            p a2;
            Object next;
            CharSequence charSequence2 = charSequence;
            int intValue = num.intValue();
            l.d(charSequence2, "");
            List list = this.$delimitersList;
            boolean z = this.$ignoreCase;
            if (z || list.size() != 1) {
                g gVar = new g(h.b(intValue, 0), charSequence2.length());
                if (charSequence2 instanceof String) {
                    int i2 = gVar.f158747a;
                    int i3 = gVar.f158748b;
                    int i4 = gVar.f158749c;
                    if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                        while (true) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next2 = it.next();
                                String str = (String) next2;
                                if (p.a(str, 0, (String) charSequence2, i2, str.length(), z)) {
                                    if (next2 != null) {
                                        a2 = v.a(Integer.valueOf(i2), next2);
                                        break;
                                    }
                                }
                            }
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        }
                    }
                    return null;
                }
                int i5 = gVar.f158747a;
                int i6 = gVar.f158748b;
                int i7 = gVar.f158749c;
                if (i7 < 0 ? i5 >= i6 : i5 <= i6) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next3 = it2.next();
                            String str2 = (String) next3;
                            z = z;
                            if (p.a(str2, 0, charSequence2, i5, str2.length(), z)) {
                                if (next3 != null) {
                                    a2 = v.a(Integer.valueOf(i5), next3);
                                    break;
                                }
                            }
                        }
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    }
                }
                return null;
            }
            l.d(list, "");
            if (list instanceof List) {
                List list2 = list;
                l.d(list2, "");
                int size = list2.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                } else if (size == 1) {
                    next = list2.get(0);
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                Iterator it3 = list.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        throw new IllegalArgumentException("Collection has more than one element.");
                    }
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
            String str3 = (String) next;
            int a3 = p.a(charSequence2, str3, intValue, false, 4);
            if (a3 >= 0) {
                a2 = v.a(Integer.valueOf(a3), str3);
            }
            return null;
            if (a2 != null) {
                return v.a(a2.getFirst(), Integer.valueOf(((String) a2.getSecond()).length()));
            }
            return null;
        }
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str) {
        return p.a(charSequence, str, p.f(charSequence));
    }

    public static final List<String> b(CharSequence charSequence, String[] strArr) {
        l.d(charSequence, "");
        l.d(strArr, "");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a(charSequence, str, false, 0);
            }
        }
        Iterable<g> k2 = k.k(a(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(n.a(k2, 10));
        for (g gVar : k2) {
            arrayList.add(p.a(charSequence, gVar));
        }
        return arrayList;
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return p.a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
        }
        return p.c((String) charSequence, (String) charSequence2, false);
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2) {
        l.d(charSequence, "");
        l.d(charSequence2, "");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return p.a(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
        }
        return p.b((String) charSequence, (String) charSequence2, false);
    }

    public static final String b(String str, char c2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        int b2 = p.b((CharSequence) str, c2);
        if (b2 == -1) {
            return str2;
        }
        String substring = str.substring(0, b2);
        l.b(substring, "");
        return substring;
    }

    public static final String c(String str, char c2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        int b2 = p.b((CharSequence) str, c2);
        if (b2 == -1) {
            return str2;
        }
        String substring = str.substring(b2 + 1, str.length());
        l.b(substring, "");
        return substring;
    }

    public static final int a(CharSequence charSequence, char c2, int i2) {
        l.d(charSequence, "");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        char[] cArr = {c2};
        l.d(charSequence, "");
        l.d(cArr, "");
        for (int c3 = h.c(i2, p.f(charSequence)); c3 >= 0; c3--) {
            char charAt = charSequence.charAt(c3);
            int i3 = 0;
            while (!a.a(cArr[i3], charAt, false)) {
                i3++;
                if (i3 > 0) {
                }
            }
            return c3;
        }
        return -1;
    }

    public static final String d(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int a2 = p.a((CharSequence) str, str2);
        if (a2 == -1) {
            return str3;
        }
        String substring = str.substring(0, a2);
        l.b(substring, "");
        return substring;
    }

    public static final String e(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int a2 = p.a((CharSequence) str, str2);
        if (a2 == -1) {
            return str3;
        }
        String substring = str.substring(a2 + str2.length(), str.length());
        l.b(substring, "");
        return substring;
    }

    public static final String g(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int b2 = p.b((CharSequence) str, '.');
        if (b2 == -1) {
            return str3;
        }
        return p.a(str, b2 + 1, str.length(), str2).toString();
    }

    public static final String c(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int a2 = p.a((CharSequence) str, str2, 0, false, 6);
        if (a2 == -1) {
            return str3;
        }
        String substring = str.substring(a2 + str2.length(), str.length());
        l.b(substring, "");
        return substring;
    }

    public static final String b(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int a2 = p.a((CharSequence) str, str2, 0, false, 6);
        if (a2 == -1) {
            return str3;
        }
        String substring = str.substring(0, a2);
        l.b(substring, "");
        return substring;
    }

    public static final int a(CharSequence charSequence, String str, int i2) {
        l.d(charSequence, "");
        l.d(str, "");
        if (!(charSequence instanceof String)) {
            return a(charSequence, (CharSequence) str, i2, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i2);
    }

    public static final int a(CharSequence charSequence, char c2, int i2, boolean z) {
        l.d(charSequence, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return p.a(charSequence, new char[]{c2}, i2, z);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public static final int a(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r1, r0)
            h.f.b.l.d(r2, r0)
            if (r4 != 0) goto L_0x000e
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0017
        L_0x000e:
            int r0 = r1.length()
            int r0 = a(r1, r2, r3, r0, r4)
            return r0
        L_0x0017:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.indexOf(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.z.a(java.lang.CharSequence, java.lang.String, int, boolean):int");
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c2, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return p.a(charSequence, c2, i2, false);
    }

    public static final int a(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        e a2;
        if (!z2) {
            a2 = new g(h.b(i2, 0), h.c(i3, charSequence.length()));
        } else {
            a2 = e.a.a(h.c(i2, p.f(charSequence)), h.b(i3, 0), -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i4 = a2.f158747a;
            int i5 = a2.f158748b;
            int i6 = a2.f158749c;
            if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                while (!p.a(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                return i4;
            }
        } else {
            int i7 = a2.f158747a;
            int i8 = a2.f158748b;
            int i9 = a2.f158749c;
            if (i9 < 0 ? i7 >= i8 : i7 <= i8) {
                while (!p.a((String) charSequence2, 0, (String) charSequence, i7, charSequence2.length(), z)) {
                    if (i7 != i8) {
                        i7 += i9;
                    }
                }
                return i7;
            }
        }
        return -1;
    }
}
