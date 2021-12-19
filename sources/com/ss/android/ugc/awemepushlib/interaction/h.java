package com.ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.b;
import com.ss.android.ug.bus.a.a;
import com.ss.android.ug.bus.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class h implements b {
    static {
        Covode.recordClassIndex(95102);
    }

    h() {
    }

    @Override // com.bytedance.push.c.b
    public final String a() {
        com.ss.android.ugc.aweme.account.b.a();
        return com.ss.android.ugc.aweme.account.b.f62864a.e().getCurSecUserId();
    }

    @Override // com.bytedance.push.c.b
    public final List<String> b() {
        a aVar = (a) com.ss.android.ug.bus.b.a(a.class);
        if (aVar == null) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        aVar.a(new a.AbstractC1346a() {
            /* class com.ss.android.ugc.awemepushlib.interaction.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95103);
            }

            @Override // com.ss.android.ug.bus.a.a.AbstractC1346a
            public final void a() {
                countDownLatch.countDown();
            }

            @Override // com.ss.android.ug.bus.a.a.AbstractC1346a
            public final void a(List<com.ss.android.ug.bus.a.b.a> list) {
                for (com.ss.android.ug.bus.a.b.a aVar : list) {
                    arrayList.add(aVar.f61866b);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.bytedance.push.c.b
    public final void a(c.a<com.ss.android.ug.bus.a.a.a> aVar) {
        c.a(null, aVar);
    }

    @Override // com.bytedance.push.c.b
    public final void b(c.a<com.ss.android.ug.bus.a.a.b> aVar) {
        c.a(null, aVar);
    }

    @Override // com.bytedance.push.c.b
    public final void c(c.a<com.ss.android.ug.bus.a.a.c> aVar) {
        c.a(null, aVar);
    }
}
