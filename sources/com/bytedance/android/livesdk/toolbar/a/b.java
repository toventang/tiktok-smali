package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.l;
import com.bytedance.android.live.gift.p;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.gift.b.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.r.i;
import com.bytedance.android.livesdk.toolbar.a;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DataChannel f21673a;

    static {
        Covode.recordClassIndex(12782);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    public b(DataChannel dataChannel) {
        this.f21673a = dataChannel;
    }

    public final void onClick(View view) {
        Room room;
        boolean z;
        DataChannel dataChannel = this.f21673a;
        boolean z2 = false;
        if (dataChannel != null) {
            z = ((Boolean) dataChannel.b(ee.class)).booleanValue();
            room = (Room) this.f21673a.b(df.class);
        } else {
            room = null;
            z = false;
        }
        if (!(room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift())) {
            z2 = true;
        }
        if (com.bytedance.android.livesdk.gift.b.b.a(z, true, z2) != b.a.TOAST) {
            DataChannel dataChannel2 = this.f21673a;
            if (dataChannel2 != null) {
                dataChannel2.c(p.class);
            }
        } else if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
            ao.a(y.e(), room.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
            DataChannel dataChannel3 = this.f21673a;
            if (dataChannel3 != null) {
                dataChannel3.c(l.class, true);
            }
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        MethodCollector.i(9935);
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null && bool.booleanValue()) {
            a.a(view);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(new i(view.getContext(), dataChannel));
        frameLayout.setClipChildren(false);
        view.setAlpha(0.5f);
        MethodCollector.o(9935);
    }
}
