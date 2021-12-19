package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.w;

final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74413a;

    static {
        Covode.recordClassIndex(45894);
    }

    q(h hVar) {
        this.f74413a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f74413a;
        if (!hVar.h()) {
            if (hVar.o.isAd() && hVar.o.getAwemeRawAd().getCreativeId() != null) {
                a.a("draw_ad", "otherclick", hVar.o.getAwemeRawAd().getCreativeId().toString(), hVar.o.getAwemeRawAd().getLogExtra(), null).b("refer", "sponsored").b();
            }
            w.a(hVar.ae, hVar.o, 1, hVar.ap);
        }
    }
}
