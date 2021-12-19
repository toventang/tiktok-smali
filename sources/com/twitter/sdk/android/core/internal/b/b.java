package com.twitter.sdk.android.core.internal.b;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(103625);
    }

    SharedPreferences a();

    boolean a(SharedPreferences.Editor editor);

    SharedPreferences.Editor b();
}
