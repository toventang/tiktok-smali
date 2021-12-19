package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bl implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91712a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f91713b;

    static {
        Covode.recordClassIndex(57741);
    }

    bl(VideoViewCell videoViewCell, Context context) {
        this.f91712a = videoViewCell;
        this.f91713b = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f91712a.a(this.f91713b);
    }
}
