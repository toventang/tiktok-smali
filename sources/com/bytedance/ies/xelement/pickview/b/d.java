package com.bytedance.ies.xelement.pickview.b;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f37379a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f37380b = i.a((h.f.a.a) a.f37381a);

    private static List<String> a() {
        return (List) f37380b.getValue();
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(22464);
    }

    static final class a extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37381a = new a();

        static {
            Covode.recordClassIndex(22465);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            return n.b(b.f37377f, b.f37373b, b.f37372a, b.f37374c, b.f37375d, b.f37376e, b.f37378g);
        }
    }

    public static List<p<String, String>> a(String str) {
        p pVar;
        l.c(str, "");
        List<String> b2 = h.m.p.b(str, new String[]{";"});
        ArrayList arrayList = new ArrayList(n.a((Iterable) b2, 10));
        Iterator<T> it = b2.iterator();
        while (it.hasNext()) {
            List c2 = h.m.p.c(it.next(), new String[]{":"});
            if (c2.size() == 2) {
                String str2 = (String) c2.get(0);
                if (str2 != null) {
                    String obj = h.m.p.b((CharSequence) str2).toString();
                    String str3 = (String) c2.get(1);
                    if (str3 != null) {
                        pVar = new p(obj, h.m.p.b((CharSequence) str3).toString());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                pVar = null;
            }
            arrayList.add(pVar);
        }
        List g2 = n.g((Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : g2) {
            if (a().contains(((p) obj2).getFirst())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
