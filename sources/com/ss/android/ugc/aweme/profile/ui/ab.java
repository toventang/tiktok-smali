package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EnterpriseTransformLayout f116850a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116851b;

    static {
        Covode.recordClassIndex(75465);
    }

    ab(EnterpriseTransformLayout enterpriseTransformLayout, String str) {
        this.f116850a = enterpriseTransformLayout;
        this.f116851b = str;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f116850a;
        String str = this.f116851b;
        Activity activity = enterpriseTransformLayout.f116757i;
        User user = enterpriseTransformLayout.f116756h;
        if (!(activity == null || user == null)) {
            new v(activity, user, (byte) 0).show();
        }
        enterpriseTransformLayout.b(str);
    }
}
