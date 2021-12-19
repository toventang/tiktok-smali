package com.ss.android.ugc.aweme.shortvideo.festival;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f128485a;

    static {
        Covode.recordClassIndex(84248);
    }

    c(ImageView imageView) {
        this.f128485a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f128485a.performClick();
    }
}
