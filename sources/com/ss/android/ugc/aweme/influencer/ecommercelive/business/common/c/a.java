package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final C2664a f104557a = new C2664a((byte) 0);

    static {
        Covode.recordClassIndex(66986);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final String c() {
        return "ecommerce_shop_influencer";
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.a$a  reason: collision with other inner class name */
    public static final class C2664a {
        static {
            Covode.recordClassIndex(66987);
        }

        private C2664a() {
        }

        public /* synthetic */ C2664a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IFrameSlot.b> b() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        int i2 = b.f104558a[bVar.ordinal()];
        if (i2 == 1) {
            return new b(context);
        }
        if (i2 != 2) {
            return null;
        }
        return new com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b(context);
    }
}
