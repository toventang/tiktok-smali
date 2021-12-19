package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.vesdk.bh;

public final class f extends d {

    /* renamed from: a  reason: collision with root package name */
    private final a f130282a;

    /* renamed from: b  reason: collision with root package name */
    private int f130283b;

    /* renamed from: c  reason: collision with root package name */
    private int f130284c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f130285d;

    /* renamed from: e  reason: collision with root package name */
    private PointF f130286e = new PointF(-2.0f, -2.0f);

    /* renamed from: f  reason: collision with root package name */
    private PointF f130287f = new PointF();

    static {
        Covode.recordClassIndex(85454);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean b(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130282a.c(this.f130287f.x / ((float) this.f130283b), this.f130287f.y / ((float) this.f130284c));
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean d(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130282a.a(0, this.f130287f.x / ((float) this.f130283b), this.f130287f.y / ((float) this.f130284c), 1);
        this.f130285d = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean e(MotionEvent motionEvent) {
        a(motionEvent.getX(), motionEvent.getY());
        this.f130282a.a(2, this.f130287f.x / ((float) this.f130283b), this.f130287f.y / ((float) this.f130284c), 1);
        this.f130285d = false;
        return false;
    }

    public f(Context context, a aVar) {
        this.f130283b = n.b(context);
        this.f130282a = aVar;
    }

    private void a(float f2, float f3) {
        this.f130284c = com.ss.android.ugc.aweme.adaptation.a.f66177a.b(com.ss.android.ugc.aweme.adaptation.a.c());
        int d2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
        this.f130287f.set(f2, f3);
        this.f130287f.offset(0.0f, (float) (-d2));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.d
    public final void a(bh bhVar, MotionEvent motionEvent) {
        super.a(bhVar, motionEvent);
        a(bhVar.f151098c, bhVar.f151099d);
        bhVar.f151098c = this.f130287f.x / ((float) this.f130283b);
        bhVar.f151099d = this.f130287f.y / ((float) this.f130284c);
        this.f130282a.a(bhVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f130285d) {
            this.f130286e.x = motionEvent.getX();
            this.f130286e.y = motionEvent.getY();
            this.f130285d = false;
        }
        float x = motionEvent2.getX() - this.f130286e.x;
        float y = motionEvent2.getY() - this.f130286e.y;
        a(motionEvent2.getX(), motionEvent2.getY());
        a aVar = this.f130282a;
        float f4 = this.f130287f.x / ((float) this.f130283b);
        float f5 = this.f130287f.y;
        int i2 = this.f130284c;
        aVar.a(f4, f5 / ((float) i2), x / ((float) this.f130283b), y / ((float) i2), 1.0f);
        this.f130286e.x = motionEvent2.getX();
        this.f130286e.y = motionEvent2.getY();
        return true;
    }
}
