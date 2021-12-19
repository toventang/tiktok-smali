package com.bytedance.ies.xelement.pickview.c;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.ies.xelement.pickview.e.a f37383a;

    static {
        Covode.recordClassIndex(22469);
    }

    public a(com.bytedance.ies.xelement.pickview.e.a aVar) {
        this.f37383a = aVar;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        com.bytedance.ies.xelement.pickview.e.a aVar = this.f37383a;
        aVar.a();
        aVar.f37396d = aVar.f37395c.scheduleWithFixedDelay(new com.bytedance.ies.xelement.pickview.d.a(aVar, f3), 0, 5, TimeUnit.MILLISECONDS);
        return true;
    }
}
