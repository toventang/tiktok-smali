package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveWallPaperPreviewActivity f108973a;

    static {
        Covode.recordClassIndex(69768);
    }

    c(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f108973a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f108973a.exit(view);
    }
}
