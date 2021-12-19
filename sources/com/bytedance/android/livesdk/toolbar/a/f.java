package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import com.bytedance.android.live.design.view.b;
import com.bytedance.android.live.gift.h;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.toolbar.d;
import com.bytedance.android.livesdk.toolbar.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.b.a;

public final class f implements com.bytedance.android.live.p.f {

    /* renamed from: a  reason: collision with root package name */
    e f21681a;

    /* renamed from: b  reason: collision with root package name */
    DataChannel f21682b;

    /* renamed from: c  reason: collision with root package name */
    final a f21683c = new a();

    /* renamed from: d  reason: collision with root package name */
    Boolean f21684d = false;

    /* renamed from: e  reason: collision with root package name */
    final b f21685e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    final f.a.d.f<h> f21686f = new h(this);

    static {
        Covode.recordClassIndex(12786);
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

    public f(DataChannel dataChannel) {
        this.f21682b = dataChannel;
    }

    public final void onClick(View view) {
        i iVar;
        if (this.f21682b != null) {
            com.bytedance.android.livesdk.gift.d.h hVar = new com.bytedance.android.livesdk.gift.d.h();
            hVar.f17851b = "icon";
            this.f21682b.c(t.class, hVar);
        }
        DataChannel dataChannel = this.f21682b;
        if (dataChannel != null) {
            dataChannel.c(s.class);
            if (((Boolean) this.f21682b.b(ee.class)).booleanValue()) {
                Room room = (Room) this.f21682b.b(df.class);
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = i.VIDEO;
                }
                b.a.a("livesdk_anchor_gift_click").a(this.f21682b).a("live_type", j.a(iVar)).b();
            }
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f21684d = (Boolean) dataChannel.b(ea.class);
        g.c(new i(this, view, dataChannel));
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        e eVar = this.f21681a;
        if (eVar != null) {
            eVar.f21705g = "daily";
            eVar.f21706h = null;
            d dVar = eVar.f21700b;
            if (dVar != null) {
                dVar.f21696b = null;
                dVar.f21697c.a();
            }
            eVar.f21702d.a();
        }
        this.f21683c.a();
    }
}
