package com.ss.android.ugc.aweme.bullet.bridge.commerce;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class AsyncGoodsEditInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68932b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68933c = "asyncGoodsEditInfo";

    static {
        Covode.recordClassIndex(42485);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68933c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncGoodsEditInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        com.ss.android.ugc.aweme.common.a aVar2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        l.b(optString, "");
        hashMap.put("shop_draft_id", optString);
        if (optString.length() == 0) {
            aVar2 = null;
        } else {
            int type = ab.SHOP.getTYPE();
            String b2 = new f().b(hashMap);
            l.b(b2, "");
            aVar2 = new com.ss.android.ugc.aweme.common.a(type, b2, optString2, "", 1, null, null, false, null, null, null, null, null, 8160, null);
        }
        c.a(new com.ss.android.ugc.aweme.commercialize.b.a(aVar2));
    }
}
