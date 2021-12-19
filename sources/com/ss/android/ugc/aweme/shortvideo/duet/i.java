package com.ss.android.ugc.aweme.shortvideo.duet;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.vesdk.bh;
import h.f.b.l;

public final class i extends d {

    /* renamed from: a  reason: collision with root package name */
    private int f126540a;

    /* renamed from: b  reason: collision with root package name */
    private int f126541b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f126542c;

    /* renamed from: d  reason: collision with root package name */
    private final PointF f126543d = new PointF(-2.0f, -2.0f);

    /* renamed from: e  reason: collision with root package name */
    private float f126544e;

    /* renamed from: f  reason: collision with root package name */
    private final PointF f126545f = new PointF();

    /* renamed from: g  reason: collision with root package name */
    private Pair<Float, Float> f126546g;

    /* renamed from: h  reason: collision with root package name */
    private final a f126547h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup.MarginLayoutParams f126548i;

    static {
        Covode.recordClassIndex(83004);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean d(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        a(motionEvent.getX(), motionEvent.getY());
        this.f126547h.a(0, this.f126545f.x / ((float) this.f126540a), this.f126545f.y / ((float) this.f126541b), 0);
        this.f126542c = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean e(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        a(motionEvent.getX(), motionEvent.getY());
        this.f126547h.a(2, this.f126545f.x / ((float) this.f126540a), this.f126545f.y / ((float) this.f126541b), 1);
        this.f126542c = false;
        return false;
    }

    private final void a(float f2, float f3) {
        this.f126545f.set(f2, f3);
        this.f126545f.offset(-((float) this.f126548i.getMarginStart()), -((float) this.f126548i.topMargin));
    }

    public i(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        l.d(aVar, "");
        l.d(marginLayoutParams, "");
        this.f126547h = aVar;
        this.f126548i = marginLayoutParams;
        Float valueOf = Float.valueOf(-2.0f);
        this.f126546g = new Pair<>(valueOf, valueOf);
        this.f126540a = marginLayoutParams.width;
        this.f126541b = marginLayoutParams.height;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.d
    public final void a(bh bhVar, MotionEvent motionEvent) {
        l.d(bhVar, "");
        l.d(motionEvent, "");
        super.a(bhVar, motionEvent);
        a(bhVar.f151098c, bhVar.f151099d);
        bhVar.f151098c = this.f126545f.x / ((float) this.f126540a);
        bhVar.f151099d = this.f126545f.y / ((float) this.f126541b);
        this.f126547h.a(bhVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void e(MotionEvent motionEvent, int[] iArr) {
        l.d(motionEvent, "");
        l.d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f126547h.a(2, this.f126545f.x / ((float) this.f126540a), this.f126545f.y / ((float) this.f126541b), 0);
            this.f126542c = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void d(MotionEvent motionEvent, int[] iArr) {
        l.d(motionEvent, "");
        l.d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f126547h.a(0, this.f126545f.x / ((float) this.f126540a), this.f126545f.y / ((float) this.f126541b), 0);
            this.f126542c = true;
            this.f126546g = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void a(MotionEvent motionEvent, int[] iArr) {
        l.d(motionEvent, "");
        l.d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            if (this.f126542c) {
                this.f126543d.x = ((Number) this.f126546g.first).floatValue() + ((float) iArr[0]);
                this.f126543d.y = ((Number) this.f126546g.second).floatValue() + ((float) iArr[1]);
                this.f126542c = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f126543d.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f126543d.y;
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            a aVar = this.f126547h;
            float f2 = this.f126545f.x / ((float) this.f126540a);
            float f3 = this.f126545f.y;
            int i2 = this.f126541b;
            aVar.a(f2, f3 / ((float) i2), x / ((float) this.f126540a), y / ((float) i2), 1.0f);
            this.f126543d.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f126543d.y = motionEvent.getY(1) + ((float) iArr[1]);
            if (((Number) this.f126546g.first).floatValue() + ((float) iArr[0]) != this.f126544e) {
                this.f126544e = ((Number) this.f126546g.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent2, "");
        if (this.f126542c) {
            PointF pointF = this.f126543d;
            if (motionEvent == null) {
                l.b();
            }
            pointF.x = motionEvent.getX();
            this.f126543d.y = motionEvent.getY();
            this.f126542c = false;
        }
        float x = motionEvent2.getX() - this.f126543d.x;
        float y = motionEvent2.getY() - this.f126543d.y;
        a(motionEvent2.getX(), motionEvent2.getY());
        a aVar = this.f126547h;
        float f4 = this.f126545f.x / ((float) this.f126540a);
        float f5 = this.f126545f.y;
        int i2 = this.f126541b;
        aVar.a(f4, f5 / ((float) i2), x / ((float) this.f126540a), y / ((float) i2), 1.0f);
        this.f126543d.x = motionEvent2.getX();
        this.f126543d.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f126544e)) {
            this.f126544e = motionEvent.getX();
        }
        return false;
    }
}
