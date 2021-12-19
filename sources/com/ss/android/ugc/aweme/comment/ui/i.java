package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.views.cards.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.c;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f72754a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f72755b;

    static {
        Covode.recordClassIndex(44826);
    }

    i(b bVar, Aweme aweme) {
        this.f72754a = bVar;
        this.f72755b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f72754a;
        Aweme aweme = this.f72755b;
        if (aweme.isAd()) {
            AdCommentDependImpl.b().a(bVar.getContext(), aweme.getAwemeRawAd().getCreativeIdStr(), "background", aweme.getAwemeRawAd().getLogExtra());
            a.a("draw_ad", "replay", aweme.getAwemeRawAd()).a("refer", "background").c();
        }
        c.a(new aj(aweme.getAid()));
        bVar.h();
    }
}
