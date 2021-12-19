package com.ss.android.ugc.aweme.tools.draft.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.tools.draft.g.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.tools.draft.g.a<Object>> f139795a = new ArrayList();

    static {
        Covode.recordClassIndex(91374);
    }

    public abstract int a();

    public abstract boolean b(c cVar);

    public final List<com.ss.android.ugc.aweme.tools.draft.g.a<Object>> b() {
        c();
        return this.f139795a;
    }

    private final void c() {
        List<com.ss.android.ugc.aweme.tools.draft.g.a<Object>> list = this.f139795a;
        int size = list.size();
        int i2 = size - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            for (int i5 = i4; i5 < size; i5++) {
                com.ss.android.ugc.aweme.tools.draft.g.a<Object> aVar = list.get(i5);
                com.ss.android.ugc.aweme.tools.draft.g.a<Object> aVar2 = list.get(i3);
                if (aVar.f139774b != null) {
                    ArrayList<c> arrayList = aVar.f139774b;
                    if (arrayList == null) {
                        l.b();
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList<c> arrayList2 = aVar.f139774b;
                        if (arrayList2 == null) {
                            l.b();
                        }
                        if (arrayList2.get(0) != null) {
                            ArrayList<c> arrayList3 = aVar.f139774b;
                            if (arrayList3 == null) {
                                l.b();
                            }
                            c cVar = arrayList3.get(0);
                            if (cVar == null) {
                                l.b();
                            }
                            l.b(cVar, "");
                            if (cVar.I != 0) {
                                if (!(aVar2 == null || aVar2.f139774b == null)) {
                                    ArrayList<c> arrayList4 = aVar2.f139774b;
                                    if (arrayList4 == null) {
                                        l.b();
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        ArrayList<c> arrayList5 = aVar2.f139774b;
                                        if (arrayList5 == null) {
                                            l.b();
                                        }
                                        if (arrayList5.get(0) != null) {
                                            ArrayList<c> arrayList6 = aVar2.f139774b;
                                            if (arrayList6 == null) {
                                                l.b();
                                            }
                                            c cVar2 = arrayList6.get(0);
                                            if (cVar2 == null) {
                                                l.b();
                                            }
                                            l.b(cVar2, "");
                                            if (cVar2.I != 0) {
                                                ArrayList<c> arrayList7 = aVar.f139774b;
                                                if (arrayList7 == null) {
                                                    l.b();
                                                }
                                                c cVar3 = arrayList7.get(0);
                                                if (cVar3 == null) {
                                                    l.b();
                                                }
                                                l.b(cVar3, "");
                                                long j2 = cVar3.I;
                                                ArrayList<c> arrayList8 = aVar2.f139774b;
                                                if (arrayList8 == null) {
                                                    l.b();
                                                }
                                                c cVar4 = arrayList8.get(0);
                                                if (cVar4 == null) {
                                                    l.b();
                                                }
                                                l.b(cVar4, "");
                                                if (j2 <= cVar4.I) {
                                                }
                                            }
                                        }
                                    }
                                }
                                com.ss.android.ugc.aweme.tools.draft.g.a<Object> aVar3 = list.get(i3);
                                list.set(i3, list.get(i5));
                                list.set(i5, aVar3);
                            }
                        }
                    }
                }
            }
            i3 = i4;
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.tools.draft.g.a aVar = (com.ss.android.ugc.aweme.tools.draft.g.a) n.j((List) this.f139795a);
        if (aVar == null || !aVar.b(cVar)) {
            b bVar = new b();
            bVar.f139773a = (Element) cVar.f83185f;
            bVar.a(cVar);
            this.f139795a.add(bVar);
            return;
        }
        aVar.a(cVar);
    }
}
