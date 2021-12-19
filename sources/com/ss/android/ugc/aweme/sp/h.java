package com.ss.android.ugc.aweme.sp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;

public class h extends ContextWrapper {
    static {
        Covode.recordClassIndex(87676);
    }

    public h(Context context) {
        super(context);
    }

    public SharedPreferences getSharedPreferences(String str, int i2) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
    }
}
