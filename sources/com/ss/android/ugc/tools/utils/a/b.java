package com.ss.android.ugc.tools.utils.a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f149982j = new a((byte) 0);
    private static final PointF o = new PointF();

    /* renamed from: i  reason: collision with root package name */
    public PointF f149983i = new PointF();

    /* renamed from: k  reason: collision with root package name */
    private PointF f149984k;

    /* renamed from: l  reason: collision with root package name */
    private PointF f149985l;

    /* renamed from: m  reason: collision with root package name */
    private final PointF f149986m = new PointF();
    private final AbstractC4046b n;

    /* renamed from: com.ss.android.ugc.tools.utils.a.b$b  reason: collision with other inner class name */
    public interface AbstractC4046b {
        static {
            Covode.recordClassIndex(98733);
        }

        boolean a(b bVar);

        boolean a(b bVar, float f2, float f3);

        void b(b bVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98732);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98731);
    }

    private static PointF c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            f2 += motionEvent.getX(i2);
            f3 += motionEvent.getY(i2);
        }
        float f4 = (float) pointerCount;
        return new PointF(f2 / f4, f3 / f4);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public final void b(MotionEvent motionEvent) {
        PointF pointF;
        l.d(motionEvent, "");
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.f149975a;
        this.f149984k = c(motionEvent);
        if (motionEvent2 == null) {
            l.b();
        }
        this.f149985l = c(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = o;
        } else {
            PointF pointF2 = this.f149984k;
            if (pointF2 == null) {
                l.b();
            }
            float f2 = pointF2.x;
            PointF pointF3 = this.f149985l;
            if (pointF3 == null) {
                l.b();
            }
            float f3 = f2 - pointF3.x;
            PointF pointF4 = this.f149984k;
            if (pointF4 == null) {
                l.b();
            }
            float f4 = pointF4.y;
            PointF pointF5 = this.f149985l;
            if (pointF5 == null) {
                l.b();
            }
            pointF = new PointF(f3, f4 - pointF5.y);
        }
        this.f149983i = pointF;
        this.f149986m.x += this.f149983i.x;
        this.f149986m.y += this.f149983i.y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AbstractC4046b bVar) {
        super(context);
        l.d(context, "");
        l.d(bVar, "");
        this.n = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public final void a(int i2, MotionEvent motionEvent) {
        float x;
        l.d(motionEvent, "");
        if (i2 == 0) {
            a();
            this.f149986m.x = 0.0f;
            this.f149986m.y = 0.0f;
            this.f149975a = MotionEvent.obtain(motionEvent);
            this.f149980f = 0;
            b(motionEvent);
        } else if (i2 == 2) {
            AbstractC4046b bVar = this.n;
            MotionEvent motionEvent2 = this.f149975a;
            float f2 = -1.0f;
            if (motionEvent2 == null) {
                x = -1.0f;
            } else {
                x = motionEvent2.getX();
            }
            MotionEvent motionEvent3 = this.f149975a;
            if (motionEvent3 != null) {
                f2 = motionEvent3.getY();
            }
            this.f149979e = bVar.a(this, x, f2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public final void b(int i2, MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
            } else if (this.f149975a != null) {
                b(motionEvent);
                if (this.f149977c / this.f149978d > 0.67f && this.n.a(this)) {
                    MotionEvent motionEvent2 = this.f149975a;
                    if (motionEvent2 == null) {
                        l.b();
                    }
                    motionEvent2.recycle();
                    this.f149975a = MotionEvent.obtain(motionEvent);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        this.n.b(this);
        a();
    }
}
