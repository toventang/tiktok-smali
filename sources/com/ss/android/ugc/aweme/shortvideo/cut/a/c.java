package com.ss.android.ugc.aweme.shortvideo.cut.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f125439a;

    static {
        Covode.recordClassIndex(82328);
    }

    c(a aVar) {
        this.f125439a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f125439a;
        if (aVar.f125413g != null) {
            MediaPlayerModule mediaPlayerModule = aVar.f125413g;
            if (mediaPlayerModule.f109437d) {
                mediaPlayerModule.f109436c = true;
                mediaPlayerModule.b();
                return;
            }
            mediaPlayerModule.f109436c = false;
            mediaPlayerModule.a();
        }
    }
}
