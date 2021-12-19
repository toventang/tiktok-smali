package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CustomLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    float f80610a;

    /* renamed from: b  reason: collision with root package name */
    int f80611b;

    /* renamed from: c  reason: collision with root package name */
    boolean f80612c;

    /* renamed from: d  reason: collision with root package name */
    private int f80613d;

    /* renamed from: e  reason: collision with root package name */
    private int f80614e;

    /* renamed from: f  reason: collision with root package name */
    private a f80615f;

    public interface a {
        static {
            Covode.recordClassIndex(50143);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(50142);
    }

    public void setOnSecondViewControlListener(a aVar) {
        this.f80615f = aVar;
    }

    public CustomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2675);
        MethodCollector.o(2675);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        a aVar;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i2);
        if (childCount != 2) {
            throw new RuntimeException("CustomLayout child count must is 2");
        } else if (getChildAt(0) instanceof TextView) {
            TextView textView = (TextView) getChildAt(0);
            a(textView.getText(), size, textView.getPaint());
            View childAt = getChildAt(1);
            if (this.f80611b > textView.getMaxLines() && (aVar = this.f80615f) != null) {
                aVar.a();
            }
            measureChildren(i2, i3);
            if (textView.getMeasuredWidth() + childAt.getMeasuredWidth() <= size) {
                setMeasuredDimension(textView.getMeasuredWidth() + childAt.getMeasuredWidth(), Math.max(textView.getMeasuredHeight(), childAt.getMeasuredHeight()));
                this.f80613d = 1;
            } else if (getChildAt(0) instanceof TextView) {
                float f2 = (float) size;
                if (this.f80610a + ((float) childAt.getMeasuredWidth()) > f2 && this.f80611b >= textView.getMaxLines()) {
                    setMeasuredDimension(textView.getMeasuredWidth(), textView.getMeasuredHeight());
                    this.f80613d = 3;
                } else if (this.f80610a + ((float) childAt.getMeasuredWidth()) <= f2 || this.f80611b >= textView.getMaxLines() || !this.f80612c) {
                    setMeasuredDimension(textView.getMeasuredWidth(), Math.max(textView.getMeasuredHeight(), this.f80614e + childAt.getMeasuredHeight()));
                    this.f80613d = 2;
                } else {
                    setMeasuredDimension(textView.getMeasuredWidth(), textView.getMeasuredHeight() + childAt.getMeasuredHeight());
                    this.f80613d = 2;
                }
            }
        } else {
            throw new RuntimeException("CustomLayout first child view not a TextView");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(CharSequence charSequence, int i2, TextPaint textPaint) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        this.f80611b = lineCount;
        this.f80614e = staticLayout.getLineTop(lineCount - 1);
        this.f80610a = staticLayout.getLineRight(this.f80611b - 1);
        this.f80612c = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = this.f80613d;
        if (i6 == 1 || i6 == 2) {
            TextView textView = (TextView) getChildAt(0);
            View childAt = getChildAt(1);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            int i7 = (int) this.f80610a;
            int i8 = this.f80614e;
            int bottom = (textView.getBottom() - textView.getPaddingBottom()) - this.f80614e;
            if (childAt.getMeasuredHeight() < bottom) {
                i8 = this.f80614e + ((bottom - childAt.getMeasuredHeight()) / 2);
            }
            childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
        } else if (i6 == 3) {
            View childAt2 = getChildAt(0);
            getChildAt(1);
            childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
            a aVar = this.f80615f;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
