package com.ss.android.ugc.aweme.live;

import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.x;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;

public final class ap implements o {
    static {
        Covode.recordClassIndex(69403);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static ap f108329a = new ap();

        static {
            Covode.recordClassIndex(69404);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.o
    public final void a(x xVar) {
        ISlotService iSlotService = (ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class);
        if (iSlotService != null) {
            iSlotService.registerAggregateSlot(xVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.o
    public final void a(y yVar) {
        ISlotService iSlotService = (ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class);
        if (iSlotService != null) {
            if (!iSlotService.isBizTypeRegistered(yVar.c())) {
                iSlotService.registerSlot(yVar);
                return;
            }
            throw new IllegalStateException("The bizType can not register to LiveSlot twice!");
        }
    }
}
