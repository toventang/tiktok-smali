package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    ScaleGestureDetector f129236a;

    /* renamed from: b  reason: collision with root package name */
    GestureDetector f129237b;

    /* renamed from: c  reason: collision with root package name */
    public GestureDetector$OnDoubleTapListenerC3364a f129238c;

    /* renamed from: d  reason: collision with root package name */
    boolean f129239d;

    /* renamed from: e  reason: collision with root package name */
    boolean f129240e;

    /* renamed from: f  reason: collision with root package name */
    boolean f129241f;

    /* renamed from: g  reason: collision with root package name */
    public MotionEvent f129242g;

    /* renamed from: h  reason: collision with root package name */
    private final GestureDetector.OnGestureListener f129243h;

    /* renamed from: i  reason: collision with root package name */
    private final ScaleGestureDetector.OnScaleGestureListener f129244i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$a  reason: collision with other inner class name */
    public static class GestureDetector$OnDoubleTapListenerC3364a implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
        static {
            Covode.recordClassIndex(84840);
        }

        public void a() {
        }

        public void a(int i2) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            l.d(motionEvent, "");
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            return false;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
            l.d(motionEvent, "");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }
    }

    static {
        Covode.recordClassIndex(84839);
    }

    public static final class b implements GestureDetector.OnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129258a;

        static {
            Covode.recordClassIndex(84841);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f129258a = aVar;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar != null) {
                aVar.onLongPress(motionEvent);
            }
        }

        public final void onShowPress(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar != null) {
                aVar.onShowPress(motionEvent);
            }
        }

        public final boolean onDown(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar != null) {
                return aVar.onDown(motionEvent);
            }
            return false;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar == null) {
                l.b();
            }
            return aVar.onSingleTapUp(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar != null) {
                return aVar.onFling(motionEvent, motionEvent2, f2, f3);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129258a.f129238c;
            if (aVar != null) {
                return aVar.onScroll(motionEvent, motionEvent2, f2, f3);
            }
            return false;
        }
    }

    public static final class c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129259a;

        static {
            Covode.recordClassIndex(84842);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f129259a = aVar;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129259a.f129238c;
            if (aVar != null) {
                aVar.onScaleEnd(scaleGestureDetector);
            }
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129259a.f129238c;
            if (aVar != null) {
                return aVar.onScale(scaleGestureDetector);
            }
            return false;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            if (this.f129259a.f129242g != null) {
                MotionEvent motionEvent = this.f129259a.f129242g;
                if (motionEvent == null) {
                    l.b();
                }
                if (motionEvent.getPointerCount() <= 1) {
                    return false;
                }
            }
            GestureDetector$OnDoubleTapListenerC3364a aVar = this.f129259a.f129238c;
            if (aVar == null) {
                l.b();
            }
            return aVar.onScaleBegin(scaleGestureDetector);
        }
    }

    public a(Context context, GestureDetector$OnDoubleTapListenerC3364a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        b bVar = new b(this);
        this.f129243h = bVar;
        c cVar = new c(this);
        this.f129244i = cVar;
        this.f129238c = aVar;
        GestureDetector gestureDetector = new GestureDetector(context, bVar);
        this.f129237b = gestureDetector;
        gestureDetector.setOnDoubleTapListener(aVar);
        this.f129236a = new ScaleGestureDetector(context, cVar);
        int i2 = Build.VERSION.SDK_INT;
        ScaleGestureDetector scaleGestureDetector = this.f129236a;
        if (scaleGestureDetector == null) {
            l.b();
        }
        scaleGestureDetector.setQuickScaleEnabled(false);
        try {
            Field declaredField = ScaleGestureDetector.class.getDeclaredField("mMinSpan");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this.f129236a, 1);
        } catch (Throwable unused) {
        }
    }
}
