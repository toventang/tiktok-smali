package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class IndexView extends View {

    /* renamed from: a  reason: collision with root package name */
    List<String> f97083a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    List<Integer> f97084b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private int f97085c = -1;

    /* renamed from: d  reason: collision with root package name */
    private a f97086d;

    /* renamed from: e  reason: collision with root package name */
    private Context f97087e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f97088f;

    /* renamed from: g  reason: collision with root package name */
    private int f97089g;

    /* renamed from: h  reason: collision with root package name */
    private int f97090h;

    /* renamed from: i  reason: collision with root package name */
    private int f97091i;

    /* renamed from: j  reason: collision with root package name */
    private int f97092j;

    /* renamed from: k  reason: collision with root package name */
    private int f97093k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f97094l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f97095m;
    private Paint n;
    private float o;
    private int p;
    private int q;
    private float r;
    private Bitmap s;
    private Bitmap t;
    private Bitmap u;
    private Bitmap v;
    private Rect w;
    private Rect x;
    private int y = 0;

    public interface a {
        static {
            Covode.recordClassIndex(61705);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(61704);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f97083a) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f97094l = textView;
    }

    public void setOnLetterTouchListener(a aVar) {
        this.f97086d = aVar;
    }

    public void setCurrentIndex(String str) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f97083a.size()) {
                break;
            } else if (TextUtils.equals(str, this.f97083a.get(i2))) {
                this.f97085c = i2;
                break;
            } else {
                i2++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f97084b.size(); i4++) {
            i3 += this.f97084b.get(i4).intValue();
            if (i2 < i3) {
                if (this.f97085c != i4) {
                    this.f97085c = i4;
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r3 != 2) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(3918);
        super.onDraw(canvas);
        List<String> list = this.f97083a;
        if (list == null || list.size() == 0) {
            MethodCollector.o(3918);
            return;
        }
        this.f97092j = this.f97090h;
        this.y = 0;
        for (int i2 = 0; i2 < this.f97083a.size(); i2++) {
            if (this.f97083a.get(i2).equals("Recent")) {
                this.y++;
                Rect rect = this.w;
                int i3 = this.p;
                rect.set(0, 0, i3, i3);
                if (this.f97085c == i2) {
                    canvas.drawBitmap(this.t, (Rect) null, this.w, this.n);
                } else {
                    canvas.drawBitmap(this.s, (Rect) null, this.w, this.n);
                }
            } else if (this.f97083a.get(i2).equals("Friend")) {
                this.y++;
                Rect rect2 = this.w;
                int i4 = this.q;
                int i5 = this.p;
                rect2.set(0, i4 * i2, i5, (i4 * i2) + i5);
                if (this.f97085c == i2) {
                    canvas.drawBitmap(this.v, (Rect) null, this.w, this.n);
                } else {
                    canvas.drawBitmap(this.u, (Rect) null, this.w, this.n);
                }
            } else {
                this.f97093k = (this.f97091i - (this.q * this.y)) / (this.f97083a.size() - this.y);
                this.n.getTextBounds(this.f97083a.get(i2), 0, this.f97083a.get(i2).length(), this.x);
                float f2 = ((float) this.f97092j) / 2.0f;
                int i6 = this.q;
                int i7 = this.y;
                float height = ((float) ((i6 * i7) + (this.f97093k * ((i2 + 1) - i7)))) - (((float) this.x.height()) / 2.0f);
                if (this.f97085c == i2) {
                    canvas.drawText(this.f97083a.get(i2), f2, height, this.n);
                } else {
                    canvas.drawText(this.f97083a.get(i2), f2, height, this.f97095m);
                }
            }
        }
        MethodCollector.o(3918);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3909);
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.f97090h = size;
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.n.getFontMetrics();
            float f2 = fontMetrics.bottom - fontMetrics.top;
            this.o = fontMetrics.bottom * 1.2f;
            int size3 = (int) (((float) this.f97083a.size()) * f2 * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f97091i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.o(3909);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3902);
        this.f97087e = context;
        this.f97088f = context.getResources();
        Paint paint = new Paint(1);
        this.n = paint;
        paint.setTextSize(n.b(this.f97087e, 11.0f));
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setColor(this.f97088f.getColor(R.color.bx));
        Paint paint2 = new Paint(1);
        this.f97095m = paint2;
        paint2.setTextSize(n.b(this.f97087e, 11.0f));
        this.f97095m.setTextAlign(Paint.Align.CENTER);
        this.f97095m.setColor(this.f97088f.getColor(R.color.c5));
        this.s = ((BitmapDrawable) this.f97088f.getDrawable(2131232238)).getBitmap();
        this.t = ((BitmapDrawable) this.f97088f.getDrawable(2131232239)).getBitmap();
        this.v = ((BitmapDrawable) this.f97088f.getDrawable(2131232319)).getBitmap();
        this.u = ((BitmapDrawable) this.f97088f.getDrawable(2131232318)).getBitmap();
        this.r = n.b(this.f97087e, 2.0f);
        this.p = (int) n.b(this.f97087e, 16.0f);
        this.q = (int) (n.b(this.f97087e, 16.0f) + this.r);
        this.w = new Rect(0, 0, this.p, this.q);
        this.x = new Rect();
        MethodCollector.o(3902);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
