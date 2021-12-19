package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.view.View;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class i implements f {
    static {
        Covode.recordClassIndex(9075);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
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

    public final void onClick(View view) {
        a.a().a(new r(6));
        c.a.a("ttlive_click_close_room").a();
    }
}
