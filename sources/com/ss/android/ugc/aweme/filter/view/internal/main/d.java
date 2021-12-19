package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.view.internal.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private View.OnClickListener f95850a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f95851b;

    /* renamed from: c  reason: collision with root package name */
    private final View f95852c;

    /* renamed from: d  reason: collision with root package name */
    private final View f95853d;

    static {
        Covode.recordClassIndex(60734);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.b
    public final boolean a() {
        View view = this.f95852c;
        if (view != null) {
            return view.isSelected();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.b
    public final void a(View.OnClickListener onClickListener) {
        this.f95850a = onClickListener;
        d(this.f95851b);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.b
    public final void a(boolean z) {
        View view;
        if (this.f95851b && (view = this.f95852c) != null) {
            view.setSelected(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.b
    public final void b(boolean z) {
        this.f95851b = z;
        c(z);
        d(this.f95851b);
    }

    private final void c(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        View view = this.f95852c;
        if (view != null) {
            view.setVisibility(i2);
        }
        View view2 = this.f95853d;
        if (view2 != null) {
            view2.setVisibility(i2);
        }
    }

    private final void d(boolean z) {
        if (z) {
            View view = this.f95852c;
            if (view != null) {
                view.setOnClickListener(this.f95850a);
                return;
            }
            return;
        }
        View view2 = this.f95852c;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
    }

    public d(View view, View view2) {
        this.f95852c = view;
        this.f95853d = view2;
        if (view != null) {
            view.setSelected(false);
        }
        c(this.f95851b);
    }
}
