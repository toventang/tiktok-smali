package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12571a;

    static {
        Covode.recordClassIndex(6913);
    }

    c(PublicScreenWidget publicScreenWidget) {
        this.f12571a = publicScreenWidget;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f12571a.a(motionEvent);
    }
}
