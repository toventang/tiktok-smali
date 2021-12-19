package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class i implements IAdThirdTrackerDepend {
    static {
        Covode.recordClassIndex(45423);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend
    public final void track(String str, List<String> list, Long l2, String str2, JSONObject jSONObject) {
        l.d(str, "");
        aj.a(str, list, l2, str2, jSONObject, null);
    }
}
