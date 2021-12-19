package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10140a;

    static {
        Covode.recordClassIndex(5321);
    }

    k(d dVar) {
        this.f10140a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10140a;
        Throwable th = (Throwable) obj;
        if (!(th instanceof a) || ((com.bytedance.android.live.a.a.a) th).getErrorCode() != 0) {
            ((d.a) dVar.y).b(false);
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", "battle_icon_show_error");
            com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", b.a.a().f9940e);
            com.bytedance.android.live.liveinteract.match.c.a.a(th, jSONObject);
            com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject);
            return;
        }
        ((d.a) dVar.y).b(true);
    }
}
