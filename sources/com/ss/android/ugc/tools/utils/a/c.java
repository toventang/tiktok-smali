package com.ss.android.ugc.tools.utils.a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends d {

    /* renamed from: i  reason: collision with root package name */
    public float f149987i;

    /* renamed from: j  reason: collision with root package name */
    public float f149988j;
    private boolean q;
    private final a r;

    public interface a {
        static {
            Covode.recordClassIndex(98735);
        }

        boolean a(c cVar);

        void b(c cVar);

        boolean c(c cVar);
    }

    public static class b implements a {
        static {
            Covode.recordClassIndex(98736);
        }

        @Override // com.ss.android.ugc.tools.utils.a.c.a
        public boolean a(c cVar) {
            l.d(cVar, "");
            return false;
        }

        @Override // com.ss.android.ugc.tools.utils.a.c.a
        public void b(c cVar) {
            l.d(cVar, "");
        }

        @Override // com.ss.android.ugc.tools.utils.a.c.a
        public boolean c(c cVar) {
            l.d(cVar, "");
            return true;
        }
    }

    static {
        Covode.recordClassIndex(98734);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a
    public final void a() {
        super.a();
        this.q = false;
    }

    public final float b() {
        return (float) (Math.atan2((double) this.f149992l, (double) this.f149991k) - Math.atan2((double) this.n, (double) this.f149993m));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a, com.ss.android.ugc.tools.utils.a.d
    public final void b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        super.b(motionEvent);
        d(motionEvent);
    }

    private final void d(MotionEvent motionEvent) {
        int i2;
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & 255) == 6) {
            i2 = motionEvent.getActionIndex();
        } else {
            i2 = -1;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i2 != i3) {
                f2 += motionEvent.getX(i3);
                f3 += motionEvent.getY(i3);
            }
        }
        float f4 = (float) pointerCount;
        this.f149987i = f2 / f4;
        this.f149988j = f3 / f4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, a aVar) {
        super(context);
        l.d(context, "");
        l.d(aVar, "");
        this.r = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a, com.ss.android.ugc.tools.utils.a.d
    public final void a(int i2, MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (i2 != 2) {
            if (i2 == 5) {
                a();
                this.f149975a = MotionEvent.obtain(motionEvent);
                this.f149980f = 0;
                b(motionEvent);
                boolean c2 = c(motionEvent);
                this.q = c2;
                if (!c2) {
                    this.f149979e = this.r.c(this);
                }
            }
        } else if (this.q) {
            boolean c3 = c(motionEvent);
            this.q = c3;
            if (!c3) {
                this.f149979e = this.r.c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.utils.a.a, com.ss.android.ugc.tools.utils.a.d
    public final void b(int i2, MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (i2 == 2) {
            b(motionEvent);
            if (this.f149977c / this.f149978d > 0.67f && this.r.a(this)) {
                MotionEvent motionEvent2 = this.f149975a;
                if (motionEvent2 == null) {
                    l.b();
                }
                motionEvent2.recycle();
                this.f149975a = MotionEvent.obtain(motionEvent);
            }
        } else if (i2 == 3) {
            if (!this.q) {
                this.r.b(this);
            }
            a();
        } else if (i2 == 6) {
            b(motionEvent);
            if (!this.q) {
                this.r.b(this);
            }
            a();
        }
    }
}
