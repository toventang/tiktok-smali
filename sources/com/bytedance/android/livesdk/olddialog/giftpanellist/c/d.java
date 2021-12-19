package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f20071a;

    static {
        Covode.recordClassIndex(11849);
    }

    d(b bVar) {
        this.f20071a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f20071a.a(view, motionEvent);
    }
}
