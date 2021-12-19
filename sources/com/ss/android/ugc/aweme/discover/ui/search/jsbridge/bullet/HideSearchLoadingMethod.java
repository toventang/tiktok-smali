package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.e.g;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class HideSearchLoadingMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82654b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82655c = "hideSearchLoading";

    static {
        Covode.recordClassIndex(51483);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51484);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82655c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HideSearchLoadingMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("page");
            l.b(optString, "");
            c.a(new g(optString));
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            aVar.a(0, e2.getMessage());
        }
    }
}
