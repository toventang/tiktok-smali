package com.ss.android.ugc.aweme.ecommerce.gallery.b.a;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.sdk.b.a.a;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d;
import dmt.viewpager.DmtRtlViewPager;
import java.util.Collection;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public View f85965a;

    /* renamed from: b  reason: collision with root package name */
    public a f85966b;

    /* renamed from: c  reason: collision with root package name */
    public TuxTextView f85967c;

    /* renamed from: d  reason: collision with root package name */
    public DmtRtlViewPager f85968d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewPager.e f85969e = new ViewPager.e() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(53830);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            if (b.this.f85968d.getAdapter() != null) {
                d transferConfig = b.this.f85966b.getTransferConfig();
                if (com.bytedance.common.utility.collection.b.a((Collection) transferConfig.f86006l) || i2 < 0 || i2 >= transferConfig.f86006l.size()) {
                    str = "";
                } else {
                    str = transferConfig.f86006l.get(i2);
                }
                b.this.f85967c.setText(str);
            }
        }
    };

    static {
        Covode.recordClassIndex(53829);
    }

    public final void a() {
        View view = this.f85965a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a(DmtRtlViewPager dmtRtlViewPager) {
        if (!(dmtRtlViewPager == null || dmtRtlViewPager.getAdapter() == null)) {
            this.f85968d = dmtRtlViewPager;
            dmtRtlViewPager.b(this.f85969e);
            this.f85968d.a(this.f85969e);
            this.f85969e.onPageSelected(this.f85968d.getCurrentItem());
        }
        this.f85965a.setVisibility(0);
    }
}
