package com.ss.android.ugc.aweme.shortvideo.d.a;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ugc.aweme.shortvideo.x.k;
import com.ss.android.ugc.tools.utils.a.c;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private final k f126438a;

    /* renamed from: b  reason: collision with root package name */
    private int f126439b;

    /* renamed from: c  reason: collision with root package name */
    private int f126440c;

    /* renamed from: d  reason: collision with root package name */
    private int f126441d;

    /* renamed from: e  reason: collision with root package name */
    private int f126442e;

    /* renamed from: f  reason: collision with root package name */
    private float f126443f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f126444g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f126445h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f126446i;

    /* renamed from: j  reason: collision with root package name */
    private PointF f126447j = new PointF(-2.0f, -2.0f);

    /* renamed from: k  reason: collision with root package name */
    private PointF f126448k = new PointF();

    static {
        Covode.recordClassIndex(82944);
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
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(float f2) {
        this.f126443f = 1.0f;
        this.f126444g = 1.0f;
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(float f2) {
        this.f126438a.c(-f2);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean c(float f2) {
        this.f126438a.c(-f2);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.f126448k.x, this.f126448k.y);
        this.f126438a.d(b2.x, b2.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean c(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        PointF b2 = b(this.f126448k.x, this.f126448k.y);
        k kVar = this.f126438a;
        if (kVar == null) {
            return true;
        }
        kVar.f(b2.x, b2.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean d(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f126438a.a(0, this.f126448k.x / ((float) this.f126439b), this.f126448k.y / ((float) this.f126440c), 0);
        this.f126446i = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean e(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f126438a.a(2, this.f126448k.x / ((float) this.f126439b), this.f126448k.y / ((float) this.f126440c), 0);
        this.f126446i = false;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.f126444g * scaleGestureDetector.getScaleFactor();
        this.f126444g = scaleFactor;
        this.f126438a.b(scaleFactor / this.f126443f);
        this.f126443f = this.f126444g;
        return true;
    }

    private void a(float f2, float f3) {
        this.f126448k.set(f2, f3);
        this.f126448k.offset((float) (-this.f126441d), (float) (-this.f126442e));
    }

    private PointF b(float f2, float f3) {
        PointF pointF = new PointF();
        pointF.x = f2 / ((float) this.f126439b);
        pointF.y = f3 / ((float) this.f126440c);
        return pointF;
    }

    public b(k kVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f126438a = kVar;
        this.f126439b = marginLayoutParams.width;
        this.f126440c = marginLayoutParams.height;
        this.f126441d = marginLayoutParams.getMarginStart();
        this.f126442e = marginLayoutParams.topMargin;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f126446i) {
            this.f126447j.x = motionEvent.getX();
            this.f126447j.y = motionEvent.getY();
            this.f126446i = false;
        }
        float x = motionEvent2.getX() - this.f126447j.x;
        float y = motionEvent2.getY() - this.f126447j.y;
        a(motionEvent2.getX(), motionEvent2.getY());
        k kVar = this.f126438a;
        float f4 = this.f126448k.x / ((float) this.f126439b);
        float f5 = this.f126448k.y;
        int i2 = this.f126440c;
        kVar.a(f4, f5 / ((float) i2), x / ((float) this.f126439b), y / ((float) i2));
        this.f126447j.x = motionEvent2.getX();
        this.f126447j.y = motionEvent2.getY();
        if (motionEvent == null || motionEvent.getX() == this.f126445h) {
            return true;
        }
        this.f126445h = motionEvent.getX();
        return true;
    }
}
