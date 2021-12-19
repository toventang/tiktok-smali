package com.ss.android.ugc.aweme.live.slot;

import android.content.Context;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.u;
import com.bytedance.android.live.slot.x;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements x {
    static {
        Covode.recordClassIndex(69593);
    }

    @Override // com.bytedance.android.live.slot.x
    public final String b() {
        return "aggregate_live_business";
    }

    @Override // com.bytedance.android.live.slot.x
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.x
    public final u<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        if (bVar == null) {
            return null;
        }
        int i2 = b.f108576a[bVar.ordinal()];
        if (i2 == 1) {
            return new c(IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR);
        }
        if (i2 != 2) {
            return null;
        }
        return new c(IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }
}
