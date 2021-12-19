package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LocalLiveWallPaperActivity f108979a;

    static {
        Covode.recordClassIndex(69774);
    }

    i(LocalLiveWallPaperActivity localLiveWallPaperActivity) {
        this.f108979a = localLiveWallPaperActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f108979a.showSettingDialog(view);
    }
}
