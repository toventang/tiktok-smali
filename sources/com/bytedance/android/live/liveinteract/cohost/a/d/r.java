package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.cohost.c.b;
import com.bytedance.android.live.liveinteract.platform.common.g.a;
import com.bytedance.android.live.liveinteract.platform.common.g.e;
import com.bytedance.android.live.liveinteract.platform.common.g.p;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10147a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10148b;

    static {
        Covode.recordClassIndex(5328);
    }

    r(d dVar, long j2) {
        this.f10147a = dVar;
        this.f10148b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10147a;
        long j2 = this.f10148b;
        a.a("LinkCross_TurnOnEngine_Timeout", "timeout:".concat(String.valueOf(j2)));
        if (!dVar.f10120d.a(k.CONNECTION_SUCCEED)) {
            p.a(p.f11999b, j2);
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 103L);
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", 103000 + j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_detail", "time_out:".concat(String.valueOf(j2)));
            b bVar = b.f10210e;
            b.a((b) "rtc_time_out", (String) jSONObject, (JSONObject) 0);
            v.a(e.a(jSONObject));
            ((d.a) dVar.y).a(208);
        }
    }
}
