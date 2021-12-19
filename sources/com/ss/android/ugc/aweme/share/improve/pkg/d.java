package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.bytedance.ies.abmock.b;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.a.ag;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f124034a;

    /* renamed from: b  reason: collision with root package name */
    private final c f124035b;

    static {
        Covode.recordClassIndex(81437);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "live_feed_back";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        com.bytedance.android.livesdkapi.service.d a2 = f.a();
        if (a2 != null) {
            return a2.m();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        com.bytedance.android.livesdkapi.service.d a2 = f.a();
        if (a2 != null) {
            return a2.l();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public d(Activity activity, c cVar) {
        l.d(activity, "");
        l.d(cVar, "");
        this.f124034a = activity;
        this.f124035b = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        try {
            if (b.a().a(true, "feedback_post_page_style", 0) == 1) {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                l.b(feedbackConf, "");
                String queryParameter = Uri.parse(feedbackConf.getFeHelp()).getQueryParameter("url");
                if (!TextUtils.isEmpty(queryParameter)) {
                    g gVar = new g(queryParameter);
                    gVar.a("room_id", this.f124035b.f22967c);
                    gVar.a("feedback_id", "6955");
                    gVar.a("enter_from", "live_share_feedback");
                    SmartRouter.buildRoute(this.f124034a, "aweme://webview/").withParam("url", gVar.toString()).open();
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", this.f124035b.u);
                    Map<String, String> map = this.f124035b.D;
                    if (map == null) {
                        map = ag.a();
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a(new HashMap<>(map));
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    r.a("livesdk_share_feedback_click", a3.a("uid", g2.getCurUserId()).f66730a);
                    return;
                }
                throw new a();
            }
            throw new a();
        } catch (a unused) {
            g gVar2 = new g("aweme://i18n_feedback_input");
            gVar2.a("room_id", this.f124035b.f22967c);
            gVar2.a("feedback_id", "6955");
            gVar2.a("enter_from", "live_share_feedback");
            SmartRouter.buildRoute(this.f124034a, gVar2.a()).open();
        }
    }
}
