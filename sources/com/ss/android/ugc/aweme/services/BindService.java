package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.cc;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.ct;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import java.util.ArrayList;

public class BindService extends BaseBindService implements au {
    private cc mVerificationService;

    static {
        Covode.recordClassIndex(79432);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public void setAuthorzieBindResult(ct ctVar) {
    }

    public void showThirdPartyAccountManagerActivity(Activity activity) {
    }

    public cc getVerificationService() {
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    public static void com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Activity activity, Intent intent) {
        a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        super.changeUnverifiedEmail(activity, str, bundle2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        CommonFlowActivity.a.a(activity, k.INPUT_EMAIL_CHANGE, j.CHANGE_EMAIL, bundle2, null, null, false);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
        super.unbindPhone(activity, arrayList, str);
        l.d(activity, "");
        l.d(arrayList, "");
        l.d(str, "");
        SmartRouter.buildRoute(activity, "//account/phone_or_email/unbind").withParam("enter_from", str).withParam("current_scene", j.UNBIND_PHONE.getValue()).withParam("next_page", k.UNBIND_PHONE_CONFIRM.getValue()).withParam("extra_eligible_login_methods", arrayList).open();
    }

    static final /* synthetic */ void lambda$setPassword$1$BindService(IAccountService.g gVar, int i2, int i3, Object obj) {
        if (gVar != null) {
            gVar.onResult(i2, 1, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        bindMobile(activity, str, "", bundle, gVar);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        modifyMobileInner(activity, str, bundle, 0, gVar);
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        modifyMobileInner(activity, str, bundle, 1, gVar);
    }

    @Override // com.ss.android.ugc.aweme.bj
    public void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        modifyMobileInner(activity, str, bundle, 2, gVar);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.changeEmail(activity, str, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        e.a(bundle2, cj.f().getEmail());
        CommonFlowActivity.a.a(activity, k.VERIFY_EMAIL_BEFORE_CHANGE, j.CHANGE_EMAIL, bundle2, gVar, null, false);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmail(activity, str, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        e.a(bundle2, cj.f().getEmail());
        CommonFlowActivity.a.a(activity, k.CONFIRM_EMAIL_BEFORE_VERIFY, j.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
        super.unbindEmail(activity, z, arrayList, str);
        l.d(activity, "");
        l.d(arrayList, "");
        l.d(str, "");
        SmartRouter.buildRoute(activity, "//account/phone_or_email/unbind").withParam("enter_from", str).withParam("current_scene", j.UNBIND_EMAIL.getValue()).withParam("next_page", k.UNBIND_EMAIL_CONFIRM.getValue()).withParam("is_email_verified", z).withParam("extra_eligible_login_methods", arrayList).open();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("use_phone", true);
        bundle2.putBoolean("use_email", true);
        bindMobile(activity, str, str2, bundle2, gVar);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        bindMobileOrEmail(activity, str, str2, bundle, new BindService$$Lambda$0(this, gVar, activity, str, str2));
    }

    public void setPassword(Activity activity, String str, String str2, String str3, IAccountService.g gVar) {
        cj.f71084b.i().setPasswordForMT(activity, str, str2, str3, null, new BindService$$Lambda$1(gVar));
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.bindEmail(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        if (str2 != null) {
            bundle2.putString("enter_method", str2);
        }
        CommonFlowActivity.a.a(activity, k.INPUT_EMAIL_BIND, j.BIND_EMAIL, bundle2, gVar, null, false);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        e.a(bundle2, cj.f().getEmail());
        CommonFlowActivity.a.a(activity, k.VERIFY_EMAIL_FOR_TICKET, j.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        e.b(bundle2, cj.f().getBindPhone());
        CommonFlowActivity.a.a(activity, k.VERIFY_PHONE_FOR_TICKET, j.VERIFY, bundle2, gVar, null, false);
    }

    private void modifyMobileInner(Activity activity, String str, Bundle bundle, int i2, IAccountService.g gVar) {
        k kVar;
        super.modifyMobile(activity, str, bundle, gVar);
        l.d(activity, "");
        if (i2 == 1) {
            kVar = k.EMAIL_SMS_VERIFY;
        } else if (i2 != 2) {
            kVar = k.PHONE_SMS_VERIFY;
        } else {
            kVar = k.VERIFY_PASSWORD;
        }
        Intent putExtra = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", j.MODIFY_PHONE.getValue()).putExtra("next_page", kVar.getValue()).putExtra("enter_method", "change_bind_phone_click");
        l.b(putExtra, "");
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(activity, putExtra);
    }

    @Override // com.ss.android.ugc.aweme.bj, com.ss.android.ugc.aweme.services.BaseBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        super.bindMobile(activity, str, str2, bundle, gVar);
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i2 = bundle.getInt("current_scene", -1);
        if (i2 != -1) {
            bundle.putInt("last_scene", i2);
            bundle.remove("current_scene");
            bundle.remove("next_page");
            bundle.remove("current_page");
        }
        l.d(activity, "");
        Intent putExtra = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", j.BIND_PHONE.getValue()).putExtra("next_page", k.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
        l.b(putExtra, "");
        putExtra.putExtras(bundle);
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("enter_method", str2);
        }
        com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(activity, putExtra);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        e.a(bundle2, str3);
        CommonFlowActivity.a.a(activity, k.VERIFY_EMAIL_FOR_TICKET, j.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        e.b(bundle2, str3);
        CommonFlowActivity.a.a(activity, k.VERIFY_PHONE_FOR_TICKET, j.VERIFY, bundle2, gVar, null, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$bindMobileOrEmailAndSetPwd$0$BindService(final IAccountService.g gVar, final Activity activity, final String str, final String str2, final int i2, final int i3, final Object obj) {
        if (i3 == 1) {
            if (i2 != 7) {
                if (0 == 0) {
                    cj.f71084b.e().getSetPasswordStatus(new cv("email") {
                        /* class com.ss.android.ugc.aweme.services.BindService.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(79435);
                        }

                        @Override // com.ss.android.ugc.aweme.cv
                        public void onUpdateSuccess(boolean z) {
                            if (!z) {
                                BindService.this.setPassword(activity, "email", str, str2, gVar);
                                return;
                            }
                            IAccountService.g gVar = gVar;
                            if (gVar != null) {
                                gVar.onResult(i2, i3, obj);
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.cv
                        public void onUpdateFailed(String str) {
                            if (!cj.f71084b.e().hasCurUserSetPassword()) {
                                BindService.this.setPassword(activity, "email", str, str2, gVar);
                                return;
                            }
                            IAccountService.g gVar = gVar;
                            if (gVar != null) {
                                gVar.onResult(i2, i3, obj);
                            }
                        }
                    });
                    return;
                }
            }
            if (gVar != null) {
                gVar.onResult(i2, i3, obj);
            }
        } else if (gVar != null) {
            gVar.onResult(i2, i3, obj);
        }
    }
}
