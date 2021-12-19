package com.ss.android.ugc.aweme.share.gif.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoShare2GifEditActivity f123541a;

    static {
        Covode.recordClassIndex(81102);
    }

    b(VideoShare2GifEditActivity videoShare2GifEditActivity) {
        this.f123541a = videoShare2GifEditActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f123541a.resolveUiClickEvent(view);
    }
}
