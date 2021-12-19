package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.Collection;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f22761a;

    static {
        Covode.recordClassIndex(13414);
    }

    public static void a(by byVar, long j2) {
        b bVar;
        com.bytedance.android.livesdk.model.message.c.b bVar2;
        u findGiftById = GiftManager.inst().findGiftById(j2);
        if (!(findGiftById == null || byVar == null || (bVar = byVar.O) == null || (bVar2 = bVar.f23218j) == null || com.bytedance.common.utility.collection.b.a((Collection) bVar2.f19424d))) {
            for (d dVar : bVar2.f19424d) {
                l.b(dVar, "");
                if (dVar.f19437e != null) {
                    dVar.f19437e.f19444d = findGiftById;
                    return;
                }
            }
        }
    }
}
