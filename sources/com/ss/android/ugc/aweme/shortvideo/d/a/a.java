package com.ss.android.ugc.aweme.shortvideo.d.a;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ugc.tools.utils.a.c;
import com.ss.android.vesdk.bh;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.asve.recorder.effect.a f126426a;

    /* renamed from: b  reason: collision with root package name */
    private int f126427b;

    /* renamed from: c  reason: collision with root package name */
    private int f126428c;

    /* renamed from: d  reason: collision with root package name */
    private float f126429d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f126430e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f126431f;

    /* renamed from: g  reason: collision with root package name */
    private int f126432g;

    /* renamed from: h  reason: collision with root package name */
    private float f126433h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f126434i;

    /* renamed from: j  reason: collision with root package name */
    private PointF f126435j = new PointF(-2.0f, -2.0f);

    /* renamed from: k  reason: collision with root package name */
    private PointF f126436k = new PointF();

    /* renamed from: l  reason: collision with root package name */
    private Pair<Float, Float> f126437l;

    static {
        Covode.recordClassIndex(82943);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(c cVar) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void b(MotionEvent motionEvent, int[] iArr) {
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(float f2) {
        this.f126429d = 1.0f;
        this.f126430e = 1.0f;
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(float f2) {
        this.f126426a.e(-f2, 6.0f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean c(float f2) {
        this.f126426a.e(-f2, 6.0f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.f126436k.x, this.f126436k.y);
        this.f126426a.b(b2.x, b2.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean d(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f126426a.a(0, this.f126436k.x / ((float) this.f126427b), this.f126436k.y / ((float) this.f126428c), 0);
        this.f126434i = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean c(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.f126436k.x, this.f126436k.y);
        com.ss.android.ugc.asve.recorder.effect.a aVar = this.f126426a;
        if (aVar == null) {
            return true;
        }
        aVar.f(b2.x, b2.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean e(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f126426a.a(2, this.f126436k.x / ((float) this.f126427b), this.f126436k.y / ((float) this.f126428c), 0);
        this.f126434i = false;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.f126430e * scaleGestureDetector.getScaleFactor();
        this.f126430e = scaleFactor;
        this.f126426a.d(scaleFactor / this.f126429d, 3.0f);
        this.f126429d = this.f126430e;
        return true;
    }

    private void a(float f2, float f3) {
        this.f126436k.set(f2, f3);
        this.f126436k.offset((float) (-this.f126431f), (float) (-this.f126432g));
    }

    private PointF b(float f2, float f3) {
        PointF pointF = new PointF();
        pointF.x = f2 / ((float) this.f126427b);
        pointF.y = f3 / ((float) this.f126428c);
        return pointF;
    }

    public a(com.ss.android.ugc.asve.recorder.effect.a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f126426a = aVar;
        this.f126427b = marginLayoutParams.width;
        this.f126428c = marginLayoutParams.height;
        this.f126431f = marginLayoutParams.getMarginStart();
        this.f126432g = marginLayoutParams.topMargin;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.d
    public final void a(bh bhVar, MotionEvent motionEvent) {
        super.a(bhVar, motionEvent);
        a(bhVar.f151098c, bhVar.f151099d);
        bhVar.f151098c = this.f126436k.x / ((float) this.f126427b);
        bhVar.f151099d = this.f126436k.y / ((float) this.f126428c);
        this.f126426a.a(bhVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void c(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            PointF b2 = b(this.f126436k.x, this.f126436k.y);
            this.f126426a.b(b2.x, b2.y);
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void e(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f126426a.a(2, this.f126436k.x / ((float) this.f126427b), this.f126436k.y / ((float) this.f126428c), 0);
            this.f126434i = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void d(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f126426a.a(0, this.f126436k.x / ((float) this.f126427b), this.f126436k.y / ((float) this.f126428c), 0);
            this.f126434i = true;
            this.f126437l = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final void a(MotionEvent motionEvent, int[] iArr) {
        Pair<Float, Float> pair;
        if (motionEvent.getPointerCount() == 2) {
            if (this.f126434i && (pair = this.f126437l) != null) {
                this.f126435j.x = ((Float) pair.first).floatValue() + ((float) iArr[0]);
                this.f126435j.y = ((Float) this.f126437l.second).floatValue() + ((float) iArr[1]);
                this.f126434i = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f126435j.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f126435j.y;
            a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            com.ss.android.ugc.asve.recorder.effect.a aVar = this.f126426a;
            float f2 = this.f126436k.x / ((float) this.f126427b);
            float f3 = this.f126436k.y;
            int i2 = this.f126428c;
            aVar.a(f2, f3 / ((float) i2), x / ((float) this.f126427b), y / ((float) i2), 1.0f);
            this.f126435j.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f126435j.y = motionEvent.getY(1) + ((float) iArr[1]);
            Pair<Float, Float> pair2 = this.f126437l;
            if (pair2 != null && ((Float) pair2.first).floatValue() + ((float) iArr[0]) != this.f126433h) {
                this.f126433h = ((Float) this.f126437l.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f126434i) {
            this.f126435j.x = motionEvent.getX();
            this.f126435j.y = motionEvent.getY();
            this.f126434i = false;
        }
        float x = motionEvent2.getX() - this.f126435j.x;
        float y = motionEvent2.getY() - this.f126435j.y;
        a(motionEvent2.getX(), motionEvent2.getY());
        com.ss.android.ugc.asve.recorder.effect.a aVar = this.f126426a;
        float f4 = this.f126436k.x / ((float) this.f126427b);
        float f5 = this.f126436k.y;
        int i2 = this.f126428c;
        aVar.a(f4, f5 / ((float) i2), x / ((float) this.f126427b), y / ((float) i2), 1.0f);
        this.f126435j.x = motionEvent2.getX();
        this.f126435j.y = motionEvent2.getY();
        if (motionEvent == null || motionEvent.getX() == this.f126433h) {
            return true;
        }
        this.f126433h = motionEvent.getX();
        return true;
    }
}
