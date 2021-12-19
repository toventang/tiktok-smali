package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.model.Music;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final aa f70115a;

    /* renamed from: b  reason: collision with root package name */
    private final Music f70116b;

    static {
        Covode.recordClassIndex(43244);
    }

    ab(aa aaVar, Music music) {
        this.f70115a = aaVar;
        this.f70116b = music;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        aa aaVar = this.f70115a;
        Music music = this.f70116b;
        r.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(aaVar.f70111c).setValue(music.getMid()).setJsonObject(new c().a("host", aaVar.f70110b).a()));
        SmartRouter.buildRoute(aaVar.f70109a, "aweme://music/detail").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
    }
}
