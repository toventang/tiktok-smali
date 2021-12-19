package com.ss.android.ugc.aweme.prop.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118263a;

    static {
        Covode.recordClassIndex(76804);
    }

    u(j jVar) {
        this.f118263a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118263a;
        if (((double) view.getAlpha()) >= 1.0E-6d) {
            r.a("click_prop_maker_entrance", new d().a("prop_id", jVar.ap.id).a("enter_from", "prop_page").f66730a);
            Context context = jVar.getContext();
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(SharePrefCache.inst().getStickerArtlistUrl().c()));
            intent.putExtra("use_webview_title", true);
            a.a(intent, context);
            context.startActivity(intent);
        }
    }
}
