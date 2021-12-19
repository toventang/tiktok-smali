package com.bytedance.ies.android.base.runtime.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IPermissionDepend {
    static {
        Covode.recordClassIndex(18663);
    }

    boolean requestPermission(Activity activity, IPermissionRequestCallback iPermissionRequestCallback, String... strArr);
}
