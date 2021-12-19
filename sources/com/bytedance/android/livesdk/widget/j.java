package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class j extends GestureDetector {

    /* renamed from: a  reason: collision with root package name */
    private final l f22622a;

    static {
        Covode.recordClassIndex(13361);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1 || !this.f22622a.a(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, l lVar) {
        super(context, lVar);
        l.d(lVar, "");
        this.f22622a = lVar;
    }
}
