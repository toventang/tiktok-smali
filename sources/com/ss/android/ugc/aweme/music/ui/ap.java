package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.RessoCollectInfo;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class ap implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final RessoCollectInfo f111892a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f111893b;

    static {
        Covode.recordClassIndex(71916);
    }

    ap(RessoCollectInfo ressoCollectInfo, Context context) {
        this.f111892a = ressoCollectInfo;
        this.f111893b = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RessoCollectInfo ressoCollectInfo = this.f111892a;
        Context context = this.f111893b;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ressoCollectInfo.getDeepLink()));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.moonvideo.android.resso");
        a.a(intent, context);
        context.startActivity(intent);
    }
}
