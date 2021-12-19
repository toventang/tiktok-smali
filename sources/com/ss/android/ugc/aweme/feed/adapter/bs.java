package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bs implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91721a;

    static {
        Covode.recordClassIndex(57748);
    }

    bs(VideoViewCell videoViewCell) {
        this.f91721a = videoViewCell;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }
}
