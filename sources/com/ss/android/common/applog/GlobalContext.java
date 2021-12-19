package com.ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class GlobalContext {
    private static Context mContext;

    static {
        Covode.recordClassIndex(36593);
    }

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
