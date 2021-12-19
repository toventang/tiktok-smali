package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f101135a;

    static {
        Covode.recordClassIndex(64699);
    }

    e(c cVar) {
        this.f101135a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c cVar = this.f101135a;
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return false;
        }
        cVar.r = (int) motionEvent.getX();
        cVar.s = (int) motionEvent.getY();
        return false;
    }
}
