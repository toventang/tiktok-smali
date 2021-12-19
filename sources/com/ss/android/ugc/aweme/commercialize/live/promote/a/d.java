package com.ss.android.ugc.aweme.commercialize.live.promote.a;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class d implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74689a = new a((byte) 0);

    static {
        Covode.recordClassIndex(46050);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar) {
        l.d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IFrameSlot.b> b() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final String c() {
        return "PromoteLiveSlotProvider";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46051);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_BROADCAST_PREVIEW_PROMOTE);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        return new c(context);
    }
}
