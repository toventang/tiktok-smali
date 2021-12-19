package com.ss.android.ugc.aweme.detail.h;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f79734a;

    static {
        Covode.recordClassIndex(49546);
    }

    e(b bVar) {
        this.f79734a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f79734a;
        Intent intent = new Intent();
        intent.putExtra("send_video", bVar.aD());
        bVar.bv.setResult(-1, intent);
        bVar.bv.finish();
    }
}
