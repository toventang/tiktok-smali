package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.utils.d;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a implements IAVMobService {
    static {
        Covode.recordClassIndex(79889);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, Map<String, String> map) {
        l.d(str, "");
        d.a(str, map);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, JSONObject jSONObject) {
        l.d(str, "");
        d.a(str, jSONObject);
    }
}
