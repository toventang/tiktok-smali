package com.ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseMusicActivity f70336a;

    static {
        Covode.recordClassIndex(43380);
    }

    a(ChooseMusicActivity chooseMusicActivity) {
        this.f70336a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f70336a;
        chooseMusicActivity.b();
        chooseMusicActivity.finish();
    }
}
