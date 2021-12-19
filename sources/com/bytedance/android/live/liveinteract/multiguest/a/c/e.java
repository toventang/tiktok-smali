package com.bytedance.android.live.liveinteract.multiguest.a.c;

import com.bytedance.android.livesdk.chatroom.model.b.c;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11104a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(5967);
    }

    public static com.bytedance.android.livesdk.chatroom.model.b.e a(c cVar, int i2) {
        l.d(cVar, "");
        com.bytedance.android.livesdk.chatroom.model.b.e eVar = new com.bytedance.android.livesdk.chatroom.model.b.e();
        eVar.f15722c = cVar.f15710a;
        eVar.f15723d = cVar.f15711b;
        eVar.f15725f = cVar.f15712c;
        eVar.f15726g = cVar.f15713d;
        eVar.f15729j = cVar.f15716g;
        eVar.f15727h = cVar.f15714e;
        eVar.f15720a = cVar.f15715f;
        if (i2 != -1) {
            eVar.f15724e = i2;
        } else {
            eVar.f15724e = cVar.f15717h;
        }
        return eVar;
    }

    public static List<com.bytedance.android.livesdk.chatroom.model.b.e> a(List<? extends c> list, int i2) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((c) it.next(), i2));
        }
        for (Object obj : arrayList2) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
