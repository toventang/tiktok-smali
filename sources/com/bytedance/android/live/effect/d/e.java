package com.bytedance.android.live.effect.d;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<String> f9772a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final TabLayout f9773b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager f9774c;

    static {
        Covode.recordClassIndex(4983);
    }

    public e(TabLayout tabLayout, ViewPager viewPager) {
        l.d(tabLayout, "");
        l.d(viewPager, "");
        this.f9773b = tabLayout;
        this.f9774c = viewPager;
        tabLayout.addOnTabSelectedListener(new d(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.g(tabLayout));
    }

    /* access modifiers changed from: package-private */
    public final TabLayout.f a(String str, boolean z) {
        View findViewById;
        TextView textView;
        TabLayout.f newTab = this.f9773b.newTab();
        l.b(newTab, "");
        newTab.a(R.layout.b8t);
        View view = newTab.f52655f;
        if (!(view == null || (textView = (TextView) view.findViewById(R.id.ehf)) == null)) {
            textView.setText(str);
        }
        View view2 = newTab.f52655f;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.ehi)) == null)) {
            if (z) {
                p.b(findViewById);
            } else {
                p.a(findViewById);
            }
        }
        return newTab;
    }
}
