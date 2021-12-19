package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class LoadGeckoResourcesMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68881b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68882c = "loadGeckoResources";

    static {
        Covode.recordClassIndex(42452);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42453);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68882c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadGeckoResourcesMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        e a2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("channels")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                l.b(optString, "");
                arrayList.add(optString);
            }
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (!(f2 == null || (a2 = f2.a()) == null)) {
                a2.c(arrayList);
            }
        }
    }
}
