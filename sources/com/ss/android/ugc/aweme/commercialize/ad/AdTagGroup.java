package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AdTagGroup extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final int f73639a;

    static {
        Covode.recordClassIndex(45319);
    }

    public AdTagGroup(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setTagList(String[] strArr) {
        MethodCollector.i(13365);
        l.d(strArr, "");
        removeAllViews();
        for (String str : strArr) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            frameLayout.setPadding(n.a(4.0d), n.a(2.0d), n.a(4.0d), n.a(2.0d));
            Context context = getContext();
            l.b(context, "");
            frameLayout.setBackground(context.getResources().getDrawable(R.drawable.a96));
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setLines(1);
            textView.setTextColor(b.c(getContext(), R.color.ac));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView);
            addView(frameLayout);
        }
        MethodCollector.o(13365);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int measuredWidth;
        measureChildren(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int i5 = 0;
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i2);
            int childCount = getChildCount();
            i4 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i6 != 0) {
                    l.b(childAt, "");
                    int i7 = this.f73639a;
                    if (childAt.getMeasuredWidth() + i4 + i7 >= size) {
                        break;
                    }
                    childAt.layout(i7 + i4, 0, childAt.getMeasuredWidth() + i4 + this.f73639a, childAt.getMeasuredHeight());
                    i4 += this.f73639a;
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    l.b(childAt, "");
                    if (childAt.getMeasuredWidth() >= size) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                }
                i4 += measuredWidth;
            }
        } else if (mode == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode != 1073741824) {
            i4 = 0;
        } else {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            int childCount2 = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(0);
                l.b(childAt2, "");
                i8 = Math.max(i8, childAt2.getMeasuredHeight());
            }
            i5 = i8;
        } else if (mode2 == 0) {
            i5 = View.MeasureSpec.getSize(i3);
        } else if (mode2 == 1073741824) {
            i5 = View.MeasureSpec.getSize(i3);
        }
        setMeasuredDimension(i4, i5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdTagGroup(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(13443);
        this.f73639a = n.a(4.0d);
        MethodCollector.o(13443);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdTagGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                i6 = getChildCount() - 1;
                break;
            }
            View childAt = getChildAt(i6);
            if (i6 != 0) {
                l.b(childAt, "");
                int i8 = this.f73639a;
                if (childAt.getMeasuredWidth() + i7 + i8 >= i4) {
                    break;
                }
                childAt.layout(i8 + i7, 0, childAt.getMeasuredWidth() + i7 + this.f73639a, childAt.getMeasuredHeight());
                i7 += this.f73639a;
            } else {
                l.b(childAt, "");
                if (childAt.getMeasuredWidth() >= i4) {
                    break;
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
            i7 += childAt.getMeasuredWidth();
            i6++;
        }
        removeViewsInLayout(i6 + 1, (getChildCount() - i6) - 1);
    }
}
