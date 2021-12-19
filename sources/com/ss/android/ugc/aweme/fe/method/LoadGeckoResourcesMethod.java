package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class LoadGeckoResourcesMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91091a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57305);
    }

    private LoadGeckoResourcesMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57306);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ LoadGeckoResourcesMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public LoadGeckoResourcesMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
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
