package com.bytedance.creativex.recorder.gesture.api;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
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

public class VideoRecordGestureLayout extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    a f28348a;

    /* renamed from: b  reason: collision with root package name */
    d f28349b;

    /* renamed from: c  reason: collision with root package name */
    ScaleGestureDetector f28350c;

    /* renamed from: d  reason: collision with root package name */
    c f28351d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.tools.utils.a.b f28352e;

    /* renamed from: f  reason: collision with root package name */
    float f28353f;

    /* renamed from: g  reason: collision with root package name */
    float f28354g;

    /* renamed from: h  reason: collision with root package name */
    float f28355h;

    /* renamed from: i  reason: collision with root package name */
    float f28356i;

    /* renamed from: j  reason: collision with root package name */
    boolean f28357j;

    /* renamed from: k  reason: collision with root package name */
    private c.b f28358k;

    /* renamed from: l  reason: collision with root package name */
    private b.AbstractC4046b f28359l;

    public interface a {
        static {
            Covode.recordClassIndex(16650);
        }

        void a(MotionEvent motionEvent, int[] iArr);

        boolean a();

        boolean a(float f2);

        boolean a(MotionEvent motionEvent);

        boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean a(ScaleGestureDetector scaleGestureDetector);

        boolean a(com.ss.android.ugc.tools.utils.a.b bVar);

        boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3);

        boolean a(c cVar);

        void b(MotionEvent motionEvent, int[] iArr);

        void b(com.ss.android.ugc.tools.utils.a.b bVar);

        boolean b();

        boolean b(float f2);

        boolean b(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);

        boolean b(ScaleGestureDetector scaleGestureDetector);

        void c();

        void c(MotionEvent motionEvent, int[] iArr);

        boolean c(float f2);

        boolean c(MotionEvent motionEvent);

        void d(MotionEvent motionEvent, int[] iArr);

        boolean d(MotionEvent motionEvent);

        void e(MotionEvent motionEvent, int[] iArr);

        boolean e(MotionEvent motionEvent);

        void f(MotionEvent motionEvent);
    }

    public static abstract class b implements a {
        static {
            Covode.recordClassIndex(16651);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void a(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a() {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean a(c cVar) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void b(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void b(com.ss.android.ugc.tools.utils.a.b bVar) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean b() {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean b(float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean b(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public final void c() {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void c(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean c(float f2) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean c(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void d(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean d(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void e(MotionEvent motionEvent, int[] iArr) {
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public boolean e(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
        public void f(MotionEvent motionEvent) {
        }
    }

    static {
        Covode.recordClassIndex(16647);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public a getOnGestureListener() {
        return this.f28348a;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.f28350c;
    }

    public void setOnGestureListener(a aVar) {
        this.f28348a = aVar;
    }

    public void onLongPress(MotionEvent motionEvent) {
        a aVar = this.f28348a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void setSloppyExtra(int i2) {
        this.f28351d.o = i2;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28348a;
        if (aVar == null || !aVar.a(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28348a;
        if (aVar != null) {
            aVar.a(this.f28353f);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a aVar = this.f28348a;
        if (aVar == null || !aVar.a(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a aVar = this.f28348a;
        if (aVar == null) {
            return false;
        }
        boolean b2 = aVar.b(scaleGestureDetector);
        if (b2) {
            this.f28353f = scaleGestureDetector.getScaleFactor();
        }
        return b2;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f28355h = motionEvent.getX();
        this.f28356i = motionEvent.getY();
        a aVar = this.f28348a;
        if (aVar == null || !aVar.b(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f28350c.onTouchEvent(motionEvent);
        this.f28351d.a(motionEvent);
        this.f28352e.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f28357j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f28357j = true;
        }
        if (!this.f28357j) {
            this.f28349b.a(motionEvent);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f28349b.a(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i2 = measuredWidth / 10;
        int i3 = measuredHeight / 10;
        if (this.f28348a == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f28355h;
        float y = motionEvent.getY() - this.f28356i;
        if ((x * x) + (y * y) >= this.f28354g) {
            return false;
        }
        float f2 = (float) i2;
        if (motionEvent.getX() >= f2 && ((float) measuredWidth) - motionEvent.getX() >= f2) {
            float f3 = (float) i3;
            if (motionEvent.getY() >= f3 && ((float) measuredHeight) - motionEvent.getY() >= f3) {
                return this.f28348a.c(motionEvent);
            }
        }
        return false;
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        a aVar = this.f28348a;
        if (aVar == null) {
            return false;
        }
        aVar.f(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28348a.d(motionEvent);
        } else if (action == 1 || action == 3) {
            this.f28348a.e(motionEvent);
        } else if (action == 5) {
            this.f28348a.a();
        } else if (action == 6) {
            this.f28348a.b();
        }
        return false;
    }

    private VideoRecordGestureLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5233);
        this.f28353f = 1.0f;
        this.f28358k = new c.b() {
            /* class com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16648);
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final boolean c(c cVar) {
                if (VideoRecordGestureLayout.this.f28348a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f28348a.a(cVar);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final boolean a(c cVar) {
                float b2 = cVar.b();
                if (VideoRecordGestureLayout.this.f28348a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f28348a.b(b2);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.c.a, com.ss.android.ugc.tools.utils.a.c.b
            public final void b(c cVar) {
                float b2 = cVar.b();
                if (VideoRecordGestureLayout.this.f28348a != null) {
                    VideoRecordGestureLayout.this.f28348a.c(b2);
                }
            }
        };
        this.f28359l = new b.AbstractC4046b() {
            /* class com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16649);
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
                if (VideoRecordGestureLayout.this.f28348a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f28348a.a(bVar);
                return true;
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
                if (VideoRecordGestureLayout.this.f28348a != null) {
                    VideoRecordGestureLayout.this.f28348a.b(bVar);
                }
            }

            @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
            public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
                if (VideoRecordGestureLayout.this.f28348a == null) {
                    return true;
                }
                VideoRecordGestureLayout.this.f28348a.a(bVar, f2, f3);
                return true;
            }
        };
        this.f28351d = new c(context, this.f28358k);
        this.f28352e = new com.ss.android.ugc.tools.utils.a.b(context, this.f28359l);
        d dVar = new d(context, this);
        this.f28349b = dVar;
        dVar.a(this);
        this.f28350c = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f28354g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f28350c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f28350c)).intValue();
            Field declaredField2 = this.f28350c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f28350c, Integer.valueOf(intValue * 6));
            MethodCollector.o(5233);
        } catch (Throwable unused) {
            MethodCollector.o(5233);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        a aVar = this.f28348a;
        if (aVar == null || !aVar.b(motionEvent, motionEvent2, f2, f3)) {
            return false;
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        a aVar;
        if (motionEvent == null || motionEvent2 == null || (aVar = this.f28348a) == null) {
            return false;
        }
        aVar.a(motionEvent, motionEvent2, f2, f3);
        return true;
    }
}
