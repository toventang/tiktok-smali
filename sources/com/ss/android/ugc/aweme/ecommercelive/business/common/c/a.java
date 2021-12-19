package com.ss.android.ugc.aweme.ecommercelive.business.common.c;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.a.c;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.d;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final C2132a f87990a = new C2132a((byte) 0);

    static {
        Covode.recordClassIndex(55316);
    }

    @Override // com.bytedance.android.live.slot.y
    public final String c() {
        return "ecommerce_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.c.a$a  reason: collision with other inner class name */
    public static final class C2132a {
        static {
            Covode.recordClassIndex(55317);
        }

        private C2132a() {
        }

        public /* synthetic */ C2132a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IFrameSlot.b> b() {
        if (c.a().f87741a) {
            return n.c(IFrameSlot.b.SLOT_LIVE_WATCHER_L2_POP);
        }
        return n.c(IFrameSlot.b.SLOT_LIVE_BOTTOM_POP);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        if (b.f87992b[bVar.ordinal()] != 1) {
            return null;
        }
        return new com.ss.android.ugc.aweme.ecommercelive.business.audience.c.c(context);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        int i2 = b.f87991a[bVar.ordinal()];
        if (i2 == 1) {
            return new d(context);
        }
        if (i2 == 2) {
            return new d(context);
        }
        if (i2 == 3) {
            return new d(context);
        }
        throw new h.n();
    }
}
