package com.ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.d.i;
import com.ss.android.ugc.aweme.tools.c;
import com.zhiliaoapp.musically.R;

public class MediaTypeNavigator extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f114878a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f114879b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f114880c;

    /* renamed from: d  reason: collision with root package name */
    private View f114881d;

    /* renamed from: e  reason: collision with root package name */
    private int f114882e;

    /* renamed from: f  reason: collision with root package name */
    private TuxTextView f114883f;

    static {
        Covode.recordClassIndex(73893);
    }

    public View getDividerView() {
        return this.f114881d;
    }

    public ImageView getTabIndicator() {
        return this.f114880c;
    }

    public int getTabIndicatorWidth() {
        int i2 = this.f114882e;
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalStateException("tabWidth not initialized, can't get tab indicator width");
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f114878a = (LinearLayout) findViewById(R.id.cfk);
        this.f114879b = (LinearLayout) findViewById(R.id.eh5);
        this.f114880c = (ImageView) findViewById(R.id.by7);
        this.f114881d = findViewById(R.id.an6);
    }

    public void setPageSelected(int i2) {
        TuxTextView tuxTextView = (TuxTextView) this.f114879b.getChildAt(i2).findViewById(R.id.f8x);
        TuxTextView tuxTextView2 = this.f114883f;
        if (tuxTextView2 != null) {
            tuxTextView2.setSelected(false);
            this.f114883f.setTuxFont(42);
        }
        if (tuxTextView != null) {
            tuxTextView.setSelected(true);
            tuxTextView.setTuxFont(43);
            this.f114883f = tuxTextView;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        boolean z;
        MethodCollector.i(10460);
        i.a(viewPager);
        i.a(viewPager.getAdapter());
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        i.a(Boolean.valueOf(z));
        this.f114882e = n.a(getContext()) / adapter.getCount();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f114878a.getLayoutParams();
        layoutParams.width = this.f114882e;
        this.f114878a.setLayoutParams(layoutParams);
        this.f114879b.removeAllViews();
        int count = adapter.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            RelativeLayout relativeLayout = (RelativeLayout) a.a(LayoutInflater.from(getContext()), R.layout.bjl, this.f114879b, false);
            TuxTextView tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.f8x);
            if (i2 == 0) {
                this.f114883f = tuxTextView;
                tuxTextView.setSelected(true);
                tuxTextView.setTuxFont(43);
            }
            CharSequence pageTitle = adapter.getPageTitle(i2);
            if (pageTitle != null && !TextUtils.isEmpty(pageTitle)) {
                tuxTextView.setText(pageTitle);
            }
            relativeLayout.setOnClickListener(new a(viewPager, i2));
            this.f114879b.addView(relativeLayout);
        }
        viewPager.addOnPageChangeListener(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73894);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                MediaTypeNavigator.this.setPageSelected(i2);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                float tabIndicatorWidth = ((float) MediaTypeNavigator.this.getTabIndicatorWidth()) * (((float) i2) + f2);
                if (c.a(MediaTypeNavigator.this.getContext())) {
                    tabIndicatorWidth = -tabIndicatorWidth;
                }
                MediaTypeNavigator.this.f114878a.setTranslationX(tabIndicatorWidth);
            }
        });
        MethodCollector.o(10460);
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10303);
        MethodCollector.o(10303);
    }
}
