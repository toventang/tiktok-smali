package com.ss.android.ugc.gamora.editor.progress;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class c implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public final g f146276a;

    /* renamed from: b  reason: collision with root package name */
    private final int f146277b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f146278c = i.a((h.f.a.a) a.f146279a);

    static {
        Covode.recordClassIndex(96149);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar) {
        l.d(bVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar, float f2, float f3) {
        l.d(bVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
        l.d(cVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void b(b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean d(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void e(MotionEvent motionEvent) {
        l.d(motionEvent, "");
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146279a = new a();

        static {
            Covode.recordClassIndex(96150);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(r.a(com.ss.android.ugc.aweme.port.in.i.f115645a));
        }
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f146276a.a();
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean f(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f146276a.b();
        return false;
    }

    public c(g gVar) {
        l.d(gVar, "");
        this.f146276a = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(com.ss.android.ugc.asve.a.b());
        l.b(viewConfiguration, "");
        this.f146277b = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            this.f146276a.b();
            return true;
        }
        this.f146276a.b();
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f146277b || abs <= abs2) {
            return false;
        }
        this.f146276a.a((motionEvent2.getX() - motionEvent.getX()) / ((float) ((Number) this.f146278c.getValue()).intValue()));
        return true;
    }
}
