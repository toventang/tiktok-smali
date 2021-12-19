package com.ss.android.ugc.aweme.bullet.bridge.commerce;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import org.json.JSONObject;

public final class FetchFeedsAwemeDataMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68934b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68935c = "fetchFeedsAwemeData";

    static {
        Covode.recordClassIndex(42487);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42488);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68935c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchFeedsAwemeDataMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("item_id");
            if (!TextUtils.isEmpty(optString)) {
                aVar.a((Object) new JSONObject().put("aweme", dg.a().b(com.ss.android.ugc.aweme.commerce.service.a.a().getAwemeById(optString))));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
