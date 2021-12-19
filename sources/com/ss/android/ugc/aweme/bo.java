package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bean.d;
import com.ss.android.ugc.aweme.user.c;
import java.util.List;

public interface bo {

    public interface a {
        static {
            Covode.recordClassIndex(42325);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(42324);
    }

    List<d> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    Class<? extends Activity> getPushLoginActivityClass();

    boolean isEnableMultiAccountLogin();

    void loginByPlatform(IAccountService.c cVar, d dVar);

    void logout(String str, String str2);

    void logout(String str, String str2, a aVar);

    void openCountryListActivity(Activity activity, ax axVar);

    void saveDTicket(String str, String str2);

    void showLoginAndRegisterView(IAccountService.c cVar);

    void showLoginView(IAccountService.c cVar);

    void switchAccount(c cVar, Bundle bundle, bx bxVar);

    boolean toRecoverDeletedAccount(String str);

    void uploadAccountNum(boolean z);
}
