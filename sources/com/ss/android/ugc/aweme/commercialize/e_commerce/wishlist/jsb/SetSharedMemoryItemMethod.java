package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class SetSharedMemoryItemMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73890b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f73891c = "setSharedMemoryItem";

    static {
        Covode.recordClassIndex(45522);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45523);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f73891c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetSharedMemoryItemMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                l.b(next, "");
                l.b(optString, "");
                l.d(next, "");
                l.d(optString, "");
                com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.a.f73894a.put(next, optString);
            }
            aVar.a(null, 1, null);
        } catch (Exception e2) {
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
