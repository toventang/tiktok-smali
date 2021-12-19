package com.ss.android.ugc.aweme.discover.ui;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f82588a;

    static {
        Covode.recordClassIndex(51415);
    }

    i(b bVar) {
        this.f82588a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f82588a.a(view, motionEvent);
    }
}
