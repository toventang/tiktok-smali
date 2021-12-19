package com.ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MusProfileNavigator f116697a;

    /* renamed from: b  reason: collision with root package name */
    private final MusProfileNavigator.a f116698b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager f116699c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116700d;

    static {
        Covode.recordClassIndex(75383);
    }

    b(MusProfileNavigator musProfileNavigator, MusProfileNavigator.a aVar, ViewPager viewPager, int i2) {
        this.f116697a = musProfileNavigator;
        this.f116698b = aVar;
        this.f116699c = viewPager;
        this.f116700d = i2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f116697a;
        MusProfileNavigator.a aVar = this.f116698b;
        ViewPager viewPager = this.f116699c;
        int i2 = this.f116700d;
        if (musProfileNavigator.f116668f) {
            if (aVar != null) {
                aVar.b(14);
            }
            viewPager.setCurrentItem(i2);
        }
    }
}
