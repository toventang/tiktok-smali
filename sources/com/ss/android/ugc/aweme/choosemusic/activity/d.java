package com.ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.utils.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseMusicActivity f70347a;

    static {
        Covode.recordClassIndex(43383);
    }

    d(ChooseMusicActivity chooseMusicActivity) {
        this.f70347a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f70347a;
        KeyboardUtils.c(chooseMusicActivity.f70327a);
        com.ss.android.ugc.aweme.music.k.d.a(chooseMusicActivity, chooseMusicActivity.f70329c);
        b.a(2);
    }
}
