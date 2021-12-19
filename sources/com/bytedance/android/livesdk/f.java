package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.android.livesdkapi.ws.b;
import com.bytedance.android.livesdkapi.ws.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f17210a;

    static {
        Covode.recordClassIndex(9550);
    }

    @Override // com.bytedance.android.livesdkapi.ws.d
    public final void a(LiveWsMessage liveWsMessage) {
        d dVar = this.f17210a;
        if (dVar != null) {
            dVar.a(liveWsMessage);
        }
    }

    @Override // com.bytedance.android.livesdkapi.ws.d
    public final void a(b bVar, JSONObject jSONObject) {
        d dVar = this.f17210a;
        if (dVar != null) {
            dVar.a(bVar, jSONObject);
        }
    }
}
