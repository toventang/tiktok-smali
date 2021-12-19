package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f70178a;

    static {
        Covode.recordClassIndex(43294);
    }

    n(ImageView imageView) {
        this.f70178a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70178a.performClick();
    }
}
