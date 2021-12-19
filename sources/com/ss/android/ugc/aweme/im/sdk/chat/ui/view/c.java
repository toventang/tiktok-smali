package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public int f101277a;

    /* renamed from: b  reason: collision with root package name */
    public int f101278b;

    /* renamed from: c  reason: collision with root package name */
    public int f101279c;

    /* renamed from: d  reason: collision with root package name */
    private View f101280d;

    /* renamed from: e  reason: collision with root package name */
    private int f101281e;

    static {
        Covode.recordClassIndex(64783);
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f101277a, iArr[0] - view.getWidth(), iArr[1]);
    }

    private void c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f101277a, iArr[0] + view.getWidth(), iArr[1]);
    }

    private void a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = this.f101277a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d2 = (double) this.f101279c;
        Double.isNaN(d2);
        Double.isNaN(width);
        showAtLocation(view, i2, (int) (width - (d2 * 0.6666666666666666d)), iArr[1] + view.getHeight());
    }

    public final void a(View view, int i2, int i3) {
        this.f101280d = view;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f101279c = i2;
        this.f101281e = i3;
    }

    private void c(View view, int i2, int i3) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f101277a, iArr[0] + i2, (iArr[1] - this.f101281e) + i3);
    }

    public final void b(View view, int i2, int i3) {
        dismiss();
        if (view != null) {
            int i4 = this.f101278b;
            if (i4 == 0) {
                c(view, i2, i3);
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
