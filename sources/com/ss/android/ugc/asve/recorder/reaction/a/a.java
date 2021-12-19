package com.ss.android.ugc.asve.recorder.reaction.a;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.asve.recorder.view.d;
import com.ss.android.ugc.asve.recorder.view.i;
import com.ss.android.ugc.tools.utils.a.b;
import h.f.b.l;
import java.util.Objects;

public final class a extends i implements d {

    /* renamed from: a  reason: collision with root package name */
    final ScaleGestureDetector f62311a;

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.asve.recorder.camera.d f62312b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f62313c = true;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.tools.utils.a.b f62314d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.core.h.d f62315e;

    /* renamed from: f  reason: collision with root package name */
    private final ASCameraView f62316f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.asve.recorder.reaction.a f62317g;

    /* renamed from: h  reason: collision with root package name */
    private final b f62318h;

    static {
        Covode.recordClassIndex(38289);
    }

    @Override // com.ss.android.ugc.asve.recorder.view.i
    public final boolean a() {
        if (!this.f62313c) {
            return false;
        }
        this.f62316f.a(com.ss.android.ugc.asve.c.b.f61938a);
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.view.g, com.ss.android.ugc.asve.recorder.view.i
    public final void b() {
        View a2 = this.f62318h.a();
        if (a2 != null) {
            a2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(boolean z) {
        this.f62313c = z;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$a  reason: collision with other inner class name */
    public static final class GestureDetector$OnDoubleTapListenerC1363a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62319a;

        static {
            Covode.recordClassIndex(38290);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        GestureDetector$OnDoubleTapListenerC1363a(a aVar) {
            this.f62319a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f62319a.a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            motionEvent.getX();
            motionEvent.getY();
            return true;
        }
    }

    public static final class b implements b.AbstractC4046b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62320a;

        static {
            Covode.recordClassIndex(38291);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f62320a = aVar;
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
            l.d(bVar, "");
            this.f62320a.b();
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            l.d(bVar, "");
            return this.f62320a.b(bVar.f149983i.x, bVar.f149983i.y);
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            l.d(bVar, "");
            return this.f62320a.a(f2, f3);
        }
    }

    public static final class c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62321a;

        static {
            Covode.recordClassIndex(38292);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f62321a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            l.d(scaleGestureDetector, "");
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            a aVar = this.f62321a;
            return aVar.f62312b.a(currentSpan, aVar.f62311a.getScaleFactor());
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f62314d.a(motionEvent);
        this.f62311a.onTouchEvent(motionEvent);
        this.f62315e.a(motionEvent);
    }

    @Override // com.ss.android.ugc.asve.recorder.view.g, com.ss.android.ugc.asve.recorder.view.i
    public final boolean b(float f2, float f3) {
        this.f62317g.a((int) f2, (int) f3);
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.view.g, com.ss.android.ugc.asve.recorder.view.i
    public final boolean a(float f2, float f3) {
        ViewGroup.LayoutParams layoutParams = this.f62316f.getPresentView().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = Build.VERSION.SDK_INT;
        if (!this.f62317g.b((int) (f2 - ((float) Math.min(marginLayoutParams.getMarginStart(), marginLayoutParams.leftMargin))), (int) (f3 - ((float) marginLayoutParams.topMargin)))) {
            return false;
        }
        View a2 = this.f62318h.a();
        if (a2 == null) {
            return true;
        }
        a2.setVisibility(0);
        return true;
    }

    public a(Context context, ASCameraView aSCameraView, com.ss.android.ugc.asve.recorder.reaction.a aVar, com.ss.android.ugc.asve.recorder.camera.d dVar, b bVar) {
        l.d(context, "");
        l.d(aSCameraView, "");
        l.d(aVar, "");
        l.d(dVar, "");
        l.d(bVar, "");
        this.f62316f = aSCameraView;
        this.f62317g = aVar;
        this.f62312b = dVar;
        this.f62318h = bVar;
        this.f62311a = new ScaleGestureDetector(context, new c(this));
        this.f62314d = new com.ss.android.ugc.tools.utils.a.b(context, new b(this));
        androidx.core.h.d dVar2 = new androidx.core.h.d(context, new GestureDetector.SimpleOnGestureListener());
        dVar2.a(new GestureDetector$OnDoubleTapListenerC1363a(this));
        this.f62315e = dVar2;
    }
}
