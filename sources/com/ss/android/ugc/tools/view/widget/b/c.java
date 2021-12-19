package com.ss.android.ugc.tools.view.widget.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f150371a;

    static {
        Covode.recordClassIndex(98904);
    }

    /* access modifiers changed from: protected */
    public final View getProgress() {
        return this.f150371a;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f150371a;
        if (view != null) {
            view.setVisibility(getVisibility());
        }
    }

    public final FrameLayout.LayoutParams getProgressLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f150371a;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        return layoutParams2;
    }

    /* access modifiers changed from: protected */
    public final void setProgress(View view) {
        this.f150371a = view;
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f150371a;
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(7855);
        this.f150371a = a.a(LayoutInflater.from(context), R.layout.b4n, this, true).findViewById(R.id.aou);
        MethodCollector.o(7855);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
