package com.ss.android.ugc.aweme.commercialize.preview.d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f75014a = R.string.qd;

    /* renamed from: b  reason: collision with root package name */
    public static final C1707a f75015b = new C1707a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.d.a$a  reason: collision with other inner class name */
    public static final class C1707a {
        static {
            Covode.recordClassIndex(46250);
        }

        private C1707a() {
        }

        public /* synthetic */ C1707a(byte b2) {
            this();
        }

        public static void a(ViewGroup viewGroup) {
            MethodCollector.i(7848);
            l.d(viewGroup, "");
            viewGroup.removeView(viewGroup.findViewById(R.id.i0));
            MethodCollector.o(7848);
        }

        public static void a(Context context, ViewGroup viewGroup, com.ss.android.ugc.aweme.commercialize.preview.d.a.a aVar) {
            MethodCollector.i(7801);
            l.d(context, "");
            l.d(viewGroup, "");
            b bVar = new b(aVar, context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.i0);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackground(bVar);
            viewGroup.addView(frameLayout);
            MethodCollector.o(7801);
        }
    }

    static {
        Covode.recordClassIndex(46249);
    }

    public static final class b extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        public String f75022a;

        /* renamed from: b  reason: collision with root package name */
        public int f75023b;

        /* renamed from: c  reason: collision with root package name */
        public float f75024c;

        /* renamed from: d  reason: collision with root package name */
        public float f75025d;

        /* renamed from: e  reason: collision with root package name */
        public int f75026e;

        /* renamed from: f  reason: collision with root package name */
        public int f75027f;

        /* renamed from: g  reason: collision with root package name */
        private final Paint f75028g;

        static {
            Covode.recordClassIndex(46251);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i2) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void draw(Canvas canvas) {
            l.d(canvas, "");
            this.f75028g.setColor(this.f75023b);
            this.f75028g.setTextSize(this.f75024c);
            this.f75028g.setAntiAlias(true);
            float f2 = (float) getBounds().right;
            float f3 = (float) getBounds().bottom;
            float measureText = this.f75028g.measureText(this.f75022a);
            canvas.drawColor(0);
            int i2 = this.f75027f;
            float f4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                float f5 = (-measureText) / 2.0f;
                int i4 = this.f75026e;
                for (int i5 = 0; i5 < i4; i5++) {
                    canvas.save();
                    canvas.translate(f5, f4);
                    canvas.rotate(this.f75025d);
                    canvas.drawText(this.f75022a, 0.0f, 0.0f, this.f75028g);
                    canvas.restore();
                    f5 += f2 / ((float) (this.f75026e - 1));
                }
                f4 += f3 / ((float) this.f75027f);
            }
            canvas.save();
            canvas.restore();
        }

        public b(com.ss.android.ugc.aweme.commercialize.preview.d.a.a aVar, Context context) {
            String str;
            int i2;
            float b2;
            float f2;
            int i3;
            int i4;
            l.d(context, "");
            if (aVar == null || (str = aVar.f75016a) == null) {
                str = context.getString(a.f75014a);
                l.b(str, "");
            }
            this.f75022a = str;
            if (aVar != null) {
                i2 = aVar.f75017b;
            } else {
                i2 = 520093695;
            }
            this.f75023b = i2;
            if (aVar != null) {
                b2 = aVar.f75018c;
            } else {
                b2 = n.b(context, 18.0f);
            }
            this.f75024c = b2;
            if (aVar != null) {
                f2 = aVar.f75019d;
            } else {
                f2 = -15.0f;
            }
            this.f75025d = f2;
            if (aVar != null) {
                i3 = aVar.f75020e;
            } else {
                i3 = 3;
            }
            this.f75026e = i3;
            if (aVar != null) {
                i4 = aVar.f75021f;
            } else {
                i4 = 10;
            }
            this.f75027f = i4;
            this.f75028g = new Paint();
        }
    }
}
