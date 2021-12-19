package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class LiveSkyLightTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f94117a;

    /* renamed from: b  reason: collision with root package name */
    private float f94118b;

    /* renamed from: c  reason: collision with root package name */
    private float f94119c;

    /* renamed from: d  reason: collision with root package name */
    private long f94120d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.a<z> f94121e = a.f94124a;

    /* renamed from: f  reason: collision with root package name */
    private m<? super Float, ? super Float, Boolean> f94122f = b.f94125a;

    /* renamed from: g  reason: collision with root package name */
    private boolean f94123g;

    static {
        Covode.recordClassIndex(59824);
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f94124a = new a();

        static {
            Covode.recordClassIndex(59825);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final h.f.a.a<z> getCallBack() {
        return this.f94121e;
    }

    public final boolean getNeedIntercept() {
        return this.f94123g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean>, h.f.a.m<java.lang.Float, java.lang.Float, java.lang.Boolean> */
    public final m<Float, Float, Boolean> getScrollPredicate() {
        return this.f94122f;
    }

    public final void setNeedIntercept(boolean z) {
        this.f94123g = z;
    }

    public final void setCallBack(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f94121e = aVar;
    }

    public final void setScrollPredicate(m<? super Float, ? super Float, Boolean> mVar) {
        l.d(mVar, "");
        this.f94122f = mVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        super.onInterceptTouchEvent(motionEvent);
        this.f94117a = false;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f94118b = motionEvent.getX();
            this.f94119c = motionEvent.getY();
            this.f94120d = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 2 && this.f94123g) {
                float x = motionEvent.getX() - this.f94118b;
                float y = motionEvent.getY() - this.f94119c;
                if (Math.abs(x) > ((float) CustomInterceptTouchEventFrameLayout.f68301a) || Math.abs(y) > ((float) CustomInterceptTouchEventFrameLayout.f68301a)) {
                    if (this.f94122f.invoke(Float.valueOf(x), Float.valueOf(y)).booleanValue()) {
                        this.f94121e.invoke();
                        this.f94117a = true;
                    }
                } else if (System.currentTimeMillis() - this.f94120d > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                    this.f94121e.invoke();
                    this.f94117a = true;
                }
            }
        } else if (this.f94123g) {
            float x2 = motionEvent.getX() - this.f94118b;
            float y2 = motionEvent.getY() - this.f94119c;
            if (Math.abs(x2) < ((float) CustomInterceptTouchEventFrameLayout.f68301a) && Math.abs(y2) < ((float) CustomInterceptTouchEventFrameLayout.f68301a)) {
                this.f94121e.invoke();
                this.f94117a = true;
            }
        }
        return this.f94117a;
    }

    static final class b extends h.f.b.m implements m<Float, Float, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f94125a = new b();

        static {
            Covode.recordClassIndex(59826);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Float f2, Float f3) {
            f2.floatValue();
            f3.floatValue();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSkyLightTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10544);
        MethodCollector.o(10544);
    }
}
