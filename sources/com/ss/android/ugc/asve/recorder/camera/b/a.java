package com.ss.android.ugc.asve.recorder.camera.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.asve.recorder.view.d;
import com.ss.android.ugc.asve.recorder.view.i;
import h.f.b.l;

public final class a extends i implements d {

    /* renamed from: a  reason: collision with root package name */
    final Context f62213a;

    /* renamed from: b  reason: collision with root package name */
    final ASCameraView f62214b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.d f62215c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62216d = true;

    /* renamed from: e  reason: collision with root package name */
    private final ScaleGestureDetector f62217e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.core.h.d f62218f;

    static {
        Covode.recordClassIndex(38236);
    }

    @Override // com.ss.android.ugc.asve.recorder.view.i
    public final boolean a() {
        if (!this.f62216d) {
            return false;
        }
        this.f62214b.a(com.ss.android.ugc.asve.c.b.f61939b);
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(boolean z) {
        this.f62216d = z;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$a  reason: collision with other inner class name */
    public static final class GestureDetector$OnDoubleTapListenerC1359a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62219a;

        static {
            Covode.recordClassIndex(38237);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        GestureDetector$OnDoubleTapListenerC1359a(a aVar) {
            this.f62219a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f62219a.a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            a aVar = this.f62219a;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            com.ss.android.ugc.asve.recorder.camera.d c2 = aVar.f62215c.c();
            int width = aVar.f62214b.getPresentView().getWidth();
            int height = aVar.f62214b.getPresentView().getHeight();
            Resources resources = aVar.f62213a.getResources();
            l.b(resources, "");
            if (c2.a(width, height, resources.getDisplayMetrics().density, new float[]{x, y})) {
                aVar.f62214b.getCameraViewHelper$lib_asve_release().a((int) x, (int) y);
                if (aVar.f62214b.getExposureCompensationEnable()) {
                    aVar.f62214b.a(x, y);
                }
            }
            return true;
        }
    }

    public static final class b implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62220a;

        static {
            Covode.recordClassIndex(38238);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f62220a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            return this.f62220a.f62215c.c().a(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f62217e.onTouchEvent(motionEvent);
        this.f62218f.a(motionEvent);
    }

    public a(Context context, ASCameraView aSCameraView, com.ss.android.ugc.asve.recorder.d dVar) {
        l.d(context, "");
        l.d(aSCameraView, "");
        l.d(dVar, "");
        this.f62213a = context;
        this.f62214b = aSCameraView;
        this.f62215c = dVar;
        this.f62217e = new ScaleGestureDetector(context, new b(this));
        androidx.core.h.d dVar2 = new androidx.core.h.d(context, new GestureDetector.SimpleOnGestureListener());
        dVar2.a(new GestureDetector$OnDoubleTapListenerC1359a(this));
        this.f62218f = dVar2;
    }
}
