package com.ss.android.ugc.gamora.recorder.n.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.n.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f148157a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(97656);
    }

    public static final List<b> a(b bVar) {
        int i2;
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        List<b> a2 = bVar.a();
        int c2 = bVar.c();
        if (a2.size() > c2) {
            if (bVar.b() != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            arrayList.addAll(a2.subList(c2 - i2, a2.size()));
        }
        return arrayList;
    }

    private static final List<b> a(List<? extends b> list, int i2) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i2) {
            arrayList.addAll(list.subList(0, i2));
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static final List<b> a(List<? extends b> list, int i2, b bVar) {
        int i3;
        l.d(list, "");
        if (list.size() <= i2) {
            return a(list, i2);
        }
        if (bVar != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        List<b> a2 = a(list, i2 - i3);
        if (bVar == null) {
            return a2;
        }
        a2.add(bVar);
        return a2;
    }
}
