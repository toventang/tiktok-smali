package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class AdHalfWebPageMaskLayer extends FrameLayout implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public static final b f75852b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f75853a;

    /* renamed from: c  reason: collision with root package name */
    private a f75854c;

    /* renamed from: d  reason: collision with root package name */
    private long f75855d;

    /* renamed from: e  reason: collision with root package name */
    private float f75856e;

    /* renamed from: f  reason: collision with root package name */
    private float f75857f;

    public interface a {
        static {
            Covode.recordClassIndex(46781);
        }

        void a();

        void a(boolean z);

        void b();
    }

    static {
        Covode.recordClassIndex(46780);
    }

    public AdHalfWebPageMaskLayer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(46782);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final a getCallback() {
        return this.f75854c;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageMaskLayer f75858a;

        static {
            Covode.recordClassIndex(46783);
        }

        c(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f75858a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f75858a.setVisibility(8);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageMaskLayer f75859a;

        static {
            Covode.recordClassIndex(46784);
        }

        d(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f75859a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f75859a.setVisibility(0);
        }
    }

    public final void b() {
        setVisibility(8);
        setAlpha(0.0f);
        this.f75853a = false;
        this.f75854c = null;
    }

    public final void c() {
        a aVar;
        if (this.f75853a && (aVar = this.f75854c) != null) {
            aVar.a();
        }
    }

    public final void a() {
        animate().alpha(0.8f).withStartAction(new d(this)).setDuration(100).start();
        a aVar = this.f75854c;
        if (aVar != null) {
            aVar.a();
        }
        this.f75853a = true;
    }

    public final void setCallback(a aVar) {
        this.f75854c = aVar;
    }

    public final void setShowing(boolean z) {
        this.f75853a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void a(boolean z) {
        animate().alpha(0.0f).withEndAction(new c(this)).setDuration(100).start();
        a aVar = this.f75854c;
        if (aVar != null) {
            aVar.a(z);
        }
        this.f75853a = false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a aVar;
        l.d(view, "");
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f75855d = System.currentTimeMillis();
            this.f75856e = motionEvent.getX();
            this.f75857f = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (System.currentTimeMillis() - this.f75855d <= 100) {
                float f2 = this.f75856e;
                float f3 = this.f75857f;
                float abs = Math.abs(f2 - x);
                float abs2 = Math.abs(f3 - y);
                if (abs <= 50.0f && abs2 <= 50.0f && (aVar = this.f75854c) != null) {
                    aVar.b();
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(13723);
        setBackgroundColor(-16777216);
        setOnTouchListener(this);
        b();
        MethodCollector.o(13723);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
