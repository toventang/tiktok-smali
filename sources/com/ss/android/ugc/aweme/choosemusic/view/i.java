package com.ss.android.ugc.aweme.choosemusic.view;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f70837a;

    static {
        Covode.recordClassIndex(43645);
    }

    i(c cVar) {
        this.f70837a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c cVar = this.f70837a;
        if (motionEvent.getAction() == 1 && cVar.f70819j != null) {
            String obj = cVar.f70819j.getText().toString();
            if (cVar.f70810a != null) {
                if (!TextUtils.isEmpty(obj)) {
                    cVar.f70810a.d();
                } else {
                    cVar.f70810a.c();
                }
            }
            cVar.f70814e.setVisibility(8);
            cVar.f70817h.setVisibility(0);
            cVar.f70816g.setVisibility(8);
            cVar.f();
            cVar.b();
            if (cVar.r != null) {
                cVar.r.setVisibility(0);
            }
            if (cVar.s != null) {
                cVar.s.setVisibility(8);
            }
        }
        return false;
    }
}
