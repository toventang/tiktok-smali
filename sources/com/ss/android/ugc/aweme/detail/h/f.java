package com.ss.android.ugc.aweme.detail.h;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.metrics.ac;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f79735a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f79736b;

    static {
        Covode.recordClassIndex(49547);
    }

    f(b bVar, Aweme aweme) {
        this.f79735a = bVar;
        this.f79736b = aweme;
    }

    public final void onClick(View view) {
        int i2;
        String str;
        ClickAgent.onClick(view);
        b bVar = this.f79735a;
        Aweme aweme = this.f79736b;
        CaptionItemModel d2 = b.d(aweme);
        if (d2 != null) {
            SmartRoute withParam = SmartRouter.buildRoute(bVar.bv, "aweme://caption/translate/edit").withParam("subtitle_id", d2.getClaSubtitleId()).withParam("enter_from", bVar.aJ.getEventType()).withParam("enter_method", "video_edit").withParam("group_id", ac.e(aweme)).withParam("author_id", ac.a(aweme));
            if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            SmartRoute withParam2 = withParam.withParam("is_long", i2);
            if (aweme.getVideo() == null || aweme.getVideo().getCaptionModel() == null || aweme.getVideo().getCaptionModel().getCaptionList() == null || aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage() == null) {
                str = "";
            } else {
                str = aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage().getLanguageName();
            }
            withParam2.withParam("video_lang", str).withParam("transl_lang", d2.getLanguageName()).open();
        }
    }
}
