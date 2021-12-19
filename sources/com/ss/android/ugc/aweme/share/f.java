package com.ss.android.ugc.aweme.share;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements PullUpLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f123475a;

    static {
        Covode.recordClassIndex(81074);
    }

    f(d dVar) {
        this.f123475a = dVar;
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout.b
    public final void a(MotionEvent motionEvent) {
        d dVar = this.f123475a;
        int action = motionEvent.getAction();
        if (action == 0) {
            dVar.f123431h = true;
            if (dVar.f123428e != null) {
                dVar.f123428e.f123441a = true;
            }
        } else if (action == 1) {
            dVar.f123431h = false;
            dVar.f123436m = System.currentTimeMillis() + ((long) dVar.f123429f);
            dVar.f123428e.f123441a = false;
            dVar.f123427d.postDelayed(dVar.f123428e, (long) dVar.f123429f);
        } else if (action == 2) {
            dVar.f123431h = true;
        }
    }
}
