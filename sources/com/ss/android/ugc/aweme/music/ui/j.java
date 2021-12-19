package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EditOriginMusicTitleActivity f111992a;

    static {
        Covode.recordClassIndex(71972);
    }

    j(EditOriginMusicTitleActivity editOriginMusicTitleActivity) {
        this.f111992a = editOriginMusicTitleActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111992a.onViewClicked(view);
    }
}
