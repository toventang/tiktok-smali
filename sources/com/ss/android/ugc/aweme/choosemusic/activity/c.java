package com.ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseMusicActivity f70346a;

    static {
        Covode.recordClassIndex(43382);
    }

    c(ChooseMusicActivity chooseMusicActivity) {
        this.f70346a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f70346a;
        KeyboardUtils.c(chooseMusicActivity.f70327a);
        new a(chooseMusicActivity).a(R.string.d12).a();
    }
}
