package com.ss.android.ugc.aweme.framework.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IAuthorizeCommonService {
    static {
        Covode.recordClassIndex(61357);
    }

    boolean isActivityAwemeAuthorize(Activity activity);
}
