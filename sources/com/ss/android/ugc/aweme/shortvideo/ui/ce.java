package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settings.n;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ce implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishActivity f131588a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f131589b;

    static {
        Covode.recordClassIndex(86180);
    }

    ce(VideoPublishActivity videoPublishActivity, boolean z) {
        this.f131588a = videoPublishActivity;
        this.f131589b = z;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f131588a;
        boolean z = this.f131589b;
        VideoPublishViewModel h2 = videoPublishActivity.h();
        boolean z2 = videoPublishActivity.f131215e.mIsFromDraft;
        if (n.a()) {
            h2.d(new VideoPublishViewModel.c(z, z2));
        } else {
            h2.c(new VideoPublishViewModel.d(z, z2));
        }
    }
}
