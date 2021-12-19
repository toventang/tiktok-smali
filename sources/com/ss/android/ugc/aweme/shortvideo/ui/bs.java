package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.dc;
import com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView;
import com.ss.android.ugc.aweme.shortvideo.ui.b.a;
import com.ss.android.ugc.aweme.shortvideo.ui.b.b;
import com.ss.android.ugc.aweme.shortvideo.ui.b.c;

final /* synthetic */ class bs implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131552a;

    static {
        Covode.recordClassIndex(86160);
    }

    bs(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131552a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131552a;
        if (!dc.b()) {
            vEVideoPublishPreviewActivity.m();
            vEVideoPublishPreviewActivity.j();
        } else if (vEVideoPublishPreviewActivity.f131179k == c.f131454a) {
            vEVideoPublishPreviewActivity.c(true);
            vEVideoPublishPreviewActivity.f131174f.d();
            vEVideoPublishPreviewActivity.o.setVisibility(0);
            vEVideoPublishPreviewActivity.f131179k = b.f131453a;
        } else if (vEVideoPublishPreviewActivity.f131179k == b.f131453a) {
            vEVideoPublishPreviewActivity.c(true);
            vEVideoPublishPreviewActivity.f131174f.e();
            vEVideoPublishPreviewActivity.o.setVisibility(4);
            vEVideoPublishPreviewActivity.f131179k = c.f131454a;
        } else if (vEVideoPublishPreviewActivity.f131179k == a.f131452a) {
            vEVideoPublishPreviewActivity.c(false);
            vEVideoPublishPreviewActivity.f131178j.setVisibility(0);
            vEVideoPublishPreviewActivity.n.setVisibility(0);
            vEVideoPublishPreviewActivity.f131181m.setVisibility(0);
            vEVideoPublishPreviewActivity.q.setVisibility(0);
            vEVideoPublishPreviewActivity.r.setVisibility(0);
            if (vEVideoPublishPreviewActivity.f131180l == b.f131453a) {
                vEVideoPublishPreviewActivity.o.setVisibility(0);
            }
            if (vEVideoPublishPreviewActivity.f131178j != null) {
                PreviewFakeFeedView previewFakeFeedView = vEVideoPublishPreviewActivity.f131178j;
                previewFakeFeedView.getUiHandler().post(new PreviewFakeFeedView.c(previewFakeFeedView));
            }
            vEVideoPublishPreviewActivity.f131179k = vEVideoPublishPreviewActivity.f131180l;
        }
    }
}
