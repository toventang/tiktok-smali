package com.ss.android.ugc.aweme.photo.local;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ViewPager f114885a;

    /* renamed from: b  reason: collision with root package name */
    private final int f114886b;

    static {
        Covode.recordClassIndex(73895);
    }

    a(ViewPager viewPager, int i2) {
        this.f114885a = viewPager;
        this.f114886b = i2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f114885a.setCurrentItem(this.f114886b);
    }
}
