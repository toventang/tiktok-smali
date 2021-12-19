package com.ss.android.ugc.aweme.commercialize.live.business.links.c;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final C1691a f74600a = new C1691a((byte) 0);

    static {
        Covode.recordClassIndex(45996);
    }

    @Override // com.bytedance.android.live.slot.y
    public final String c() {
        return "commercialize_live_business_links";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a$a  reason: collision with other inner class name */
    public static final class C1691a {
        static {
            Covode.recordClassIndex(45997);
        }

        private C1691a() {
        }

        public /* synthetic */ C1691a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IFrameSlot.b> b() {
        return n.c(IFrameSlot.b.SLOT_LIVE_BOTTOM_POP);
    }

    @Override // com.bytedance.android.live.slot.y
    public final List<IIconSlot.b> a() {
        return n.c(IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR, IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> a(Context context, IFrameSlot.b bVar) {
        l.d(context, "");
        if (bVar != null && b.f74605a[bVar.ordinal()] == 1) {
            return new com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a();
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.y
    public final ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> a(Context context, IIconSlot.b bVar) {
        l.d(context, "");
        if (bVar == null) {
            return null;
        }
        int i2 = b.f74606b[bVar.ordinal()];
        if (i2 == 1) {
            return new com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a();
        }
        if (i2 == 2) {
            return new com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a();
        }
        if (i2 != 3) {
            return null;
        }
        return new com.ss.android.ugc.aweme.commercialize.live.business.links.a.b.a();
    }
}
