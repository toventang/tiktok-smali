package com.ss.android.ugc.aweme.friends.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
    public List<String> f97290a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<Integer> f97291b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private int f97292c = -1;

    /* renamed from: d  reason: collision with root package name */
    private a f97293d;

    /* renamed from: e  reason: collision with root package name */
    private Context f97294e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f97295f;

    /* renamed from: g  reason: collision with root package name */
    private int f97296g;

    /* renamed from: h  reason: collision with root package name */
    private int f97297h;

    /* renamed from: i  reason: collision with root package name */
    private int f97298i;

    /* renamed from: j  reason: collision with root package name */
    private int f97299j;

    /* renamed from: k  reason: collision with root package name */
    private int f97300k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f97301l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f97302m;
    private Paint n;
    private float o;
    private int p;
    private int q;
    private float r;
    private Rect s;
    private Rect t;
    private int u = 0;

    public interface a {
        static {
            Covode.recordClassIndex(61806);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(61805);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f97290a) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f97301l = textView;
    }

    public void setOnLetterTouchListener(a aVar) {
        this.f97293d = aVar;
    }

    public void setCurrentIndex(String str) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f97290a.size()) {
                break;
            } else if (TextUtils.equals(str, this.f97290a.get(i2))) {
                this.f97292c = i2;
                break;
            } else {
                i2++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f97291b.size(); i4++) {
            i3 += this.f97291b.get(i4).intValue();
            if (i2 < i3) {
                if (this.f97292c != i4) {
                    this.f97292c = i4;
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(12311);
        super.onDraw(canvas);
        List<String> list = this.f97290a;
        if (list == null || list.size() == 0) {
            MethodCollector.o(12311);
            return;
        }
        this.f97299j = this.f97297h;
        this.u = 0;
        int i2 = 0;
        while (i2 < this.f97290a.size()) {
            this.f97300k = (this.f97298i - (this.q * this.u)) / (this.f97290a.size() - this.u);
            this.n.getTextBounds(this.f97290a.get(i2), 0, this.f97290a.get(i2).length(), this.t);
            float f2 = ((float) this.f97299j) / 2.0f;
            int i3 = this.q;
            int i4 = this.u;
            int i5 = i2 + 1;
            float height = ((float) ((i3 * i4) + (this.f97300k * (i5 - i4)))) - (((float) this.t.height()) / 2.0f);
            if (this.f97292c == i2) {
                canvas.drawText(this.f97290a.get(i2), f2, height, this.n);
            } else {
                canvas.drawText(this.f97290a.get(i2), f2, height, this.f97302m);
            }
            i2 = i5;
        }
        MethodCollector.o(12311);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r3 != 2) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.widget.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(12173);
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
        this.f97297h = size;
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.n.getFontMetrics();
            float f2 = fontMetrics.bottom - fontMetrics.top;
            this.o = fontMetrics.bottom * 1.2f;
            int size3 = (int) (((float) this.f97290a.size()) * f2 * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f97298i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.o(12173);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12020);
        this.f97294e = context;
        this.f97295f = context.getResources();
        Paint paint = new Paint(1);
        this.n = paint;
        paint.setTextSize(n.b(this.f97294e, 11.0f));
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setColor(this.f97295f.getColor(R.color.bx));
        Paint paint2 = new Paint(1);
        this.f97302m = paint2;
        paint2.setTextSize(n.b(this.f97294e, 11.0f));
        this.f97302m.setTextAlign(Paint.Align.CENTER);
        this.f97302m.setColor(this.f97295f.getColor(R.color.c6));
        this.r = n.b(this.f97294e, 2.0f);
        this.p = (int) n.b(this.f97294e, 16.0f);
        this.q = (int) (n.b(this.f97294e, 16.0f) + this.r);
        this.s = new Rect(0, 0, this.p, this.q);
        this.t = new Rect();
        MethodCollector.o(12020);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
