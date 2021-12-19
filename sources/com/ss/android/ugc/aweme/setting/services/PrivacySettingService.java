package com.ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.policy.a;
import com.ss.android.ugc.aweme.setting.services.IPrivacySettingService;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;

public class PrivacySettingService implements IPrivacySettingService {
    static {
        Covode.recordClassIndex(80510);
    }

    public static IPrivacySettingService a() {
        MethodCollector.i(8110);
        Object a2 = b.a(IPrivacySettingService.class, false);
        if (a2 != null) {
            IPrivacySettingService iPrivacySettingService = (IPrivacySettingService) a2;
            MethodCollector.o(8110);
            return iPrivacySettingService;
        }
        if (b.dO == null) {
            synchronized (IPrivacySettingService.class) {
                try {
                    if (b.dO == null) {
                        b.dO = new PrivacySettingService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8110);
                    throw th;
                }
            }
        }
        PrivacySettingService privacySettingService = (PrivacySettingService) b.dO;
        MethodCollector.o(8110);
        return privacySettingService;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IPrivacySettingService
    public final void b(Activity activity) {
        new a(activity).a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IPrivacySettingService
    public final boolean a(Activity activity) {
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "publish_privacy_account_confirm", 0);
        if (!com.ss.android.ugc.aweme.account.b.g().getCurUser().isAcceptPrivatePolicy()) {
            if (com.ss.android.ugc.aweme.account.b.g().getCurUser().isSecret()) {
                new a(activity).a();
                return false;
            } else if (a2 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IPrivacySettingService
    public final void a(Activity activity, IPrivacySettingService.a aVar) {
        int i2;
        int i3;
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "publish_privacy_account_confirm", 0);
        a.C0731a aVar2 = new a.C0731a(activity);
        if (a2 == 1) {
            i2 = R.string.s1;
        } else {
            i2 = R.string.s3;
        }
        a.C0731a a3 = aVar2.a(i2);
        if (a2 == 1) {
            i3 = R.string.s0;
        } else {
            i3 = R.string.s2;
        }
        a.C0731a b2 = a3.b(i3).a(activity.getString(R.string.eui), (DialogInterface.OnClickListener) new b(aVar), false).b(activity.getString(R.string.a9e), c.f122668a, false);
        b2.o = new d(activity);
        b2.a().c();
        r.a("account_privacy_show_notify", new d().f66730a);
    }
}
