package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EnterpriseTransformLayout f117487a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117488b;

    /* renamed from: c  reason: collision with root package name */
    private final String f117489c;

    static {
        Covode.recordClassIndex(75896);
    }

    z(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f117487a = enterpriseTransformLayout;
        this.f117488b = str;
        this.f117489c = str2;
    }

    public final void onClick(View view) {
        String uid;
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f117487a;
        String str = this.f117488b;
        String str2 = this.f117489c;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(str))));
        try {
            Activity activity = enterpriseTransformLayout.f116757i;
            a.a(intent, activity);
            activity.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        enterpriseTransformLayout.b(str2);
        String str3 = "";
        if (in.c() == null) {
            uid = str3;
        } else {
            uid = in.c().getUid();
        }
        d a2 = new d().a("enter_from", enterpriseTransformLayout.f116759k).a("email", enterpriseTransformLayout.f116756h != null ? enterpriseTransformLayout.f116756h.getBioEmail() : str3);
        if (enterpriseTransformLayout.f116756h != null) {
            str3 = enterpriseTransformLayout.f116756h.getUid();
        }
        r.a("ttelite_BA_email_button_clicked", a2.a("to_user_id", str3).a("user_id", uid).f66730a);
    }
}
