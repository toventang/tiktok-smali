package com.bytedance.android.livesdk.chatroom.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final o f16668a;

    static {
        Covode.recordClassIndex(9246);
    }

    p(o oVar) {
        this.f16668a = oVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f16668a.c();
    }
}
