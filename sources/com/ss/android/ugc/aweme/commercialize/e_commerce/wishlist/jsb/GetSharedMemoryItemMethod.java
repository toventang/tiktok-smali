package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class GetSharedMemoryItemMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73886b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f73887c = "getSharedMemoryItem";

    static {
        Covode.recordClassIndex(45518);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45519);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f73887c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSharedMemoryItemMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            aVar.a(com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.a.f73894a, 1, null);
        } catch (Exception e2) {
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
