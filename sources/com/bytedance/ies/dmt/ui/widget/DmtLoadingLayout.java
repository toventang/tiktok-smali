package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.a.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.f.b;
import com.zhiliaoapp.musically.R;

public class DmtLoadingLayout extends FrameLayout implements d, h {

    /* renamed from: a  reason: collision with root package name */
    private View f33589a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f33590b;

    /* renamed from: c  reason: collision with root package name */
    private int f33591c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33592d;

    /* renamed from: e  reason: collision with root package name */
    private int f33593e;

    static {
        Covode.recordClassIndex(20017);
    }

    private void a() {
        if (this.f33592d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33590b.getLayoutParams();
            int i2 = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (((b.b(getContext()) - this.f33593e) - iArr[1]) / 2) - (i2 / 2);
            this.f33590b.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
        if (this.f33591c != i2) {
            this.f33591c = i2;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.widget.h
    public void setUseScreenHeight(int i2) {
        this.f33592d = true;
        this.f33593e = i2;
        a();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f33589a;
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33589a.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f33589a.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(13939);
        this.f33591c = b.a.f33348a.f33347a;
        View a2 = a.a(context, R.layout.agb, this, true);
        this.f33589a = a2.findViewById(R.id.aou);
        this.f33590b = (FrameLayout) a2.findViewById(R.id.dc0);
        MethodCollector.o(13939);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
