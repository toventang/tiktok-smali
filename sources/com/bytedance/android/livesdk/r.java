package com.bytedance.android.livesdk;

import androidx.c.d;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.ugc.live.a.a.e.c;
import h.f.b.l;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f20548a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(12136);
    }

    public static final long a(long j2) {
        Long a2 = a.b.f18870a.f18863b.a(j2, null);
        if (a2 != null) {
            return a2.longValue();
        }
        return 0;
    }

    public static final void a(long j2, long j3) {
        a.b.f18870a.f18863b.c(j2, Long.valueOf(j3));
    }

    public static final void a(List<? extends AssetsModel> list, d<Long> dVar) {
        l.d(list, "");
        l.d(dVar, "");
        l.d(list, "");
        l.d(dVar, "");
        b<String> bVar = com.bytedance.android.livesdk.ap.a.f14011e;
        l.b(bVar, "");
        String a2 = bVar.a();
        b<String> bVar2 = com.bytedance.android.livesdk.ap.a.f14012f;
        l.b(bVar2, "");
        String a3 = bVar2.a();
        f fVar = e.a.f9628b;
        String str = null;
        if (c.a(a2) || m.a(a3)) {
            b<String> bVar3 = com.bytedance.android.livesdk.ap.a.f14011e;
            l.b(bVar3, "");
            com.bytedance.android.livesdk.ap.c.a(bVar3, fVar != null ? fVar.b(list) : null);
            b<String> bVar4 = com.bytedance.android.livesdk.ap.a.f14012f;
            l.b(bVar4, "");
            if (fVar != null) {
                str = fVar.b(dVar);
            }
            com.bytedance.android.livesdk.ap.c.a(bVar4, str);
            return;
        }
        Object a4 = fVar.a(a2, new a.l().type);
        l.b(a4, "");
        List list2 = (List) a4;
        Object a5 = fVar.a(a3, new a.k().type);
        l.b(a5, "");
        d dVar2 = (d) a5;
        for (Object obj : list) {
            if (!list2.contains(obj)) {
                list2.add(obj);
            }
        }
        int b2 = dVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            dVar2.b(dVar.b(i2), dVar.c(i2));
        }
        b<String> bVar5 = com.bytedance.android.livesdk.ap.a.f14011e;
        l.b(bVar5, "");
        com.bytedance.android.livesdk.ap.c.a(bVar5, fVar.b(list2));
        b<String> bVar6 = com.bytedance.android.livesdk.ap.a.f14012f;
        l.b(bVar6, "");
        com.bytedance.android.livesdk.ap.c.a(bVar6, fVar.b(dVar2));
    }
}
