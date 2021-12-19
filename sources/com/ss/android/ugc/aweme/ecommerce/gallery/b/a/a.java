package com.ss.android.ugc.aweme.ecommerce.gallery.b.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator;
import dmt.viewpager.DmtRtlViewPager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public View f85962a;

    /* renamed from: b  reason: collision with root package name */
    public NumberIndicator f85963b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commerce.sdk.b.a.a f85964c;

    static {
        Covode.recordClassIndex(53828);
    }

    public final void a() {
        View view = this.f85962a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a(int i2) {
        View view = this.f85962a;
        if (view != null) {
            view.setAlpha(((float) i2) / 255.0f);
        }
    }

    public final void a(DmtRtlViewPager dmtRtlViewPager) {
        View view = this.f85962a;
        if (view != null) {
            view.setVisibility(0);
            int i2 = this.f85964c.getTransferConfig().u;
            this.f85963b.setRealSize(i2);
            this.f85963b.setViewPager(dmtRtlViewPager);
            if (i2 <= 1) {
                this.f85963b.setVisibility(8);
            } else {
                this.f85963b.setVisibility(0);
            }
        }
    }
}
