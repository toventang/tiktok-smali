package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class SaveSearchHistoryAndGoDetail extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82701b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82702c = "saveSearchHistoryAndGoDetail";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82703d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(51511);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51512);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82703d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82702c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82703d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveSearchHistoryAndGoDetail(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("search_keyword", "");
        String optString2 = jSONObject.optString("uid", "");
        String optString3 = jSONObject.optString("sec_uid", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
            l.b(optString, "");
            l.b(optString2, "");
            l.b(optString3, "");
            c.a(new com.ss.android.ugc.aweme.discover.e.b(optString, optString2, optString3));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
