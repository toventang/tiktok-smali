package com.ss.android.ugc.aweme.ecommerce.gallery.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.b;
import androidx.viewpager.widget.ViewPager;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.Locale;

public class NumberIndicator extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    public DmtRtlViewPager f86109a;

    /* renamed from: b  reason: collision with root package name */
    public int f86110b;

    /* renamed from: e  reason: collision with root package name */
    private final ViewPager.e f86111e;

    static {
        Covode.recordClassIndex(53878);
    }

    public int getCurrentItem() {
        DmtRtlViewPager dmtRtlViewPager = this.f86109a;
        if (dmtRtlViewPager != null) {
            return dmtRtlViewPager.getCurrentItem() % this.f86110b;
        }
        return -1;
    }

    public void setRealSize(int i2) {
        if (i2 > 0) {
            this.f86110b = i2;
        }
    }

    public void setViewPager(DmtRtlViewPager dmtRtlViewPager) {
        if (dmtRtlViewPager != null && dmtRtlViewPager.getAdapter() != null) {
            this.f86109a = dmtRtlViewPager;
            dmtRtlViewPager.b(this.f86111e);
            this.f86109a.a(this.f86111e);
            this.f86111e.onPageSelected(this.f86109a.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NumberIndicator(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f86111e = new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator.AnonymousClass1 */

            static {
                Covode.recordClassIndex(53879);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                if (NumberIndicator.this.f86109a.getAdapter() != null && NumberIndicator.this.f86110b > 0) {
                    NumberIndicator.this.setText(a.a(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf((i2 % NumberIndicator.this.f86110b) + 1), Integer.valueOf(NumberIndicator.this.f86110b)}));
                }
            }
        };
        setTextColor(b.c(getContext(), R.color.a_));
        setTuxFont(33);
    }
}
