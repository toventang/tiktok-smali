package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.hashtag.f;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.dd;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel f18197a;

    static {
        Covode.recordClassIndex(10103);
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

    public final void onClick(View view) {
        DataChannel dataChannel = this.f18197a;
        if (dataChannel == null) {
            l.a("dataChannel");
        }
        i iVar = (i) dataChannel.b(ao.class);
        if (iVar != null) {
            f.a.a(iVar, "Broadcast", null);
        }
        b<Boolean> bVar = a.cw;
        l.b(bVar, "");
        c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
        DataChannel dataChannel2 = this.f18197a;
        if (dataChannel2 == null) {
            l.a("dataChannel");
        }
        dataChannel2.c(dd.class);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_more_topic_click");
        DataChannel dataChannel3 = this.f18197a;
        if (dataChannel3 == null) {
            l.a("dataChannel");
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a(dataChannel3);
        DataChannel dataChannel4 = this.f18197a;
        if (dataChannel4 == null) {
            l.a("dataChannel");
        }
        com.bytedance.android.livesdk.ab.c.a(a3, dataChannel4).a("event_belong", "live_take").b();
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f18197a = dataChannel;
        com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.TOPICS;
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = a.cw;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        lVar.setRedDotVisible(dataChannel, a2.booleanValue());
    }
}
