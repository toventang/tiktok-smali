package com.ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IEvent {
    static {
        Covode.recordClassIndex(98038);
    }

    void onEvent(String str, JSONObject jSONObject);
}
