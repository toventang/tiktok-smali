package com.ss.android.ugc.aweme.dsp.ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import h.f.b.l;

public final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f84028a;

    static {
        Covode.recordClassIndex(52398);
    }

    public b(Context context) {
        l.d(context, "");
        this.f84028a = (e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ScrollSwitchStateManager.a.a(this.f84028a).a(false);
        TabChangeManager.a.a(this.f84028a).a("MUSIC_DSP", false);
        MainPageFragmentImpl.i().a(l.a((Object) TTDspViewModel.a.a(this.f84028a).a(), (Object) "LIBRARY"));
    }
}
