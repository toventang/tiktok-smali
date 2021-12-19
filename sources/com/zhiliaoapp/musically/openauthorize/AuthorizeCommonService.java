package com.zhiliaoapp.musically.openauthorize;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.b;

public class AuthorizeCommonService implements IAuthorizeCommonService {
    static {
        Covode.recordClassIndex(103930);
    }

    public static IAuthorizeCommonService a() {
        MethodCollector.i(2078);
        Object a2 = b.a(IAuthorizeCommonService.class, false);
        if (a2 != null) {
            IAuthorizeCommonService iAuthorizeCommonService = (IAuthorizeCommonService) a2;
            MethodCollector.o(2078);
            return iAuthorizeCommonService;
        }
        if (b.eN == null) {
            synchronized (IAuthorizeCommonService.class) {
                try {
                    if (b.eN == null) {
                        b.eN = new AuthorizeCommonService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2078);
                    throw th;
                }
            }
        }
        AuthorizeCommonService authorizeCommonService = (AuthorizeCommonService) b.eN;
        MethodCollector.o(2078);
        return authorizeCommonService;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService
    public boolean isActivityAwemeAuthorize(Activity activity) {
        if ((activity instanceof AwemeAuthorizedActivity) || (activity instanceof AwemeAuthorizeLoginActivity)) {
            return true;
        }
        return false;
    }
}
