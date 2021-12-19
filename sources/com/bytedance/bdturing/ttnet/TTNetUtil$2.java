package com.bytedance.bdturing.ttnet;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import java.util.LinkedList;
import java.util.Map;

class TTNetUtil$2 implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f26546a;

    static {
        Covode.recordClassIndex(15593);
    }

    TTNetUtil$2(Map map) {
        this.f26546a = map;
    }

    private u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(a2.getHeaders());
        for (String str : this.f26546a.keySet()) {
            linkedList.add(new b(str, (String) this.f26546a.get(str)));
        }
        Request.a newBuilder = a2.newBuilder();
        newBuilder.f42460c = linkedList;
        return aVar.a(newBuilder.a());
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
            return a(aVar);
        }
        com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }
}
