package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.f.b;
import com.ss.android.ugc.d.a.c;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f111560a;

    static {
        Covode.recordClassIndex(71689);
    }

    public n(j jVar) {
        this.f111560a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f111560a;
        if (jVar.o != null && MusicService.m().a(jVar.o, jVar.itemView.getContext(), true)) {
            jVar.p = !jVar.p;
            if (jVar.p) {
                r.a("favourite_song", new d().a("enter_from", "personal_homepage_list").a("previous_page", jVar.r).a("music_id", jVar.o.getMusicId()).a("enter_method", "personal_list").f66730a);
            } else {
                r.a("cancel_favourite_song", new d().a("enter_from", "personal_homepage_list").a("previous_page", jVar.r).a("music_id", jVar.o.getMusicId()).a("enter_method", "personal_list").f66730a);
            }
            boolean z = jVar.p;
            c.a(new b(z ? 1 : 0, jVar.o));
            jVar.f111536i.b();
        }
    }
}
