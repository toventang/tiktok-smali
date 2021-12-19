package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class PKProgressBar extends View {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10950d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f10951a;

    /* renamed from: b  reason: collision with root package name */
    h.f.a.b<? super Float, z> f10952b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super Float, z> f10953c;

    /* renamed from: e  reason: collision with root package name */
    private int f10954e;

    /* renamed from: f  reason: collision with root package name */
    private int f10955f;

    /* renamed from: g  reason: collision with root package name */
    private int f10956g;

    /* renamed from: h  reason: collision with root package name */
    private int f10957h;

    /* renamed from: i  reason: collision with root package name */
    private int f10958i;

    /* renamed from: j  reason: collision with root package name */
    private int f10959j;

    /* renamed from: k  reason: collision with root package name */
    private int f10960k;

    /* renamed from: l  reason: collision with root package name */
    private int f10961l;

    /* renamed from: m  reason: collision with root package name */
    private int f10962m;
    private int n;
    private float o;
    private ValueAnimator p;
    private final h q;
    private final RectF r;
    private final RectF s;
    private boolean t;
    private boolean u;
    private final h v;

    static {
        Covode.recordClassIndex(5859);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Paint getMPaint() {
        return (Paint) this.q.getValue();
    }

    public final float getStartSpacing() {
        return ((Number) this.v.getValue()).floatValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5860);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final float getCoverWidth() {
        return this.o;
    }

    public final int getLeftValue() {
        return this.f10962m;
    }

    public final boolean getMIsAnimationToRight() {
        return this.u;
    }

    public final int getRightValue() {
        return this.n;
    }

    static final class d extends m implements h.f.a.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f10965a = new d();

        static {
            Covode.recordClassIndex(5863);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) y.c()) * 0.16f);
        }
    }

    public final void a() {
        this.f10962m = 0;
        this.n = 0;
        this.f10951a = 0.5f;
        this.t = true;
        invalidate();
    }

    static final class b extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10963a = new b();

        static {
            Covode.recordClassIndex(5861);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    private final Path getClipPath() {
        float leftPaddingOffset = (float) getLeftPaddingOffset();
        float topPaddingOffset = (float) getTopPaddingOffset();
        float rightPaddingOffset = (float) getRightPaddingOffset();
        float bottomPaddingOffset = (float) getBottomPaddingOffset();
        float width = (((float) getWidth()) - leftPaddingOffset) - rightPaddingOffset;
        Path path = new Path();
        path.moveTo(leftPaddingOffset, topPaddingOffset);
        float f2 = width + leftPaddingOffset;
        path.lineTo(f2, topPaddingOffset);
        float height = ((((float) getHeight()) - topPaddingOffset) - bottomPaddingOffset) + topPaddingOffset;
        path.lineTo(f2, height);
        path.lineTo(leftPaddingOffset, height);
        path.lineTo(leftPaddingOffset, topPaddingOffset);
        path.close();
        return path;
    }

    public final void setCoverWidth(float f2) {
        this.o = f2;
    }

    public final void setMIsAnimationToRight(boolean z) {
        this.u = z;
    }

    public final void setLeftValue(int i2) {
        this.t = false;
        this.f10962m = i2;
        int i3 = this.n;
        if (i3 + i2 == 0) {
            this.t = true;
            setProgress(0.5f);
            return;
        }
        setProgress(((float) i2) / ((float) (i2 + i3)));
    }

    public final void setRightValue(int i2) {
        this.t = false;
        this.n = i2;
        int i3 = this.f10962m;
        if (i2 + i3 == 0) {
            this.t = true;
            setProgress(0.5f);
            return;
        }
        setProgress(((float) i3) / ((float) (i3 + i2)));
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PKProgressBar f10964a;

        static {
            Covode.recordClassIndex(5862);
        }

        c(PKProgressBar pKProgressBar) {
            this.f10964a = pKProgressBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            PKProgressBar pKProgressBar = this.f10964a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            pKProgressBar.f10951a = ((Float) animatedValue).floatValue();
            h.f.a.b<? super Float, z> bVar = this.f10964a.f10953c;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(this.f10964a.f10951a));
            }
            this.f10964a.invalidate();
        }
    }

    private final void setProgress(float f2) {
        ValueAnimator valueAnimator;
        h.f.a.b<? super Float, z> bVar = this.f10952b;
        if (bVar != null) {
            bVar.invoke(Float.valueOf(f2));
        }
        float f3 = this.f10951a;
        ValueAnimator valueAnimator2 = this.p;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.p) == null)) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
        this.p = ofFloat;
        if (ofFloat == null) {
            l.b();
        }
        ofFloat.setDuration(300L);
        ValueAnimator valueAnimator3 = this.p;
        if (valueAnimator3 == null) {
            l.b();
        }
        valueAnimator3.addUpdateListener(new c(this));
        ValueAnimator valueAnimator4 = this.p;
        if (valueAnimator4 == null) {
            l.b();
        }
        valueAnimator4.start();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(6787);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.o(6787);
            return;
        }
        float startSpacing = getStartSpacing();
        float width = (this.f10951a * (((float) getWidth()) - (startSpacing * 2.0f))) + startSpacing;
        this.r.set(0.0f, 0.0f, width, (float) getHeight());
        this.s.set(width, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.clipPath(getClipPath());
        LinearGradient linearGradient = new LinearGradient(this.r.left, this.r.top, this.r.right, this.r.bottom, this.f10956g, this.f10957h, Shader.TileMode.MIRROR);
        LinearGradient linearGradient2 = new LinearGradient(this.s.left, this.s.top, this.s.right, this.s.bottom, this.f10958i, this.f10959j, Shader.TileMode.MIRROR);
        if (this.t) {
            getMPaint().setShader(linearGradient);
            canvas.drawRect(this.r, getMPaint());
            getMPaint().setShader(linearGradient2);
            canvas.drawRect(this.s, getMPaint());
            getMPaint().setShader(null);
            MethodCollector.o(6787);
            return;
        }
        getMPaint().setShader(linearGradient2);
        canvas.drawRect(this.s, getMPaint());
        getMPaint().setShader(linearGradient);
        float f2 = 24.0f;
        float a2 = (width + ((float) (y.a(this.o) / 2))) - 24.0f;
        Path path = new Path();
        float f3 = a2 - 0.0f;
        float height = ((float) getHeight()) - 0.0f;
        float f4 = f3 / 2.0f;
        if (24.0f <= f4) {
            f4 = 24.0f;
        }
        float f5 = height / 2.0f;
        if (24.0f > f5) {
            f2 = f5;
        }
        float f6 = f3 - (f4 * 2.0f);
        float f7 = height - (2.0f * f2);
        path.moveTo(a2, f2 + 0.0f);
        float f8 = -f2;
        float f9 = -f4;
        path.rQuadTo(0.0f, f8, f9, f8);
        path.rLineTo(-f6, 0.0f);
        path.rLineTo(f9, 0.0f);
        path.rLineTo(0.0f, f2);
        path.rLineTo(0.0f, f7);
        path.rLineTo(0.0f, f2);
        path.rLineTo(f4, 0.0f);
        path.rLineTo(f6, 0.0f);
        path.rQuadTo(f4, 0.0f, f4, f8);
        path.rLineTo(0.0f, -f7);
        path.close();
        canvas.drawPath(path, getMPaint());
        getMPaint().setShader(null);
        MethodCollector.o(6787);
    }

    private /* synthetic */ PKProgressBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PKProgressBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        String str;
        String str2;
        l.d(context, "");
        boolean z = false;
        MethodCollector.i(6797);
        this.q = i.a((h.f.a.a) b.f10963a);
        this.r = new RectF();
        this.s = new RectF();
        this.t = true;
        this.u = true;
        this.v = i.a((h.f.a.a) d.f10965a);
        this.f10954e = Color.parseColor("#FB6844");
        this.f10955f = Color.parseColor("#359FF2");
        this.f10960k = Color.parseColor("#7D0044");
        this.f10961l = Color.parseColor("#0A1276");
        this.f10962m = 0;
        this.n = 0;
        this.f10951a = 0.5f;
        z = EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0 ? true : z;
        String str3 = "#F93659";
        if (z) {
            str = str3;
        } else {
            str = "#fd2d55";
        }
        this.f10956g = Color.parseColor(str);
        this.f10957h = Color.parseColor(!z ? "#ff3ce3" : str3);
        String str4 = "#0D8BFF";
        if (z) {
            str2 = str4;
        } else {
            str2 = "#7ddeff";
        }
        this.f10958i = Color.parseColor(str2);
        this.f10959j = Color.parseColor(!z ? "#606bff" : str4);
        MethodCollector.o(6797);
    }
}
