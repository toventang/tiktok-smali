package com.bytedance.tux.f.a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45036a;

    /* renamed from: b  reason: collision with root package name */
    public int f45037b;

    /* renamed from: c  reason: collision with root package name */
    private final h f45038c = i.a((h.f.a.a) b.f45044a);

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1105a f45039a = new C1105a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private final h f45040b = i.a((h.f.a.a) c.f45043a);

        /* renamed from: c  reason: collision with root package name */
        private final h f45041c = i.a((h.f.a.a) b.f45042a);

        static {
            Covode.recordClassIndex(27479);
        }

        public final Rect a() {
            return (Rect) this.f45040b.getValue();
        }

        public final TextPaint b() {
            return (TextPaint) this.f45041c.getValue();
        }

        /* renamed from: com.bytedance.tux.f.a.d$a$a  reason: collision with other inner class name */
        public static final class C1105a {
            static {
                Covode.recordClassIndex(27480);
            }

            private C1105a() {
            }

            public /* synthetic */ C1105a(byte b2) {
                this();
            }
        }

        static final class c extends m implements h.f.a.a<Rect> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f45043a = new c();

            static {
                Covode.recordClassIndex(27482);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Rect invoke() {
                return new Rect();
            }
        }

        static final class b extends m implements h.f.a.a<TextPaint> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f45042a = new b();

            static {
                Covode.recordClassIndex(27481);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ TextPaint invoke() {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(30.0f);
                return textPaint;
            }
        }
    }

    static {
        Covode.recordClassIndex(27478);
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45044a = new b();

        static {
            Covode.recordClassIndex(27483);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public d(int i2) {
        this.f45037b = i2;
    }

    public final void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        l.c(charSequence, "");
        l.c(fontMetricsInt, "");
        int i6 = fontMetricsInt.descent;
        int i7 = this.f45037b;
        if (i6 > i7) {
            fontMetricsInt.descent = Math.min(i7, fontMetricsInt.descent);
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f45037b) {
            if (fontMetricsInt.descent < fontMetricsInt.bottom) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
                a aVar = (a) this.f45038c.getValue();
                l.c(charSequence, "");
                if (Build.VERSION.SDK_INT >= 29) {
                    aVar.b().getTextBounds(charSequence, i2, i3, aVar.a());
                } else {
                    aVar.b().getTextBounds(charSequence.toString(), i2, i3, aVar.a());
                }
                if (((float) aVar.a().height()) / 30.0f <= 1.0f) {
                    fontMetricsInt.ascent = (-this.f45037b) + fontMetricsInt.descent;
                }
                fontMetricsInt.top = fontMetricsInt.ascent;
            }
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f45037b) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f45037b;
        } else {
            int i8 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i9 = this.f45037b;
            if (i8 > i9) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f45037b;
                return;
            }
            double d2 = (double) (((float) (i9 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            fontMetricsInt.top -= (int) ((float) Math.ceil(d2));
            fontMetricsInt.bottom += (int) ((float) Math.floor(d2));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
