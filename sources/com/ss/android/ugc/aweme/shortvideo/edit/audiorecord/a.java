package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Stack;

public final class a extends View {

    /* renamed from: e  reason: collision with root package name */
    public static final C3294a f126864e = new C3294a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f126865a = -1;

    /* renamed from: b  reason: collision with root package name */
    Paint f126866b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    int f126867c = 1;

    /* renamed from: d  reason: collision with root package name */
    float f126868d = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private final Stack<Point> f126869f = new Stack<>();

    static {
        Covode.recordClassIndex(83232);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.a$a  reason: collision with other inner class name */
    public static final class C3294a {
        static {
            Covode.recordClassIndex(83233);
        }

        private C3294a() {
        }

        public /* synthetic */ C3294a(byte b2) {
            this();
        }
    }

    public final int getMMax() {
        return this.f126867c;
    }

    public final Stack<Point> getMStack() {
        return this.f126869f;
    }

    public final float getPadding() {
        return this.f126868d;
    }

    public final void setMMax(int i2) {
        this.f126867c = i2;
    }

    public final void setPadding(float f2) {
        this.f126868d = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(6707);
        setBackgroundResource(R.drawable.qr);
        MethodCollector.o(6707);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(6631);
        super.onDraw(canvas);
        for (T t : this.f126869f) {
            double x = (double) t.getX();
            double d2 = (double) this.f126867c;
            Double.isNaN(x);
            Double.isNaN(d2);
            double d3 = x / d2;
            double width = (double) getWidth();
            Double.isNaN(width);
            float f2 = (float) (d3 * width);
            double y = (double) t.getY();
            double d4 = (double) this.f126867c;
            Double.isNaN(y);
            Double.isNaN(d4);
            double d5 = y / d4;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            float f3 = (float) (d5 * width2);
            if (canvas != null) {
                canvas.drawRect(f2, 0.0f, f3, (float) getHeight(), this.f126866b);
            }
        }
        MethodCollector.o(6631);
    }
}
