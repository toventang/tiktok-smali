package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class am implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ak f131409a;

    static {
        Covode.recordClassIndex(86088);
    }

    am(ak akVar) {
        this.f131409a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ak akVar = this.f131409a;
        if (akVar.P) {
            if (akVar.Q) {
                akVar.b(2, R.string.be_);
            } else if (ak.e()) {
                akVar.a(2, akVar.G, akVar.J);
            } else if (!TextUtils.isEmpty(akVar.K)) {
                akVar.a(2, akVar.G, akVar.K);
            } else if (TextUtils.isEmpty(akVar.L) || akVar.T != 0) {
                akVar.b(2);
            } else {
                akVar.a(2, akVar.G, akVar.L);
            }
        } else if (akVar.c()) {
            akVar.a(2, R.string.beb);
        } else if (ak.e()) {
            akVar.a(2, akVar.G, akVar.J);
        } else if (!TextUtils.isEmpty(akVar.K)) {
            akVar.a(2, akVar.G, akVar.K);
        } else if (TextUtils.isEmpty(akVar.L) || akVar.T != 0) {
            akVar.b(2);
        } else {
            akVar.a(2, akVar.G, akVar.L);
        }
        akVar.D.setEnabled(true);
        akVar.D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
