package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface ISettings {
    static {
        Covode.recordClassIndex(25833);
    }

    void registerValChanged(Context context, String str, String str2, a aVar);

    void unregisterValChanged(a aVar);

    void updateSettings(Context context, JSONObject jSONObject);
}
