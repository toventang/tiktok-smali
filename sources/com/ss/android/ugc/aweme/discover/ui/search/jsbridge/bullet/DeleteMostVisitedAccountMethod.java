package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import h.f.b.l;
import org.json.JSONObject;

public final class DeleteMostVisitedAccountMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82646b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82647c = "deleteMostVisitedAccount";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82648d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(51476);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51477);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82648d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82647c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82648d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteMostVisitedAccountMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(optString)) {
            SuggestWordsApi.a aVar2 = new SuggestWordsApi.a();
            aVar2.f80823h = optString;
            SuggestWordsApi.b(aVar2);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
