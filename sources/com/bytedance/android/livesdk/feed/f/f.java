package com.bytedance.android.livesdk.feed.f;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17453a;

    static {
        Covode.recordClassIndex(9675);
    }

    f(a aVar) {
        this.f17453a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f17453a;
        if (System.currentTimeMillis() - aVar.r > 3000) {
            aVar.r = System.currentTimeMillis();
            aVar.b("click");
            if (aVar.getContext() != null) {
                ((IHostAction) a.a(IHostAction.class)).handleSchema(aVar.getContext(), "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:explore}", new Bundle());
            }
        }
    }
}
