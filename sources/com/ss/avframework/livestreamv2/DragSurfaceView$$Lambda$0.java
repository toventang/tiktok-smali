package com.ss.avframework.livestreamv2;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class DragSurfaceView$$Lambda$0 implements View.OnTouchListener {
    private final DragSurfaceView arg$1;
    private final View.OnTouchListener arg$2;

    static {
        Covode.recordClassIndex(99853);
    }

    DragSurfaceView$$Lambda$0(DragSurfaceView dragSurfaceView, View.OnTouchListener onTouchListener) {
        this.arg$1 = dragSurfaceView;
        this.arg$2 = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.arg$1.lambda$setOnTouchListener$0$DragSurfaceView(this.arg$2, view, motionEvent);
    }
}
