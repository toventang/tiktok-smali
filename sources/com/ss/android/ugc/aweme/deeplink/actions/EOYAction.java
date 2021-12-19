package com.ss.android.ugc.aweme.deeplink.actions;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import h.f.b.l;
import h.p;
import h.z;
import java.util.HashMap;

public final class EOYAction extends b<z> {
    static {
        Covode.recordClassIndex(49335);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("outerUrl", str);
        return new p<>("//eoy/", hashMap2);
    }
}
