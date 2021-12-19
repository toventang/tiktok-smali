package com.bytedance.ies.xelement.picker.e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.f.a;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.concurrent.TimeUnit;

public final class d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    private final WheelView f37269a;

    static {
        Covode.recordClassIndex(22409);
    }

    public d(WheelView wheelView) {
        this.f37269a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        WheelView wheelView = this.f37269a;
        wheelView.a();
        wheelView.f37282d = wheelView.f37281c.scheduleWithFixedDelay(new a(wheelView, f3), 0, 5, TimeUnit.MILLISECONDS);
        return true;
    }
}
