package com.ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MusProfileNavigator f116701a;

    /* renamed from: b  reason: collision with root package name */
    private final MusProfileNavigator.a f116702b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager f116703c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116704d;

    static {
        Covode.recordClassIndex(75384);
    }

    c(MusProfileNavigator musProfileNavigator, MusProfileNavigator.a aVar, ViewPager viewPager, int i2) {
        this.f116701a = musProfileNavigator;
        this.f116702b = aVar;
        this.f116703c = viewPager;
        this.f116704d = i2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f116701a;
        MusProfileNavigator.a aVar = this.f116702b;
        ViewPager viewPager = this.f116703c;
        int i2 = this.f116704d;
        if (musProfileNavigator.f116668f) {
            if (aVar != null) {
                aVar.b(6);
            }
            viewPager.setCurrentItem(i2);
        }
    }
}
