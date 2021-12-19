package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout;

final /* synthetic */ class ad implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EnterpriseTransformLayout f116855a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116856b;

    /* renamed from: c  reason: collision with root package name */
    private final EnterpriseTransformLayout.a f116857c;

    /* renamed from: d  reason: collision with root package name */
    private final String f116858d;

    static {
        Covode.recordClassIndex(75467);
    }

    ad(EnterpriseTransformLayout enterpriseTransformLayout, String str, EnterpriseTransformLayout.a aVar, String str2) {
        this.f116855a = enterpriseTransformLayout;
        this.f116856b = str;
        this.f116857c = aVar;
        this.f116858d = str2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f116855a;
        String str = this.f116856b;
        EnterpriseTransformLayout.a aVar = this.f116857c;
        String str2 = this.f116858d;
        Context context = view.getContext();
        String str3 = aVar.f116764b;
        if (!g.c().a(context, str, true)) {
            g.c().a(context, str, str3);
        }
        enterpriseTransformLayout.b(str2);
        r.onEventV3("ttelite_BA_external_link_clicked");
    }
}
