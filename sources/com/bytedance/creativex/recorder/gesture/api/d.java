package com.bytedance.creativex.recorder.gesture.api;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.vesdk.bh;

public abstract class d extends VideoRecordGestureLayout.b {

    public static class a extends d {
        static {
            Covode.recordClassIndex(16657);
        }
    }

    static {
        Covode.recordClassIndex(16656);
    }

    public void a(bh bhVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void f(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public final void g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        bh bhVar = new bh();
        if (action == 0) {
            bhVar.f151097b = bh.a.BEGAN;
            a(bhVar, motionEvent, 0);
            a(bhVar, motionEvent);
        } else if (action == 1) {
            bhVar.f151097b = bh.a.ENDED;
            a(bhVar, motionEvent, 0);
            a(bhVar, motionEvent);
        } else if (action == 2) {
            bhVar.f151097b = bh.a.MOVED;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                a(bhVar, motionEvent, i2);
                a(bhVar, motionEvent);
            }
        } else if (action == 3) {
            bhVar.f151097b = bh.a.CANCELED;
            a(bhVar, motionEvent, 0);
            a(bhVar, motionEvent);
        } else if (action == 5) {
            bhVar.f151097b = bh.a.BEGAN;
            a(bhVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
            a(bhVar, motionEvent);
        } else if (action == 6) {
            bhVar.f151097b = bh.a.ENDED;
            a(bhVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
            a(bhVar, motionEvent);
        }
    }

    private static void a(bh bhVar, MotionEvent motionEvent, int i2) {
        int pointerId = motionEvent.getPointerId(i2);
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        bhVar.f151100e = motionEvent.getPressure(i2);
        bhVar.f151096a = pointerId;
        bhVar.f151098c = x;
        bhVar.f151099d = y;
        bhVar.f151101f = 30.0f;
    }
}
