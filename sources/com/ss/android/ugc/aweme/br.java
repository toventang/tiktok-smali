package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

public interface br {
    static {
        Covode.recordClassIndex(42345);
    }

    void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar);

    void setPassword(Activity activity, Bundle bundle, IAccountService.g gVar);

    void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar);

    void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.g gVar);
}
