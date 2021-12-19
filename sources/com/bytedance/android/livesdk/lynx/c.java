package com.bytedance.android.livesdk.lynx;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;

public interface c extends a {
    static {
        Covode.recordClassIndex(11107);
    }

    b create(Activity activity, Integer num, String str, d dVar, String str2);

    b createAndLoad(Activity activity, String str, Integer num, String str2, String str3, d dVar);

    Fragment createLynxFragment(Context context, Bundle bundle);

    void tryInitEnvIfNeeded();
}
