package com.bytedance.android.live.liveinteract.multiguest.c;

import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.platform.b.b;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@f(a = "LINK_LOGGER")
public final class a extends b {
    static {
        Covode.recordClassIndex(6003);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.b.b
    public final void e() {
        super.e();
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnStartSuccess", "position:LinkIn_Anchor");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void k(Map<String, Object> map) {
        l.d(map, "");
        super.k(map);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void i(Map<String, Object> map) {
        l.d(map, "");
        super.i(map);
        LinkApi.e eVar = (LinkApi.e) map.get("source");
        if (eVar != null) {
            l.d(eVar, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "support_vendor", "12");
            com.bytedance.android.live.core.d.a.a(jSONObject, "turn_on_source", eVar.value);
            i.a(i.f11979j, true, "init_request", jSONObject);
            i.f11971a = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void j(Map<String, Object> map) {
        l.d(map, "");
        super.j(map);
        LinkApi.e eVar = (LinkApi.e) map.get("source");
        Object obj = map.get("response");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (eVar != null) {
            l.d(eVar, "");
            l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "response", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "turn_on_source", eVar.value);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - i.f11971a);
            i.a(i.f11979j, true, "init_succeed", jSONObject);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void c(Throwable th, Map<String, Object> map) {
        l.d(map, "");
        super.c(th, map);
        LinkApi.e eVar = (LinkApi.e) map.get("source");
        if (eVar != null) {
            i.a(eVar, th);
        }
    }
}
