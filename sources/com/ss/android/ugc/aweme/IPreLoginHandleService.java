package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface IPreLoginHandleService {
    static {
        Covode.recordClassIndex(38381);
    }

    Intent a(Activity activity, Intent intent, String str);
}
