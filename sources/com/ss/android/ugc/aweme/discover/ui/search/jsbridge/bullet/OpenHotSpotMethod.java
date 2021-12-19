package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenHotSpotMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82675b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82676c = "openHotspot";

    static {
        Covode.recordClassIndex(51494);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51495);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82676c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHotSpotMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Bundle bundle = new Bundle();
        JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    bundle.putString(next, opt.toString());
                }
            }
            String optString = jSONObject.optString("aweme_id");
            String optString2 = jSONObject.optString("trending_event_id");
            String optString3 = jSONObject.optString("trending_event_name");
            bundle.putString("id", optString);
            bundle.putString("trending_event_id", optString2);
            bundle.putString("trending_event_name", optString3);
        }
        c.a(new com.ss.android.ugc.aweme.discover.e.i(bundle));
        aVar.a(new JSONArray());
    }
}
