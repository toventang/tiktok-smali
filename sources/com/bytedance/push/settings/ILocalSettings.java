package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ILocalSettings {
    static {
        Covode.recordClassIndex(25832);
    }

    void registerValChanged(Context context, String str, String str2, a aVar);

    void unregisterValChanged(a aVar);
}
