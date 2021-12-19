package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.b.a;

final /* synthetic */ class bq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131550a;

    static {
        Covode.recordClassIndex(86158);
    }

    bq(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131550a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131550a;
        vEVideoPublishPreviewActivity.f131178j.setVisibility(4);
        vEVideoPublishPreviewActivity.n.setVisibility(4);
        vEVideoPublishPreviewActivity.f131181m.setVisibility(4);
        vEVideoPublishPreviewActivity.o.setVisibility(4);
        vEVideoPublishPreviewActivity.q.setVisibility(4);
        vEVideoPublishPreviewActivity.r.setVisibility(4);
        r.a("click_delete_virtual_feed_button", vEVideoPublishPreviewActivity.d(true).f149193a);
        vEVideoPublishPreviewActivity.f131180l = vEVideoPublishPreviewActivity.f131179k;
        vEVideoPublishPreviewActivity.f131179k = a.f131452a;
    }
}
