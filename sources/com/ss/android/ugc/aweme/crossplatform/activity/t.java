package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.tiktok.security.a.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final s f78571a;

    static {
        Covode.recordClassIndex(48791);
    }

    t(s sVar) {
        this.f78571a = sVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        s sVar = this.f78571a;
        int id = view.getId();
        sVar.a().dismiss();
        String currentUrl = sVar.f78568f.f().getCurrentUrl();
        if (id == R.id.czk) {
            Activity activity = sVar.f78567e;
            if (!m.a(currentUrl)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(currentUrl));
                    intent.setAction("android.intent.action.VIEW");
                    a.a(intent, activity);
                    activity.startActivity(intent);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (id == R.id.af9) {
            Activity activity2 = sVar.f78567e;
            PrivacyCert build = PrivacyCert.Builder.with("bpea-214").usage("").tag("PopupWindowManager_copyLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
            if (!m.a(currentUrl)) {
                try {
                    av.a("", currentUrl, activity2, build);
                } catch (com.bytedance.bpea.basics.a e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) e3);
                }
                new b(activity2).b(2131231922).e(R.string.gin).b();
            }
        } else if (id == R.id.dk5) {
            sVar.f78568f.f().g();
        }
    }
}
