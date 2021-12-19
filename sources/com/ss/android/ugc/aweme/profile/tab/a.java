package com.ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MusProfileNavigator f116693a;

    /* renamed from: b  reason: collision with root package name */
    private final MusProfileNavigator.a f116694b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager f116695c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116696d;

    static {
        Covode.recordClassIndex(75382);
    }

    a(MusProfileNavigator musProfileNavigator, MusProfileNavigator.a aVar, ViewPager viewPager, int i2) {
        this.f116693a = musProfileNavigator;
        this.f116694b = aVar;
        this.f116695c = viewPager;
        this.f116696d = i2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f116693a;
        MusProfileNavigator.a aVar = this.f116694b;
        ViewPager viewPager = this.f116695c;
        int i2 = this.f116696d;
        if (musProfileNavigator.f116668f) {
            if (aVar != null) {
                aVar.b(16);
            }
            viewPager.setCurrentItem(i2);
        }
    }
}
