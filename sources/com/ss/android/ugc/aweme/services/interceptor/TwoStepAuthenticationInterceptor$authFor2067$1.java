package com.ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.ss.android.ugc.aweme.account.login.twostep.m;
import com.ss.android.ugc.aweme.account.login.twostep.w;
import com.ss.android.ugc.aweme.account.login.v2.a.ab;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.tiktok.security.a.a;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class TwoStepAuthenticationInterceptor$authFor2067$1<T> implements f {
    final /* synthetic */ Context $context;
    final /* synthetic */ Map $postParams;
    final /* synthetic */ w $twoStepVerificationData;
    final /* synthetic */ TwoStepAuthenticationInterceptor this$0;

    static {
        Covode.recordClassIndex(79734);
    }

    TwoStepAuthenticationInterceptor$authFor2067$1(TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor, Context context, w wVar, Map map) {
        this.this$0 = twoStepAuthenticationInterceptor;
        this.$context = context;
        this.$twoStepVerificationData = wVar;
        this.$postParams = map;
    }

    public static Bundle com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void accept(ab abVar) {
        if (l.a((Object) "ok", (Object) abVar.f64195e)) {
            Intent intent = new Intent(this.$context, TwoStepVerifyPushFor2067Activity.class);
            intent.putExtra("ticket", this.$twoStepVerificationData.getVerify_ticket());
            intent.putExtra("wait_ticket", abVar.f64196f);
            intent.putExtra("sms_code_key", this.$twoStepVerificationData.getSms_code_key());
            intent.putExtra("profile_key", this.$twoStepVerificationData.getProfile_key());
            TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor = this.this$0;
            intent.putExtra("platform", twoStepAuthenticationInterceptor.getPlatForm(twoStepAuthenticationInterceptor.currentUrlPath, this.$postParams, k.PUSH_VERIFY));
            Intent intent2 = ((Activity) this.$context).getIntent();
            l.b(intent2, "");
            if (com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent2) != null) {
                Intent intent3 = ((Activity) this.$context).getIntent();
                l.b(intent3, "");
                Bundle com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent3);
                if (com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
                    l.b();
                }
                intent.putExtras(com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            }
            ArrayList arrayList = new ArrayList();
            List<String> list = abVar.f64200j;
            if (list != null) {
                arrayList.addAll(list);
            }
            intent.putExtra("device_list", arrayList);
            if (!(this.$context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(this.$context, intent);
            return;
        }
        m a2 = m.a();
        String str = abVar.f64199i;
        if (str == null) {
            str = "server error";
        }
        a2.a(new b(null, null, 0, str, this.$twoStepVerificationData.getSms_code_key()));
    }

    public static void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2067$1_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }
}
