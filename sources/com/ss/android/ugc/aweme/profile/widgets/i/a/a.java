package com.ss.android.ugc.aweme.profile.widgets.i.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import h.f.b.l;

public final class a extends com.bytedance.assem.arch.d.a {
    static {
        Covode.recordClassIndex(76390);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.i.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3000a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117890a;

        static {
            Covode.recordClassIndex(76391);
        }

        View$OnClickListenerC3000a(a aVar) {
            this.f117890a = aVar;
        }

        public final void onClick(View view) {
            e activity;
            ClickAgent.onClick(view);
            Fragment a2 = b.a((m) this.f117890a);
            if (a2 != null && (activity = a2.getActivity()) != null) {
                IMusicDspService g2 = MusicDspServiceImpl.g();
                l.b(activity, "");
                g2.a(activity, "", "metab_music");
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (MusicDspServiceImpl.g().d()) {
            view.setVisibility(0);
            view.setOnClickListener(new View$OnClickListenerC3000a(this));
            MusicDspServiceImpl.g().e();
        }
    }
}
