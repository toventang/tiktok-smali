package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final MvTemplateView f140860a;

    static {
        Covode.recordClassIndex(91973);
    }

    j(MvTemplateView mvTemplateView) {
        this.f140860a = mvTemplateView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f140860a.n.dispatchTouchEvent(motionEvent);
    }
}
