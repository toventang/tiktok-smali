package com.ss.android.ugc.aweme.tools.draft.ftc.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139546a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(91233);
    }

    public static void a(List<? extends c> list) {
        com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
        for (c cVar : list) {
            aVar.a(cVar);
            cVar.C = aVar.a();
        }
    }

    public static List<c> a(List<? extends com.ss.android.ugc.aweme.tools.draft.g.a<Object>> list, boolean z) {
        boolean z2;
        if (list == null || list.isEmpty()) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.ss.android.ugc.aweme.tools.draft.g.a aVar = (com.ss.android.ugc.aweme.tools.draft.g.a) list.get(i2);
            if (aVar.f139774b != null) {
                ArrayList<c> arrayList2 = aVar.f139774b;
                if (arrayList2 == null) {
                    l.b();
                }
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = arrayList2.get(i3);
                    if (cVar != null) {
                        if (i3 == 0 && cVar.f83185f != null) {
                            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar.f83185f;
                            l.b(cVar2, "");
                            if (!TextUtils.isEmpty(cVar2.getName())) {
                                c cVar3 = new c();
                                cVar3.f83185f = cVar.f83185f;
                                if (z) {
                                    cVar3.x = 5;
                                } else {
                                    cVar3.x = 1;
                                }
                                arrayList.add(cVar3);
                            }
                        }
                        if (i3 == arrayList2.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cVar.z = z2;
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
