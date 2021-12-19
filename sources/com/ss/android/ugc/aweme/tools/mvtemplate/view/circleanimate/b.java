package com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f140954a;

    /* renamed from: b  reason: collision with root package name */
    public int f140955b;

    /* renamed from: c  reason: collision with root package name */
    public GradientDrawable f140956c;

    static {
        Covode.recordClassIndex(92032);
    }

    public final void a() {
        this.f140954a = 0;
        this.f140956c.setStroke(0, this.f140955b);
    }

    public b(GradientDrawable gradientDrawable) {
        this.f140956c = gradientDrawable;
    }

    public final void a(int i2) {
        this.f140955b = i2;
        this.f140956c.setStroke(this.f140954a, i2);
    }
}
