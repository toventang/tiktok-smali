package com.ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public int f89499a;

    /* renamed from: b  reason: collision with root package name */
    public int f89500b;

    /* renamed from: c  reason: collision with root package name */
    public int f89501c;

    /* renamed from: d  reason: collision with root package name */
    private View f89502d;

    /* renamed from: e  reason: collision with root package name */
    private Context f89503e;

    /* renamed from: f  reason: collision with root package name */
    private int f89504f;

    static {
        Covode.recordClassIndex(56243);
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f89499a, iArr[0] - view.getWidth(), iArr[1]);
    }

    private void c(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f89499a, iArr[0] + view.getWidth(), iArr[1]);
    }

    private void a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = this.f89499a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d2 = (double) this.f89501c;
        Double.isNaN(d2);
        Double.isNaN(width);
        showAtLocation(view, i2, (int) (width - (d2 * 0.6666666666666666d)), iArr[1] + view.getHeight());
    }

    public final void a(View view, Context context) {
        this.f89502d = view;
        this.f89503e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        view.measure(0, 0);
        this.f89501c = view.getMeasuredWidth();
        this.f89504f = view.getMeasuredHeight();
    }

    private void b(View view, int i2, int i3) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f89499a, iArr[0] + i2, (iArr[1] - this.f89504f) + i3);
    }

    public final void a(View view, int i2, int i3) {
        dismiss();
        if (view != null) {
            int i4 = this.f89500b;
            if (i4 == 0) {
                b(view, i2, i3);
            } else if (i4 == 1) {
                a(view);
            } else if (i4 == 2) {
                b(view);
            } else if (i4 == 3) {
                c(view);
            }
        }
    }
}
