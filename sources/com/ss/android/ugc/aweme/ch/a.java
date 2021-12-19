package com.ss.android.ugc.aweme.ch;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgFeedBottomNoticeBar;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69866a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43086);
    }

    /* renamed from: com.ss.android.ugc.aweme.ch.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1581a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f69867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UgAwemeActivitySetting f69868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f69869c;

        static {
            Covode.recordClassIndex(43087);
        }

        public View$OnClickListenerC1581a(ConstraintLayout constraintLayout, UgAwemeActivitySetting ugAwemeActivitySetting, Aweme aweme) {
            this.f69867a = constraintLayout;
            this.f69868b = ugAwemeActivitySetting;
            this.f69869c = aweme;
        }

        public final void onClick(View view) {
            UgFeedBottomNoticeBar ugFeedBottomNoticeBar;
            String jumpLink;
            ClickAgent.onClick(view);
            Context context = this.f69867a.getContext();
            String str = "";
            l.b(context, str);
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f69868b;
            if (!(ugAwemeActivitySetting == null || (ugFeedBottomNoticeBar = ugAwemeActivitySetting.getUgFeedBottomNoticeBar()) == null || (jumpLink = ugFeedBottomNoticeBar.getJumpLink()) == null)) {
                str = jumpLink;
            }
            if (TextUtils.isEmpty(str) || (!p.b(str, "http", false) && !p.b(str, "https", false))) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
            }
            r.a("text_link_click", new d().a("group_id", this.f69869c.getAid()).f66730a);
        }
    }

    public static boolean a(Aweme aweme) {
        List<String> list;
        l.d(aweme, "");
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (!(awemeActivitySetting == null || aweme.getTextExtra() == null)) {
                if (!aweme.getTextExtra().isEmpty()) {
                    UgFeedBottomNoticeBar ugFeedBottomNoticeBar = awemeActivitySetting.getUgFeedBottomNoticeBar();
                    if (ugFeedBottomNoticeBar == null || (list = ugFeedBottomNoticeBar.getHashTagIds()) == null) {
                        list = new ArrayList<>();
                    }
                    if (!list.isEmpty()) {
                        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                            l.b(textExtraStruct, "");
                            if (list.contains(textExtraStruct.getCid())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
    }
}
