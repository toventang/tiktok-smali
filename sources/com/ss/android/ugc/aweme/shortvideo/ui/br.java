package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class br implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131551a;

    static {
        Covode.recordClassIndex(86159);
    }

    br(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131551a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131551a;
        vEVideoPublishPreviewActivity.n();
        vEVideoPublishPreviewActivity.m();
        vEVideoPublishPreviewActivity.j();
    }
}
