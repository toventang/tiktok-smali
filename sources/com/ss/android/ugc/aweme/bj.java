package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import java.util.ArrayList;

public interface bj {

    public interface a {
        static {
            Covode.recordClassIndex(42308);
        }
    }

    static {
        Covode.recordClassIndex(42307);
    }

    void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar);

    void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar);

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar);

    void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar);

    void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar);

    void changeUnverifiedEmail(Activity activity, String str, Bundle bundle);

    Intent getAuthorizeActivityStartIntent(Context context);

    boolean isPlatformBound(String str);

    void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar);

    void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar);

    void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, IAccountService.g gVar);

    void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str);

    void unbindPhone(Activity activity, ArrayList<String> arrayList, String str);

    void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar);
}
