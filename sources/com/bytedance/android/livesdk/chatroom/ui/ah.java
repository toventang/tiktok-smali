package com.bytedance.android.livesdk.chatroom.ui;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ah implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f15858a;

    static {
        Covode.recordClassIndex(8749);
    }

    ah(a aVar) {
        this.f15858a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f15858a.a(motionEvent);
    }
}
