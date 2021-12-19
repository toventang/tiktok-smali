package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.b.c;
import java.util.List;
import org.json.JSONObject;

public interface IHostFrameworkDepend {
    static {
        Covode.recordClassIndex(21414);
    }

    void addObserverEvent(c cVar, String str, List<String> list, List<? extends JSONObject> list2);

    String getContainerID(c cVar);
}
