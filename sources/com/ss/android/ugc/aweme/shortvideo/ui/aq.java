package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class aq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ak f131414a;

    static {
        Covode.recordClassIndex(86092);
    }

    aq(ak akVar) {
        this.f131414a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ak akVar = this.f131414a;
        if (akVar.P) {
            if (akVar.Q) {
                akVar.b(1, R.string.bec);
            } else if (ak.d()) {
                akVar.a(1, akVar.H, akVar.I);
            } else if (!TextUtils.isEmpty(akVar.K)) {
                akVar.a(1, akVar.H, akVar.K);
            } else if (TextUtils.isEmpty(akVar.L) || akVar.T != 0) {
                akVar.b(1);
            } else {
                akVar.a(1, akVar.H, akVar.L);
            }
        } else if (akVar.c()) {
            akVar.a(1, R.string.bed);
        } else if (ak.d()) {
            akVar.a(1, akVar.H, akVar.I);
        } else if (!TextUtils.isEmpty(akVar.K)) {
            akVar.a(1, akVar.H, akVar.K);
        } else if (TextUtils.isEmpty(akVar.L) || akVar.T != 0) {
            akVar.b(1);
        } else {
            akVar.a(1, akVar.H, akVar.L);
        }
        akVar.D.setEnabled(true);
        akVar.D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
