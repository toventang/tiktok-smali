package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private TextView f52615a;

    /* renamed from: b  reason: collision with root package name */
    private Button f52616b;

    /* renamed from: c  reason: collision with root package name */
    private int f52617c;

    /* renamed from: d  reason: collision with root package name */
    private int f52618d;

    static {
        Covode.recordClassIndex(32594);
    }

    public Button getActionView() {
        return this.f52616b;
    }

    public TextView getMessageView() {
        return this.f52615a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52615a = (TextView) findViewById(R.id.e6z);
        this.f52616b = (Button) findViewById(R.id.e6y);
    }

    @Override // com.google.android.material.snackbar.a
    public final void a() {
        this.f52615a.setAlpha(0.0f);
        this.f52615a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f52616b.getVisibility() == 0) {
            this.f52616b.setAlpha(0.0f);
            this.f52616b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public final void b() {
        this.f52615a.setAlpha(1.0f);
        this.f52615a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f52616b.getVisibility() == 0) {
            this.f52616b.setAlpha(1.0f);
            this.f52616b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2623);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.sh, R.attr.a52});
        this.f52617c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f52618d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        MethodCollector.o(2623);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (a(1, r5, r5 - r4) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (a(0, r5, r5) == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    private static void a(View view, int i2, int i3) {
        if (v.q(view)) {
            v.a(view, v.f(view), i2, v.g(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    private boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f52615a.getPaddingTop() == i3 && this.f52615a.getPaddingBottom() == i4) {
            return z;
        }
        a(this.f52615a, i3, i4);
        return true;
    }
}
