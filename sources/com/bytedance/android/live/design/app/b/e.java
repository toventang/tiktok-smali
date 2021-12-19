package com.bytedance.android.live.design.app.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f9405a;

    /* renamed from: b  reason: collision with root package name */
    private int f9406b;

    /* renamed from: c  reason: collision with root package name */
    private int f9407c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f9408d;

    /* renamed from: e  reason: collision with root package name */
    private final TextPaint f9409e = new TextPaint();

    /* renamed from: f  reason: collision with root package name */
    private int f9410f;

    /* renamed from: g  reason: collision with root package name */
    private int f9411g;

    static {
        Covode.recordClassIndex(4790);
    }

    public final void setOrientation(int i2) {
        this.f9405a = i2;
        requestLayout();
    }

    public e(Context context) {
        super(context);
        MethodCollector.i(3688);
        setWillNotDraw(false);
        this.f9407c = getContext().getResources().getDimensionPixelSize(R.dimen.np);
        Paint paint = new Paint(1);
        this.f9408d = paint;
        paint.setColor(b.a(this, (int) R.attr.am3));
        this.f9408d.setStrokeWidth((float) this.f9407c);
        this.f9410f = getContext().getResources().getDimensionPixelSize(R.dimen.n_);
        this.f9411g = getContext().getResources().getDimensionPixelSize(R.dimen.n9);
        MethodCollector.o(3688);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            canvas.drawRect(0.0f, (float) this.f9411g, (float) getWidth(), (float) (this.f9411g + this.f9407c), this.f9408d);
            int i2 = 1;
            if (this.f9406b == 1) {
                int width = (getWidth() - ((childCount - 1) * this.f9407c)) / childCount;
                while (i2 < childCount) {
                    int i3 = this.f9407c;
                    float f2 = (float) ((i2 * width) + ((i2 - 1) * i3));
                    int i4 = this.f9411g;
                    canvas.drawRect(f2, (float) (i4 + i3), f2 + ((float) i3), (float) (i4 + i3 + this.f9410f), this.f9408d);
                    i2++;
                }
                return;
            }
            while (i2 < childCount) {
                View childAt = getChildAt(i2 - 1);
                canvas.drawRect(0.0f, (float) childAt.getBottom(), (float) getWidth(), (float) (childAt.getBottom() + this.f9407c), this.f9408d);
                i2++;
            }
        }
    }

    public final void a(LiveDialog liveDialog, List<b> list) {
        removeAllViews();
        if (list != null && !list.isEmpty()) {
            for (b bVar : list) {
                g gVar = new g(getContext());
                gVar.f9414a.a(bVar.f9393b);
                gVar.setText(bVar.f9392a);
                if (bVar.f9394c != null) {
                    gVar.setOnClickListener(new f(bVar, liveDialog));
                }
                gVar.setEnabled(bVar.f9395d);
                addView(gVar);
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        StaticLayout staticLayout;
        MethodCollector.i(3751);
        int childCount = getChildCount();
        if (childCount > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int childCount2 = (size - ((getChildCount() - 1) * this.f9407c)) / getChildCount();
            int i5 = this.f9405a;
            int i6 = 0;
            if (i5 == 0) {
                int i7 = 0;
                while (true) {
                    TextView textView = (TextView) getChildAt(i7);
                    int paddingLeft = (childCount2 - textView.getPaddingLeft()) - textView.getPaddingRight();
                    CharSequence text = textView.getText();
                    if (paddingLeft > 0 && !TextUtils.isEmpty(text)) {
                        this.f9409e.reset();
                        this.f9409e.set(textView.getPaint());
                        TextPaint textPaint = this.f9409e;
                        if (Build.VERSION.SDK_INT >= 27) {
                            i4 = textView.getAutoSizeMaxTextSize();
                        } else if (textView instanceof androidx.core.widget.b) {
                            i4 = ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
                        } else {
                            i4 = -1;
                        }
                        textPaint.setTextSize((float) i4);
                        TextPaint textPaint2 = this.f9409e;
                        if (Build.VERSION.SDK_INT >= 23) {
                            staticLayout = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint2, paddingLeft).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(textView.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
                        } else {
                            staticLayout = new StaticLayout(text, textPaint2, paddingLeft, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                        }
                        if (!(staticLayout.getLineCount() == 1 && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) {
                            this.f9406b = 2;
                        }
                    }
                    i7++;
                    if (i7 >= childCount) {
                        this.f9406b = 1;
                        break;
                    }
                }
                this.f9406b = 2;
            } else {
                this.f9406b = i5;
            }
            if (this.f9406b == 1) {
                do {
                    getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(childCount2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9410f, 1073741824));
                    i6++;
                } while (i6 < childCount);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9411g + this.f9407c + this.f9410f, 1073741824));
                MethodCollector.o(3751);
                return;
            }
            do {
                getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9410f, 1073741824));
                i6++;
            } while (i6 < childCount);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9411g + ((this.f9407c + this.f9410f) * childCount), 1073741824));
            MethodCollector.o(3751);
            return;
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(3751);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        int measuredWidth;
        int childCount = getChildCount();
        int i6 = 0;
        if (v.e(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (childCount <= 0) {
            return;
        }
        if (this.f9406b == 1) {
            int i7 = this.f9411g + this.f9407c;
            int i8 = this.f9410f + i7;
            do {
                View childAt = getChildAt(i6);
                if (z2) {
                    measuredWidth = (childAt.getMeasuredWidth() + this.f9407c) * i6;
                } else {
                    measuredWidth = ((i4 - i2) - ((i6 + 1) * childAt.getMeasuredWidth())) - (this.f9407c * i6);
                }
                childAt.layout(measuredWidth, i7, childAt.getMeasuredWidth() + measuredWidth, i8);
                i6++;
            } while (i6 < childCount);
            return;
        }
        int i9 = this.f9411g + this.f9407c;
        int i10 = 0;
        do {
            View childAt2 = getChildAt(i10);
            childAt2.layout(0, i9, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + i9);
            i9 += childAt2.getMeasuredHeight() + this.f9407c;
            i10++;
        } while (i10 < childCount);
    }
}
