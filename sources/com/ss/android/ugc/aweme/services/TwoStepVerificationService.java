package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.account.login.twostep.c;
import com.ss.android.ugc.aweme.cb;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.i;
import java.util.HashMap;

public final class TwoStepVerificationService implements cb {
    public static final Companion Companion = new Companion(null);
    private static final String REPO_NAME = "2sv_enhancements";
    public static final h isNewTo2svEnhancements$delegate = i.a((a) TwoStepVerificationService$Companion$isNewTo2svEnhancements$2.INSTANCE);
    public static final Keva keva = Keva.getRepo("2sv_enhancements");
    private final h pushChallengeKeva$delegate = i.a((a) TwoStepVerificationService$pushChallengeKeva$2.INSTANCE);
    private final h response$delegate = i.a((a) TwoStepVerificationService$response$2.INSTANCE);
    private b.i<com.ss.android.ugc.aweme.account.login.twostep.a> task;

    private final Keva getPushChallengeKeva() {
        return (Keva) this.pushChallengeKeva$delegate.getValue();
    }

    public final HashMap<String, com.ss.android.ugc.aweme.account.login.twostep.a> getResponse() {
        return (HashMap) this.response$delegate.getValue();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79570);
        }

        public final boolean isNewTo2svEnhancements() {
            return ((Boolean) TwoStepVerificationService.isNewTo2svEnhancements$delegate.getValue()).booleanValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final b.i<com.ss.android.ugc.aweme.account.login.twostep.a> getTask() {
        return this.task;
    }

    public final b.i<c> getAvailableWays() {
        return TwoStepAuthApi.a().getAvailableWays();
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final b.i<Boolean> getSafeInfo() {
        b.i<TContinuationResult> b2 = TwoStepAuthApi.a().getUnusualInfo().b(TwoStepVerificationService$getSafeInfo$1.INSTANCE);
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final int getTwoStepVerificationStatusFromLocal() {
        String b2 = cj.b();
        l.b(b2, "");
        l.d(b2, "");
        Integer a2 = com.ss.android.ugc.aweme.user.a.a(b2, "tow_sv_status");
        if (a2 != null) {
            return a2.intValue();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final b.i<Boolean> getTwoStepVerificationStatusFromNetwork() {
        b.i<com.ss.android.ugc.aweme.account.login.twostep.a> twoStepStatus = getTwoStepStatus(false);
        this.task = twoStepStatus;
        if (twoStepStatus == null) {
            l.b();
        }
        b.i<TContinuationResult> b2 = twoStepStatus.b(new TwoStepVerificationService$getTwoStepVerificationStatusFromNetwork$1(this));
        l.b(b2, "");
        return b2;
    }

    static {
        Covode.recordClassIndex(79569);
    }

    public final com.ss.android.ugc.aweme.account.login.twostep.a getTwoStepVerificationResponseFromCache() {
        if (!Companion.isNewTo2svEnhancements()) {
            return getResponse().get(cj.b());
        }
        keva.storeBoolean("is_new_to_2sv_enhancements", false);
        return null;
    }

    public final Boolean getTwoStepVerificationStatusFromCache() {
        a.C1430a data;
        String default_verify_way;
        com.ss.android.ugc.aweme.account.login.twostep.a aVar = getResponse().get(cj.b());
        if (aVar == null || (data = aVar.getData()) == null || (default_verify_way = data.getDefault_verify_way()) == null) {
            return null;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(default_verify_way));
    }

    public final void setTask(b.i<com.ss.android.ugc.aweme.account.login.twostep.a> iVar) {
        this.task = iVar;
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final void onOpenPushChallengePage(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.twostep.i.a(str);
    }

    public final b.i<com.ss.android.ugc.aweme.account.login.twostep.a> getTwoStepStatus(boolean z) {
        if (!z || this.task == null || Companion.isNewTo2svEnhancements()) {
            this.task = TwoStepAuthApi.a().getVerification();
        }
        b.i<com.ss.android.ugc.aweme.account.login.twostep.a> iVar = this.task;
        if (iVar == null) {
            l.b();
        }
        return iVar;
    }

    public final void setTwoStepVerificationResponseToCache(com.ss.android.ugc.aweme.account.login.twostep.a aVar) {
        String str;
        a.C1430a data;
        l.d(aVar, "");
        HashMap<String, com.ss.android.ugc.aweme.account.login.twostep.a> response = getResponse();
        String b2 = cj.b();
        l.b(b2, "");
        response.put(b2, aVar);
        com.ss.android.ugc.aweme.account.login.twostep.a aVar2 = getResponse().get(cj.b());
        if (aVar2 == null || (data = aVar2.getData()) == null) {
            str = null;
        } else {
            str = data.getDefault_verify_way();
        }
        String b3 = cj.b();
        l.b(b3, "");
        int i2 = !TextUtils.isEmpty(str) ? 1 : 0;
        l.d(b3, "");
        com.ss.android.ugc.aweme.user.a.a(b3, "tow_sv_status", i2);
    }

    public static void com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final void openTwoStepVerificationManageActivity(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        Intent intent = new Intent(activity, TwoStepVerificationManageActivity.class);
        intent.putExtra("enter_from", str);
        com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.cb
    public final void handlePushChallengeInfo(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.account.login.twostep.i iVar = com.ss.android.ugc.aweme.account.login.twostep.i.f63940d;
        l.d(str, "");
        l.d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !com.ss.android.ugc.aweme.account.login.twostep.i.a().contains(str)) {
            try {
                Intent buildIntent = SmartRouter.buildRoute(d.a(), "//main/deep_link_handler").buildIntent();
                l.b(buildIntent, "");
                buildIntent.setData(Uri.parse(str2));
                buildIntent.addFlags(268435456);
                if (ActivityStack.isAppBackGround()) {
                    com.ss.android.ugc.aweme.account.login.twostep.i.f63937a = System.currentTimeMillis();
                    com.ss.android.ugc.aweme.account.login.twostep.i.f63938b = buildIntent;
                    com.ss.android.ugc.aweme.account.login.twostep.i.f63939c = str;
                    Context a2 = d.a();
                    if (a2 != null) {
                        ((Application) a2).registerActivityLifecycleCallbacks(iVar);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
                buildIntent.addFlags(536870912);
                com.ss.android.ugc.aweme.account.login.twostep.i.a(str);
                com.ss.android.ugc.aweme.account.login.twostep.i.a(d.a(), buildIntent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
