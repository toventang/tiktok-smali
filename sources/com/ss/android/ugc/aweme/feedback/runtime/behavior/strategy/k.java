package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i;
import h.a.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class k extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f95449b = new a((byte) 0);

    static {
        Covode.recordClassIndex(60462);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_publish";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60463);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        String str;
        String str2;
        List<List<i.c>> a2 = a(n.a((Iterable) e(), (Comparator) new b()));
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        Iterator<T> it = a2.iterator();
        while (true) {
            String str3 = "";
            if (it.hasNext()) {
                T<i.c> next = it.next();
                if (((i.c) next.get(0)).f95429f instanceof i.c.a.b) {
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) next, 10));
                    for (i.c cVar : next) {
                        i.c.a aVar = cVar.f95429f;
                        if (aVar instanceof i.c.a.b.C2293a) {
                            str2 = ((i.c.a.b.C2293a) cVar.f95429f).f95434c + ':' + ((i.c.a.b.C2293a) cVar.f95429f).f95433b;
                        } else if (aVar instanceof i.c.a.b.C2295c) {
                            str2 = ((i.c.a.b.C2295c) cVar.f95429f).f95436b + ":Lost";
                        } else if (aVar instanceof i.c.a.b.C2294b) {
                            str2 = ((i.c.a.b.C2294b) cVar.f95429f).f95435b;
                        } else {
                            str2 = str3;
                        }
                        arrayList2.add(str2);
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        while (it2.hasNext()) {
                            next2 = ((String) next2) + ';' + ((String) it2.next());
                        }
                        str = (String) next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    str = str3;
                }
                StringBuilder append = new StringBuilder().append(next.size()).append(((i.c) next.get(0)).f95429f.f95431a);
                if (str.length() > 0) {
                    str3 = "(" + str + ')';
                }
                arrayList.add(append.append(str3).toString());
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    str3 = str3 + '|' + ((String) it3.next());
                }
                return str3;
            }
        }
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(60464);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t2.f95427d), Long.valueOf(t.f95427d));
        }
    }
}
