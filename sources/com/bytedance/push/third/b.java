package com.bytedance.push.third;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(25876);
    }

    boolean checkThirdPushConfig(String str, Context context);

    boolean isPushAvailable(Context context, int i2);

    void registerPush(Context context, int i2);

    void setAlias(Context context, String str, int i2);

    void trackPush(Context context, int i2, Object obj);

    void unregisterPush(Context context, int i2);
}
