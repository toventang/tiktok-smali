package com.ss.android.ugc.aweme.story.record.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.tools.utils.r;
import java.util.Objects;

public final class StoryRecordLayout extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final a f138472i = new a((byte) 0);
    private final h.h A;
    private final h.h B;
    private final h.h C;
    private final h.h D;
    private final float E;
    private final int F;
    private final h.h G;
    private final float H;
    private final int I;
    private final h.h J;

    /* renamed from: a  reason: collision with root package name */
    public boolean f138473a;

    /* renamed from: b  reason: collision with root package name */
    public float f138474b;

    /* renamed from: c  reason: collision with root package name */
    public long f138475c;

    /* renamed from: d  reason: collision with root package name */
    public final float f138476d;

    /* renamed from: e  reason: collision with root package name */
    public float f138477e;

    /* renamed from: f  reason: collision with root package name */
    public final float f138478f;

    /* renamed from: g  reason: collision with root package name */
    public final float f138479g;

    /* renamed from: h  reason: collision with root package name */
    public final float f138480h;

    /* renamed from: j  reason: collision with root package name */
    private c f138481j;

    /* renamed from: k  reason: collision with root package name */
    private b f138482k;

    /* renamed from: l  reason: collision with root package name */
    private e f138483l;

    /* renamed from: m  reason: collision with root package name */
    private d f138484m;
    private long n;
    private float o;
    private float p;
    private float q;
    private long r;
    private final int s;
    private final Runnable t;
    private final float u;
    private final float v;
    private final h.h w;
    private final h.h x;
    private final h.h y;
    private final h.h z;

    public enum b {
        RECORD_LAYOUT_MODE_1,
        RECORD_LAYOUT_MODE_2;

        static {
            Covode.recordClassIndex(90575);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(90576);
        }

        void a();

        void a(float f2, float f3);

        void b();

        void c();
    }

    public enum d {
        CLICK_RECORDING,
        LONG_PRESS_RECORDING;

        static {
            Covode.recordClassIndex(90577);
        }
    }

    public enum e {
        IDLE,
        RECORDING;

        static {
            Covode.recordClassIndex(90578);
        }
    }

    static {
        Covode.recordClassIndex(90573);
    }

    public StoryRecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static double a(double d2) {
        double d3 = 1.0d - d2;
        double d4 = d2 * d2;
        double d5 = d3 * d3;
        return (d5 * d3 * 0.0d) + (d5 * 3.0d * d2 * 0.0d) + (d3 * 3.0d * d4 * 1.0d) + (d4 * d2 * 1.0d);
    }

    private final Paint getIDleInnerPaint() {
        return (Paint) this.x.getValue();
    }

    private final Paint getIDleOuterPaint() {
        return (Paint) this.y.getValue();
    }

    private final Paint getLockCirclePaint() {
        return (Paint) this.C.getValue();
    }

    private final Paint getProgressPaint() {
        return (Paint) this.z.getValue();
    }

    private final Paint getRecordingOuterCirclePaint() {
        return (Paint) this.A.getValue();
    }

    private final RectF getRecordingProgressOvalRectF() {
        return (RectF) this.J.getValue();
    }

    private final Paint getRecordingRoundRectPaint() {
        return (Paint) this.D.getValue();
    }

    private final Paint getWhitePaint() {
        return (Paint) this.B.getValue();
    }

    public final LinearGradient getBaseCircleGradient() {
        return (LinearGradient) this.w.getValue();
    }

    public final float getRecordingOuterCircleWidth() {
        return ((Number) this.G.getValue()).floatValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90574);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final c getListener() {
        return this.f138481j;
    }

    public final d getRecordingMode() {
        return this.f138484m;
    }

    static final class l extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(this.this$0.f138476d * this.this$0.f138480h);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f138493a = new q();

        static {
            Covode.recordClassIndex(90590);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    private final void a() {
        this.f138473a = false;
        c cVar = this.f138481j;
        if (cVar != null) {
            cVar.b();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Paint> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setShader(this.this$0.getBaseCircleGradient());
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Paint> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#8020D5EC"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.this$0.f138478f);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f138488a = new i();

        static {
            Covode.recordClassIndex(90582);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#33FFFFFF"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f138489a = new k();

        static {
            Covode.recordClassIndex(90584);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#4CFFFFFF"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f138490a = new n();

        static {
            Covode.recordClassIndex(90587);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#20D5EC"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordLayout f138491a;

        static {
            Covode.recordClassIndex(90588);
        }

        o(StoryRecordLayout storyRecordLayout) {
            this.f138491a = storyRecordLayout;
        }

        public final void run() {
            this.f138491a.f138475c = SystemClock.uptimeMillis();
            c listener = this.f138491a.getListener();
            if (listener != null) {
                listener.a();
            }
            this.f138491a.setStateInternal(e.RECORDING);
            this.f138491a.f138473a = true;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<Paint> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#20D5EC"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.this$0.f138479g);
            paint.setAntiAlias(true);
            paint.setStrokeCap(Paint.Cap.SQUARE);
            return paint;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<LinearGradient> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearGradient invoke() {
            return new LinearGradient((((float) this.this$0.getWidth()) / 2.0f) - this.this$0.f138477e, (((float) this.this$0.getHeight()) / 2.0f) - this.this$0.f138477e, (((float) this.this$0.getWidth()) / 2.0f) + this.this$0.f138477e, (((float) this.this$0.getHeight()) / 2.0f) + this.this$0.f138477e, new int[]{Color.parseColor("#10B7FF"), Color.parseColor("#20D5EC"), Color.parseColor("#17E9B6")}, new float[]{0.14f, 0.5f, 0.86f}, Shader.TileMode.CLAMP);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<RectF> {
        final /* synthetic */ StoryRecordLayout this$0;

        static {
            Covode.recordClassIndex(90586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.this$0 = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RectF invoke() {
            return new RectF(-((this.this$0.getRecordingOuterCircleWidth() - ((float) (this.this$0.getWidth() / 2))) - (this.this$0.f138479g / 2.0f)), -((this.this$0.getRecordingOuterCircleWidth() - ((float) (this.this$0.getWidth() / 2))) - (this.this$0.f138479g / 2.0f)), ((((float) this.this$0.getWidth()) + this.this$0.getRecordingOuterCircleWidth()) - ((float) (this.this$0.getWidth() / 2))) - (this.this$0.f138479g / 2.0f), ((((float) this.this$0.getWidth()) + this.this$0.getRecordingOuterCircleWidth()) - ((float) (this.this$0.getWidth() / 2))) - (this.this$0.f138479g / 2.0f));
        }
    }

    public final void setListener(c cVar) {
        this.f138481j = cVar;
    }

    public final void setStateInternal(e eVar) {
        this.f138483l = eVar;
        invalidate();
    }

    public final void setRecordingMode(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f138484m = dVar;
        invalidate();
    }

    public final void setState(e eVar) {
        h.f.b.l.d(eVar, "");
        setStateInternal(eVar);
    }

    static final class p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordLayout f138492a;

        static {
            Covode.recordClassIndex(90589);
        }

        p(StoryRecordLayout storyRecordLayout) {
            this.f138492a = storyRecordLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StoryRecordLayout storyRecordLayout = this.f138492a;
            float f2 = storyRecordLayout.f138476d;
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            storyRecordLayout.f138477e = f2 * ((Float) animatedValue).floatValue();
            this.f138492a.invalidate();
        }
    }

    public final void setMode(b bVar) {
        long j2;
        h.f.b.l.d(bVar, "");
        this.f138482k = bVar;
        int i2 = a.f138498a[bVar.ordinal()];
        if (i2 == 1) {
            j2 = 150;
        } else if (i2 == 2) {
            j2 = 0;
        } else {
            throw new h.n();
        }
        this.n = j2;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        float a2;
        float recordingOuterCircleWidth;
        if (canvas != null) {
            int i2 = a.f138499b[this.f138483l.ordinal()];
            if (i2 == 1) {
                canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f138477e, getIDleInnerPaint());
                float f2 = this.f138478f;
                canvas.drawOval(new RectF(f2 / 2.0f, f2 / 2.0f, ((float) getWidth()) - (this.f138478f / 2.0f), ((float) getHeight()) - (this.f138478f / 2.0f)), getIDleOuterPaint());
            } else if (i2 == 2) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f138475c;
                float f3 = ((float) uptimeMillis) / ((float) this.F);
                if (f3 > 1.0f) {
                    a2 = f3;
                } else {
                    a2 = (float) a((double) f3);
                }
                if (a2 < 1.0f) {
                    recordingOuterCircleWidth = this.f138477e * (((this.f138480h - 1.0f) * a2) + 1.0f);
                } else {
                    recordingOuterCircleWidth = getRecordingOuterCircleWidth();
                }
                canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), recordingOuterCircleWidth, getRecordingOuterCirclePaint());
                if (uptimeMillis <= ((long) this.F)) {
                    float f4 = this.f138477e;
                    float f5 = (((this.u / 2.0f) - f4) * a2) + f4;
                    float f6 = f4 + (a2 * (this.v - f4));
                    canvas.drawRoundRect(new RectF(((float) (getWidth() / 2)) - f5, ((float) (getHeight() / 2)) - f5, ((float) (getWidth() / 2)) + f5, ((float) (getHeight() / 2)) + f5), f6, f6, getIDleInnerPaint());
                } else if (this.f138484m == d.LONG_PRESS_RECORDING) {
                    int i3 = this.F;
                    if (uptimeMillis <= ((long) (i3 * 2))) {
                        float f7 = this.v;
                        float a3 = f7 + (((float) a((double) (((float) (uptimeMillis - ((long) i3))) / ((float) i3)))) * (this.H - f7));
                        canvas.drawRoundRect(new RectF(((float) (getWidth() / 2)) - this.H, ((float) (getHeight() / 2)) - this.H, ((float) (getWidth() / 2)) + this.H, ((float) (getHeight() / 2)) + this.H), a3, a3, getWhitePaint());
                    } else {
                        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.H, getWhitePaint());
                    }
                } else {
                    RectF rectF = new RectF(((float) (getWidth() / 2)) - (this.u / 2.0f), ((float) (getHeight() / 2)) - (this.u / 2.0f), ((float) (getWidth() / 2)) + (this.u / 2.0f), ((float) (getHeight() / 2)) + (this.u / 2.0f));
                    float f8 = this.v;
                    canvas.drawRoundRect(rectF, f8, f8, getRecordingRoundRectPaint());
                }
                if (f3 >= 1.0f) {
                    canvas.drawArc(getRecordingProgressOvalRectF(), -90.0f, (this.f138474b / 100.0f) * 360.0f, false, getProgressPaint());
                } else {
                    invalidate();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private /* synthetic */ StoryRecordLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryRecordLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(1490);
        this.f138482k = b.RECORD_LAYOUT_MODE_2;
        this.f138483l = e.IDLE;
        this.f138484m = d.LONG_PRESS_RECORDING;
        this.s = 300;
        this.t = new o(this);
        Context context2 = getContext();
        h.f.b.l.b(context2, "");
        this.u = r.a(context2, 36.0f);
        Context context3 = getContext();
        h.f.b.l.b(context3, "");
        this.v = r.a(context3, 4.0f);
        this.w = h.i.a((h.f.a.a) new f(this));
        this.x = h.i.a((h.f.a.a) new g(this));
        float a2 = (float) en.a(32.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.f138476d = a2;
        this.f138477e = a2;
        this.f138478f = (float) en.a(6.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.y = h.i.a((h.f.a.a) new h(this));
        this.f138479g = (float) en.a(6.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.z = h.i.a((h.f.a.a) new j(this));
        this.A = h.i.a((h.f.a.a) k.f138489a);
        this.B = h.i.a((h.f.a.a) q.f138493a);
        this.C = h.i.a((h.f.a.a) i.f138488a);
        this.D = h.i.a((h.f.a.a) n.f138490a);
        this.f138480h = 1.8125f;
        this.E = 1.3125f;
        this.F = 350;
        this.G = h.i.a((h.f.a.a) new l(this));
        this.H = (float) en.a(18.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.I = en.a(5.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
        this.J = h.i.a((h.f.a.a) new m(this));
        MethodCollector.o(1490);
    }
}
