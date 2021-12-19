package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements CheckBAShowLoading {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131692a;

    static {
        Covode.recordClassIndex(86244);
    }

    Cdo(cj cjVar) {
        this.f131692a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading
    public final void showLoading() {
        cj cjVar = this.f131692a;
        if (cjVar.q == null) {
            cjVar.q = ObjectAnimator.ofFloat(cjVar.p, "rotation", 0.0f, 360.0f);
            cjVar.q.setDuration(1000L);
            cjVar.q.setRepeatCount(-1);
            cjVar.q.setInterpolator(new LinearInterpolator());
        }
        cjVar.o.setVisibility(8);
        cjVar.p.setVisibility(0);
        if (cjVar.q != null && !cjVar.q.isRunning()) {
            cjVar.q.start();
        }
    }
}
