package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.e;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.en;
import com.zhiliaoapp.musically.R;

public class ImplService implements IImplService {
    static {
        Covode.recordClassIndex(65510);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public boolean enableExpressionTab() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public boolean isMtCase() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public boolean needAwemeMsgShowFollow() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public boolean needSessionListShowMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public boolean isUserVerified(IMUser iMUser) {
        if (!TextUtils.isEmpty(iMUser.getCustomVerify())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public void setupStatusBar(Activity activity) {
        setStatusBarColor(activity, b.c(activity, R.color.nd));
        setLightStatusBar(activity);
    }

    private static void setLightStatusBar(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService
    public a getRelationListAdapter(boolean z) {
        if (!en.b()) {
            return new g();
        }
        if (z) {
            return new e();
        }
        return new f();
    }

    public static IImplService createIImplServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(6137);
        Object a2 = com.ss.android.ugc.b.a(IImplService.class, z);
        if (a2 != null) {
            IImplService iImplService = (IImplService) a2;
            MethodCollector.o(6137);
            return iImplService;
        }
        if (com.ss.android.ugc.b.bz == null) {
            synchronized (IImplService.class) {
                try {
                    if (com.ss.android.ugc.b.bz == null) {
                        com.ss.android.ugc.b.bz = new ImplService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6137);
                    throw th;
                }
            }
        }
        ImplService implService = (ImplService) com.ss.android.ugc.b.bz;
        MethodCollector.o(6137);
        return implService;
    }

    private static void setStatusBarColor(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        com.bytedance.ies.uikit.c.a.a(activity, i2);
    }
}
