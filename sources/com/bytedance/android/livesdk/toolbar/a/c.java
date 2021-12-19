package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.l;
import com.bytedance.android.live.gift.p;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.gift.b.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel f21674a;

    static {
        Covode.recordClassIndex(12783);
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

    public c(DataChannel dataChannel) {
        this.f21674a = dataChannel;
    }

    public final void onClick(View view) {
        Room room;
        boolean z;
        DataChannel dataChannel = this.f21674a;
        boolean z2 = false;
        if (dataChannel != null) {
            z = ((Boolean) dataChannel.b(ee.class)).booleanValue();
            room = (Room) this.f21674a.b(df.class);
        } else {
            room = null;
            z = false;
        }
        if (!(room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift())) {
            z2 = true;
        }
        if (b.a(z, true, z2) != b.a.TOAST) {
            DataChannel dataChannel2 = this.f21674a;
            if (dataChannel2 != null) {
                dataChannel2.c(p.class);
            }
        } else if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
            ao.a(y.e(), room.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
            DataChannel dataChannel3 = this.f21674a;
            if (dataChannel3 != null) {
                dataChannel3.c(l.class, true);
            }
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        View findViewById = view.findViewById(R.id.ens);
        if (findViewById != null) {
            findViewById.setAlpha(0.5f);
        }
        View findViewById2 = view.findViewById(R.id.enr);
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.3f);
        }
    }
}
