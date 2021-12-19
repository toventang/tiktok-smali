package com.bytedance.f.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.h.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import java.lang.reflect.Field;

public final class h extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    a f28734a;

    /* renamed from: b  reason: collision with root package name */
    d f28735b;

    /* renamed from: c  reason: collision with root package name */
    ScaleGestureDetector f28736c;

    /* renamed from: d  reason: collision with root package name */
    c f28737d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.tools.utils.a.b f28738e;

    /* renamed from: f  reason: collision with root package name */
    float f28739f;

    /* renamed from: g  reason: collision with root package name */
    float f28740g;

    /* renamed from: h  reason: collision with root package name */
    float f28741h;

    /* renamed from: i  reason: collision with root package name */
    float f28742i;

    /* renamed from: j  reason: collision with root package name */
    boolean f28743j;

    /* renamed from: k  reason: collision with root package name */
    private float f28744k;

    /* renamed from: l  reason: collision with root package name */
    private c.b f28745l;

    /* renamed from: m  reason: collision with root package name */
    private b.AbstractC4046b f28746m;

    public interface a {
        static {
            Covode.recordClassIndex(16907);
        }

        boolean a();

        boolean a(float f2);

        boolean a(MotionEvent motionEvent);

        boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean a(ScaleGestureDetector scaleGestureDetector);

        boolean a(com.ss.android.ugc.tools.utils.a.b bVar);

        boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3);

        boolean a(c cVar);

        void b(com.ss.android.ugc.tools.utils.a.b bVar);

        boolean b();

        boolean b(float f2);

        boolean b(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean b(ScaleGestureDetector scaleGestureDetector);

        boolean c(float f2);

        boolean c(MotionEvent motionEvent);

        boolean d(MotionEvent motionEvent);

        void e(MotionEvent motionEvent);

        boolean f(MotionEvent motionEvent);
    }

    public static abstract class b implements a {
        static {
            Covode.recordClassIndex(16908);
        }

        @Override // com.bytedance.f.a.a.h.a
        public final boolean a() {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(float f2) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public final boolean a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean a(c cVar) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public void b(com.ss.android.ugc.tools.utils.a.b bVar) {
        }

        @Override // com.bytedance.f.a.a.h.a
        public final boolean b() {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean b(float f2) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean c(float f2) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public final boolean d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a
        public void e(MotionEvent motionEvent) {
        }

        @Override // com.bytedance.f.a.a.h.a
        public boolean f(MotionEvent motionEvent) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(16904);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final a getOnGestureListener() {
        return this.f28734a;
    }

    public final float getProtectY() {
        return this.f28744k;
    }

    public final ScaleGestureDetector getScaleGestureDetector() {
        return this.f28736c;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setOnGestureListener(a aVar) {
        this.f28734a = aVar;
    }

    public h(Context context) {
        this(context, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setSloppyExtra(int i2) {
        this.f28737d.o = i2;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28734a;
        if (aVar == null || !aVar.b(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28734a;
        if (aVar != null) {
            aVar.c(this.f28739f);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a aVar = this.f28734a;
        if (aVar == null || !aVar.c(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setProtectY(float f2) {
        this.f28744k = (f2 * 17.0f) / 20.0f;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28734a;
        if (aVar == null) {
            return false;
        }
        boolean a2 = aVar.a(scaleGestureDetector);
        if (a2) {
            this.f28739f = scaleGestureDetector.getScaleFactor();
        }
        return a2;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f28741h = motionEvent.getX();
        this.f28742i = motionEvent.getY();
        a aVar = this.f28734a;
        if (aVar == null || !aVar.d(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f28736c.onTouchEvent(motionEvent);
        this.f28737d.a(motionEvent);
        this.f28738e.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f28743j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f28743j = true;
        }
        if (!this.f28743j) {
            this.f28735b.a(motionEvent);
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i2 = measuredWidth / 10;
        int i3 = measuredHeight / 10;
        if (this.f28734a == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f28741h;
        float y = motionEvent.getY() - this.f28742i;
        if ((x * x) + (y * y) >= this.f28740g) {
            return false;
        }
        float f2 = (float) i2;
        if (motionEvent.getX() >= f2 && ((float) measuredWidth) - motionEvent.getX() >= f2) {
            float f3 = (float) i3;
            if (motionEvent.getY() >= f3 && ((float) measuredHeight) - motionEvent.getY() >= f3) {
                return this.f28734a.a(motionEvent);
            }
        }
        return false;
    }

    private h(Context context, byte b2) {
        this(context, (char) 0);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f28734a == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28734a.b(motionEvent);
        } else if (action == 1) {
            this.f28734a.f(motionEvent);
        } else if (action == 3) {
            this.f28734a.f(motionEvent);
        } else if (action == 5) {
            this.f28734a.a();
        } else if (action == 6) {
            this.f28734a.b();
        }
        this.f28734a.e(motionEvent);
        return false;
    }

    private h(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(3568);
        this.f28739f = 1.0f;
        this.f28744k = 1000.0f;
        this.f28745l = new c.b() {
            /* class com.bytedance.f.a.a.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16905);
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final boolean c(c cVar) {
                if (h.this.f28734a == null) {
                    return true;
                }
                h.this.f28734a.a(cVar);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final boolean a(c cVar) {
                float b2 = cVar.b();
                if (h.this.f28734a == null) {
                    return true;
                }
                h.this.f28734a.a(b2);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final void b(c cVar) {
                float b2 = cVar.b();
                if (h.this.f28734a != null) {
                    h.this.f28734a.b(b2);
                }
            }
        };
        this.f28746m = new b.AbstractC4046b() {
            /* class com.bytedance.f.a.a.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16906);
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
                if (h.this.f28734a == null) {
                    return true;
                }
                h.this.f28734a.a(bVar);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
                if (h.this.f28734a != null) {
                    h.this.f28734a.b(bVar);
                }
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
                if (h.this.f28734a == null) {
                    return true;
                }
                h.this.f28734a.a(bVar, f2, f3);
                return true;
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f28737d = new c(applicationContext, this.f28745l);
        this.f28738e = new com.ss.android.ugc.tools.utils.a.b(applicationContext, this.f28746m);
        d dVar = new d(applicationContext, this);
        this.f28735b = dVar;
        dVar.a();
        this.f28735b.a(this);
        this.f28736c = new ScaleGestureDetector(applicationContext, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f28740g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f28736c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f28736c)).intValue();
            Field declaredField2 = this.f28736c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f28736c, Integer.valueOf(intValue * 6));
            MethodCollector.o(3568);
        } catch (Throwable unused) {
            MethodCollector.o(3568);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        a aVar = this.f28734a;
        if (aVar == null || !aVar.a(motionEvent, motionEvent2, f2, f3)) {
            return false;
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        a aVar;
        if (motionEvent == null || motionEvent2 == null || (aVar = this.f28734a) == null) {
            return false;
        }
        aVar.b(motionEvent, motionEvent2, f2, f3);
        return true;
    }
}
