package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f17792a = new e();

    static {
        Covode.recordClassIndex(9876);
    }

    private e() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        com.bytedance.android.livesdk.event.f fVar = (com.bytedance.android.livesdk.event.f) obj;
        if (fVar != null && fVar.f17191a != null) {
            com.bytedance.android.livesdk.event.e eVar = fVar.f17191a;
            f.a.f23366a.a().a(new Event("live_room_notify_widget", 1280, b.MessageReceived));
            eVar.f17190d.f23299c.X = "live_detail";
            a.a().a(new com.bytedance.android.livesdk.event.e(eVar.f17189c, eVar.f17190d));
        }
    }
}
