package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LocalLiveWallPaperActivity f108980a;

    static {
        Covode.recordClassIndex(69775);
    }

    j(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f108980a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f108980a.exit(view);
    }
}
