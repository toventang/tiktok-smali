package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.a;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.shortvideo.x.k;

public final class d extends com.bytedance.creativex.recorder.gesture.api.d {

    /* renamed from: a  reason: collision with root package name */
    private final k f130255a;

    /* renamed from: b  reason: collision with root package name */
    private int f130256b;

    /* renamed from: c  reason: collision with root package name */
    private int f130257c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f130258d;

    /* renamed from: e  reason: collision with root package name */
    private PointF f130259e = new PointF(-2.0f, -2.0f);

    /* renamed from: f  reason: collision with root package name */
    private PointF f130260f = new PointF();

    static {
        Covode.recordClassIndex(85442);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130255a.e(this.f130260f.x / ((float) this.f130256b), this.f130260f.y / ((float) this.f130257c));
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean d(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130255a.a(0, this.f130260f.x / ((float) this.f130256b), this.f130260f.y / ((float) this.f130257c), 1);
        this.f130258d = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean e(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130255a.a(2, this.f130260f.x / ((float) this.f130256b), this.f130260f.y / ((float) this.f130257c), 1);
        this.f130258d = false;
        return false;
    }

    public d(Context context, k kVar) {
        this.f130256b = n.b(context);
        this.f130255a = kVar;
    }

    private void a(float f2, float f3) {
        this.f130257c = a.f66177a.b(a.c());
        int d2 = a.f66177a.d();
        this.f130260f.set(f2, f3);
        this.f130260f.offset(0.0f, (float) (-d2));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f130258d) {
            this.f130259e.x = motionEvent.getX();
            this.f130259e.y = motionEvent.getY();
            this.f130258d = false;
        }
        float x = motionEvent2.getX() - this.f130259e.x;
        float y = motionEvent2.getY() - this.f130259e.y;
        a(motionEvent2.getX(), motionEvent2.getY());
        k kVar = this.f130255a;
        float f4 = this.f130260f.x / ((float) this.f130256b);
        float f5 = this.f130260f.y;
        int i2 = this.f130257c;
        kVar.a(f4, f5 / ((float) i2), x / ((float) this.f130256b), y / ((float) i2));
        this.f130259e.x = motionEvent2.getX();
        this.f130259e.y = motionEvent2.getY();
        return true;
    }
}
