package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveWallPaperPreviewActivity f108976a;

    static {
        Covode.recordClassIndex(69771);
    }

    f(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f108976a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f108976a.showSettingDialog(view);
    }
}
