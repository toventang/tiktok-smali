package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.view.d.a;
import com.zhiliaoapp.musically.R;

public class AVLoadingLayout extends FrameLayout implements a, l {

    /* renamed from: a  reason: collision with root package name */
    private View f150212a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f150213b;

    /* renamed from: c  reason: collision with root package name */
    private int f150214c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f150215d;

    /* renamed from: e  reason: collision with root package name */
    private int f150216e;

    static {
        Covode.recordClassIndex(98850);
    }

    private void a() {
        if (this.f150215d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f150213b.getLayoutParams();
            int i2 = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (((dh.a(getContext()) - this.f150216e) - iArr[1]) / 2) - (i2 / 2);
            this.f150213b.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.ugc.tools.view.d.a
    public final void a(int i2) {
        if (this.f150214c != i2) {
            this.f150214c = i2;
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.l
    public void setUseScreenHeight(int i2) {
        this.f150215d = true;
        this.f150216e = i2;
        a();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f150212a;
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f150212a.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f150212a.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AVLoadingLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7120);
        this.f150214c = g.a().E().a();
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b4n, this, true);
        this.f150212a = a2.findViewById(R.id.aou);
        this.f150213b = (FrameLayout) a2.findViewById(R.id.dc0);
        MethodCollector.o(7120);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
