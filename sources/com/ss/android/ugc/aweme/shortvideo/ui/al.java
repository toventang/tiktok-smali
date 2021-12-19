package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class al implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ak f131408a;

    static {
        Covode.recordClassIndex(86087);
    }

    al(ak akVar) {
        this.f131408a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ak akVar = this.f131408a;
        if (TextUtils.isEmpty(akVar.M) || !g.a().e().getPublishPermissionDialogPublicQNA(true)) {
            akVar.b(0);
        } else {
            g.a().e().setPublishPermissionDialogPublicQNA(false);
            akVar.a(0, akVar.M);
        }
        akVar.D.setEnabled(true);
        akVar.D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
