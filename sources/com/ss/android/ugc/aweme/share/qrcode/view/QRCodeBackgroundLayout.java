package com.ss.android.ugc.aweme.share.qrcode.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.i;
import h.f.b.l;
import java.util.Objects;

public final class QRCodeBackgroundLayout extends RelativeLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final a f124204k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f124205a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f124206b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f124207c;

    /* renamed from: d  reason: collision with root package name */
    public float f124208d;

    /* renamed from: e  reason: collision with root package name */
    public float f124209e;

    /* renamed from: f  reason: collision with root package name */
    public float f124210f;

    /* renamed from: g  reason: collision with root package name */
    public float f124211g;

    /* renamed from: h  reason: collision with root package name */
    public float f124212h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f124213i;

    /* renamed from: j  reason: collision with root package name */
    public final SharedPreferences f124214j;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f124215l;

    /* renamed from: m  reason: collision with root package name */
    private float f124216m;
    private final c n;

    static {
        Covode.recordClassIndex(81580);
    }

    public QRCodeBackgroundLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81581);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeBackgroundLayout f124219a;

        static {
            Covode.recordClassIndex(81583);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(QRCodeBackgroundLayout qRCodeBackgroundLayout) {
            this.f124219a = qRCodeBackgroundLayout;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f124219a.f124213i = true;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f124219a.f124206b.setShader(this.f124219a.f124207c.getShader());
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f124219a;
            qRCodeBackgroundLayout.f124211g = qRCodeBackgroundLayout.f124209e;
            QRCodeBackgroundLayout qRCodeBackgroundLayout2 = this.f124219a;
            qRCodeBackgroundLayout2.f124212h = qRCodeBackgroundLayout2.f124210f;
            this.f124219a.f124208d = 0.0f;
            this.f124219a.f124213i = false;
            SharedPreferences.Editor edit = this.f124219a.f124214j.edit();
            edit.putFloat("qr_code_background_sp_center_x", this.f124219a.f124211g);
            edit.putFloat("qr_code_background_sp_center_y", this.f124219a.f124212h);
            edit.putInt("qr_code_background_sp_color_index", this.f124219a.f124205a);
            edit.apply();
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeBackgroundLayout f124220a;

        static {
            Covode.recordClassIndex(81584);
        }

        d(QRCodeBackgroundLayout qRCodeBackgroundLayout) {
            this.f124220a = qRCodeBackgroundLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f124220a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            qRCodeBackgroundLayout.f124208d = ((Float) animatedValue).floatValue();
            this.f124220a.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(11134);
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawCircle(this.f124211g, this.f124212h, this.f124216m, this.f124206b);
        }
        float f2 = this.f124208d;
        if (f2 <= 0.0f || f2 > this.f124216m || canvas == null) {
            MethodCollector.o(11134);
            return;
        }
        canvas.drawCircle(this.f124209e, this.f124210f, f2, this.f124207c);
        MethodCollector.o(11134);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (this.f124213i) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f124209e = motionEvent.getX();
                this.f124210f = motionEvent.getY();
                return true;
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                int i2 = this.f124205a + 1;
                this.f124205a = i2;
                b[] bVarArr = this.f124215l;
                if (i2 >= bVarArr.length) {
                    int length = i2 - bVarArr.length;
                    this.f124205a = i2 - bVarArr.length;
                    i2 = length;
                }
                this.f124205a = i2;
                this.f124207c.setShader(a(this.f124209e, this.f124210f, i2));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f124216m);
                l.b(ofFloat, "");
                ofFloat.setDuration(600L);
                ofFloat.addUpdateListener(new d(this));
                ofFloat.addListener(this.n);
                ofFloat.start();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f124217a;

        /* renamed from: b  reason: collision with root package name */
        public final int f124218b;

        static {
            Covode.recordClassIndex(81582);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f124217a == bVar.f124217a && this.f124218b == bVar.f124218b;
        }

        public final int hashCode() {
            return (this.f124217a * 31) + this.f124218b;
        }

        public final String toString() {
            return "RadialColor(centerColor=" + this.f124217a + ", edgeColor=" + this.f124218b + ")";
        }

        public b(int i2, int i3) {
            this.f124217a = i2;
            this.f124218b = i3;
        }
    }

    private /* synthetic */ QRCodeBackgroundLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private final RadialGradient a(float f2, float f3, int i2) {
        return new RadialGradient(f2, f3, this.f124216m, this.f124215l[i2].f124217a, this.f124215l[i2].f124218b, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QRCodeBackgroundLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9521);
        this.f124215l = new b[]{new b(Color.parseColor("#FF92A7"), Color.parseColor("#FE2C55")), new b(Color.parseColor("#FFC059"), Color.parseColor("#D95C34")), new b(Color.parseColor("#67CC8F"), Color.parseColor("#08843A")), new b(Color.parseColor("#5D7CE8"), Color.parseColor("#5927A9")), new b(Color.parseColor("#30C3EA"), Color.parseColor("#148FC3"))};
        int b2 = i.b(context);
        int f2 = i.f(context);
        this.f124216m = (float) Math.sqrt((double) ((float) ((b2 * b2) + (f2 * f2))));
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(applicationContext, "qr_code_background_sp_name", 0);
        l.b(a2, "");
        this.f124214j = a2;
        this.f124211g = a2.getFloat("qr_code_background_sp_center_x", (float) b2);
        this.f124212h = a2.getFloat("qr_code_background_sp_center_y", 0.0f);
        this.f124205a = a2.getInt("qr_code_background_sp_color_index", 0);
        Paint paint = new Paint(1);
        this.f124206b = paint;
        paint.setShader(a(this.f124211g, this.f124212h, this.f124205a));
        this.f124207c = new Paint(1);
        setWillNotDraw(false);
        this.n = new c(this);
        MethodCollector.o(9521);
    }
}
