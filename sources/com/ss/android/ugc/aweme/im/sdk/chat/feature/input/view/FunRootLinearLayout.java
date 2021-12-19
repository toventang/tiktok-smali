package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.c;
import com.bytedance.tux.h.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ai;

public class FunRootLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SoftInputResizeFuncLayoutView f100853a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f100854b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f100855c = new Rect();

    static {
        Covode.recordClassIndex(64520);
    }

    private SoftInputResizeFuncLayoutView getPanelView() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f100853a;
        if (softInputResizeFuncLayoutView != null) {
            return softInputResizeFuncLayoutView;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof SoftInputResizeFuncLayoutView) {
                SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = (SoftInputResizeFuncLayoutView) childAt;
                this.f100853a = softInputResizeFuncLayoutView2;
                return softInputResizeFuncLayoutView2;
            }
        }
        return null;
    }

    public FunRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(5308);
        MethodCollector.o(5308);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z;
        MethodCollector.i(5312);
        SoftInputResizeFuncLayoutView panelView = getPanelView();
        if (panelView != null) {
            Activity a2 = c.a(getContext());
            getWindowVisibleDisplayFrame(this.f100855c);
            int height = a2.getWindow().getDecorView().getHeight();
            int a3 = ai.a(a2);
            int a4 = e.a(a2);
            if (((height - this.f100855c.bottom) - a3) + a4 >= (((height - a3) - a4) / 10) * 3) {
                z = true;
                panelView.setVisibility(8);
            } else {
                z = false;
                if (this.f100854b && panelView.b() == 1) {
                    panelView.setVisibility(0);
                }
            }
            this.f100854b = z;
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(5312);
    }
}
