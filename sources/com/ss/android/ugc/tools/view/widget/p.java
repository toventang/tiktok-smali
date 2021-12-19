package com.ss.android.ugc.tools.view.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Field f150463a;

    static {
        Covode.recordClassIndex(98941);
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f150463a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {
        static {
            Covode.recordClassIndex(98942);
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
                    int intValue = ((Integer) p.f150463a.get(layoutParams)).intValue();
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
}
