package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Field f68186a;

    static {
        Covode.recordClassIndex(42007);
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f68186a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static View a(ViewPager viewPager) {
        if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
            return C1543a.a(viewPager);
        }
        return b.a(viewPager);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$a  reason: collision with other inner class name */
    static class C1543a {
        static {
            Covode.recordClassIndex(42008);
        }

        public static View a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            for (int i2 = 0; i2 < viewPager.getChildCount(); i2++) {
                View childAt = viewPager.getChildAt(i2);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) a.f68186a.get(layoutParams)).intValue();
                    if (!layoutParams.f4432a && currentItem == intValue) {
                        return childAt;
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
            return null;
        }
    }

    static class b {
        static {
            Covode.recordClassIndex(42009);
        }

        public static View a(ViewPager viewPager) {
            if (viewPager != null && (viewPager instanceof RtlViewPager)) {
                RtlViewPager rtlViewPager = (RtlViewPager) viewPager;
                int currentItem = viewPager.getCurrentItem();
                for (int i2 = 0; i2 < viewPager.getChildCount(); i2++) {
                    View childAt = viewPager.getChildAt(i2);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    try {
                        int intValue = ((Integer) a.f68186a.get(layoutParams)).intValue();
                        if (rtlViewPager.a()) {
                            intValue = (rtlViewPager.getItemCount() - intValue) - 1;
                        }
                        if (!layoutParams.f4432a && currentItem == intValue) {
                            return childAt;
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            return null;
        }
    }
}
