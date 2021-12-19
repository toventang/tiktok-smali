package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.f;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.b.c;
import h.z;
import java.util.Map;

public interface IHostLogDepend {
    static {
        Covode.recordClassIndex(21415);
    }

    void handleReportADLog(c cVar, String str, f fVar, IReportADLogResultCallback iReportADLogResultCallback, e eVar);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);

    z reportJSBError(c cVar, Map<String, ? extends Object> map);

    z reportJSBFetchError(c cVar, Map<String, ? extends Object> map);
}
