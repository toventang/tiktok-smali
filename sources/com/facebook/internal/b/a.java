package com.facebook.internal.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

public interface a extends Serializable {
    static {
        Covode.recordClassIndex(29286);
    }

    JSONObject convertToJSONObject();

    String getEventName();

    b getLogCategory();
}
