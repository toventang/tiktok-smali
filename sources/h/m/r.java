package h.m;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public class r extends q {

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f158838a = new a();

        static {
            Covode.recordClassIndex(105368);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            l.d(str, "");
            return str;
        }
    }

    static {
        Covode.recordClassIndex(105367);
    }

    public static final String b(String str) {
        l.d(str, "");
        return p.b(str, "");
    }

    private static final h.f.a.b<String, String> d(String str) {
        if (str.length() == 0) {
            return a.f158838a;
        }
        return new b(str);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<String, String> {
        final /* synthetic */ String $indent;

        static {
            Covode.recordClassIndex(105369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$indent = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return this.$indent + str2;
        }
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (!(!a.a(str.charAt(i2)))) {
                i2++;
            } else if (i2 != -1) {
                return i2;
            }
        }
        return str.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r3 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.r.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final String b(String str, String str2) {
        int i2;
        String invoke;
        l.d(str, "");
        l.d(str2, "");
        List<String> h2 = p.h((CharSequence) str);
        ArrayList arrayList = new ArrayList();
        for (T t : h2) {
            if (!p.a((CharSequence) t)) {
                arrayList.add(t);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(Integer.valueOf(c(str3)));
        }
        Integer num = (Integer) n.s(arrayList3);
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length = str.length() + (str2.length() * h2.size());
        h.f.a.b<String, String> d2 = d(str2);
        int a2 = n.a((List) h2);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : h2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t3 = t2;
            if ((i3 != 0 && i3 != a2) || !p.a((CharSequence) t3)) {
                String a3 = p.a((String) t3, i2);
                if (a3 != null && (invoke = d2.invoke(a3)) != null) {
                    t3 = invoke;
                } else if (t3 == null) {
                }
                arrayList4.add(t3);
            }
            i3 = i4;
        }
        String sb = ((StringBuilder) n.a(arrayList4, new StringBuilder(length), "\n", "", "", -1, "...", (h.f.a.b) null)).toString();
        l.b(sb, "");
        return sb;
    }
}
