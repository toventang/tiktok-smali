package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {
    static final float u = 0.67f;
    public static final a v = new a((byte) 0);
    private static final String x = "ScaleGestureDetector";

    /* renamed from: a  reason: collision with root package name */
    public boolean f129347a;

    /* renamed from: b  reason: collision with root package name */
    MotionEvent f129348b;

    /* renamed from: c  reason: collision with root package name */
    public final Vector2D f129349c = new Vector2D();

    /* renamed from: d  reason: collision with root package name */
    public float f129350d;

    /* renamed from: e  reason: collision with root package name */
    public float f129351e;

    /* renamed from: f  reason: collision with root package name */
    public float f129352f;

    /* renamed from: g  reason: collision with root package name */
    public float f129353g;

    /* renamed from: h  reason: collision with root package name */
    public float f129354h;

    /* renamed from: i  reason: collision with root package name */
    public float f129355i;

    /* renamed from: j  reason: collision with root package name */
    float f129356j;

    /* renamed from: k  reason: collision with root package name */
    float f129357k;

    /* renamed from: l  reason: collision with root package name */
    float f129358l;

    /* renamed from: m  reason: collision with root package name */
    float f129359m;
    float n;
    public long o;
    boolean p;
    int q;
    int r;
    boolean s;
    final b t;
    private MotionEvent w;

    public interface b {
        static {
            Covode.recordClassIndex(84905);
        }

        boolean a(View view, e eVar);

        boolean b(View view, e eVar);

        void c(View view, e eVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84904);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(84903);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        MotionEvent motionEvent = this.f129348b;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f129348b = null;
        }
        MotionEvent motionEvent2 = this.w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.w = null;
        }
        this.f129347a = false;
        this.q = -1;
        this.r = -1;
        this.p = false;
    }

    public e(b bVar) {
        l.d(bVar, "");
        this.t = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.w = MotionEvent.obtain(motionEvent);
        this.f129356j = -1.0f;
        this.f129357k = -1.0f;
        this.f129358l = -1.0f;
        this.f129349c.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.f129348b;
        if (motionEvent3 == null) {
            l.b();
        }
        int findPointerIndex = motionEvent3.findPointerIndex(this.q);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.r);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.q);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.r);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.p = true;
            new Throwable();
            if (this.f129347a) {
                this.t.c(view, this);
                return;
            }
            return;
        }
        float x2 = motionEvent3.getX(findPointerIndex);
        float y = motionEvent3.getY(findPointerIndex);
        float x3 = motionEvent3.getX(findPointerIndex2);
        float y2 = motionEvent3.getY(findPointerIndex2);
        float x4 = motionEvent.getX(findPointerIndex3);
        float y3 = motionEvent.getY(findPointerIndex3);
        float x5 = motionEvent.getX(findPointerIndex4) - x4;
        float y4 = motionEvent.getY(findPointerIndex4) - y3;
        this.f129349c.set(x5, y4);
        this.f129352f = x3 - x2;
        this.f129353g = y2 - y;
        this.f129354h = x5;
        this.f129355i = y4;
        this.f129350d = x4 + (x5 * 0.5f);
        this.f129351e = y3 + (y4 * 0.5f);
        this.o = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.f129359m = motionEvent.getPressure(findPointerIndex3) + motionEvent.getPressure(findPointerIndex4);
        this.n = motionEvent3.getPressure(findPointerIndex) + motionEvent3.getPressure(findPointerIndex2);
    }

    static int a(MotionEvent motionEvent, int i2, int i3) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (!(i4 == i3 || i4 == findPointerIndex)) {
                return i4;
            }
        }
        return -1;
    }
}
