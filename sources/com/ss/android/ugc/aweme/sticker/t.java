package com.ss.android.ugc.aweme.sticker;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class t implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final long f135718a;

    /* renamed from: b  reason: collision with root package name */
    private final float f135719b;

    /* renamed from: c  reason: collision with root package name */
    private final View f135720c;

    static {
        Covode.recordClassIndex(88709);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l.d(view, "");
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f135720c.animate().scaleX(this.f135719b).scaleY(this.f135719b).setDuration(this.f135718a).start();
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.f135720c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f135718a).start();
            return false;
        }
    }

    public t(float f2, long j2, View view) {
        l.d(view, "");
        this.f135719b = f2;
        this.f135718a = j2;
        this.f135720c = view;
    }
}
