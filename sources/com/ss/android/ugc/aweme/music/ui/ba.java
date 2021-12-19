package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.presenter.g;

public final class ba implements s.b {
    static {
        Covode.recordClassIndex(71936);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final boolean sendCustomRequest(b bVar, int i2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final b getPresenter(int i2, e eVar) {
        b bVar = new b();
        g gVar = new g();
        gVar.f111577a = true;
        bVar.a((com.ss.android.ugc.aweme.common.b) gVar);
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        r.a("feed_enter", new d().a("enter_from", "single_song").a("group_id", aweme.getAid()).a("tag_id", cVar.f70219d).a("rank_index", cVar.f70221f).a("order", cVar.f70221f).a("process_id", cVar.f70220e).f66730a);
        cVar.f70216a = "from_music";
        cVar.f70217b = "music_id";
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final c onCreateDetailAwemeViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
        return new v(view, str, dVar);
    }
}
