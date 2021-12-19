package com.ss.android.ugc.aweme.share.gif.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoShare2GifPreviewActivity f123549a;

    static {
        Covode.recordClassIndex(81108);
    }

    h(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity) {
        this.f123549a = videoShare2GifPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f123549a;
        if (view.getId() == R.id.evy) {
            r.a("gif_re_edit", new HashMap());
            videoShare2GifPreviewActivity.setResult(0);
            videoShare2GifPreviewActivity.finish();
        }
    }
}
