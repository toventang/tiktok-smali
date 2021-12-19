package com.ss.android.ugc.aweme.util;

import android.content.Context;
import android.net.Uri;
import com.bytedance.business.base.jira.IGoToFeedbackListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;

final /* synthetic */ class g implements IGoToFeedbackListener {

    /* renamed from: a  reason: collision with root package name */
    static final IGoToFeedbackListener f142492a = new g();

    static {
        Covode.recordClassIndex(93194);
    }

    private g() {
    }

    @Override // com.bytedance.business.base.jira.IGoToFeedbackListener
    public final void gotoFeedback(Context context, String str) {
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://m.tiktok.com/aweme/faq_beta_version/");
        gVar.a("enter_from", "settings");
        gVar.a("imgUrl", str);
        SmartRouter.buildRoute(context, "//webview").withParam("url", Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
    }
}
