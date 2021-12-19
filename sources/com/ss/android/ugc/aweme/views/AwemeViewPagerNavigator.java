package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AwemeViewPagerNavigator extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final String f144419e = AwemeViewPagerNavigator.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public View f144420a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f144421b;

    /* renamed from: c  reason: collision with root package name */
    public int f144422c;

    /* renamed from: d  reason: collision with root package name */
    public View f144423d;

    /* renamed from: f  reason: collision with root package name */
    ViewPager f144424f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f144425g;

    /* renamed from: h  reason: collision with root package name */
    private int f144426h;

    /* renamed from: i  reason: collision with root package name */
    private l f144427i;

    /* renamed from: j  reason: collision with root package name */
    private FrameLayout f144428j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144429k;

    public int getAllTabWidth() {
        return this.f144426h;
    }

    public View getLastSelectedTab() {
        return this.f144423d;
    }

    public ViewPager getViewPager() {
        return this.f144424f;
    }

    public int getTabCount() {
        return this.f144421b.getChildCount();
    }

    static {
        Covode.recordClassIndex(94559);
    }

    public void setAllTabWidth(int i2) {
        this.f144426h = i2;
    }

    public void setScrollable(boolean z) {
        this.f144425g = z;
        this.f144427i.setScrollable(z);
    }

    private void setIndicatorPosition(int i2) {
        if (this.f144420a != null) {
            float f2 = (float) (this.f144422c * i2);
            Context context = getContext();
            if (context != null) {
                int i3 = Build.VERSION.SDK_INT;
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    f2 = -f2;
                }
            }
            this.f144420a.setTranslationX(f2);
        }
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AwemeViewPagerNavigator(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2904);
        this.f144426h = -1;
        this.f144429k = true;
        this.f144425g = true;
        l lVar = new l(getContext());
        this.f144427i = lVar;
        lVar.setScrollable(false);
        this.f144427i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f144427i);
        this.f144427i.setHorizontalFadingEdgeEnabled(false);
        this.f144427i.setHorizontalScrollBarEnabled(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f144428j = frameLayout;
        this.f144427i.addView(frameLayout, new ViewGroup.LayoutParams(-2, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f144421b = linearLayout;
        linearLayout.setOrientation(0);
        this.f144421b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f144428j.addView(this.f144421b);
        MethodCollector.o(2904);
    }
}
