package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f70132a;

    static {
        Covode.recordClassIndex(43250);
    }

    e(ImageView imageView) {
        this.f70132a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70132a.performClick();
    }
}
