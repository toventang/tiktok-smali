package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.livesdk.gift.model.l;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class i {
    static {
        Covode.recordClassIndex(12548);
    }

    private static boolean a(User user, long j2) {
        if (user.getId() == j2) {
            return true;
        }
        return false;
    }

    public static y a(long j2, w wVar, User user, User user2) {
        y yVar = new y();
        b bVar = new b();
        bVar.f23211c = j2;
        bVar.f23212d = wVar.f17959k;
        bVar.f23215g = true;
        bVar.f23214f = wVar.f17953e;
        bVar.f23218j = wVar.f17950b;
        yVar.O = bVar;
        com.bytedance.android.livesdk.model.message.c.b bVar2 = wVar.f17950b;
        if (bVar2 != null && !com.bytedance.common.utility.collection.b.a((Collection) bVar2.f19424d)) {
            Iterator<d> it = bVar2.f19424d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.f19436d != null && next.f19436d.f19453a != null && a(next.f19436d.f19453a, u.a().b().c())) {
                    User user3 = next.f19436d.f19453a;
                    if (user3 != null) {
                        yVar.f19705g = user3;
                    }
                }
            }
        }
        if (user2 != null) {
            yVar.f19705g = user2;
        } else {
            yVar.f19705g = d.a.a();
        }
        yVar.f19708j = wVar.f17957i;
        yVar.f19709k = wVar.f17951c;
        yVar.f19707i = wVar.f17954f;
        yVar.f19706h = user;
        yVar.n = wVar.f17958j;
        yVar.o = wVar.f17955g;
        yVar.p = wVar.f17956h;
        yVar.s = true;
        yVar.f13611c = true;
        yVar.t = GiftManager.inst().findGiftById(wVar.f17954f);
        yVar.v = wVar.u;
        return yVar;
    }

    public static List<y> b(long j2, w wVar, User user, User user2) {
        List<l> list;
        ArrayList arrayList = new ArrayList();
        if (wVar == null || (list = wVar.o) == null) {
            return arrayList;
        }
        for (l lVar : list) {
            y yVar = new y();
            b bVar = new b();
            bVar.f23211c = j2;
            bVar.f23212d = lVar.f17908g;
            bVar.f23215g = true;
            bVar.f23214f = lVar.f17903b;
            bVar.f23218j = lVar.f17902a;
            yVar.O = bVar;
            com.bytedance.android.livesdk.model.message.c.b bVar2 = lVar.f17902a;
            if (bVar2 != null && !com.bytedance.common.utility.collection.b.a((Collection) bVar2.f19424d)) {
                Iterator<com.bytedance.android.livesdk.model.message.c.d> it = bVar2.f19424d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.android.livesdk.model.message.c.d next = it.next();
                    if (next.f19436d != null && next.f19436d.f19453a != null && a(next.f19436d.f19453a, u.a().b().c())) {
                        User user3 = next.f19436d.f19453a;
                        if (user3 != null) {
                            yVar.f19705g = user3;
                        }
                    }
                }
            }
            if (user2 != null) {
                yVar.f19705g = user2;
            } else {
                yVar.f19705g = d.a.a();
            }
            yVar.f19708j = lVar.f17906e;
            yVar.f19709k = wVar.f17951c;
            yVar.f19707i = lVar.f17904c;
            yVar.f19706h = user;
            yVar.n = lVar.f17907f;
            yVar.o = lVar.f17905d;
            yVar.p = wVar.f17956h;
            yVar.s = true;
            yVar.f13611c = true;
            yVar.u = lVar.f17909h;
            if (lVar.f17910i != null) {
                yVar.t = lVar.f17910i;
            } else {
                yVar.t = GiftManager.inst().findGiftById(wVar.f17954f);
            }
            yVar.v = wVar.u;
            arrayList.add(yVar);
        }
        return arrayList;
    }
}
