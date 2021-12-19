package com.ss.android.ugc.aweme.shortvideo.aa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Objects;

public final class c extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f124818a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f124819b;

    /* renamed from: c  reason: collision with root package name */
    private int f124820c;

    /* renamed from: d  reason: collision with root package name */
    private final h f124821d = i.a((h.f.a.a) new a(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f124822e = i.a((h.f.a.a) new g(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f124823f = i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f124824g = i.a((h.f.a.a) new C3261c(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f124825h = i.a((h.f.a.a) new d(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f124826i = i.a((h.f.a.a) new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f124827j = i.a((h.f.a.a) new f(this));

    /* renamed from: k  reason: collision with root package name */
    private String f124828k = "";

    /* renamed from: l  reason: collision with root package name */
    private final View f124829l;

    static {
        Covode.recordClassIndex(82009);
    }

    private final float a() {
        return ((Number) this.f124821d.getValue()).floatValue();
    }

    private final float b() {
        return ((Number) this.f124822e.getValue()).floatValue();
    }

    private final float c() {
        return ((Number) this.f124824g.getValue()).floatValue();
    }

    static final class a extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 24.0f));
        }
    }

    static final class b extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 15.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$c  reason: collision with other inner class name */
    static final class C3261c extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3261c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 13.0f));
        }
    }

    static final class d extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 18.0f));
        }
    }

    static final class e extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 12.0f));
        }
    }

    static final class f extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 4.0f));
        }
    }

    static final class g extends m implements h.f.a.a<Float> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(82016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.f124819b, 1.0f));
        }
    }

    public c(Context context, View view) {
        l.d(context, "");
        l.d(view, "");
        this.f124819b = context;
        this.f124829l = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        String str = "";
        l.d(paint, str);
        l.d(charSequence, str);
        int i4 = i2 + 1;
        if (i4 >= i3) {
            return 0;
        }
        paint.setTextSize(c());
        paint.setFakeBoldText(true);
        this.f124820c = (int) (paint.measureText(charSequence, i4, i3) + a());
        this.f124828k = charSequence.subSequence(i4, i3).toString();
        View view = this.f124829l;
        if ((view instanceof b) && this.f124820c >= ((b) view).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((b) this.f124829l).getHookAtMaxWidth();
            float a2 = a();
            l.d(charSequence, str);
            l.d(paint, str);
            String obj = charSequence.subSequence(i4, i3).toString();
            int measureText = (int) (paint.measureText(obj) + a2);
            if (hookAtMaxWidth != 0 && measureText > hookAtMaxWidth) {
                while (true) {
                    if (obj.length() != 1) {
                        int length = obj.length();
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                        obj = p.a(obj, obj.length() - 1, length).toString();
                        if (((int) (paint.measureText(obj + "…") + a2)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            str = obj + "…";
                            break;
                        }
                    } else {
                        str = "…";
                        break;
                    }
                }
            }
            this.f124828k = str;
            this.f124820c = (int) (paint.measureText(str) + a());
        }
        return this.f124820c;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(charSequence, "");
        l.d(paint, "");
        if (i2 + 1 < i3) {
            if (((float) this.f124820c) + f2 > ((float) this.f124829l.getWidth())) {
                canvas.drawText("…", f2, (float) i5, paint);
            } else if (charSequence.length() <= i2 || charSequence.charAt(i2) != 8230) {
                paint.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint.setTextSize(((Number) this.f124823f.getValue()).floatValue());
                paint.setColor(Color.parseColor("#0B222435"));
                paint.setPathEffect(new CornerPathEffect(b() * 2.0f));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f3 = fontMetrics.top;
                float f4 = fontMetrics.bottom;
                float f5 = (float) i5;
                float f6 = f5 + f3;
                canvas.drawRect(new RectF(f2, f6, ((float) this.f124820c) + f2, f5 + f4), paint);
                paint.setColor(color);
                float floatValue = ((f4 - f3) - ((Number) this.f124826i.getValue()).floatValue()) / 2.0f;
                Bitmap bitmap = this.f124818a;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, ((Number) this.f124827j.getValue()).floatValue() + f2, f6 + floatValue, paint);
                }
                paint.setPathEffect(pathEffect);
                paint.setTextSize(c());
                paint.setFakeBoldText(true);
                canvas.drawText(this.f124828k, f2 + ((Number) this.f124825h.getValue()).floatValue(), f5 - b(), paint);
            } else {
                canvas.drawText("…", f2, (float) i5, paint);
            }
        }
    }
}
