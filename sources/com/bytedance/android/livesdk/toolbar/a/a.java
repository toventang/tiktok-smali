package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Room f21671a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f21672b;

    static {
        Covode.recordClassIndex(12781);
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
        if (this.f21672b != null) {
            h hVar = new h();
            hVar.f17851b = "icon";
            this.f21672b.c(t.class, hVar);
        }
        DataChannel dataChannel = this.f21672b;
        if (dataChannel != null) {
            dataChannel.c(s.class);
            if (((Boolean) this.f21672b.b(ee.class)).booleanValue()) {
                b.a.a("livesdk_anchor_gift_click").a(this.f21672b).a("live_type", j.a(this.f21671a.getStreamType())).b();
            }
        }
    }

    public a(Room room, DataChannel dataChannel) {
        this.f21671a = room;
        this.f21672b = dataChannel;
    }
}
