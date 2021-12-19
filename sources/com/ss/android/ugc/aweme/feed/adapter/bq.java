package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91719a;

    static {
        Covode.recordClassIndex(57746);
    }

    bq(VideoViewCell videoViewCell) {
        this.f91719a = videoViewCell;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f91719a.aI();
    }
}
