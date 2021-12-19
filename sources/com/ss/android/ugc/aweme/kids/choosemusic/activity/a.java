package com.ss.android.ugc.aweme.kids.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseMusicActivity f105492a;

    static {
        Covode.recordClassIndex(67591);
    }

    a(ChooseMusicActivity chooseMusicActivity) {
        this.f105492a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f105492a;
        chooseMusicActivity.a();
        chooseMusicActivity.finish();
    }
}
