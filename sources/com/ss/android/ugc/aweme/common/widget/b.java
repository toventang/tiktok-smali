package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public abstract class b extends ViewGroup {
    static {
        Covode.recordClassIndex(47268);
    }

    public abstract void a(ViewPager.e eVar);

    public abstract PagerAdapter getAdapter();

    public abstract int getCurrentItem();

    public b(Context context) {
        super(context);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
