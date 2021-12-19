package com.bytedance.android.livesdk.container.i;

import android.view.View;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface b<V extends View> {
    static {
        Covode.recordClassIndex(9321);
    }

    void a(V v, String str, JSONObject jSONObject);
}
