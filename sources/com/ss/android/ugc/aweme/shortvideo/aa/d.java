package com.ss.android.ugc.aweme.shortvideo.aa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends ReplacementSpan {

    /* renamed from: c  reason: collision with root package name */
    public static final a f124830c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f124831a;

    /* renamed from: b  reason: collision with root package name */
    public MentionEditText f124832b;

    /* renamed from: d  reason: collision with root package name */
    private int f124833d;

    /* renamed from: e  reason: collision with root package name */
    private int f124834e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f124835f;

    /* renamed from: g  reason: collision with root package name */
    private int f124836g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint.FontMetricsInt f124837h = new Paint.FontMetricsInt();

    /* renamed from: i  reason: collision with root package name */
    private Context f124838i;

    /* renamed from: j  reason: collision with root package name */
    private int f124839j;

    /* renamed from: k  reason: collision with root package name */
    private int f124840k;

    static {
        Covode.recordClassIndex(82017);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82018);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a() {
        Rect rect;
        int i2;
        b bVar = this.f124831a;
        if (bVar != null) {
            rect = bVar.getBounds();
        } else {
            rect = null;
        }
        this.f124835f = rect;
        int i3 = 0;
        if (rect != null) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        this.f124833d = i2;
        Rect rect2 = this.f124835f;
        if (rect2 != null) {
            i3 = rect2.height();
        }
        this.f124834e = i3;
    }

    public static final class b extends com.bytedance.tux.c.b {

        /* renamed from: g  reason: collision with root package name */
        public float f124841g;

        static {
            Covode.recordClassIndex(82019);
        }

        @Override // com.bytedance.tux.c.b
        public final void draw(Canvas canvas) {
            l.d(canvas, "");
            int width = getBounds().width();
            int height = getBounds().height();
            canvas.save();
            canvas.rotate(this.f124841g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
            super.draw(canvas);
            canvas.restore();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, int i2) {
            super(context, i2);
            l.d(context, "");
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f124842a;

        static {
            Covode.recordClassIndex(82020);
        }

        c(d dVar) {
            this.f124842a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            b bVar = this.f124842a.f124831a;
            if (bVar != null) {
                bVar.f124841g = floatValue;
                bVar.invalidateSelf();
            }
            this.f124842a.f124832b.invalidate();
        }
    }

    private final int a(Paint.FontMetricsInt fontMetricsInt) {
        int i2 = this.f124836g;
        if (i2 == 0) {
            return fontMetricsInt.descent - this.f124834e;
        }
        if (i2 == 1) {
            return -this.f124834e;
        }
        if (i2 != 2) {
            return -this.f124834e;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f124834e) / 2);
    }

    public d(Context context, MentionEditText mentionEditText) {
        l.d(context, "");
        l.d(mentionEditText, "");
        this.f124838i = context;
        this.f124832b = mentionEditText;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ap8, R.attr.arl}, R.attr.c6, 0);
        l.b(obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        b bVar = new b(this.f124838i, resourceId);
        bVar.c(color);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 0.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a3 = h.g.a.a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 13.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        bVar.setBounds(a2, a3, a4, h.g.a.a(TypedValue.applyDimension(1, 13.0f, system4.getDisplayMetrics())));
        this.f124831a = bVar;
        this.f124836g = 2;
        a();
        MentionEditText mentionEditText2 = this.f124832b;
        mentionEditText2.setLayerType(1, mentionEditText2.getPaint());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ValueAnimator duration = ofFloat.setDuration(1000L);
        l.b(duration, "");
        duration.setInterpolator(new LinearInterpolator());
        l.b(ofFloat, "");
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new c(this));
        b bVar2 = this.f124831a;
        if (bVar2 != null) {
            bVar2.setAlpha(255);
        }
        ofFloat.start();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        int i4;
        l.d(paint, "");
        int i5 = this.f124839j + this.f124840k;
        a();
        if (fontMetricsInt == null) {
            i4 = this.f124833d;
        } else {
            int a2 = a(fontMetricsInt);
            int i6 = this.f124834e + a2;
            if (a2 < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = a2;
            }
            if (a2 < fontMetricsInt.top) {
                fontMetricsInt.top = a2;
            }
            if (i6 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i6;
            }
            if (i6 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i6;
            }
            i4 = this.f124833d;
        }
        return i4 + i5;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int a2;
        l.d(canvas, "");
        l.d(paint, "");
        paint.getFontMetricsInt(this.f124837h);
        if (this.f124836g == 2) {
            a2 = ((i6 + i4) - this.f124834e) / 2;
        } else {
            a2 = i5 + a(this.f124837h);
        }
        float f3 = f2 + ((float) this.f124839j);
        float f4 = (float) a2;
        canvas.translate(f3, f4);
        b bVar = this.f124831a;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        canvas.translate(-f3, -f4);
    }
}
