package com.ss.android.ugc.aweme.tcm.impl.anchor;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class GetContainerDataMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f138565b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f138566c = "getContainerData";

    static {
        Covode.recordClassIndex(90657);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f138566c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetContainerDataMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        jSONObject2.put("group_id", repo.getString("group_id", ""));
        jSONObject2.put("anchor_extra", repo.getString("anchor_extra", ""));
        aVar.a((Object) jSONObject2);
    }
}
