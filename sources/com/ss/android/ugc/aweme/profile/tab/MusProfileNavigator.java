package com.ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.l;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.o;
import com.zhiliaoapp.musically.R;

public class MusProfileNavigator extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f116663a;

    /* renamed from: b  reason: collision with root package name */
    public View f116664b;

    /* renamed from: c  reason: collision with root package name */
    public View f116665c;

    /* renamed from: d  reason: collision with root package name */
    boolean f116666d;

    /* renamed from: e  reason: collision with root package name */
    l f116667e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f116668f = true;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager.e f116669g;

    public interface a {
        static {
            Covode.recordClassIndex(75378);
        }

        void a(int i2);

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(75372);
    }

    public int getTabCount() {
        return this.f116663a.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f116663a = (LinearLayout) findViewById(R.id.eh5);
        this.f116665c = findViewById(R.id.cjx);
    }

    public void setScrollable(boolean z) {
        this.f116668f = z;
    }

    public final View a(int i2) {
        return this.f116663a.getChildAt(i2);
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9952);
        MethodCollector.o(9952);
    }

    public final void a(int i2, float f2, View view) {
        if (o.a(view)) {
            View a2 = a(i2);
            View a3 = a(i2 + 1);
            if (a2 != null && a2.getVisibility() == 0 && a3 != null && a3.getVisibility() == 0) {
                float x = (a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f2 * (((a3.getX() + ((float) (a3.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (o.a(a2)) {
                view.setX(((getX() + a2.getX()) + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final androidx.viewpager.widget.ViewPager r9, boolean r10, final com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator.a r11) {
        /*
        // Method dump skipped, instructions count: 386
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator.a(androidx.viewpager.widget.ViewPager, boolean, com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator$a):void");
    }
}
