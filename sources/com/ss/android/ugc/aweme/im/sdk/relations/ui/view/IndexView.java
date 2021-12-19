package com.ss.android.ugc.aweme.im.sdk.relations.ui.view;

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
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class IndexView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f103284a = -1;

    /* renamed from: b  reason: collision with root package name */
    private a f103285b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f103286c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private List<Integer> f103287d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private Context f103288e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f103289f;

    /* renamed from: g  reason: collision with root package name */
    private int f103290g;

    /* renamed from: h  reason: collision with root package name */
    private int f103291h;

    /* renamed from: i  reason: collision with root package name */
    private int f103292i;

    /* renamed from: j  reason: collision with root package name */
    private int f103293j;

    /* renamed from: k  reason: collision with root package name */
    private int f103294k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f103295l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f103296m;
    private Paint n;
    private int o;
    private int p;
    private float q;
    private Bitmap r;
    private Bitmap s;
    private Bitmap t;
    private Bitmap u;
    private Rect v;
    private Rect w;
    private int x = 0;

    public interface a {
        static {
            Covode.recordClassIndex(66203);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(66202);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f103286c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    public void setIndexLetterTv(TextView textView) {
        this.f103295l = textView;
    }

    public void setOnLetterTouchListener(a aVar) {
        this.f103285b = aVar;
    }

    public void setCurrentIndex(int i2) {
        this.f103284a = i2;
        invalidate();
    }

    public void setIndexLetters(List<String> list) {
        this.f103286c.clear();
        this.f103286c.addAll(list);
        requestLayout();
    }

    public void setCurrentIndex(String str) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f103286c.size()) {
                break;
            } else if (TextUtils.equals(str, this.f103286c.get(i2))) {
                this.f103284a = i2;
                break;
            } else {
                i2++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f103287d.size(); i4++) {
            i3 += this.f103287d.get(i4).intValue();
            if (i2 < i3) {
                if (this.f103284a != i4) {
                    this.f103284a = i4;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.IndexView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(6625);
        super.onDraw(canvas);
        List<String> list = this.f103286c;
        if (list == null || list.size() == 0) {
            MethodCollector.o(6625);
            return;
        }
        this.f103293j = this.f103291h;
        this.x = 0;
        for (int i2 = 0; i2 < this.f103286c.size(); i2++) {
            if (this.f103286c.get(i2).equals("recent")) {
                this.x++;
                Rect rect = this.v;
                int i3 = this.o;
                rect.set(0, 0, i3, i3);
                if (this.f103284a == i2) {
                    canvas.drawBitmap(this.s, (Rect) null, this.v, this.n);
                } else {
                    canvas.drawBitmap(this.r, (Rect) null, this.v, this.n);
                }
            } else if (this.f103286c.get(i2).equals("Friend")) {
                this.x++;
                Rect rect2 = this.v;
                int i4 = this.p;
                int i5 = this.o;
                rect2.set(0, i4 * i2, i5, (i4 * i2) + i5);
                if (this.f103284a == i2) {
                    canvas.drawBitmap(this.u, (Rect) null, this.v, this.n);
                } else {
                    canvas.drawBitmap(this.t, (Rect) null, this.v, this.n);
                }
            } else {
                this.f103294k = (this.f103292i - (this.p * this.x)) / (this.f103286c.size() - this.x);
                this.n.getTextBounds(this.f103286c.get(i2), 0, this.f103286c.get(i2).length(), this.w);
                float f2 = ((float) this.f103293j) / 2.0f;
                int i6 = this.p;
                int i7 = this.x;
                float height = ((float) ((i6 * i7) + (this.f103294k * ((i2 + 1) - i7)))) - (((float) this.w.height()) / 2.0f);
                if (this.f103284a == i2) {
                    canvas.drawText(this.f103286c.get(i2), f2, height, this.n);
                } else {
                    canvas.drawText(this.f103286c.get(i2), f2, height, this.f103296m);
                }
            }
        }
        MethodCollector.o(6625);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(6606);
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
        this.f103291h = size;
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.n.getFontMetrics();
            int size3 = (int) (((float) this.f103286c.size()) * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f103292i = size2;
        setMeasuredDimension(size, size2);
        MethodCollector.o(6606);
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6571);
        this.f103288e = context;
        this.f103289f = context.getResources();
        Paint paint = new Paint(1);
        this.n = paint;
        paint.setTextSize(n.b(this.f103288e, 11.0f));
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setColor(this.f103289f.getColor(R.color.bx));
        this.n.setTypeface(b.a().a(d.f33795a));
        Paint paint2 = new Paint(1);
        this.f103296m = paint2;
        paint2.setTextSize(n.b(this.f103288e, 11.0f));
        this.f103296m.setTextAlign(Paint.Align.CENTER);
        this.f103296m.setColor(this.f103289f.getColor(R.color.bz));
        this.f103296m.setTypeface(b.a().a(d.f33795a));
        this.r = ((BitmapDrawable) this.f103289f.getDrawable(2131232836)).getBitmap();
        this.s = ((BitmapDrawable) this.f103289f.getDrawable(2131232835)).getBitmap();
        this.t = ((BitmapDrawable) this.f103289f.getDrawable(2131232848)).getBitmap();
        this.u = ((BitmapDrawable) this.f103289f.getDrawable(2131232847)).getBitmap();
        this.q = n.b(this.f103288e, 2.0f);
        this.o = (int) n.b(this.f103288e, 16.0f);
        this.p = (int) (n.b(this.f103288e, 16.0f) + this.q);
        int i2 = this.o;
        this.v = new Rect(0, 0, i2, i2);
        this.w = new Rect();
        MethodCollector.o(6571);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
