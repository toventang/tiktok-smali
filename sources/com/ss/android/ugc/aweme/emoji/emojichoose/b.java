package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89208a;

    static {
        Covode.recordClassIndex(56080);
    }

    b(Context context) {
        this.f89208a = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Context context = this.f89208a;
        Intent buildIntent = SmartRouter.buildRoute(context, "emoji_manager").buildIntent();
        a.a(buildIntent, context);
        context.startActivity(buildIntent);
    }
}
