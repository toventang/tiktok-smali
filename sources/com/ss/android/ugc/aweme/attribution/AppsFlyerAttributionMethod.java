package com.ss.android.ugc.aweme.attribution;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class AppsFlyerAttributionMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f67081a = new a((byte) 0);

    static {
        Covode.recordClassIndex(41329);
    }

    private AppsFlyerAttributionMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41330);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ AppsFlyerAttributionMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public AppsFlyerAttributionMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject optJSONObject;
        Iterator<String> keys;
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.optString("event_name", "");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(jSONObject == null || !jSONObject.has("params") || (optJSONObject = jSONObject.optJSONObject("params")) == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                l.b(next, "");
                l.b(opt, "");
                linkedHashMap.put(next, opt);
            }
        }
        UgCommonServiceImpl.j().a().a(str, linkedHashMap);
        if (aVar != null) {
            aVar.a("");
        }
    }
}
